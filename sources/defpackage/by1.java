package defpackage;

import android.view.KeyEvent;
import android.view.View;
public final class by1 implements View.OnKeyListener {
    public final byte a;
    public final zv4 b;

    public by1(zv4 zv4Var, byte b) {
        this.a = b;
        this.b = zv4Var;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1 && !zv4Var.d()) {
                    zv4Var.c(null);
                }
                return true;
            case 1:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1 && !zv4Var.d()) {
                    zv4Var.c(null);
                }
                return true;
            case 2:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1 && !zv4Var.d()) {
                    zv4Var.c(null);
                }
                return true;
            case 3:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    zv4Var.c(null);
                }
                return true;
            default:
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    zv4Var.c(null);
                }
                return true;
        }
    }
}
