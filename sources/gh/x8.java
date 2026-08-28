package gh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;
public final class x8 implements View.OnClickListener {
    public final int f9179a = 0;
    public final int f9180b;
    public final Object f9181c;
    public final Object d;
    public final KeyEvent.Callback[] f9182e;
    public final Object f9183f;
    public final Object h;
    public final Object f9184n;

    public x8(kh.d dVar, TL_stars.StarsSubscription starsSubscription, int i9, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.b6 b6Var, boolean[] zArr, Activity activity) {
        this.f9181c = dVar;
        this.d = starsSubscription;
        this.f9180b = i9;
        this.f9182e = f3VarArr;
        this.f9183f = b6Var;
        this.h = zArr;
        this.f9184n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9179a) {
            case 0:
                kh.d dVar = (kh.d) this.f9181c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f9182e;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f9183f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f9184n;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i9 = this.f9180b;
                        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_checkChatInvite, new ff.j0(dVar, f3VarArr, b6Var, i9, tL_messages_checkChatInvite, 2));
                        return;
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        ve.e.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new k9(dVar), null, false, true, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                DataAutoDownloadActivity.T((DataAutoDownloadActivity) this.f9181c, (org.telegram.ui.Cells.q8) this.d, (org.telegram.ui.Cells.q8[]) this.f9182e, this.f9180b, (org.telegram.ui.Cells.d5[]) this.f9183f, (org.telegram.ui.Cells.t8[]) this.h, (AnimatorSet[]) this.f9184n, view);
                return;
        }
    }

    public x8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8 q8Var, org.telegram.ui.Cells.q8[] q8VarArr, int i9, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr) {
        this.f9181c = dataAutoDownloadActivity;
        this.d = q8Var;
        this.f9182e = q8VarArr;
        this.f9180b = i9;
        this.f9183f = d5VarArr;
        this.h = t8VarArr;
        this.f9184n = animatorSetArr;
    }
}
