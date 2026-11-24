package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
public final class lx5 implements View.OnAttachStateChangeListener {
    public final boolean a;
    public final View b;
    public final mx5 c;

    public lx5(mx5 mx5Var, boolean z, View view) {
        this.c = mx5Var;
        this.a = z;
        this.b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z = this.a;
        mx5 mx5Var = this.c;
        if (z) {
            mx5Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(mx5Var.j);
        view2.addOnLayoutChangeListener(mx5Var.i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        mx5 mx5Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(mx5Var.j);
        view2.removeOnLayoutChangeListener(mx5Var.i);
    }
}
