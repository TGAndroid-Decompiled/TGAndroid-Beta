package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class w1 implements View.OnApplyWindowInsetsListener {
    public final int f19051a;
    public final Dialog f19052b;

    public w1(Dialog dialog, int i7) {
        this.f19051a = i7;
        this.f19052b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f19051a) {
            case 0:
                return s2.h((s2) this.f19052b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.w2.z((org.telegram.ui.ActionBar.w2) this.f19052b, windowInsets);
        }
    }
}
