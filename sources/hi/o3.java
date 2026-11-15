package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o3 implements View.OnAttachStateChangeListener {
    public final boolean f14804a;
    public final View f14805b;
    public final p3 f14806c;

    public o3(p3 p3Var, boolean z10, View view) {
        this.f14806c = p3Var;
        this.f14804a = z10;
        this.f14805b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f14804a;
        p3 p3Var = this.f14806c;
        if (z10) {
            p3Var.f14843b = view.getRootView();
        }
        View view2 = this.f14805b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(p3Var.f14849j);
        view2.addOnLayoutChangeListener(p3Var.f14848i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f14805b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        p3 p3Var = this.f14806c;
        viewTreeObserver.removeOnGlobalLayoutListener(p3Var.f14849j);
        view2.removeOnLayoutChangeListener(p3Var.f14848i);
    }
}
