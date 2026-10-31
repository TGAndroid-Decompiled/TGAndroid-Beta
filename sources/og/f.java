package og;

import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class f extends e {
    @Override
    public final void d() {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float f12;
        int i12 = 3;
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f14178c.setLayoutParams(b6.d(40, 40.0f, i10 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = cd.X;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i13 = i11 | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 69.0f;
        }
        if (z10) {
            f10 = 69.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        boolean z11 = cd.X;
        if (z11) {
            i12 = 5;
        }
        int i14 = i12 | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = 69.0f;
        }
        if (z11) {
            f12 = 69.0f;
        } else {
            f12 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        a7.Y(this.e, t6.f21185r5, this.f14176a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        c cVar = this.d;
        r8 r8Var = this.f14177b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            r8Var.g(26);
            cVar.k(cd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(cd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            cVar.k(cd.L0(2131753328, null));
            r8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                r8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                r8Var.i(-10703110, -12481584);
            } else {
                r8Var.i(-6631068, -11945404);
            }
            setSubtitle(cd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", cd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        g9 g9Var = this.f14178c;
        g9Var.setImageDrawable(r8Var);
        g9Var.setRoundRadius(i0.L(20.0f));
    }
}
