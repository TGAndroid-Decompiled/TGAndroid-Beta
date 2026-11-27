package defpackage;

import android.graphics.Point;
public final class ypb extends ksd {
    public final byte a;
    public final fn7 b;

    public ypb(fn7 fn7Var, byte b) {
        this.a = b;
        this.b = fn7Var;
    }

    @Override
    public final void a() {
        switch (this.a) {
            case 1:
                ((mkc) this.b).w.invalidate();
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
                Point point = hl.q;
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
                    ((pqb) this.b).z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
