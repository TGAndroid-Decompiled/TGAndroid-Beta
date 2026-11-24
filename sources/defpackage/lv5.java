package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
public final class lv5 implements View.OnAttachStateChangeListener {
    public final boolean a;
    public final View b;
    public final mv5 c;

    public lv5(mv5 mv5Var, boolean z, View view) {
        this.c = mv5Var;
        this.a = z;
        this.b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z = this.a;
        mv5 mv5Var = this.c;
        if (z) {
            mv5Var.b = view.getRootView();
        }
        View view2 = this.b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(mv5Var.j);
        view2.addOnLayoutChangeListener(mv5Var.i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        mv5 mv5Var = this.c;
        viewTreeObserver.removeOnGlobalLayoutListener(mv5Var.j);
        view2.removeOnLayoutChangeListener(mv5Var.i);
    }
}
