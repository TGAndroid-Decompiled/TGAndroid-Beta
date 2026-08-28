package dg;

import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public final class f extends e {
    @Override
    public final void d() {
        int i9;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i11 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        this.f4500c.setLayoutParams(e6.d(40, 40.0f, i9 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i12 = i10 | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 69.0f;
        }
        if (z10) {
            f11 = 69.0f;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(e6.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        }
        int i13 = i11 | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = 69.0f;
        }
        if (z11) {
            f13 = 69.0f;
        } else {
            f13 = 20.0f;
        }
        this.f4501e.setLayoutParams(e6.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f4501e.setTextColor(f6.v0(f6.f23247r5, this.f4498a));
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        c cVar = this.d;
        z8 z8Var = this.f4499b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            z8Var.g(26);
            cVar.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            cVar.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            z8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i9 = tL_prepaidGiveaway.months;
            if (i9 == 12) {
                z8Var.i(-31392, -2796986);
            } else if (i9 == 6) {
                z8Var.i(-10703110, -12481584);
            } else {
                z8Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        o9 o9Var = this.f4500c;
        o9Var.setImageDrawable(z8Var);
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
