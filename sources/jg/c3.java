package jg;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
public final class c3 implements View.OnApplyWindowInsetsListener {
    public final d3 f9910a;

    public c3(d3 d3Var) {
        this.f9910a = d3Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i10;
        int i11;
        int i12;
        int i13;
        d3 d3Var = this.f9910a;
        l0 l0Var = d3Var.f9932b;
        Rect rect = d3Var.h;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i10 = insets.left;
            i11 = insets.top;
            i12 = insets.right;
            i13 = insets.bottom;
            rect.set(i10, i11, i12, i13);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        l0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        l0Var.requestLayout();
        if (i14 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
