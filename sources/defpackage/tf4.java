package defpackage;

import org.telegram.utils.twidget.z;
public final class tf4 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public tf4(Object obj, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override
    public final void run() {
        cyc cycVar;
        hyc hycVar;
        switch (this.a) {
            case 0:
                uf4 uf4Var = (uf4) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                if (z) {
                    xf4 xf4Var = uf4Var.K;
                    xf4Var.a = true;
                    xf4Var.b = true;
                }
                if (z2) {
                    uf4Var.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z3 || Math.abs(uf4Var.b0 - currentTimeMillis) > 30) {
                    uf4Var.b0 = currentTimeMillis;
                    uf4Var.e0.run();
                    return;
                }
                return;
            default:
                z zVar = (z) this.e;
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                if (!zVar.A && (cycVar = zVar.R) != null && (hycVar = cycVar.g) != null && hycVar.w && !hycVar.x) {
                    hycVar.l(z4, z5, z6);
                    return;
                }
                return;
        }
    }
}
