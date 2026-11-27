package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
public final class cq implements PopupWindow.OnDismissListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public cq(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void onDismiss() {
        View view;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ViewTreeObserver viewTreeObserver = ((dq) obj2).X.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener((vp) obj);
                    return;
                }
                return;
            default:
                fu5 fu5Var = (fu5) obj2;
                fu5Var.m = null;
                fu5Var.v((ViewGroup) obj);
                View view2 = fu5Var.v0;
                if (view2 != null) {
                    view2.setPressed(false);
                    fu5Var.v0 = null;
                }
                if (fu5Var.u0 != null && (view = fu5Var.f) != null) {
                    view.setOnTouchListener(null);
                }
                fu5Var.u0 = null;
                fu5Var.O();
                Runnable runnable = fu5Var.p;
                if (runnable != null) {
                    runnable.run();
                    fu5Var.p = null;
                    return;
                }
                return;
        }
    }
}
