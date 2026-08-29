package bg;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
public final class b4 implements View.OnApplyWindowInsetsListener {
    public final c4 f2111a;

    public b4(c4 c4Var) {
        this.f2111a = c4Var;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        int i10;
        int i11;
        int i12;
        int i13;
        c4 c4Var = this.f2111a;
        x2 x2Var = c4Var.f2127b;
        Rect rect = c4Var.h;
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
        x2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        x2Var.requestLayout();
        if (i14 >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
