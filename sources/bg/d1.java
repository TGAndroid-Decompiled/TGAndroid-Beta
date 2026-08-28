package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class d1 implements Utilities.Callback {
    public final h1 f1731a;
    public final TL_stories.TL_prepaidStarsGiveaway f1732b;
    public final long f1733c;
    public final long d;
    public final TL_stories.PrepaidGiveaway f1734e;

    public d1(h1 h1Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f1731a = h1Var;
        this.f1732b = tL_prepaidStarsGiveaway;
        this.f1733c = j10;
        this.d = j11;
        this.f1734e = prepaidGiveaway;
    }

    @Override
    public final void run(Object obj) {
        Void r62 = (Void) obj;
        h1 h1Var = this.f1731a;
        h1Var.dismiss();
        if (this.f1732b != null) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                qn R9 = qn.R9(this.f1733c);
                R9.whenFullyVisible(new e1(R9, this.d, 0));
                U.presentFragment(R9);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new a1.e(15, h1Var, this.f1734e), 220L);
    }
}
