package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o3 implements View.OnAttachStateChangeListener {
    public final boolean f15157a;
    public final View f15158b;
    public final p3 f15159c;

    public o3(p3 p3Var, boolean z10, View view) {
        this.f15159c = p3Var;
        this.f15157a = z10;
        this.f15158b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f15157a;
        p3 p3Var = this.f15159c;
        if (z10) {
            p3Var.f15219b = view.getRootView();
        }
        View view2 = this.f15158b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(p3Var.f15225j);
        view2.addOnLayoutChangeListener(p3Var.f15224i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f15158b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        p3 p3Var = this.f15159c;
        viewTreeObserver.removeOnGlobalLayoutListener(p3Var.f15225j);
        view2.removeOnLayoutChangeListener(p3Var.f15224i);
    }
}
