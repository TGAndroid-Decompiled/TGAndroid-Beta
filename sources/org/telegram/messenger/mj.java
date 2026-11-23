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
public final class mj implements RequestDelegate {
    public final int f25670a;
    public final mp f25671b;

    public mj(mp mpVar, int i7) {
        this.f25670a = i7;
        this.f25671b = mpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25670a) {
            case 0:
                mp mpVar = this.f25671b;
                ConcurrentHashMap concurrentHashMap = mpVar.Q;
                ConcurrentHashMap concurrentHashMap2 = mpVar.P;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i7 = 0; i7 < tL_messages_peerDialogs.dialogs.size(); i7++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i7);
                        n5.x(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.f28496id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.f28496id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
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
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.f28496id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.f28496id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
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
                        mpVar.U3(arrayList, null, null, false, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.f25671b.T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                return;
            case 2:
                mp mpVar2 = this.f25671b;
                mpVar2.getClass();
                if (tLObject != null) {
                    mpVar2.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 3:
                mp mpVar3 = this.f25671b;
                mpVar3.H2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    mpVar3.I2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    mpVar3.I2 = tL_help_termsOfServiceUpdate.expires;
                    g0.g3(new fi(19, mpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    mpVar3.I2 = mpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                mpVar3.f25753g7.edit().putInt("nextTosCheckTime", mpVar3.I2).commit();
                return;
            case 4:
                if (tL_error == null) {
                    final mp mpVar4 = this.f25671b;
                    g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            Set set;
                            int i10 = r3;
                            mp mpVar5 = mpVar4;
                            boolean z13 = true;
                            TLObject tLObject2 = tLObject;
                            switch (i10) {
                                case 0:
                                    mpVar5.U0 = false;
                                    ArrayList arrayList2 = mpVar5.W0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    mpVar5.getNotificationCenter().k(188, new Object[0]);
                                    return;
                                case 1:
                                    mpVar5.f25877v2 = false;
                                    SharedPreferences.Editor edit = mpVar5.f25753g7.edit();
                                    edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit.commit();
                                    mpVar5.getUserConfig().U = true;
                                    mpVar5.getUserConfig().v(false);
                                    return;
                                case 2:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit2 = mpVar5.f25753g7.edit();
                                        if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        edit2.putBoolean("EnableReactionsMessages", z10);
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
                                        mpVar5.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                        edit2.apply();
                                        mpVar5.getNotificationCenter().k(42, new Object[0]);
                                        return;
                                    }
                                    return;
                                case 3:
                                    mpVar5.f25868u2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit3 = mpVar5.f25753g7.edit();
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
                                        mpVar5.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                        edit3.apply();
                                    }
                                    if (mpVar5.f25868u2 == 0) {
                                        mpVar5.getUserConfig().T = true;
                                        mpVar5.getUserConfig().v(false);
                                        return;
                                    }
                                    return;
                                case 4:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        mpVar5.f25857s8 = (TL_account.contentSettings) tLObject2;
                                        mpVar5.f25848r8 = System.currentTimeMillis();
                                    }
                                    mpVar5.f25829p8 = false;
                                    TL_account.contentSettings contentsettings = mpVar5.f25857s8;
                                    if (contentsettings != null && (set = mpVar5.F4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = mpVar5.h7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", mpVar5.F4).apply();
                                        }
                                    }
                                    ArrayList arrayList3 = mpVar5.f25838q8;
                                    if (arrayList3 != null) {
                                        int size = arrayList3.size();
                                        int i11 = 0;
                                        while (i11 < size) {
                                            Object obj = arrayList3.get(i11);
                                            i11++;
                                            ((w10) obj).a(mpVar5.f25857s8);
                                        }
                                        mpVar5.f25838q8.clear();
                                        mpVar5.f25838q8 = null;
                                    }
                                    mpVar5.getNotificationCenter().k(246, new Object[0]);
                                    return;
                                case 5:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    mpVar5.f4(tL_help_recentMeUrls.users, false);
                                    mpVar5.Z3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList4 = mpVar5.f25849s;
                                    arrayList4.clear();
                                    arrayList4.addAll(tL_help_recentMeUrls.urls);
                                    mpVar5.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                default:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i12 = 0;
                                        while (true) {
                                            mp mpVar6 = mpVar4;
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
                                                    mpVar6.getMessagesStorage().F1(j11, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar6.R.f(j11);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            mpVar6.u2(j11, 0L, null);
                                                        }
                                                    }
                                                }
                                                i12++;
                                            } else {
                                                mpVar6.getUserConfig().f24666x = true;
                                                mpVar6.getUserConfig().v(false);
                                                mpVar6.getNotificationCenter().k(2, 256);
                                                mpVar6.f25748g2 = false;
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
                    this.f25671b.T3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    return;
                }
                return;
            case 6:
                final mp mpVar5 = this.f25671b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i10 = r3;
                        mp mpVar52 = mpVar5;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                mpVar52.U0 = false;
                                ArrayList arrayList2 = mpVar52.W0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                mpVar52.getNotificationCenter().k(188, new Object[0]);
                                return;
                            case 1:
                                mpVar52.f25877v2 = false;
                                SharedPreferences.Editor edit = mpVar52.f25753g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                mpVar52.getUserConfig().U = true;
                                mpVar52.getUserConfig().v(false);
                                return;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = mpVar52.f25753g7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z10);
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    mpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                mpVar52.f25868u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = mpVar52.f25753g7.edit();
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (mpVar52.f25868u2 == 0) {
                                    mpVar52.getUserConfig().T = true;
                                    mpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    mpVar52.f25857s8 = (TL_account.contentSettings) tLObject2;
                                    mpVar52.f25848r8 = System.currentTimeMillis();
                                }
                                mpVar52.f25829p8 = false;
                                TL_account.contentSettings contentsettings = mpVar52.f25857s8;
                                if (contentsettings != null && (set = mpVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = mpVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", mpVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList3 = mpVar52.f25838q8;
                                if (arrayList3 != null) {
                                    int size = arrayList3.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList3.get(i11);
                                        i11++;
                                        ((w10) obj).a(mpVar52.f25857s8);
                                    }
                                    mpVar52.f25838q8.clear();
                                    mpVar52.f25838q8 = null;
                                }
                                mpVar52.getNotificationCenter().k(246, new Object[0]);
                                return;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                mpVar52.f4(tL_help_recentMeUrls.users, false);
                                mpVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = mpVar52.f25849s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                mpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        mp mpVar6 = mpVar5;
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
                                                mpVar6.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar6.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        mpVar6.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            mpVar6.getUserConfig().f24666x = true;
                                            mpVar6.getUserConfig().v(false);
                                            mpVar6.getNotificationCenter().k(2, 256);
                                            mpVar6.f25748g2 = false;
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
                mp mpVar6 = this.f25671b;
                mpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        if (arrayList2.get(i10) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i10));
                        }
                    }
                    mpVar6.getMessagesController().f4(arrayList3, false);
                    return;
                }
                return;
            case 8:
                mp mpVar7 = this.f25671b;
                mpVar7.getClass();
                if (tLObject != null) {
                    mpVar7.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 9:
                mp mpVar8 = this.f25671b;
                if (tL_error == null) {
                    mpVar8.getClass();
                    mpVar8.M2 = System.currentTimeMillis();
                    mpVar8.P2 = false;
                    mpVar8.O2 = 0;
                } else {
                    long j3 = mpVar8.M2;
                    if (j3 != 0) {
                        mpVar8.M2 = j3 + 5000;
                    }
                }
                mpVar8.N2 = 0;
                return;
            case 10:
                mp mpVar9 = this.f25671b;
                if (tL_error == null) {
                    mpVar9.P2 = true;
                } else {
                    long j10 = mpVar9.M2;
                    if (j10 != 0) {
                        mpVar9.M2 = j10 + 5000;
                    }
                }
                mpVar9.N2 = 0;
                return;
            case 11:
                final mp mpVar10 = this.f25671b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i102 = r3;
                        mp mpVar52 = mpVar10;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                mpVar52.U0 = false;
                                ArrayList arrayList22 = mpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                mpVar52.getNotificationCenter().k(188, new Object[0]);
                                return;
                            case 1:
                                mpVar52.f25877v2 = false;
                                SharedPreferences.Editor edit = mpVar52.f25753g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                mpVar52.getUserConfig().U = true;
                                mpVar52.getUserConfig().v(false);
                                return;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = mpVar52.f25753g7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z10);
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    mpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                mpVar52.f25868u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = mpVar52.f25753g7.edit();
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (mpVar52.f25868u2 == 0) {
                                    mpVar52.getUserConfig().T = true;
                                    mpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    mpVar52.f25857s8 = (TL_account.contentSettings) tLObject2;
                                    mpVar52.f25848r8 = System.currentTimeMillis();
                                }
                                mpVar52.f25829p8 = false;
                                TL_account.contentSettings contentsettings = mpVar52.f25857s8;
                                if (contentsettings != null && (set = mpVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = mpVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", mpVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = mpVar52.f25838q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList32.get(i11);
                                        i11++;
                                        ((w10) obj).a(mpVar52.f25857s8);
                                    }
                                    mpVar52.f25838q8.clear();
                                    mpVar52.f25838q8 = null;
                                }
                                mpVar52.getNotificationCenter().k(246, new Object[0]);
                                return;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                mpVar52.f4(tL_help_recentMeUrls.users, false);
                                mpVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = mpVar52.f25849s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                mpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        mp mpVar62 = mpVar10;
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
                                                mpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        mpVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            mpVar62.getUserConfig().f24666x = true;
                                            mpVar62.getUserConfig().v(false);
                                            mpVar62.getNotificationCenter().k(2, 256);
                                            mpVar62.f25748g2 = false;
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
                mp mpVar11 = this.f25671b;
                mpVar11.getClass();
                if (tLObject != null) {
                    mpVar11.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new rj(mpVar11, 27));
                    return;
                }
                return;
            case 13:
                if (tLObject != null) {
                    mp mpVar12 = this.f25671b;
                    mpVar12.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new rj(mpVar12, 24));
                    return;
                }
                return;
            case 14:
                mp mpVar13 = this.f25671b;
                mpVar13.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    mpVar13.T3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    return;
                }
                return;
            case 15:
                final mp mpVar14 = this.f25671b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i102 = r3;
                        mp mpVar52 = mpVar14;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                mpVar52.U0 = false;
                                ArrayList arrayList22 = mpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                mpVar52.getNotificationCenter().k(188, new Object[0]);
                                return;
                            case 1:
                                mpVar52.f25877v2 = false;
                                SharedPreferences.Editor edit = mpVar52.f25753g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                mpVar52.getUserConfig().U = true;
                                mpVar52.getUserConfig().v(false);
                                return;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = mpVar52.f25753g7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z10);
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    mpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                mpVar52.f25868u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = mpVar52.f25753g7.edit();
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (mpVar52.f25868u2 == 0) {
                                    mpVar52.getUserConfig().T = true;
                                    mpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    mpVar52.f25857s8 = (TL_account.contentSettings) tLObject2;
                                    mpVar52.f25848r8 = System.currentTimeMillis();
                                }
                                mpVar52.f25829p8 = false;
                                TL_account.contentSettings contentsettings = mpVar52.f25857s8;
                                if (contentsettings != null && (set = mpVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = mpVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", mpVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = mpVar52.f25838q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList32.get(i11);
                                        i11++;
                                        ((w10) obj).a(mpVar52.f25857s8);
                                    }
                                    mpVar52.f25838q8.clear();
                                    mpVar52.f25838q8 = null;
                                }
                                mpVar52.getNotificationCenter().k(246, new Object[0]);
                                return;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                mpVar52.f4(tL_help_recentMeUrls.users, false);
                                mpVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = mpVar52.f25849s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                mpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        mp mpVar62 = mpVar14;
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
                                                mpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        mpVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            mpVar62.getUserConfig().f24666x = true;
                                            mpVar62.getUserConfig().v(false);
                                            mpVar62.getNotificationCenter().k(2, 256);
                                            mpVar62.f25748g2 = false;
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
                mp mpVar15 = this.f25671b;
                mpVar15.getClass();
                if (tLObject != null) {
                    mpVar15.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new qn(mpVar15, 0));
                    return;
                }
                return;
            case 17:
                final mp mpVar16 = this.f25671b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        boolean z12;
                        Set set;
                        int i102 = r3;
                        mp mpVar52 = mpVar16;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                mpVar52.U0 = false;
                                ArrayList arrayList22 = mpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                mpVar52.getNotificationCenter().k(188, new Object[0]);
                                return;
                            case 1:
                                mpVar52.f25877v2 = false;
                                SharedPreferences.Editor edit = mpVar52.f25753g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                mpVar52.getUserConfig().U = true;
                                mpVar52.getUserConfig().v(false);
                                return;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = mpVar52.f25753g7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    edit2.putBoolean("EnableReactionsMessages", z10);
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    mpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                mpVar52.f25868u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = mpVar52.f25753g7.edit();
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (mpVar52.f25868u2 == 0) {
                                    mpVar52.getUserConfig().T = true;
                                    mpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    mpVar52.f25857s8 = (TL_account.contentSettings) tLObject2;
                                    mpVar52.f25848r8 = System.currentTimeMillis();
                                }
                                mpVar52.f25829p8 = false;
                                TL_account.contentSettings contentsettings = mpVar52.f25857s8;
                                if (contentsettings != null && (set = mpVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = mpVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", mpVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = mpVar52.f25838q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList32.get(i11);
                                        i11++;
                                        ((w10) obj).a(mpVar52.f25857s8);
                                    }
                                    mpVar52.f25838q8.clear();
                                    mpVar52.f25838q8 = null;
                                }
                                mpVar52.getNotificationCenter().k(246, new Object[0]);
                                return;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                mpVar52.f4(tL_help_recentMeUrls.users, false);
                                mpVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = mpVar52.f25849s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                mpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i12 = 0;
                                    while (true) {
                                        mp mpVar62 = mpVar16;
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
                                                mpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        mpVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i12++;
                                        } else {
                                            mpVar62.getUserConfig().f24666x = true;
                                            mpVar62.getUserConfig().v(false);
                                            mpVar62.getNotificationCenter().k(2, 256);
                                            mpVar62.f25748g2 = false;
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
                mp mpVar17 = this.f25671b;
                if (z10) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i11));
                    }
                    tr messagesStorage = mpVar17.getMessagesStorage();
                    messagesStorage.f27149a.c(new kg(messagesStorage, arrayList4, new qn(mpVar17, 10), 22));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = mpVar17.D7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = mpVar17.h7.edit();
                        mpVar17.D7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        g0.g3(new qn(mpVar17, 11));
                    }
                    tr messagesStorage2 = mpVar17.getMessagesStorage();
                    messagesStorage2.f27149a.c(new kg(messagesStorage2, tL_messages_dialogFilters.filters, new qn(mpVar17, 12), 22));
                    return;
                } else {
                    g0.g3(new qn(mpVar17, 13));
                    return;
                }
            case 19:
                if (tL_error == null) {
                    mp mpVar18 = this.f25671b;
                    TLRPC.User c22 = mpVar18.c2(Long.valueOf(mpVar18.getUserConfig().e()));
                    if (c22 == null) {
                        c22 = mpVar18.getUserConfig().f();
                        mpVar18.e4(c22, true, false);
                    } else {
                        mpVar18.getUserConfig().w(c22);
                    }
                    if (c22 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w10 = w7.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        c22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f28516id;
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_small = w10.location;
                        }
                        if (w11 != null) {
                            tL_userProfilePhoto.photo_big = w11.location;
                        }
                        mpVar18.W0(c22.f28641id).f();
                        mpVar18.W0(c22.f28641id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(c22);
                        mpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        g0.g3(new rj(mpVar18, 0));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                this.f25671b.getConnectionsManager().cleanup(false);
                g0.g3(new a(tLObject, 23));
                return;
            case 21:
                mp mpVar19 = this.f25671b;
                mpVar19.getClass();
                if (tL_error == null) {
                    mpVar19.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final mp mpVar20 = this.f25671b;
                    g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    mp mpVar21 = mpVar20;
                                    mpVar21.f25762h8 = false;
                                    mpVar21.f25862t4 = cp.c(0, tL_help_peerColors);
                                    mpVar21.h7.edit().putString("peerColors", mpVar21.f25862t4.toString()).apply();
                                    return;
                                default:
                                    mp mpVar22 = mpVar20;
                                    mpVar22.f25770i8 = false;
                                    mpVar22.f25870u4 = cp.c(1, tL_help_peerColors);
                                    mpVar22.h7.edit().putString("profilePeerColors", mpVar22.f25870u4.toString()).apply();
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
                    final mp mpVar21 = this.f25671b;
                    g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    mp mpVar212 = mpVar21;
                                    mpVar212.f25762h8 = false;
                                    mpVar212.f25862t4 = cp.c(0, tL_help_peerColors2);
                                    mpVar212.h7.edit().putString("peerColors", mpVar212.f25862t4.toString()).apply();
                                    return;
                                default:
                                    mp mpVar22 = mpVar21;
                                    mpVar22.f25770i8 = false;
                                    mpVar22.f25870u4 = cp.c(1, tL_help_peerColors2);
                                    mpVar22.h7.edit().putString("profilePeerColors", mpVar22.f25870u4.toString()).apply();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 24:
                mp mpVar22 = this.f25671b;
                mpVar22.f25781k2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    mpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    mpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    mpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    mpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i12 = 0; i12 < 3; i12++) {
                        mpVar22.W3(i12, 2);
                    }
                    tr messagesStorage3 = mpVar22.getMessagesStorage();
                    tr messagesStorage4 = mpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i13 = messagesStorage4.f27162w;
                    tr messagesStorage5 = mpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i14 = messagesStorage5.f27160r;
                    tr messagesStorage6 = mpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i15 = messagesStorage6.f27159n;
                    tr messagesStorage7 = mpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i13, i14, i15, messagesStorage7.f27161s);
                    return;
                } else if (tL_error.code != 401) {
                    mpVar22.f25781k2 = true;
                    mpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new mj(mpVar22, 24));
                    return;
                } else {
                    return;
                }
            case 25:
                final mp mpVar23 = this.f25671b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i102 = r3;
                        mp mpVar52 = mpVar23;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                mpVar52.U0 = false;
                                ArrayList arrayList22 = mpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                mpVar52.getNotificationCenter().k(188, new Object[0]);
                                return;
                            case 1:
                                mpVar52.f25877v2 = false;
                                SharedPreferences.Editor edit2 = mpVar52.f25753g7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                mpVar52.getUserConfig().U = true;
                                mpVar52.getUserConfig().v(false);
                                return;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = mpVar52.f25753g7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z102 = true;
                                    } else {
                                        z102 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsMessages", z102);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                    mpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                mpVar52.f25868u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = mpVar52.f25753g7.edit();
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (mpVar52.f25868u2 == 0) {
                                    mpVar52.getUserConfig().T = true;
                                    mpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    mpVar52.f25857s8 = (TL_account.contentSettings) tLObject2;
                                    mpVar52.f25848r8 = System.currentTimeMillis();
                                }
                                mpVar52.f25829p8 = false;
                                TL_account.contentSettings contentsettings = mpVar52.f25857s8;
                                if (contentsettings != null && (set = mpVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = mpVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", mpVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = mpVar52.f25838q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i112 = 0;
                                    while (i112 < size) {
                                        Object obj = arrayList32.get(i112);
                                        i112++;
                                        ((w10) obj).a(mpVar52.f25857s8);
                                    }
                                    mpVar52.f25838q8.clear();
                                    mpVar52.f25838q8 = null;
                                }
                                mpVar52.getNotificationCenter().k(246, new Object[0]);
                                return;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                mpVar52.f4(tL_help_recentMeUrls.users, false);
                                mpVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList42 = mpVar52.f25849s;
                                arrayList42.clear();
                                arrayList42.addAll(tL_help_recentMeUrls.urls);
                                mpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i122 = 0;
                                    while (true) {
                                        mp mpVar62 = mpVar23;
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
                                                mpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        mpVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i122++;
                                        } else {
                                            mpVar62.getUserConfig().f24666x = true;
                                            mpVar62.getUserConfig().v(false);
                                            mpVar62.getNotificationCenter().k(2, 256);
                                            mpVar62.f25748g2 = false;
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
                final mp mpVar24 = this.f25671b;
                mpVar24.getClass();
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z102;
                        boolean z112;
                        boolean z122;
                        Set set;
                        int i102 = r3;
                        mp mpVar52 = mpVar24;
                        boolean z13 = true;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                mpVar52.U0 = false;
                                ArrayList arrayList22 = mpVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                mpVar52.getNotificationCenter().k(188, new Object[0]);
                                return;
                            case 1:
                                mpVar52.f25877v2 = false;
                                SharedPreferences.Editor edit2 = mpVar52.f25753g7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                mpVar52.getUserConfig().U = true;
                                mpVar52.getUserConfig().v(false);
                                return;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = mpVar52.f25753g7.edit();
                                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                                        z102 = true;
                                    } else {
                                        z102 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsMessages", z102);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                                        z13 = false;
                                    }
                                    edit22.putBoolean("EnableReactionsStories", z13);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                    mpVar52.getNotificationCenter().k(42, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                mpVar52.f25868u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = mpVar52.f25753g7.edit();
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
                                    mpVar52.getNotificationsController().f28092h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (mpVar52.f25868u2 == 0) {
                                    mpVar52.getUserConfig().T = true;
                                    mpVar52.getUserConfig().v(false);
                                    return;
                                }
                                return;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    mpVar52.f25857s8 = (TL_account.contentSettings) tLObject2;
                                    mpVar52.f25848r8 = System.currentTimeMillis();
                                }
                                mpVar52.f25829p8 = false;
                                TL_account.contentSettings contentsettings = mpVar52.f25857s8;
                                if (contentsettings != null && (set = mpVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = mpVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", mpVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = mpVar52.f25838q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i112 = 0;
                                    while (i112 < size) {
                                        Object obj = arrayList32.get(i112);
                                        i112++;
                                        ((w10) obj).a(mpVar52.f25857s8);
                                    }
                                    mpVar52.f25838q8.clear();
                                    mpVar52.f25838q8 = null;
                                }
                                mpVar52.getNotificationCenter().k(246, new Object[0]);
                                return;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                mpVar52.f4(tL_help_recentMeUrls.users, false);
                                mpVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList42 = mpVar52.f25849s;
                                arrayList42.clear();
                                arrayList42.addAll(tL_help_recentMeUrls.urls);
                                mpVar52.getNotificationCenter().k(3, new Object[0]);
                                return;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i122 = 0;
                                    while (true) {
                                        mp mpVar62 = mpVar24;
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
                                                mpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        mpVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i122++;
                                        } else {
                                            mpVar62.getUserConfig().f24666x = true;
                                            mpVar62.getUserConfig().v(false);
                                            mpVar62.getNotificationCenter().k(2, 256);
                                            mpVar62.f25748g2 = false;
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
