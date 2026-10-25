package fi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class y3 implements View.OnAttachStateChangeListener {
    public final boolean f11992a;
    public final View f11993b;
    public final z3 f11994c;

    public y3(z3 z3Var, boolean z10, View view) {
        this.f11994c = z3Var;
        this.f11992a = z10;
        this.f11993b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f11992a;
        z3 z3Var = this.f11994c;
        if (z10) {
            z3Var.f12058b = view.getRootView();
        }
        View view2 = this.f11993b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(z3Var.f12063j);
        view2.addOnLayoutChangeListener(z3Var.f12062i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f11993b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        z3 z3Var = this.f11994c;
        viewTreeObserver.removeOnGlobalLayoutListener(z3Var.f12063j);
        view2.removeOnLayoutChangeListener(z3Var.f12062i);
    }
}
