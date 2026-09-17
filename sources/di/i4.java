package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i4 implements View.OnAttachStateChangeListener {
    public final boolean f7366a;
    public final View f7367b;
    public final j4 f7368c;

    public i4(j4 j4Var, boolean z10, View view) {
        this.f7368c = j4Var;
        this.f7366a = z10;
        this.f7367b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f7366a;
        j4 j4Var = this.f7368c;
        if (z10) {
            j4Var.f7427b = view.getRootView();
        }
        View view2 = this.f7367b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(j4Var.f7433j);
        view2.addOnLayoutChangeListener(j4Var.f7432i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f7367b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        j4 j4Var = this.f7368c;
        viewTreeObserver.removeOnGlobalLayoutListener(j4Var.f7433j);
        view2.removeOnLayoutChangeListener(j4Var.f7432i);
    }
}
