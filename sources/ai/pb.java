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
public final class pb implements View.OnClickListener {
    public final int f2030a = 2;
    public final int f2031b;
    public final Object f2032c;
    public final Object d;
    public final Object e;
    public final Object f2033f;
    public final Object h;
    public final Object f2034n;

    public pb(ei.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.f3 f3Var, ei.d dVar2, org.telegram.ui.web.a1 a1Var, int i10) {
        this.f2032c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = f3Var;
        this.f2033f = dVar2;
        this.f2034n = a1Var;
        this.f2031b = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f2030a;
        JSONObject jSONObject = null;
        int i11 = this.f2031b;
        Object obj = this.f2034n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2033f;
        Object obj5 = this.f2032c;
        Object obj6 = this.h;
        switch (i10) {
            case 0:
                ei.d dVar = (ei.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.f2031b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new sb(dVar, f3VarArr, d6Var, i12, tL_messages_checkChatInvite, 1));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        pf.d.q(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new fc(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.r8) obj3, (org.telegram.ui.Cells.r8[]) obj2, this.f2031b, (org.telegram.ui.Cells.c5[]) obj4, (org.telegram.ui.Cells.v8[]) obj6, (AnimatorSet[]) obj, view);
                return;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                ei.d dVar2 = (ei.d) obj4;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                if (!((ei.d) obj5).N) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.N) {
                            dVar2.setLoading(true);
                            if (a1Var != null) {
                                boolean z10 = org.telegram.ui.web.a1.P0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                a1Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new Object(), new r5(20, zArr2, f3Var));
                            return;
                        }
                        return;
                    }
                    zArr2[0] = true;
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.k2[] k2VarArr = (org.telegram.ui.Wallet.k2[]) obj5;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) obj4;
                wh.n nVar = (wh.n) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.q qVar = new org.telegram.ui.Wallet.q(zArr3, k2VarArr, d6Var2, nVar, 9);
                    if (wallettransaction.comment_encrypted_preparing) {
                        qVar.run(wallettransaction.comment, null);
                        return;
                    }
                    org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i11);
                    String str2 = wallettransaction.comment;
                    org.telegram.ui.Wallet.m0.F("decrypting transaction comment");
                    w9.y(new org.telegram.ui.Wallet.k(w9, qVar, str, str2), true, false);
                    return;
                }
                return;
        }
    }

    public pb(ei.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, Activity activity) {
        this.f2032c = dVar;
        this.d = starsSubscription;
        this.f2031b = i10;
        this.e = f3VarArr;
        this.f2033f = d6Var;
        this.h = zArr;
        this.f2034n = activity;
    }

    public pb(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.r8 r8Var, org.telegram.ui.Cells.r8[] r8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.v8[] v8VarArr, AnimatorSet[] animatorSetArr) {
        this.f2032c = dataAutoDownloadActivity;
        this.d = r8Var;
        this.e = r8VarArr;
        this.f2031b = i10;
        this.f2033f = c5VarArr;
        this.h = v8VarArr;
        this.f2034n = animatorSetArr;
    }

    public pb(boolean[] zArr, org.telegram.ui.Wallet.k2[] k2VarArr, org.telegram.ui.ActionBar.d6 d6Var, wh.n nVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.h = zArr;
        this.f2032c = k2VarArr;
        this.f2033f = d6Var;
        this.d = nVar;
        this.e = wallettransaction;
        this.f2031b = i10;
        this.f2034n = str;
    }
}
