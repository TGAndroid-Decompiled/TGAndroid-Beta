package fi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class y3 implements View.OnAttachStateChangeListener {
    public final boolean f11991a;
    public final View f11992b;
    public final z3 f11993c;

    public y3(z3 z3Var, boolean z10, View view) {
        this.f11993c = z3Var;
        this.f11991a = z10;
        this.f11992b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f11991a;
        z3 z3Var = this.f11993c;
        if (z10) {
            z3Var.f12057b = view.getRootView();
        }
        View view2 = this.f11992b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(z3Var.f12062j);
        view2.addOnLayoutChangeListener(z3Var.f12061i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f11992b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        z3 z3Var = this.f11993c;
        viewTreeObserver.removeOnGlobalLayoutListener(z3Var.f12062j);
        view2.removeOnLayoutChangeListener(z3Var.f12061i);
    }
}
