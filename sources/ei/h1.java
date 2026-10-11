package ei;

import ai.d9;
import ai.p8;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
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
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.ad;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ds0;
import org.telegram.ui.k6;
import org.telegram.ui.mu0;
import org.telegram.ui.q5;
public final class h1 implements Utilities.Callback2 {
    public final int f9091a;
    public final int f9092b;
    public final Object f9093c;
    public final Object d;
    public final Object f9094e;

    public h1(int i10, org.telegram.ui.ActionBar.m2 m2Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f9091a = 8;
        this.f9092b = i10;
        this.f9093c = m2Var;
        this.d = eVar;
        this.f9094e = a2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f9091a) {
            case 0:
                f1 f1Var = (f1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f9094e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((int[]) this.f9093c)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                TLRPC.WebPage webPage = null;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage2.f20185id;
                                int i10 = this.f9092b;
                                i1 i1Var = new i1(j3, notificationCenterDelegateArr, i10, f1Var);
                                notificationCenterDelegateArr[0] = i1Var;
                                NotificationCenter.getInstance(i10).addObserver(i1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            f1Var.run(webPage);
                            return;
                        }
                        f1Var.run(null);
                        return;
                    }
                }
                f1Var.run(null);
                return;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.f9093c;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f9094e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    a2Var.dismiss();
                    a2VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    ad.a0(m2Var).f0(tL_error2, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.q.q(R.string.CommunityNoChatsToAdd, ad.a0(m2Var), R.raw.info, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        m2Var.showDialog(new fi.k0(m2Var, 0L, arrayList, new q4(m2Var, chat, this.f9092b, 1)));
                        return;
                    } else {
                        ad.a0(m2Var).Q(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.f9093c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f9094e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i11 = this.f9092b;
                if (tL_error3 != null) {
                    AndroidUtilities.runOnUIThread(new d9(c1Var, i11, tL_error3, tL_channels_joinChannel, 9));
                    return;
                }
                boolean z11 = false;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z10 = true;
                            } else {
                                i12++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    MessagesController.getInstance(i11).lambda$processUpdates$377(updates, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    AndroidUtilities.runOnUIThread(new ai.s1(i11, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 24));
                    z11 = true;
                }
                if (!z11) {
                    MessagesController.getInstance(i11).generateJoinMessage(chat2.f20032id, true);
                }
                AndroidUtilities.runOnUIThread(new mu0(c1Var, 5));
                AndroidUtilities.runOnUIThread(new p8(i11, chat2, 15), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                long j10 = chat2.f20032id;
                messagesStorage.updateDialogsWithDeletedMessages(-j10, j10, new ArrayList<>(), null);
                return;
            case 3:
                org.telegram.ui.Components.e0.a0((org.telegram.ui.Components.e0) this.f9093c, (h5) this.d, this.f9092b, (TLRPC.TL_messages_composeMessageWithAI) this.f9094e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                org.telegram.ui.Components.e0.W((org.telegram.ui.Components.e0) this.f9093c, (h5) this.d, this.f9092b, (TLRPC.TL_messages_composeRichMessageWithAI) this.f9094e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f9093c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f9094e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList2.set(this.f9092b, str);
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            if (arrayList2.get(i13) == null) {
                                return;
                            }
                        }
                        zArr[0] = true;
                        callback2.run(TextUtils.join("", arrayList2), Boolean.FALSE);
                        return;
                    }
                    zArr[0] = true;
                    callback2.run(null, bool);
                    return;
                }
                return;
            case 6:
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f9094e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((ci.d) this.f9093c).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20368a.setOnDismissListener(new q5(e3Var, 9));
                        alertDialog$Builder.o();
                        return;
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str2 != null) {
                            new ad(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0(str2, false);
                            return;
                        } else if (passkey != null) {
                            int i14 = this.f9092b;
                            MessagesController.getInstance(i14).removeSuggestion(0L, "SETUP_PASSKEY");
                            if (U instanceof PasskeysActivity) {
                                e3Var.dismiss();
                                ((PasskeysActivity) U).Y(passkey);
                                return;
                            } else if (U instanceof PrivacySettingsActivity) {
                                e3Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                ArrayList arrayList3 = privacySettingsActivity.f34231e;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(passkey);
                                privacySettingsActivity.A0(true);
                                U.presentFragment(new PasskeysActivity(arrayList3));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i14).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new k6(e3Var, passkey, str2, 3));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 7:
                d6 d6Var = (d6) this.f9094e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str3 = (String) obj2;
                ((Runnable[]) this.f9093c)[0] = null;
                TextView textView = ((TextView[]) this.d)[0];
                if (textView != null && wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(org.telegram.ui.Wallet.c5.l0(this.f9092b, j11, d6Var));
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f9093c;
                of.e eVar = (of.e) this.d;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.f9094e;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error4 == null) {
                    MessagesController.getInstance(this.f9092b).lambda$processUpdates$377(updates2, false);
                }
                AndroidUtilities.runOnUIThread(new ds0(m2Var2, tL_error4, eVar, a2Var2, 28));
                return;
        }
    }

    public h1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f9091a = i11;
        this.f9093c = obj;
        this.d = obj2;
        this.f9092b = i10;
        this.f9094e = obj3;
    }

    public h1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f9091a = i11;
        this.f9093c = obj;
        this.d = obj2;
        this.f9094e = obj3;
        this.f9092b = i10;
    }

    public h1(org.telegram.ui.c1 c1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f9091a = 2;
        this.f9093c = c1Var;
        this.f9092b = i10;
        this.d = tL_channels_joinChannel;
        this.f9094e = chat;
    }
}
