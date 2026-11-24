package defpackage;

import android.graphics.RectF;
public final class jt1 implements Runnable {
    public final byte a;
    public final gb2 b;
    public final RectF c;

    public jt1(gb2 gb2Var, RectF rectF, byte b) {
        this.a = b;
        this.b = gb2Var;
        this.c = rectF;
    }

    @Override
    public final void run() {
        byte b = this.a;
        RectF rectF = this.c;
        gb2 gb2Var = this.b;
        switch (b) {
            case 0:
                gl.e3(new jt1(gb2Var, rectF, (byte) 1), 400L);
                return;
            default:
                if (gb2Var.getScrimBlockBounds() == rectF) {
                    gb2Var.setScrimBlockBounds(null);
                    return;
                }
                return;
        }
    }
}
