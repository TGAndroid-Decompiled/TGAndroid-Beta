package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
public final class vc implements Runnable {
    public final byte a;
    public final View b;

    public vc(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (view instanceof xmb) {
                    xmb xmbVar = (xmb) view;
                    if (!xmbVar.a) {
                        xmbVar.a = true;
                        xmbVar.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                view.setBackgroundDrawable(null);
                return;
            case 2:
            case 4:
                view.callOnClick();
                return;
            case 3:
                view.performClick();
                return;
            case 5:
                hl.t1(view);
                return;
            case 6:
                view.invalidate();
                return;
            case 7:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 8:
                xea.H(0);
                ((qmb) view).c.c(ob6.M0(2131744054, null), true, true);
                return;
            case 9:
                xea.H(1);
                ((qmb) view).c.c(ob6.M0(2131744053, null), true, true);
                return;
            default:
                xea.H(2);
                ((qmb) view).c.c(ob6.M0(2131744052, null), true, true);
                return;
        }
    }
}
