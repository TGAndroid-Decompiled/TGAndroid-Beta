package org.telegram.messenger;
public final class j5 implements us {
    public final int f16221a;
    public final Object f16222b;

    public j5(Object obj, int i10) {
        this.f16221a = i10;
        this.f16222b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f16221a) {
            case 0:
                k2.t0 t0Var = (k2.t0) this.f16222b;
                if (i10 == 25) {
                    t0Var.d(false);
                    return;
                }
                return;
            default:
                h00 h00Var = (h00) this.f16222b;
                if (i10 == 253) {
                    i0.g3(new ms(h00Var, 16));
                    return;
                }
                return;
        }
    }
}
