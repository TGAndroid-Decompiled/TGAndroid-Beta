package lh;

import android.view.View;
import android.view.ViewTreeObserver;

public final class z3 implements View.OnAttachStateChangeListener {

    public final boolean f17180a;

    public final View f17181b;

    public final a4 f17182c;

    public z3(a4 a4Var, boolean z10, View view) {
        this.f17182c = a4Var;
        this.f17180a = z10;
        this.f17181b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f17180a;
        a4 a4Var = this.f17182c;
        if (z10) {
            a4Var.f15634b = view.getRootView();
        }
        View view2 = this.f17181b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(a4Var.f15640j);
        view2.addOnLayoutChangeListener(a4Var.f15639i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f17181b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        a4 a4Var = this.f17182c;
        viewTreeObserver.removeOnGlobalLayoutListener(a4Var.f15640j);
        view2.removeOnLayoutChangeListener(a4Var.f15639i);
    }
}
