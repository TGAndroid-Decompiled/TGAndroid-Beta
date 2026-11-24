package defpackage;

import android.text.TextUtils;
public final class nw8 implements p8c {
    public final byte a;
    public final vw8 b;
    public final String c;

    public nw8(vw8 vw8Var, String str, byte b) {
        this.a = b;
        this.b = vw8Var;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        String str = this.c;
        vw8 vw8Var = this.b;
        gv8 gv8Var = (gv8) obj;
        switch (b) {
            case 0:
                if (TextUtils.equals(vw8Var.d, str)) {
                    if (vw8Var.u0 == null) {
                        z = true;
                    }
                    vw8Var.u0 = gv8Var;
                    if (!vw8Var.w0) {
                        if (z) {
                            vw8Var.t0.a(gv8Var);
                            vw8Var.invalidate();
                            return;
                        }
                        vw8Var.i1(gv8Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (TextUtils.equals(vw8Var.e, str)) {
                    vw8Var.v0 = gv8Var;
                    if (vw8Var.w0 && vw8Var.x0 && vw8Var.B0) {
                        vw8Var.B0 = false;
                        vw8Var.A0 = System.currentTimeMillis() + 60000;
                        vw8Var.B2 = -1;
                    }
                    if (vw8Var.w0) {
                        vw8Var.i1(gv8Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
