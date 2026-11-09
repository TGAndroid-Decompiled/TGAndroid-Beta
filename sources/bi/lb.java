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
public final class lb implements View.OnClickListener {
    public final int f4287a = 2;
    public final int f4288b;
    public final Object f4289c;
    public final Object d;
    public final Object f4290e;
    public final Object f4291f;
    public final Object h;
    public final Object f4292n;

    public lb(fi.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.v2 v2Var, fi.d dVar2, org.telegram.ui.web.x0 x0Var, int i7) {
        this.f4289c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.f4290e = v2Var;
        this.f4291f = dVar2;
        this.f4292n = x0Var;
        this.f4288b = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f4287a;
        JSONObject jSONObject = null;
        int i10 = this.f4288b;
        Object obj = this.f4292n;
        Object obj2 = this.f4290e;
        Object obj3 = this.d;
        Object obj4 = this.f4291f;
        Object obj5 = this.f4289c;
        Object obj6 = this.h;
        switch (i7) {
            case 0:
                fi.d dVar = (fi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i11 = this.f4288b;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_checkChatInvite, new bg.k0(dVar, v2VarArr, g6Var, i11, tL_messages_checkChatInvite, 1));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        vf.c.s(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new bc(dVar), null, false, true, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                DataAutoDownloadActivity.Z((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.n8) obj3, (org.telegram.ui.Cells.n8[]) obj2, this.f4288b, (org.telegram.ui.Cells.b5[]) obj4, (org.telegram.ui.Cells.r8[]) obj6, (AnimatorSet[]) obj, view);
                return;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj2;
                fi.d dVar2 = (fi.d) obj4;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                if (!((fi.d) obj5).Q) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.Q) {
                            dVar2.setLoading(true);
                            if (x0Var != null) {
                                boolean z9 = org.telegram.ui.web.x0.Q0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                x0Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new d3.b(1), new p5(19, zArr2, v2Var));
                            return;
                        }
                        return;
                    }
                    zArr2[0] = true;
                    v2Var.dismiss();
                    return;
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj5;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj4;
                xh.l lVar = (xh.l) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.q qVar = new org.telegram.ui.Wallet.q(zArr3, y2VarArr, g6Var2, lVar, 9);
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

    public lb(fi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.v2[] v2VarArr, org.telegram.ui.ActionBar.g6 g6Var, boolean[] zArr, Activity activity) {
        this.f4289c = dVar;
        this.d = starsSubscription;
        this.f4288b = i7;
        this.f4290e = v2VarArr;
        this.f4291f = g6Var;
        this.h = zArr;
        this.f4292n = activity;
    }

    public lb(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        this.f4289c = dataAutoDownloadActivity;
        this.d = n8Var;
        this.f4290e = n8VarArr;
        this.f4288b = i7;
        this.f4291f = b5VarArr;
        this.h = r8VarArr;
        this.f4292n = animatorSetArr;
    }

    public lb(boolean[] zArr, org.telegram.ui.Wallet.y2[] y2VarArr, org.telegram.ui.ActionBar.g6 g6Var, xh.l lVar, TL_wallet.walletTransaction wallettransaction, int i7, String str) {
        this.h = zArr;
        this.f4289c = y2VarArr;
        this.f4291f = g6Var;
        this.d = lVar;
        this.f4290e = wallettransaction;
        this.f4288b = i7;
        this.f4292n = str;
    }
}
