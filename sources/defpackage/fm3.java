package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
public final class fm3 implements View.OnKeyListener {
    public final byte a;
    public final vt4 b;

    public fm3(vt4 vt4Var, byte b) {
        this.a = b;
        this.b = vt4Var;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    LinearLayout linearLayout = vt4Var.e;
                    if (linearLayout != null && !vt4Var.O) {
                        vt4Var.e = null;
                        vt4Var.h(linearLayout, false);
                    } else {
                        vt4Var.c(null);
                    }
                }
                return true;
            case 1:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    vt4Var.c(null);
                }
                return true;
            case 2:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    vt4Var.c(null);
                }
                return true;
            default:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    vt4Var.c(null);
                }
                return true;
        }
    }
}
