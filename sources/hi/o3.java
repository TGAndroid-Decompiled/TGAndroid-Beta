package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o3 implements View.OnAttachStateChangeListener {
    public final boolean f15154a;
    public final View f15155b;
    public final p3 f15156c;

    public o3(p3 p3Var, boolean z10, View view) {
        this.f15156c = p3Var;
        this.f15154a = z10;
        this.f15155b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f15154a;
        p3 p3Var = this.f15156c;
        if (z10) {
            p3Var.f15216b = view.getRootView();
        }
        View view2 = this.f15155b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(p3Var.f15222j);
        view2.addOnLayoutChangeListener(p3Var.f15221i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f15155b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        p3 p3Var = this.f15156c;
        viewTreeObserver.removeOnGlobalLayoutListener(p3Var.f15222j);
        view2.removeOnLayoutChangeListener(p3Var.f15221i);
    }
}
