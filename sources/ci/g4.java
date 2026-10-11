package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements View.OnAttachStateChangeListener {
    public final boolean f5116a;
    public final View f5117b;
    public final h4 f5118c;

    public g4(h4 h4Var, boolean z10, View view) {
        this.f5118c = h4Var;
        this.f5116a = z10;
        this.f5117b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f5116a;
        h4 h4Var = this.f5118c;
        if (z10) {
            h4Var.f5158b = view.getRootView();
        }
        View view2 = this.f5117b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(h4Var.f5164j);
        view2.addOnLayoutChangeListener(h4Var.f5163i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f5117b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        h4 h4Var = this.f5118c;
        viewTreeObserver.removeOnGlobalLayoutListener(h4Var.f5164j);
        view2.removeOnLayoutChangeListener(h4Var.f5163i);
    }
}
