package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class y6 extends f3 {
    public final int H;
    public final r7 I;

    public y6(r7 r7Var, Context context, d7 d7Var, int i10) {
        super(context, d7Var, false, false);
        this.I = r7Var;
        this.H = i10;
    }

    @Override
    public final boolean l0(Integer num) {
        j7 j7Var = this.I.R0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < j7Var.getChildCount(); i11++) {
                if (j7Var.getChildAt(i11) instanceof pg.a2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.wc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.j6.gc, 0, new a3.d(this, 16), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            } else if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.wc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean m0(Integer num) {
        r7 r7Var = this.I;
        j7 j7Var = r7Var.R0;
        boolean z10 = false;
        if (r7Var.X1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= j7Var.getChildCount()) {
                    break;
                } else if (j7Var.getChildAt(i10) instanceof pg.w2) {
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
    public final boolean n0(s sVar) {
        return this.I.f0(sVar);
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.I.R0(this.H);
    }
}
