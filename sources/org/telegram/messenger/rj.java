package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public final class rj implements RequestDelegate {
    public final int f25302a;
    public final qp f25303b;

    public rj(qp qpVar, int i7) {
        this.f25302a = i7;
        this.f25303b = qpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25302a) {
            case 0:
                qp qpVar = this.f25303b;
                ConcurrentHashMap concurrentHashMap = qpVar.P;
                ConcurrentHashMap concurrentHashMap2 = qpVar.O;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i7 = 0; i7 < tL_messages_peerDialogs.dialogs.size(); i7++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i7);
                        m5.x(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.f26964id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.f26964id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
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
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.f26964id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.f26964id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
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
                    }
                    if (!arrayList.isEmpty()) {
                        qpVar.N3(arrayList, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.f25303b.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                qp qpVar2 = this.f25303b;
                qpVar2.getClass();
                if (tLObject != null) {
                    qpVar2.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 3:
                qp qpVar3 = this.f25303b;
                qpVar3.E2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    qpVar3.F2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    qpVar3.F2 = tL_help_termsOfServiceUpdate.expires;
                    g0.h3(new hi(14, qpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    qpVar3.F2 = qpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                qpVar3.f24768d7.edit().putInt("nextTosCheckTime", qpVar3.F2).commit();
                return;
            case 4:
                if (tL_error == null) {
                    final qp qpVar4 = this.f25303b;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z9;
                            boolean z10;
                            boolean z11;
                            Set set;
                            int i10 = r3;
                            qp qpVar5 = qpVar4;
                            boolean z12 = true;
                            TLObject tLObject2 = tLObject;
                            switch (i10) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = qpVar5.f24768d7.edit();
                                        if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        edit.putBoolean("EnableReactionsMessages", z9);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                        if (reactionNotificationsFrom != null) {
                                            edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                            z12 = false;
                                        }
                                        edit.putBoolean("EnableReactionsStories", z12);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                        if (reactionNotificationsFrom2 != null) {
                                            edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                        qpVar5.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        qpVar5.getNotificationCenter().k(42, new Object[0]);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qpVar5.T0 = false;
                                    ArrayList arrayList2 = qpVar5.V0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    qpVar5.getNotificationCenter().k(186, new Object[0]);
                                    return;
                                case 2:
                                    qpVar5.f24896s2 = false;
                                    SharedPreferences.Editor edit2 = qpVar5.f24768d7.edit();
                                    edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit2.commit();
                                    qpVar5.getUserConfig().T = true;
                                    qpVar5.getUserConfig().v(false);
                                    return;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    qpVar5.Y3(tL_help_recentMeUrls.users, false);
                                    qpVar5.S3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = qpVar5.f24893s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    qpVar5.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                case 4:
                                    qpVar5.f24886r2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit3 = qpVar5.f24768d7.edit();
                                        if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        edit3.putBoolean("EnableReactionsMessages", z10);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                        if (reactionNotificationsFrom3 != null) {
                                            edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        edit3.putBoolean("EnableReactionsStories", z11);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                        if (reactionNotificationsFrom4 != null) {
                                            edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                        qpVar5.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                        edit3.apply();
                                    }
                                    if (qpVar5.f24886r2 == 0) {
                                        qpVar5.getUserConfig().S = true;
                                        qpVar5.getUserConfig().v(false);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        qpVar5.f24847m8 = (TL_account.contentSettings) tLObject2;
                                        qpVar5.f24839l8 = System.currentTimeMillis();
                                    }
                                    qpVar5.f24822j8 = false;
                                    TL_account.contentSettings contentsettings = qpVar5.f24847m8;
                                    if (contentsettings != null && (set = qpVar5.C4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = qpVar5.f24778e7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar5.C4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = qpVar5.f24831k8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i11 = 0;
                                        while (i11 < size) {
                                            Object obj = arrayList4.get(i11);
                                            i11++;
                                            ((c20) obj).a(qpVar5.f24847m8);
                                        }
                                        qpVar5.f24831k8.clear();
                                        qpVar5.f24831k8 = null;
                                    }
                                    qpVar5.getNotificationCenter().k(243, new Object[0]);
                                    return;
                                default:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i12 = 0;
                                        while (true) {
                                            qp qpVar6 = qpVar4;
                                            if (i12 < size2) {
                                                TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                                if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                    TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                    long j3 = peer.user_id;
                                                    if (j3 == 0) {
                                                        long j10 = peer.chat_id;
                                                        if (j10 != 0) {
                                                            j3 = -j10;
                                                        } else {
                                                            j3 = -peer.channel_id;
                                                        }
                                                    }
                                                    long j11 = j3;
                                                    qpVar6.getMessagesStorage().F1(j11, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar6.Q.f(j11);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            qpVar6.r2(j11, 0L, null);
                                                        }
                                                    }
                                                }
                                                i12++;
                                            } else {
                                                qpVar6.getUserConfig().f24502x = true;
                                                qpVar6.getUserConfig().v(false);
                                                qpVar6.getNotificationCenter().k(2, 256);
                                                qpVar6.d2 = false;
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.f25303b.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 6:
                final qp qpVar5 = this.f25303b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9;
                        boolean z10;
                        boolean z11;
                        Set set;
                        int i10 = r3;
                        qp qpVar52 = qpVar5;
                        boolean z12 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z9);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z12 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList2 = qpVar52.V0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                qpVar52.f24896s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.f24768d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = qpVar52.f24893s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                qpVar52.f24886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.f24886r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.f24847m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.f24839l8 = System.currentTimeMillis();
                                }
                                qpVar52.f24822j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.f24847m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.f24778e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.f24831k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((c20) obj).a(qpVar52.f24847m8);
                                    }
                                    qpVar52.f24831k8.clear();
                                    qpVar52.f24831k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        qp qpVar6 = qpVar5;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j3 = peer.user_id;
                                                if (j3 == 0) {
                                                    long j10 = peer.chat_id;
                                                    if (j10 != 0) {
                                                        j3 = -j10;
                                                    } else {
                                                        j3 = -peer.channel_id;
                                                    }
                                                }
                                                long j11 = j3;
                                                qpVar6.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar6.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar6.r2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            qpVar6.getUserConfig().f24502x = true;
                                            qpVar6.getUserConfig().v(false);
                                            qpVar6.getNotificationCenter().k(2, 256);
                                            qpVar6.d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
            case 7:
                qp qpVar6 = this.f25303b;
                qpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        if (arrayList2.get(i10) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i10));
                        }
                    }
                    qpVar6.getMessagesController().Y3(arrayList3, false);
                    return;
                }
                return;
            case 8:
                qp qpVar7 = this.f25303b;
                qpVar7.getClass();
                if (tLObject != null) {
                    qpVar7.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 9:
                qp qpVar8 = this.f25303b;
                if (tL_error == null) {
                    qpVar8.getClass();
                    qpVar8.J2 = System.currentTimeMillis();
                    qpVar8.M2 = false;
                    qpVar8.L2 = 0;
                } else {
                    long j3 = qpVar8.J2;
                    if (j3 != 0) {
                        qpVar8.J2 = j3 + 5000;
                    }
                }
                qpVar8.K2 = 0;
                return;
            case 10:
                qp qpVar9 = this.f25303b;
                if (tL_error == null) {
                    qpVar9.M2 = true;
                } else {
                    long j10 = qpVar9.J2;
                    if (j10 != 0) {
                        qpVar9.J2 = j10 + 5000;
                    }
                }
                qpVar9.K2 = 0;
                return;
            case 11:
                final qp qpVar10 = this.f25303b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9;
                        boolean z10;
                        boolean z11;
                        Set set;
                        int i102 = r3;
                        qp qpVar52 = qpVar10;
                        boolean z12 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z9);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z12 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                qpVar52.f24896s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.f24768d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.f24893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                qpVar52.f24886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.f24886r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.f24847m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.f24839l8 = System.currentTimeMillis();
                                }
                                qpVar52.f24822j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.f24847m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.f24778e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.f24831k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((c20) obj).a(qpVar52.f24847m8);
                                    }
                                    qpVar52.f24831k8.clear();
                                    qpVar52.f24831k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar10;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    if (j102 != 0) {
                                                        j32 = -j102;
                                                    } else {
                                                        j32 = -peer.channel_id;
                                                    }
                                                }
                                                long j11 = j32;
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            qpVar62.getUserConfig().f24502x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
            case 12:
                qp qpVar11 = this.f25303b;
                qpVar11.getClass();
                if (tLObject != null) {
                    qpVar11.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vj(qpVar11, 25));
                    return;
                }
                return;
            case 13:
                if (tLObject != null) {
                    qp qpVar12 = this.f25303b;
                    qpVar12.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vj(qpVar12, 29));
                    return;
                }
                return;
            case 14:
                qp qpVar13 = this.f25303b;
                qpVar13.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar13.M3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            case 15:
                final qp qpVar14 = this.f25303b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9;
                        boolean z10;
                        boolean z11;
                        Set set;
                        int i102 = r3;
                        qp qpVar52 = qpVar14;
                        boolean z12 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z9);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z12 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                qpVar52.f24896s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.f24768d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.f24893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                qpVar52.f24886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.f24886r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.f24847m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.f24839l8 = System.currentTimeMillis();
                                }
                                qpVar52.f24822j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.f24847m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.f24778e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.f24831k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((c20) obj).a(qpVar52.f24847m8);
                                    }
                                    qpVar52.f24831k8.clear();
                                    qpVar52.f24831k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar14;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    if (j102 != 0) {
                                                        j32 = -j102;
                                                    } else {
                                                        j32 = -peer.channel_id;
                                                    }
                                                }
                                                long j11 = j32;
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            qpVar62.getUserConfig().f24502x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
            case 16:
                qp qpVar15 = this.f25303b;
                qpVar15.getClass();
                if (tLObject != null) {
                    qpVar15.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vj(qpVar15, 28));
                    return;
                }
                return;
            case 17:
                final qp qpVar16 = this.f25303b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9;
                        boolean z10;
                        boolean z11;
                        Set set;
                        int i102 = r3;
                        qp qpVar52 = qpVar16;
                        boolean z12 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z9);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z12 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                qpVar52.f24896s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.f24768d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.f24893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                qpVar52.f24886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.f24886r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.f24847m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.f24839l8 = System.currentTimeMillis();
                                }
                                qpVar52.f24822j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.f24847m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.f24778e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.f24831k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((c20) obj).a(qpVar52.f24847m8);
                                    }
                                    qpVar52.f24831k8.clear();
                                    qpVar52.f24831k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar16;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    if (j102 != 0) {
                                                        j32 = -j102;
                                                    } else {
                                                        j32 = -peer.channel_id;
                                                    }
                                                }
                                                long j11 = j32;
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            qpVar62.getUserConfig().f24502x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
            case 18:
                boolean z9 = tLObject instanceof Vector;
                qp qpVar17 = this.f25303b;
                if (z9) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i11));
                    }
                    yr messagesStorage = qpVar17.getMessagesStorage();
                    messagesStorage.f26723a.c(new lg(messagesStorage, arrayList4, new sn(qpVar17, 10), 22));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z10 = qpVar17.A7;
                    boolean z11 = tL_messages_dialogFilters.tags_enabled;
                    if (z10 != z11) {
                        SharedPreferences.Editor edit = qpVar17.f24778e7.edit();
                        qpVar17.A7 = z11;
                        edit.putBoolean("folderTags", z11).apply();
                        g0.h3(new sn(qpVar17, 11));
                    }
                    yr messagesStorage2 = qpVar17.getMessagesStorage();
                    messagesStorage2.f26723a.c(new lg(messagesStorage2, tL_messages_dialogFilters.filters, new sn(qpVar17, 12), 22));
                    return;
                } else {
                    g0.h3(new sn(qpVar17, 13));
                    return;
                }
            case 19:
                if (tL_error == null) {
                    qp qpVar18 = this.f25303b;
                    TLRPC.User a22 = qpVar18.a2(Long.valueOf(qpVar18.getUserConfig().e()));
                    if (a22 == null) {
                        a22 = qpVar18.getUserConfig().f();
                        qpVar18.X3(a22, true, false);
                    } else {
                        qpVar18.getUserConfig().w(a22);
                    }
                    if (a22 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w10 = w7.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        a22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f26984id;
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_small = w10.location;
                        }
                        if (w11 != null) {
                            tL_userProfilePhoto.photo_big = w11.location;
                        }
                        qpVar18.U0(a22.f27109id).f();
                        qpVar18.U0(a22.f27109id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(a22);
                        qpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        g0.h3(new vj(qpVar18, 0));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                this.f25303b.getConnectionsManager().cleanup(false);
                g0.h3(new a(tLObject, 23));
                return;
            case 21:
                qp qpVar19 = this.f25303b;
                qpVar19.getClass();
                if (tL_error == null) {
                    qpVar19.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final qp qpVar20 = this.f25303b;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    qp qpVar21 = qpVar20;
                                    qpVar21.f24761c8 = false;
                                    qpVar21.f24888r4 = gp.c(1, tL_help_peerColors);
                                    qpVar21.f24778e7.edit().putString("profilePeerColors", qpVar21.f24888r4.toString()).apply();
                                    return;
                                default:
                                    qp qpVar22 = qpVar20;
                                    qpVar22.f24751b8 = false;
                                    qpVar22.f24878q4 = gp.c(0, tL_help_peerColors);
                                    qpVar22.f24778e7.edit().putString("peerColors", qpVar22.f24878q4.toString()).apply();
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
                    final qp qpVar21 = this.f25303b;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    qp qpVar212 = qpVar21;
                                    qpVar212.f24761c8 = false;
                                    qpVar212.f24888r4 = gp.c(1, tL_help_peerColors2);
                                    qpVar212.f24778e7.edit().putString("profilePeerColors", qpVar212.f24888r4.toString()).apply();
                                    return;
                                default:
                                    qp qpVar22 = qpVar21;
                                    qpVar22.f24751b8 = false;
                                    qpVar22.f24878q4 = gp.c(0, tL_help_peerColors2);
                                    qpVar22.f24778e7.edit().putString("peerColors", qpVar22.f24878q4.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 24:
                qp qpVar22 = this.f25303b;
                qpVar22.f24801h2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    qpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    qpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    qpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    qpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i12 = 0; i12 < 3; i12++) {
                        qpVar22.P3(i12, 2);
                    }
                    yr messagesStorage3 = qpVar22.getMessagesStorage();
                    yr messagesStorage4 = qpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i13 = messagesStorage4.f26735w;
                    yr messagesStorage5 = qpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i14 = messagesStorage5.f26733r;
                    yr messagesStorage6 = qpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i15 = messagesStorage6.f26732n;
                    yr messagesStorage7 = qpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i13, i14, i15, messagesStorage7.f26734s);
                    return;
                } else if (tL_error.code != 401) {
                    qpVar22.f24801h2 = true;
                    qpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new rj(qpVar22, 24));
                    return;
                } else {
                    return;
                }
            case 25:
                final qp qpVar23 = this.f25303b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z92;
                        boolean z102;
                        boolean z112;
                        Set set;
                        int i102 = r3;
                        qp qpVar52 = qpVar23;
                        boolean z12 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z92 = true;
                                    } else {
                                        z92 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z92);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z12 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                qpVar52.f24896s2 = false;
                                SharedPreferences.Editor edit22 = qpVar52.f24768d7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.f24893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                qpVar52.f24886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z102 = true;
                                    } else {
                                        z102 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z102);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z112 = true;
                                    } else {
                                        z112 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z112);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.f24886r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.f24847m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.f24839l8 = System.currentTimeMillis();
                                }
                                qpVar52.f24822j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.f24847m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.f24778e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList42 = qpVar52.f24831k8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i112 = 0;
                                    while (i112 < size) {
                                        Object obj = arrayList42.get(i112);
                                        i112++;
                                        ((c20) obj).a(qpVar52.f24847m8);
                                    }
                                    qpVar52.f24831k8.clear();
                                    qpVar52.f24831k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i122 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar23;
                                        if (i122 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i122);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    if (j102 != 0) {
                                                        j32 = -j102;
                                                    } else {
                                                        j32 = -peer.channel_id;
                                                    }
                                                }
                                                long j11 = j32;
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i122++;
                                        } else {
                                            qpVar62.getUserConfig().f24502x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
            default:
                final qp qpVar24 = this.f25303b;
                qpVar24.getClass();
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z92;
                        boolean z102;
                        boolean z112;
                        Set set;
                        int i102 = r3;
                        qp qpVar52 = qpVar24;
                        boolean z12 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z92 = true;
                                    } else {
                                        z92 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z92);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z12 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                qpVar52.f24896s2 = false;
                                SharedPreferences.Editor edit22 = qpVar52.f24768d7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.f24893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                qpVar52.f24886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.f24768d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z102 = true;
                                    } else {
                                        z102 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z102);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z112 = true;
                                    } else {
                                        z112 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z112);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    qpVar52.getNotificationsController().f22098g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.f24886r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.f24847m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.f24839l8 = System.currentTimeMillis();
                                }
                                qpVar52.f24822j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.f24847m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.f24778e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList42 = qpVar52.f24831k8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i112 = 0;
                                    while (i112 < size) {
                                        Object obj = arrayList42.get(i112);
                                        i112++;
                                        ((c20) obj).a(qpVar52.f24847m8);
                                    }
                                    qpVar52.f24831k8.clear();
                                    qpVar52.f24831k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i122 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar24;
                                        if (i122 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i122);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    if (j102 != 0) {
                                                        j32 = -j102;
                                                    } else {
                                                        j32 = -peer.channel_id;
                                                    }
                                                }
                                                long j11 = j32;
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i122++;
                                        } else {
                                            qpVar62.getUserConfig().f24502x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
        }
    }
}
