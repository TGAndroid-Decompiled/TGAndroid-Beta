package defpackage;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_update;
public final class h77 implements RequestDelegate {
    public final byte a;
    public final uc7 b;

    public h77(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = 0;
        final uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.x2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    uc7Var.y2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    uc7Var.y2 = tL_help_termsOfServiceUpdate.expires;
                    hl.c3(new mn6(uc7Var, tL_help_termsOfServiceUpdate, (byte) 27));
                } else {
                    uc7Var.y2 = uc7Var.getConnectionsManager().getCurrentTime() + 3600;
                }
                uc7Var.X3.edit().putInt("nextTosCheckTime", uc7Var.y2).commit();
                return;
            case 1:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                if (tL_error == null) {
                    TLRPC.User X1 = uc7Var.X1(Long.valueOf(uc7Var.getUserConfig().e()));
                    if (X1 == null) {
                        X1 = uc7Var.getUserConfig().f();
                        uc7Var.i4(X1, true, false);
                    } else {
                        uc7Var.getUserConfig().v(X1);
                    }
                    if (X1 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w = xb4.w(arrayList, 100, false, null, false);
                        TLRPC.PhotoSize w2 = xb4.w(arrayList, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        X1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                        if (w != null) {
                            tL_userProfilePhoto.photo_small = w.location;
                        }
                        if (w2 != null) {
                            tL_userProfilePhoto.photo_big = w2.location;
                        }
                        uc7Var.U0(X1.id).f();
                        uc7Var.U0(X1.id).a(0, 80);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(X1);
                        uc7Var.getMessagesStorage().n1(arrayList2, null, false, true);
                        hl.c3(new l87(uc7Var, (byte) 10));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                uc7Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        if (arrayList3.get(i2) instanceof TLRPC.User) {
                            arrayList4.add((TLRPC.User) arrayList3.get(i2));
                        }
                    }
                    uc7Var.getMessagesController().j4(arrayList4, false);
                    return;
                }
                return;
            case 4:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    hl.c3(new c87(uc7Var, tLObject, (byte) 2));
                    return;
                }
                return;
            case 6:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 7:
                hl.c3(new c87(uc7Var, tLObject, (byte) 3));
                return;
            case 8:
                if (tL_error == null) {
                    uc7Var.C2 = System.currentTimeMillis();
                    uc7Var.F2 = false;
                    uc7Var.E2 = (byte) 0;
                } else {
                    long j = uc7Var.C2;
                    if (j != 0) {
                        uc7Var.C2 = j + 5000;
                    }
                }
                uc7Var.D2 = 0;
                return;
            case 9:
                if (tL_error == null) {
                    uc7Var.F2 = true;
                } else {
                    long j2 = uc7Var.C2;
                    if (j2 != 0) {
                        uc7Var.C2 = j2 + 5000;
                    }
                }
                uc7Var.D2 = 0;
                return;
            case 10:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var, (byte) 6));
                    return;
                }
                return;
            case 11:
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var, (byte) 5));
                    return;
                }
                return;
            case 12:
                hl.c3(new c87(uc7Var, tLObject, (byte) 4));
                return;
            case 13:
                hl.c3(new c87(uc7Var, tLObject, (byte) 0));
                return;
            case 14:
                uc7Var.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 15:
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new pa7(uc7Var, (byte) 3));
                    return;
                }
                return;
            case 16:
                hl.c3(new c87(uc7Var, tLObject, (byte) 5));
                return;
            case 17:
                if (tLObject instanceof Vector) {
                    ArrayList arrayList5 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    while (i < vector.objects.size()) {
                        arrayList5.add((TLRPC.DialogFilter) vector.objects.get(i));
                        i++;
                    }
                    kf7 messagesStorage = uc7Var.getMessagesStorage();
                    messagesStorage.a.c(new gd7(messagesStorage, arrayList5, new l87(uc7Var, (byte) 2), (byte) 6));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z = uc7Var.m4;
                    boolean z2 = tL_messages_dialogFilters.tags_enabled;
                    if (z != z2) {
                        SharedPreferences.Editor edit = uc7Var.Y3.edit();
                        uc7Var.m4 = z2;
                        edit.putBoolean("folderTags", z2).apply();
                        hl.c3(new l87(uc7Var, (byte) 3));
                    }
                    kf7 messagesStorage2 = uc7Var.getMessagesStorage();
                    messagesStorage2.a.c(new gd7(messagesStorage2, tL_messages_dialogFilters.filters, new l87(uc7Var, (byte) 4), (byte) 6));
                    return;
                } else {
                    hl.c3(new l87(uc7Var, (byte) 5));
                    return;
                }
            case 18:
                uc7Var.getConnectionsManager().cleanup(false);
                hl.c3(new d87(tLObject, (byte) 0));
                return;
            case 19:
                uc7Var.getClass();
                if (tL_error == null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 20:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_help_peerColors tL_help_peerColors2 = tL_help_peerColors;
                            uc7 uc7Var2 = uc7Var;
                            switch (b2) {
                                case 0:
                                    uc7Var2.R4 = false;
                                    uc7Var2.F3 = lc7.c(0, tL_help_peerColors2);
                                    uc7Var2.Y3.edit().putString("peerColors", uc7Var2.F3.toString()).apply();
                                    return;
                                default:
                                    uc7Var2.S4 = false;
                                    uc7Var2.G3 = lc7.c(1, tL_help_peerColors2);
                                    uc7Var2.Y3.edit().putString("profilePeerColors", uc7Var2.G3.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 21:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors2 = (TLRPC.TL_help_peerColors) tLObject;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b2 = r3;
                            TLRPC.TL_help_peerColors tL_help_peerColors22 = tL_help_peerColors2;
                            uc7 uc7Var2 = uc7Var;
                            switch (b2) {
                                case 0:
                                    uc7Var2.R4 = false;
                                    uc7Var2.F3 = lc7.c(0, tL_help_peerColors22);
                                    uc7Var2.Y3.edit().putString("peerColors", uc7Var2.F3.toString()).apply();
                                    return;
                                default:
                                    uc7Var2.S4 = false;
                                    uc7Var2.G3 = lc7.c(1, tL_help_peerColors22);
                                    uc7Var2.Y3.edit().putString("profilePeerColors", uc7Var2.G3.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 22:
                uc7Var.a2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    uc7Var.getMessagesStorage().J1(tL_updates_state.date);
                    uc7Var.getMessagesStorage().K1(tL_updates_state.pts);
                    uc7Var.getMessagesStorage().M1(tL_updates_state.seq);
                    uc7Var.getMessagesStorage().L1(tL_updates_state.qts);
                    while (i < 3) {
                        uc7Var.Z3(i, 2);
                        i++;
                    }
                    kf7 messagesStorage3 = uc7Var.getMessagesStorage();
                    kf7 messagesStorage4 = uc7Var.getMessagesStorage();
                    messagesStorage4.I();
                    int i3 = messagesStorage4.w;
                    kf7 messagesStorage5 = uc7Var.getMessagesStorage();
                    messagesStorage5.I();
                    int i4 = messagesStorage5.r;
                    kf7 messagesStorage6 = uc7Var.getMessagesStorage();
                    messagesStorage6.I();
                    int i5 = messagesStorage6.n;
                    kf7 messagesStorage7 = uc7Var.getMessagesStorage();
                    messagesStorage7.I();
                    messagesStorage3.B1(i3, i4, i5, messagesStorage7.s);
                    return;
                } else if (tL_error.code != 401) {
                    uc7Var.a2 = true;
                    uc7Var.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new h77(uc7Var, (byte) 22));
                    return;
                } else {
                    return;
                }
            case 23:
                hl.c3(new c87(uc7Var, tLObject, (byte) 1));
                return;
            case 24:
                uc7 uc7Var2 = this.b;
                ConcurrentHashMap concurrentHashMap = uc7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = uc7Var2.P;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList6 = new ArrayList();
                    while (i < tL_messages_peerDialogs.dialogs.size()) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i);
                        wf3.w(dialog);
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
                                arrayList6.add(tL_updateReadChannelInbox);
                            } else {
                                TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                                tL_updateReadHistoryInbox.peer = dialog.peer;
                                tL_updateReadHistoryInbox.max_id = dialog.read_inbox_max_id;
                                arrayList6.add(tL_updateReadHistoryInbox);
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
                                arrayList6.add(tL_updateReadChannelOutbox);
                            } else {
                                TL_update.TL_updateReadHistoryOutbox tL_updateReadHistoryOutbox = new TL_update.TL_updateReadHistoryOutbox();
                                tL_updateReadHistoryOutbox.peer = dialog.peer;
                                tL_updateReadHistoryOutbox.max_id = dialog.read_outbox_max_id;
                                arrayList6.add(tL_updateReadHistoryOutbox);
                            }
                        }
                        i++;
                    }
                    if (!arrayList6.isEmpty()) {
                        uc7Var2.X3(arrayList6, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    uc7Var.W3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            default:
                uc7Var.getClass();
                hl.c3(new c87(uc7Var, tLObject, (byte) 6));
                return;
        }
    }
}
