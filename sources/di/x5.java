package di;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class x5 extends r2 {
    public final int H;
    public final o6 I;

    public x5(o6 o6Var, Context context, c6 c6Var, int i10) {
        super(context, c6Var, false, false);
        this.I = o6Var;
        this.H = i10;
    }

    @Override
    public final boolean m0(Integer num) {
        i6 i6Var = this.I.R0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < i6Var.getChildCount(); i11++) {
                if (i6Var.getChildAt(i11) instanceof rg.c2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.zc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.g6.f19960gc, 0, new bi.la(this, 19), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            } else if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.zc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean n0(Integer num) {
        o6 o6Var = this.I;
        i6 i6Var = o6Var.R0;
        boolean z10 = false;
        if (o6Var.X1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= i6Var.getChildCount()) {
                    break;
                } else if (i6Var.getChildAt(i10) instanceof rg.y2) {
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
    public final boolean o0(Runnable runnable) {
        kc kcVar = ((mb) this.I).A2;
        Activity activity = kcVar.f7237b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    kcVar.f7315y2 = (ah.g) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                kcVar.f7315y2 = (ah.g) runnable;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.I.Q0(this.H);
    }
}
