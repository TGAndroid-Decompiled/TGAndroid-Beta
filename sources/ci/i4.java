package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i4 implements View.OnAttachStateChangeListener {
    public final boolean f4784a;
    public final View f4785b;
    public final j4 f4786c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.f4786c = j4Var;
        this.f4784a = z10;
        this.f4785b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4784a;
        j4 j4Var = this.f4786c;
        if (z10) {
            j4Var.f4842b = view.getRootView();
        }
        View view2 = this.f4785b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.f4847j);
        view2.addOnLayoutChangeListener(j4Var.f4846i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4785b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.f4786c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.f4847j);
        view2.removeOnLayoutChangeListener(j4Var.f4846i);
    }
}
