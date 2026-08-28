package kh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class p5 extends n2 {
    public final int D;
    public final g6 E;

    public p5(g6 g6Var, Context context, u5 u5Var, int i9) {
        super(context, u5Var, false, false);
        this.E = g6Var;
        this.D = i9;
    }

    @Override
    public final boolean k0(Integer num) {
        a6 a6Var = this.E.N0;
        if (num.intValue() == 3) {
            int i9 = 0;
            for (int i10 = 0; i10 < a6Var.getChildCount(); i10++) {
                if (a6Var.getChildAt(i10) instanceof yf.a2) {
                    i9++;
                }
            }
            if (i9 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.oc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.f6.f23061gc, 0, new f1(this, 0), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            } else if (i9 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.oc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean l0(Integer num) {
        g6 g6Var = this.E;
        a6 a6Var = g6Var.N0;
        boolean z10 = false;
        if (g6Var.T1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i9 = 0;
            while (true) {
                if (i9 >= a6Var.getChildCount()) {
                    break;
                } else if (a6Var.getChildAt(i9) instanceof yf.w2) {
                    z10 = true;
                    break;
                } else {
                    i9++;
                }
            }
            return !z10;
        }
        return true;
    }

    @Override
    public final boolean m0(bg.c2 c2Var) {
        return this.E.f0(c2Var);
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.E.R0(this.D);
    }
}
