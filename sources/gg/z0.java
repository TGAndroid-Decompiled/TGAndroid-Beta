package gg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.di;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ir;
import org.telegram.ui.qy;
public final class z0 implements View.OnClickListener {
    public final int f6810a;
    public final long f6811b;
    public final Object f6812c;
    public final Object d;
    public final Object e;

    public z0(b1 b1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f6810a = 0;
        this.f6812c = b1Var;
        this.d = prepaidGiveaway;
        this.f6811b = j10;
        this.e = p2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6810a) {
            case 0:
                b1.P((b1) this.f6812c, (TL_stories.PrepaidGiveaway) this.d, this.f6811b, (org.telegram.ui.ActionBar.p2) this.e);
                return;
            case 1:
                ir.S((ir) this.f6812c, (Context) this.d, (ph.d) this.e, this.f6811b);
                return;
            default:
                qy qyVar = (qy) this.f6812c;
                qyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new di(qyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f6811b, 6), 100L);
                return;
        }
    }

    public z0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f6810a = i10;
        this.f6812c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f6811b = j10;
    }
}
