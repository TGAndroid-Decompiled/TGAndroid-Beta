package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class ln implements Runnable {
    public final int f25412a;
    public final org.telegram.ui.ActionBar.h2 f25413b;

    public ln(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f25412a = i7;
        this.f25413b = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f25412a) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = this.f25413b;
                if (h2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.V0 = true;
                    h2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.b5.q0(7, this.f25413b, null);
                return;
            case 2:
                org.telegram.ui.Components.b5.q0(8, this.f25413b, null);
                return;
            default:
                this.f25413b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
