package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class w1 implements View.OnApplyWindowInsetsListener {
    public final int f19020a;
    public final Dialog f19021b;

    public w1(Dialog dialog, int i7) {
        this.f19020a = i7;
        this.f19021b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f19020a) {
            case 0:
                return s2.h((s2) this.f19021b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.w2.z((org.telegram.ui.ActionBar.w2) this.f19021b, windowInsets);
        }
    }
}
