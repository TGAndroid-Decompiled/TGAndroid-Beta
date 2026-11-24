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
public final class f73 implements View.OnClickListener {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public f73(b61 b61Var, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, my0 my0Var, b61 b61Var2, qw0 qw0Var, int i) {
        this.c = b61Var;
        this.d = tL_messages_requestUrlAuth;
        this.e = zArr;
        this.f = my0Var;
        this.h = b61Var2;
        this.n = qw0Var;
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
                ((DataAutoDownloadActivity) obj6).o0((yib) obj5, (yib[]) obj4, this.b, (ul6[]) obj3, (bjb[]) obj2, (AnimatorSet[]) obj, view);
                return;
            case 1:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj5;
                boolean[] zArr = (boolean[]) obj4;
                my0 my0Var = (my0) obj3;
                b61 b61Var = (b61) obj2;
                qw0 qw0Var = (qw0) obj;
                if (!((b61) obj6).R) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!b61Var.R) {
                            b61Var.setLoading(true);
                            if (qw0Var != null) {
                                boolean z = qw0.R0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                qw0Var.v("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_declineUrlAuth, new kc((byte) 0), new s87(zArr, my0Var, (byte) 5));
                            return;
                        }
                        return;
                    }
                    zArr[0] = true;
                    my0Var.dismiss();
                    return;
                }
                return;
            case 2:
                b61 b61Var2 = (b61) obj6;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj5;
                my0[] my0VarArr = (my0[]) obj4;
                ylb ylbVar = (ylb) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                Activity activity = (Activity) obj;
                if (!b61Var2.R) {
                    b61Var2.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i2 = this.b;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_checkChatInvite, new ev0(b61Var2, my0VarArr, ylbVar, i2, tL_messages_checkChatInvite));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr2[0] = true;
                        l11.t(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new rwa(b61Var2), null, false, true, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                el7[] el7VarArr = (el7[]) obj5;
                ylb ylbVar2 = (ylb) obj4;
                xna xnaVar = (xna) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    nv0 nv0Var = new nv0(zArr3, el7VarArr, ylbVar2, xnaVar, (byte) 16);
                    if (wallettransaction.comment_encrypted_preparing) {
                        nv0Var.a(wallettransaction.comment, null);
                        return;
                    }
                    c C = c.C(i);
                    String str2 = wallettransaction.comment;
                    c.O("decrypting transaction comment");
                    C.E(true, false, false, new p(C, nv0Var, str, str2));
                    return;
                }
                return;
        }
    }

    public f73(b61 b61Var, TL_stars.StarsSubscription starsSubscription, int i, my0[] my0VarArr, ylb ylbVar, boolean[] zArr, Activity activity) {
        this.c = b61Var;
        this.d = starsSubscription;
        this.b = i;
        this.e = my0VarArr;
        this.f = ylbVar;
        this.h = zArr;
        this.n = activity;
    }

    public f73(DataAutoDownloadActivity dataAutoDownloadActivity, yib yibVar, yib[] yibVarArr, int i, ul6[] ul6VarArr, bjb[] bjbVarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = yibVar;
        this.e = yibVarArr;
        this.b = i;
        this.f = ul6VarArr;
        this.h = bjbVarArr;
        this.n = animatorSetArr;
    }

    public f73(boolean[] zArr, el7[] el7VarArr, ylb ylbVar, xna xnaVar, TL_wallet.walletTransaction wallettransaction, int i, String str) {
        this.c = zArr;
        this.d = el7VarArr;
        this.e = ylbVar;
        this.f = xnaVar;
        this.h = wallettransaction;
        this.b = i;
        this.n = str;
    }
}
