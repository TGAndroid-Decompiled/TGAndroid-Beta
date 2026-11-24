package defpackage;

import android.content.Context;
public final class ng6 extends pe6 {
    public final byte e;
    public final kla f;

    public ng6(rg6 rg6Var, Context context, byte b) {
        super(rg6Var.v0, context);
        this.e = b;
        switch (b) {
            case 1:
                this.f = rg6Var;
                super(rg6Var.v0, context);
                return;
            default:
                this.f = rg6Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        byte b = this.e;
        kla klaVar = this.f;
        switch (b) {
            case 0:
                return ((rg6) klaVar).l0;
            case 1:
                return ((rg6) klaVar).l0;
            default:
                return ((pf6) klaVar).N;
        }
    }

    @Override
    public final boolean b() {
        byte b = this.e;
        kla klaVar = this.f;
        switch (b) {
            case 0:
                if (getVisibility() != 0) {
                    return false;
                }
                rg6 rg6Var = (rg6) klaVar;
                if (rg6Var.b0 > 0 && rg6Var.U != null) {
                    return false;
                }
                return true;
            case 1:
                rg6 rg6Var2 = (rg6) klaVar;
                if (!isClickable() || getVisibility() != 0 || rg6Var2.g0) {
                    return false;
                }
                ng6 ng6Var = rg6Var2.w;
                if ((ng6Var != null && ng6Var.getVisibility() != 8) || rg6Var2.l0) {
                    return false;
                }
                return true;
            default:
                if (getVisibility() != 0) {
                    return false;
                }
                pf6 pf6Var = (pf6) klaVar;
                if (pf6Var.Q > 0 && pf6Var.O != null) {
                    return false;
                }
                return true;
        }
    }

    public ng6(pf6 pf6Var, Context context) {
        super(pf6Var.b0, context);
        this.e = (byte) 2;
        this.f = pf6Var;
    }
}
