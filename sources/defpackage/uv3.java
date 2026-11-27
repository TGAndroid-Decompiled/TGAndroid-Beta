package defpackage;
public final class uv3 implements pcc {
    public final byte a;
    public final zw3 b;

    public uv3(zw3 zw3Var, byte b) {
        this.a = b;
        this.b = zw3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        zw3 zw3Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                ex0 ex0Var = zw3Var.c;
                boolean z = zw3Var.u1;
                boolean z2 = zw3Var.d;
                if (z != z2) {
                    zw3Var.u1 = z2;
                    ex0Var.clearAnimation();
                    float f = 0.0f;
                    if (zw3Var.d) {
                        int i = hl.q.y;
                        int i2 = zw3Var.f;
                        f = Math.min(0.0f, Math.max(((i - i2) * 0.3f) - zw3Var.x1, (-i2) / 3.0f));
                    }
                    ex0Var.animate().translationY(f).setDuration(250L).setInterpolator(hb.w).start();
                    return;
                }
                return;
            case 1:
                ir1 ir1Var = zw3Var.p1;
                if (!ir1Var.s() && ir1Var.getCurrentPosition() != num.intValue()) {
                    ir1Var.F(num.intValue());
                    yw3 yw3Var = zw3Var.q1;
                    yw3Var.G = num.intValue();
                    yw3Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i3 = zw3.C1;
                zw3Var.I0(intValue);
                return;
        }
    }
}
