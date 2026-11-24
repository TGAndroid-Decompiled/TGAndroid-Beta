package defpackage;

import android.content.Context;
public final class oe6 extends qc6 {
    public final byte e;
    public final jja f;

    public oe6(qe6 qe6Var, Context context, byte b) {
        super(qe6Var.v0, context);
        this.e = b;
        switch (b) {
            case 1:
                this.f = qe6Var;
                super(qe6Var.v0, context);
                return;
            default:
                this.f = qe6Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        byte b = this.e;
        jja jjaVar = this.f;
        switch (b) {
            case 0:
                return ((qe6) jjaVar).l0;
            case 1:
                return ((qe6) jjaVar).l0;
            default:
                return ((qd6) jjaVar).N;
        }
    }

    @Override
    public final boolean b() {
        byte b = this.e;
        jja jjaVar = this.f;
        switch (b) {
            case 0:
                if (getVisibility() != 0) {
                    return false;
                }
                qe6 qe6Var = (qe6) jjaVar;
                if (qe6Var.b0 > 0 && qe6Var.U != null) {
                    return false;
                }
                return true;
            case 1:
                qe6 qe6Var2 = (qe6) jjaVar;
                if (!isClickable() || getVisibility() != 0 || qe6Var2.g0) {
                    return false;
                }
                oe6 oe6Var = qe6Var2.w;
                if ((oe6Var != null && oe6Var.getVisibility() != 8) || qe6Var2.l0) {
                    return false;
                }
                return true;
            default:
                if (getVisibility() != 0) {
                    return false;
                }
                qd6 qd6Var = (qd6) jjaVar;
                if (qd6Var.Q > 0 && qd6Var.O != null) {
                    return false;
                }
                return true;
        }
    }

    public oe6(qd6 qd6Var, Context context) {
        super(qd6Var.b0, context);
        this.e = (byte) 2;
        this.f = qd6Var;
    }
}
