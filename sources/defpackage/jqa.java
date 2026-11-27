package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public class jqa extends pf0 {
    public final Matrix E1;
    public final float[] F1;
    public final Path G1;
    public boolean[] H1;
    public float[] I1;

    public jqa(Context context) {
        super(context, null);
        this.E1 = new Matrix();
        this.F1 = new float[2];
        this.G1 = new Path();
        this.x0 = true;
        this.y0 = true;
        this.e = false;
    }

    @Override
    public kqa h(nk1 nk1Var) {
        return new kqa(nk1Var);
    }

    public final int M(float f, float f2) {
        RectF rectF = this.I0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + hl.L(16.0f);
        if (f >= centerX) {
            if (f2 <= centerY) {
                return 0;
            }
            if (f2 >= centerY) {
                return 1;
            }
        }
        if (f < centerX && f2 >= centerY) {
            return 2;
        }
        return 3;
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public void k(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqa.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqa.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.n0 = arrayList.size();
        int i = 0;
        while (true) {
            this.o0 = i;
            int i2 = this.o0;
            if (i2 < this.n0) {
                l(canvas, (rk1) arrayList.get(i2));
                p(canvas, (rk1) arrayList.get(this.o0));
                i = this.o0 + 1;
            } else {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void q(defpackage.z2c r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqa.q(z2c):void");
    }

    @Override
    public final long r(int i, int i2) {
        return 100L;
    }
}
