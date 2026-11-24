package defpackage;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.o;
public final class vs implements View.OnApplyWindowInsetsListener {
    public final byte a;

    public vs(jw9 jw9Var) {
        this.a = (byte) 3;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return o.J(windowInsets);
            case 1:
                return lx0.c(view, windowInsets);
            case 2:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            default:
                return px9.e(view, windowInsets);
        }
    }

    public vs(byte b) {
        this.a = b;
    }
}
