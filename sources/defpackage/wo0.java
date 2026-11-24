package defpackage;

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class wo0 implements qac {
    public final ap0 a;
    public final TL_stories.TL_prepaidStarsGiveaway b;
    public final long c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public wo0(ap0 ap0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j, long j2, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = ap0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j;
        this.d = j2;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r6 = (Void) obj;
        ap0 ap0Var = this.a;
        ap0Var.dismiss();
        if (this.b != null) {
            d S = LaunchActivity.S();
            if (S != null) {
                yv1 ga = yv1.ga(this.c);
                ga.whenFullyVisible(new xo0(ga, this.d, (byte) 0));
                S.presentFragment(ga);
                return;
            }
            return;
        }
        gm.d3(new x30(ap0Var, this.e, (byte) 14), 220L);
    }
}
