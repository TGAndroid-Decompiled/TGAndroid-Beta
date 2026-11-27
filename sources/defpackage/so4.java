package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Build;
import android.text.StaticLayout;
public final class so4 {
    public static float i;
    public static float j;
    public int a;
    public final Path b;
    public final RectF c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public so4() {
        this.d = new Paint(1);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new SweepGradient[4];
        this.a = -1;
        this.g = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f, float f2, int i2, Canvas canvas, RectF rectF) {
        int i3;
        float f3;
        float f4;
        float f5;
        int i4;
        int i5;
        float f6;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.f;
        Matrix matrix = (Matrix) this.g;
        Paint paint = (Paint) this.d;
        RectF rectF2 = (RectF) this.h;
        Paint paint2 = (Paint) this.e;
        if (f2 > 0.004f && !fz8.a(f, f2, i2, canvas, rectF)) {
            int i6 = this.a;
            float[][] fArr = ehd.a;
            int i7 = 4;
            int i8 = 1;
            if (i6 != 1) {
                this.a = 1;
                int i9 = 0;
                while (i9 < i7) {
                    float[] fArr2 = fArr[i9];
                    int i10 = i7;
                    int[] iArr = new int[73];
                    float[] fArr3 = new float[73];
                    int i11 = 0;
                    for (int i12 = 73; i11 < i12; i12 = 73) {
                        int i13 = i8;
                        int i14 = i11;
                        double radians = Math.toRadians(i11 * 5);
                        int[] iArr2 = iArr;
                        int i15 = i9;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        if (((float) Math.sin(radians)) < 0.0f) {
                            f6 = fArr2[11];
                        } else {
                            f6 = fArr2[12];
                        }
                        float f7 = f6 / 100.0f;
                        iArr2[i14] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f7) * pow) + f7)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i14] = i14 / 72.0f;
                        i11 = i14 + 1;
                        i8 = i13;
                        iArr = iArr2;
                        i9 = i15;
                    }
                    int i16 = i9;
                    sweepGradientArr[i16] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i9 = i16 + 1;
                    i7 = i10;
                }
            }
            int i17 = i7;
            int i18 = i8;
            int i19 = 0;
            float[] fArr4 = fArr[i2];
            float f8 = i;
            float f9 = j;
            float N = hl.N(fArr4[8]);
            RectF rectF3 = this.c;
            rectF3.set(rectF);
            rectF3.inset(N, N);
            float max = Math.max(0.0f, f - N);
            matrix.setRotate(f8);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float N2 = hl.N(fArr4[i17]);
            if (N2 > 0.05f) {
                sweepGradientArr[i2].setLocalMatrix(matrix);
                paint2.setShader(sweepGradientArr[i2]);
                paint2.setColor(-1);
                paint2.setAlpha((int) (f2 * 255.0f));
                paint2.setStrokeWidth(N2);
                rectF2.set(rectF3);
                float f10 = (-N2) / 2.0f;
                rectF2.inset(f10, f10);
                float f11 = (N2 / 2.0f) + max;
                canvas.drawRoundRect(rectF2, f11, f11, paint2);
                paint2.setShader(null);
            }
            double radians2 = Math.toRadians(f8);
            float f12 = (float) (-Math.sin(radians2));
            float cos = (float) Math.cos(radians2);
            float N3 = hl.N(fArr4[0]);
            float N4 = hl.N(fArr4[2]);
            float min = Math.min(1.0f, (f9 + 1.0f) * (fArr4[i18] / 100.0f));
            float min2 = Math.min(1.0f, (1.0f - f9) * (fArr4[3] / 100.0f));
            if (Build.VERSION.SDK_INT >= 29) {
                i3 = i18;
            } else {
                i3 = 0;
            }
            float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
            int i20 = 0;
            for (int i21 = 2; i20 < i21; i21 = 2) {
                if (i20 == 0) {
                    f3 = N3;
                    f4 = min;
                } else {
                    f3 = -N4;
                    f4 = min2;
                }
                if (f4 > 0.004f && Math.abs(f3) >= 0.1f) {
                    rectF2.set(rectF3);
                    f5 = cos;
                    rectF2.offset(f12 * f3, f3 * f5);
                    Path path = this.b;
                    path.rewind();
                    path.addRoundRect(rectF2, min3, min3, Path.Direction.CW);
                    canvas.save();
                    zz.d(canvas, path);
                    if (i3 != 0) {
                        int round = Math.round(Math.min(1.0f, f4) * 255.0f);
                        paint.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint.setAlpha((int) (f2 * 255.0f));
                        i5 = i18;
                        zz.u(i5, paint);
                    } else {
                        i5 = i18;
                        paint.setColor(-1);
                        paint.setAlpha((int) (f4 * 255.0f * f2));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint);
                    i4 = i19;
                    if (i3 != 0) {
                        zz.u(i4, paint);
                    }
                    canvas.restore();
                } else {
                    f5 = cos;
                    i4 = i19;
                    i5 = i18;
                }
                i20++;
                i19 = i4;
                i18 = i5;
                cos = f5;
            }
        }
    }

    public final void b(Canvas canvas, boolean z) {
        Rect rect = (Rect) this.e;
        canvas.save();
        Path path = this.b;
        canvas.clipPath(path);
        hf0 hf0Var = (hf0) this.g;
        if (hf0Var != null) {
            hf0Var.setBounds(rect);
            ((hf0) this.g).draw(canvas);
        }
        va6 va6Var = (va6) this.h;
        if (z) {
            if (va6Var == null) {
                va6 va6Var2 = new va6();
                this.h = va6Var2;
                va6Var2.D = true;
            } else if (va6Var.c() || ((va6) this.h).d()) {
                va6 va6Var3 = (va6) this.h;
                va6Var3.b = -1L;
                va6Var3.c = -1L;
            }
        } else if (va6Var != null && !va6Var.d() && !((va6) this.h).c()) {
            ((va6) this.h).a();
        }
        canvas.restore();
        va6 va6Var4 = (va6) this.h;
        if (va6Var4 != null && !va6Var4.c()) {
            va6 va6Var5 = (va6) this.h;
            va6Var5.y = path;
            va6Var5.g(aob.p1(0.7f, this.a), aob.p1(1.3f, this.a), aob.p1(1.5f, this.a), aob.p1(2.0f, this.a));
            ((va6) this.h).setBounds(rect);
            canvas.save();
            ((va6) this.h).draw(canvas);
            canvas.restore();
            ((wb2) this.d).invalidate();
        }
    }

    public final void c(StaticLayout[] staticLayoutArr, boolean z) {
        float B;
        float f;
        float L;
        int L2 = hl.L(4.0f) + (((int) aob.X2.getTextSize()) << 1);
        float max = Math.max(0, Math.min(6, xea.U0) - 1);
        float min = Math.min(9, xea.U0);
        float min2 = Math.min(3, xea.U0);
        float f2 = -hl.L(c00.B(min, 9.0f, 2.66f, 4.0f));
        float f3 = -hl.L(3.0f);
        float L3 = hl.L(5.0f) + L2;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + hl.L(B);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + hl.L(B);
        Path path = this.b;
        path.rewind();
        if (!z) {
            max = xea.U0 / 2.0f;
        }
        float L4 = hl.L(max) << 1;
        RectF rectF = this.c;
        rectF.set(f2, f3, f2 + L4, L4 + f3);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f4 = lineWidth - lineWidth2;
        float f5 = min2 + min;
        if (Math.abs(f4) < hl.L(f5)) {
            f = Math.max(lineWidth, lineWidth2);
        } else {
            f = lineWidth;
        }
        if (Math.abs(f4) > hl.L(f5)) {
            float L5 = hl.L(min2) << 1;
            if (lineWidth < lineWidth2) {
                float A = qd4.A(L3, f3, 0.45f, f3);
                L = hl.L(min) << 1;
                rectF.set(f - L, f3, f, f3 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, A - L5, L5 + lineWidth, A);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f6 = lineWidth2 - (L3 - A);
                rectF.set(f6, A, lineWidth2, L3);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f6, A, lineWidth2, L3);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float A2 = qd4.A(L3, f3, 0.55f, f3);
                float f7 = A2 - f3;
                rectF.set(f - f7, f3, f, A2);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = hl.L(min) << 1;
                rectF.set(lineWidth - f7, f3, lineWidth, A2);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, A2, lineWidth2 + L5, L5 + A2);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - L, L3 - L, lineWidth2, L3);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            L = hl.L(min) << 1;
            float f8 = f - L;
            rectF.set(f8, f3, f, f3 + L);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f8, L3 - L, f, L3);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f2, L3 - L, L + f2, L3);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.e).set((int) f2, (int) f3, (int) Math.max(lineWidth, lineWidth2), (int) L3);
    }

    public final void d(int i2) {
        if (this.a != i2) {
            hf0 hf0Var = (hf0) this.g;
            if (hf0Var == null) {
                this.g = aob.f0(i2, 2, -1);
            } else {
                aob.F1(hf0Var, i2, true);
            }
            ((hf0) this.g).setCallback((wb2) this.d);
            this.a = i2;
        }
    }

    public final void e(boolean z) {
        hf0 hf0Var;
        Rect rect = (Rect) this.e;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((v41) this.f).c(z);
        if (z && (hf0Var = (hf0) this.g) != null) {
            hf0Var.setHotspot(centerX, centerY);
        }
        hf0 hf0Var2 = (hf0) this.g;
        if (hf0Var2 != null) {
            hf0Var2.setState(z ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((wb2) this.d).invalidate();
    }

    public so4(wb2 wb2Var) {
        this.b = new Path();
        this.e = new Rect();
        this.c = new RectF();
        this.d = wb2Var;
        this.f = new v41(wb2Var, 0.8f, 1.4f);
    }
}
