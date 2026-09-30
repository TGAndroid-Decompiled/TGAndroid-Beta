package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements View.OnAttachStateChangeListener {
    public final boolean f4759a;
    public final View f4760b;
    public final i4 f4761c;

    public h4(i4 i4Var, boolean z10, View view) {
        this.f4761c = i4Var;
        this.f4759a = z10;
        this.f4760b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4759a;
        i4 i4Var = this.f4761c;
        if (z10) {
            i4Var.f4783b = view.getRootView();
        }
        View view2 = this.f4760b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i4Var.f4788j);
        view2.addOnLayoutChangeListener(i4Var.f4787i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4760b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i4 i4Var = this.f4761c;
        viewTreeObserver.removeOnGlobalLayoutListener(i4Var.f4788j);
        view2.removeOnLayoutChangeListener(i4Var.f4787i);
    }
}
