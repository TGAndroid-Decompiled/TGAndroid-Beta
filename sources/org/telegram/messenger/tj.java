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
public final class tj implements RequestDelegate {
    public final int f18066a;
    public final vp f18067b;

    public tj(vp vpVar, int i10) {
        this.f18066a = i10;
        this.f18067b = vpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18066a) {
            case 0:
                vp vpVar = this.f18067b;
                ConcurrentHashMap concurrentHashMap = vpVar.P;
                ConcurrentHashMap concurrentHashMap2 = vpVar.O;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_messages_peerDialogs.dialogs.size(); i10++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i10);
                        o5.x(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.f19797id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.f19797id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
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
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.f19797id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.f19797id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
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
                        vpVar.K3(arrayList, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.f18067b.J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                vp vpVar2 = this.f18067b;
                vpVar2.getClass();
                if (tLObject != null) {
                    vpVar2.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 3:
                vp vpVar3 = this.f18067b;
                vpVar3.E2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    vpVar3.F2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    vpVar3.F2 = tL_help_termsOfServiceUpdate.expires;
                    i0.g3(new oi(14, vpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    vpVar3.F2 = vpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                vpVar3.e7.edit().putInt("nextTosCheckTime", vpVar3.F2).commit();
                return;
            case 4:
                if (tL_error == null) {
                    final vp vpVar4 = this.f18067b;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            Set set;
                            int i11 = r3;
                            boolean z13 = true;
                            vp vpVar5 = vpVar4;
                            TLObject tLObject2 = tLObject;
                            switch (i11) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = vpVar5.e7.edit();
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
                                        vpVar5.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        vpVar5.getNotificationCenter().k(42, new Object[0]);
                                        return;
                                    }
                                    return;
                                case 1:
                                    vpVar5.T0 = false;
                                    ArrayList arrayList2 = vpVar5.V0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    vpVar5.getNotificationCenter().k(186, new Object[0]);
                                    return;
                                case 2:
                                    vpVar5.f18886r2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit2 = vpVar5.e7.edit();
                                        if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        edit2.putBoolean("EnableReactionsMessages", z11);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                        if (reactionNotificationsFrom3 != null) {
                                            edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        edit2.putBoolean("EnableReactionsStories", z12);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                        if (reactionNotificationsFrom4 != null) {
                                            edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                        vpVar5.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                        edit2.apply();
                                    }
                                    if (vpVar5.f18886r2 == 0) {
                                        vpVar5.getUserConfig().S = true;
                                        vpVar5.getUserConfig().v(false);
                                        return;
                                    }
                                    return;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    vpVar5.V3(tL_help_recentMeUrls.users, false);
                                    vpVar5.P3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = vpVar5.f18893s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    vpVar5.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                case 4:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        vpVar5.f18857n8 = (TL_account.contentSettings) tLObject2;
                                        vpVar5.f18847m8 = System.currentTimeMillis();
                                    }
                                    vpVar5.f18832k8 = false;
                                    TL_account.contentSettings contentsettings = vpVar5.f18857n8;
                                    if (contentsettings != null && (set = vpVar5.D4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = vpVar5.f7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar5.D4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = vpVar5.f18839l8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = arrayList4.get(i12);
                                            i12++;
                                            ((q20) obj).a(vpVar5.f18857n8);
                                        }
                                        vpVar5.f18839l8.clear();
                                        vpVar5.f18839l8 = null;
                                    }
                                    vpVar5.getNotificationCenter().k(243, new Object[0]);
                                    return;
                                case 5:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i13 = 0;
                                        while (true) {
                                            vp vpVar6 = vpVar4;
                                            if (i13 < size2) {
                                                TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i13);
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
                                                    vpVar6.getMessagesStorage().F1(j12, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar6.Q.f(j12);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            vpVar6.q2(j12, 0L, null);
                                                        }
                                                    }
                                                }
                                                i13++;
                                            } else {
                                                vpVar6.getUserConfig().f15174x = true;
                                                vpVar6.getUserConfig().v(false);
                                                vpVar6.getNotificationCenter().k(2, 256);
                                                vpVar6.f18764d2 = false;
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                    break;
                                default:
                                    vpVar5.f18896s2 = false;
                                    SharedPreferences.Editor edit3 = vpVar5.e7.edit();
                                    edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit3.commit();
                                    vpVar5.getUserConfig().T = true;
                                    vpVar5.getUserConfig().v(false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.f18067b.J3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 6:
                final vp vpVar5 = this.f18067b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i11 = r3;
                        boolean z13 = true;
                        vp vpVar52 = vpVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i11) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList2 = vpVar52.V0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                vpVar52.f18886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.f18886r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = vpVar52.f18893s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.f18857n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.f18847m8 = System.currentTimeMillis();
                                }
                                vpVar52.f18832k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.f18857n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.f18839l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((q20) obj).a(vpVar52.f18857n8);
                                    }
                                    vpVar52.f18839l8.clear();
                                    vpVar52.f18839l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        vp vpVar6 = vpVar5;
                                        if (i13 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i13);
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
                                                vpVar6.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar6.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar6.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            vpVar6.getUserConfig().f15174x = true;
                                            vpVar6.getUserConfig().v(false);
                                            vpVar6.getNotificationCenter().k(2, 256);
                                            vpVar6.f18764d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                vpVar52.f18896s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 7:
                vp vpVar6 = this.f18067b;
                vpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        if (arrayList2.get(i11) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i11));
                        }
                    }
                    vpVar6.getMessagesController().V3(arrayList3, false);
                    return;
                }
                return;
            case 8:
                vp vpVar7 = this.f18067b;
                vpVar7.getClass();
                if (tLObject != null) {
                    vpVar7.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 9:
                vp vpVar8 = this.f18067b;
                if (tL_error == null) {
                    vpVar8.getClass();
                    vpVar8.J2 = System.currentTimeMillis();
                    vpVar8.M2 = false;
                    vpVar8.L2 = 0;
                } else {
                    long j10 = vpVar8.J2;
                    if (j10 != 0) {
                        vpVar8.J2 = j10 + 5000;
                    }
                }
                vpVar8.K2 = 0;
                return;
            case 10:
                vp vpVar9 = this.f18067b;
                if (tL_error == null) {
                    vpVar9.M2 = true;
                } else {
                    long j11 = vpVar9.J2;
                    if (j11 != 0) {
                        vpVar9.J2 = j11 + 5000;
                    }
                }
                vpVar9.K2 = 0;
                return;
            case 11:
                final vp vpVar10 = this.f18067b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        vp vpVar52 = vpVar10;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                vpVar52.f18886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.f18886r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.f18893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.f18857n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.f18847m8 = System.currentTimeMillis();
                                }
                                vpVar52.f18832k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.f18857n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.f18839l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((q20) obj).a(vpVar52.f18857n8);
                                    }
                                    vpVar52.f18839l8.clear();
                                    vpVar52.f18839l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar10;
                                        if (i13 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i13);
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
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            vpVar62.getUserConfig().f15174x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.f18764d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                vpVar52.f18896s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 12:
                vp vpVar11 = this.f18067b;
                vpVar11.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar11.J3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            case 13:
                vp vpVar12 = this.f18067b;
                vpVar12.getClass();
                if (tLObject != null) {
                    vpVar12.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new zj(vpVar12, 23));
                    return;
                }
                return;
            case 14:
                if (tLObject != null) {
                    vp vpVar13 = this.f18067b;
                    vpVar13.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new zj(vpVar13, 28));
                    return;
                }
                return;
            case 15:
                final vp vpVar14 = this.f18067b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        vp vpVar52 = vpVar14;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                vpVar52.f18886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.f18886r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.f18893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.f18857n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.f18847m8 = System.currentTimeMillis();
                                }
                                vpVar52.f18832k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.f18857n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.f18839l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((q20) obj).a(vpVar52.f18857n8);
                                    }
                                    vpVar52.f18839l8.clear();
                                    vpVar52.f18839l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar14;
                                        if (i13 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i13);
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
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            vpVar62.getUserConfig().f15174x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.f18764d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                vpVar52.f18896s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 16:
                vp vpVar15 = this.f18067b;
                vpVar15.getClass();
                if (tLObject != null) {
                    vpVar15.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new zj(vpVar15, 27));
                    return;
                }
                return;
            case 17:
                final vp vpVar16 = this.f18067b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        vp vpVar52 = vpVar16;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                vpVar52.f18886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z11);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsStories", z12);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.f18886r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.f18893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.f18857n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.f18847m8 = System.currentTimeMillis();
                                }
                                vpVar52.f18832k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.f18857n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.f18839l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((q20) obj).a(vpVar52.f18857n8);
                                    }
                                    vpVar52.f18839l8.clear();
                                    vpVar52.f18839l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar16;
                                        if (i13 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i13);
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
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            vpVar62.getUserConfig().f15174x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.f18764d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                vpVar52.f18896s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 18:
                boolean z10 = tLObject instanceof Vector;
                vp vpVar17 = this.f18067b;
                if (z10) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i12));
                    }
                    hs messagesStorage = vpVar17.getMessagesStorage();
                    messagesStorage.f15938a.c(new kg(messagesStorage, arrayList4, new eo(vpVar17, 10), 22));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = vpVar17.B7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = vpVar17.f7.edit();
                        vpVar17.B7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        i0.g3(new eo(vpVar17, 11));
                    }
                    hs messagesStorage2 = vpVar17.getMessagesStorage();
                    messagesStorage2.f15938a.c(new kg(messagesStorage2, tL_messages_dialogFilters.filters, new eo(vpVar17, 12), 22));
                    return;
                } else {
                    i0.g3(new eo(vpVar17, 13));
                    return;
                }
            case 19:
                if (tL_error == null) {
                    vp vpVar18 = this.f18067b;
                    TLRPC.User Z1 = vpVar18.Z1(Long.valueOf(vpVar18.getUserConfig().e()));
                    if (Z1 == null) {
                        Z1 = vpVar18.getUserConfig().f();
                        vpVar18.U3(Z1, true, false);
                    } else {
                        vpVar18.getUserConfig().w(Z1);
                    }
                    if (Z1 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w9 = b8.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w10 = b8.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        Z1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19817id;
                        if (w9 != null) {
                            tL_userProfilePhoto.photo_small = w9.location;
                        }
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_big = w10.location;
                        }
                        vpVar18.T0(Z1.f19942id).e();
                        vpVar18.T0(Z1.f19942id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(Z1);
                        vpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        i0.g3(new zj(vpVar18, 1));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                this.f18067b.getConnectionsManager().cleanup(false);
                i0.g3(new a(tLObject, 22));
                return;
            case 21:
                vp vpVar19 = this.f18067b;
                vpVar19.getClass();
                if (tL_error == null) {
                    vpVar19.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final vp vpVar20 = this.f18067b;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    vp vpVar21 = vpVar20;
                                    vpVar21.f18761c8 = false;
                                    vpVar21.f18888r4 = lp.c(0, tL_help_peerColors);
                                    vpVar21.f7.edit().putString("peerColors", vpVar21.f18888r4.toString()).apply();
                                    return;
                                default:
                                    vp vpVar22 = vpVar20;
                                    vpVar22.f18770d8 = false;
                                    vpVar22.f18898s4 = lp.c(1, tL_help_peerColors);
                                    vpVar22.f7.edit().putString("profilePeerColors", vpVar22.f18898s4.toString()).apply();
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
                    final vp vpVar21 = this.f18067b;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    vp vpVar212 = vpVar21;
                                    vpVar212.f18761c8 = false;
                                    vpVar212.f18888r4 = lp.c(0, tL_help_peerColors2);
                                    vpVar212.f7.edit().putString("peerColors", vpVar212.f18888r4.toString()).apply();
                                    return;
                                default:
                                    vp vpVar22 = vpVar21;
                                    vpVar22.f18770d8 = false;
                                    vpVar22.f18898s4 = lp.c(1, tL_help_peerColors2);
                                    vpVar22.f7.edit().putString("profilePeerColors", vpVar22.f18898s4.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 24:
                vp vpVar22 = this.f18067b;
                vpVar22.f18799h2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    vpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    vpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    vpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    vpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i13 = 0; i13 < 3; i13++) {
                        vpVar22.M3(i13, 2);
                    }
                    hs messagesStorage3 = vpVar22.getMessagesStorage();
                    hs messagesStorage4 = vpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i14 = messagesStorage4.f15949w;
                    hs messagesStorage5 = vpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i15 = messagesStorage5.f15947r;
                    hs messagesStorage6 = vpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i16 = messagesStorage6.f15946n;
                    hs messagesStorage7 = vpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i14, i15, i16, messagesStorage7.f15948s);
                    return;
                } else if (tL_error.code != 401) {
                    vpVar22.f18799h2 = true;
                    vpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new tj(vpVar22, 24));
                    return;
                } else {
                    return;
                }
            case 25:
                final vp vpVar23 = this.f18067b;
                vpVar23.getClass();
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        vp vpVar52 = vpVar23;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                vpVar52.f18886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = vpVar52.e7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z112 = true;
                                    } else {
                                        z112 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsMessages", z112);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z122 = true;
                                    } else {
                                        z122 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsStories", z122);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (vpVar52.f18886r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.f18893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.f18857n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.f18847m8 = System.currentTimeMillis();
                                }
                                vpVar52.f18832k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.f18857n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = vpVar52.f18839l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((q20) obj).a(vpVar52.f18857n8);
                                    }
                                    vpVar52.f18839l8.clear();
                                    vpVar52.f18839l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar23;
                                        if (i132 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i132);
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
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        } else {
                                            vpVar62.getUserConfig().f15174x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.f18764d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                vpVar52.f18896s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            default:
                final vp vpVar24 = this.f18067b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        vp vpVar52 = vpVar24;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                vpVar52.f18886r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = vpVar52.e7.edit();
                                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                                        z112 = true;
                                    } else {
                                        z112 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsMessages", z112);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                                        z122 = true;
                                    } else {
                                        z122 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsStories", z122);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().f17321g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (vpVar52.f18886r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.f18893s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.f18857n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.f18847m8 = System.currentTimeMillis();
                                }
                                vpVar52.f18832k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.f18857n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = vpVar52.f18839l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((q20) obj).a(vpVar52.f18857n8);
                                    }
                                    vpVar52.f18839l8.clear();
                                    vpVar52.f18839l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar24;
                                        if (i132 < size2) {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i132);
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
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        } else {
                                            vpVar62.getUserConfig().f15174x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.f18764d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                vpVar52.f18896s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
