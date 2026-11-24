package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public final class gh2 {
    public float g;
    public float j;
    public final Path a = new Path();
    public final float[] b = new float[4];
    public final float[] c = new float[4];
    public final Matrix d = new Matrix();
    public final Random h = new Random();
    public final byte f = 6;
    public final float e = (float) (Math.tan(0.2617993877991494d) * 1.3333333333333333d);
    public final float[] i = new float[6];

    public gh2() {
        for (int i = 0; i < this.f; i++) {
            this.i[i] = (this.h.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f, float f2, Canvas canvas, Paint paint) {
        float f3;
        int i;
        float f4;
        gh2 gh2Var = this;
        float f5 = gh2Var.g;
        float f6 = (f5 - 0.0f) - 0.0f;
        float f7 = f5 + 0.0f + 0.0f;
        float max = Math.max(f6, f7);
        float f8 = gh2Var.e;
        float f9 = max * f8 * 1.0f;
        Path path = gh2Var.a;
        path.reset();
        byte b = 0;
        while (true) {
            byte b2 = gh2Var.f;
            if (b < b2) {
                Matrix matrix = gh2Var.d;
                matrix.reset();
                float f10 = 360.0f / b2;
                matrix.setRotate(b * f10, f, f2);
                if (b % 2 == 0) {
                    f3 = f6;
                } else {
                    f3 = f7;
                }
                float f11 = gh2Var.j;
                float[] fArr = gh2Var.i;
                float f12 = (fArr[b] * f11) + f3;
                float[] fArr2 = gh2Var.b;
                fArr2[0] = f;
                float f13 = f2 - f12;
                fArr2[1] = f13;
                float f14 = f7;
                fArr2[2] = b00.w(f11, fArr[b], f8, f + f9);
                fArr2[3] = f13;
                matrix.mapPoints(fArr2);
                int i2 = b + 1;
                if (i2 >= b2) {
                    i = 0;
                } else {
                    i = i2;
                }
                if (i % 2 == 0) {
                    f4 = f6;
                } else {
                    f4 = f14;
                }
                float f15 = gh2Var.j;
                float[] fArr3 = gh2Var.c;
                fArr3[0] = f;
                float f16 = f2 - ((fArr[i] * f15) + f4);
                fArr3[1] = f16;
                float f17 = f6;
                fArr3[2] = b00.w(f15, fArr[i], f8, f - f9);
                fArr3[3] = f16;
                matrix.reset();
                matrix.setRotate(f10 * i, f, f2);
                matrix.mapPoints(fArr3);
                if (b == 0) {
                    path.moveTo(fArr2[0], fArr2[1]);
                }
                path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
                b = i2;
                f7 = f14;
                f6 = f17;
                gh2Var = this;
            } else {
                canvas.save();
                canvas.rotate(0.0f, f, f2);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }
}
