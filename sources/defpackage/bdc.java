package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
public abstract class bdc {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131296700);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static vxc b(View view, vxc vxcVar, Rect rect) {
        WindowInsets g = vxcVar.g();
        if (g != null) {
            return vxc.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return vxcVar;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f) {
        view.setElevation(f);
    }

    public static void i(View view, no7 no7Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (no7Var != null) {
            onApplyWindowInsetsListener = new adc(view, no7Var);
        } else {
            onApplyWindowInsetsListener = null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131296689, onApplyWindowInsetsListener);
        }
        if (view.getTag(2131296688) != null) {
            return;
        }
        if (onApplyWindowInsetsListener != null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131296700));
        }
    }

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
