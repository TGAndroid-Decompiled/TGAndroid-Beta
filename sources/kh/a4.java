package kh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class a4 implements View.OnAttachStateChangeListener {
    public final boolean f14889a;
    public final View f14890b;
    public final b4 f14891c;

    public a4(b4 b4Var, boolean z10, View view) {
        this.f14891c = b4Var;
        this.f14889a = z10;
        this.f14890b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f14889a;
        b4 b4Var = this.f14891c;
        if (z10) {
            b4Var.f14991b = view.getRootView();
        }
        View view2 = this.f14890b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b4Var.f14997j);
        view2.addOnLayoutChangeListener(b4Var.f14996i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f14890b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b4 b4Var = this.f14891c;
        viewTreeObserver.removeOnGlobalLayoutListener(b4Var.f14997j);
        view2.removeOnLayoutChangeListener(b4Var.f14996i);
    }
}
