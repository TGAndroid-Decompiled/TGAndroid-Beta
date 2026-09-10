package di;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.fy0;
import org.telegram.ui.m6;
import org.telegram.ui.mu0;
import org.telegram.ui.s5;
public final class k1 implements Utilities.Callback2 {
    public final int f6725a;
    public final int f6726b;
    public final Object f6727c;
    public final Object d;
    public final Object e;

    public k1(int i10, org.telegram.ui.ActionBar.p2 p2Var, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f6725a = 7;
        this.f6726b = i10;
        this.f6727c = p2Var;
        this.d = eVar;
        this.e = d2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f6725a) {
            case 0:
                i1 i1Var = (i1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((int[]) this.f6727c)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                TLRPC.WebPage webPage = null;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage2.f17348id;
                                int i10 = this.f6726b;
                                l1 l1Var = new l1(j3, notificationCenterDelegateArr, i10, i1Var);
                                notificationCenterDelegateArr[0] = l1Var;
                                NotificationCenter.getInstance(i10).addObserver(l1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            i1Var.run(webPage);
                            return;
                        }
                        i1Var.run(null);
                        return;
                    }
                }
                i1Var.run(null);
                return;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f6727c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                    d2VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    wc.a0(p2Var).d0(tL_error2, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.a2.o(R.string.CommunityNoChatsToAdd, wc.a0(p2Var), R.raw.info, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        p2Var.showDialog(new ei.k0(p2Var, 0L, arrayList, new v4(p2Var, chat, this.f6726b, 1)));
                        return;
                    } else {
                        wc.a0(p2Var).Q(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.f6727c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i11 = this.f6726b;
                if (tL_error3 != null) {
                    AndroidUtilities.runOnUIThread(new q(e1Var, i11, tL_error3, tL_channels_joinChannel, 9));
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
                    AndroidUtilities.runOnUIThread(new bi.g3(i11, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 22));
                    z11 = true;
                }
                if (!z11) {
                    MessagesController.getInstance(i11).generateJoinMessage(chat2.f17195id, true);
                }
                AndroidUtilities.runOnUIThread(new mu0(e1Var, 5));
                AndroidUtilities.runOnUIThread(new bi.s(i11, chat2, 14), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                long j10 = chat2.f17195id;
                messagesStorage.updateDialogsWithDeletedMessages(-j10, j10, new ArrayList<>(), null);
                return;
            case 3:
                org.telegram.ui.Components.g0.Z((org.telegram.ui.Components.g0) this.f6727c, (l5) this.d, this.f6726b, (TLRPC.TL_messages_composeMessageWithAI) this.e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 4:
                org.telegram.ui.Components.g0.V((org.telegram.ui.Components.g0) this.f6727c, (l5) this.d, this.f6726b, (TLRPC.TL_messages_composeRichMessageWithAI) this.e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f6727c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList2.set(this.f6726b, str);
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
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((bi.d) this.f6727c).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f17528a.setOnDismissListener(new s5(h3Var, 10));
                        alertDialog$Builder.o();
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str2 != null) {
                            new wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(str2, false);
                            return;
                        } else if (passkey != null) {
                            int i14 = this.f6726b;
                            MessagesController.getInstance(i14).removeSuggestion(0L, "SETUP_PASSKEY");
                            if (U instanceof PasskeysActivity) {
                                h3Var.dismiss();
                                ((PasskeysActivity) U).Y(passkey);
                                return;
                            } else if (U instanceof PrivacySettingsActivity) {
                                h3Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                ArrayList arrayList3 = privacySettingsActivity.e;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(passkey);
                                privacySettingsActivity.A0(true);
                                U.presentFragment(new PasskeysActivity(arrayList3));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i14).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new m6(h3Var, passkey, str2, 3));
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
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f6727c;
                nf.e eVar = (nf.e) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error4 == null) {
                    MessagesController.getInstance(this.f6726b).processUpdates(updates2, false);
                }
                AndroidUtilities.runOnUIThread(new fy0((Object) p2Var2, (TLObject) tL_error4, (Object) eVar, d2Var2, 23));
                return;
        }
    }

    public k1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f6725a = i11;
        this.f6727c = obj;
        this.d = obj2;
        this.f6726b = i10;
        this.e = obj3;
    }

    public k1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f6725a = i11;
        this.f6727c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f6726b = i10;
    }

    public k1(org.telegram.ui.e1 e1Var, int i10, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f6725a = 2;
        this.f6727c = e1Var;
        this.f6726b = i10;
        this.d = tL_channels_joinChannel;
        this.e = chat;
    }
}
