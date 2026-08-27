package hh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;

public final class w8 implements View.OnClickListener {

    public final int f10298a = 0;

    public final int f10299b;

    public final Object f10300c;
    public final Object d;

    public final KeyEvent.Callback[] f10301e;

    public final Object f10302f;
    public final Object h;

    public final Object f10303n;

    public w8(lh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, Activity activity) {
        this.f10300c = dVar;
        this.d = starsSubscription;
        this.f10299b = i10;
        this.f10301e = e3VarArr;
        this.f10302f = c6Var;
        this.h = zArr;
        this.f10303n = activity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10298a) {
            case 0:
                lh.d dVar = (lh.d) this.f10300c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f10301e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f10302f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.f10303n;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.f10299b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new gf.j0(dVar, e3VarArr, c6Var, i10, tL_messages_checkChatInvite, 2));
                    } else if (starsSubscription.invoice_slug != null) {
                        zArr[0] = true;
                        we.e.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new j9(dVar), null, false, true, false);
                    }
                    break;
                }
                break;
            default:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.f10300c, (org.telegram.ui.Cells.m8) this.d, (org.telegram.ui.Cells.m8[]) this.f10301e, this.f10299b, (org.telegram.ui.Cells.a5[]) this.f10302f, (org.telegram.ui.Cells.p8[]) this.h, (AnimatorSet[]) this.f10303n, view);
                break;
        }
    }

    public w8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8 m8Var, org.telegram.ui.Cells.m8[] m8VarArr, int i10, org.telegram.ui.Cells.a5[] a5VarArr, org.telegram.ui.Cells.p8[] p8VarArr, AnimatorSet[] animatorSetArr) {
        this.f10300c = dataAutoDownloadActivity;
        this.d = m8Var;
        this.f10301e = m8VarArr;
        this.f10299b = i10;
        this.f10302f = a5VarArr;
        this.h = p8VarArr;
        this.f10303n = animatorSetArr;
    }
}
