package defpackage;

import android.text.TextUtils;
public final class xz8 implements pcc {
    public final byte a;
    public final g09 b;
    public final String c;

    public xz8(g09 g09Var, String str, byte b) {
        this.a = b;
        this.b = g09Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        String str = this.c;
        g09 g09Var = this.b;
        ry8 ry8Var = (ry8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(g09Var.d, str)) {
                    if (g09Var.u0 == null) {
                        z = true;
                    }
                    g09Var.u0 = ry8Var;
                    if (!g09Var.w0) {
                        if (z) {
                            g09Var.t0.a(ry8Var);
                            g09Var.invalidate();
                            return;
                        }
                        g09Var.i1(ry8Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (TextUtils.equals(g09Var.e, str)) {
                    g09Var.v0 = ry8Var;
                    if (g09Var.w0 && g09Var.x0 && g09Var.B0) {
                        g09Var.B0 = false;
                        g09Var.A0 = System.currentTimeMillis() + 60000;
                        g09Var.B2 = -1;
                    }
                    if (g09Var.w0) {
                        g09Var.i1(ry8Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
