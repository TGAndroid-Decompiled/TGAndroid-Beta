package ki;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class b2 implements View.OnApplyWindowInsetsListener {
    public final int f18213a;
    public final Dialog f18214b;

    public b2(Dialog dialog, int i7) {
        this.f18213a = i7;
        this.f18214b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f18213a) {
            case 0:
                return x2.h((x2) this.f18214b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.u2.z((org.telegram.ui.ActionBar.u2) this.f18214b, windowInsets);
        }
    }
}
