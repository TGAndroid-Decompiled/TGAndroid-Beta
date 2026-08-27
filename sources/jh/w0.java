package jh;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

public final class w0 implements RequestDelegate {

    public final int f14086a;

    public final d1 f14087b;

    public w0(d1 d1Var, int i10) {
        this.f14086a = i10;
        this.f14087b = d1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        ArrayList arrayListFindUpdates;
        int size;
        TLRPC.TL_dataJSON tL_dataJSON;
        int i10;
        ArrayList arrayList;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.f14086a) {
            case 0:
                d1 d1Var = this.f14087b;
                TLRPC.InputGroupCall inputGroupCall = d1Var.f13178f;
                int i11 = d1Var.f13177e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList arrayListFindUpdates2 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = arrayListFindUpdates2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayListFindUpdates2.get(i12);
                        i12++;
                        d1Var.v = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    AndroidUtilities.runOnUIThread(new hh.m5(19, d1Var, MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallMessage.class)));
                    MessagesController.getInstance(i11).processUpdates(updates, false);
                    TLRPC.GroupCall groupCall = d1Var.v;
                    boolean z10 = groupCall != null && groupCall.rtmp_stream;
                    ArrayList arrayListFindUpdates3 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = arrayListFindUpdates3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj2 = arrayListFindUpdates3.get(i13);
                        i13++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.f22397id != d1Var.g() || z10) {
                            arrayList = arrayListFindUpdates3;
                        } else {
                            int i14 = 0;
                            while (true) {
                                if (i14 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = arrayListFindUpdates3;
                                    if (DialogObject.getPeerDialogId(tL_updateGroupCallParticipants.participants.get(i14).peer) == d1Var.f13175b) {
                                        d1Var.C = tL_updateGroupCallParticipants.participants.get(i14);
                                    } else {
                                        i14++;
                                        arrayListFindUpdates3 = arrayList;
                                    }
                                } else {
                                    arrayList = arrayListFindUpdates3;
                                }
                            }
                            if (d1Var.C != null) {
                                arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = arrayListFindUpdates.size();
                                tL_dataJSON = null;
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = arrayListFindUpdates.get(i10);
                                    i10++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                i0.a.y(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.f22397id);
                                d1Var.f13183x = true;
                                if (!d1Var.f13182w || d1Var.A == null) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall, new cg.g0(10, d1Var, updates));
                                } else {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        d1Var.A.prepareForStream(z10);
                                    } else {
                                        d1Var.A.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (d1Var.f13179n) {
                                        d1Var.A.setMuteMicrophone(d1Var.f13180r);
                                        d1Var.A.activateVideoCapturer(d1Var.F);
                                        d1Var.A.setupOutgoingVideoCreated(d1Var.F);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant2 = d1Var.C;
                                        if (groupCallParticipant2 != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant2.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = d1Var.A;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] ssrcGroupArrD = d1.d(tL_groupCallParticipantVideo2);
                                                d1Var.r(ssrcGroupArrD);
                                                nativeInstance.addIncomingVideoOutput(2, str, ssrcGroupArrD, d1Var.D, DialogObject.getPeerDialogId(d1Var.C.peer));
                                            } else {
                                                AndroidUtilities.runOnUIThread(new y0(d1Var, 2));
                                            }
                                        } else if (z10) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamchannels, new v0(d1Var, 1), 65536, 2, d1Var.h());
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcall, new w0(d1Var, 2));
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new y0(d1Var, 3));
                                }
                                break;
                            }
                        }
                        arrayListFindUpdates3 = arrayList;
                    }
                    arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = arrayListFindUpdates.size();
                    tL_dataJSON = null;
                    i10 = 0;
                    while (i10 < size) {
                        Object obj4 = arrayListFindUpdates.get(i10);
                        i10++;
                        tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj4).params;
                    }
                    i0.a.y(new StringBuilder("[LivePlayer] joined call "), inputGroupCall.f22397id);
                    d1Var.f13183x = true;
                    if (!d1Var.f13182w) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i11).sendRequest(leavegroupcall2, new cg.g0(10, d1Var, updates));
                    break;
                } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new y0(d1Var, 4));
                    break;
                }
                break;
            case 1:
                final int i15 = 0;
                final d1 d1Var2 = this.f14087b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i15) {
                            case 0:
                                d1 d1Var3 = d1Var2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i16 = d1Var3.f13177e;
                                if (!d1Var3.f13182w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i16).putUsers(groupcall.users, false);
                                        MessagesController.getInstance(i16).putChats(groupcall.chats, false);
                                        d1Var3.v = groupcall.call;
                                        NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var3.v.f22390id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new y0(d1Var3, 4));
                                    }
                                    if (d1Var3.L) {
                                        Runnable runnable = d1Var3.N;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        y0 y0Var = new y0(d1Var3, 11);
                                        d1Var3.N = y0Var;
                                        AndroidUtilities.runOnUIThread(y0Var, d1Var3.l() ? 5000 : 20000);
                                    }
                                    break;
                                }
                                break;
                            default:
                                d1 d1Var4 = d1Var2;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!d1Var4.f13182w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(d1Var4.G))) {
                                            if (d1Var4.A != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance2 = d1Var4.A;
                                                Objects.requireNonNull(nativeInstance2);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 4));
                                                d1Var4.I.clear();
                                                d1Var4.A = null;
                                            }
                                            d1Var4.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(d1Var4.f13177e).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(d1Var4.f13177e).putChats(groupcall2.chats, false);
                                        d1Var4.v = groupcall2.call;
                                        NotificationCenter.getInstance(d1Var4.f13177e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var4.v.f22390id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new y0(d1Var4, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new y0(d1Var4, 4));
                                        }
                                    }
                                    if (d1Var4.L) {
                                        Runnable runnable2 = d1Var4.M;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        y0 y0Var2 = new y0(d1Var4, 10);
                                        d1Var4.M = y0Var2;
                                        AndroidUtilities.runOnUIThread(y0Var2, 4000L);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                d1 d1Var3 = this.f14087b;
                int i16 = d1Var3.f13177e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i16).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i16).putChats(groupcall.chats, false);
                    if (d1Var3.A != null && !d1Var3.f13182w) {
                        for (int i17 = 0; i17 < groupcall.participants.size(); i17++) {
                            if (DialogObject.getPeerDialogId(groupcall.participants.get(i17).peer) == d1Var3.f13175b) {
                                d1Var3.C = groupcall.participants.get(i17);
                                groupCallParticipant = d1Var3.C;
                                if (groupCallParticipant != null || (tL_groupCallParticipantVideo = groupCallParticipant.video) == null) {
                                    AndroidUtilities.runOnUIThread(new y0(d1Var3, 7));
                                } else {
                                    NativeInstance nativeInstance2 = d1Var3.A;
                                    String str2 = tL_groupCallParticipantVideo.endpoint;
                                    NativeInstance.SsrcGroup[] ssrcGroupArrD2 = d1.d(tL_groupCallParticipantVideo);
                                    d1Var3.r(ssrcGroupArrD2);
                                    nativeInstance2.addIncomingVideoOutput(2, str2, ssrcGroupArrD2, d1Var3.D, DialogObject.getPeerDialogId(d1Var3.C.peer));
                                }
                            }
                            break;
                        }
                        groupCallParticipant = d1Var3.C;
                        if (groupCallParticipant != null) {
                        }
                        AndroidUtilities.runOnUIThread(new y0(d1Var3, 7));
                        break;
                    }
                }
                break;
            case 3:
                final int i18 = 1;
                final d1 d1Var4 = this.f14087b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i18) {
                            case 0:
                                d1 d1Var5 = d1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i19 = d1Var5.f13177e;
                                if (!d1Var5.f13182w) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        MessagesController.getInstance(i19).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(i19).putChats(groupcall2.chats, false);
                                        d1Var5.v = groupcall2.call;
                                        NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var5.v.f22390id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        AndroidUtilities.runOnUIThread(new y0(d1Var5, 4));
                                    }
                                    if (d1Var5.L) {
                                        Runnable runnable = d1Var5.N;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        y0 y0Var = new y0(d1Var5, 11);
                                        d1Var5.N = y0Var;
                                        AndroidUtilities.runOnUIThread(y0Var, d1Var5.l() ? 5000 : 20000);
                                    }
                                    break;
                                }
                                break;
                            default:
                                d1 d1Var6 = d1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!d1Var6.f13182w) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(d1Var6.G))) {
                                            if (d1Var6.A != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance3 = d1Var6.A;
                                                Objects.requireNonNull(nativeInstance3);
                                                dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance3, 4));
                                                d1Var6.I.clear();
                                                d1Var6.A = null;
                                            }
                                            d1Var6.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall3 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(d1Var6.f13177e).putUsers(groupcall3.users, false);
                                        MessagesController.getInstance(d1Var6.f13177e).putChats(groupcall3.chats, false);
                                        d1Var6.v = groupcall3.call;
                                        NotificationCenter.getInstance(d1Var6.f13177e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var6.v.f22390id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new y0(d1Var6, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new y0(d1Var6, 4));
                                        }
                                    }
                                    if (d1Var6.L) {
                                        Runnable runnable2 = d1Var6.M;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        y0 y0Var2 = new y0(d1Var6, 10);
                                        d1Var6.M = y0Var2;
                                        AndroidUtilities.runOnUIThread(y0Var2, 4000L);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                d1 d1Var5 = this.f14087b;
                int i19 = d1Var5.f13177e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i19).putUsers(updates2.users, false);
                    MessagesController.getInstance(i19).putChats(updates2.chats, false);
                    MessagesController.getInstance(i19).processUpdates(updates2, false);
                    break;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new y0(d1Var5, 4));
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                d1 d1Var6 = this.f14087b;
                if (z11) {
                    MessagesController.getInstance(d1Var6.f13177e).processUpdates((TLRPC.Updates) tLObject, false);
                } else {
                    d1Var6.getClass();
                }
                break;
        }
    }
}
