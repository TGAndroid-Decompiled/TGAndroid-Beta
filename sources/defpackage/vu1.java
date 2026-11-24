package defpackage;

import android.graphics.RectF;
public final class vu1 implements Runnable {
    public final byte a;
    public final rc2 b;
    public final RectF c;

    public vu1(rc2 rc2Var, RectF rectF, byte b) {
        this.a = b;
        this.b = rc2Var;
        this.c = rectF;
    }

    @Override
    public final void run() {
        byte b = this.a;
        RectF rectF = this.c;
        rc2 rc2Var = this.b;
        switch (b) {
            case 0:
                gm.d3(new vu1(rc2Var, rectF, (byte) 1), 400L);
                return;
            default:
                if (rc2Var.getScrimBlockBounds() == rectF) {
                    rc2Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
