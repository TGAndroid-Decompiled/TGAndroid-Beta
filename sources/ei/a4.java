package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class a4 implements View.OnAttachStateChangeListener {
    public final boolean f8687a;
    public final View f8688b;
    public final b4 f8689c;

    public a4(b4 b4Var, boolean z10, View view) {
        this.f8689c = b4Var;
        this.f8687a = z10;
        this.f8688b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f8687a;
        b4 b4Var = this.f8689c;
        if (z10) {
            b4Var.f8779b = view.getRootView();
        }
        View view2 = this.f8688b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b4Var.f8784j);
        view2.addOnLayoutChangeListener(b4Var.f8783i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f8688b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b4 b4Var = this.f8689c;
        viewTreeObserver.removeOnGlobalLayoutListener(b4Var.f8784j);
        view2.removeOnLayoutChangeListener(b4Var.f8783i);
    }
}
