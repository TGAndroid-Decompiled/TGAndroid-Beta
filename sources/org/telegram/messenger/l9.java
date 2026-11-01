package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.text.StaticLayout;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.t80;
public final class l9 {
    public static float f16914i;
    public static float f16915j;
    public int f16916a;
    public Object f16917b;
    public Object f16918c;
    public Object d;
    public Object e;
    public Object f16919f;
    public Object f16920g;
    public Object h;

    public l9(org.telegram.ui.Cells.q1 q1Var) {
        this.f16918c = new Path();
        this.d = new Rect();
        this.f16919f = new RectF();
        this.f16917b = q1Var;
        this.e = new org.telegram.ui.Components.dc(q1Var, 0.8f, 1.4f);
    }

    public void a(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        Path path;
        Path path2 = (Path) this.f16919f;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.d;
        Matrix matrix = (Matrix) this.e;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.f16918c;
        Paint paint2 = (Paint) this.f16917b;
        RectF rectF3 = (RectF) this.f16920g;
        if (f10 > 0.004f && !qh.t.a(f7, f10, i10, canvas, rectF)) {
            int i13 = this.f16916a;
            float[][] fArr = qh.y0.f46102a;
            int i14 = 4;
            int i15 = 1;
            if (i13 != 1) {
                this.f16916a = 1;
                int i16 = 0;
                while (i16 < i14) {
                    float[] fArr2 = fArr[i16];
                    int i17 = i14;
                    int[] iArr = new int[73];
                    int i18 = i15;
                    float[] fArr3 = new float[73];
                    int i19 = 0;
                    for (int i20 = 73; i19 < i20; i20 = 73) {
                        int i21 = i16;
                        float[][] fArr4 = fArr;
                        double radians = Math.toRadians(i19 * 5);
                        Path path3 = path2;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        if (((float) Math.sin(radians)) < 0.0f) {
                            f11 = fArr2[11];
                        } else {
                            f11 = fArr2[12];
                        }
                        float f14 = f11 / 100.0f;
                        iArr[i19] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f14) * pow) + f14)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i19] = i19 / 72.0f;
                        i19++;
                        fArr = fArr4;
                        i16 = i21;
                        path2 = path3;
                        sweepGradientArr = sweepGradientArr2;
                    }
                    SweepGradient[] sweepGradientArr3 = sweepGradientArr;
                    int i22 = i16;
                    sweepGradientArr3[i22] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i16 = i22 + 1;
                    i14 = i17;
                    i15 = i18;
                    path2 = path2;
                    sweepGradientArr = sweepGradientArr3;
                }
            }
            Path path4 = path2;
            SweepGradient[] sweepGradientArr4 = sweepGradientArr;
            int i23 = i15;
            int i24 = i14;
            int i25 = 0;
            float[] fArr5 = fArr[i10];
            float f15 = f16914i;
            float f16 = f16915j;
            float N = i0.N(fArr5[8]);
            rectF3.set(rectF);
            rectF3.inset(N, N);
            float max = Math.max(0.0f, f7 - N);
            matrix.setRotate(f15);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float N2 = i0.N(fArr5[i24]);
            if (N2 > 0.05f) {
                sweepGradientArr4[i10].setLocalMatrix(matrix);
                paint.setShader(sweepGradientArr4[i10]);
                paint.setColor(-1);
                paint.setAlpha((int) (f10 * 255.0f));
                paint.setStrokeWidth(N2);
                rectF2.set(rectF3);
                float f17 = (-N2) / 2.0f;
                rectF2.inset(f17, f17);
                float f18 = (N2 / 2.0f) + max;
                canvas.drawRoundRect(rectF2, f18, f18, paint);
                paint.setShader(null);
            }
            double radians2 = Math.toRadians(f15);
            float f19 = (float) (-Math.sin(radians2));
            float cos = (float) Math.cos(radians2);
            float N3 = i0.N(fArr5[0]);
            float N4 = i0.N(fArr5[2]);
            float min = Math.min(1.0f, (f16 + 1.0f) * (fArr5[i23] / 100.0f));
            float min2 = Math.min(1.0f, (1.0f - f16) * (fArr5[3] / 100.0f));
            if (Build.VERSION.SDK_INT >= 29) {
                i11 = i23;
            } else {
                i11 = 0;
            }
            float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
            int i26 = 0;
            for (int i27 = 2; i26 < i27; i27 = 2) {
                if (i26 == 0) {
                    f12 = min;
                } else {
                    f12 = min2;
                }
                if (i26 == 0) {
                    f13 = N3;
                } else {
                    f13 = -N4;
                }
                if (f12 <= 0.004f || Math.abs(f13) < 0.1f) {
                    i12 = i25;
                    path = path4;
                } else {
                    rectF2.set(rectF3);
                    rectF2.offset(f19 * f13, f13 * cos);
                    path4.rewind();
                    path = path4;
                    path.addRoundRect(rectF2, min3, min3, Path.Direction.CW);
                    canvas.save();
                    qh.u.b(canvas, path);
                    if (i11 != 0) {
                        int round = Math.round(Math.min(1.0f, f12) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f10 * 255.0f));
                        qh.u.i(i23, paint2);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f12 * 255.0f * f10));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i12 = i25;
                    if (i11 != 0) {
                        qh.u.i(i12, paint2);
                    }
                    canvas.restore();
                }
                i26++;
                path4 = path;
                i25 = i12;
            }
        }
    }

    public void b(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f16918c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f16920g;
        if (yVar != null) {
            yVar.setBounds(rect);
            ((org.telegram.ui.Cells.y) this.f16920g).draw(canvas);
        }
        if (z10) {
            t80 t80Var = (t80) this.h;
            if (t80Var == null) {
                t80 t80Var2 = new t80();
                this.h = t80Var2;
                t80Var2.D = true;
            } else if (t80Var.c() || ((t80) this.h).d()) {
                t80 t80Var3 = (t80) this.h;
                t80Var3.f30574b = -1L;
                t80Var3.f30575c = -1L;
            }
        } else {
            t80 t80Var4 = (t80) this.h;
            if (t80Var4 != null && !t80Var4.d() && !((t80) this.h).c()) {
                ((t80) this.h).a();
            }
        }
        canvas.restore();
        t80 t80Var5 = (t80) this.h;
        if (t80Var5 != null && !t80Var5.c()) {
            t80 t80Var6 = (t80) this.h;
            t80Var6.f30593y = path;
            t80Var6.g(org.telegram.ui.ActionBar.t6.r1(0.7f, this.f16916a), org.telegram.ui.ActionBar.t6.r1(1.3f, this.f16916a), org.telegram.ui.ActionBar.t6.r1(1.5f, this.f16916a), org.telegram.ui.ActionBar.t6.r1(2.0f, this.f16916a));
            ((t80) this.h).setBounds(rect);
            canvas.save();
            ((t80) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.q1) this.f16917b).invalidate();
        }
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z10) {
        float c10;
        float f7;
        float L;
        RectF rectF = (RectF) this.f16919f;
        int textSize = (((int) org.telegram.ui.ActionBar.t6.X2.getTextSize()) * 2) + i0.L(4.0f);
        float max = Math.max(0, Math.min(6, uz.Y0) - 1);
        float min = Math.min(9, uz.Y0);
        float min2 = Math.min(3, uz.Y0);
        float f10 = -i0.L(a1.g.c(min, 9.0f, 2.66f, 4.0f));
        float f11 = -i0.L(3.0f);
        float L2 = i0.L(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + i0.L(c10);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + i0.L(c10);
        Path path = (Path) this.f16918c;
        path.rewind();
        if (!z10) {
            max = uz.Y0 / 2.0f;
        }
        float L3 = i0.L(max) * 2;
        rectF.set(f10, f11, f10 + L3, L3 + f11);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f12 = lineWidth - lineWidth2;
        float f13 = min2 + min;
        if (Math.abs(f12) < i0.L(f13)) {
            f7 = Math.max(lineWidth, lineWidth2);
        } else {
            f7 = lineWidth;
        }
        if (Math.abs(f12) > i0.L(f13)) {
            float L4 = i0.L(min2) * 2;
            if (lineWidth < lineWidth2) {
                float z11 = c3.i0.z(L2, f11, 0.45f, f11);
                L = i0.L(min) * 2;
                rectF.set(f7 - L, f11, f7, f11 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - L4, L4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f14 = lineWidth2 - (L2 - z11);
                rectF.set(f14, z11, lineWidth2, L2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f14, z11, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = c3.i0.z(L2, f11, 0.55f, f11);
                float f15 = z12 - f11;
                rectF.set(f7 - f15, f11, f7, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = i0.L(min) * 2;
                rectF.set(lineWidth - f15, f11, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + L4, L4 + z12);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - L, L2 - L, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            L = i0.L(min) * 2;
            float f16 = f7 - L;
            rectF.set(f16, f11, f7, f11 + L);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f16, L2 - L, f7, L2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f10, L2 - L, L + f10, L2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f10, (int) f11, (int) Math.max(lineWidth, lineWidth2), (int) L2);
    }

    public void d(int i10) {
        if (this.f16916a != i10) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f16920g;
            if (yVar == null) {
                this.f16920g = org.telegram.ui.ActionBar.t6.h0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.t6.H1(yVar, i10, true);
            }
            ((org.telegram.ui.Cells.y) this.f16920g).setCallback((org.telegram.ui.Cells.q1) this.f16917b);
            this.f16916a = i10;
        }
    }

    public void e(boolean z10) {
        org.telegram.ui.Cells.y yVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((org.telegram.ui.Components.dc) this.e).c(z10);
        if (z10 && (yVar = (org.telegram.ui.Cells.y) this.f16920g) != null) {
            yVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.y yVar2 = (org.telegram.ui.Cells.y) this.f16920g;
        if (yVar2 != null) {
            yVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.q1) this.f16917b).invalidate();
    }

    public l9(int i10) {
        switch (i10) {
            case 3:
                this.f16917b = new Paint(1);
                Paint paint = new Paint(1);
                this.f16918c = paint;
                this.d = new SweepGradient[4];
                this.f16916a = -1;
                this.e = new Matrix();
                this.f16919f = new Path();
                this.f16920g = new RectF();
                this.h = new RectF();
                paint.setStyle(Paint.Style.STROKE);
                return;
            default:
                Paint paint2 = new Paint();
                this.f16918c = paint2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.d = new mb0(tileMode);
                this.e = new mb0(tileMode);
                this.f16919f = new mb0(Shader.TileMode.REPEAT);
                this.f16920g = new Object();
                this.h = new Object();
                this.f16917b = new float[4];
                paint2.setFilterBitmap(true);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                return;
        }
    }
}
