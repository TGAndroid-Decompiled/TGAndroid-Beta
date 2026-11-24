package defpackage;

import android.location.Location;
import android.view.View;
public final class s32 implements Runnable {
    public final byte a;
    public final c42 b;

    public s32(c42 c42Var, byte b) {
        this.a = b;
        this.b = c42Var;
    }

    @Override
    public final void run() {
        Location location;
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
            case 2:
                c42Var.P();
                return;
            case 1:
                c42Var.c0();
                return;
            case 3:
                double[] dArr = c42Var.b.x4;
                c42Var.g0(dArr[0], dArr[1]);
                return;
            case 4:
                c42Var.getClass();
                gl.c3(new s32(c42Var, (byte) 7));
                return;
            case 5:
                ra6 ra6Var = c42Var.L;
                if (c42Var.l0) {
                    c42Var.l0 = false;
                    return;
                }
                ty4 ty4Var = c42Var.E;
                if (ty4Var != null && (location = c42Var.j0) != null) {
                    location.setLatitude(((yh5) ty4Var.d().b).a);
                    c42Var.j0.setLongitude(((yh5) c42Var.E.d().b).b);
                }
                ra6Var.L(c42Var.j0);
                ra6Var.H();
                return;
            case 6:
                View view = c42Var.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 7:
                View view2 = c42Var.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                c42Var.g0(0.0d, 0.0d);
                return;
        }
    }
}
