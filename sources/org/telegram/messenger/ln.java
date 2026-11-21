package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class ln implements Runnable {
    public final int f25440a;
    public final org.telegram.ui.ActionBar.g2 f25441b;

    public ln(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f25440a = i7;
        this.f25441b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f25440a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.f25441b;
                if (g2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.V0 = true;
                    g2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.c5.q0(7, this.f25441b, null);
                return;
            case 2:
                org.telegram.ui.Components.c5.q0(8, this.f25441b, null);
                return;
            default:
                this.f25441b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
