package defpackage;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_update;
public final class y47 implements RequestDelegate {
    public final byte a;
    public final na7 b;

    public y47(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = 0;
        final na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7 na7Var2 = this.b;
                ConcurrentHashMap concurrentHashMap = na7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = na7Var2.P;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    while (i < tL_messages_peerDialogs.dialogs.size()) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i);
                        cf3.w(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
                        if (num.intValue() == 0) {
                            if (dialog.peer.channel_id != 0) {
                                TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                                tL_updateReadChannelInbox.channel_id = dialog.peer.channel_id;
                                tL_updateReadChannelInbox.max_id = dialog.read_inbox_max_id;
                                tL_updateReadChannelInbox.still_unread_count = dialog.unread_count;
                                arrayList.add(tL_updateReadChannelInbox);
                            } else {
                                TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                                tL_updateReadHistoryInbox.peer = dialog.peer;
                                tL_updateReadHistoryInbox.max_id = dialog.read_inbox_max_id;
                                arrayList.add(tL_updateReadHistoryInbox);
                            }
                        }
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
                        if (dialog.read_outbox_max_id > num2.intValue()) {
                            if (dialog.peer.channel_id != 0) {
                                TL_update.TL_updateReadChannelOutbox tL_updateReadChannelOutbox = new TL_update.TL_updateReadChannelOutbox();
                                tL_updateReadChannelOutbox.channel_id = dialog.peer.channel_id;
                                tL_updateReadChannelOutbox.max_id = dialog.read_outbox_max_id;
                                arrayList.add(tL_updateReadChannelOutbox);
                            } else {
                                TL_update.TL_updateReadHistoryOutbox tL_updateReadHistoryOutbox = new TL_update.TL_updateReadHistoryOutbox();
                                tL_updateReadHistoryOutbox.peer = dialog.peer;
                                tL_updateReadHistoryOutbox.max_id = dialog.read_outbox_max_id;
                                arrayList.add(tL_updateReadHistoryOutbox);
                            }
                        }
                        i++;
                    }
                    if (!arrayList.isEmpty()) {
                        na7Var2.P3(arrayList, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    na7Var.O3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                na7Var.getClass();
                if (tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 3:
                na7Var.x2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    na7Var.y2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    na7Var.y2 = tL_help_termsOfServiceUpdate.expires;
                    gl.d3(new t67(na7Var, tL_help_termsOfServiceUpdate, (byte) 0));
                } else {
                    na7Var.y2 = na7Var.getConnectionsManager().getCurrentTime() + 3600;
                }
                na7Var.W3.edit().putInt("nextTosCheckTime", na7Var.y2).commit();
                return;
            case 4:
                if (tL_error == null) {
                    gl.d3(new a57(na7Var, tLObject, (byte) 5));
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    na7Var.O3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 6:
                gl.d3(new a57(na7Var, tLObject, (byte) 3));
                return;
            case 7:
                na7Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (arrayList2.get(i2) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i2));
                        }
                    }
                    na7Var.getMessagesController().a4(arrayList3, false);
                    return;
                }
                return;
            case 8:
                na7Var.getClass();
                if (tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 9:
                if (tL_error == null) {
                    na7Var.C2 = System.currentTimeMillis();
                    na7Var.F2 = false;
                    na7Var.E2 = (byte) 0;
                } else {
                    long j = na7Var.C2;
                    if (j != 0) {
                        na7Var.C2 = j + 5000;
                    }
                }
                na7Var.D2 = 0;
                return;
            case 10:
                if (tL_error == null) {
                    na7Var.F2 = true;
                } else {
                    long j2 = na7Var.C2;
                    if (j2 != 0) {
                        na7Var.C2 = j2 + 5000;
                    }
                }
                na7Var.D2 = 0;
                return;
            case 11:
                na7Var.getClass();
                if (tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new c87(na7Var, (byte) 3));
                    return;
                }
                return;
            case 12:
                if (tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new c87(na7Var, (byte) 4));
                    return;
                }
                return;
            case 13:
                gl.d3(new a57(na7Var, tLObject, (byte) 6));
                return;
            case 14:
                gl.d3(new a57(na7Var, tLObject, (byte) 2));
                return;
            case 15:
                na7Var.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    na7Var.O3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            case 16:
                na7Var.getClass();
                if (tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new c87(na7Var, (byte) 8));
                    return;
                }
                return;
            case 17:
                gl.d3(new a57(na7Var, tLObject, (byte) 1));
                return;
            case 18:
                if (tLObject instanceof Vector) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i3 = 0; i3 < vector.objects.size(); i3++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i3));
                    }
                    ad7 messagesStorage = na7Var.getMessagesStorage();
                    messagesStorage.a.c(new pc7(messagesStorage, arrayList4, new f67(na7Var, (byte) 2), (byte) 0));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z = na7Var.l4;
                    boolean z2 = tL_messages_dialogFilters.tags_enabled;
                    if (z != z2) {
                        SharedPreferences.Editor edit = na7Var.X3.edit();
                        na7Var.l4 = z2;
                        edit.putBoolean("folderTags", z2).apply();
                        gl.d3(new f67(na7Var, (byte) 3));
                    }
                    ad7 messagesStorage2 = na7Var.getMessagesStorage();
                    messagesStorage2.a.c(new pc7(messagesStorage2, tL_messages_dialogFilters.filters, new f67(na7Var, (byte) 4), (byte) 0));
                    return;
                } else {
                    gl.d3(new f67(na7Var, (byte) 5));
                    return;
                }
            case 19:
                if (tL_error == null) {
                    TLRPC.User V1 = na7Var.V1(Long.valueOf(na7Var.getUserConfig().e()));
                    if (V1 == null) {
                        V1 = na7Var.getUserConfig().f();
                        na7Var.Z3(V1, true, false);
                    } else {
                        na7Var.getUserConfig().v(V1);
                    }
                    if (V1 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w = ba4.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w2 = ba4.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        V1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                        if (w != null) {
                            tL_userProfilePhoto.photo_small = w.location;
                        }
                        if (w2 != null) {
                            tL_userProfilePhoto.photo_big = w2.location;
                        }
                        na7Var.S0(V1.id).f();
                        na7Var.S0(V1.id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(V1);
                        na7Var.getMessagesStorage().j1(arrayList6, null, false, true);
                        gl.d3(new c87(na7Var, (byte) 18));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                na7Var.getConnectionsManager().cleanup(false);
                gl.d3(new x57(tLObject, (byte) 0));
                return;
            case 21:
                na7Var.getClass();
                if (tL_error == null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_help_peerColors tL_help_peerColors2 = tL_help_peerColors;
                            na7 na7Var3 = na7Var;
                            switch (b2) {
                                case 0:
                                    na7Var3.P4 = false;
                                    na7Var3.E3 = ea7.c(0, tL_help_peerColors2);
                                    na7Var3.X3.edit().putString("peerColors", na7Var3.E3.toString()).apply();
                                    return;
                                default:
                                    na7Var3.Q4 = false;
                                    na7Var3.F3 = ea7.c(1, tL_help_peerColors2);
                                    na7Var3.X3.edit().putString("profilePeerColors", na7Var3.F3.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 23:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors2 = (TLRPC.TL_help_peerColors) tLObject;
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_help_peerColors tL_help_peerColors22 = tL_help_peerColors2;
                            na7 na7Var3 = na7Var;
                            switch (b2) {
                                case 0:
                                    na7Var3.P4 = false;
                                    na7Var3.E3 = ea7.c(0, tL_help_peerColors22);
                                    na7Var3.X3.edit().putString("peerColors", na7Var3.E3.toString()).apply();
                                    return;
                                default:
                                    na7Var3.Q4 = false;
                                    na7Var3.F3 = ea7.c(1, tL_help_peerColors22);
                                    na7Var3.X3.edit().putString("profilePeerColors", na7Var3.F3.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 24:
                na7Var.a2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    na7Var.getMessagesStorage().E1(tL_updates_state.date);
                    na7Var.getMessagesStorage().F1(tL_updates_state.pts);
                    na7Var.getMessagesStorage().H1(tL_updates_state.seq);
                    na7Var.getMessagesStorage().G1(tL_updates_state.qts);
                    while (i < 3) {
                        na7Var.R3(i, 2);
                        i++;
                    }
                    ad7 messagesStorage3 = na7Var.getMessagesStorage();
                    ad7 messagesStorage4 = na7Var.getMessagesStorage();
                    messagesStorage4.G();
                    int i4 = messagesStorage4.w;
                    ad7 messagesStorage5 = na7Var.getMessagesStorage();
                    messagesStorage5.G();
                    int i5 = messagesStorage5.r;
                    ad7 messagesStorage6 = na7Var.getMessagesStorage();
                    messagesStorage6.G();
                    int i6 = messagesStorage6.n;
                    ad7 messagesStorage7 = na7Var.getMessagesStorage();
                    messagesStorage7.G();
                    messagesStorage3.x1(i4, i5, i6, messagesStorage7.s);
                    return;
                } else if (tL_error.code != 401) {
                    na7Var.a2 = true;
                    na7Var.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new y47(na7Var, (byte) 24));
                    return;
                } else {
                    return;
                }
            case 25:
                gl.d3(new a57(na7Var, tLObject, (byte) 4));
                return;
            default:
                na7Var.getClass();
                gl.d3(new a57(na7Var, tLObject, (byte) 0));
                return;
        }
    }
}
