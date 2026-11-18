package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class x1 implements View.OnApplyWindowInsetsListener {
    public final int f19044a;
    public final Dialog f19045b;

    public x1(Dialog dialog, int i7) {
        this.f19044a = i7;
        this.f19045b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f19044a) {
            case 0:
                return t2.h((t2) this.f19045b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.x2.z((org.telegram.ui.ActionBar.x2) this.f19045b, windowInsets);
        }
    }
}
