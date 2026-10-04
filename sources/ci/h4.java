package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements View.OnAttachStateChangeListener {
    public final boolean f5130a;
    public final View f5131b;
    public final i4 f5132c;

    public h4(i4 i4Var, boolean z10, View view) {
        this.f5132c = i4Var;
        this.f5130a = z10;
        this.f5131b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f5130a;
        i4 i4Var = this.f5132c;
        if (z10) {
            i4Var.f5159b = view.getRootView();
        }
        View view2 = this.f5131b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i4Var.f5165j);
        view2.addOnLayoutChangeListener(i4Var.f5164i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f5131b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i4 i4Var = this.f5132c;
        viewTreeObserver.removeOnGlobalLayoutListener(i4Var.f5165j);
        view2.removeOnLayoutChangeListener(i4Var.f5164i);
    }
}
