package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class w1 implements View.OnApplyWindowInsetsListener {
    public final int f19118a;
    public final Dialog f19119b;

    public w1(Dialog dialog, int i7) {
        this.f19118a = i7;
        this.f19119b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f19118a) {
            case 0:
                return t2.h((t2) this.f19119b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.w2.z((org.telegram.ui.ActionBar.w2) this.f19119b, windowInsets);
        }
    }
}
