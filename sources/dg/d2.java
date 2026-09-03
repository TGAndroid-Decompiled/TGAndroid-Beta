package dg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
public final class d2 {
    public o1 f4487a;
    public i1 f4488b;
    public Paint f4489c;
    public Paint d;
    public Paint f4490e;
    public Paint f4491f;
    public Paint f4492g;
    public r1 h;
    public float f4493i;
    public float f4494j;
    public c2 f4495k;
    public z1 f4496l;
    public ArrayList f4497m;
    public ArrayList f4498n;
    public Matrix f4499o;
    public float[] f4500p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, jv0 jv0Var, c2 c2Var) {
        Paint paint;
        Paint paint2;
        float width = (c2Var.d / jv0Var.f28201a) * canvas.getWidth();
        float height = (c2Var.f4477e / jv0Var.f28202b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z4 = c2Var.f4474a;
        if (z4) {
            paint = this.d;
        } else {
            paint = this.f4491f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (c2Var.d / jv0Var.f28201a) * canvas.getWidth();
        float height2 = (c2Var.f4477e / jv0Var.f28202b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z4) {
            paint2 = this.f4490e;
        } else {
            paint2 = this.f4492g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f10, float f11, boolean z4) {
        float[] fArr = this.f4500p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z4);
    }

    public final void d(boolean z4) {
        int i10;
        float[] fArr = this.f4500p;
        r1 r1Var = this.h;
        if (r1Var != null) {
            float f10 = r1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - r1Var.f4652b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - r1Var.f4653c;
                if (z4) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f10 * i10;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                r1 r1Var2 = this.h;
                fArr[0] = cos + r1Var2.f4652b;
                fArr[1] = ((float) l.d.a(d, fArr[1], sin)) + r1Var2.f4653c;
            }
        }
    }

    public final void e() {
        r1 r1Var;
        o1 o1Var = this.f4487a;
        if (o1Var != null && o1Var.getPainting() != null && (r1Var = this.h) != null) {
            r1Var.f4655f = o1Var.getCurrentWeight();
            c1 painting = o1Var.getPainting();
            r1 r1Var2 = this.h;
            int currentColor = o1Var.getCurrentColor();
            if (r1Var2 != null) {
                if (painting.f4466r != null) {
                    painting.f4455f.f(new bh.a(painting, r1Var2, currentColor, 1));
                }
            } else {
                painting.getClass();
            }
            this.f4497m.clear();
            this.f4498n.clear();
            this.h = null;
            n1 n1Var = o1Var.f4624a;
            if (n1Var != null) {
                n1Var.c();
            }
            o1Var.f4627e.f4604z = true;
        }
    }
}
