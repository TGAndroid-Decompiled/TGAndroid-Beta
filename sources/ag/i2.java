package ag;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bv0;
public final class i2 {
    public t1 f537a;
    public l1 f538b;
    public Paint f539c;
    public Paint d;
    public Paint f540e;
    public Paint f541f;
    public Paint f542g;
    public w1 h;
    public float f543i;
    public float f544j;
    public h2 f545k;
    public e2 f546l;
    public ArrayList f547m;
    public ArrayList f548n;
    public Matrix f549o;
    public float[] f550p;

    public static float a(float f9, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f9 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f9;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, bv0 bv0Var, h2 h2Var) {
        Paint paint;
        Paint paint2;
        float width = (h2Var.d / bv0Var.f27238a) * canvas.getWidth();
        float height = (h2Var.f528e / bv0Var.f27239b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = h2Var.f525a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f541f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (h2Var.d / bv0Var.f27238a) * canvas.getWidth();
        float height2 = (h2Var.f528e / bv0Var.f27239b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.f540e;
        } else {
            paint2 = this.f542g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f9, float f10, boolean z10) {
        float[] fArr = this.f550p;
        fArr[0] = f9;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f550p;
        w1 w1Var = this.h;
        if (w1Var != null) {
            float f9 = w1Var.h;
            if (f9 != 0.0f) {
                float f10 = fArr[0] - w1Var.f695b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - w1Var.f696c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f9 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                w1 w1Var2 = this.h;
                fArr[0] = cos + w1Var2.f695b;
                fArr[1] = ((float) j7.l1.b(d, fArr[1], sin)) + w1Var2.f696c;
            }
        }
    }

    public final void e() {
        w1 w1Var;
        t1 t1Var = this.f537a;
        if (t1Var != null && t1Var.getPainting() != null && (w1Var = this.h) != null) {
            w1Var.f698f = t1Var.getCurrentWeight();
            f1 painting = t1Var.getPainting();
            w1 w1Var2 = this.h;
            int currentColor = t1Var.getCurrentColor();
            if (w1Var2 != null) {
                if (painting.f484r != null) {
                    painting.f473f.f(new v0(painting, w1Var2, currentColor, 0));
                }
            } else {
                painting.getClass();
            }
            this.f547m.clear();
            this.f548n.clear();
            this.h = null;
            s1 s1Var = t1Var.f658a;
            if (s1Var != null) {
                s1Var.c();
            }
            t1Var.f661e.f614z = true;
        }
    }
}
