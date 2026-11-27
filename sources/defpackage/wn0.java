package defpackage;

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class wn0 implements pcc {
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
            e S = LaunchActivity.S();
            if (S != null) {
                zu1 ha = zu1.ha(this.c);
                ha.whenFullyVisible(new xn0(ha, this.d, (byte) 0));
                S.presentFragment(ha);
                return;
            }
            return;
        }
        hl.d3(new a30(ao0Var, this.e, (byte) 13), 220L);
    }
}
