package defpackage;

import android.text.TextUtils;
public final class xz8 implements pcc {
    public final byte a;
    public final f09 b;
    public final String c;

    public xz8(f09 f09Var, String str, byte b) {
        this.a = b;
        this.b = f09Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        String str = this.c;
        f09 f09Var = this.b;
        ry8 ry8Var = (ry8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(f09Var.d, str)) {
                    if (f09Var.u0 == null) {
                        z = true;
                    }
                    f09Var.u0 = ry8Var;
                    if (!f09Var.w0) {
                        if (z) {
                            f09Var.t0.a(ry8Var);
                            f09Var.invalidate();
                            return;
                        }
                        f09Var.i1(ry8Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (TextUtils.equals(f09Var.e, str)) {
                    f09Var.v0 = ry8Var;
                    if (f09Var.w0 && f09Var.x0 && f09Var.B0) {
                        f09Var.B0 = false;
                        f09Var.A0 = System.currentTimeMillis() + 60000;
                        f09Var.B2 = -1;
                    }
                    if (f09Var.w0) {
                        f09Var.i1(ry8Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
