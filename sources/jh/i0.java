package jh;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.it0;
public final class i0 implements Utilities.Callback2 {
    public final int f12228a;
    public final int f12229b;
    public final Object f12230c;
    public final Object d;
    public final Object f12231e;

    public i0(int i10, org.telegram.ui.ActionBar.o2 o2Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f12228a = 0;
        this.f12229b = i10;
        this.f12230c = o2Var;
        this.d = cVar;
        this.f12231e = c2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f12228a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f12230c;
                ye.c cVar = (ye.c) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f12231e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.f12229b).processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(o2Var, tL_error, cVar, c2Var, 6));
                return;
            case 1:
                org.telegram.ui.g1 g1Var = (org.telegram.ui.g1) this.f12230c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f12231e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = this.f12229b;
                if (tL_error2 != null) {
                    AndroidUtilities.runOnUIThread(new ag.z1(g1Var, i10, tL_error2, tL_channels_joinChannel, 8));
                    return;
                }
                boolean z11 = false;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates2.updates.size()) {
                            TLRPC.Update update = updates2.updates.get(i11);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z10 = true;
                            } else {
                                i11++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    MessagesController.getInstance(i10).processUpdates(updates2, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    AndroidUtilities.runOnUIThread(new ag.v0(i10, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, 24));
                    z11 = true;
                }
                if (!z11) {
                    MessagesController.getInstance(i10).generateJoinMessage(chat.f22392id, true);
                }
                AndroidUtilities.runOnUIThread(new it0(g1Var, 5));
                AndroidUtilities.runOnUIThread(new bg.f(i10, chat, 16), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                long j10 = chat.f22392id;
                messagesStorage.updateDialogsWithDeletedMessages(-j10, j10, new ArrayList<>(), null);
                return;
            case 2:
                org.telegram.ui.Components.g0.Z((org.telegram.ui.Components.g0) this.f12230c, (org.telegram.ui.ActionBar.h5) this.d, this.f12229b, (TLRPC.TL_messages_composeMessageWithAI) this.f12231e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                org.telegram.ui.Components.g0.V((org.telegram.ui.Components.g0) this.f12230c, (org.telegram.ui.ActionBar.h5) this.d, this.f12229b, (TLRPC.TL_messages_composeRichMessageWithAI) this.f12231e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f12230c;
                ArrayList arrayList = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f12231e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList.set(this.f12229b, str);
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (arrayList.get(i12) == null) {
                                return;
                            }
                        }
                        zArr[0] = true;
                        callback2.run(TextUtils.join("", arrayList), Boolean.FALSE);
                        return;
                    }
                    zArr[0] = true;
                    callback2.run(null, bool);
                    return;
                }
                return;
            case 5:
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f12231e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((nh.d) this.f12230c).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f22714a.setOnDismissListener(new org.telegram.ui.s5(f3Var, 10));
                        alertDialog$Builder.o();
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str2 != null) {
                            new tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str2, false);
                            return;
                        } else if (passkey != null) {
                            int i13 = this.f12229b;
                            MessagesController.getInstance(i13).removeSuggestion(0L, "SETUP_PASSKEY");
                            if (U instanceof PasskeysActivity) {
                                f3Var.dismiss();
                                ((PasskeysActivity) U).Y(passkey);
                                return;
                            } else if (U instanceof PrivacySettingsActivity) {
                                f3Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                ArrayList arrayList2 = privacySettingsActivity.f35976e;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(passkey);
                                privacySettingsActivity.A0(true);
                                U.presentFragment(new PasskeysActivity(arrayList2));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new org.telegram.ui.l6(f3Var, passkey, str2, 3));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                ph.w0 w0Var = (ph.w0) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f12231e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((int[]) this.f12230c)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                TLRPC.WebPage webPage = null;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j11 = webPage2.f22545id;
                                int i14 = this.f12229b;
                                ph.x0 x0Var = new ph.x0(j11, notificationCenterDelegateArr, i14, w0Var);
                                notificationCenterDelegateArr[0] = x0Var;
                                NotificationCenter.getInstance(i14).addObserver(x0Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            w0Var.run(webPage);
                            return;
                        }
                        w0Var.run(null);
                        return;
                    }
                }
                w0Var.run(null);
                return;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f12230c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f12231e;
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    c2VarArr[0] = null;
                }
                if (tL_error4 != null) {
                    tc.a0(o2Var2).d0(tL_error4, false);
                    return;
                } else if (arrayList3 != null) {
                    if (arrayList3.isEmpty()) {
                        j7.l1.v(R.string.CommunityNoChatsToAdd, tc.a0(o2Var2), R.raw.info, 36);
                        return;
                    } else if (!arrayList3.isEmpty()) {
                        o2Var2.showDialog(new qh.i0(o2Var2, 0L, arrayList3, new bg.n3(o2Var2, chat2, this.f12229b, 5)));
                        return;
                    } else {
                        tc.a0(o2Var2).Q(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public i0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f12228a = i11;
        this.f12230c = obj;
        this.d = obj2;
        this.f12229b = i10;
        this.f12231e = obj3;
    }

    public i0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f12228a = i11;
        this.f12230c = obj;
        this.d = obj2;
        this.f12231e = obj3;
        this.f12229b = i10;
    }

    public i0(org.telegram.ui.g1 g1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f12228a = 1;
        this.f12230c = g1Var;
        this.f12229b = i10;
        this.d = tL_channels_joinChannel;
        this.f12231e = chat;
    }

    public i0(org.telegram.ui.ActionBar.c2[] c2VarArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Chat chat) {
        this.f12228a = 7;
        this.d = c2VarArr;
        this.f12230c = o2Var;
        this.f12229b = i10;
        this.f12231e = chat;
    }
}
