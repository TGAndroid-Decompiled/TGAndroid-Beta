package ig;

import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class f extends e {
    @Override
    public final void d() {
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        int i12 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f7501c.setLayoutParams(b6.d(40, 40.0f, i10 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i13 = i11 | 16;
        if (z4) {
            f10 = 20.0f;
        } else {
            f10 = 69.0f;
        }
        if (z4) {
            f11 = 69.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        }
        int i14 = i12 | 16;
        if (z10) {
            f12 = 20.0f;
        } else {
            f12 = 69.0f;
        }
        if (z10) {
            f13 = 69.0f;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.e.setTextColor(j6.v0(j6.f20157r5, this.f7499a));
        boolean z4 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        c cVar = this.d;
        z8 z8Var = this.f7500b;
        if (z4) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            z8Var.g(26);
            cVar.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            cVar.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            z8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                z8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                z8Var.i(-10703110, -12481584);
            } else {
                z8Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        p9 p9Var = this.f7501c;
        p9Var.setImageDrawable(z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
