package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
public final class uc implements Runnable {
    public final byte a;
    public final View b;

    public uc(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (view instanceof bjb) {
                    bjb bjbVar = (bjb) view;
                    if (!bjbVar.a) {
                        bjbVar.a = true;
                        bjbVar.invalidate();
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
                gba.H(0);
                ((uib) view).c.c(k96.M0(2131744160, null), true, true);
                return;
            case 8:
                gba.H(1);
                ((uib) view).c.c(k96.M0(2131744159, null), true, true);
                return;
            default:
                gba.H(2);
                ((uib) view).c.c(k96.M0(2131744158, null), true, true);
                return;
        }
    }
}
