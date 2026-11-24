package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
public final class qn3 implements View.OnKeyListener {
    public final byte a;
    public final xv4 b;

    public qn3(xv4 xv4Var, byte b) {
        this.a = b;
        this.b = xv4Var;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    LinearLayout linearLayout = xv4Var.e;
                    if (linearLayout != null && !xv4Var.O) {
                        xv4Var.e = null;
                        xv4Var.h(linearLayout, false);
                    } else {
                        xv4Var.c(null);
                    }
                }
                return true;
            case 1:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    xv4Var.c(null);
                }
                return true;
            case 2:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    xv4Var.c(null);
                }
                return true;
            default:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    xv4Var.c(null);
                }
                return true;
        }
    }
}
