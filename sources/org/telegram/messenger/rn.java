package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class rn implements Runnable {
    public final int f25303a;
    public final org.telegram.ui.ActionBar.f2 f25304b;

    public rn(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f25303a = i7;
        this.f25304b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f25303a) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = this.f25304b;
                if (f2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.T0 = true;
                    f2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.v4.q0(7, this.f25304b, null);
                return;
            case 2:
                org.telegram.ui.Components.v4.q0(8, this.f25304b, null);
                return;
            default:
                this.f25304b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
