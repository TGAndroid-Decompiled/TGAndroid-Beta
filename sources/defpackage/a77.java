package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class a77 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TLObject c;

    public a77(oc7 oc7Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        Set set;
        byte b = this.a;
        boolean z4 = true;
        oc7 oc7Var = this.b;
        TLObject tLObject = this.c;
        switch (b) {
            case 0:
                oc7Var.K0 = false;
                ArrayList arrayList = oc7Var.M0;
                arrayList.clear();
                if (tLObject instanceof Vector) {
                    arrayList.addAll(((Vector) tLObject).objects);
                }
                oc7Var.getNotificationCenter().k(189, new Object[0]);
                return;
            case 1:
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit = oc7Var.W3.edit();
                    if (tL_reactionsNotifySettings.messages_notify_from != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    edit.putBoolean("EnableReactionsMessages", z);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                    if (reactionNotificationsFrom != null) {
                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    if (tL_reactionsNotifySettings.stories_notify_from == null) {
                        z4 = false;
                    }
                    edit.putBoolean("EnableReactionsStories", z4);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                    if (reactionNotificationsFrom2 != null) {
                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                    oc7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                    edit.apply();
                    oc7Var.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 2:
                oc7Var.l2 = false;
                SharedPreferences.Editor edit2 = oc7Var.W3.edit();
                edit2.putBoolean("EnableContactJoined", tLObject instanceof TLRPC.TL_boolFalse);
                edit2.commit();
                oc7Var.getUserConfig().U = true;
                oc7Var.getUserConfig().u(false);
                return;
            case 3:
                oc7Var.k2--;
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit3 = oc7Var.W3.edit();
                    if (tL_reactionsNotifySettings2.messages_notify_from != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    edit3.putBoolean("EnableReactionsMessages", z2);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                    if (reactionNotificationsFrom3 != null) {
                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    if (tL_reactionsNotifySettings2.stories_notify_from != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    edit3.putBoolean("EnableReactionsStories", z3);
                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                    if (reactionNotificationsFrom4 != null) {
                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                    }
                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                    oc7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                    edit3.apply();
                }
                if (oc7Var.k2 == 0) {
                    oc7Var.getUserConfig().T = true;
                    oc7Var.getUserConfig().u(false);
                    return;
                }
                return;
            case 4:
                if (tLObject instanceof TL_account.contentSettings) {
                    oc7Var.c5 = (TL_account.contentSettings) tLObject;
                    oc7Var.b5 = System.currentTimeMillis();
                }
                oc7Var.Z4 = false;
                TL_account.contentSettings contentsettings = oc7Var.c5;
                if (contentsettings != null && (set = oc7Var.K3) != null) {
                    if (contentsettings.sensitive_enabled) {
                        set.add("sensitive");
                    } else {
                        set.remove("sensitive");
                    }
                    SharedPreferences sharedPreferences = oc7Var.X3;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", oc7Var.K3).apply();
                    }
                }
                ArrayList arrayList2 = oc7Var.a5;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ((qac) obj).a(oc7Var.c5);
                    }
                    oc7Var.a5.clear();
                    oc7Var.a5 = null;
                }
                oc7Var.getNotificationCenter().k(247, new Object[0]);
                return;
            case 5:
                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject;
                oc7Var.d4(tL_help_recentMeUrls.users, false);
                oc7Var.X3(tL_help_recentMeUrls.chats, false);
                ArrayList arrayList3 = oc7Var.s;
                arrayList3.clear();
                arrayList3.addAll(tL_help_recentMeUrls.urls);
                oc7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 6:
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size2 = vector.objects.size();
                    int i2 = 0;
                    while (true) {
                        oc7 oc7Var2 = this.b;
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
                                oc7Var2.getMessagesStorage().C1(j3, true);
                                TLRPC.Dialog dialog = (TLRPC.Dialog) oc7Var2.R.f(j3);
                                if (dialog != null && !dialog.unread_mark) {
                                    dialog.unread_mark = true;
                                    if (dialog.unread_count == 0) {
                                        oc7Var2.o2(j3, 0L, null);
                                    }
                                }
                            }
                            i2++;
                        } else {
                            oc7Var2.getUserConfig().x = true;
                            oc7Var2.getUserConfig().u(false);
                            oc7Var2.getNotificationCenter().k(2, 256);
                            oc7Var2.W1 = false;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                oc7Var.T3((TLRPC.Updates) tLObject, false);
                return;
        }
    }
}
