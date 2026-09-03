package lh;

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
    public final int f13206a = 1;
    public final int f13207b;
    public final Object f13208c;
    public final Object d;
    public final KeyEvent.Callback[] e;
    public final Object f13209f;
    public final Object h;
    public final Object f13210n;

    public u8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.o8 o8Var, org.telegram.ui.Cells.o8[] o8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        this.f13208c = dataAutoDownloadActivity;
        this.d = o8Var;
        this.e = o8VarArr;
        this.f13207b = i10;
        this.f13209f = c5VarArr;
        this.h = r8VarArr;
        this.f13210n = animatorSetArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13206a) {
            case 0:
                ph.d dVar = (ph.d) this.f13208c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f13209f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f13210n;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f13207b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new kf.i0(dVar, g3VarArr, f6Var, i10, tL_messages_checkChatInvite, 2));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        ze.d.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new g9(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f13208c, (org.telegram.ui.Cells.o8) this.d, (org.telegram.ui.Cells.o8[]) this.e, this.f13207b, (org.telegram.ui.Cells.c5[]) this.f13209f, (org.telegram.ui.Cells.r8[]) this.h, (AnimatorSet[]) this.f13210n, view);
                return;
        }
    }

    public u8(ph.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.g3[] g3VarArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, Activity activity) {
        this.f13208c = dVar;
        this.d = starsSubscription;
        this.f13207b = i10;
        this.e = g3VarArr;
        this.f13209f = f6Var;
        this.h = zArr;
        this.f13210n = activity;
    }
}
