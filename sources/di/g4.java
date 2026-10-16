package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements View.OnAttachStateChangeListener {
    public final boolean f6971a;
    public final View f6972b;
    public final h4 f6973c;

    public g4(h4 h4Var, boolean z10, View view) {
        this.f6973c = h4Var;
        this.f6971a = z10;
        this.f6972b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f6971a;
        h4 h4Var = this.f6973c;
        if (z10) {
            h4Var.f6996b = view.getRootView();
        }
        View view2 = this.f6972b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h4Var.f7001j);
        view2.addOnLayoutChangeListener(h4Var.f7000i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f6972b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h4 h4Var = this.f6973c;
        viewTreeObserver.removeOnGlobalLayoutListener(h4Var.f7001j);
        view2.removeOnLayoutChangeListener(h4Var.f7000i);
    }
}
