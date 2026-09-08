package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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
        this.f13720w0 = true;
        this.f13722x0 = true;
        this.f13691e = false;
    }

    @Override
    public lg.i h(kg.a aVar) {
        return new lg.i(aVar);
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
        throw new UnsupportedOperationException("Method not decompiled: jg.q.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: jg.q.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f13683b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f13708n0 = i10;
            int i11 = this.f13708n0;
            if (i11 < this.m0) {
                l(canvas, (lg.d) arrayList.get(i11));
                p(canvas, (lg.d) arrayList.get(this.f13708n0));
                i10 = this.f13708n0 + 1;
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
    public void q(lg.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: jg.q.q(lg.j):void");
    }

    @Override
    public final long r(int i10, int i11) {
        return 100L;
    }
}
