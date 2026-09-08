package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i4 implements View.OnAttachStateChangeListener {
    public final boolean f7394a;
    public final View f7395b;
    public final j4 f7396c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.f7396c = j4Var;
        this.f7394a = z10;
        this.f7395b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f7394a;
        j4 j4Var = this.f7396c;
        if (z10) {
            j4Var.f7455b = view.getRootView();
        }
        View view2 = this.f7395b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.f7461j);
        view2.addOnLayoutChangeListener(j4Var.f7460i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f7395b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.f7396c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.f7461j);
        view2.removeOnLayoutChangeListener(j4Var.f7460i);
    }
}
