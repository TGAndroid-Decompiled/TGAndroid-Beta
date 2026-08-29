package nh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.tc;
public final class c5 extends k2 {
    public final int D;
    public final t5 E;

    public c5(t5 t5Var, Context context, h5 h5Var, int i10) {
        super(context, h5Var, false, false);
        this.E = t5Var;
        this.D = i10;
    }

    @Override
    public final boolean l0(Integer num) {
        n5 n5Var = this.E.N0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < n5Var.getChildCount(); i11++) {
                if (n5Var.getChildAt(i11) instanceof bg.e3) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new tc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.g6.gc, 0, new lh.m5(this, 21), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            } else if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new tc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean m0(Integer num) {
        t5 t5Var = this.E;
        n5 n5Var = t5Var.N0;
        boolean z10 = false;
        if (t5Var.T1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= n5Var.getChildCount()) {
                    break;
                } else if (n5Var.getChildAt(i10) instanceof bg.g4) {
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
    public final boolean n0(bg.f fVar) {
        return this.E.f0(fVar);
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.E.R0(this.D);
    }
}
