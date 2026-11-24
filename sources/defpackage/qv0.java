package defpackage;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.ui.SecretMediaViewer;
public final class qv0 implements View.OnApplyWindowInsetsListener {
    public final byte a;
    public final Object b;

    public qv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ow0) obj).r(view, windowInsets);
            case 1:
                return ((fx0) obj).V(windowInsets);
            default:
                return ((SecretMediaViewer) obj).f(windowInsets);
        }
    }
}
