package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class pba implements oy4, qq7, k8, py4 {
    public final byte a;
    public final tca b;

    public pba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        WindowInsets g = wzcVar.g();
        tca tcaVar = this.b;
        tcaVar.q0(g);
        iq5 f = wzcVar.a.f(519);
        if (!tcaVar.B2.equals(f)) {
            tcaVar.B2 = f;
            tcaVar.c.requestLayout();
        }
        return wzc.b;
    }

    @Override
    public final int i() {
        return cmb.v0(cmb.c6, this.b.J0);
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 2:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = tcaVar.E2) != null && m8Var.isShowing()) {
                    tcaVar.E2.d(true);
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var2 = tcaVar.E2) != null && m8Var2.isShowing()) {
                    tcaVar.E2.d(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void s(int i) {
        tca tcaVar = this.b;
        mr3 mr3Var = tcaVar.J2;
        if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
            if (iqd.a(i, 4)) {
                mr3Var.h(tcaVar.X0.e());
            }
            mr3Var.e(tcaVar.O2, tcaVar.b.getWidth(), tcaVar.b.getHeight());
        }
    }
}
