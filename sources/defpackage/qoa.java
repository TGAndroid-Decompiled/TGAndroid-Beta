package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
public final class qoa extends View {
    public final String E;
    public final gk0 F;
    public final gk0 G;
    public long H;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final TextPaint e;
    public final Path f;
    public final Paint h;
    public final Drawable n;
    public final int r;
    public final boolean s;
    public LinearGradient w;
    public LinearGradient x;
    public int y;

    public qoa(int i, vnb vnbVar, Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.b = paint3;
        Paint paint4 = new Paint(1);
        this.c = paint4;
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f = new Path();
        this.h = new Paint(1);
        this.E = ob6.M0(2131744954, null).concat(" · ");
        this.F = new gk0(12, -1);
        this.G = new gk0(11, -1);
        int v0 = aob.v0(i, vnbVar);
        this.r = v0;
        this.s = hl.B(aob.v0(aob.d6, vnbVar)) >= 0.5f;
        aob.v0(aob.j5, vnbVar);
        paint.setColor(v0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.N(1.6f));
        paint3.setColor(v0);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(hl.N(3.0f));
        textPaint.setTextSize(hl.L(17.0f));
        Drawable mutate = activity.getResources().getDrawable(2131231511).mutate();
        this.n = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public static float a(float f) {
        return bp1.g((((float) Math.sin((f * 0.113f) + 0.4f)) * 0.5f) + 0.5f, 0.2f, (((((float) Math.sin((0.053f * f) + 1.7f)) * 0.5f) + 0.5f) * 0.35f) + (((((float) Math.sin(0.021f * f)) * 0.5f) + 0.5f) * 0.45f), 0.82f, 0.18f);
    }

    public final int b() {
        boolean z = this.s;
        int i = this.r;
        if (z) {
            return vm2.f(0.18f, i, -16777216);
        }
        return vm2.f(0.22f, i, -1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i;
        float f10;
        long min;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        boolean z;
        float f17;
        float f18;
        float L;
        float L2;
        float f19;
        int f20;
        boolean z2;
        float f21;
        float e;
        float f22;
        float f23;
        int i2;
        float f24;
        float f25;
        float f26;
        float f27;
        int i3;
        int i4;
        float f28;
        int i5;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0) {
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() % 1000000)) / 1000.0f;
        float f34 = width;
        float f35 = f34 / 2.0f;
        float f36 = height;
        float f37 = f36 / 2.0f;
        float L3 = hl.L(36.0f);
        float L4 = uptimeMillis * hl.L(36.3f);
        float L5 = (f35 - L3) - hl.L(6.0f);
        float L6 = f35 + L3 + hl.L(10.0f);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f34, f36, null);
        float f38 = f34;
        float L7 = hl.L(6.0f);
        float f39 = (L5 - L7) + (L4 % L7);
        while (true) {
            float f40 = f39;
            f = f35;
            f2 = L4;
            if (f39 <= (-L7)) {
                break;
            }
            float f41 = L5 - f40;
            float w = qu6.w(f41, hl.L(34.0f), 1.0f, 0.0f);
            float z3 = xnb.z(w, 0.5f, 0.5f, (a(f40 - f2) * hl.L(24.0f)) + hl.L(5.0f));
            Paint paint = this.b;
            paint.setAlpha((int) xnb.z(w, 0.8f, 0.2f, 255.0f));
            if (w > 0.35f) {
                float max = Math.max(0.0f, Math.min(1.0f, 1.0f - (f41 / hl.L(30.0f))));
                float B = xnb.B(max, 2.0f, 3.0f, max * max);
                if (B < 0.01f) {
                    float f42 = z3 / 2.0f;
                    f30 = L7;
                    canvas.drawLine(f40, f37 - f42, f40, f37 + f42, paint);
                    f29 = f40;
                    i5 = saveLayer;
                } else {
                    f29 = f40;
                    f30 = L7;
                    float max2 = Math.max(hl.L(8.0f), f - f29);
                    Path path = this.f;
                    path.rewind();
                    int i6 = 0;
                    while (i6 <= 8) {
                        float f43 = ((i6 / 8.0f) - 0.5f) * z3;
                        float f44 = max2;
                        int i7 = saveLayer;
                        double d = f43 / f44;
                        float A = qd4.A(f - (((float) Math.cos(d)) * f44), f29, B, f29);
                        float sin = (((((((float) Math.sin(d)) * f44) + f37) - f37) - f43) * B) + f37 + f43;
                        if (i6 == 0) {
                            path.moveTo(A, sin);
                        } else {
                            path.lineTo(A, sin);
                        }
                        i6++;
                        max2 = f44;
                        saveLayer = i7;
                    }
                    i5 = saveLayer;
                    Paint paint2 = this.h;
                    paint2.set(paint);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    canvas.drawPath(path, paint2);
                }
                f31 = f38;
            } else {
                i5 = saveLayer;
                f29 = f40;
                f30 = L7;
                float f45 = 1.0f - (w / 0.35f);
                float f46 = 2.0f;
                float B2 = xnb.B(f45, 2.0f, 3.0f, f45 * f45);
                float alpha = paint.getAlpha();
                float max3 = Math.max(hl.N(0.8f), (paint.getStrokeWidth() / 2.0f) * (1.0f - (B2 * 0.5f)));
                int i8 = 0;
                while (i8 < 5) {
                    float f47 = ((i8 / 4.0f) * f46) - 1.0f;
                    float signum = Math.signum(f47);
                    float f48 = f38;
                    int i9 = i8;
                    float f49 = z3;
                    float x = c00.x((float) Math.sin((f32 * 2.1f) + (0.37f * f28)), hl.L(1.5f), B2, (((Math.abs(f47) * hl.L(6.0f)) + hl.L(10.0f)) * signum * B2) + qu6.d(f47, z3, 2.0f, f37));
                    float abs = (((Math.abs(f47) * 0.4f) + 0.6f) * hl.L(4.0f) * B2) + f29;
                    if (f47 == 0.0f) {
                        f33 = 1.0f - B2;
                    } else {
                        f33 = 1.0f - (B2 * 0.6f);
                    }
                    paint.setAlpha((int) (f33 * alpha));
                    canvas.drawCircle(abs, x, max3, paint);
                    i8 = i9 + 1;
                    z3 = f49;
                    f38 = f48;
                    f46 = 2.0f;
                }
                f31 = f38;
                paint.setAlpha((int) alpha);
            }
            f39 = f29 - f30;
            L7 = f30;
            f35 = f;
            L4 = f2;
            saveLayer = i5;
            f38 = f31;
        }
        Canvas canvas2 = canvas;
        float f50 = f38;
        int i10 = saveLayer;
        LinearGradient linearGradient = this.x;
        TextPaint textPaint = this.e;
        if (linearGradient != null && this.y == width) {
            f3 = L6;
        } else {
            LinearGradient linearGradient2 = new LinearGradient(L6, 0.0f, L6 + 1.0f, 0.0f, b(), b(), Shader.TileMode.CLAMP);
            f3 = L6;
            this.x = linearGradient2;
            textPaint.setShader(linearGradient2);
        }
        canvas2.save();
        canvas2.clipRect(f3, 0.0f, f50, f36);
        String str = this.E;
        float measureText = textPaint.measureText(str);
        float descent = f37 - ((textPaint.descent() + textPaint.ascent()) / 2.0f);
        for (float L8 = (f3 + hl.L(4.0f)) - (measureText - ((hl.L(55.0f) * uptimeMillis) % measureText)); L8 < f50; L8 += measureText) {
            canvas2.drawText(str, L8, descent, textPaint);
        }
        canvas2.restore();
        LinearGradient linearGradient3 = this.w;
        Paint paint3 = this.c;
        if (linearGradient3 != null && this.y == width) {
            f10 = f3;
            f7 = f37;
            f6 = descent;
            f4 = f36;
            f5 = L3;
            f8 = f2;
            f9 = 2.0f;
            i = i10;
        } else {
            this.y = width;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            f4 = f36;
            f5 = L3;
            f6 = descent;
            f7 = f37;
            f8 = f2;
            f9 = 2.0f;
            i = i10;
            LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, f50, 0.0f, new int[]{0, -16777216, -16777216, 0}, new float[]{0.0f, 0.22f, 0.78f, 1.0f}, tileMode);
            this.w = linearGradient4;
            paint3.setShader(linearGradient4);
            f10 = f3;
            LinearGradient linearGradient5 = new LinearGradient(f10, 0.0f, f3 + 1.0f, 0.0f, b(), b(), tileMode);
            this.x = linearGradient5;
            textPaint.setShader(linearGradient5);
        }
        float f51 = f7;
        canvas2.drawRect(0.0f, 0.0f, f50, f4, paint3);
        canvas2.restoreToCount(i);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j = this.H;
        if (j == 0) {
            min = 16;
        } else {
            min = Math.min(64L, uptimeMillis2 - j);
        }
        this.H = uptimeMillis2;
        gk0 gk0Var = this.F;
        float f52 = gk0Var.a;
        Paint paint4 = gk0Var.d;
        int i11 = (f52 > 0.0f ? 1 : (f52 == 0.0f ? 0 : -1));
        int i12 = this.r;
        boolean z4 = this.s;
        gk0 gk0Var2 = this.G;
        if (i11 == 0) {
            gk0Var2.a = hl.L(1.0f) + f5;
            f11 = 1.0f;
            f12 = 0.6f;
            gk0Var2.b = (hl.L(12.0f) * 0.6f) + hl.L(1.0f) + f5;
            gk0Var.a = f5 + hl.L(7.0f);
            gk0Var.b = (hl.L(12.0f) * 0.6f) + f5 + hl.L(7.0f);
            gk0Var2.b();
            gk0Var.b();
            if (z4) {
                i3 = 20;
            } else {
                i3 = 48;
            }
            paint4.setColor(vm2.o(i12, i3));
            Paint paint5 = gk0Var2.d;
            if (z4) {
                i4 = 32;
            } else {
                i4 = 72;
            }
            paint5.setColor(vm2.o(i12, i4));
        } else {
            f11 = 1.0f;
            f12 = 0.6f;
        }
        float a = (a(-f8) * f12) + 0.25f;
        gk0Var.d(true, a);
        gk0Var2.d(false, a);
        gk0Var.f(min);
        gk0Var2.f(min);
        float f53 = 0.5f;
        gk0Var.e(gk0Var.t, 0.5f);
        gk0Var2.e(gk0Var2.t, 0.5f);
        canvas2.save();
        float f54 = (gk0Var.t * 0.5f) + 0.878f;
        canvas2.scale(f54, f54, f, f51);
        gk0Var.a(f, f51, canvas2, paint4);
        canvas2.restore();
        canvas2.save();
        float f55 = (gk0Var2.t * 0.5f) + 0.926f;
        canvas2.scale(f55, f55, f, f51);
        gk0Var2.a(f, f51, canvas2, gk0Var2.d);
        canvas2.restore();
        int i13 = 0;
        while (i13 < 96) {
            double d2 = i13;
            float abs2 = (float) (Math.abs(Math.sin(78.233d * d2) * 43758.5453d) % 1.0d);
            float abs3 = (float) (Math.abs(Math.sin((d2 * 12.9898d) + 4.1d) * 43758.5453d) % 1.0d);
            float f56 = (((abs3 * 7.0f) + uptimeMillis) / ((1.6f * abs2) + 2.4f)) % f11;
            if (abs3 > f53) {
                f13 = f11;
            } else {
                f13 = -1.0f;
            }
            int i14 = (f56 > 0.55f ? 1 : (f56 == 0.55f ? 0 : -1));
            float f57 = f53;
            if (i14 < 0) {
                float f58 = f56 / 0.55f;
                f17 = 0.45f;
                float f59 = f58 * f58;
                f16 = uptimeMillis;
                z = z4;
                float g = bp1.g(abs2, 0.4f, f12, ((1.25f * f59) + 0.15f) * f13 * 3.1415927f, 3.1415927f);
                float A2 = qd4.A(f11, f59, (hl.L(18.0f) * abs2) + hl.L(34.0f), hl.L(4.0f) + f5);
                double d3 = g;
                float cos = (((float) Math.cos(d3)) * A2) + f;
                float sin2 = f51 - (((abs2 * 0.2f) + 0.62f) * (((float) Math.sin(d3)) * A2));
                float L9 = (L5 - hl.L(f9)) - (hl.L(10.0f) * abs2);
                float g2 = bp1.g(hl.L(12.0f), abs3, hl.L(f9), f13, f51);
                float min2 = Math.min(1.0f, f58 / 0.35f);
                float f60 = f9;
                f14 = f5;
                f15 = abs3;
                float B3 = xnb.B(min2, f60, 3.0f, min2 * min2);
                float A3 = qd4.A(cos, L9, B3, L9);
                L = qd4.A(sin2, g2, B3, g2);
                f18 = f60;
                L2 = A3;
            } else {
                float f61 = f9;
                f14 = f5;
                f15 = abs3;
                f16 = uptimeMillis;
                z = z4;
                f17 = 0.45f;
                float f62 = (f56 - 0.55f) / 0.45f;
                float f63 = f11 - f62;
                float f64 = f11 - (f63 * f63);
                float L10 = (hl.L(16.0f) * f64) + f14 + hl.L(3.0f);
                double d4 = (f11 - f64) * f13 * 0.55f * 3.1415927f;
                f18 = f61;
                float cos2 = (((float) Math.cos(d4)) * L10) + f;
                float v = bp1.v((float) Math.sin(d4), L10, 0.7f, f51);
                float f65 = f62 * f62;
                L = v + (((((f15 - f57) * hl.L(4.0f)) + (f6 - hl.L(6.0f))) - v) * f65);
                L2 = cos2 + ((((hl.L(26.0f) * abs2) + (f10 + hl.L(8.0f))) - cos2) * f65);
            }
            float sin3 = (float) Math.sin(f56 * 3.141592653589793d);
            if (i14 < 0) {
                f19 = 1.0f;
                f11 = 1.0f;
            } else {
                f11 = 1.0f;
                f19 = 1.0f - (((f56 - 0.55f) / f17) * f57);
            }
            float f66 = sin3 * f19;
            if (z) {
                f20 = vm2.f(f15 * 0.15f, i12, -16777216);
            } else {
                f20 = vm2.f((f15 * 0.25f) + 0.12f, i12, -1);
            }
            Paint paint6 = this.d;
            paint6.setColor(f20);
            if (abs2 > 0.87f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                e = hl.N(1.1f);
                f21 = 0.6f;
            } else {
                f21 = 0.6f;
                e = bp1.e(0.6f, abs2, hl.N(f57));
            }
            if (z2) {
                i2 = i13;
                float sin4 = (((float) Math.sin((f16 * 6.0f) + i13)) * 0.4f) + f21;
                if (!z) {
                    paint6.setAlpha((int) (70.0f * f66 * sin4));
                    canvas2.drawCircle(L2, L, 3.2f * e, paint6);
                }
                paint6.setAlpha((int) (f66 * 255.0f * sin4));
                f23 = 0.6f;
                paint6.setStrokeWidth(hl.N(0.6f));
                float f67 = e * 3.0f * sin4;
                float f68 = f18;
                f26 = e;
                f27 = abs2;
                f24 = f68;
                canvas2.drawLine(L2 - f67, L, L2 + f67, L, paint6);
                float f69 = L2;
                f22 = L2;
                f25 = L;
                canvas2 = canvas;
                canvas2.drawLine(f22, L - f67, f69, L + f67, paint6);
            } else {
                f22 = L2;
                f23 = f21;
                i2 = i13;
                f24 = f18;
                f25 = L;
                f26 = e;
                f27 = abs2;
            }
            paint6.setAlpha((int) xnb.z(f27, 0.55f, f17, f66 * 255.0f));
            canvas2.drawCircle(f22, f25, f26, paint6);
            i13 = i2 + 1;
            f5 = f14;
            z4 = z;
            uptimeMillis = f16;
            f12 = f23;
            f53 = f57;
            f9 = f24;
        }
        canvas2.drawCircle(f, f51, f5, this.a);
        float L11 = hl.L(30.0f) / f9;
        Drawable drawable = this.n;
        drawable.setBounds((int) (f - L11), (int) (f51 - L11), (int) (f + L11), (int) (f51 + L11));
        drawable.draw(canvas2);
        invalidate();
    }
}
