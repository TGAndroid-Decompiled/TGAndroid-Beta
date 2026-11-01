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
public final class uj implements RequestDelegate {
    public final int f18435a;
    public final wp f18436b;

    public uj(wp wpVar, int i10) {
        this.f18435a = i10;
        this.f18436b = wpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18435a) {
            case 0:
                wp wpVar = this.f18436b;
                ConcurrentHashMap concurrentHashMap = wpVar.P;
                ConcurrentHashMap concurrentHashMap2 = wpVar.O;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_messages_peerDialogs.dialogs.size(); i10++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i10);
                        o5.x(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.f19798id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.f19798id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
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
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.f19798id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.f19798id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
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
                        wpVar.K3(arrayList, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.f18436b.J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                wp wpVar2 = this.f18436b;
                wpVar2.getClass();
                if (tLObject != null) {
                    wpVar2.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 3:
                wp wpVar3 = this.f18436b;
                wpVar3.E2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    wpVar3.F2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    wpVar3.F2 = tL_help_termsOfServiceUpdate.expires;
                    i0.g3(new pi(14, wpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    wpVar3.F2 = wpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                wpVar3.e7.edit().putInt("nextTosCheckTime", wpVar3.F2).commit();
                return;
            case 4:
                if (tL_error == null) {
                    final wp wpVar4 = this.f18436b;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            Set set;
                            int i11 = r3;
                            boolean z13 = true;
                            wp wpVar5 = wpVar4;
                            TLObject tLObject2 = tLObject;
                            switch (i11) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = wpVar5.e7.edit();
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
                                        wpVar5.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        wpVar5.getNotificationCenter().k(42, new Object[0]);
                                        return;
                                    }
                                    return;
                                case 1:
                                    wpVar5.T0 = false;
                                    ArrayList arrayList2 = wpVar5.V0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    wpVar5.getNotificationCenter().k(186, new Object[0]);
                                    return;
                                case 2:
                                    wpVar5.f19229r2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit2 = wpVar5.e7.edit();
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
                                        wpVar5.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                        edit2.apply();
                                    }
                                    if (wpVar5.f19229r2 == 0) {
                                        wpVar5.getUserConfig().S = true;
                                        wpVar5.getUserConfig().v(false);
                                        return;
                                    }
                                    return;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    wpVar5.V3(tL_help_recentMeUrls.users, false);
                                    wpVar5.P3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = wpVar5.f19236s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    wpVar5.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                case 4:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        wpVar5.f19200n8 = (TL_account.contentSettings) tLObject2;
                                        wpVar5.f19190m8 = System.currentTimeMillis();
                                    }
                                    wpVar5.f19175k8 = false;
                                    TL_account.contentSettings contentsettings = wpVar5.f19200n8;
                                    if (contentsettings != null && (set = wpVar5.D4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = wpVar5.f7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar5.D4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = wpVar5.f19182l8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = arrayList4.get(i12);
                                            i12++;
                                            ((r20) obj).a(wpVar5.f19200n8);
                                        }
                                        wpVar5.f19182l8.clear();
                                        wpVar5.f19182l8 = null;
                                    }
                                    wpVar5.getNotificationCenter().k(243, new Object[0]);
                                    return;
                                case 5:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i13 = 0;
                                        while (true) {
                                            wp wpVar6 = wpVar4;
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
                                                    wpVar6.getMessagesStorage().F1(j12, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar6.Q.f(j12);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            wpVar6.q2(j12, 0L, null);
                                                        }
                                                    }
                                                }
                                                i13++;
                                            } else {
                                                wpVar6.getUserConfig().f15533x = true;
                                                wpVar6.getUserConfig().v(false);
                                                wpVar6.getNotificationCenter().k(2, 256);
                                                wpVar6.f19107d2 = false;
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                    break;
                                default:
                                    wpVar5.f19239s2 = false;
                                    SharedPreferences.Editor edit3 = wpVar5.e7.edit();
                                    edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit3.commit();
                                    wpVar5.getUserConfig().T = true;
                                    wpVar5.getUserConfig().v(false);
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
                    this.f18436b.J3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 6:
                final wp wpVar5 = this.f18436b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i11 = r3;
                        boolean z13 = true;
                        wp wpVar52 = wpVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i11) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList2 = wpVar52.V0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                wpVar52.f19229r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.f19229r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = wpVar52.f19236s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.f19200n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.f19190m8 = System.currentTimeMillis();
                                }
                                wpVar52.f19175k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.f19200n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.f19182l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((r20) obj).a(wpVar52.f19200n8);
                                    }
                                    wpVar52.f19182l8.clear();
                                    wpVar52.f19182l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        wp wpVar6 = wpVar5;
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
                                                wpVar6.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar6.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar6.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            wpVar6.getUserConfig().f15533x = true;
                                            wpVar6.getUserConfig().v(false);
                                            wpVar6.getNotificationCenter().k(2, 256);
                                            wpVar6.f19107d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                wpVar52.f19239s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 7:
                wp wpVar6 = this.f18436b;
                wpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        if (arrayList2.get(i11) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i11));
                        }
                    }
                    wpVar6.getMessagesController().V3(arrayList3, false);
                    return;
                }
                return;
            case 8:
                wp wpVar7 = this.f18436b;
                wpVar7.getClass();
                if (tLObject != null) {
                    wpVar7.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 9:
                wp wpVar8 = this.f18436b;
                if (tL_error == null) {
                    wpVar8.getClass();
                    wpVar8.J2 = System.currentTimeMillis();
                    wpVar8.M2 = false;
                    wpVar8.L2 = 0;
                } else {
                    long j10 = wpVar8.J2;
                    if (j10 != 0) {
                        wpVar8.J2 = j10 + 5000;
                    }
                }
                wpVar8.K2 = 0;
                return;
            case 10:
                wp wpVar9 = this.f18436b;
                if (tL_error == null) {
                    wpVar9.M2 = true;
                } else {
                    long j11 = wpVar9.J2;
                    if (j11 != 0) {
                        wpVar9.J2 = j11 + 5000;
                    }
                }
                wpVar9.K2 = 0;
                return;
            case 11:
                final wp wpVar10 = this.f18436b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        wp wpVar52 = wpVar10;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                wpVar52.f19229r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.f19229r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.f19236s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.f19200n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.f19190m8 = System.currentTimeMillis();
                                }
                                wpVar52.f19175k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.f19200n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.f19182l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((r20) obj).a(wpVar52.f19200n8);
                                    }
                                    wpVar52.f19182l8.clear();
                                    wpVar52.f19182l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar10;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            wpVar62.getUserConfig().f15533x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.f19107d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                wpVar52.f19239s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 12:
                wp wpVar11 = this.f18436b;
                wpVar11.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar11.J3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            case 13:
                wp wpVar12 = this.f18436b;
                wpVar12.getClass();
                if (tLObject != null) {
                    wpVar12.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ak(wpVar12, 23));
                    return;
                }
                return;
            case 14:
                if (tLObject != null) {
                    wp wpVar13 = this.f18436b;
                    wpVar13.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ak(wpVar13, 28));
                    return;
                }
                return;
            case 15:
                final wp wpVar14 = this.f18436b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        wp wpVar52 = wpVar14;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                wpVar52.f19229r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.f19229r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.f19236s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.f19200n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.f19190m8 = System.currentTimeMillis();
                                }
                                wpVar52.f19175k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.f19200n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.f19182l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((r20) obj).a(wpVar52.f19200n8);
                                    }
                                    wpVar52.f19182l8.clear();
                                    wpVar52.f19182l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar14;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            wpVar62.getUserConfig().f15533x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.f19107d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                wpVar52.f19239s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 16:
                wp wpVar15 = this.f18436b;
                wpVar15.getClass();
                if (tLObject != null) {
                    wpVar15.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ak(wpVar15, 27));
                    return;
                }
                return;
            case 17:
                final wp wpVar16 = this.f18436b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        wp wpVar52 = wpVar16;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                wpVar52.f19229r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.f19229r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.f19236s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.f19200n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.f19190m8 = System.currentTimeMillis();
                                }
                                wpVar52.f19175k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.f19200n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.f19182l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((r20) obj).a(wpVar52.f19200n8);
                                    }
                                    wpVar52.f19182l8.clear();
                                    wpVar52.f19182l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar16;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        } else {
                                            wpVar62.getUserConfig().f15533x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.f19107d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                wpVar52.f19239s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            case 18:
                boolean z10 = tLObject instanceof Vector;
                wp wpVar17 = this.f18436b;
                if (z10) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i12));
                    }
                    is messagesStorage = wpVar17.getMessagesStorage();
                    messagesStorage.f16331a.c(new lg(messagesStorage, arrayList4, new fo(wpVar17, 10), 22));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = wpVar17.B7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = wpVar17.f7.edit();
                        wpVar17.B7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        i0.g3(new fo(wpVar17, 11));
                    }
                    is messagesStorage2 = wpVar17.getMessagesStorage();
                    messagesStorage2.f16331a.c(new lg(messagesStorage2, tL_messages_dialogFilters.filters, new fo(wpVar17, 12), 22));
                    return;
                } else {
                    i0.g3(new fo(wpVar17, 13));
                    return;
                }
            case 19:
                if (tL_error == null) {
                    wp wpVar18 = this.f18436b;
                    TLRPC.User Z1 = wpVar18.Z1(Long.valueOf(wpVar18.getUserConfig().e()));
                    if (Z1 == null) {
                        Z1 = wpVar18.getUserConfig().f();
                        wpVar18.U3(Z1, true, false);
                    } else {
                        wpVar18.getUserConfig().w(Z1);
                    }
                    if (Z1 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w9 = b8.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w10 = b8.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        Z1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f19818id;
                        if (w9 != null) {
                            tL_userProfilePhoto.photo_small = w9.location;
                        }
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_big = w10.location;
                        }
                        wpVar18.T0(Z1.f19943id).e();
                        wpVar18.T0(Z1.f19943id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(Z1);
                        wpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        i0.g3(new ak(wpVar18, 1));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                this.f18436b.getConnectionsManager().cleanup(false);
                i0.g3(new a(tLObject, 22));
                return;
            case 21:
                wp wpVar19 = this.f18436b;
                wpVar19.getClass();
                if (tL_error == null) {
                    wpVar19.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final wp wpVar20 = this.f18436b;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    wp wpVar21 = wpVar20;
                                    wpVar21.f19104c8 = false;
                                    wpVar21.f19231r4 = mp.c(0, tL_help_peerColors);
                                    wpVar21.f7.edit().putString("peerColors", wpVar21.f19231r4.toString()).apply();
                                    return;
                                default:
                                    wp wpVar22 = wpVar20;
                                    wpVar22.f19113d8 = false;
                                    wpVar22.f19241s4 = mp.c(1, tL_help_peerColors);
                                    wpVar22.f7.edit().putString("profilePeerColors", wpVar22.f19241s4.toString()).apply();
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
                    final wp wpVar21 = this.f18436b;
                    i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    wp wpVar212 = wpVar21;
                                    wpVar212.f19104c8 = false;
                                    wpVar212.f19231r4 = mp.c(0, tL_help_peerColors2);
                                    wpVar212.f7.edit().putString("peerColors", wpVar212.f19231r4.toString()).apply();
                                    return;
                                default:
                                    wp wpVar22 = wpVar21;
                                    wpVar22.f19113d8 = false;
                                    wpVar22.f19241s4 = mp.c(1, tL_help_peerColors2);
                                    wpVar22.f7.edit().putString("profilePeerColors", wpVar22.f19241s4.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 24:
                wp wpVar22 = this.f18436b;
                wpVar22.f19142h2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    wpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    wpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    wpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    wpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i13 = 0; i13 < 3; i13++) {
                        wpVar22.M3(i13, 2);
                    }
                    is messagesStorage3 = wpVar22.getMessagesStorage();
                    is messagesStorage4 = wpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i14 = messagesStorage4.f16342w;
                    is messagesStorage5 = wpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i15 = messagesStorage5.f16340r;
                    is messagesStorage6 = wpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i16 = messagesStorage6.f16339n;
                    is messagesStorage7 = wpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i14, i15, i16, messagesStorage7.f16341s);
                    return;
                } else if (tL_error.code != 401) {
                    wpVar22.f19142h2 = true;
                    wpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new uj(wpVar22, 24));
                    return;
                } else {
                    return;
                }
            case 25:
                final wp wpVar23 = this.f18436b;
                wpVar23.getClass();
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        wp wpVar52 = wpVar23;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                wpVar52.f19229r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (wpVar52.f19229r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.f19236s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.f19200n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.f19190m8 = System.currentTimeMillis();
                                }
                                wpVar52.f19175k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.f19200n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = wpVar52.f19182l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((r20) obj).a(wpVar52.f19200n8);
                                    }
                                    wpVar52.f19182l8.clear();
                                    wpVar52.f19182l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar23;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        } else {
                                            wpVar62.getUserConfig().f15533x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.f19107d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                wpVar52.f19239s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
            default:
                final wp wpVar24 = this.f18436b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i112 = r3;
                        boolean z13 = true;
                        wp wpVar52 = wpVar24;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(186, new Object[0]);
                                return;
                            case 2:
                                wpVar52.f19229r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().f17654g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (wpVar52.f19229r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.f19236s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.f19200n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.f19190m8 = System.currentTimeMillis();
                                }
                                wpVar52.f19175k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.f19200n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = wpVar52.f19182l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((r20) obj).a(wpVar52.f19200n8);
                                    }
                                    wpVar52.f19182l8.clear();
                                    wpVar52.f19182l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(243, new Object[0]);
                                return;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar24;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        } else {
                                            wpVar62.getUserConfig().f15533x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.f19107d2 = false;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                wpVar52.f19239s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
