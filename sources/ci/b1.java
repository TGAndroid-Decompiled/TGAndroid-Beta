package ci;

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
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.cz;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q80;
public final class b1 {
    public static float f5615i;
    public static float f5616j;
    public int f5617a;
    public Object f5618b;
    public Object f5619c;
    public Object d;
    public Object f5620e;
    public Object f5621f;
    public Object f5622g;
    public Object h;

    public b1(r1 r1Var) {
        this.f5621f = new Path();
        this.f5619c = new Rect();
        this.f5622g = new RectF();
        this.f5618b = r1Var;
        this.d = new mc(r1Var, 0.8f, 1.4f);
    }

    public void a(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        Path path;
        Path path2 = (Path) this.f5621f;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.d;
        Matrix matrix = (Matrix) this.f5620e;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.f5619c;
        Paint paint2 = (Paint) this.f5618b;
        RectF rectF3 = (RectF) this.f5622g;
        if (f11 > 0.004f && !u.a(f10, f11, i7, canvas, rectF)) {
            int i12 = this.f5617a;
            float[][] fArr = c1.f5643a;
            int i13 = 4;
            int i14 = 1;
            if (i12 != 1) {
                this.f5617a = 1;
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
            float f16 = f5615i;
            float f17 = f5616j;
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
                    w.b(canvas, path);
                    if (i10 != 0) {
                        int round = Math.round(Math.min(1.0f, f13) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f11 * 255.0f));
                        w.i(i22, paint2);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f13 * 255.0f * f11));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i11 = i24;
                    if (i10 != 0) {
                        w.i(i11, paint2);
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
        Rect rect = (Rect) this.f5619c;
        canvas.save();
        Path path = (Path) this.f5621f;
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f5620e;
        if (yVar != null) {
            yVar.setBounds(rect);
            ((org.telegram.ui.Cells.y) this.f5620e).draw(canvas);
        }
        if (z10) {
            q80 q80Var = (q80) this.h;
            if (q80Var == null) {
                q80 q80Var2 = new q80();
                this.h = q80Var2;
                q80Var2.D = true;
            } else if (q80Var.c() || ((q80) this.h).d()) {
                q80 q80Var3 = (q80) this.h;
                q80Var3.f38813b = -1L;
                q80Var3.f38814c = -1L;
            }
        } else {
            q80 q80Var4 = (q80) this.h;
            if (q80Var4 != null && !q80Var4.d() && !((q80) this.h).c()) {
                ((q80) this.h).a();
            }
        }
        canvas.restore();
        q80 q80Var5 = (q80) this.h;
        if (q80Var5 != null && !q80Var5.c()) {
            q80 q80Var6 = (q80) this.h;
            q80Var6.f38833y = path;
            q80Var6.g(m6.r1(0.7f, this.f5617a), m6.r1(1.3f, this.f5617a), m6.r1(1.5f, this.f5617a), m6.r1(2.0f, this.f5617a));
            ((q80) this.h).setBounds(rect);
            canvas.save();
            ((q80) this.h).draw(canvas);
            canvas.restore();
            ((r1) this.f5618b).invalidate();
        }
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z10) {
        float c10;
        float f10;
        float L;
        RectF rectF = (RectF) this.f5622g;
        int textSize = (((int) m6.X2.getTextSize()) * 2) + org.telegram.messenger.g0.L(4.0f);
        float max = Math.max(0, Math.min(6, cz.Y0) - 1);
        float min = Math.min(9, cz.Y0);
        float min2 = Math.min(3, cz.Y0);
        float f11 = -org.telegram.messenger.g0.L(e2.c(min, 9.0f, 2.66f, 4.0f));
        float f12 = -org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + org.telegram.messenger.g0.L(c10);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + org.telegram.messenger.g0.L(c10);
        Path path = (Path) this.f5621f;
        path.rewind();
        if (!z10) {
            max = cz.Y0 / 2.0f;
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
                float z11 = e2.z(L2, f12, 0.45f, f12);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(f10 - L, f12, f10, f12 + L);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - L4, L4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f15 = lineWidth2 - (L2 - z11);
                rectF.set(f15, z11, lineWidth2, L2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f15, z11, lineWidth2, L2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = e2.z(L2, f12, 0.55f, f12);
                float f16 = z12 - f12;
                rectF.set(f10 - f16, f12, f10, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                L = org.telegram.messenger.g0.L(min) * 2;
                rectF.set(lineWidth - f16, f12, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + L4, L4 + z12);
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
        ((Rect) this.f5619c).set((int) f11, (int) f12, (int) Math.max(lineWidth, lineWidth2), (int) L2);
    }

    public void d(int i7) {
        if (this.f5617a != i7) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f5620e;
            if (yVar == null) {
                this.f5620e = m6.h0(i7, 2, -1);
            } else {
                m6.H1(yVar, i7, true);
            }
            ((org.telegram.ui.Cells.y) this.f5620e).setCallback((r1) this.f5618b);
            this.f5617a = i7;
        }
    }

    public void e(boolean z10) {
        org.telegram.ui.Cells.y yVar;
        Rect rect = (Rect) this.f5619c;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((mc) this.d).c(z10);
        if (z10 && (yVar = (org.telegram.ui.Cells.y) this.f5620e) != null) {
            yVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.y yVar2 = (org.telegram.ui.Cells.y) this.f5620e;
        if (yVar2 != null) {
            yVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((r1) this.f5618b).invalidate();
    }

    public b1(int i7) {
        switch (i7) {
            case 3:
                Paint paint = new Paint();
                this.f5618b = paint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f5619c = new fb0(tileMode);
                this.d = new fb0(tileMode);
                this.f5620e = new fb0(Shader.TileMode.REPEAT);
                this.f5621f = new Object();
                this.f5622g = new Object();
                this.h = new float[4];
                paint.setFilterBitmap(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                return;
            default:
                this.f5618b = new Paint(1);
                Paint paint2 = new Paint(1);
                this.f5619c = paint2;
                this.d = new SweepGradient[4];
                this.f5617a = -1;
                this.f5620e = new Matrix();
                this.f5621f = new Path();
                this.f5622g = new RectF();
                this.h = new RectF();
                paint2.setStyle(Paint.Style.STROKE);
                return;
        }
    }
}
