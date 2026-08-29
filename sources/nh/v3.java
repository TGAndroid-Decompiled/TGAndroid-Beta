package nh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class v3 implements View.OnAttachStateChangeListener {
    public final boolean f18743a;
    public final View f18744b;
    public final w3 f18745c;

    public v3(w3 w3Var, boolean z10, View view) {
        this.f18745c = w3Var;
        this.f18743a = z10;
        this.f18744b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f18743a;
        w3 w3Var = this.f18745c;
        if (z10) {
            w3Var.f18778b = view.getRootView();
        }
        View view2 = this.f18744b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(w3Var.f18784j);
        view2.addOnLayoutChangeListener(w3Var.f18783i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f18744b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        w3 w3Var = this.f18745c;
        viewTreeObserver.removeOnGlobalLayoutListener(w3Var.f18784j);
        view2.removeOnLayoutChangeListener(w3Var.f18783i);
    }
}
