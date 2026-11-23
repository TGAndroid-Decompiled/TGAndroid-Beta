package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class n3 implements View.OnAttachStateChangeListener {
    public final boolean f15090a;
    public final View f15091b;
    public final o3 f15092c;

    public n3(o3 o3Var, boolean z10, View view) {
        this.f15092c = o3Var;
        this.f15090a = z10;
        this.f15091b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f15090a;
        o3 o3Var = this.f15092c;
        if (z10) {
            o3Var.f15202b = view.getRootView();
        }
        View view2 = this.f15091b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(o3Var.f15208j);
        view2.addOnLayoutChangeListener(o3Var.f15207i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f15091b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        o3 o3Var = this.f15092c;
        viewTreeObserver.removeOnGlobalLayoutListener(o3Var.f15208j);
        view2.removeOnLayoutChangeListener(o3Var.f15207i);
    }
}
