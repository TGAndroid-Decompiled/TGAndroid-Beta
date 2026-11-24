package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class m9a {
    public c79 a;
    public w69 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public d9a h;
    public float i;
    public float j;
    public l9a k;
    public i9a l;
    public ArrayList m;
    public ArrayList n;
    public Matrix o;
    public float[] p;

    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float max = Math.max(Math.min((((f2 - f4) * f8) + ((f - f3) * f7)) / ((f8 * f8) + (f7 * f7)), 1.0f), 0.0f);
        float f9 = ((f7 * max) + f3) - f;
        float f10 = ((max * f8) + f4) - f2;
        return (float) Math.sqrt((f10 * f10) + (f9 * f9));
    }

    public final void b(Canvas canvas, via viaVar, l9a l9aVar) {
        Paint paint;
        Paint paint2;
        float width = (l9aVar.d / viaVar.a) * canvas.getWidth();
        float height = (l9aVar.e / viaVar.b) * canvas.getHeight();
        float L = gl.L(5.0f);
        boolean z = l9aVar.a;
        if (z) {
            paint = this.d;
        } else {
            paint = this.f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (l9aVar.d / viaVar.a) * canvas.getWidth();
        float height2 = (l9aVar.e / viaVar.b) * canvas.getHeight();
        float L2 = gl.L(5.0f);
        if (z) {
            paint2 = this.e;
        } else {
            paint2 = this.g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f, float f2, boolean z) {
        float[] fArr = this.p;
        fArr[0] = f;
        fArr[1] = f2;
        d(z);
    }

    public final void d(boolean z) {
        int i;
        float[] fArr = this.p;
        d9a d9aVar = this.h;
        if (d9aVar != null) {
            float f = d9aVar.h;
            if (f != 0.0f) {
                float f2 = fArr[0] - d9aVar.b;
                fArr[0] = f2;
                fArr[1] = fArr[1] - d9aVar.c;
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                }
                double d = f * i;
                float cos = (float) ((Math.cos(d) * f2) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                d9a d9aVar2 = this.h;
                fArr[0] = cos + d9aVar2.b;
                fArr[1] = ((float) ug8.d(d, fArr[1], sin)) + d9aVar2.c;
            }
        }
    }

    public final void e() {
        d9a d9aVar;
        c79 c79Var = this.a;
        if (c79Var != null && c79Var.getPainting() != null && (d9aVar = this.h) != null) {
            d9aVar.f = c79Var.getCurrentWeight();
            gu7 painting = c79Var.getPainting();
            d9a d9aVar2 = this.h;
            int currentColor = c79Var.getCurrentColor();
            if (d9aVar2 != null) {
                if (painting.r != null) {
                    painting.f.f(new j45(painting, d9aVar2, currentColor, (byte) 20));
                }
            } else {
                painting.getClass();
            }
            this.m.clear();
            this.n.clear();
            this.h = null;
            b79 b79Var = c79Var.a;
            if (b79Var != null) {
                b79Var.s();
            }
            c79Var.e.z = true;
        }
    }
}
