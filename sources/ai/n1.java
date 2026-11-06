package ai;

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
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ua0;
public final class n1 {
    public static float f1584i;
    public static float f1585j;
    public int f1586a;
    public Object f1587b;
    public Object f1588c;
    public Object d;
    public Object f1589e;
    public Object f1590f;
    public Object f1591g;
    public Object h;

    public n1(q1 q1Var) {
        this.f1590f = new Path();
        this.f1588c = new Rect();
        this.f1591g = new RectF();
        this.f1587b = q1Var;
        this.d = new ic(q1Var, 0.8f, 1.4f);
    }

    public void a(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        Path path;
        Path path2 = (Path) this.f1590f;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.d;
        Matrix matrix = (Matrix) this.f1589e;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.f1588c;
        Paint paint2 = (Paint) this.f1587b;
        RectF rectF3 = (RectF) this.f1591g;
        if (f11 > 0.004f && !z.a(f10, f11, i7, canvas, rectF)) {
            int i12 = this.f1586a;
            float[][] fArr = o1.f1595a;
            int i13 = 4;
            int i14 = 1;
            if (i12 != 1) {
                this.f1586a = 1;
                int i15 = 0;
                while (i15 < i13) {
                    float[] fArr2 = fArr[i15];
                    int i16 = i13;
                    int[] iArr = new int[73];
                    int i17 = i14;
                    float[] fArr3 = new float[73];
                    int i18 = 0;
                    for (int i19 = 73; i18 < i19; i19 = 73) {
                        int i20 = i15;
                        float[][] fArr4 = fArr;
                        double radians = Math.toRadians(i18 * 5);
                        Path path3 = path2;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        if (((float) Math.sin(radians)) < 0.0f) {
                            f12 = fArr2[11];
                        } else {
                            f12 = fArr2[12];
                        }
                        float f15 = f12 / 100.0f;
                        iArr[i18] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f15) * pow) + f15)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i18] = i18 / 72.0f;
                        i18++;
                        fArr = fArr4;
                        i15 = i20;
                        path2 = path3;
                        sweepGradientArr = sweepGradientArr2;
                    }
                    SweepGradient[] sweepGradientArr3 = sweepGradientArr;
                    int i21 = i15;
                    sweepGradientArr3[i21] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i15 = i21 + 1;
                    i13 = i16;
                    i14 = i17;
                    path2 = path2;
                    sweepGradientArr = sweepGradientArr3;
                }
            }
            Path path4 = path2;
            SweepGradient[] sweepGradientArr4 = sweepGradientArr;
            int i22 = i14;
            int i23 = i13;
            int i24 = 0;
            float[] fArr5 = fArr[i7];
            float f16 = f1584i;
            float f17 = f1585j;
            float N = org.telegram.messenger.g0.N(fArr5[8]);
            rectF3.set(rectF);
            rectF3.inset(N, N);
            float max = Math.max(0.0f, f10 - N);
            matrix.setRotate(f16);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float N2 = org.telegram.messenger.g0.N(fArr5[i23]);
            if (N2 > 0.05f) {
                sweepGradientArr4[i7].setLocalMatrix(matrix);
                paint.setShader(sweepGradientArr4[i7]);
                paint.setColor(-1);
                paint.setAlpha((int) (f11 * 255.0f));
                paint.setStrokeWidth(N2);
                rectF2.set(rectF3);
                float f18 = (-N2) / 2.0f;
                rectF2.inset(f18, f18);
                float f19 = (N2 / 2.0f) + max;
                canvas.drawRoundRect(rectF2, f19, f19, paint);
                paint.setShader(null);
            }
            double radians2 = Math.toRadians(f16);
            float f20 = (float) (-Math.sin(radians2));
            float cos = (float) Math.cos(radians2);
            float N3 = org.telegram.messenger.g0.N(fArr5[0]);
            float N4 = org.telegram.messenger.g0.N(fArr5[2]);
            float min = Math.min(1.0f, (f17 + 1.0f) * (fArr5[i22] / 100.0f));
            float min2 = Math.min(1.0f, (1.0f - f17) * (fArr5[3] / 100.0f));
            if (Build.VERSION.SDK_INT >= 29) {
                i10 = i22;
            } else {
                i10 = 0;
            }
            float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
            int i25 = 0;
            for (int i26 = 2; i25 < i26; i26 = 2) {
                if (i25 == 0) {
                    f13 = min;
                } else {
                    f13 = min2;
                }
                if (i25 == 0) {
                    f14 = N3;
                } else {
                    f14 = -N4;
                }
                if (f13 <= 0.004f || Math.abs(f14) < 0.1f) {
                    i11 = i24;
                    path = path4;
                } else {
                    rectF2.set(rectF3);
                    rectF2.offset(f20 * f14, f14 * cos);
                    path4.rewind();
                    path = path4;
                    path.addRoundRect(rectF2, min3, min3, Path.Direction.CW);
                    canvas.save();
                    a0.b(canvas, path);
                    if (i10 != 0) {
                        int round = Math.round(Math.min(1.0f, f13) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f11 * 255.0f));
                        a0.i(i22, paint2);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f13 * 255.0f * f11));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i11 = i24;
                    if (i10 != 0) {
                        a0.i(i11, paint2);
                    }
                    canvas.restore();
                }
                i25++;
                path4 = path;
                i24 = i11;
            }
        }
    }

    public void b(Canvas canvas, boolean z9) {
        Rect rect = (Rect) this.f1588c;
        canvas.save();
        Path path = (Path) this.f1590f;
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f1589e;
        if (yVar != null) {
            yVar.setBounds(rect);
            ((org.telegram.ui.Cells.y) this.f1589e).draw(canvas);
        }
        if (z9) {
            a80 a80Var = (a80) this.h;
            if (a80Var == null) {
                a80 a80Var2 = new a80();
                this.h = a80Var2;
                a80Var2.D = true;
            } else if (a80Var.c() || ((a80) this.h).d()) {
                a80 a80Var3 = (a80) this.h;
                a80Var3.f31715b = -1L;
                a80Var3.f31716c = -1L;
            }
        } else {
            a80 a80Var4 = (a80) this.h;
            if (a80Var4 != null && !a80Var4.d() && !((a80) this.h).c()) {
                ((a80) this.h).a();
            }
        }
        canvas.restore();
        a80 a80Var5 = (a80) this.h;
        if (a80Var5 != null && !a80Var5.c()) {
            a80 a80Var6 = (a80) this.h;
            a80Var6.f31735y = path;
            a80Var6.g(k6.r1(0.7f, this.f1586a), k6.r1(1.3f, this.f1586a), k6.r1(1.5f, this.f1586a), k6.r1(2.0f, this.f1586a));
            ((a80) this.h).setBounds(rect);
            canvas.save();
            ((a80) this.h).draw(canvas);
            canvas.restore();
            ((q1) this.f1587b).invalidate();
        }
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z9) {
        float c10;
        float f10;
        float L;
        RectF rectF = (RectF) this.f1591g;
        int textSize = (((int) k6.X2.getTextSize()) * 2) + org.telegram.messenger.g0.L(4.0f);
        float max = Math.max(0, Math.min(6, iz.Y0) - 1);
        float min = Math.min(9, iz.Y0);
        float min2 = Math.min(3, iz.Y0);
        float f11 = -org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.c(min, 9.0f, 2.66f, 4.0f));
        float f12 = -org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + org.telegram.messenger.g0.L(c10);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + org.telegram.messenger.g0.L(c10);
        Path path = (Path) this.f1590f;
        path.rewind();
        if (!z9) {
            max = iz.Y0 / 2.0f;
        }
        float L3 = org.telegram.messenger.g0.L(max) * 2;
        rectF.set(f11, f12, f11 + L3, L3 + f12);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f13 = lineWidth - lineWidth2;
        float f14 = min2 + min;
        if (Math.abs(f13) < org.telegram.messenger.g0.L(f14)) {
            f10 = Math.max(lineWidth, lineWidth2);
        } else {
            f10 = lineWidth;
        }
        if (Math.abs(f13) > org.telegram.messenger.g0.L(f14)) {
            float L4 = org.telegram.messenger.g0.L(min2) * 2;
            if (lineWidth < lineWidth2) {
                float z10 = com.google.android.recaptcha.internal.a.z(L2, f12, 0.45f, f12);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(f10 - L, f12, f10, f12 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z10 - L4, L4 + lineWidth, z10);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f15 = lineWidth2 - (L2 - z10);
                rectF.set(f15, z10, lineWidth2, L2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f15, z10, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z11 = com.google.android.recaptcha.internal.a.z(L2, f12, 0.55f, f12);
                float f16 = z11 - f12;
                rectF.set(f10 - f16, f12, f10, z11);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(lineWidth - f16, f12, lineWidth, z11);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z11, lineWidth2 + L4, L4 + z11);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - L, L2 - L, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            L = org.telegram.messenger.g0.L(min) * 2;
            float f17 = f10 - L;
            rectF.set(f17, f12, f10, f12 + L);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f17, L2 - L, f10, L2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f11, L2 - L, L + f11, L2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.f1588c).set((int) f11, (int) f12, (int) Math.max(lineWidth, lineWidth2), (int) L2);
    }

    public void d(int i7) {
        if (this.f1586a != i7) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f1589e;
            if (yVar == null) {
                this.f1589e = k6.h0(i7, 2, -1);
            } else {
                k6.H1(yVar, i7, true);
            }
            ((org.telegram.ui.Cells.y) this.f1589e).setCallback((q1) this.f1587b);
            this.f1586a = i7;
        }
    }

    public void e(boolean z9) {
        org.telegram.ui.Cells.y yVar;
        Rect rect = (Rect) this.f1588c;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((ic) this.d).c(z9);
        if (z9 && (yVar = (org.telegram.ui.Cells.y) this.f1589e) != null) {
            yVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.y yVar2 = (org.telegram.ui.Cells.y) this.f1589e;
        if (yVar2 != null) {
            yVar2.setState(z9 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((q1) this.f1587b).invalidate();
    }

    public n1(int i7) {
        switch (i7) {
            case 3:
                Paint paint = new Paint();
                this.f1587b = paint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f1588c = new ua0(tileMode);
                this.d = new ua0(tileMode);
                this.f1589e = new ua0(Shader.TileMode.REPEAT);
                this.f1590f = new Object();
                this.f1591g = new Object();
                this.h = new float[4];
                paint.setFilterBitmap(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                return;
            default:
                this.f1587b = new Paint(1);
                Paint paint2 = new Paint(1);
                this.f1588c = paint2;
                this.d = new SweepGradient[4];
                this.f1586a = -1;
                this.f1589e = new Matrix();
                this.f1590f = new Path();
                this.f1591g = new RectF();
                this.h = new RectF();
                paint2.setStyle(Paint.Style.STROKE);
                return;
        }
    }
}
