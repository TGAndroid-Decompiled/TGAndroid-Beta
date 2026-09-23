package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class y5 extends s2 {
    public final int H;
    public final q6 I;

    public y5(q6 q6Var, Context context, d6 d6Var, int i10) {
        super(context, d6Var, false, false);
        this.I = q6Var;
        this.H = i10;
    }

    @Override
    public final boolean l0(Integer num) {
        j6 j6Var = this.I.R0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < j6Var.getChildCount(); i11++) {
                if (j6Var.getChildAt(i11) instanceof qg.d2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.xc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.h6.gc, 0, new androidx.fragment.app.a0(this, 10), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            } else if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.xc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean m0(Integer num) {
        q6 q6Var = this.I;
        j6 j6Var = q6Var.R0;
        boolean z10 = false;
        if (q6Var.X1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= j6Var.getChildCount()) {
                    break;
                } else if (j6Var.getChildAt(i10) instanceof qg.y2) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            return !z10;
        }
        return true;
    }

    @Override
    public final boolean n0(ai.o8 o8Var) {
        return this.I.f0(o8Var);
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.I.R0(this.H);
    }
}
