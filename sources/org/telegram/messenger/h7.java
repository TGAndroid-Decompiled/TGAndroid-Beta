package org.telegram.messenger;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;
public final class h7 implements Runnable {
    public final int f18063a;
    public final Object f18064b;
    public final long f18065c;
    public final int d;
    public final Object f18066e;

    public h7(Object obj, long j3, int i10, Object obj2, int i11) {
        this.f18063a = i11;
        this.f18064b = obj;
        this.f18065c = j3;
        this.d = i10;
        this.f18066e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f18063a;
        boolean z10 = true;
        long j3 = this.f18065c;
        int i11 = this.d;
        Object obj = this.f18066e;
        Object obj2 = this.f18064b;
        switch (i10) {
            case 0:
                ((MediaDataController) obj2).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) obj, j3, i11);
                return;
            case 1:
                ((MediaDataController) obj2).lambda$processLoadedStickers$104((ArrayList) obj, j3, i11);
                return;
            case 2:
                ((MessagesController) obj2).lambda$checkPromoInfoInternal$167(j3, (TLRPC.TL_help_promoData) obj, i11);
                return;
            case 3:
                ((MessagesController) obj2).lambda$processUpdateArray$391(j3, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                return;
            case 4:
                ((MessagesController) obj2).lambda$processUpdateArray$392(j3, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                return;
            case 5:
                ((MessagesStorage) obj2).lambda$updateTopicData$48(j3, (TLRPC.TL_forumTopic) obj, i11);
                return;
            case 6:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$107(i11, j3, (TLRPC.Message) obj);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$104(i11, j3, (TLRPC.TL_messageReactions) obj);
                return;
            case 8:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$180(j3, i11, (TLRPC.TL_chatBannedRights) obj);
                return;
            case 9:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j3, i11, (byte[]) obj);
                return;
            case 10:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j3, i11);
                return;
            case 11:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j3, i11);
                return;
            case 12:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (h4Var.G0 != 0) {
                    h4Var.G0 = 0;
                    h4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            h4Var.P(j3, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.k6 k6Var = (org.telegram.ui.k6) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((int[]) obj)[0] / i11);
                if (currentTimeMillis - j3 <= 250) {
                    z10 = false;
                }
                k6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 14:
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j3, (ArrayList) obj);
                return;
            case 15:
                sc.u uVar = (sc.u) obj;
                org.telegram.ui.Wallet.a1 a1Var = ((org.telegram.ui.Wallet.z0) obj2).f35801c;
                if (!a1Var.c(uVar, i11)) {
                    a1Var.d("closing stale connected websocket; attempt=" + i11);
                    uVar.c();
                    return;
                }
                a1Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j3) + " ms");
                org.telegram.ui.Wallet.x0 x0Var = a1Var.f34680o;
                try {
                    JSONArray put = new JSONArray().put(a1Var.f34669b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = a1Var.f34673g + 1;
                    a1Var.f34673g = i12;
                    sb2.append(i12);
                    a1Var.f34672f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", a1Var.f34672f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    AndroidUtilities.cancelRunOnUIThread(x0Var);
                    AndroidUtilities.runOnUIThread(x0Var, 30000L);
                    a1Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    a1Var.f("could not encode subscription");
                    return;
                }
            case 16:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj2;
                jh jhVar = (jh) obj;
                f2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j10 = this.f18065c;
                tonconnectgetpending.session_id = Long.valueOf(j10);
                f2Var.f34928f.sendRequestTyped(tonconnectgetpending, new Object(), new org.telegram.ui.Wallet.s1(f2Var, jhVar, j10, this.d, 0));
                return;
            case 17:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.d6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.l0.v(i11).l(j3, true)));
                q.p(R.string.WalletOK, alertDialog$Builder, null);
                return;
            default:
                ((ci.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) obj)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                yh.n5.y(i11, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.W9(j3));
                    return;
                }
                return;
        }
    }

    public h7(Object obj, long j3, Object obj2, int i10, int i11) {
        this.f18063a = i11;
        this.f18064b = obj;
        this.f18065c = j3;
        this.f18066e = obj2;
        this.d = i10;
    }

    public h7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.f18063a = i11;
        this.f18064b = obj;
        this.f18066e = obj2;
        this.d = i10;
        this.f18065c = j3;
    }

    public h7(Object obj, Object obj2, long j3, int i10, int i11) {
        this.f18063a = i11;
        this.f18064b = obj;
        this.f18066e = obj2;
        this.f18065c = j3;
        this.d = i10;
    }

    public h7(MessagesStorage messagesStorage, int i10, long j3, TLObject tLObject, int i11) {
        this.f18063a = i11;
        this.f18064b = messagesStorage;
        this.d = i10;
        this.f18065c = j3;
        this.f18066e = tLObject;
    }
}
