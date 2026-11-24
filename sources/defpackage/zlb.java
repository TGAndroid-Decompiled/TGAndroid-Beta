package defpackage;

import android.graphics.Point;
public final class zlb extends tnd {
    public final byte a;
    public final gk7 b;

    public zlb(gk7 gk7Var, byte b) {
        this.a = b;
        this.b = gk7Var;
    }

    @Override
    public final void a() {
        switch (this.a) {
            case 1:
                ((hgc) this.b).w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(int i, int i2) {
        boolean z;
        switch (this.a) {
            case 0:
                Point point = gl.q;
                boolean z2 = false;
                if (point.x <= point.y) {
                    z = true;
                } else {
                    z = false;
                }
                if (i <= i2) {
                    z2 = true;
                }
                if (z == z2) {
                    ((qmb) this.b).z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
