package ai;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.vt0;
public final class u0 implements Utilities.Callback2 {
    public final int f2237a;
    public final int f2238b;
    public final Object f2239c;
    public final Object d;
    public final Object e;

    public u0(int i10, org.telegram.ui.ActionBar.o2 o2Var, pf.c cVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f2237a = 0;
        this.f2238b = i10;
        this.f2239c = o2Var;
        this.d = cVar;
        this.e = c2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f2237a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f2239c;
                pf.c cVar = (pf.c) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.f2238b).lambda$processUpdates$377(updates, false);
                }
                AndroidUtilities.runOnUIThread(new y0(o2Var, tL_error, cVar, c2Var, 0));
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f2239c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                Long l4 = (Long) obj;
                String str = (String) obj2;
                if (l4 != null && l4.longValue() != 0) {
                    int i10 = this.f2238b;
                    GiftAuctionController.getInstance(i10).requestAuctionUpgrades(l4.longValue(), new d5(zArr, context, g6Var, i10, str, 0));
                    return;
                }
                zArr[0] = false;
                return;
            case 2:
                gi.c1 c1Var = (gi.c1) this.d;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((int[]) this.f2239c)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                TLRPC.WebPage webPage = null;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j10 = webPage2.f20496id;
                                int i11 = this.f2238b;
                                gi.e1 e1Var = new gi.e1(j10, notificationCenterDelegateArr, i11, c1Var);
                                notificationCenterDelegateArr[0] = e1Var;
                                NotificationCenter.getInstance(i11).addObserver(e1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            c1Var.run(webPage);
                            return;
                        }
                        c1Var.run(null);
                        return;
                    }
                }
                c1Var.run(null);
                return;
            case 3:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f2239c;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    c2VarArr[0] = null;
                }
                if (tL_error3 != null) {
                    org.telegram.ui.Components.xc.a0(o2Var2).f0(tL_error3, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.v0.p(R.string.CommunityNoChatsToAdd, org.telegram.ui.Components.xc.a0(o2Var2), R.raw.info, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        o2Var2.showDialog(new hi.k0(o2Var2, 0L, arrayList, new gi.g4(o2Var2, chat, this.f2238b, 1)));
                        return;
                    } else {
                        org.telegram.ui.Components.xc.a0(o2Var2).Q(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.e1 e1Var2 = (org.telegram.ui.e1) this.f2239c;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.e;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i12 = this.f2238b;
                if (tL_error4 != null) {
                    AndroidUtilities.runOnUIThread(new db(e1Var2, i12, tL_error4, tL_channels_joinChannel, 11));
                    return;
                }
                boolean z11 = false;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i13 = 0;
                    while (true) {
                        if (i13 < updates2.updates.size()) {
                            TLRPC.Update update = updates2.updates.get(i13);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z10 = true;
                            } else {
                                i13++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    MessagesController.getInstance(i12).lambda$processUpdates$377(updates2, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    AndroidUtilities.runOnUIThread(new ah.o(i12, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 29));
                    z11 = true;
                }
                if (!z11) {
                    MessagesController.getInstance(i12).generateJoinMessage(chat2.f20343id, true);
                }
                AndroidUtilities.runOnUIThread(new vt0(e1Var2, 5));
                AndroidUtilities.runOnUIThread(new ah.g(i12, chat2, 18), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                long j11 = chat2.f20343id;
                messagesStorage.updateDialogsWithDeletedMessages(-j11, j11, new ArrayList<>(), null);
                return;
            case 5:
                org.telegram.ui.Components.e0.Z((org.telegram.ui.Components.e0) this.f2239c, (org.telegram.ui.ActionBar.n5) this.d, this.f2238b, (TLRPC.TL_messages_composeMessageWithAI) this.e, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 6:
                org.telegram.ui.Components.e0.V((org.telegram.ui.Components.e0) this.f2239c, (org.telegram.ui.ActionBar.n5) this.d, this.f2238b, (TLRPC.TL_messages_composeRichMessageWithAI) this.e, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 7:
                boolean[] zArr2 = (boolean[]) this.f2239c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str2 != null) {
                        arrayList2.set(this.f2238b, str2);
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14) == null) {
                                return;
                            }
                        }
                        zArr2[0] = true;
                        callback2.run(TextUtils.join("", arrayList2), Boolean.FALSE);
                        return;
                    }
                    zArr2[0] = true;
                    callback2.run(null, bool);
                    return;
                }
                return;
            case 8:
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((ei.d) this.f2239c).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20678a.setOnDismissListener(new org.telegram.ui.v5(h3Var, 9));
                        alertDialog$Builder.p();
                        return;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str3 != null) {
                            new org.telegram.ui.Components.xc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0(str3, false);
                            return;
                        } else if (passkey != null) {
                            int i15 = this.f2238b;
                            MessagesController.getInstance(i15).removeSuggestion(0L, "SETUP_PASSKEY");
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
                                ConnectionsManager.getInstance(i15).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new org.telegram.ui.p6(h3Var, passkey, str3, 3));
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
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                ((Runnable[]) this.f2239c)[0] = null;
                TextView textView = ((TextView[]) this.d)[0];
                if (textView != null && wallettransaction != null) {
                    long j12 = wallettransaction.fee;
                    if (j12 > 0) {
                        textView.setText(org.telegram.ui.Wallet.o5.r0(this.f2238b, j12, g6Var2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public u0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2237a = i11;
        this.f2239c = obj;
        this.f2238b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public u0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f2237a = i11;
        this.f2239c = obj;
        this.d = obj2;
        this.f2238b = i10;
        this.e = obj3;
    }

    public u0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f2237a = i11;
        this.f2239c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2238b = i10;
    }

    public u0(org.telegram.ui.ActionBar.c2[] c2VarArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Chat chat) {
        this.f2237a = 3;
        this.d = c2VarArr;
        this.f2239c = o2Var;
        this.f2238b = i10;
        this.e = chat;
    }
}
