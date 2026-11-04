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
public final class ij implements RequestDelegate {
    public final int f23542a;
    public final hp f23543b;

    public ij(hp hpVar, int i3) {
        this.f23542a = i3;
        this.f23543b = hpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23542a) {
            case 0:
                hp hpVar = this.f23543b;
                ConcurrentHashMap concurrentHashMap = hpVar.Q;
                ConcurrentHashMap concurrentHashMap2 = hpVar.P;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < tL_messages_peerDialogs.dialogs.size(); i3++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i3);
                        m5.x(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.f27005id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.f27005id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
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
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.f27005id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.f27005id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
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
                        hpVar.N3(arrayList, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.f23543b.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                hp hpVar2 = this.f23543b;
                hpVar2.getClass();
                if (tLObject != null) {
                    hpVar2.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 3:
                hp hpVar3 = this.f23543b;
                hpVar3.F2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    hpVar3.G2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    hpVar3.G2 = tL_help_termsOfServiceUpdate.expires;
                    g0.h3(new yh(14, hpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    hpVar3.G2 = hpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                hpVar3.f22989d7.edit().putInt("nextTosCheckTime", hpVar3.G2).commit();
                return;
            case 4:
                if (tL_error == null) {
                    final hp hpVar4 = this.f23543b;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            Set set;
                            int i10 = r3;
                            hp hpVar5 = hpVar4;
                            boolean z13 = true;
                            TLObject tLObject2 = tLObject;
                            switch (i10) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = hpVar5.f22989d7.edit();
                                        if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        edit.putBoolean("EnableReactionsMessages", z10);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                        if (reactionNotificationsFrom != null) {
                                            edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                            z13 = false;
                                        }
                                        edit.putBoolean("EnableReactionsStories", z13);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                        if (reactionNotificationsFrom2 != null) {
                                            edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                        hpVar5.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        hpVar5.getNotificationCenter().k(42, new Object[0]);
                                        return;
                                    }
                                    return;
                                case 1:
                                    hpVar5.U0 = false;
                                    ArrayList arrayList2 = hpVar5.W0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    hpVar5.getNotificationCenter().k(186, new Object[0]);
                                    return;
                                case 2:
                                    hpVar5.f23124t2 = false;
                                    SharedPreferences.Editor edit2 = hpVar5.f22989d7.edit();
                                    edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit2.commit();
                                    hpVar5.getUserConfig().U = true;
                                    hpVar5.getUserConfig().v(false);
                                    return;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    hpVar5.Y3(tL_help_recentMeUrls.users, false);
                                    hpVar5.S3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = hpVar5.f23113s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    hpVar5.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                case 4:
                                    hpVar5.f23116s2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit3 = hpVar5.f22989d7.edit();
                                        if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        edit3.putBoolean("EnableReactionsMessages", z11);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                        if (reactionNotificationsFrom3 != null) {
                                            edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        edit3.putBoolean("EnableReactionsStories", z12);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                        if (reactionNotificationsFrom4 != null) {
                                            edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                        hpVar5.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                        edit3.apply();
                                    }
                                    if (hpVar5.f23116s2 == 0) {
                                        hpVar5.getUserConfig().T = true;
                                        hpVar5.getUserConfig().v(false);
                                        return;
                                    }
                                    return;
                                case 5:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        hpVar5.f23067m8 = (TL_account.contentSettings) tLObject2;
                                        hpVar5.f23060l8 = System.currentTimeMillis();
                                    }
                                    hpVar5.f23043j8 = false;
                                    TL_account.contentSettings contentsettings = hpVar5.f23067m8;
                                    if (contentsettings != null && (set = hpVar5.C4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = hpVar5.f22999e7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", hpVar5.C4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = hpVar5.f23051k8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i11 = 0;
                                        while (i11 < size) {
                                            Object obj = arrayList4.get(i11);
                                            i11++;
                                            ((u10) obj).a(hpVar5.f23067m8);
                                        }
                                        hpVar5.f23051k8.clear();
                                        hpVar5.f23051k8 = null;
                                    }
                                    hpVar5.getNotificationCenter().k(243, new Object[0]);
                                    return;
                                default:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i12 = 0;
                                        while (true) {
                                            hp hpVar6 = hpVar4;
                                            if (i12 < size2) {
                                                TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                                if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                    TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                    long j10 = peer.user_id;
                                                    if (j10 == 0) {
                                                        long j11 = peer.chat_id;
                                                        if (j11 != 0) {
                                                            j10 = -j11;
                                                        } else {
                                                            j10 = -peer.channel_id;
                                                        }
                                                    }
                                                    long j12 = j10;
                                                    hpVar6.getMessagesStorage().F1(j12, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar6.R.f(j12);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            hpVar6.r2(j12, 0L, null);
                                                        }
                                                    }
                                                }
                                                i12++;
                                            } else {
                                                hpVar6.getUserConfig().f22858x = true;
                                                hpVar6.getUserConfig().v(false);
                                                hpVar6.getNotificationCenter().k(2, 256);
                                                hpVar6.f22994e2 = false;
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
                    this.f23543b.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 6:
                final hp hpVar5 = this.f23543b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i10 = r3;
                        hp hpVar52 = hpVar5;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    hpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                hpVar52.U0 = false;
                                ArrayList arrayList2 = hpVar52.W0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                hpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                hpVar52.f23124t2 = false;
                                SharedPreferences.Editor edit2 = hpVar52.f22989d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                hpVar52.getUserConfig().U = true;
                                hpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                hpVar52.Y3(tL_help_recentMeUrls.users, false);
                                hpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = hpVar52.f23113s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                hpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                hpVar52.f23116s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (hpVar52.f23116s2 == 0) {
                                    hpVar52.getUserConfig().T = true;
                                    hpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    hpVar52.f23067m8 = (TL_account.contentSettings) tLObject2;
                                    hpVar52.f23060l8 = System.currentTimeMillis();
                                }
                                hpVar52.f23043j8 = false;
                                TL_account.contentSettings contentsettings = hpVar52.f23067m8;
                                if (contentsettings != null && (set = hpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = hpVar52.f22999e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", hpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = hpVar52.f23051k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((u10) obj).a(hpVar52.f23067m8);
                                    }
                                    hpVar52.f23051k8.clear();
                                    hpVar52.f23051k8 = null;
                                }
                                hpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        hp hpVar6 = hpVar5;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j10 = peer.user_id;
                                                if (j10 == 0) {
                                                    long j11 = peer.chat_id;
                                                    if (j11 != 0) {
                                                        j10 = -j11;
                                                    } else {
                                                        j10 = -peer.channel_id;
                                                    }
                                                }
                                                long j12 = j10;
                                                hpVar6.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar6.R.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        hpVar6.r2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            hpVar6.getUserConfig().f22858x = true;
                                            hpVar6.getUserConfig().v(false);
                                            hpVar6.getNotificationCenter().k(2, 256);
                                            hpVar6.f22994e2 = false;
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
                hp hpVar6 = this.f23543b;
                hpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        if (arrayList2.get(i10) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i10));
                        }
                    }
                    hpVar6.getMessagesController().Y3(arrayList3, false);
                    return;
                }
                return;
            case 8:
                hp hpVar7 = this.f23543b;
                hpVar7.getClass();
                if (tLObject != null) {
                    hpVar7.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 9:
                hp hpVar8 = this.f23543b;
                if (tL_error == null) {
                    hpVar8.getClass();
                    hpVar8.K2 = System.currentTimeMillis();
                    hpVar8.N2 = false;
                    hpVar8.M2 = 0;
                } else {
                    long j10 = hpVar8.K2;
                    if (j10 != 0) {
                        hpVar8.K2 = j10 + 5000;
                    }
                }
                hpVar8.L2 = 0;
                return;
            case 10:
                hp hpVar9 = this.f23543b;
                if (tL_error == null) {
                    hpVar9.N2 = true;
                } else {
                    long j11 = hpVar9.K2;
                    if (j11 != 0) {
                        hpVar9.K2 = j11 + 5000;
                    }
                }
                hpVar9.L2 = 0;
                return;
            case 11:
                final hp hpVar10 = this.f23543b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i102 = r3;
                        hp hpVar52 = hpVar10;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    hpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                hpVar52.U0 = false;
                                ArrayList arrayList22 = hpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                hpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                hpVar52.f23124t2 = false;
                                SharedPreferences.Editor edit2 = hpVar52.f22989d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                hpVar52.getUserConfig().U = true;
                                hpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                hpVar52.Y3(tL_help_recentMeUrls.users, false);
                                hpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = hpVar52.f23113s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                hpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                hpVar52.f23116s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (hpVar52.f23116s2 == 0) {
                                    hpVar52.getUserConfig().T = true;
                                    hpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    hpVar52.f23067m8 = (TL_account.contentSettings) tLObject2;
                                    hpVar52.f23060l8 = System.currentTimeMillis();
                                }
                                hpVar52.f23043j8 = false;
                                TL_account.contentSettings contentsettings = hpVar52.f23067m8;
                                if (contentsettings != null && (set = hpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = hpVar52.f22999e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", hpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = hpVar52.f23051k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((u10) obj).a(hpVar52.f23067m8);
                                    }
                                    hpVar52.f23051k8.clear();
                                    hpVar52.f23051k8 = null;
                                }
                                hpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        hp hpVar62 = hpVar10;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    if (j112 != 0) {
                                                        j102 = -j112;
                                                    } else {
                                                        j102 = -peer.channel_id;
                                                    }
                                                }
                                                long j12 = j102;
                                                hpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar62.R.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        hpVar62.r2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            hpVar62.getUserConfig().f22858x = true;
                                            hpVar62.getUserConfig().v(false);
                                            hpVar62.getNotificationCenter().k(2, 256);
                                            hpVar62.f22994e2 = false;
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
                hp hpVar11 = this.f23543b;
                hpVar11.getClass();
                if (tLObject != null) {
                    hpVar11.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new mj(hpVar11, 24));
                    return;
                }
                return;
            case 13:
                if (tLObject != null) {
                    hp hpVar12 = this.f23543b;
                    hpVar12.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new mj(hpVar12, 28));
                    return;
                }
                return;
            case 14:
                hp hpVar13 = this.f23543b;
                hpVar13.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    hpVar13.M3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            case 15:
                final hp hpVar14 = this.f23543b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i102 = r3;
                        hp hpVar52 = hpVar14;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    hpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                hpVar52.U0 = false;
                                ArrayList arrayList22 = hpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                hpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                hpVar52.f23124t2 = false;
                                SharedPreferences.Editor edit2 = hpVar52.f22989d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                hpVar52.getUserConfig().U = true;
                                hpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                hpVar52.Y3(tL_help_recentMeUrls.users, false);
                                hpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = hpVar52.f23113s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                hpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                hpVar52.f23116s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (hpVar52.f23116s2 == 0) {
                                    hpVar52.getUserConfig().T = true;
                                    hpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    hpVar52.f23067m8 = (TL_account.contentSettings) tLObject2;
                                    hpVar52.f23060l8 = System.currentTimeMillis();
                                }
                                hpVar52.f23043j8 = false;
                                TL_account.contentSettings contentsettings = hpVar52.f23067m8;
                                if (contentsettings != null && (set = hpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = hpVar52.f22999e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", hpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = hpVar52.f23051k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((u10) obj).a(hpVar52.f23067m8);
                                    }
                                    hpVar52.f23051k8.clear();
                                    hpVar52.f23051k8 = null;
                                }
                                hpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        hp hpVar62 = hpVar14;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    if (j112 != 0) {
                                                        j102 = -j112;
                                                    } else {
                                                        j102 = -peer.channel_id;
                                                    }
                                                }
                                                long j12 = j102;
                                                hpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar62.R.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        hpVar62.r2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            hpVar62.getUserConfig().f22858x = true;
                                            hpVar62.getUserConfig().v(false);
                                            hpVar62.getNotificationCenter().k(2, 256);
                                            hpVar62.f22994e2 = false;
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
                hp hpVar15 = this.f23543b;
                hpVar15.getClass();
                if (tLObject != null) {
                    hpVar15.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new mj(hpVar15, 27));
                    return;
                }
                return;
            case 17:
                final hp hpVar16 = this.f23543b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i102 = r3;
                        hp hpVar52 = hpVar16;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit.putBoolean("EnableReactionsMessages", z10);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    hpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                hpVar52.U0 = false;
                                ArrayList arrayList22 = hpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                hpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                hpVar52.f23124t2 = false;
                                SharedPreferences.Editor edit2 = hpVar52.f22989d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                hpVar52.getUserConfig().U = true;
                                hpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                hpVar52.Y3(tL_help_recentMeUrls.users, false);
                                hpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = hpVar52.f23113s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                hpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                hpVar52.f23116s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (hpVar52.f23116s2 == 0) {
                                    hpVar52.getUserConfig().T = true;
                                    hpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    hpVar52.f23067m8 = (TL_account.contentSettings) tLObject2;
                                    hpVar52.f23060l8 = System.currentTimeMillis();
                                }
                                hpVar52.f23043j8 = false;
                                TL_account.contentSettings contentsettings = hpVar52.f23067m8;
                                if (contentsettings != null && (set = hpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = hpVar52.f22999e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", hpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = hpVar52.f23051k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList4.get(i11);
                                        i11++;
                                        ((u10) obj).a(hpVar52.f23067m8);
                                    }
                                    hpVar52.f23051k8.clear();
                                    hpVar52.f23051k8 = null;
                                }
                                hpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        hp hpVar62 = hpVar16;
                                        if (i12 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i12);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    if (j112 != 0) {
                                                        j102 = -j112;
                                                    } else {
                                                        j102 = -peer.channel_id;
                                                    }
                                                }
                                                long j12 = j102;
                                                hpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar62.R.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        hpVar62.r2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            hpVar62.getUserConfig().f22858x = true;
                                            hpVar62.getUserConfig().v(false);
                                            hpVar62.getNotificationCenter().k(2, 256);
                                            hpVar62.f22994e2 = false;
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
                boolean z10 = tLObject instanceof Vector;
                hp hpVar17 = this.f23543b;
                if (z10) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i11));
                    }
                    qr messagesStorage = hpVar17.getMessagesStorage();
                    messagesStorage.f24934a.c(new dg(messagesStorage, arrayList4, new in(hpVar17, 10), 22));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = hpVar17.A7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = hpVar17.f22999e7.edit();
                        hpVar17.A7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        g0.h3(new in(hpVar17, 11));
                    }
                    qr messagesStorage2 = hpVar17.getMessagesStorage();
                    messagesStorage2.f24934a.c(new dg(messagesStorage2, tL_messages_dialogFilters.filters, new in(hpVar17, 12), 22));
                    return;
                } else {
                    g0.h3(new in(hpVar17, 13));
                    return;
                }
            case 19:
                if (tL_error == null) {
                    hp hpVar18 = this.f23543b;
                    TLRPC.User a22 = hpVar18.a2(Long.valueOf(hpVar18.getUserConfig().e()));
                    if (a22 == null) {
                        a22 = hpVar18.getUserConfig().f();
                        hpVar18.X3(a22, true, false);
                    } else {
                        hpVar18.getUserConfig().w(a22);
                    }
                    if (a22 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w10 = w7.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        a22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f27025id;
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_small = w10.location;
                        }
                        if (w11 != null) {
                            tL_userProfilePhoto.photo_big = w11.location;
                        }
                        hpVar18.U0(a22.f27150id).f();
                        hpVar18.U0(a22.f27150id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(a22);
                        hpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        g0.h3(new mj(hpVar18, 0));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                this.f23543b.getConnectionsManager().cleanup(false);
                g0.h3(new a(tLObject, 22));
                return;
            case 21:
                hp hpVar19 = this.f23543b;
                hpVar19.getClass();
                if (tL_error == null) {
                    hpVar19.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final hp hpVar20 = this.f23543b;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    hp hpVar21 = hpVar20;
                                    hpVar21.f22981c8 = false;
                                    hpVar21.f23109r4 = xo.c(1, tL_help_peerColors);
                                    hpVar21.f22999e7.edit().putString("profilePeerColors", hpVar21.f23109r4.toString()).apply();
                                    return;
                                default:
                                    hp hpVar22 = hpVar20;
                                    hpVar22.f22972b8 = false;
                                    hpVar22.f23099q4 = xo.c(0, tL_help_peerColors);
                                    hpVar22.f22999e7.edit().putString("peerColors", hpVar22.f23099q4.toString()).apply();
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
                    final hp hpVar21 = this.f23543b;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    hp hpVar212 = hpVar21;
                                    hpVar212.f22981c8 = false;
                                    hpVar212.f23109r4 = xo.c(1, tL_help_peerColors2);
                                    hpVar212.f22999e7.edit().putString("profilePeerColors", hpVar212.f23109r4.toString()).apply();
                                    return;
                                default:
                                    hp hpVar22 = hpVar21;
                                    hpVar22.f22972b8 = false;
                                    hpVar22.f23099q4 = xo.c(0, tL_help_peerColors2);
                                    hpVar22.f22999e7.edit().putString("peerColors", hpVar22.f23099q4.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 24:
                hp hpVar22 = this.f23543b;
                hpVar22.f23029i2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    hpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    hpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    hpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    hpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i12 = 0; i12 < 3; i12++) {
                        hpVar22.P3(i12, 2);
                    }
                    qr messagesStorage3 = hpVar22.getMessagesStorage();
                    qr messagesStorage4 = hpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i13 = messagesStorage4.f24947w;
                    qr messagesStorage5 = hpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i14 = messagesStorage5.f24945r;
                    qr messagesStorage6 = hpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i15 = messagesStorage6.f24944n;
                    qr messagesStorage7 = hpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i13, i14, i15, messagesStorage7.f24946s);
                    return;
                } else if (tL_error.code != 401) {
                    hpVar22.f23029i2 = true;
                    hpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new ij(hpVar22, 24));
                    return;
                } else {
                    return;
                }
            case 25:
                final hp hpVar23 = this.f23543b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i102 = r3;
                        hp hpVar52 = hpVar23;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z102 = true;
                                    } else {
                                        z102 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z102);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    hpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                hpVar52.U0 = false;
                                ArrayList arrayList22 = hpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                hpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                hpVar52.f23124t2 = false;
                                SharedPreferences.Editor edit22 = hpVar52.f22989d7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                hpVar52.getUserConfig().U = true;
                                hpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                hpVar52.Y3(tL_help_recentMeUrls.users, false);
                                hpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = hpVar52.f23113s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                hpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                hpVar52.f23116s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z112 = true;
                                    } else {
                                        z112 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z112);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z122 = true;
                                    } else {
                                        z122 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z122);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (hpVar52.f23116s2 == 0) {
                                    hpVar52.getUserConfig().T = true;
                                    hpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    hpVar52.f23067m8 = (TL_account.contentSettings) tLObject2;
                                    hpVar52.f23060l8 = System.currentTimeMillis();
                                }
                                hpVar52.f23043j8 = false;
                                TL_account.contentSettings contentsettings = hpVar52.f23067m8;
                                if (contentsettings != null && (set = hpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = hpVar52.f22999e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", hpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList42 = hpVar52.f23051k8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i112 = 0;
                                    while (i112 < size) {
                                        Object obj = arrayList42.get(i112);
                                        i112++;
                                        ((u10) obj).a(hpVar52.f23067m8);
                                    }
                                    hpVar52.f23051k8.clear();
                                    hpVar52.f23051k8 = null;
                                }
                                hpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i122 = 0;
                                    while (true) {
                                        hp hpVar62 = hpVar23;
                                        if (i122 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i122);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    if (j112 != 0) {
                                                        j102 = -j112;
                                                    } else {
                                                        j102 = -peer.channel_id;
                                                    }
                                                }
                                                long j12 = j102;
                                                hpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar62.R.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        hpVar62.r2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i122++;
                                        } else {
                                            hpVar62.getUserConfig().f22858x = true;
                                            hpVar62.getUserConfig().v(false);
                                            hpVar62.getNotificationCenter().k(2, 256);
                                            hpVar62.f22994e2 = false;
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
                final hp hpVar24 = this.f23543b;
                hpVar24.getClass();
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i102 = r3;
                        hp hpVar52 = hpVar24;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z102 = true;
                                    } else {
                                        z102 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z102);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    hpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                hpVar52.U0 = false;
                                ArrayList arrayList22 = hpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                hpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                hpVar52.f23124t2 = false;
                                SharedPreferences.Editor edit22 = hpVar52.f22989d7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                hpVar52.getUserConfig().U = true;
                                hpVar52.getUserConfig().v(false);
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                hpVar52.Y3(tL_help_recentMeUrls.users, false);
                                hpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = hpVar52.f23113s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                hpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                hpVar52.f23116s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = hpVar52.f22989d7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z112 = true;
                                    } else {
                                        z112 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsMessages", z112);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z122 = true;
                                    } else {
                                        z122 = false;
                                    }
                                    edit3.putBoolean("EnableReactionsStories", z122);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    hpVar52.getNotificationsController().f25767h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (hpVar52.f23116s2 == 0) {
                                    hpVar52.getUserConfig().T = true;
                                    hpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    hpVar52.f23067m8 = (TL_account.contentSettings) tLObject2;
                                    hpVar52.f23060l8 = System.currentTimeMillis();
                                }
                                hpVar52.f23043j8 = false;
                                TL_account.contentSettings contentsettings = hpVar52.f23067m8;
                                if (contentsettings != null && (set = hpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = hpVar52.f22999e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", hpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList42 = hpVar52.f23051k8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i112 = 0;
                                    while (i112 < size) {
                                        Object obj = arrayList42.get(i112);
                                        i112++;
                                        ((u10) obj).a(hpVar52.f23067m8);
                                    }
                                    hpVar52.f23051k8.clear();
                                    hpVar52.f23051k8 = null;
                                }
                                hpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i122 = 0;
                                    while (true) {
                                        hp hpVar62 = hpVar24;
                                        if (i122 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i122);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    if (j112 != 0) {
                                                        j102 = -j112;
                                                    } else {
                                                        j102 = -peer.channel_id;
                                                    }
                                                }
                                                long j12 = j102;
                                                hpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar62.R.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        hpVar62.r2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i122++;
                                        } else {
                                            hpVar62.getUserConfig().f22858x = true;
                                            hpVar62.getUserConfig().v(false);
                                            hpVar62.getNotificationCenter().k(2, 256);
                                            hpVar62.f22994e2 = false;
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
