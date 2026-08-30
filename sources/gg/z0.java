package gg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.ci;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jr;
import org.telegram.ui.oy;
public final class z0 implements View.OnClickListener {
    public final int f6823a;
    public final long f6824b;
    public final Object f6825c;
    public final Object d;
    public final Object e;

    public z0(b1 b1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f6823a = 0;
        this.f6825c = b1Var;
        this.d = prepaidGiveaway;
        this.f6824b = j10;
        this.e = p2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6823a) {
            case 0:
                b1.P((b1) this.f6825c, (TL_stories.PrepaidGiveaway) this.d, this.f6824b, (org.telegram.ui.ActionBar.p2) this.e);
                return;
            case 1:
                jr.S((jr) this.f6825c, (Context) this.d, (ph.d) this.e, this.f6824b);
                return;
            default:
                oy oyVar = (oy) this.f6825c;
                oyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ci(oyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f6824b, 6), 100L);
                return;
        }
    }

    public z0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f6823a = i10;
        this.f6825c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f6824b = j10;
    }
}
