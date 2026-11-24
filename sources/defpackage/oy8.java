package defpackage;

import android.text.TextUtils;
public final class oy8 implements qac {
    public final byte a;
    public final wy8 b;
    public final String c;

    public oy8(wy8 wy8Var, String str, byte b) {
        this.a = b;
        this.b = wy8Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        String str = this.c;
        wy8 wy8Var = this.b;
        hx8 hx8Var = (hx8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(wy8Var.d, str)) {
                    if (wy8Var.u0 == null) {
                        z = true;
                    }
                    wy8Var.u0 = hx8Var;
                    if (!wy8Var.w0) {
                        if (z) {
                            wy8Var.t0.a(hx8Var);
                            wy8Var.invalidate();
                            return;
                        }
                        wy8Var.i1(hx8Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (TextUtils.equals(wy8Var.e, str)) {
                    wy8Var.v0 = hx8Var;
                    if (wy8Var.w0 && wy8Var.x0 && wy8Var.B0) {
                        wy8Var.B0 = false;
                        wy8Var.A0 = System.currentTimeMillis() + 60000;
                        wy8Var.B2 = -1;
                    }
                    if (wy8Var.w0) {
                        wy8Var.i1(hx8Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
