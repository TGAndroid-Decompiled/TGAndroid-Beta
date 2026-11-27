package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
public final class qx5 implements View.OnAttachStateChangeListener {
    public final boolean a;
    public final View b;
    public final rx5 c;

    public qx5(rx5 rx5Var, boolean z, View view) {
        this.c = rx5Var;
        this.a = z;
        this.b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z = this.a;
        rx5 rx5Var = this.c;
        if (z) {
            rx5Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(rx5Var.j);
        view2.addOnLayoutChangeListener(rx5Var.i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        rx5 rx5Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(rx5Var.j);
        view2.removeOnLayoutChangeListener(rx5Var.i);
    }
}
