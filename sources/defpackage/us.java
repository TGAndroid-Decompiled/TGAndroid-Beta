package defpackage;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.o;
public final class us implements View.OnApplyWindowInsetsListener {
    public final byte a;

    public us(c0a c0aVar) {
        this.a = (byte) 3;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return o.J(windowInsets);
            case 1:
                return tx0.c(view, windowInsets);
            case 2:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            default:
                return j1a.e(view, windowInsets);
        }
    }

    public us(byte b) {
        this.a = b;
    }
}
