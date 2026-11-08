package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.g0;
public class q extends g {
    public final Matrix D1;
    public final float[] E1;
    public final Path F1;
    public boolean[] G1;
    public float[] H1;

    public q(Context context) {
        super(context, null);
        this.D1 = new Matrix();
        this.E1 = new float[2];
        this.F1 = new Path();
        this.f18326w0 = true;
        this.f18328x0 = true;
        this.f18297e = false;
    }

    @Override
    public ng.i h(mg.a aVar) {
        return new ng.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.H0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + g0.L(16.0f);
        int i7 = (f10 > centerX ? 1 : (f10 == centerX ? 0 : -1));
        if (i7 >= 0 && f11 <= centerY) {
            return 0;
        }
        if (i7 >= 0 && f11 >= centerY) {
            return 1;
        }
        if (f10 < centerX && f11 >= centerY) {
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
        throw new UnsupportedOperationException("Method not decompiled: lg.q.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: lg.q.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f18289b;
        this.m0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.f18314n0 = i7;
            int i10 = this.f18314n0;
            if (i10 < this.m0) {
                l(canvas, (ng.d) arrayList.get(i10));
                p(canvas, (ng.d) arrayList.get(this.f18314n0));
                i7 = this.f18314n0 + 1;
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
    public void q(ng.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: lg.q.q(ng.j):void");
    }

    @Override
    public final long r(int i7, int i10) {
        return 100L;
    }
}
