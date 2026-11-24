package defpackage;

import android.view.KeyEvent;
import android.view.View;
public final class m58 implements ed, gj, e39, k8 {
    public final byte a;
    public final u58 b;

    public m58(u58 u58Var, byte b) {
        this.a = b;
        this.b = u58Var;
    }

    @Override
    public final boolean d(int i, View view) {
        u58 u58Var = this.b;
        if (u58Var.Z) {
            u58Var.e0(view, u58Var.K.e.get(i));
            return true;
        } else if (view instanceof o48) {
            w49 w49Var = u58Var.W;
            boolean z = !((o48) view).a();
            u58Var.Y = z;
            w49Var.d(i, view, z);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        u58 u58Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (u58Var = this.b).n0) != null && m8Var.isShowing()) {
            u58Var.n0.d(true);
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        u58 u58Var = this.b;
        switch (b) {
            case 1:
                u58Var.i0(i, z);
                return;
            default:
                u58Var.i0(i, z);
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        u58 u58Var = this.b;
        t58 t58Var = u58Var.u0;
        if (t58Var != null) {
            t58Var.d();
        } else {
            u58Var.b0();
        }
    }
}
