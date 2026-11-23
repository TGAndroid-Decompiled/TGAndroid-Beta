package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class mn implements Runnable {
    public final int f25618a;
    public final org.telegram.ui.ActionBar.g2 f25619b;

    public mn(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f25618a = i7;
        this.f25619b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f25618a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.f25619b;
                if (g2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.V0 = true;
                    g2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.c5.q0(7, this.f25619b, null);
                return;
            case 2:
                org.telegram.ui.Components.c5.q0(8, this.f25619b, null);
                return;
            default:
                this.f25619b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
