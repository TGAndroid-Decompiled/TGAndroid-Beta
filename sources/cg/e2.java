package cg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
public final class e2 {
    public p1 f2368a;
    public j1 f2369b;
    public Paint f2370c;
    public Paint d;
    public Paint e;
    public Paint f2371f;
    public Paint f2372g;
    public s1 h;
    public float f2373i;
    public float f2374j;
    public d2 f2375k;
    public a2 f2376l;
    public ArrayList f2377m;
    public ArrayList f2378n;
    public Matrix f2379o;
    public float[] f2380p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, jv0 jv0Var, d2 d2Var) {
        Paint paint;
        Paint paint2;
        float width = (d2Var.d / jv0Var.f26052a) * canvas.getWidth();
        float height = (d2Var.e / jv0Var.f26053b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z4 = d2Var.f2356a;
        if (z4) {
            paint = this.d;
        } else {
            paint = this.f2371f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (d2Var.d / jv0Var.f26052a) * canvas.getWidth();
        float height2 = (d2Var.e / jv0Var.f26053b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z4) {
            paint2 = this.e;
        } else {
            paint2 = this.f2372g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f10, float f11, boolean z4) {
        float[] fArr = this.f2380p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z4);
    }

    public final void d(boolean z4) {
        int i10;
        float[] fArr = this.f2380p;
        s1 s1Var = this.h;
        if (s1Var != null) {
            float f10 = s1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - s1Var.f2517b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - s1Var.f2518c;
                if (z4) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f10 * i10;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                s1 s1Var2 = this.h;
                fArr[0] = cos + s1Var2.f2517b;
                fArr[1] = ((float) kh.a2.a(d, fArr[1], sin)) + s1Var2.f2518c;
            }
        }
    }

    public final void e() {
        s1 s1Var;
        p1 p1Var = this.f2368a;
        if (p1Var != null && p1Var.getPainting() != null && (s1Var = this.h) != null) {
            s1Var.f2519f = p1Var.getCurrentWeight();
            d1 painting = p1Var.getPainting();
            s1 s1Var2 = this.h;
            int currentColor = p1Var.getCurrentColor();
            if (s1Var2 != null) {
                if (painting.f2348r != null) {
                    painting.f2337f.f(new ah.a(painting, s1Var2, currentColor, 1));
                }
            } else {
                painting.getClass();
            }
            this.f2377m.clear();
            this.f2378n.clear();
            this.h = null;
            o1 o1Var = p1Var.f2492a;
            if (o1Var != null) {
                o1Var.c();
            }
            p1Var.e.f2469z = true;
        }
    }
}
