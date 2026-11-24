package defpackage;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_update;
public final class y67 implements RequestDelegate {
    public final byte a;
    public final oc7 b;

    public y67(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = 0;
        final oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7 oc7Var2 = this.b;
                ConcurrentHashMap concurrentHashMap = oc7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = oc7Var2.P;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    while (i < tL_messages_peerDialogs.dialogs.size()) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i);
                        pg3.w(dialog);
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
                        oc7Var2.S3(arrayList, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.R3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                oc7Var.getClass();
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 3:
                oc7Var.x2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    oc7Var.y2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    oc7Var.y2 = tL_help_termsOfServiceUpdate.expires;
                    gm.c3(new q87(oc7Var, tL_help_termsOfServiceUpdate, (byte) 2));
                } else {
                    oc7Var.y2 = oc7Var.getConnectionsManager().getCurrentTime() + 3600;
                }
                oc7Var.W3.edit().putInt("nextTosCheckTime", oc7Var.y2).commit();
                return;
            case 4:
                if (tL_error == null) {
                    gm.c3(new a77(oc7Var, tLObject, (byte) 5));
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.R3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 6:
                gm.c3(new a77(oc7Var, tLObject, (byte) 3));
                return;
            case 7:
                oc7Var.getClass();
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 8:
                oc7Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (arrayList2.get(i2) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i2));
                        }
                    }
                    oc7Var.getMessagesController().d4(arrayList3, false);
                    return;
                }
                return;
            case 9:
                if (tL_error == null) {
                    oc7Var.C2 = System.currentTimeMillis();
                    oc7Var.F2 = false;
                    oc7Var.E2 = (byte) 0;
                } else {
                    long j = oc7Var.C2;
                    if (j != 0) {
                        oc7Var.C2 = j + 5000;
                    }
                }
                oc7Var.D2 = 0;
                return;
            case 10:
                if (tL_error == null) {
                    oc7Var.F2 = true;
                } else {
                    long j2 = oc7Var.C2;
                    if (j2 != 0) {
                        oc7Var.C2 = j2 + 5000;
                    }
                }
                oc7Var.D2 = 0;
                return;
            case 11:
                oc7Var.getClass();
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new ba7(oc7Var, (byte) 3));
                    return;
                }
                return;
            case 12:
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new ba7(oc7Var, (byte) 4));
                    return;
                }
                return;
            case 13:
                gm.c3(new a77(oc7Var, tLObject, (byte) 6));
                return;
            case 14:
                gm.c3(new a77(oc7Var, tLObject, (byte) 2));
                return;
            case 15:
                oc7Var.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    oc7Var.R3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            case 16:
                oc7Var.getClass();
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new ba7(oc7Var, (byte) 8));
                    return;
                }
                return;
            case 17:
                gm.c3(new a77(oc7Var, tLObject, (byte) 1));
                return;
            case 18:
                if (tLObject instanceof Vector) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    while (i < vector.objects.size()) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i));
                        i++;
                    }
                    cf7 messagesStorage = oc7Var.getMessagesStorage();
                    messagesStorage.a.c(new ud7(messagesStorage, arrayList4, new g87(oc7Var, (byte) 3), (byte) 3));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z = oc7Var.m4;
                    boolean z2 = tL_messages_dialogFilters.tags_enabled;
                    if (z != z2) {
                        SharedPreferences.Editor edit = oc7Var.X3.edit();
                        oc7Var.m4 = z2;
                        edit.putBoolean("folderTags", z2).apply();
                        gm.c3(new g87(oc7Var, (byte) 4));
                    }
                    cf7 messagesStorage2 = oc7Var.getMessagesStorage();
                    messagesStorage2.a.c(new ud7(messagesStorage2, tL_messages_dialogFilters.filters, new g87(oc7Var, (byte) 5), (byte) 3));
                    return;
                } else {
                    gm.c3(new g87(oc7Var, (byte) 6));
                    return;
                }
            case 19:
                if (tL_error == null) {
                    TLRPC.User W1 = oc7Var.W1(Long.valueOf(oc7Var.getUserConfig().e()));
                    if (W1 == null) {
                        W1 = oc7Var.getUserConfig().f();
                        oc7Var.c4(W1, true, false);
                    } else {
                        oc7Var.getUserConfig().v(W1);
                    }
                    if (W1 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w = bc4.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w2 = bc4.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        W1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                        if (w != null) {
                            tL_userProfilePhoto.photo_small = w.location;
                        }
                        if (w2 != null) {
                            tL_userProfilePhoto.photo_big = w2.location;
                        }
                        oc7Var.T0(W1.id).f();
                        oc7Var.T0(W1.id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(W1);
                        oc7Var.getMessagesStorage().j1(arrayList6, null, false, true);
                        gm.c3(new ba7(oc7Var, (byte) 18));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                oc7Var.getConnectionsManager().cleanup(false);
                gm.c3(new m87(tLObject, (byte) 0));
                return;
            case 21:
                oc7Var.getClass();
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_help_peerColors tL_help_peerColors2 = tL_help_peerColors;
                            oc7 oc7Var3 = oc7Var;
                            switch (b2) {
                                case 0:
                                    oc7Var3.R4 = false;
                                    oc7Var3.E3 = fc7.c(0, tL_help_peerColors2);
                                    oc7Var3.X3.edit().putString("peerColors", oc7Var3.E3.toString()).apply();
                                    return;
                                default:
                                    oc7Var3.S4 = false;
                                    oc7Var3.F3 = fc7.c(1, tL_help_peerColors2);
                                    oc7Var3.X3.edit().putString("profilePeerColors", oc7Var3.F3.toString()).apply();
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
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_help_peerColors tL_help_peerColors22 = tL_help_peerColors2;
                            oc7 oc7Var3 = oc7Var;
                            switch (b2) {
                                case 0:
                                    oc7Var3.R4 = false;
                                    oc7Var3.E3 = fc7.c(0, tL_help_peerColors22);
                                    oc7Var3.X3.edit().putString("peerColors", oc7Var3.E3.toString()).apply();
                                    return;
                                default:
                                    oc7Var3.S4 = false;
                                    oc7Var3.F3 = fc7.c(1, tL_help_peerColors22);
                                    oc7Var3.X3.edit().putString("profilePeerColors", oc7Var3.F3.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 24:
                oc7Var.a2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    oc7Var.getMessagesStorage().E1(tL_updates_state.date);
                    oc7Var.getMessagesStorage().F1(tL_updates_state.pts);
                    oc7Var.getMessagesStorage().H1(tL_updates_state.seq);
                    oc7Var.getMessagesStorage().G1(tL_updates_state.qts);
                    while (i < 3) {
                        oc7Var.U3(i, 2);
                        i++;
                    }
                    cf7 messagesStorage3 = oc7Var.getMessagesStorage();
                    cf7 messagesStorage4 = oc7Var.getMessagesStorage();
                    messagesStorage4.G();
                    int i3 = messagesStorage4.w;
                    cf7 messagesStorage5 = oc7Var.getMessagesStorage();
                    messagesStorage5.G();
                    int i4 = messagesStorage5.r;
                    cf7 messagesStorage6 = oc7Var.getMessagesStorage();
                    messagesStorage6.G();
                    int i5 = messagesStorage6.n;
                    cf7 messagesStorage7 = oc7Var.getMessagesStorage();
                    messagesStorage7.G();
                    messagesStorage3.x1(i3, i4, i5, messagesStorage7.s);
                    return;
                } else if (tL_error.code != 401) {
                    oc7Var.a2 = true;
                    oc7Var.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new y67(oc7Var, (byte) 24));
                    return;
                } else {
                    return;
                }
            case 25:
                gm.c3(new a77(oc7Var, tLObject, (byte) 4));
                return;
            default:
                oc7Var.getClass();
                gm.c3(new a77(oc7Var, tLObject, (byte) 0));
                return;
        }
    }
}
