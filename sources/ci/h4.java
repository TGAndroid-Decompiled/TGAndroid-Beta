package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements View.OnAttachStateChangeListener {
    public final boolean f5131a;
    public final View f5132b;
    public final i4 f5133c;

    public h4(i4 i4Var, boolean z10, View view) {
        this.f5133c = i4Var;
        this.f5131a = z10;
        this.f5132b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f5131a;
        i4 i4Var = this.f5133c;
        if (z10) {
            i4Var.f5160b = view.getRootView();
        }
        View view2 = this.f5132b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i4Var.f5166j);
        view2.addOnLayoutChangeListener(i4Var.f5165i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f5132b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i4 i4Var = this.f5133c;
        viewTreeObserver.removeOnGlobalLayoutListener(i4Var.f5166j);
        view2.removeOnLayoutChangeListener(i4Var.f5165i);
    }
}
