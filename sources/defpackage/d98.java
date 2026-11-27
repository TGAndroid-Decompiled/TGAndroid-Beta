package defpackage;

import android.view.KeyEvent;
import android.view.View;
public final class d98 implements fd, hj, t69, l8 {
    public final byte a;
    public final l98 b;

    public d98(l98 l98Var, byte b) {
        this.a = b;
        this.b = l98Var;
    }

    @Override
    public final boolean e(int i, View view) {
        l98 l98Var = this.b;
        if (l98Var.Z) {
            l98Var.e0(view, l98Var.K.e.get(i));
            return true;
        } else if (view instanceof d88) {
            j89 j89Var = l98Var.W;
            boolean z = !((d88) view).a();
            l98Var.Y = z;
            j89Var.d(i, view, z);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        l98 l98Var;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (l98Var = this.b).n0) != null && n8Var.isShowing()) {
            l98Var.n0.d(true);
        }
    }

    @Override
    public final void w(id idVar, int i) {
        l98 l98Var = this.b;
        k98 k98Var = l98Var.u0;
        if (k98Var != null) {
            k98Var.b();
        } else {
            l98Var.b0();
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        l98 l98Var = this.b;
        switch (b) {
            case 1:
                l98Var.i0(i, z);
                return;
            default:
                l98Var.i0(i, z);
                return;
        }
    }
}
