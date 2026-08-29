package eg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class y0 implements Utilities.Callback {
    public final c1 f6193a;
    public final TL_stories.TL_prepaidStarsGiveaway f6194b;
    public final long f6195c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f6196e;

    public y0(c1 c1Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f6193a = c1Var;
        this.f6194b = tL_prepaidStarsGiveaway;
        this.f6195c = j10;
        this.d = j11;
        this.f6196e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r6 = (Void) obj;
        c1 c1Var = this.f6193a;
        c1Var.dismiss();
        if (this.f6194b != null) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                tn R9 = tn.R9(this.f6195c);
                R9.whenFullyVisible(new z0(R9, this.d, 0));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new ef.c(8, c1Var, this.f6196e), 220L);
    }
}
