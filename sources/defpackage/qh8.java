package defpackage;

import android.content.Context;
public final class qh8 implements Runnable {
    public final byte a;
    public final xh8 b;

    public qh8(xh8 xh8Var, byte b) {
        this.a = b;
        this.b = xh8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xh8 xh8Var = this.b;
        switch (b) {
            case 0:
                Context context = xh8Var.getContext();
                d01.t(context, "https://" + na7.q1(xh8Var.T1).N2 + "/nft/" + xh8Var.y2.slug);
                return;
            case 1:
                try {
                    xh8Var.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                xh8Var.j2.c(xh8Var.F2);
                return;
            default:
                xh8Var.J2[0].setVisibility(8);
                return;
        }
    }
}
