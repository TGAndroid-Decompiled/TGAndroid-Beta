package di;

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
public final class y9 implements View.OnClickListener {
    public final int f9806a = 2;
    public final int f9807b;
    public final Object f9808c;
    public final Object d;
    public final Object f9809e;
    public final Object f9810f;
    public final Object h;
    public final Object f9811n;

    public y9(hi.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.u2 u2Var, hi.d dVar2, org.telegram.ui.web.v0 v0Var, int i7) {
        this.f9808c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.f9809e = u2Var;
        this.f9810f = dVar2;
        this.f9811n = v0Var;
        this.f9807b = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f9806a;
        JSONObject jSONObject = null;
        int i10 = this.f9807b;
        Object obj = this.f9811n;
        Object obj2 = this.f9809e;
        Object obj3 = this.d;
        Object obj4 = this.f9810f;
        Object obj5 = this.f9808c;
        Object obj6 = this.h;
        switch (i7) {
            case 0:
                hi.d dVar = (hi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i11 = this.f9807b;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_checkChatInvite, new bg.k0(dVar, u2VarArr, e6Var, i11, tL_messages_checkChatInvite, 1));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        vf.c.s(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new na(dVar), null, false, true, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                DataAutoDownloadActivity.Z((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.m8) obj3, (org.telegram.ui.Cells.m8[]) obj2, this.f9807b, (org.telegram.ui.Cells.b5[]) obj4, (org.telegram.ui.Cells.q8[]) obj6, (AnimatorSet[]) obj, view);
                return;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj2;
                hi.d dVar2 = (hi.d) obj4;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj;
                if (!((hi.d) obj5).R) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.R) {
                            dVar2.setLoading(true);
                            if (v0Var != null) {
                                boolean z10 = org.telegram.ui.web.v0.R0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                v0Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new d3.b(1), new bi.e4(20, zArr2, u2Var));
                            return;
                        }
                        return;
                    }
                    zArr2[0] = true;
                    u2Var.dismiss();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.x2[] x2VarArr = (org.telegram.ui.Wallet.x2[]) obj5;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj4;
                xh.l lVar = (xh.l) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.q qVar = new org.telegram.ui.Wallet.q(zArr3, x2VarArr, e6Var2, lVar, 9);
                    if (wallettransaction.comment_encrypted_preparing) {
                        qVar.a(wallettransaction.comment, null);
                        return;
                    }
                    org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i10);
                    String str2 = wallettransaction.comment;
                    org.telegram.ui.Wallet.l0.H("decrypting transaction comment");
                    x10.z(new org.telegram.ui.Wallet.j(x10, qVar, str, str2), true, false);
                    return;
                }
                return;
        }
    }

    public y9(hi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, Activity activity) {
        this.f9808c = dVar;
        this.d = starsSubscription;
        this.f9807b = i7;
        this.f9809e = u2VarArr;
        this.f9810f = e6Var;
        this.h = zArr;
        this.f9811n = activity;
    }

    public y9(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8 m8Var, org.telegram.ui.Cells.m8[] m8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr) {
        this.f9808c = dataAutoDownloadActivity;
        this.d = m8Var;
        this.f9809e = m8VarArr;
        this.f9807b = i7;
        this.f9810f = b5VarArr;
        this.h = q8VarArr;
        this.f9811n = animatorSetArr;
    }

    public y9(boolean[] zArr, org.telegram.ui.Wallet.x2[] x2VarArr, org.telegram.ui.ActionBar.e6 e6Var, xh.l lVar, TL_wallet.walletTransaction wallettransaction, int i7, String str) {
        this.h = zArr;
        this.f9808c = x2VarArr;
        this.f9810f = e6Var;
        this.d = lVar;
        this.f9809e = wallettransaction;
        this.f9807b = i7;
        this.f9811n = str;
    }
}
