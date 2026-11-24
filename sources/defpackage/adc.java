package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
public final class adc implements View.OnApplyWindowInsetsListener {
    public vxc a = null;
    public final View b;
    public final no7 c;

    public adc(View view, no7 no7Var) {
        this.b = view;
        this.c = no7Var;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        vxc h = vxc.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        no7 no7Var = this.c;
        if (i < 30) {
            bdc.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return no7Var.W(view, h).g();
            }
        }
        this.a = h;
        vxc W = no7Var.W(view, h);
        if (i >= 30) {
            return W.g();
        }
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(view);
        return W.g();
    }
}
