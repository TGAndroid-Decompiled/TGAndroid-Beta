package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class qn0 extends pn0 {
    @Override
    public final void d() {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        int i3 = 3;
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        this.c.setLayoutParams(nme.d(40, 40.0f, i | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z = k96.a0;
        if (z) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i4 = i2 | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = 69.0f;
        }
        if (z) {
            f2 = 69.0f;
        } else {
            f2 = 20.0f;
        }
        this.d.setLayoutParams(nme.d(-1, -2.0f, i4, f, 0.0f, f2, 0.0f));
        boolean z2 = k96.a0;
        if (z2) {
            i3 = 5;
        }
        int i5 = i3 | 16;
        if (z2) {
            f3 = 20.0f;
        } else {
            f3 = 69.0f;
        }
        if (z2) {
            f4 = 69.0f;
        } else {
            f4 = 20.0f;
        }
        this.e.setLayoutParams(nme.d(-1, -2.0f, i5, f3, 0.0f, f4, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        zkb.W(this.e, bkb.q5, this.a);
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        df0 df0Var = this.d;
        pb0 pb0Var = this.b;
        if (z) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            pb0Var.f(26);
            df0Var.k(k96.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(k96.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            df0Var.k(k96.M0(2131753325, null));
            pb0Var.f(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i = tL_prepaidGiveaway.months;
            if (i == 12) {
                pb0Var.h(-31392, -2796986);
            } else if (i == 6) {
                pb0Var.h(-10703110, -12481584);
            } else {
                pb0Var.h(-6631068, -11945404);
            }
            setSubtitle(k96.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", k96.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        be0 be0Var = this.c;
        be0Var.setImageDrawable(pb0Var);
        be0Var.setRoundRadius(gl.L(20.0f));
    }
}
