package mg;

import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class s0 implements r20 {
    public final w0 f13229a;
    public final TL_stories.TL_prepaidStarsGiveaway f13230b;
    public final long f13231c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public s0(long j10, long j11, w0 w0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway) {
        this.f13229a = w0Var;
        this.f13230b = tL_prepaidStarsGiveaway;
        this.f13231c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        w0 w0Var = this.f13229a;
        w0Var.dismiss();
        if (this.f13230b != null) {
            k2 T = LaunchActivity.T();
            if (T != null) {
                un ma2 = un.ma(this.f13231c);
                ma2.whenFullyVisible(new t0(ma2, this.d, 0));
                T.presentFragment(ma2);
                return;
            }
            return;
        }
        org.telegram.messenger.i0.h3(new k2.u(28, w0Var, this.e), 220L);
    }
}
