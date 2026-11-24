package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
public final class ch8 extends r59 {
    public final i15 f3;
    public long g3;
    public final ih8 h3;

    public ch8(ih8 ih8Var, Context context) {
        super(context, null);
        this.h3 = ih8Var;
        this.f3 = new i15(8);
    }

    @Override
    public final boolean F0(float f) {
        if (f >= this.h3.y1 + gm.m) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ih8 ih8Var = this.h3;
        if (ih8Var.F1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            ih8Var.D1 += (((float) abs) * ih8Var.E1) / 1800.0f;
            while (true) {
                f = ih8Var.D1;
                float f2 = ih8Var.E1 * 2.0f;
                if (f < f2) {
                    break;
                }
                ih8Var.D1 = f - f2;
            }
            ih8Var.C1.setTranslate(f, 0.0f);
            ih8Var.B1.setLocalMatrix(ih8Var.C1);
            h1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - gm.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        i15 i15Var = this.f3;
        i15Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        i15Var.b(cmb.v0(cmb.h5, this.o2));
        i15Var.draw(canvas);
    }
}
