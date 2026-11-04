package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.g0;
public class q extends g {
    public final Matrix E1;
    public final float[] F1;
    public final Path G1;
    public boolean[] H1;
    public float[] I1;

    public q(Context context) {
        super(context, null);
        this.E1 = new Matrix();
        this.F1 = new float[2];
        this.G1 = new Path();
        this.f19367x0 = true;
        this.f19369y0 = true;
        this.f19336e = false;
    }

    @Override
    public og.i h(ng.a aVar) {
        return new og.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.I0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + g0.L(16.0f);
        int i3 = (f10 > centerX ? 1 : (f10 == centerX ? 0 : -1));
        if (i3 >= 0 && f11 <= centerY) {
            return 0;
        }
        if (i3 >= 0 && f11 >= centerY) {
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
        throw new UnsupportedOperationException("Method not decompiled: mg.q.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: mg.q.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f19328b;
        this.f19353n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.f19354o0 = i3;
            int i10 = this.f19354o0;
            if (i10 < this.f19353n0) {
                l(canvas, (og.d) arrayList.get(i10));
                p(canvas, (og.d) arrayList.get(this.f19354o0));
                i3 = this.f19354o0 + 1;
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
    public void q(og.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: mg.q.q(og.j):void");
    }

    @Override
    public final long r(int i3, int i10) {
        return 100L;
    }
}
