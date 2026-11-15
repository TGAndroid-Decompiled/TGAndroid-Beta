package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class on implements Runnable {
    public final int f25784a;
    public final org.telegram.ui.ActionBar.e2 f25785b;

    public on(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f25784a = i7;
        this.f25785b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f25784a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.f25785b;
                if (e2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.V0 = true;
                    e2Var.presentFragment(themeActivity);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.t4.q0(7, this.f25785b, null);
                return;
            case 2:
                org.telegram.ui.Components.t4.q0(8, this.f25785b, null);
                return;
            default:
                this.f25785b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
        }
    }
}
