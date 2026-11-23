package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class n3 implements View.OnAttachStateChangeListener {
    public final boolean f15066a;
    public final View f15067b;
    public final o3 f15068c;

    public n3(o3 o3Var, boolean z10, View view) {
        this.f15068c = o3Var;
        this.f15066a = z10;
        this.f15067b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f15066a;
        o3 o3Var = this.f15068c;
        if (z10) {
            o3Var.f15106b = view.getRootView();
        }
        View view2 = this.f15067b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(o3Var.f15112j);
        view2.addOnLayoutChangeListener(o3Var.f15111i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f15067b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        o3 o3Var = this.f15068c;
        viewTreeObserver.removeOnGlobalLayoutListener(o3Var.f15112j);
        view2.removeOnLayoutChangeListener(o3Var.f15111i);
    }
}
