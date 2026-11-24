package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
public final class xma extends View {
    public long E;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final TextPaint e;
    public final Drawable f;
    public final int h;
    public LinearGradient n;
    public LinearGradient r;
    public int s;
    public final String w;
    public final fl0 x;
    public final fl0 y;

    public xma(Activity activity, ylb ylbVar) {
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
        this.w = jb6.M0(2131744975, null).concat(" · ");
        this.x = new fl0(12);
        this.y = new fl0(11);
        int v0 = cmb.v0(cmb.Ei, ylbVar);
        this.h = v0;
        cmb.v0(cmb.i5, ylbVar);
        paint.setColor(v0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gm.N(1.6f));
        paint3.setColor(v0);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(gm.N(3.0f));
        textPaint.setTextSize(gm.L(17.0f));
        Drawable mutate = activity.getResources().getDrawable(2131231512).mutate();
        this.f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public static float a(float f) {
        return aq1.g((((float) Math.sin((f * 0.113f) + 0.4f)) * 0.5f) + 0.5f, 0.2f, (((((float) Math.sin((0.053f * f) + 1.7f)) * 0.5f) + 0.5f) * 0.35f) + (((((float) Math.sin(0.021f * f)) * 0.5f) + 0.5f) * 0.45f), 0.82f, 0.18f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        long min;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z;
        int i2;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float e;
        float f24;
        float f25;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0) {
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() % 1000000)) / 1000.0f;
        float f26 = width;
        float f27 = f26 / 2.0f;
        float f28 = height;
        float f29 = f28 / 2.0f;
        float L = gm.L(36.0f);
        float L2 = uptimeMillis * gm.L(33.0f);
        float L3 = (f27 - L) - gm.L(6.0f);
        float L4 = f27 + L + gm.L(10.0f);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f26, f28, null);
        float L5 = gm.L(6.0f);
        float f30 = L3 - (L2 % L5);
        while (true) {
            f = f27;
            float f31 = 1.0f;
            if (f30 <= (-L5)) {
                break;
            }
            float f32 = 0.7f;
            float x = kt6.x(L3 - f30, gm.L(34.0f), 1.0f, 0.0f);
            float f33 = 0.8f * x;
            float A = mlb.A(f33, x, 0.2f, (a(f30 - L2) * gm.L(30.0f)) + gm.L(6.0f));
            Paint paint = this.b;
            paint.setAlpha((int) ((f33 + 0.2f) * 255.0f));
            float f34 = 1.0f - x;
            float L6 = f34 * f34 * gm.L(7.0f);
            if (x > 0.75f) {
                float f35 = f30 - L6;
                float f36 = A / 2.0f;
                float f37 = f29 - f36;
                float f38 = (L6 * 0.35f) + f30;
                float f39 = f29;
                f24 = L5;
                canvas.drawLine(f35, f37, f38, f39, paint);
                canvas.drawLine(f38, f39, f35, f39 + f36, paint);
                f25 = f39;
            } else {
                float f40 = f29;
                f24 = L5;
                float f41 = 1.0f - (x / 0.75f);
                float f42 = A / 3.0f;
                int i3 = 0;
                while (i3 < 3) {
                    float f43 = A / 2.0f;
                    float f44 = (i3 * f42) + (f40 - f43);
                    float f45 = ((f44 + f42) + f44) / 2.0f;
                    float f46 = f45 - f40;
                    float f47 = ((f31 - (f41 * f32)) * f42) / 2.0f;
                    float abs = f30 - ((Math.abs(f46) * L6) / Math.max(f31, f43));
                    float f48 = f45 + (f46 * 0.6f * f41);
                    canvas.drawLine(abs, f48 - f47, abs, f48 + f47, paint);
                    i3++;
                    f40 = f40;
                    f31 = f31;
                    f32 = 0.7f;
                }
                f25 = f40;
            }
            f30 -= f24;
            L5 = f24;
            f29 = f25;
            f27 = f;
        }
        Canvas canvas2 = canvas;
        float f49 = 1.0f;
        float f50 = f29;
        LinearGradient linearGradient = this.r;
        Paint paint2 = this.e;
        int i4 = this.h;
        if (linearGradient != null && this.s == width) {
            f2 = L4;
        } else {
            LinearGradient linearGradient2 = new LinearGradient(L4, 0.0f, L4 + 1.0f, 0.0f, on2.f(0.22f, i4, -1), on2.f(0.22f, i4, -1), Shader.TileMode.CLAMP);
            f2 = L4;
            this.r = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas2.save();
        canvas2.clipRect(f2, 0.0f, f26, f28);
        String str = this.w;
        float measureText = paint2.measureText(str);
        float descent = f50 - ((paint2.descent() + paint2.ascent()) / 2.0f);
        for (float L7 = (gm.L(4.0f) + f2) - (measureText - ((gm.L(55.0f) * uptimeMillis) % measureText)); L7 < f26; L7 += measureText) {
            canvas2.drawText(str, L7, descent, paint2);
        }
        canvas2.restore();
        if (this.n != null && this.s == width) {
            f3 = f2;
            f5 = f50;
            f6 = L2;
            i = saveLayer;
            f4 = f28;
            f7 = L;
        } else {
            this.s = width;
            f3 = f2;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            i = saveLayer;
            f4 = f28;
            f5 = f50;
            f6 = L2;
            f7 = L;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f26, 0.0f, new int[]{0, -16777216, -16777216, 0}, new float[]{0.0f, 0.22f, 0.78f, 1.0f}, tileMode);
            this.n = linearGradient3;
            this.c.setShader(linearGradient3);
            LinearGradient linearGradient4 = new LinearGradient(f3, 0.0f, f3 + 1.0f, 0.0f, on2.f(0.22f, i4, -1), on2.f(0.22f, i4, -1), tileMode);
            this.r = linearGradient4;
            paint2.setShader(linearGradient4);
        }
        int i5 = i4;
        float f51 = 3.0f;
        float f52 = descent;
        float f53 = f5;
        canvas2.drawRect(0.0f, 0.0f, f26, f4, this.c);
        canvas2.restoreToCount(i);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j = this.E;
        if (j == 0) {
            min = 16;
            f8 = f;
        } else {
            f8 = f;
            min = Math.min(64L, uptimeMillis2 - j);
        }
        this.E = uptimeMillis2;
        fl0 fl0Var = this.x;
        int i6 = (fl0Var.a > 0.0f ? 1 : (fl0Var.a == 0.0f ? 0 : -1));
        fl0 fl0Var2 = this.y;
        if (i6 == 0) {
            fl0Var2.a = gm.L(1.0f) + f7;
            f9 = 0.6f;
            fl0Var2.b = (gm.L(12.0f) * 0.6f) + gm.L(1.0f) + f7;
            fl0Var.a = gm.L(3.0f) + f7;
            fl0Var.b = (gm.L(10.0f) * 0.6f) + gm.L(3.0f) + f7;
            fl0Var2.b();
            fl0Var.b();
            fl0Var.d.setColor(on2.p(i5, 48));
            fl0Var2.d.setColor(on2.p(i5, 72));
        } else {
            f9 = 0.6f;
        }
        float a = (a(-f6) * f9) + 0.25f;
        fl0Var.d(true, a);
        fl0Var2.d(false, a);
        fl0Var.f(min);
        fl0Var2.f(min);
        fl0Var.e(fl0Var.t, 1.01f);
        fl0Var2.e(fl0Var2.t, 1.02f);
        canvas2.save();
        float f54 = (fl0Var.t * 0.5f) + 0.878f;
        float f55 = f8;
        canvas2.scale(f54, f54, f55, f53);
        fl0Var.a(f55, f53, canvas2, fl0Var.d);
        canvas2.restore();
        canvas2.save();
        float f56 = (fl0Var2.t * 0.5f) + 0.926f;
        canvas2.scale(f56, f56, f55, f53);
        fl0Var2.a(f55, f53, canvas2, fl0Var2.d);
        canvas2.restore();
        int i7 = 0;
        while (i7 < 96) {
            double d = i7;
            int i8 = i5;
            float abs2 = (float) (Math.abs(Math.sin(78.233d * d) * 43758.5453d) % 1.0d);
            float abs3 = (float) (Math.abs(Math.sin((d * 12.9898d) + 4.1d) * 43758.5453d) % 1.0d);
            float f57 = (((abs3 * 7.0f) + uptimeMillis) / ((1.6f * abs2) + 2.4f)) % f49;
            if (abs3 > 0.5f) {
                f10 = f49;
            } else {
                f10 = -1.0f;
            }
            if (f57 < 0.55f) {
                float f58 = f57 / 0.55f;
                float f59 = f51;
                float f60 = f58 * f58;
                f11 = f55;
                float g = aq1.g(abs2, 0.4f, f9, ((1.25f * f60) + 0.15f) * f10 * 3.1415927f, 3.1415927f);
                f13 = 0.4f;
                f14 = f9;
                float A2 = td4.A(f49, f60, (gm.L(18.0f) * abs2) + gm.L(34.0f), gm.L(4.0f) + f7);
                double d2 = g;
                f12 = uptimeMillis;
                float L8 = (L3 - gm.L(6.0f)) - (gm.L(26.0f) * abs2);
                float g2 = aq1.g(gm.L(13.0f), abs3, gm.L(f59), f10, f53);
                float min2 = Math.min(1.0f, f58 / 0.35f);
                f15 = f52;
                f49 = 1.0f;
                float B = mlb.B(min2, 2.0f, f59, min2 * min2);
                float A3 = td4.A((((float) Math.cos(d2)) * A2) + f11, L8, B, L8);
                f18 = td4.A(f53 - (((abs2 * 0.2f) + 0.62f) * (((float) Math.sin(d2)) * A2)), g2, B, g2);
                f17 = A3;
                f16 = abs2;
            } else {
                f11 = f55;
                f12 = uptimeMillis;
                f13 = 0.4f;
                f14 = f9;
                f15 = f52;
                float f61 = (f57 - 0.55f) / 0.45f;
                float f62 = f49 - f61;
                float f63 = f49 - (f62 * f62);
                float L9 = (gm.L(16.0f) * f63) + gm.L(3.0f) + f7;
                double d3 = (f49 - f63) * f10 * 0.55f * 3.1415927f;
                f16 = abs2;
                float cos = (((float) Math.cos(d3)) * L9) + f11;
                float v = aq1.v((float) Math.sin(d3), L9, 0.7f, f53);
                float f64 = f61 * f61;
                float L10 = cos + ((((gm.L(26.0f) * f16) + (f3 + gm.L(8.0f))) - cos) * f64);
                float L11 = (((((abs3 - 0.5f) * gm.L(4.0f)) + (f15 - gm.L(6.0f))) - v) * f64) + v;
                f17 = L10;
                f18 = L11;
            }
            float sin = (float) Math.sin(f57 * 3.141592653589793d);
            i5 = i8;
            int f65 = on2.f((abs3 * 0.25f) + 0.12f, i5, -1);
            Paint paint3 = this.d;
            paint3.setColor(f65);
            if (f16 > 0.87f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                e = gm.N(1.1f);
                float sin2 = (((float) Math.sin((f12 * 6.0f) + i7)) * f13) + f14;
                paint3.setAlpha((int) (70.0f * sin * sin2));
                canvas2.drawCircle(f17, f18, 3.2f * e, paint3);
                paint3.setAlpha((int) (sin * 255.0f * sin2));
                paint3.setStrokeWidth(gm.N(f14));
                f21 = 3.0f;
                float f66 = e * 3.0f * sin2;
                i2 = i7;
                float f67 = f18;
                f20 = f11;
                canvas2.drawLine(f17 - f66, f67, f17 + f66, f18, paint3);
                float f68 = f17;
                f19 = f17;
                f22 = f67;
                canvas2 = canvas;
                canvas2.drawLine(f19, f67 - f66, f68, f67 + f66, paint3);
                f23 = f14;
            } else {
                i2 = i7;
                f19 = f17;
                f20 = f11;
                f21 = 3.0f;
                f22 = f18;
                f23 = f14;
                e = aq1.e(f23, f16, gm.N(0.5f));
            }
            paint3.setAlpha((int) mlb.A(f16, 0.55f, 0.45f, sin * 255.0f));
            canvas2.drawCircle(f19, f22, e, paint3);
            i7 = i2 + 1;
            f9 = f23;
            f55 = f20;
            f52 = f15;
            f51 = f21;
            uptimeMillis = f12;
        }
        float f69 = f55;
        canvas2.drawCircle(f69, f53, f7, this.a);
        float L12 = gm.L(30.0f) / 2.0f;
        Drawable drawable = this.f;
        drawable.setBounds((int) (f69 - L12), (int) (f53 - L12), (int) (f69 + L12), (int) (f53 + L12));
        drawable.draw(canvas2);
        invalidate();
    }
}
