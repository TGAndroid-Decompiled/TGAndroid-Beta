package jh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;
public final class t8 implements View.OnClickListener {
    public final int f12859a = 0;
    public final int f12860b;
    public final Object f12861c;
    public final Object d;
    public final KeyEvent.Callback[] f12862e;
    public final Object f12863f;
    public final Object h;
    public final Object f12864n;

    public t8(nh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, Activity activity) {
        this.f12861c = dVar;
        this.d = starsSubscription;
        this.f12860b = i10;
        this.f12862e = f3VarArr;
        this.f12863f = c6Var;
        this.h = zArr;
        this.f12864n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12859a) {
            case 0:
                nh.d dVar = (nh.d) this.f12861c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f12862e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f12863f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f12864n;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f12860b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new jf.i0(dVar, f3VarArr, c6Var, i10, tL_messages_checkChatInvite, 2));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        ye.d.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new f9(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f12861c, (org.telegram.ui.Cells.n8) this.d, (org.telegram.ui.Cells.n8[]) this.f12862e, this.f12860b, (org.telegram.ui.Cells.b5[]) this.f12863f, (org.telegram.ui.Cells.q8[]) this.h, (AnimatorSet[]) this.f12864n, view);
                return;
        }
    }

    public t8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i10, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr) {
        this.f12861c = dataAutoDownloadActivity;
        this.d = n8Var;
        this.f12862e = n8VarArr;
        this.f12860b = i10;
        this.f12863f = b5VarArr;
        this.h = q8VarArr;
        this.f12864n = animatorSetArr;
    }
}
