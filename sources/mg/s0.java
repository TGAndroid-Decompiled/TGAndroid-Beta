package mg;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class s0 implements q20 {
    public final w0 f13228a;
    public final TL_stories.TL_prepaidStarsGiveaway f13229b;
    public final long f13230c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public s0(long j10, long j11, w0 w0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway) {
        this.f13228a = w0Var;
        this.f13229b = tL_prepaidStarsGiveaway;
        this.f13230c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r62 = (Void) obj;
        w0 w0Var = this.f13228a;
        w0Var.dismiss();
        if (this.f13229b != null) {
            k2 T = LaunchActivity.T();
            if (T != null) {
                un ha = un.ha(this.f13230c);
                ha.whenFullyVisible(new t0(ha, this.d, 0));
                T.presentFragment(ha);
                return;
            }
            return;
        }
        org.telegram.messenger.i0.h3(new k2.u(28, w0Var, this.e), 220L);
    }
}
