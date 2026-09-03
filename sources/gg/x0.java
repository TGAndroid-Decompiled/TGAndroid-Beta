package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class x0 implements Utilities.Callback {
    public final b1 f6793a;
    public final TL_stories.TL_prepaidStarsGiveaway f6794b;
    public final long f6795c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public x0(b1 b1Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f6793a = b1Var;
        this.f6794b = tL_prepaidStarsGiveaway;
        this.f6795c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        b1 b1Var = this.f6793a;
        b1Var.dismiss();
        if (this.f6794b != null) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                zn R9 = zn.R9(this.f6795c);
                R9.whenFullyVisible(new y0(R9, this.d, 0));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new ff.c(8, b1Var, this.e), 220L);
    }
}
