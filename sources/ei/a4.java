package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class a4 implements View.OnAttachStateChangeListener {
    public final boolean f8685a;
    public final View f8686b;
    public final b4 f8687c;

    public a4(b4 b4Var, boolean z10, View view) {
        this.f8687c = b4Var;
        this.f8685a = z10;
        this.f8686b = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        boolean z10 = this.f8685a;
        b4 b4Var = this.f8687c;
        if (z10) {
            b4Var.f8777b = view.getRootView();
        }
        View view2 = this.f8686b;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(b4Var.f8782j);
        view2.addOnLayoutChangeListener(b4Var.f8781i);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.f8686b;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        b4 b4Var = this.f8687c;
        viewTreeObserver.removeOnGlobalLayoutListener(b4Var.f8782j);
        view2.removeOnLayoutChangeListener(b4Var.f8781i);
    }
}
