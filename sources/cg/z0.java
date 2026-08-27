package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class z0 implements Utilities.Callback {

    public final d1 f2897a;

    public final TL_stories.TL_prepaidStarsGiveaway f2898b;

    public final long f2899c;
    public final long d;

    public final TL_stories.PrepaidGiveaway f2900e;

    public z0(d1 d1Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f2897a = d1Var;
        this.f2898b = tL_prepaidStarsGiveaway;
        this.f2899c = j10;
        this.d = j11;
        this.f2900e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        d1 d1Var = this.f2897a;
        d1Var.dismiss();
        if (this.f2898b == null) {
            AndroidUtilities.runOnUIThread(new a1.e(25, d1Var, this.f2900e), 220L);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            rn rnVarR9 = rn.R9(this.f2899c);
            rnVarR9.whenFullyVisible(new a1(rnVarR9, this.d, 0));
            n2VarU.presentFragment(rnVarR9);
        }
    }
}
