package defpackage;

import android.location.Location;
import android.view.View;
public final class d52 implements Runnable {
    public final byte a;
    public final n52 b;

    public d52(n52 n52Var, byte b) {
        this.a = b;
        this.b = n52Var;
    }

    @Override
    public final void run() {
        Location location;
        byte b = this.a;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
            case 2:
                n52Var.O();
                return;
            case 1:
                n52Var.c0();
                return;
            case 3:
                double[] dArr = n52Var.b.x4;
                n52Var.g0(dArr[0], dArr[1]);
                return;
            case 4:
                n52Var.getClass();
                gm.c3(new d52(n52Var, (byte) 7));
                return;
            case 5:
                qc6 qc6Var = n52Var.L;
                if (n52Var.l0) {
                    n52Var.l0 = false;
                    return;
                }
                s05 s05Var = n52Var.E;
                if (s05Var != null && (location = n52Var.j0) != null) {
                    location.setLatitude(((xj5) s05Var.d().b).a);
                    n52Var.j0.setLongitude(((xj5) n52Var.E.d().b).b);
                }
                qc6Var.L(n52Var.j0);
                qc6Var.H();
                return;
            case 6:
                View view = n52Var.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 7:
                View view2 = n52Var.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                n52Var.g0(0.0d, 0.0d);
                return;
        }
    }
}
