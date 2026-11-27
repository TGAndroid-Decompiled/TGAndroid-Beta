package defpackage;

import android.location.Location;
import android.view.View;
public final class i42 implements Runnable {
    public final byte a;
    public final s42 b;

    public i42(s42 s42Var, byte b) {
        this.a = b;
        this.b = s42Var;
    }

    @Override
    public final void run() {
        Location location;
        byte b = this.a;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
            case 3:
                s42Var.O();
                return;
            case 1:
                s42Var.b0();
                return;
            case 2:
                double[] dArr = s42Var.b.x4;
                s42Var.f0(dArr[0], dArr[1]);
                return;
            case 4:
                s42Var.getClass();
                hl.c3(new i42(s42Var, (byte) 7));
                return;
            case 5:
                vc6 vc6Var = s42Var.L;
                if (s42Var.l0) {
                    s42Var.l0 = false;
                    return;
                }
                x05 x05Var = s42Var.E;
                if (x05Var != null && (location = s42Var.j0) != null) {
                    location.setLatitude(((ak5) x05Var.d().b).a);
                    s42Var.j0.setLongitude(((ak5) s42Var.E.d().b).b);
                }
                vc6Var.L(s42Var.j0);
                vc6Var.H();
                return;
            case 6:
                View view = s42Var.J;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 7:
                View view2 = s42Var.J;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                s42Var.f0(0.0d, 0.0d);
                return;
        }
    }
}
