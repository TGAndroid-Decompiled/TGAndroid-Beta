package defpackage;

import android.content.Context;
public final class rg6 extends te6 {
    public final byte e;
    public final cna f;

    public rg6(tg6 tg6Var, Context context, byte b) {
        super(tg6Var.v0, context);
        this.e = b;
        switch (b) {
            case 1:
                this.f = tg6Var;
                super(tg6Var.v0, context);
                return;
            default:
                this.f = tg6Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        byte b = this.e;
        cna cnaVar = this.f;
        switch (b) {
            case 0:
                return ((tg6) cnaVar).l0;
            case 1:
                return ((tg6) cnaVar).l0;
            default:
                return ((sf6) cnaVar).N;
        }
    }

    @Override
    public final boolean b() {
        byte b = this.e;
        cna cnaVar = this.f;
        switch (b) {
            case 0:
                if (getVisibility() != 0) {
                    return false;
                }
                tg6 tg6Var = (tg6) cnaVar;
                if (tg6Var.b0 > 0 && tg6Var.U != null) {
                    return false;
                }
                return true;
            case 1:
                tg6 tg6Var2 = (tg6) cnaVar;
                if (!isClickable() || getVisibility() != 0 || tg6Var2.g0) {
                    return false;
                }
                rg6 rg6Var = tg6Var2.w;
                if ((rg6Var != null && rg6Var.getVisibility() != 8) || tg6Var2.l0) {
                    return false;
                }
                return true;
            default:
                if (getVisibility() != 0) {
                    return false;
                }
                sf6 sf6Var = (sf6) cnaVar;
                if (sf6Var.Q > 0 && sf6Var.O != null) {
                    return false;
                }
                return true;
        }
    }

    public rg6(sf6 sf6Var, Context context) {
        super(sf6Var.b0, context);
        this.e = (byte) 2;
        this.f = sf6Var;
    }
}
