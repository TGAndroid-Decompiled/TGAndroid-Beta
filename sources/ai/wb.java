package ai;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.eh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;
public final class wb implements Runnable {
    public final int f2384a;
    public final long f2385b;
    public final int f2386c;
    public final Object d;
    public final Object e;

    public wb(Object obj, long j10, int i10, Object obj2, int i11) {
        this.f2384a = i11;
        this.d = obj;
        this.f2385b = j10;
        this.f2386c = i10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f2384a;
        boolean z10 = true;
        long j10 = this.f2385b;
        int i11 = this.f2386c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((ei.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                fa.y(i11, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(sn.W9(j10));
                    return;
                }
                return;
            case 1:
                ((MediaDataController) obj2).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) obj, j10, i11);
                return;
            case 2:
                ((MediaDataController) obj2).lambda$processLoadedStickers$104((ArrayList) obj, j10, i11);
                return;
            case 3:
                ((MessagesController) obj2).lambda$checkPromoInfoInternal$167(j10, (TLRPC.TL_help_promoData) obj, i11);
                return;
            case 4:
                ((MessagesController) obj2).lambda$processUpdateArray$391(j10, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                return;
            case 5:
                ((MessagesController) obj2).lambda$processUpdateArray$392(j10, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                return;
            case 6:
                ((MessagesStorage) obj2).lambda$updateTopicData$48(j10, (TLRPC.TL_forumTopic) obj, i11);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$107(i11, j10, (TLRPC.Message) obj);
                return;
            case 8:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$104(i11, j10, (TLRPC.TL_messageReactions) obj);
                return;
            case 9:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$180(j10, i11, (TLRPC.TL_chatBannedRights) obj);
                return;
            case 10:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j10, i11, (byte[]) obj);
                return;
            case 11:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j10, i11);
                return;
            case 12:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j10, i11);
                return;
            case 13:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (l4Var.G0 != 0) {
                    l4Var.G0 = 0;
                    l4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            l4Var.P(j10, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((int[]) obj)[0] / i11);
                if (currentTimeMillis - j10 <= 250) {
                    z10 = false;
                }
                p6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 15:
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
            case 16:
                tc.u uVar = (tc.u) obj;
                org.telegram.ui.Wallet.a1 a1Var = ((org.telegram.ui.Wallet.z0) obj2).f35188c;
                if (!a1Var.c(uVar, i11)) {
                    a1Var.d("closing stale connected websocket; attempt=" + i11);
                    uVar.c();
                    return;
                }
                a1Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                org.telegram.ui.Wallet.x0 x0Var = a1Var.f33967o;
                try {
                    JSONArray put = new JSONArray().put(a1Var.f33957b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = a1Var.f33960g + 1;
                    a1Var.f33960g = i12;
                    sb2.append(i12);
                    a1Var.f33959f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", a1Var.f33959f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    AndroidUtilities.cancelRunOnUIThread(x0Var);
                    AndroidUtilities.runOnUIThread(x0Var, 30000L);
                    a1Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    a1Var.f("could not encode subscription");
                    return;
                }
            case 17:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj2;
                eh ehVar = (eh) obj;
                f2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.f2385b;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                f2Var.f34194f.sendRequestTyped(tonconnectgetpending, new Object(), new org.telegram.ui.Wallet.t1(f2Var, ehVar, j11, this.f2386c, 0));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.d6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.m0.w(i11).l(j10, true)));
                org.telegram.messenger.q.p(R.string.WalletOK, alertDialog$Builder, null);
                return;
        }
    }

    public wb(Object obj, long j10, Object obj2, int i10, int i11) {
        this.f2384a = i11;
        this.d = obj;
        this.f2385b = j10;
        this.e = obj2;
        this.f2386c = i10;
    }

    public wb(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f2384a = i11;
        this.d = obj;
        this.e = obj2;
        this.f2386c = i10;
        this.f2385b = j10;
    }

    public wb(Object obj, Object obj2, long j10, int i10, int i11) {
        this.f2384a = i11;
        this.d = obj;
        this.e = obj2;
        this.f2385b = j10;
        this.f2386c = i10;
    }

    public wb(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.f2384a = i11;
        this.d = messagesStorage;
        this.f2386c = i10;
        this.f2385b = j10;
        this.e = tLObject;
    }
}
