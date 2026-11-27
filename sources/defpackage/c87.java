package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class c87 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final TLObject c;

    public c87(uc7 uc7Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        Set set;
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.a;
        boolean z4 = true;
        uc7 uc7Var = this.b;
        TLObject tLObject = this.c;
        switch (b) {
            case 0:
                uc7Var.l2 = false;
                SharedPreferences.Editor edit = uc7Var.X3.edit();
                edit.putBoolean("EnableContactJoined", tLObject instanceof TLRPC.TL_boolFalse);
                edit.commit();
                uc7Var.getUserConfig().U = true;
                uc7Var.getUserConfig().u(false);
                return;
            case 1:
                if (tLObject instanceof TL_account.contentSettings) {
                    uc7Var.c5 = (TL_account.contentSettings) tLObject;
                    uc7Var.b5 = System.currentTimeMillis();
                }
                uc7Var.Z4 = false;
                TL_account.contentSettings contentsettings = uc7Var.c5;
                if (contentsettings != null && (set = uc7Var.L3) != null) {
                    if (contentsettings.sensitive_enabled) {
                        set.add("sensitive");
                    } else {
                        set.remove("sensitive");
                    }
                    SharedPreferences sharedPreferences = uc7Var.Y3;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", uc7Var.L3).apply();
                    }
                }
                ArrayList arrayList = uc7Var.a5;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((pcc) obj).a(uc7Var.c5);
                    }
                    uc7Var.a5.clear();
                    uc7Var.a5 = null;
                }
                uc7Var.getNotificationCenter().k(247, new Object[0]);
                return;
            case 2:
                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject;
                uc7Var.j4(tL_help_recentMeUrls.users, false);
                uc7Var.c4(tL_help_recentMeUrls.chats, false);
                ArrayList arrayList2 = uc7Var.s;
                arrayList2.clear();
                arrayList2.addAll(tL_help_recentMeUrls.urls);
                uc7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 3:
                uc7Var.k2--;
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit2 = uc7Var.X3.edit();
                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    edit2.putBoolean("EnableReactionsMessages", z);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                    if (reactionNotificationsFrom != null) {
                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    if (tL_reactionsNotifySettings.stories_notify_from != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    edit2.putBoolean("EnableReactionsStories", z2);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                    if (reactionNotificationsFrom2 != null) {
                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                    uc7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                    edit2.apply();
                }
                if (uc7Var.k2 == 0) {
                    uc7Var.getUserConfig().T = true;
                    uc7Var.getUserConfig().u(false);
                    return;
                }
                return;
            case 4:
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size2 = vector.objects.size();
                    int i2 = 0;
                    while (true) {
                        uc7 uc7Var2 = this.b;
                        if (i2 < size2) {
                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i2);
                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                long j = peer.user_id;
                                if (j == 0) {
                                    long j2 = peer.chat_id;
                                    if (j2 != 0) {
                                        j = -j2;
                                    } else {
                                        j = -peer.channel_id;
                                    }
                                }
                                long j3 = j;
                                uc7Var2.getMessagesStorage().H1(j3, true);
                                TLRPC.Dialog dialog = (TLRPC.Dialog) uc7Var2.R.f(j3);
                                if (dialog != null && !dialog.unread_mark) {
                                    dialog.unread_mark = true;
                                    if (dialog.unread_count == 0) {
                                        uc7Var2.p2(j3, 0L, null);
                                    }
                                }
                            }
                            i2++;
                        } else {
                            uc7Var2.getUserConfig().x = true;
                            uc7Var2.getUserConfig().u(false);
                            uc7Var2.getNotificationCenter().k(2, 256);
                            uc7Var2.W1 = false;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 5:
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit3 = uc7Var.X3.edit();
                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    edit3.putBoolean("EnableReactionsMessages", z3);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                    if (reactionNotificationsFrom3 != null) {
                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    if (tL_reactionsNotifySettings2.stories_notify_from == null) {
                        z4 = false;
                    }
                    edit3.putBoolean("EnableReactionsStories", z4);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                    if (reactionNotificationsFrom4 != null) {
                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                    uc7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                    edit3.apply();
                    uc7Var.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 6:
                uc7Var.K0 = false;
                ArrayList arrayList3 = uc7Var.M0;
                arrayList3.clear();
                if (tLObject instanceof Vector) {
                    arrayList3.addAll(((Vector) tLObject).objects);
                }
                uc7Var.getNotificationCenter().k(189, new Object[0]);
                return;
            default:
                uc7Var.Y3((TLRPC.Updates) tLObject, false);
                return;
        }
    }
}
