package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
public final class ud implements Runnable {
    public final byte a;
    public final View b;

    public ud(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (view instanceof clb) {
                    clb clbVar = (clb) view;
                    if (!clbVar.a) {
                        clbVar.a = true;
                        clbVar.invalidate();
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
                view.invalidate();
                return;
            case 6:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 7:
                gda.H(0);
                ((vkb) view).c.c(jb6.M0(2131744086, null), true, true);
                return;
            case 8:
                gda.H(1);
                ((vkb) view).c.c(jb6.M0(2131744085, null), true, true);
                return;
            default:
                gda.H(2);
                ((vkb) view).c.c(jb6.M0(2131744084, null), true, true);
                return;
        }
    }
}
