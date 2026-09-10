package og;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import bi.g3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tv0;
public final class u1 {
    public h1 f14499a;
    public b1 f14500b;
    public Paint f14501c;
    public Paint d;
    public Paint e;
    public Paint f14502f;
    public Paint f14503g;
    public k1 h;
    public float f14504i;
    public float f14505j;
    public t1 f14506k;
    public q1 f14507l;
    public ArrayList f14508m;
    public ArrayList f14509n;
    public Matrix f14510o;
    public float[] f14511p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, tv0 tv0Var, t1 t1Var) {
        Paint paint;
        Paint paint2;
        float width = (t1Var.d / tv0Var.f27499a) * canvas.getWidth();
        float height = (t1Var.e / tv0Var.f27500b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = t1Var.f14487a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f14502f;
        }
        canvas.drawCircle(width, height, dp, paint);
        float width2 = (t1Var.d / tv0Var.f27499a) * canvas.getWidth();
        float height2 = (t1Var.e / tv0Var.f27500b) * canvas.getHeight();
        float dp2 = AndroidUtilities.dp(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f14503g;
        }
        canvas.drawCircle(width2, height2, dp2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f14511p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f14511p;
        k1 k1Var = this.h;
        if (k1Var != null) {
            float f7 = k1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - k1Var.f14406b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - k1Var.f14407c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                k1 k1Var2 = this.h;
                fArr[0] = cos + k1Var2.f14406b;
                fArr[1] = ((float) hc.b.f(d, fArr[1], sin)) + k1Var2.f14407c;
            }
        }
    }

    public final void e() {
        k1 k1Var;
        h1 h1Var = this.f14499a;
        if (h1Var != null && h1Var.getPainting() != null && (k1Var = this.h) != null) {
            k1Var.f14408f = h1Var.getCurrentWeight();
            v0 painting = h1Var.getPainting();
            k1 k1Var2 = this.h;
            int currentColor = h1Var.getCurrentColor();
            if (k1Var2 != null) {
                if (painting.f14526r != null) {
                    painting.f14515f.f(new g3(painting, k1Var2, currentColor, 15));
                }
            } else {
                painting.getClass();
            }
            this.f14508m.clear();
            this.f14509n.clear();
            this.h = null;
            g1 g1Var = h1Var.f14388a;
            if (g1Var != null) {
                g1Var.c();
            }
            h1Var.e.f14385z = true;
        }
    }
}
