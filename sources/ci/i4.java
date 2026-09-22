package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i4 implements View.OnAttachStateChangeListener {
    public final boolean f4782a;
    public final View f4783b;
    public final j4 f4784c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.f4784c = j4Var;
        this.f4782a = z10;
        this.f4783b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4782a;
        j4 j4Var = this.f4784c;
        if (z10) {
            j4Var.f4840b = view.getRootView();
        }
        View view2 = this.f4783b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.f4845j);
        view2.addOnLayoutChangeListener(j4Var.f4844i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4783b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.f4784c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.f4845j);
        view2.removeOnLayoutChangeListener(j4Var.f4844i);
    }
}
