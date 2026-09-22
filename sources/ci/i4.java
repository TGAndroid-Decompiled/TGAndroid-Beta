package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i4 implements View.OnAttachStateChangeListener {
    public final boolean f4780a;
    public final View f4781b;
    public final j4 f4782c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.f4782c = j4Var;
        this.f4780a = z10;
        this.f4781b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4780a;
        j4 j4Var = this.f4782c;
        if (z10) {
            j4Var.f4838b = view.getRootView();
        }
        View view2 = this.f4781b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.f4843j);
        view2.addOnLayoutChangeListener(j4Var.f4842i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4781b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.f4782c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.f4843j);
        view2.removeOnLayoutChangeListener(j4Var.f4842i);
    }
}
