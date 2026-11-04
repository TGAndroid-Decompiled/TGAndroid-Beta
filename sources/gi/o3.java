package gi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class o3 implements View.OnAttachStateChangeListener {
    public final boolean f13327a;
    public final View f13328b;
    public final p3 f13329c;

    public o3(p3 p3Var, boolean z10, View view) {
        this.f13329c = p3Var;
        this.f13327a = z10;
        this.f13328b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f13327a;
        p3 p3Var = this.f13329c;
        if (z10) {
            p3Var.f13359b = view.getRootView();
        }
        View view2 = this.f13328b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(p3Var.f13365j);
        view2.addOnLayoutChangeListener(p3Var.f13364i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f13328b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        p3 p3Var = this.f13329c;
        viewTreeObserver.removeOnGlobalLayoutListener(p3Var.f13365j);
        view2.removeOnLayoutChangeListener(p3Var.f13364i);
    }
}
