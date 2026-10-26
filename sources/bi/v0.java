package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.vj0;
import org.telegram.ui.xj0;
import org.telegram.ui.zt0;
public final class v0 implements Utilities.Callback2 {
    public final int f5535a;
    public final int f5536b;
    public final Object f5537c;
    public final Object d;
    public final Object e;

    public v0(int i10, org.telegram.ui.ActionBar.r2 r2Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f5535a = 0;
        this.f5536b = i10;
        this.f5537c = r2Var;
        this.d = cVar;
        this.e = e2Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        ViewGroup f02;
        ViewGroup f03;
        ArrayList arrayList;
        int i12 = this.f5535a;
        int i13 = this.f5536b;
        int i14 = 0;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f5537c;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj5;
                qf.c cVar = (qf.c) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(i13).lambda$processUpdates$379(updates, false);
                }
                AndroidUtilities.runOnUIThread(new ai.e0(r2Var, tL_error, cVar, e2Var, 4));
                return;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj3;
                Long l4 = (Long) obj;
                String str = (String) obj2;
                if (l4 != null && l4.longValue() != 0) {
                    int i15 = this.f5536b;
                    GiftAuctionController.getInstance(i15).requestAuctionUpgrades(l4.longValue(), new y4(zArr, context, u6Var, i15, str, 0));
                    return;
                }
                zArr[0] = false;
                return;
            case 2:
                hi.j1 j1Var = (hi.j1) obj4;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j10 = webPage2.f22182id;
                                int i16 = this.f5536b;
                                hi.l1 l1Var = new hi.l1(j10, notificationCenterDelegateArr, i16, j1Var);
                                notificationCenterDelegateArr[0] = l1Var;
                                NotificationCenter.getInstance(i16).addObserver(l1Var, NotificationCenter.didReceivedWebpagesInUpdates);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            } else {
                                webPage = null;
                            }
                            j1Var.run(webPage);
                            return;
                        }
                        j1Var.run(null);
                        return;
                    }
                }
                j1Var.run(null);
                return;
            case 3:
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj4;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr[0];
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    e2VarArr[0] = null;
                }
                if (tL_error3 != null) {
                    org.telegram.ui.Components.wc.b0(r2Var2).g0(tL_error3, false);
                    return;
                } else if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        org.telegram.messenger.t.q(R.string.CommunityNoChatsToAdd, org.telegram.ui.Components.wc.b0(r2Var2), R.raw.info, 36);
                        return;
                    } else if (!arrayList2.isEmpty()) {
                        r2Var2.showDialog(new ii.j0(r2Var2, 0L, arrayList2, new hi.p4(r2Var2, chat, i13, 1)));
                        return;
                    } else {
                        org.telegram.ui.Components.wc.b0(r2Var2).R(R.raw.info, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i17 = this.f5536b;
                if (tL_error4 != null) {
                    AndroidUtilities.runOnUIThread(new ai.h1(c1Var, i17, tL_error4, tL_channels_joinChannel, 13));
                    return;
                }
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i18 = 0;
                    while (true) {
                        if (i18 < updates2.updates.size()) {
                            TLRPC.Update update = updates2.updates.get(i18);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                i10 = 1;
                            } else {
                                i18++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    MessagesController.getInstance(i17).lambda$processUpdates$379(updates2, false);
                    i14 = i10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    AndroidUtilities.runOnUIThread(new ai.h0(i17, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 29));
                    i14 = 1;
                }
                if (i14 == 0) {
                    MessagesController.getInstance(i17).generateJoinMessage(chat2.f22027id, true);
                }
                AndroidUtilities.runOnUIThread(new zt0(c1Var, 5));
                AndroidUtilities.runOnUIThread(new ag.r0(i17, chat2, 18), 1000L);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i17);
                long j11 = chat2.f22027id;
                messagesStorage.updateDialogsWithDeletedMessages(-j11, j11, new ArrayList<>(), null);
                return;
            case 5:
                org.telegram.ui.Components.e0.Z((org.telegram.ui.Components.e0) obj5, (org.telegram.ui.ActionBar.b6) obj4, this.f5536b, (TLRPC.TL_messages_composeMessageWithAI) obj3, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 6:
                org.telegram.ui.Components.e0.V((org.telegram.ui.Components.e0) obj5, (org.telegram.ui.ActionBar.b6) obj4, this.f5536b, (TLRPC.TL_messages_composeRichMessageWithAI) obj3, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                return;
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str2 != null) {
                        arrayList3.set(i13, str2);
                        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                            if (arrayList3.get(i19) == null) {
                                return;
                            }
                        }
                        zArr2[0] = true;
                        callback2.run(TextUtils.join("", arrayList3), Boolean.FALSE);
                        return;
                    }
                    zArr2[0] = true;
                    callback2.run(null, bool);
                    return;
                }
                return;
            case 8:
                xj0 xj0Var = (xj0) obj5;
                vj0 vj0Var = (vj0) obj4;
                Context context2 = (Context) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                ArrayList arrayList5 = xj0Var.f45785c;
                if (i13 != 2 || !TextUtils.isEmpty(xj0Var.N)) {
                    ArrayList arrayList6 = vj0Var.f44838a;
                    int size = arrayList6.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj6 = arrayList6.get(i20);
                        i20++;
                        if (obj6 instanceof MessageObject) {
                            MessageObject messageObject = (MessageObject) obj6;
                            ArrayList arrayList7 = (ArrayList) vj0Var.f44840c.get(messageObject);
                            int i21 = org.telegram.ui.Cells.v3.f25583a;
                            t61 K = t61.K(org.telegram.ui.Cells.v3.class);
                            K.G = messageObject;
                            if (arrayList7 == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(arrayList7);
                            }
                            K.H = arrayList;
                            K.d = messageObject.getId();
                            K.B = messageObject.getDialogId();
                            arrayList4.add(K);
                        } else if (!arrayList5.isEmpty()) {
                            HashSet hashSet = xj0Var.d;
                            org.telegram.ui.t3 t3Var = new org.telegram.ui.t3(xj0Var, 14);
                            int i22 = org.telegram.ui.Cells.r3.f24960a;
                            t61 K2 = t61.K(org.telegram.ui.Cells.r3.class);
                            K2.G = new org.telegram.ui.Cells.s3(arrayList5, hashSet, t3Var);
                            arrayList4.add(K2);
                        } else if (xj0Var.f45788r) {
                            arrayList4.add(t61.e(-2, LocaleController.getString(R.string.Retry)));
                        }
                    }
                    if ((i13 == 2 || !vj0Var.f44847m) && (vj0Var.h || !vj0Var.f44843i)) {
                        while (true) {
                            if (vj0Var.f44838a.isEmpty()) {
                                i11 = 3;
                            } else {
                                i11 = 1;
                            }
                            if (i14 < i11) {
                                arrayList4.add(t61.q((-10) - i14, 39));
                                i14++;
                            }
                        }
                    } else if (vj0Var.f44845k) {
                        if (vj0Var.f44841f == null) {
                            if (i13 == 2) {
                                f03 = xj0Var.g0(context2);
                            } else {
                                f03 = xj0Var.f0(context2, vj0Var.f44842g);
                            }
                            vj0Var.f44841f = f03;
                        }
                        ViewGroup viewGroup = vj0Var.f44841f;
                        t61 t61Var = new t61(-3);
                        t61Var.f32869c = viewGroup;
                        t61Var.f32888z = 0;
                        t61Var.f32887y = 1;
                        arrayList4.add(t61Var);
                    } else if (!vj0Var.h && vj0Var.f44843i && (arrayList4.isEmpty() || (vj0Var.f44844j && i13 != 2))) {
                        if (vj0Var.f44841f == null) {
                            if (i13 == 2) {
                                f02 = xj0Var.g0(context2);
                            } else {
                                f02 = xj0Var.f0(context2, vj0Var.f44842g);
                            }
                            vj0Var.f44841f = f02;
                        }
                        if (arrayList4.isEmpty()) {
                            ViewGroup viewGroup2 = vj0Var.f44841f;
                            t61 t61Var2 = new t61(-3);
                            t61Var2.f32869c = viewGroup2;
                            t61Var2.f32888z = 0;
                            t61Var2.f32887y = 1;
                            arrayList4.add(t61Var2);
                        } else {
                            ((t61) ic.a.g(1, arrayList4)).f32873j = true;
                            ViewGroup viewGroup3 = vj0Var.f44841f;
                            t61 t61Var3 = new t61(-1);
                            t61Var3.f32869c = viewGroup3;
                            t61Var3.f32888z = -2;
                            arrayList4.add(t61Var3);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        ((t61) ic.a.g(1, arrayList4)).f32873j = true;
                        return;
                    }
                    return;
                }
                return;
            case 9:
                Context context3 = (Context) obj4;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((fi.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3);
                        String string = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder.f22368a;
                        e2Var3.R = string;
                        e2Var3.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        e2Var3.setOnDismissListener(new org.telegram.ui.u5(k3Var, 9));
                        alertDialog$Builder.p();
                        return;
                    }
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        if (str3 != null) {
                            new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0(str3, false);
                            return;
                        } else if (passkey != null) {
                            MessagesController.getInstance(i13).removeSuggestion(0L, "SETUP_PASSKEY");
                            if (U instanceof PasskeysActivity) {
                                k3Var.dismiss();
                                ((PasskeysActivity) U).Z(passkey);
                                return;
                            } else if (U instanceof PrivacySettingsActivity) {
                                k3Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) U;
                                ArrayList arrayList8 = privacySettingsActivity.e;
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(passkey);
                                privacySettingsActivity.B0(true);
                                U.presentFragment(new PasskeysActivity(arrayList8));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new Object(), new org.telegram.ui.q6(k3Var, passkey, str3, 3));
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
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j12 = wallettransaction.fee;
                    if (j12 > 0) {
                        textView.setText(org.telegram.ui.Wallet.m5.s0(i13, j12, u6Var2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public v0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f5535a = i11;
        this.f5537c = obj;
        this.f5536b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public v0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f5535a = i11;
        this.f5537c = obj;
        this.d = obj2;
        this.f5536b = i10;
        this.e = obj3;
    }

    public v0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f5535a = i11;
        this.f5537c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5536b = i10;
    }

    public v0(org.telegram.ui.ActionBar.e2[] e2VarArr, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Chat chat) {
        this.f5535a = 3;
        this.d = e2VarArr;
        this.f5537c = r2Var;
        this.f5536b = i10;
        this.e = chat;
    }
}
