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
import org.telegram.ui.fo;
public final class k7 implements Runnable {
    public final int f17666a;
    public final Object f17667b;
    public final long f17668c;
    public final int d;
    public final Object e;

    public k7(Object obj, long j10, int i10, Object obj2, int i11) {
        this.f17666a = i11;
        this.f17667b = obj;
        this.f17668c = j10;
        this.d = i10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f17666a;
        boolean z10 = true;
        long j10 = this.f17668c;
        int i11 = this.d;
        Object obj = this.e;
        Object obj2 = this.f17667b;
        switch (i10) {
            case 0:
                ((MediaDataController) obj2).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) obj, j10, i11);
                return;
            case 1:
                ((MediaDataController) obj2).lambda$processLoadedStickers$104((ArrayList) obj, j10, i11);
                return;
            case 2:
                ((MessagesController) obj2).lambda$checkPromoInfoInternal$167(j10, (TLRPC.TL_help_promoData) obj, i11);
                return;
            case 3:
                ((MessagesController) obj2).lambda$processUpdateArray$391(j10, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                return;
            case 4:
                ((MessagesController) obj2).lambda$processUpdateArray$392(j10, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                return;
            case 5:
                ((MessagesStorage) obj2).lambda$updateTopicData$48(j10, (TLRPC.TL_forumTopic) obj, i11);
                return;
            case 6:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$107(i11, j10, (TLRPC.Message) obj);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$104(i11, j10, (TLRPC.TL_messageReactions) obj);
                return;
            case 8:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$180(j10, i11, (TLRPC.TL_chatBannedRights) obj);
                return;
            case 9:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j10, i11, (byte[]) obj);
                return;
            case 10:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j10, i11);
                return;
            case 11:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j10, i11);
                return;
            case 12:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (k4Var.G0 != 0) {
                    k4Var.G0 = 0;
                    k4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            k4Var.P(j10, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((int[]) obj)[0] / i11);
                if (currentTimeMillis - j10 <= 250) {
                    z10 = false;
                }
                q6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 14:
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
            case 15:
                tc.u uVar = (tc.u) obj;
                org.telegram.ui.Wallet.y0 y0Var = ((org.telegram.ui.Wallet.x0) obj2).f33829c;
                if (!y0Var.c(uVar, i11)) {
                    y0Var.d("closing stale connected websocket; attempt=" + i11);
                    uVar.c();
                    return;
                }
                y0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                org.telegram.ui.Wallet.v0 v0Var = y0Var.f33873o;
                try {
                    JSONArray put = new JSONArray().put(y0Var.f33863b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = y0Var.f33866g + 1;
                    y0Var.f33866g = i12;
                    sb2.append(i12);
                    y0Var.f33865f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", y0Var.f33865f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    AndroidUtilities.cancelRunOnUIThread(v0Var);
                    AndroidUtilities.runOnUIThread(v0Var, 30000L);
                    y0Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    y0Var.f("could not encode subscription");
                    return;
                }
            case 16:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj2;
                mh mhVar = (mh) obj;
                d2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.f17668c;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                d2Var.f33043f.sendRequestTyped(tonconnectgetpending, new Object(), new org.telegram.ui.Wallet.q1(d2Var, mhVar, j11, this.d, 0));
                return;
            case 17:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.c6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.j0.v(i11).l(j10, true)));
                q.A(R.string.WalletOK, alertDialog$Builder, null);
                return;
            default:
                ((di.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) obj)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                zh.n5.y(i11, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(fo.W9(j10));
                    return;
                }
                return;
        }
    }

    public k7(Object obj, long j10, Object obj2, int i10, int i11) {
        this.f17666a = i11;
        this.f17667b = obj;
        this.f17668c = j10;
        this.e = obj2;
        this.d = i10;
    }

    public k7(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f17666a = i11;
        this.f17667b = obj;
        this.e = obj2;
        this.d = i10;
        this.f17668c = j10;
    }

    public k7(Object obj, Object obj2, long j10, int i10, int i11) {
        this.f17666a = i11;
        this.f17667b = obj;
        this.e = obj2;
        this.f17668c = j10;
        this.d = i10;
    }

    public k7(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.f17666a = i11;
        this.f17667b = messagesStorage;
        this.d = i10;
        this.f17668c = j10;
        this.e = tLObject;
    }
}
