package org.telegram.messenger;
public final class j5 implements vs {
    public final int f16416a;
    public final Object f16417b;

    public j5(Object obj, int i10) {
        this.f16416a = i10;
        this.f16417b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f16416a) {
            case 0:
                k2.t0 t0Var = (k2.t0) this.f16417b;
                if (i10 == 25) {
                    t0Var.d(false);
                    return;
                }
                return;
            default:
                i00 i00Var = (i00) this.f16417b;
                if (i10 == 253) {
                    i0.g3(new ns(i00Var, 16));
                    return;
                }
                return;
        }
    }
}
