package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class af8 extends o39 {
    public final jz4 f3;
    public long g3;
    public final gf8 h3;

    public af8(gf8 gf8Var, Context context) {
        super(context, null);
        this.h3 = gf8Var;
        this.f3 = new jz4(8);
    }

    @Override
    public final boolean F0(float f) {
        if (f >= this.h3.y1 + gl.m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        gf8 gf8Var = this.h3;
        if (gf8Var.F1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            gf8Var.D1 += (((float) abs) * gf8Var.E1) / 1800.0f;
            while (true) {
                f = gf8Var.D1;
                float f2 = gf8Var.E1 * 2.0f;
                if (f < f2) {
                    break;
                }
                gf8Var.D1 = f - f2;
            }
            gf8Var.C1.setTranslate(f, 0.0f);
            gf8Var.B1.setLocalMatrix(gf8Var.C1);
            h1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - gl.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        jz4 jz4Var = this.f3;
        jz4Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        jz4Var.b(bkb.v0(bkb.h5, this.o2));
        jz4Var.draw(canvas);
    }
}
