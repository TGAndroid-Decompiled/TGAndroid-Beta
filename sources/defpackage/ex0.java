package defpackage;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.SecretMediaViewer;
public final class ex0 implements View.OnApplyWindowInsetsListener {
    public final byte a;
    public final Object b;

    public ex0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((wx0) obj).r(view, windowInsets);
            case 1:
                return ((my0) obj).U(windowInsets);
            default:
                return ((SecretMediaViewer) obj).f(windowInsets);
        }
    }
}
