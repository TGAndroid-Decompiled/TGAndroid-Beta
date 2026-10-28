package bi;

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
public final class ob implements View.OnClickListener {
    public final int f5209a = 2;
    public final int f5210b;
    public final Object f5211c;
    public final Object d;
    public final Object e;
    public final Object f5212f;
    public final Object h;
    public final Object f5213n;

    public ob(fi.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.k3 k3Var, fi.d dVar2, org.telegram.ui.web.a1 a1Var, int i10) {
        this.f5211c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = k3Var;
        this.f5212f = dVar2;
        this.f5213n = a1Var;
        this.f5210b = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f5209a;
        JSONObject jSONObject = null;
        int i11 = this.f5210b;
        Object obj = this.f5213n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f5212f;
        Object obj5 = this.f5211c;
        Object obj6 = this.h;
        switch (i10) {
            case 0:
                fi.d dVar = (fi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.f5210b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new ag.p0(dVar, k3VarArr, u6Var, i12, tL_messages_checkChatInvite, 1));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        qf.d.q(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new zb(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                DataAutoDownloadActivity.V((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.w8) obj3, (org.telegram.ui.Cells.w8[]) obj2, this.f5210b, (org.telegram.ui.Cells.h5[]) obj4, (org.telegram.ui.Cells.a9[]) obj6, (AnimatorSet[]) obj, view);
                return;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj2;
                fi.d dVar2 = (fi.d) obj4;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                if (!((fi.d) obj5).Q) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.Q) {
                            dVar2.setLoading(true);
                            if (a1Var != null) {
                                boolean z10 = org.telegram.ui.web.a1.Q0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                a1Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new m5(20, zArr2, k3Var));
                            return;
                        }
                        return;
                    }
                    zArr2[0] = true;
                    k3Var.dismiss();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj5;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) obj4;
                xh.n nVar = (xh.n) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.p pVar = new org.telegram.ui.Wallet.p(zArr3, j2VarArr, u6Var2, nVar, 9);
                    if (wallettransaction.comment_encrypted_preparing) {
                        pVar.run(wallettransaction.comment, null);
                        return;
                    }
                    org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i11);
                    String str2 = wallettransaction.comment;
                    org.telegram.ui.Wallet.l0.H("decrypting transaction comment");
                    x9.z(new org.telegram.ui.Wallet.j(x9, pVar, str, str2), true, false);
                    return;
                }
                return;
        }
    }

    public ob(fi.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.k3[] k3VarArr, org.telegram.ui.ActionBar.u6 u6Var, boolean[] zArr, Activity activity) {
        this.f5211c = dVar;
        this.d = starsSubscription;
        this.f5210b = i10;
        this.e = k3VarArr;
        this.f5212f = u6Var;
        this.h = zArr;
        this.f5213n = activity;
    }

    public ob(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.w8 w8Var, org.telegram.ui.Cells.w8[] w8VarArr, int i10, org.telegram.ui.Cells.h5[] h5VarArr, org.telegram.ui.Cells.a9[] a9VarArr, AnimatorSet[] animatorSetArr) {
        this.f5211c = dataAutoDownloadActivity;
        this.d = w8Var;
        this.e = w8VarArr;
        this.f5210b = i10;
        this.f5212f = h5VarArr;
        this.h = a9VarArr;
        this.f5213n = animatorSetArr;
    }

    public ob(boolean[] zArr, org.telegram.ui.Wallet.j2[] j2VarArr, org.telegram.ui.ActionBar.u6 u6Var, xh.n nVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.h = zArr;
        this.f5211c = j2VarArr;
        this.f5212f = u6Var;
        this.d = nVar;
        this.e = wallettransaction;
        this.f5210b = i10;
        this.f5213n = str;
    }
}
