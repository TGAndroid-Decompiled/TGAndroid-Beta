package bi;

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
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.w70;
public final class c1 {
    public static float f3681i;
    public static float f3682j;
    public int f3683a;
    public Object f3684b;
    public Object f3685c;
    public Object d;
    public Object f3686e;
    public Object f3687f;
    public Object f3688g;
    public Object h;

    public c1(q1 q1Var) {
        this.f3687f = new Path();
        this.f3685c = new Rect();
        this.f3688g = new RectF();
        this.f3684b = q1Var;
        this.d = new gc(q1Var, 0.8f, 1.4f);
    }

    public void a(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        Path path;
        Path path2 = (Path) this.f3687f;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.d;
        Matrix matrix = (Matrix) this.f3686e;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.f3685c;
        Paint paint2 = (Paint) this.f3684b;
        RectF rectF3 = (RectF) this.f3688g;
        if (f11 > 0.004f && !u.a(f10, f11, i3, canvas, rectF)) {
            int i12 = this.f3683a;
            float[][] fArr = d1.f3697a;
            int i13 = 4;
            int i14 = 1;
            if (i12 != 1) {
                this.f3683a = 1;
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
            float[] fArr5 = fArr[i3];
            float f16 = f3681i;
            float f17 = f3682j;
            float N = org.telegram.messenger.g0.N(fArr5[8]);
            rectF3.set(rectF);
            rectF3.inset(N, N);
            float max = Math.max(0.0f, f10 - N);
            matrix.setRotate(f16);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float N2 = org.telegram.messenger.g0.N(fArr5[i23]);
            if (N2 > 0.05f) {
                sweepGradientArr4[i3].setLocalMatrix(matrix);
                paint.setShader(sweepGradientArr4[i3]);
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
                    v.b(canvas, path);
                    if (i10 != 0) {
                        int round = Math.round(Math.min(1.0f, f13) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f11 * 255.0f));
                        v.i(i22, paint2);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f13 * 255.0f * f11));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i11 = i24;
                    if (i10 != 0) {
                        v.i(i11, paint2);
                    }
                    canvas.restore();
                }
                i25++;
                path4 = path;
                i24 = i11;
            }
        }
    }

    public void b(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.f3685c;
        canvas.save();
        Path path = (Path) this.f3687f;
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f3686e;
        if (yVar != null) {
            yVar.setBounds(rect);
            ((org.telegram.ui.Cells.y) this.f3686e).draw(canvas);
        }
        if (z10) {
            w70 w70Var = (w70) this.h;
            if (w70Var == null) {
                w70 w70Var2 = new w70();
                this.h = w70Var2;
                w70Var2.D = true;
            } else if (w70Var.c() || ((w70) this.h).d()) {
                w70 w70Var3 = (w70) this.h;
                w70Var3.f39925b = -1L;
                w70Var3.f39926c = -1L;
            }
        } else {
            w70 w70Var4 = (w70) this.h;
            if (w70Var4 != null && !w70Var4.d() && !((w70) this.h).c()) {
                ((w70) this.h).a();
            }
        }
        canvas.restore();
        w70 w70Var5 = (w70) this.h;
        if (w70Var5 != null && !w70Var5.c()) {
            w70 w70Var6 = (w70) this.h;
            w70Var6.f39945y = path;
            w70Var6.g(k6.r1(0.7f, this.f3683a), k6.r1(1.3f, this.f3683a), k6.r1(1.5f, this.f3683a), k6.r1(2.0f, this.f3683a));
            ((w70) this.h).setBounds(rect);
            canvas.save();
            ((w70) this.h).draw(canvas);
            canvas.restore();
            ((q1) this.f3684b).invalidate();
        }
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z10) {
        float A;
        float f10;
        float L;
        RectF rectF = (RectF) this.f3688g;
        int textSize = (((int) k6.X2.getTextSize()) * 2) + org.telegram.messenger.g0.L(4.0f);
        float max = Math.max(0, Math.min(6, az.Y0) - 1);
        float min = Math.min(9, az.Y0);
        float min2 = Math.min(3, az.Y0);
        float f11 = -org.telegram.messenger.g0.L(a1.g.A(min, 9.0f, 2.66f, 4.0f));
        float f12 = -org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + org.telegram.messenger.g0.L(A);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + org.telegram.messenger.g0.L(A);
        Path path = (Path) this.f3687f;
        path.rewind();
        if (!z10) {
            max = az.Y0 / 2.0f;
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
                float y9 = com.google.android.recaptcha.internal.a.y(L2, f12, 0.45f, f12);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(f10 - L, f12, f10, f12 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, y9 - L4, L4 + lineWidth, y9);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f15 = lineWidth2 - (L2 - y9);
                rectF.set(f15, y9, lineWidth2, L2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f15, y9, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float y10 = com.google.android.recaptcha.internal.a.y(L2, f12, 0.55f, f12);
                float f16 = y10 - f12;
                rectF.set(f10 - f16, f12, f10, y10);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(lineWidth - f16, f12, lineWidth, y10);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, y10, lineWidth2 + L4, L4 + y10);
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
        ((Rect) this.f3685c).set((int) f11, (int) f12, (int) Math.max(lineWidth, lineWidth2), (int) L2);
    }

    public void d(int i3) {
        if (this.f3683a != i3) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f3686e;
            if (yVar == null) {
                this.f3686e = k6.h0(i3, 2, -1);
            } else {
                k6.H1(yVar, i3, true);
            }
            ((org.telegram.ui.Cells.y) this.f3686e).setCallback((q1) this.f3684b);
            this.f3683a = i3;
        }
    }

    public void e(boolean z10) {
        org.telegram.ui.Cells.y yVar;
        Rect rect = (Rect) this.f3685c;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((gc) this.d).c(z10);
        if (z10 && (yVar = (org.telegram.ui.Cells.y) this.f3686e) != null) {
            yVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.y yVar2 = (org.telegram.ui.Cells.y) this.f3686e;
        if (yVar2 != null) {
            yVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((q1) this.f3684b).invalidate();
    }

    public c1(int i3) {
        switch (i3) {
            case 3:
                Paint paint = new Paint();
                this.f3684b = paint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f3685c = new pa0(tileMode);
                this.d = new pa0(tileMode);
                this.f3686e = new pa0(Shader.TileMode.REPEAT);
                this.f3687f = new Object();
                this.f3688g = new Object();
                this.h = new float[4];
                paint.setFilterBitmap(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                return;
            default:
                this.f3684b = new Paint(1);
                Paint paint2 = new Paint(1);
                this.f3685c = paint2;
                this.d = new SweepGradient[4];
                this.f3683a = -1;
                this.f3686e = new Matrix();
                this.f3687f = new Path();
                this.f3688g = new RectF();
                this.h = new RectF();
                paint2.setStyle(Paint.Style.STROKE);
                return;
        }
    }
}
