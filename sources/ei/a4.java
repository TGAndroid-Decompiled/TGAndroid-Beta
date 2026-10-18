package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class a4 implements View.OnAttachStateChangeListener {
    public final boolean f8688a;
    public final View f8689b;
    public final b4 f8690c;

    public a4(b4 b4Var, boolean z10, View view) {
        this.f8690c = b4Var;
        this.f8688a = z10;
        this.f8689b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f8688a;
        b4 b4Var = this.f8690c;
        if (z10) {
            b4Var.f8780b = view.getRootView();
        }
        View view2 = this.f8689b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b4Var.f8785j);
        view2.addOnLayoutChangeListener(b4Var.f8784i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f8689b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b4 b4Var = this.f8690c;
        viewTreeObserver.removeOnGlobalLayoutListener(b4Var.f8785j);
        view2.removeOnLayoutChangeListener(b4Var.f8784i);
    }
}
