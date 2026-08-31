package mh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;
public final class u8 implements View.OnClickListener {
    public final int f14899a = 1;
    public final int f14900b;
    public final Object f14901c;
    public final Object d;
    public final KeyEvent.Callback[] f14902e;
    public final Object f14903f;
    public final Object h;
    public final Object f14904n;

    public u8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.p8 p8Var, org.telegram.ui.Cells.p8[] p8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.s8[] s8VarArr, AnimatorSet[] animatorSetArr) {
        this.f14901c = dataAutoDownloadActivity;
        this.d = p8Var;
        this.f14902e = p8VarArr;
        this.f14900b = i10;
        this.f14903f = d5VarArr;
        this.h = s8VarArr;
        this.f14904n = animatorSetArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14899a) {
            case 0:
                qh.d dVar = (qh.d) this.f14901c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.f14902e;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f14903f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f14904n;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f14900b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new lf.i0(dVar, h3VarArr, g6Var, i10, tL_messages_checkChatInvite, 2));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        af.g.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new g9(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f14901c, (org.telegram.ui.Cells.p8) this.d, (org.telegram.ui.Cells.p8[]) this.f14902e, this.f14900b, (org.telegram.ui.Cells.d5[]) this.f14903f, (org.telegram.ui.Cells.s8[]) this.h, (AnimatorSet[]) this.f14904n, view);
                return;
        }
    }

    public u8(qh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.g6 g6Var, boolean[] zArr, Activity activity) {
        this.f14901c = dVar;
        this.d = starsSubscription;
        this.f14900b = i10;
        this.f14902e = h3VarArr;
        this.f14903f = g6Var;
        this.h = zArr;
        this.f14904n = activity;
    }
}
