package bi;

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
import org.telegram.messenger.kh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class da implements Runnable {
    public final int f4502a;
    public final long f4503b;
    public final int f4504c;
    public final Object d;
    public final Object e;

    public da(Object obj, long j10, int i10, Object obj2, int i11) {
        this.f4502a = i11;
        this.d = obj;
        this.f4503b = j10;
        this.f4504c = i10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f4502a;
        boolean z10 = true;
        long j10 = this.f4503b;
        int i11 = this.f4504c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((fi.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.k3 k3Var = ((org.telegram.ui.ActionBar.k3[]) obj)[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                ca.y(i11, false).S();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(un.ba(j10));
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
                ((MessagesController) obj2).lambda$processUpdateArray$393(j10, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                return;
            case 5:
                ((MessagesController) obj2).lambda$processUpdateArray$394(j10, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                return;
            case 6:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$110(i11, j10, (TLRPC.Message) obj);
                return;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$107(i11, j10, (TLRPC.TL_messageReactions) obj);
                return;
            case 8:
                ((MessagesStorage) obj2).lambda$putWidgetStorage$43((String) obj, j10, i11);
                return;
            case 9:
                ((MessagesStorage) obj2).lambda$updateTopicData$51(j10, (TLRPC.TL_forumTopic) obj, i11);
                return;
            case 10:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$183(j10, i11, (TLRPC.TL_chatBannedRights) obj);
                return;
            case 11:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j10, i11, (byte[]) obj);
                return;
            case 12:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j10, i11);
                return;
            case 13:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j10, i11);
                return;
            case 14:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (j4Var.H0 != 0) {
                    j4Var.H0 = 0;
                    j4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            j4Var.P(j10, tL_contacts_resolvedPeer.users.get(0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                Float valueOf = Float.valueOf(((int[]) obj)[0] / i11);
                if (currentTimeMillis - j10 <= 250) {
                    z10 = false;
                }
                q6Var.run(valueOf, Boolean.valueOf(z10));
                return;
            case 16:
                int i12 = ProfileActivity.R6;
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
            case 17:
                uc.u uVar = (uc.u) obj;
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).f37489c;
                if (!z0Var.c(uVar, i11)) {
                    z0Var.d("closing stale connected websocket; attempt=" + i11);
                    uVar.c();
                    return;
                }
                z0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                org.telegram.ui.Wallet.w0 w0Var = z0Var.f37545o;
                try {
                    JSONArray put = new JSONArray().put(z0Var.f37535b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i13 = z0Var.f37538g + 1;
                    z0Var.f37538g = i13;
                    sb2.append(i13);
                    z0Var.f37537f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", z0Var.f37537f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    AndroidUtilities.cancelRunOnUIThread(w0Var);
                    AndroidUtilities.runOnUIThread(w0Var, 30000L);
                    z0Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    z0Var.f("could not encode subscription");
                    return;
                }
            case 18:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj2;
                kh khVar = (kh) obj;
                e2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.f4503b;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                e2Var.f36506f.sendRequestTyped(tonconnectgetpending, new Object(), new org.telegram.ui.Wallet.s1(e2Var, khVar, j11, this.f4504c, 0));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.u6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22366a;
                e2Var2.R = string;
                e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.l0.w(i11).l(j10, true)));
                org.telegram.messenger.t.p(R.string.WalletOK, alertDialog$Builder, null);
                return;
        }
    }

    public da(Object obj, long j10, Object obj2, int i10, int i11) {
        this.f4502a = i11;
        this.d = obj;
        this.f4503b = j10;
        this.e = obj2;
        this.f4504c = i10;
    }

    public da(Object obj, Object obj2, int i10, long j10, int i11) {
        this.f4502a = i11;
        this.d = obj;
        this.e = obj2;
        this.f4504c = i10;
        this.f4503b = j10;
    }

    public da(Object obj, Object obj2, long j10, int i10, int i11) {
        this.f4502a = i11;
        this.d = obj;
        this.e = obj2;
        this.f4503b = j10;
        this.f4504c = i10;
    }

    public da(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.f4502a = i11;
        this.d = messagesStorage;
        this.f4504c = i10;
        this.f4503b = j10;
        this.e = tLObject;
    }
}
