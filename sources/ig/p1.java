package ig;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.qu0;
public final class p1 {
    public c1 f8392a;
    public w0 f8393b;
    public Paint f8394c;
    public Paint d;
    public Paint e;
    public Paint f8395f;
    public Paint f8396g;
    public f1 h;
    public float f8397i;
    public float f8398j;
    public o1 f8399k;
    public l1 f8400l;
    public ArrayList f8401m;
    public ArrayList f8402n;
    public Matrix f8403o;
    public float[] f8404p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, qu0 qu0Var, o1 o1Var) {
        Paint paint;
        Paint paint2;
        float width = (o1Var.d / qu0Var.f29808a) * canvas.getWidth();
        float height = (o1Var.e / qu0Var.f29809b) * canvas.getHeight();
        float L = org.telegram.messenger.i0.L(5.0f);
        boolean z10 = o1Var.f8382a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f8395f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (o1Var.d / qu0Var.f29808a) * canvas.getWidth();
        float height2 = (o1Var.e / qu0Var.f29809b) * canvas.getHeight();
        float L2 = org.telegram.messenger.i0.L(5.0f);
        if (z10) {
            paint2 = this.e;
        } else {
            paint2 = this.f8396g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.f8404p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        int i10;
        float[] fArr = this.f8404p;
        f1 f1Var = this.h;
        if (f1Var != null) {
            float f7 = f1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - f1Var.f8301b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - f1Var.f8302c;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                double d = f7 * i10;
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                f1 f1Var2 = this.h;
                fArr[0] = cos + f1Var2.f8301b;
                fArr[1] = ((float) i0.a.c(d, fArr[1], sin)) + f1Var2.f8302c;
            }
        }
    }

    public final void e() {
        f1 f1Var;
        c1 c1Var = this.f8392a;
        if (c1Var != null && c1Var.getPainting() != null && (f1Var = this.h) != null) {
            f1Var.f8303f = c1Var.getCurrentWeight();
            q0 painting = c1Var.getPainting();
            f1 f1Var2 = this.h;
            int currentColor = c1Var.getCurrentColor();
            if (f1Var2 != null) {
                if (painting.f8425r != null) {
                    painting.f8414f.f(new ag.o0(painting, f1Var2, currentColor, 6));
                }
            } else {
                painting.getClass();
            }
            this.f8401m.clear();
            this.f8402n.clear();
            this.h = null;
            b1 b1Var = c1Var.f8283a;
            if (b1Var != null) {
                b1Var.j();
            }
            c1Var.e.f8268z = true;
        }
    }
}
