package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class gda implements ry4, nr7, l8, sy4 {
    public final byte a;
    public final kea b;

    public gda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        WindowInsets g = l2dVar.g();
        kea keaVar = this.b;
        keaVar.q0(g);
        mq5 f = l2dVar.a.f(519);
        if (!keaVar.B2.equals(f)) {
            keaVar.B2 = f;
            keaVar.c.requestLayout();
        }
        return l2d.b;
    }

    @Override
    public final int h() {
        return aob.v0(aob.d6, this.b.J0);
    }

    @Override
    public final void k(int i) {
        kea keaVar = this.b;
        tq3 tq3Var = keaVar.J2;
        if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
            if (vsd.a(i, 4)) {
                tq3Var.h(keaVar.X0.e());
            }
            tq3Var.e(keaVar.O2, keaVar.b.getWidth(), keaVar.b.getHeight());
        }
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        n8 n8Var;
        n8 n8Var2;
        byte b = this.a;
        kea keaVar = this.b;
        switch (b) {
            case 2:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = keaVar.E2) != null && n8Var.isShowing()) {
                    keaVar.E2.d(true);
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var2 = keaVar.E2) != null && n8Var2.isShowing()) {
                    keaVar.E2.d(true);
                    return;
                }
                return;
        }
    }
}
