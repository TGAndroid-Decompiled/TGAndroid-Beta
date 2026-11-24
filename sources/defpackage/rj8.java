package defpackage;

import android.content.Context;
public final class rj8 implements Runnable {
    public final byte a;
    public final yj8 b;

    public rj8(yj8 yj8Var, byte b) {
        this.a = b;
        this.b = yj8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yj8 yj8Var = this.b;
        switch (b) {
            case 0:
                Context context = yj8Var.getContext();
                l11.u(context, "https://" + oc7.r1(yj8Var.T1).N2 + "/nft/" + yj8Var.y2.slug);
                return;
            case 1:
                try {
                    yj8Var.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                yj8Var.j2.c(yj8Var.F2);
                return;
            default:
                yj8Var.J2[0].setVisibility(8);
                return;
        }
    }
}
