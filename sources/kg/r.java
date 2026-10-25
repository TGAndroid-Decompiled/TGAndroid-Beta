package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public class r extends h {
    public final Matrix D1;
    public final float[] E1;
    public final Path F1;
    public boolean[] G1;
    public float[] H1;

    public r(Context context) {
        super(context, null);
        this.D1 = new Matrix();
        this.E1 = new float[2];
        this.F1 = new Path();
        this.f16622w0 = true;
        this.f16624x0 = true;
        this.e = false;
    }

    @Override
    public mg.i h(lg.a aVar) {
        return new mg.i(aVar);
    }

    public final int M(float f7, float f10) {
        RectF rectF = this.H0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        int i10 = (f7 > centerX ? 1 : (f7 == centerX ? 0 : -1));
        if (i10 >= 0 && f10 <= centerY) {
            return 0;
        }
        if (i10 >= 0 && f10 >= centerY) {
            return 1;
        }
        if (f7 < centerX && f10 >= centerY) {
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
        throw new UnsupportedOperationException("Method not decompiled: kg.r.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: kg.r.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f16586b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f16610n0 = i10;
            int i11 = this.f16610n0;
            if (i11 < this.m0) {
                l(canvas, (mg.d) arrayList.get(i11));
                p(canvas, (mg.d) arrayList.get(this.f16610n0));
                i10 = this.f16610n0 + 1;
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
    public void q(mg.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: kg.r.q(mg.j):void");
    }

    @Override
    public final long r(int i10, int i11) {
        return 100L;
    }
}
