package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class mn implements Runnable {
    public final int f25582a;
    public final org.telegram.ui.ActionBar.g2 f25583b;

    public mn(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f25582a = i7;
        this.f25583b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f25582a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.f25583b;
                if (g2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.V0 = true;
                    g2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.c5.q0(7, this.f25583b, null);
                return;
            case 2:
                org.telegram.ui.Components.c5.q0(8, this.f25583b, null);
                return;
            default:
                this.f25583b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
