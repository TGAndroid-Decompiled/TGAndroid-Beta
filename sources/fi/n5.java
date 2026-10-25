package fi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.wc;
public final class n5 extends l2 {
    public final int I;
    public final e6 J;

    public n5(e6 e6Var, Context context, s5 s5Var, int i10) {
        super(context, s5Var, false, false);
        this.J = e6Var;
        this.I = i10;
    }

    @Override
    public final boolean n0(Integer num) {
        y5 y5Var = this.J.G0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < y5Var.getChildCount(); i11++) {
                if (y5Var.getChildAt(i11) instanceof sg.c2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new wc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.y6.gc, 0, new di.s8(this, 14), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            } else if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new wc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean o0(Integer num) {
        e6 e6Var = this.J;
        y5 y5Var = e6Var.G0;
        boolean z10 = false;
        if (e6Var.M1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= y5Var.getChildCount()) {
                    break;
                } else if (y5Var.getChildAt(i10) instanceof sg.y2) {
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
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.J.O0(this.I);
    }

    @Override
    public final boolean p0(Runnable runnable) {
        sb sbVar = ((ta) this.J).f11725p2;
        Activity activity = sbVar.f11608b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    sbVar.f11686y2 = (ag.r0) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                sbVar.f11686y2 = (ag.r0) runnable;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
