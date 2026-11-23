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
public final class ba implements View.OnClickListener {
    public final int f8560a = 2;
    public final int f8561b;
    public final Object f8562c;
    public final Object d;
    public final Object f8563e;
    public final Object f8564f;
    public final Object h;
    public final Object f8565n;

    public ba(hi.e eVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.w2 w2Var, hi.e eVar2, org.telegram.ui.web.v0 v0Var, int i7) {
        this.f8562c = eVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.f8563e = w2Var;
        this.f8564f = eVar2;
        this.f8565n = v0Var;
        this.f8561b = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f8560a;
        JSONObject jSONObject = null;
        int i10 = this.f8561b;
        Object obj = this.f8565n;
        Object obj2 = this.f8563e;
        Object obj3 = this.d;
        Object obj4 = this.f8564f;
        Object obj5 = this.f8562c;
        Object obj6 = this.h;
        switch (i7) {
            case 0:
                hi.e eVar = (hi.e) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i11 = this.f8561b;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_checkChatInvite, new bg.l0(eVar, w2VarArr, i6Var, i11, tL_messages_checkChatInvite, 1));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        vf.c.s(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new qa(eVar), null, false, true, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                DataAutoDownloadActivity.Z((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.n8) obj3, (org.telegram.ui.Cells.n8[]) obj2, this.f8561b, (org.telegram.ui.Cells.c5[]) obj4, (org.telegram.ui.Cells.r8[]) obj6, (AnimatorSet[]) obj, view);
                return;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj2;
                hi.e eVar2 = (hi.e) obj4;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj;
                if (!((hi.e) obj5).R) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!eVar2.R) {
                            eVar2.setLoading(true);
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
                            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new d3.b(1), new bi.r6(24, zArr2, w2Var));
                            return;
                        }
                        return;
                    }
                    zArr2[0] = true;
                    w2Var.dismiss();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.f3[] f3VarArr = (org.telegram.ui.Wallet.f3[]) obj5;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                xh.l lVar = (xh.l) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.t tVar = new org.telegram.ui.Wallet.t(zArr3, f3VarArr, i6Var2, lVar, 9);
                    if (wallettransaction.comment_encrypted_preparing) {
                        tVar.a(wallettransaction.comment, null);
                        return;
                    }
                    org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i10);
                    String str2 = wallettransaction.comment;
                    org.telegram.ui.Wallet.v0.P("decrypting transaction comment");
                    D.F(true, false, false, new org.telegram.ui.Wallet.j(D, tVar, str, str2));
                    return;
                }
                return;
        }
    }

    public ba(hi.e eVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.i6 i6Var, boolean[] zArr, Activity activity) {
        this.f8562c = eVar;
        this.d = starsSubscription;
        this.f8561b = i7;
        this.f8563e = w2VarArr;
        this.f8564f = i6Var;
        this.h = zArr;
        this.f8565n = activity;
    }

    public ba(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        this.f8562c = dataAutoDownloadActivity;
        this.d = n8Var;
        this.f8563e = n8VarArr;
        this.f8561b = i7;
        this.f8564f = c5VarArr;
        this.h = r8VarArr;
        this.f8565n = animatorSetArr;
    }

    public ba(boolean[] zArr, org.telegram.ui.Wallet.f3[] f3VarArr, org.telegram.ui.ActionBar.i6 i6Var, xh.l lVar, TL_wallet.walletTransaction wallettransaction, int i7, String str) {
        this.h = zArr;
        this.f8562c = f3VarArr;
        this.f8564f = i6Var;
        this.d = lVar;
        this.f8563e = wallettransaction;
        this.f8561b = i7;
        this.f8565n = str;
    }
}
