package defpackage;

import android.graphics.Point;
public final class aob extends wpd {
    public final byte a;
    public final jm7 b;

    public aob(jm7 jm7Var, byte b) {
        this.a = b;
        this.b = jm7Var;
    }

    @Override
    public final void a() {
        switch (this.a) {
            case 1:
                ((iic) this.b).w.invalidate();
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
                Point point = gm.q;
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
                    ((rob) this.b).z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
