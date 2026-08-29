package gg;

import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;
public final class f extends e {
    @Override
    public final void d() {
        int i10;
        int i11;
        float f9;
        float f10;
        float f11;
        float f12;
        int i12 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        this.f7290c.setLayoutParams(f6.d(40, 40.0f, i10 | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i13 = i11 | 16;
        if (z10) {
            f9 = 20.0f;
        } else {
            f9 = 69.0f;
        }
        if (z10) {
            f10 = 69.0f;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(f6.d(-1, -2.0f, i13, f9, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
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
        this.f7291e.setLayoutParams(f6.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.f7291e.setTextColor(g6.v0(g6.f23310r5, this.f7288a));
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        c cVar = this.d;
        e9 e9Var = this.f7289b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            e9Var.g(26);
            cVar.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            cVar.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            e9Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                e9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                e9Var.i(-10703110, -12481584);
            } else {
                e9Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        t9 t9Var = this.f7290c;
        t9Var.setImageDrawable(e9Var);
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
