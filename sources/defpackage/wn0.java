package defpackage;

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class wn0 implements p8c {
    public final ao0 a;
    public final TL_stories.TL_prepaidStarsGiveaway b;
    public final long c;
    public final long d;
    public final TL_stories.PrepaidGiveaway e;

    public wn0(ao0 ao0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j, long j2, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = ao0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j;
        this.d = j2;
        this.e = prepaidGiveaway;
    }

    @Override
    public final void a(Object obj) {
        Void r6 = (Void) obj;
        ao0 ao0Var = this.a;
        ao0Var.dismiss();
        if (this.b != null) {
            d S = LaunchActivity.S();
            if (S != null) {
                mu1 W9 = mu1.W9(this.c);
                W9.whenFullyVisible(new xn0(W9, this.d, (byte) 0));
                S.presentFragment(W9);
                return;
            }
            return;
        }
        gl.d3(new z20(ao0Var, this.e, (byte) 13), 220L);
    }
}
