package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class dda {
    public pa9 a;
    public ja9 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public uca h;
    public float i;
    public float j;
    public cda k;
    public zca l;
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

    public final void b(Canvas canvas, qma qmaVar, cda cdaVar) {
        Paint paint;
        Paint paint2;
        float width = (cdaVar.d / qmaVar.a) * canvas.getWidth();
        float height = (cdaVar.e / qmaVar.b) * canvas.getHeight();
        float L = hl.L(5.0f);
        boolean z = cdaVar.a;
        if (z) {
            paint = this.d;
        } else {
            paint = this.f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (cdaVar.d / qmaVar.a) * canvas.getWidth();
        float height2 = (cdaVar.e / qmaVar.b) * canvas.getHeight();
        float L2 = hl.L(5.0f);
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
        uca ucaVar = this.h;
        if (ucaVar != null) {
            float f = ucaVar.h;
            if (f != 0.0f) {
                float f2 = fArr[0] - ucaVar.b;
                fArr[0] = f2;
                fArr[1] = fArr[1] - ucaVar.c;
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                }
                double d = f * i;
                float cos = (float) ((Math.cos(d) * f2) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                uca ucaVar2 = this.h;
                fArr[0] = cos + ucaVar2.b;
                fArr[1] = ((float) ik8.d(d, fArr[1], sin)) + ucaVar2.c;
            }
        }
    }

    public final void e() {
        uca ucaVar;
        pa9 pa9Var = this.a;
        if (pa9Var != null && pa9Var.getPainting() != null && (ucaVar = this.h) != null) {
            ucaVar.f = pa9Var.getCurrentWeight();
            nx7 painting = pa9Var.getPainting();
            uca ucaVar2 = this.h;
            int currentColor = pa9Var.getCurrentColor();
            if (ucaVar2 != null) {
                if (painting.r != null) {
                    painting.f.f(new l65(painting, ucaVar2, currentColor, (byte) 21));
                }
            } else {
                painting.getClass();
            }
            this.m.clear();
            this.n.clear();
            this.h = null;
            oa9 oa9Var = pa9Var.a;
            if (oa9Var != null) {
                oa9Var.v();
            }
            pa9Var.e.z = true;
        }
    }
}
