package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements View.OnAttachStateChangeListener {
    public final boolean f5115a;
    public final View f5116b;
    public final h4 f5117c;

    public g4(h4 h4Var, boolean z10, View view) {
        this.f5117c = h4Var;
        this.f5115a = z10;
        this.f5116b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f5115a;
        h4 h4Var = this.f5117c;
        if (z10) {
            h4Var.f5157b = view.getRootView();
        }
        View view2 = this.f5116b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h4Var.f5163j);
        view2.addOnLayoutChangeListener(h4Var.f5162i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f5116b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h4 h4Var = this.f5117c;
        viewTreeObserver.removeOnGlobalLayoutListener(h4Var.f5163j);
        view2.removeOnLayoutChangeListener(h4Var.f5162i);
    }
}
