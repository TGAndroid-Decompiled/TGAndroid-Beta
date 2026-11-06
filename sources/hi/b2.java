package hi;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class b2 implements View.OnApplyWindowInsetsListener {
    public final int f14554a;
    public final Dialog f14555b;

    public b2(Dialog dialog, int i7) {
        this.f14554a = i7;
        this.f14555b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f14554a) {
            case 0:
                return a3.h((a3) this.f14555b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.v2.z((org.telegram.ui.ActionBar.v2) this.f14555b, windowInsets);
        }
    }
}
