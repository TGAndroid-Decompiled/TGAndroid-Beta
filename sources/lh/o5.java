package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public final class o5 extends l2 {
    public final int D;
    public final f6 E;

    public o5(f6 f6Var, Context context, t5 t5Var, int i10) {
        super(context, t5Var, false, false);
        this.E = f6Var;
        this.D = i10;
    }

    @Override
    public final boolean l0(Integer num) {
        z5 z5Var = this.E.N0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < z5Var.getChildCount(); i11++) {
                if (z5Var.getChildAt(i11) instanceof zf.b2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String pluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.mc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(pluralString, org.telegram.ui.ActionBar.g6.gc, 0, new kh.c(this, 7), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.mc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean m0(Integer num) {
        f6 f6Var = this.E;
        z5 z5Var = f6Var.N0;
        boolean z10 = false;
        if (f6Var.T1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            for (int i10 = 0; i10 < z5Var.getChildCount(); i10++) {
                if (z5Var.getChildAt(i10) instanceof zf.w2) {
                    z10 = true;
                    break;
                }
            }
            return !z10;
        }
        return true;
    }

    @Override
    public final boolean n0(cg.w1 w1Var) {
        return this.E.f0(w1Var);
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.E.R0(this.D);
    }
}
