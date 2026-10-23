package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class a4 implements View.OnAttachStateChangeListener {
    public final boolean f8694a;
    public final View f8695b;
    public final b4 f8696c;

    public a4(b4 b4Var, boolean z10, View view) {
        this.f8696c = b4Var;
        this.f8694a = z10;
        this.f8695b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f8694a;
        b4 b4Var = this.f8696c;
        if (z10) {
            b4Var.f8786b = view.getRootView();
        }
        View view2 = this.f8695b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b4Var.f8791j);
        view2.addOnLayoutChangeListener(b4Var.f8790i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f8695b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b4 b4Var = this.f8696c;
        viewTreeObserver.removeOnGlobalLayoutListener(b4Var.f8791j);
        view2.removeOnLayoutChangeListener(b4Var.f8790i);
    }
}
