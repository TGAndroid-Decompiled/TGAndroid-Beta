package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements View.OnAttachStateChangeListener {
    public final boolean f4749a;
    public final View f4750b;
    public final i4 f4751c;

    public h4(i4 i4Var, boolean z10, View view) {
        this.f4751c = i4Var;
        this.f4749a = z10;
        this.f4750b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f4749a;
        i4 i4Var = this.f4751c;
        if (z10) {
            i4Var.f4777b = view.getRootView();
        }
        View view2 = this.f4750b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(i4Var.f4782j);
        view2.addOnLayoutChangeListener(i4Var.f4781i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f4750b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        i4 i4Var = this.f4751c;
        viewTreeObserver.removeOnGlobalLayoutListener(i4Var.f4782j);
        view2.removeOnLayoutChangeListener(i4Var.f4781i);
    }
}
