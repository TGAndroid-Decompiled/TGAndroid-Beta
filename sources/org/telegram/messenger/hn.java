package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class hn implements Runnable {
    public final int f22950a;
    public final org.telegram.ui.ActionBar.d2 f22951b;

    public hn(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f22950a = i3;
        this.f22951b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f22950a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f22951b;
                if (d2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.U0 = true;
                    d2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.t4.s0(7, this.f22951b, null);
                return;
            case 2:
                org.telegram.ui.Components.t4.s0(8, this.f22951b, null);
                return;
            default:
                this.f22951b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
