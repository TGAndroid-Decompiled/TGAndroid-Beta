package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class w1 implements View.OnApplyWindowInsetsListener {
    public final int f19054a;
    public final Dialog f19055b;

    public w1(Dialog dialog, int i7) {
        this.f19054a = i7;
        this.f19055b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f19054a) {
            case 0:
                return s2.h((s2) this.f19055b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.w2.z((org.telegram.ui.ActionBar.w2) this.f19055b, windowInsets);
        }
    }
}
