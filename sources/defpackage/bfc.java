package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class bfc implements View.OnApplyWindowInsetsListener {
    public wzc a = null;
    public final View b;
    public final qq7 c;

    public bfc(View view, qq7 qq7Var) {
        this.b = view;
        this.c = qq7Var;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        wzc h = wzc.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        qq7 qq7Var = this.c;
        if (i < 30) {
            cfc.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return qq7Var.C0(view, h).g();
            }
        }
        this.a = h;
        wzc C0 = qq7Var.C0(view, h);
        if (i >= 30) {
            return C0.g();
        }
        WeakHashMap weakHashMap = kfc.a;
        afc.c(view);
        return C0.g();
    }
}
