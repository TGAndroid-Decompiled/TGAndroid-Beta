package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
public final class l4b implements View.OnApplyWindowInsetsListener {
    public final m4b a;

    public l4b(m4b m4bVar) {
        this.a = m4bVar;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i;
        int i2;
        int i3;
        int i4;
        m4b m4bVar = this.a;
        oc6 oc6Var = m4bVar.b;
        Rect rect = m4bVar.h;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            Insets insets = windowInsets.getInsets(647);
            i = insets.left;
            i2 = insets.top;
            i3 = insets.right;
            i4 = insets.bottom;
            rect.set(i, i2, i3, i4);
        } else {
            rect.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        oc6Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        oc6Var.requestLayout();
        if (i5 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
