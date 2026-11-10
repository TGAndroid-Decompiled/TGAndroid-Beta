package hi;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class b2 implements View.OnApplyWindowInsetsListener {
    public final int f14556a;
    public final Dialog f14557b;

    public b2(Dialog dialog, int i7) {
        this.f14556a = i7;
        this.f14557b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f14556a) {
            case 0:
                return a3.h((a3) this.f14557b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.w2.z((org.telegram.ui.ActionBar.w2) this.f14557b, windowInsets);
        }
    }
}
