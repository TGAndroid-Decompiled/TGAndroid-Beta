package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class n3 implements View.OnAttachStateChangeListener {
    public final boolean f15087a;
    public final View f15088b;
    public final o3 f15089c;

    public n3(o3 o3Var, boolean z10, View view) {
        this.f15089c = o3Var;
        this.f15087a = z10;
        this.f15088b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f15087a;
        o3 o3Var = this.f15089c;
        if (z10) {
            o3Var.f15199b = view.getRootView();
        }
        View view2 = this.f15088b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(o3Var.f15205j);
        view2.addOnLayoutChangeListener(o3Var.f15204i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f15088b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        o3 o3Var = this.f15089c;
        viewTreeObserver.removeOnGlobalLayoutListener(o3Var.f15205j);
        view2.removeOnLayoutChangeListener(o3Var.f15204i);
    }
}
