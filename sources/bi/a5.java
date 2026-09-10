package bi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class a5 implements View.OnAttachStateChangeListener {
    public final boolean f2312a;
    public final View f2313b;
    public final b5 f2314c;

    public a5(b5 b5Var, boolean z10, View view) {
        this.f2314c = b5Var;
        this.f2312a = z10;
        this.f2313b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f2312a;
        b5 b5Var = this.f2314c;
        if (z10) {
            b5Var.f2358b = view.getRootView();
        }
        View view2 = this.f2313b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b5Var.f2363j);
        view2.addOnLayoutChangeListener(b5Var.f2362i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f2313b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b5 b5Var = this.f2314c;
        viewTreeObserver.removeOnGlobalLayoutListener(b5Var.f2363j);
        view2.removeOnLayoutChangeListener(b5Var.f2362i);
    }
}
