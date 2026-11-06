package fi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class p3 implements View.OnAttachStateChangeListener {
    public final boolean f12591a;
    public final View f12592b;
    public final q3 f12593c;

    public p3(q3 q3Var, boolean z9, View view) {
        this.f12593c = q3Var;
        this.f12591a = z9;
        this.f12592b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z9 = this.f12591a;
        q3 q3Var = this.f12593c;
        if (z9) {
            q3Var.f12650b = view.getRootView();
        }
        View view2 = this.f12592b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(q3Var.f12656j);
        view2.addOnLayoutChangeListener(q3Var.f12655i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f12592b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        q3 q3Var = this.f12593c;
        viewTreeObserver.removeOnGlobalLayoutListener(q3Var.f12656j);
        view2.removeOnLayoutChangeListener(q3Var.f12655i);
    }
}
