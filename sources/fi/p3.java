package fi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p3 implements View.OnAttachStateChangeListener {
    public final boolean f12593a;
    public final View f12594b;
    public final q3 f12595c;

    public p3(q3 q3Var, boolean z9, View view) {
        this.f12595c = q3Var;
        this.f12593a = z9;
        this.f12594b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z9 = this.f12593a;
        q3 q3Var = this.f12595c;
        if (z9) {
            q3Var.f12654b = view.getRootView();
        }
        View view2 = this.f12594b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(q3Var.f12660j);
        view2.addOnLayoutChangeListener(q3Var.f12659i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f12594b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        q3 q3Var = this.f12595c;
        viewTreeObserver.removeOnGlobalLayoutListener(q3Var.f12660j);
        view2.removeOnLayoutChangeListener(q3Var.f12659i);
    }
}
