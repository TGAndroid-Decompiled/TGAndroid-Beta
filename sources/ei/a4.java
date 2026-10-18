package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class a4 implements View.OnAttachStateChangeListener {
    public final boolean f8686a;
    public final View f8687b;
    public final b4 f8688c;

    public a4(b4 b4Var, boolean z10, View view) {
        this.f8688c = b4Var;
        this.f8686a = z10;
        this.f8687b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f8686a;
        b4 b4Var = this.f8688c;
        if (z10) {
            b4Var.f8778b = view.getRootView();
        }
        View view2 = this.f8687b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b4Var.f8783j);
        view2.addOnLayoutChangeListener(b4Var.f8782i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f8687b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b4 b4Var = this.f8688c;
        viewTreeObserver.removeOnGlobalLayoutListener(b4Var.f8783j);
        view2.removeOnLayoutChangeListener(b4Var.f8782i);
    }
}
