package mh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.tt0;
public final class h0 implements Utilities.Callback2 {
    public final int f14147a;
    public final int f14148b;
    public final Object f14149c;
    public final Object d;
    public final Object f14150e;

    public h0(int i10, org.telegram.ui.ActionBar.p2 p2Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f14147a = 0;
        this.f14148b = i10;
        this.f14149c = p2Var;
        this.d = fVar;
        this.f14150e = d2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z4;
        switch (this.f14147a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f14149c;
                af.f fVar = (af.f) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f14150e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.f14148b).processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(p2Var, tL_error, fVar, d2Var, 6));
                return;
            case 1:
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.f14149c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f14150e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = this.f14148b;
                if (tL_error2 != null) {
                    AndroidUtilities.runOnUIThread(new dg.u1(e1Var, i10, tL_error2, tL_channels_joinChannel, 8));
                    return;
                }
                boolean z10 = false;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates2.updates.size()) {
                            TLRPC.Update update = updates2.updates.get(i11);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z4 = true;
                            } else {
                                i11++;
                            }
                        } else {
                            z4 = false;
                        }
                    }
                    MessagesController.getInstance(i10).processUpdates(updates2, false);
                    z10 = z4;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    AndroidUtilities.runOnUIThread(new bh.a(i10, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, 22));
                    z10 = true;
                }
                if (!z10) {
                    MessagesController.getInstance(i10).generateJoinMessage(chat.f20843id, true);
                }
                AndroidUtilities.runOnUIThread(new tt0(e1Var, 5));
                AndroidUtilities.runOnUIThread(new af.b(i10, chat, 13), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                long j10 = chat.f20843id;
                messagesStorage.updateDialogsWithDeletedMessages(-j10, j10, new ArrayList<>(), null);
                return;
            case 2:
                org.telegram.ui.Components.f0.Z((org.telegram.ui.Components.f0) this.f14149c, (org.telegram.ui.ActionBar.l5) this.d, this.f14148b, (TLRPC.TL_messages_composeMessageWithAI) this.f14150e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                org.telegram.ui.Components.f0.V((org.telegram.ui.Components.f0) this.f14149c, (org.telegram.ui.ActionBar.l5) this.d, this.f14148b, (TLRPC.TL_messages_composeRichMessageWithAI) this.f14150e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f14149c;
                ArrayList arrayList = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f14150e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList.set(this.f14148b, str);
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
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f14150e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((qh.d) this.f14149c).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f21166a.setOnDismissListener(new org.telegram.ui.v5(h3Var, 10));
                        alertDialog$Builder.o();
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str2 != null) {
                            new qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(str2, false);
                            return;
                        } else if (passkey != null) {
                            int i13 = this.f14148b;
                            MessagesController.getInstance(i13).removeSuggestion(0L, "SETUP_PASSKEY");
                            if (U instanceof PasskeysActivity) {
                                h3Var.dismiss();
                                ((PasskeysActivity) U).Y(passkey);
                                return;
                            } else if (U instanceof PrivacySettingsActivity) {
                                h3Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                ArrayList arrayList2 = privacySettingsActivity.f34552e;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(passkey);
                                privacySettingsActivity.A0(true);
                                U.presentFragment(new PasskeysActivity(arrayList2));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new org.telegram.ui.p6(h3Var, passkey, str2, 3));
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
                sh.w0 w0Var = (sh.w0) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f14150e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((int[]) this.f14149c)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                TLRPC.WebPage webPage = null;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j11 = webPage2.f20996id;
                                int i14 = this.f14148b;
                                sh.x0 x0Var = new sh.x0(j11, notificationCenterDelegateArr, i14, w0Var);
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
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f14149c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f14150e;
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    d2VarArr[0] = null;
                }
                if (tL_error4 != null) {
                    qc.a0(p2Var2).d0(tL_error4, false);
                    return;
                } else if (arrayList3 != null) {
                    if (arrayList3.isEmpty()) {
                        l.d.v(R.string.CommunityNoChatsToAdd, qc.a0(p2Var2), R.raw.info, 36);
                        return;
                    } else if (!arrayList3.isEmpty()) {
                        p2Var2.showDialog(new th.i0(p2Var2, 0L, arrayList3, new eg.h3(p2Var2, chat2, this.f14148b, 5)));
                        return;
                    } else {
                        qc.a0(p2Var2).Q(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public h0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f14147a = i11;
        this.f14149c = obj;
        this.d = obj2;
        this.f14148b = i10;
        this.f14150e = obj3;
    }

    public h0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f14147a = i11;
        this.f14149c = obj;
        this.d = obj2;
        this.f14150e = obj3;
        this.f14148b = i10;
    }

    public h0(org.telegram.ui.e1 e1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f14147a = 1;
        this.f14149c = e1Var;
        this.f14148b = i10;
        this.d = tL_channels_joinChannel;
        this.f14150e = chat;
    }

    public h0(org.telegram.ui.ActionBar.d2[] d2VarArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Chat chat) {
        this.f14147a = 7;
        this.d = d2VarArr;
        this.f14149c = p2Var;
        this.f14148b = i10;
        this.f14150e = chat;
    }
}
