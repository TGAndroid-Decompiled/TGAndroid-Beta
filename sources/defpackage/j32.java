package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class j32 implements Runnable {
    public final byte a;
    public final r32 b;

    public j32(r32 r32Var, byte b) {
        this.a = b;
        this.b = r32Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        r32 r32Var = this.b;
        switch (b) {
            case 0:
                r32Var.Z();
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = r32Var.T;
                if (!r32Var.L && !r32Var.O0 && !r32Var.b.J && r32Var.M0 && r32Var.U0 == null && editTextBoldCursor.hasFocus() && r32Var.isShown()) {
                    gl.E3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                if (!r32Var.L && r32Var.M0 && r32Var.isShown()) {
                    r32Var.c0();
                    return;
                }
                return;
            case 3:
                if (!r32Var.L) {
                    float f = r32Var.n0;
                    if (f < 1.0f && r32Var.m0 == null) {
                        yla ylaVar = new yla(new ti4(f));
                        r32Var.m0 = ylaVar;
                        zla zlaVar = new zla(1.0f);
                        zlaVar.a(0.55f);
                        zlaVar.b(65.0f);
                        ylaVar.m = zlaVar;
                        r32Var.m0.f(0.001f);
                        r32Var.m0.b(new h10(r32Var, (byte) 4));
                        r32Var.m0.a(new zv0(r32Var, (byte) 4));
                        r32Var.m0.h();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (r32Var.M0 && !r32Var.L) {
                    r32Var.b0();
                    if (r32Var.N0) {
                        r32Var.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!r32Var.q0) {
                    r32Var.p0.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
