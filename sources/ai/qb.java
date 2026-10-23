package ai;

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
public final class qb implements View.OnClickListener {
    public final int f2087a = 2;
    public final int f2088b;
    public final Object f2089c;
    public final Object d;
    public final Object e;
    public final Object f2090f;
    public final Object h;
    public final Object f2091n;

    public qb(ei.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.h3 h3Var, ei.d dVar2, org.telegram.ui.web.b1 b1Var, int i10) {
        this.f2089c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = h3Var;
        this.f2090f = dVar2;
        this.f2091n = b1Var;
        this.f2088b = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f2087a;
        JSONObject jSONObject = null;
        int i11 = this.f2088b;
        Object obj = this.f2091n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2090f;
        Object obj5 = this.f2089c;
        Object obj6 = this.h;
        switch (i10) {
            case 0:
                ei.d dVar = (ei.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.f2088b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new tb(dVar, h3VarArr, g6Var, i12, tL_messages_checkChatInvite, 1));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        pf.d.q(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new gc(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.s8) obj3, (org.telegram.ui.Cells.s8[]) obj2, this.f2088b, (org.telegram.ui.Cells.c5[]) obj4, (org.telegram.ui.Cells.w8[]) obj6, (AnimatorSet[]) obj, view);
                return;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj2;
                ei.d dVar2 = (ei.d) obj4;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (!((ei.d) obj5).Q) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.Q) {
                            dVar2.setLoading(true);
                            if (b1Var != null) {
                                boolean z10 = org.telegram.ui.web.b1.Q0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                b1Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new r5(20, zArr2, h3Var));
                            return;
                        }
                        return;
                    }
                    zArr2[0] = true;
                    h3Var.dismiss();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj5;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj4;
                wh.n nVar = (wh.n) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.p pVar = new org.telegram.ui.Wallet.p(zArr3, j2VarArr, g6Var2, nVar, 9);
                    if (wallettransaction.comment_encrypted_preparing) {
                        pVar.run(wallettransaction.comment, null);
                        return;
                    }
                    org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i11);
                    String str2 = wallettransaction.comment;
                    org.telegram.ui.Wallet.l0.F("decrypting transaction comment");
                    w9.y(new org.telegram.ui.Wallet.j(w9, pVar, str, str2), true, false);
                    return;
                }
                return;
        }
    }

    public qb(ei.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.g6 g6Var, boolean[] zArr, Activity activity) {
        this.f2089c = dVar;
        this.d = starsSubscription;
        this.f2088b = i10;
        this.e = h3VarArr;
        this.f2090f = g6Var;
        this.h = zArr;
        this.f2091n = activity;
    }

    public qb(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.f2089c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.f2088b = i10;
        this.f2090f = c5VarArr;
        this.h = w8VarArr;
        this.f2091n = animatorSetArr;
    }

    public qb(boolean[] zArr, org.telegram.ui.Wallet.j2[] j2VarArr, org.telegram.ui.ActionBar.g6 g6Var, wh.n nVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.h = zArr;
        this.f2089c = j2VarArr;
        this.f2090f = g6Var;
        this.d = nVar;
        this.e = wallettransaction;
        this.f2088b = i10;
        this.f2091n = str;
    }
}
