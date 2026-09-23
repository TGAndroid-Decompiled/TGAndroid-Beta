package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements View.OnAttachStateChangeListener {
    public final boolean f4751a;
    public final View f4752b;
    public final i4 f4753c;

    public h4(i4 i4Var, boolean z10, View view) {
        this.f4753c = i4Var;
        this.f4751a = z10;
        this.f4752b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4751a;
        i4 i4Var = this.f4753c;
        if (z10) {
            i4Var.f4775b = view.getRootView();
        }
        View view2 = this.f4752b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i4Var.f4780j);
        view2.addOnLayoutChangeListener(i4Var.f4779i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4752b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i4 i4Var = this.f4753c;
        viewTreeObserver.removeOnGlobalLayoutListener(i4Var.f4780j);
        view2.removeOnLayoutChangeListener(i4Var.f4779i);
    }
}
