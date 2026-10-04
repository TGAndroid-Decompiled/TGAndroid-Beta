package ei;

import ai.c9;
import ai.o8;
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
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.hu0;
import org.telegram.ui.o6;
import org.telegram.ui.s5;
import org.telegram.ui.zr0;
public final class i1 implements Utilities.Callback2 {
    public final int f9093a;
    public final int f9094b;
    public final Object f9095c;
    public final Object d;
    public final Object f9096e;

    public i1(int i10, org.telegram.ui.ActionBar.n2 n2Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f9093a = 7;
        this.f9094b = i10;
        this.f9095c = n2Var;
        this.d = eVar;
        this.f9096e = b2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f9093a) {
            case 0:
                g1 g1Var = (g1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f9096e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((int[]) this.f9095c)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                TLRPC.WebPage webPage = null;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage2.f20195id;
                                int i10 = this.f9094b;
                                j1 j1Var = new j1(j3, notificationCenterDelegateArr, i10, g1Var);
                                notificationCenterDelegateArr[0] = j1Var;
                                NotificationCenter.getInstance(i10).addObserver(j1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            g1Var.run(webPage);
                            return;
                        }
                        g1Var.run(null);
                        return;
                    }
                }
                g1Var.run(null);
                return;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f9095c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f9096e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                    b2VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    yc.a0(n2Var).d0(tL_error2, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.q.p(R.string.CommunityNoChatsToAdd, yc.a0(n2Var), R.raw.info, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        n2Var.showDialog(new fi.k0(n2Var, 0L, arrayList, new s4(n2Var, chat, this.f9094b, 1)));
                        return;
                    } else {
                        yc.a0(n2Var).Q(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.f9095c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f9096e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i11 = this.f9094b;
                if (tL_error3 != null) {
                    AndroidUtilities.runOnUIThread(new c9(d1Var, i11, tL_error3, tL_channels_joinChannel, 9));
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
                    MessagesController.getInstance(i11).processUpdates(updates, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    AndroidUtilities.runOnUIThread(new ai.s1(i11, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 24));
                    z11 = true;
                }
                if (!z11) {
                    MessagesController.getInstance(i11).generateJoinMessage(chat2.f20042id, true);
                }
                AndroidUtilities.runOnUIThread(new hu0(d1Var, 5));
                AndroidUtilities.runOnUIThread(new o8(i11, chat2, 15), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                long j10 = chat2.f20042id;
                messagesStorage.updateDialogsWithDeletedMessages(-j10, j10, new ArrayList<>(), null);
                return;
            case 3:
                org.telegram.ui.Components.e0.Y((org.telegram.ui.Components.e0) this.f9095c, (i5) this.d, this.f9094b, (TLRPC.TL_messages_composeMessageWithAI) this.f9096e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                org.telegram.ui.Components.e0.T((org.telegram.ui.Components.e0) this.f9095c, (i5) this.d, this.f9094b, (TLRPC.TL_messages_composeRichMessageWithAI) this.f9096e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f9095c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f9096e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList2.set(this.f9094b, str);
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
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f9096e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((ci.d) this.f9095c).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20372a.setOnDismissListener(new s5(f3Var, 10));
                        alertDialog$Builder.o();
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str2 != null) {
                            new yc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str2, false);
                            return;
                        } else if (passkey != null) {
                            int i14 = this.f9094b;
                            MessagesController.getInstance(i14).removeSuggestion(0L, "SETUP_PASSKEY");
                            if (U instanceof PasskeysActivity) {
                                f3Var.dismiss();
                                ((PasskeysActivity) U).X(passkey);
                                return;
                            } else if (U instanceof PrivacySettingsActivity) {
                                f3Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                ArrayList arrayList3 = privacySettingsActivity.f34200e;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(passkey);
                                privacySettingsActivity.A0(true);
                                U.presentFragment(new PasskeysActivity(arrayList3));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i14).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new o6(f3Var, passkey, str2, 3));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f9095c;
                nf.e eVar = (nf.e) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f9096e;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error4 == null) {
                    MessagesController.getInstance(this.f9094b).processUpdates(updates2, false);
                }
                AndroidUtilities.runOnUIThread(new zr0(n2Var2, tL_error4, eVar, b2Var2, 28));
                return;
        }
    }

    public i1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f9093a = i11;
        this.f9095c = obj;
        this.d = obj2;
        this.f9094b = i10;
        this.f9096e = obj3;
    }

    public i1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f9093a = i11;
        this.f9095c = obj;
        this.d = obj2;
        this.f9096e = obj3;
        this.f9094b = i10;
    }

    public i1(org.telegram.ui.d1 d1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f9093a = 2;
        this.f9095c = d1Var;
        this.f9094b = i10;
        this.d = tL_channels_joinChannel;
        this.f9096e = chat;
    }
}
