package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements View.OnAttachStateChangeListener {
    public final boolean f5117a;
    public final View f5118b;
    public final h4 f5119c;

    public g4(h4 h4Var, boolean z10, View view) {
        this.f5119c = h4Var;
        this.f5117a = z10;
        this.f5118b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f5117a;
        h4 h4Var = this.f5119c;
        if (z10) {
            h4Var.f5159b = view.getRootView();
        }
        View view2 = this.f5118b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h4Var.f5165j);
        view2.addOnLayoutChangeListener(h4Var.f5164i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f5118b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h4 h4Var = this.f5119c;
        viewTreeObserver.removeOnGlobalLayoutListener(h4Var.f5165j);
        view2.removeOnLayoutChangeListener(h4Var.f5164i);
    }
}
