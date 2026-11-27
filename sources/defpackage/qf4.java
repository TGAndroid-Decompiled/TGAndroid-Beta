package defpackage;

import org.telegram.utils.twidget.z;
public final class qf4 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public qf4(Object obj, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override
    public final void run() {
        q0d q0dVar;
        v0d v0dVar;
        switch (this.a) {
            case 0:
                rf4 rf4Var = (rf4) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                if (z) {
                    uf4 uf4Var = rf4Var.K;
                    uf4Var.a = true;
                    uf4Var.b = true;
                }
                if (z2) {
                    rf4Var.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z3 || Math.abs(rf4Var.b0 - currentTimeMillis) > 30) {
                    rf4Var.b0 = currentTimeMillis;
                    rf4Var.e0.run();
                    return;
                }
                return;
            default:
                z zVar = (z) this.e;
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                if (!zVar.A && (q0dVar = zVar.R) != null && (v0dVar = q0dVar.g) != null && v0dVar.w && !v0dVar.x) {
                    v0dVar.l(z4, z5, z6);
                    return;
                }
                return;
        }
    }
}
