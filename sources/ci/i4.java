package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i4 implements View.OnAttachStateChangeListener {
    public final boolean f4783a;
    public final View f4784b;
    public final j4 f4785c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.f4785c = j4Var;
        this.f4783a = z10;
        this.f4784b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4783a;
        j4 j4Var = this.f4785c;
        if (z10) {
            j4Var.f4841b = view.getRootView();
        }
        View view2 = this.f4784b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.f4846j);
        view2.addOnLayoutChangeListener(j4Var.f4845i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4784b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.f4785c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.f4846j);
        view2.removeOnLayoutChangeListener(j4Var.f4845i);
    }
}
