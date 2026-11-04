package ii;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class b2 implements View.OnApplyWindowInsetsListener {
    public final int f14846a;
    public final Dialog f14847b;

    public b2(Dialog dialog, int i3) {
        this.f14846a = i3;
        this.f14847b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f14846a) {
            case 0:
                return a3.h((a3) this.f14847b, view, windowInsets);
            default:
                return org.telegram.ui.ActionBar.t2.z((org.telegram.ui.ActionBar.t2) this.f14847b, windowInsets);
        }
    }
}
