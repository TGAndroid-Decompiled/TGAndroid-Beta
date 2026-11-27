package defpackage;

import android.graphics.RectF;
public final class ut1 implements Runnable {
    public final byte a;
    public final wb2 b;
    public final RectF c;

    public ut1(wb2 wb2Var, RectF rectF, byte b) {
        this.a = b;
        this.b = wb2Var;
        this.c = rectF;
    }

    @Override
    public final void run() {
        byte b = this.a;
        RectF rectF = this.c;
        wb2 wb2Var = this.b;
        switch (b) {
            case 0:
                hl.d3(new ut1(wb2Var, rectF, (byte) 1), 400L);
                return;
            default:
                if (wb2Var.getScrimBlockBounds() == rectF) {
                    wb2Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
