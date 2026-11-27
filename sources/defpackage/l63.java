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
public final class l63 implements View.OnClickListener {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public l63(c51 c51Var, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, nx0 nx0Var, c51 c51Var2, rv0 rv0Var, int i) {
        this.c = c51Var;
        this.d = tL_messages_requestUrlAuth;
        this.e = zArr;
        this.f = nx0Var;
        this.h = c51Var2;
        this.n = rv0Var;
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
                ((DataAutoDownloadActivity) obj6).n0((tkb) obj5, (tkb[]) obj4, this.b, (wl6[]) obj3, (wkb[]) obj2, (AnimatorSet[]) obj, view);
                return;
            case 1:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj5;
                boolean[] zArr = (boolean[]) obj4;
                nx0 nx0Var = (nx0) obj3;
                c51 c51Var = (c51) obj2;
                rv0 rv0Var = (rv0) obj;
                if (!((c51) obj6).R) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!c51Var.R) {
                            c51Var.setLoading(true);
                            if (rv0Var != null) {
                                boolean z = rv0.R0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                rv0Var.v("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_declineUrlAuth, new ic((byte) 0), new ia7(zArr, nx0Var, (byte) 3));
                            return;
                        }
                        return;
                    }
                    zArr[0] = true;
                    nx0Var.dismiss();
                    return;
                }
                return;
            case 2:
                c51 c51Var2 = (c51) obj6;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj5;
                nx0[] nx0VarArr = (nx0[]) obj4;
                vnb vnbVar = (vnb) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                Activity activity = (Activity) obj;
                if (!c51Var2.R) {
                    c51Var2.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i2 = this.b;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_checkChatInvite, new eu0(c51Var2, nx0VarArr, vnbVar, i2, tL_messages_checkChatInvite));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr2[0] = true;
                        m01.t(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new rya(c51Var2), null, false, true, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                jl7[] jl7VarArr = (jl7[]) obj5;
                vnb vnbVar2 = (vnb) obj4;
                tpa tpaVar = (tpa) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    nu0 nu0Var = new nu0(zArr3, jl7VarArr, vnbVar2, tpaVar, (byte) 16);
                    if (wallettransaction.comment_encrypted_preparing) {
                        nu0Var.a(wallettransaction.comment, null);
                        return;
                    }
                    c C = c.C(i);
                    String str2 = wallettransaction.comment;
                    c.P("decrypting transaction comment");
                    C.E(true, false, false, new p(C, nu0Var, str, str2));
                    return;
                }
                return;
        }
    }

    public l63(c51 c51Var, TL_stars.StarsSubscription starsSubscription, int i, nx0[] nx0VarArr, vnb vnbVar, boolean[] zArr, Activity activity) {
        this.c = c51Var;
        this.d = starsSubscription;
        this.b = i;
        this.e = nx0VarArr;
        this.f = vnbVar;
        this.h = zArr;
        this.n = activity;
    }

    public l63(DataAutoDownloadActivity dataAutoDownloadActivity, tkb tkbVar, tkb[] tkbVarArr, int i, wl6[] wl6VarArr, wkb[] wkbVarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = tkbVar;
        this.e = tkbVarArr;
        this.b = i;
        this.f = wl6VarArr;
        this.h = wkbVarArr;
        this.n = animatorSetArr;
    }

    public l63(boolean[] zArr, jl7[] jl7VarArr, vnb vnbVar, tpa tpaVar, TL_wallet.walletTransaction wallettransaction, int i, String str) {
        this.c = zArr;
        this.d = jl7VarArr;
        this.e = vnbVar;
        this.f = tpaVar;
        this.h = wallettransaction;
        this.b = i;
        this.n = str;
    }
}
