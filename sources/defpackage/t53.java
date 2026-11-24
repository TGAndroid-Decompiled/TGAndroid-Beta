package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.Wallet.c;
public final class t53 implements View.OnClickListener {
    public final byte a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public t53(u41 u41Var, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, fx0 fx0Var, u41 u41Var2, hv0 hv0Var, int i) {
        this.c = u41Var;
        this.d = tL_messages_requestUrlAuth;
        this.e = zArr;
        this.f = fx0Var;
        this.h = u41Var2;
        this.n = hv0Var;
        this.b = i;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        JSONObject jSONObject = null;
        int i = this.b;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((DataAutoDownloadActivity) obj6).n0((xgb) obj5, (xgb[]) obj4, this.b, (rj6[]) obj3, (ahb[]) obj2, (AnimatorSet[]) obj, view);
                return;
            case 1:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj5;
                boolean[] zArr = (boolean[]) obj4;
                fx0 fx0Var = (fx0) obj3;
                u41 u41Var = (u41) obj2;
                hv0 hv0Var = (hv0) obj;
                if (!((u41) obj6).R) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!u41Var.R) {
                            u41Var.setLoading(true);
                            if (hv0Var != null) {
                                boolean z = hv0.R0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                hv0Var.v("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_declineUrlAuth, new hc((byte) 0), new w77(zArr, fx0Var, (byte) 3));
                            return;
                        }
                        return;
                    }
                    zArr[0] = true;
                    fx0Var.dismiss();
                    return;
                }
                return;
            case 2:
                u41 u41Var2 = (u41) obj6;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj5;
                fx0[] fx0VarArr = (fx0[]) obj4;
                wjb wjbVar = (wjb) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                Activity activity = (Activity) obj;
                if (!u41Var2.R) {
                    u41Var2.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i2 = this.b;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_checkChatInvite, new vt0(u41Var2, fx0VarArr, wjbVar, i2, tL_messages_checkChatInvite));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr2[0] = true;
                        d01.s(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new nua(u41Var2), null, false, true, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                cj7[] cj7VarArr = (cj7[]) obj5;
                wjb wjbVar2 = (wjb) obj4;
                wla wlaVar = (wla) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    eu0 eu0Var = new eu0(zArr3, cj7VarArr, wjbVar2, wlaVar, (byte) 16);
                    if (wallettransaction.comment_encrypted_preparing) {
                        eu0Var.a(wallettransaction.comment, null);
                        return;
                    }
                    c C = c.C(i);
                    String str2 = wallettransaction.comment;
                    c.O("decrypting transaction comment");
                    C.E(true, false, false, new p(C, eu0Var, str, str2));
                    return;
                }
                return;
        }
    }

    public t53(u41 u41Var, TL_stars.StarsSubscription starsSubscription, int i, fx0[] fx0VarArr, wjb wjbVar, boolean[] zArr, Activity activity) {
        this.c = u41Var;
        this.d = starsSubscription;
        this.b = i;
        this.e = fx0VarArr;
        this.f = wjbVar;
        this.h = zArr;
        this.n = activity;
    }

    public t53(DataAutoDownloadActivity dataAutoDownloadActivity, xgb xgbVar, xgb[] xgbVarArr, int i, rj6[] rj6VarArr, ahb[] ahbVarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = xgbVar;
        this.e = xgbVarArr;
        this.b = i;
        this.f = rj6VarArr;
        this.h = ahbVarArr;
        this.n = animatorSetArr;
    }

    public t53(boolean[] zArr, cj7[] cj7VarArr, wjb wjbVar, wla wlaVar, TL_wallet.walletTransaction wallettransaction, int i, String str) {
        this.c = zArr;
        this.d = cj7VarArr;
        this.e = wjbVar;
        this.f = wlaVar;
        this.h = wallettransaction;
        this.b = i;
        this.n = str;
    }
}
