package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class w3 implements View.OnAttachStateChangeListener {
    public final boolean f15670a;
    public final View f15671b;
    public final x3 f15672c;

    public w3(x3 x3Var, boolean z10, View view) {
        this.f15672c = x3Var;
        this.f15670a = z10;
        this.f15671b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f15670a;
        x3 x3Var = this.f15672c;
        if (z10) {
            x3Var.f15709b = view.getRootView();
        }
        View view2 = this.f15671b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(x3Var.f15715j);
        view2.addOnLayoutChangeListener(x3Var.f15714i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f15671b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        x3 x3Var = this.f15672c;
        viewTreeObserver.removeOnGlobalLayoutListener(x3Var.f15715j);
        view2.removeOnLayoutChangeListener(x3Var.f15714i);
    }
}
