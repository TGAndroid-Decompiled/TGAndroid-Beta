package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements View.OnAttachStateChangeListener {
    public final boolean f6968a;
    public final View f6969b;
    public final h4 f6970c;

    public g4(h4 h4Var, boolean z10, View view) {
        this.f6970c = h4Var;
        this.f6968a = z10;
        this.f6969b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f6968a;
        h4 h4Var = this.f6970c;
        if (z10) {
            h4Var.f6993b = view.getRootView();
        }
        View view2 = this.f6969b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h4Var.f6998j);
        view2.addOnLayoutChangeListener(h4Var.f6997i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f6969b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h4 h4Var = this.f6970c;
        viewTreeObserver.removeOnGlobalLayoutListener(h4Var.f6998j);
        view2.removeOnLayoutChangeListener(h4Var.f6997i);
    }
}
