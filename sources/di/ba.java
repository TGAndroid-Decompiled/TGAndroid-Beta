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
    public final int f8595a = 2;
    public final int f8596b;
    public final Object f8597c;
    public final Object d;
    public final Object f8598e;
    public final Object f8599f;
    public final Object h;
    public final Object f8600n;

    public ba(hi.e eVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.w2 w2Var, hi.e eVar2, org.telegram.ui.web.v0 v0Var, int i7) {
        this.f8597c = eVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.f8598e = w2Var;
        this.f8599f = eVar2;
        this.f8600n = v0Var;
        this.f8596b = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f8595a;
        JSONObject jSONObject = null;
        int i10 = this.f8596b;
        Object obj = this.f8600n;
        Object obj2 = this.f8598e;
        Object obj3 = this.d;
        Object obj4 = this.f8599f;
        Object obj5 = this.f8597c;
        Object obj6 = this.h;
        switch (i7) {
            case 0:
                hi.e eVar = (hi.e) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i11 = this.f8596b;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_checkChatInvite, new bg.l0(eVar, w2VarArr, h6Var, i11, tL_messages_checkChatInvite, 1));
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
                DataAutoDownloadActivity.Z((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.o8) obj3, (org.telegram.ui.Cells.o8[]) obj2, this.f8596b, (org.telegram.ui.Cells.d5[]) obj4, (org.telegram.ui.Cells.s8[]) obj6, (AnimatorSet[]) obj, view);
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
                            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new d3.b(1), new bi.p6(24, zArr2, w2Var));
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
                org.telegram.ui.Wallet.e3[] e3VarArr = (org.telegram.ui.Wallet.e3[]) obj5;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj4;
                xh.l lVar = (xh.l) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.s sVar = new org.telegram.ui.Wallet.s(zArr3, e3VarArr, h6Var2, lVar, 9);
                    if (wallettransaction.comment_encrypted_preparing) {
                        sVar.a(wallettransaction.comment, null);
                        return;
                    }
                    org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i10);
                    String str2 = wallettransaction.comment;
                    org.telegram.ui.Wallet.u0.P("decrypting transaction comment");
                    D.F(true, false, false, new org.telegram.ui.Wallet.j(D, sVar, str, str2));
                    return;
                }
                return;
        }
    }

    public ba(hi.e eVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.h6 h6Var, boolean[] zArr, Activity activity) {
        this.f8597c = eVar;
        this.d = starsSubscription;
        this.f8596b = i7;
        this.f8598e = w2VarArr;
        this.f8599f = h6Var;
        this.h = zArr;
        this.f8600n = activity;
    }

    public ba(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.o8 o8Var, org.telegram.ui.Cells.o8[] o8VarArr, int i7, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.s8[] s8VarArr, AnimatorSet[] animatorSetArr) {
        this.f8597c = dataAutoDownloadActivity;
        this.d = o8Var;
        this.f8598e = o8VarArr;
        this.f8596b = i7;
        this.f8599f = d5VarArr;
        this.h = s8VarArr;
        this.f8600n = animatorSetArr;
    }

    public ba(boolean[] zArr, org.telegram.ui.Wallet.e3[] e3VarArr, org.telegram.ui.ActionBar.h6 h6Var, xh.l lVar, TL_wallet.walletTransaction wallettransaction, int i7, String str) {
        this.h = zArr;
        this.f8597c = e3VarArr;
        this.f8599f = h6Var;
        this.d = lVar;
        this.f8598e = wallettransaction;
        this.f8596b = i7;
        this.f8600n = str;
    }
}
