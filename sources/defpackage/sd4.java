package defpackage;

import org.telegram.utils.twidget.z;
public final class sd4 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public sd4(Object obj, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override
    public final void run() {
        bwc bwcVar;
        gwc gwcVar;
        switch (this.a) {
            case 0:
                td4 td4Var = (td4) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                if (z) {
                    wd4 wd4Var = td4Var.K;
                    wd4Var.a = true;
                    wd4Var.b = true;
                }
                if (z2) {
                    td4Var.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z3 || Math.abs(td4Var.b0 - currentTimeMillis) > 30) {
                    td4Var.b0 = currentTimeMillis;
                    td4Var.e0.run();
                    return;
                }
                return;
            default:
                z zVar = (z) this.e;
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                if (!zVar.A && (bwcVar = zVar.R) != null && (gwcVar = bwcVar.g) != null && gwcVar.w && !gwcVar.x) {
                    gwcVar.l(z4, z5, z6);
                    return;
                }
                return;
        }
    }
}
