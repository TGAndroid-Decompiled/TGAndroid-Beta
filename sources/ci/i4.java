package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i4 implements View.OnAttachStateChangeListener {
    public final boolean f4778a;
    public final View f4779b;
    public final j4 f4780c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.f4780c = j4Var;
        this.f4778a = z10;
        this.f4779b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4778a;
        j4 j4Var = this.f4780c;
        if (z10) {
            j4Var.f4836b = view.getRootView();
        }
        View view2 = this.f4779b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.f4841j);
        view2.addOnLayoutChangeListener(j4Var.f4840i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4779b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.f4780c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.f4841j);
        view2.removeOnLayoutChangeListener(j4Var.f4840i);
    }
}
