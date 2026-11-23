package ai;

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
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.v9;
public final class m2 extends View {
    public long E;
    public final Paint f1374a;
    public final Paint f1375b;
    public final Paint f1376c;
    public final Paint d;
    public final TextPaint f1377e;
    public final Drawable f1378f;
    public final int h;
    public LinearGradient f1379n;
    public LinearGradient f1380r;
    public int f1381s;
    public final String f1382w;
    public final v9 f1383x;
    public final v9 f1384y;

    public m2(Activity activity, i6 i6Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.f1374a = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f1375b = paint3;
        Paint paint4 = new Paint(1);
        this.f1376c = paint4;
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f1377e = textPaint;
        this.f1382w = gd.N0(2131745045, null) + " · ";
        this.f1383x = new v9(12);
        this.f1384y = new v9(11);
        int w02 = n6.w0(n6.Fi, i6Var);
        this.h = w02;
        n6.w0(n6.f29559j5, i6Var);
        paint.setColor(w02);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        paint3.setColor(w02);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(3.0f));
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        Drawable mutate = activity.getResources().getDrawable(2131231511).mutate();
        this.f1378f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public static float a(float f10) {
        return org.telegram.ui.Cells.c0.g((((float) Math.sin((f10 * 0.113f) + 0.4f)) * 0.5f) + 0.5f, 0.2f, (((((float) Math.sin((0.053f * f10) + 1.7f)) * 0.5f) + 0.5f) * 0.35f) + (((((float) Math.sin(0.021f * f10)) * 0.5f) + 0.5f) * 0.45f), 0.82f, 0.18f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        int i7;
        float f13;
        float f14;
        float f15;
        float f16;
        char c10;
        float f17;
        long min;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        boolean z11;
        float f27;
        float e10;
        int i10;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0) {
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() % 1000000)) / 1000.0f;
        float f35 = width;
        float f36 = f35 / 2.0f;
        float f37 = height;
        float f38 = f37 / 2.0f;
        float L = org.telegram.messenger.g0.L(36.0f);
        float L2 = uptimeMillis * org.telegram.messenger.g0.L(33.0f);
        float L3 = (f36 - L) - org.telegram.messenger.g0.L(6.0f);
        float L4 = f36 + L + org.telegram.messenger.g0.L(10.0f);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f35, f37, null);
        float L5 = org.telegram.messenger.g0.L(6.0f);
        float f39 = L3 - (L2 % L5);
        while (true) {
            f10 = f36;
            float f40 = 1.0f;
            if (f39 <= (-L5)) {
                break;
            }
            float f41 = 0.7f;
            float C = a8.p0.C(L3 - f39, org.telegram.messenger.g0.L(34.0f), 1.0f, 0.0f);
            float f42 = 0.8f * C;
            float B = com.google.android.gms.internal.vision.e2.B(f42, C, 0.2f, (a(f39 - L2) * org.telegram.messenger.g0.L(30.0f)) + org.telegram.messenger.g0.L(6.0f));
            Paint paint = this.f1375b;
            paint.setAlpha((int) ((f42 + 0.2f) * 255.0f));
            float f43 = 1.0f - C;
            float L6 = f43 * f43 * org.telegram.messenger.g0.L(7.0f);
            if (C > 0.75f) {
                float f44 = f39 - L6;
                float f45 = B / 2.0f;
                float f46 = f38 - f45;
                float f47 = (L6 * 0.35f) + f39;
                float f48 = f38;
                f33 = L5;
                canvas.drawLine(f44, f46, f47, f48, paint);
                canvas.drawLine(f47, f48, f44, f48 + f45, paint);
                f34 = f48;
            } else {
                float f49 = f38;
                f33 = L5;
                float f50 = 1.0f - (C / 0.75f);
                float f51 = B / 3.0f;
                int i11 = 0;
                while (i11 < 3) {
                    float f52 = B / 2.0f;
                    float f53 = (i11 * f51) + (f49 - f52);
                    float f54 = ((f53 + f51) + f53) / 2.0f;
                    float f55 = f54 - f49;
                    float f56 = ((f40 - (f50 * f41)) * f51) / 2.0f;
                    float abs = f39 - ((Math.abs(f55) * L6) / Math.max(f40, f52));
                    float f57 = f54 + (f55 * 0.6f * f50);
                    canvas.drawLine(abs, f57 - f56, abs, f57 + f56, paint);
                    i11++;
                    f49 = f49;
                    f40 = f40;
                    f41 = 0.7f;
                }
                f34 = f49;
            }
            f39 -= f33;
            L5 = f33;
            f38 = f34;
            f36 = f10;
        }
        Canvas canvas2 = canvas;
        float f58 = 1.0f;
        float f59 = f38;
        LinearGradient linearGradient = this.f1380r;
        Paint paint2 = this.f1377e;
        int i12 = this.h;
        if (linearGradient != null && this.f1381s == width) {
            f11 = L4;
        } else {
            LinearGradient linearGradient2 = new LinearGradient(L4, 0.0f, L4 + 1.0f, 0.0f, i0.a.f(0.22f, i12, -1), i0.a.f(0.22f, i12, -1), Shader.TileMode.CLAMP);
            f11 = L4;
            this.f1380r = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas2.save();
        canvas2.clipRect(f11, 0.0f, f35, f37);
        String str = this.f1382w;
        float measureText = paint2.measureText(str);
        float descent = f59 - ((paint2.descent() + paint2.ascent()) / 2.0f);
        for (float L7 = (org.telegram.messenger.g0.L(4.0f) + f11) - (measureText - ((org.telegram.messenger.g0.L(55.0f) * uptimeMillis) % measureText)); L7 < f35; L7 += measureText) {
            canvas2.drawText(str, L7, descent, paint2);
        }
        canvas2.restore();
        if (this.f1379n != null && this.f1381s == width) {
            f12 = f11;
            f14 = f59;
            f15 = L2;
            i7 = saveLayer;
            f13 = f37;
            f16 = L;
            c10 = 65535;
            z10 = false;
        } else {
            this.f1381s = width;
            f12 = f11;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            z10 = false;
            i7 = saveLayer;
            f13 = f37;
            f14 = f59;
            f15 = L2;
            f16 = L;
            c10 = 65535;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f35, 0.0f, new int[]{0, -16777216, -16777216, 0}, new float[]{0.0f, 0.22f, 0.78f, 1.0f}, tileMode);
            this.f1379n = linearGradient3;
            this.f1376c.setShader(linearGradient3);
            LinearGradient linearGradient4 = new LinearGradient(f12, 0.0f, f12 + 1.0f, 0.0f, i0.a.f(0.22f, i12, -1), i0.a.f(0.22f, i12, -1), tileMode);
            this.f1380r = linearGradient4;
            paint2.setShader(linearGradient4);
        }
        int i13 = i12;
        float f60 = 3.0f;
        float f61 = descent;
        float f62 = f14;
        canvas2.drawRect(0.0f, 0.0f, f35, f13, this.f1376c);
        canvas2.restoreToCount(i7);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j3 = this.E;
        if (j3 == 0) {
            min = 16;
            f17 = f10;
        } else {
            f17 = f10;
            min = Math.min(64L, uptimeMillis2 - j3);
        }
        this.E = uptimeMillis2;
        v9 v9Var = this.f1383x;
        int i14 = (v9Var.f40595a > 0.0f ? 1 : (v9Var.f40595a == 0.0f ? 0 : -1));
        v9 v9Var2 = this.f1384y;
        if (i14 == 0) {
            v9Var2.f40595a = org.telegram.messenger.g0.L(1.0f) + f16;
            f18 = 0.6f;
            v9Var2.f40596b = (org.telegram.messenger.g0.L(12.0f) * 0.6f) + org.telegram.messenger.g0.L(1.0f) + f16;
            v9Var.f40595a = org.telegram.messenger.g0.L(3.0f) + f16;
            v9Var.f40596b = (org.telegram.messenger.g0.L(10.0f) * 0.6f) + org.telegram.messenger.g0.L(3.0f) + f16;
            v9Var2.b();
            v9Var.b();
            v9Var.d.setColor(i0.a.o(i13, 48));
            v9Var2.d.setColor(i0.a.o(i13, 72));
        } else {
            f18 = 0.6f;
        }
        float a10 = (a(-f15) * f18) + 0.25f;
        v9Var.d(true, a10);
        v9Var2.d(false, a10);
        v9Var.f(min);
        v9Var2.f(min);
        v9Var.e(v9Var.f40612t, 1.01f);
        v9Var2.e(v9Var2.f40612t, 1.02f);
        canvas2.save();
        float f63 = (v9Var.f40612t * 0.5f) + 0.878f;
        float f64 = f17;
        canvas2.scale(f63, f63, f64, f62);
        v9Var.a(f64, f62, canvas2, v9Var.d);
        canvas2.restore();
        canvas2.save();
        float f65 = (v9Var2.f40612t * 0.5f) + 0.926f;
        canvas2.scale(f65, f65, f64, f62);
        v9Var2.a(f64, f62, canvas2, v9Var2.d);
        canvas2.restore();
        int i15 = 0;
        while (i15 < 96) {
            double d = i15;
            int i16 = i13;
            float abs2 = (float) (Math.abs(Math.sin(78.233d * d) * 43758.5453d) % 1.0d);
            float abs3 = (float) (Math.abs(Math.sin((d * 12.9898d) + 4.1d) * 43758.5453d) % 1.0d);
            float f66 = (((abs3 * 7.0f) + uptimeMillis) / ((1.6f * abs2) + 2.4f)) % f58;
            if (abs3 > 0.5f) {
                f19 = f58;
            } else {
                f19 = -1.0f;
            }
            if (f66 < 0.55f) {
                float f67 = f66 / 0.55f;
                float f68 = f60;
                float f69 = f67 * f67;
                f20 = f64;
                float g10 = org.telegram.ui.Cells.c0.g(abs2, 0.4f, f18, ((1.25f * f69) + 0.15f) * f19 * 3.1415927f, 3.1415927f);
                f22 = 0.4f;
                float z12 = com.google.android.gms.internal.vision.e2.z(f58, f69, (org.telegram.messenger.g0.L(18.0f) * abs2) + org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(4.0f) + f16);
                double d2 = g10;
                f21 = uptimeMillis;
                float L8 = (L3 - org.telegram.messenger.g0.L(6.0f)) - (org.telegram.messenger.g0.L(26.0f) * abs2);
                float g11 = org.telegram.ui.Cells.c0.g(org.telegram.messenger.g0.L(13.0f), abs3, org.telegram.messenger.g0.L(f68), f19, f62);
                float min2 = Math.min(1.0f, f67 / 0.35f);
                f23 = f61;
                f58 = 1.0f;
                float C2 = com.google.android.gms.internal.vision.e2.C(min2, 2.0f, f68, min2 * min2);
                float z13 = com.google.android.gms.internal.vision.e2.z((((float) Math.cos(d2)) * z12) + f20, L8, C2, L8);
                f26 = com.google.android.gms.internal.vision.e2.z(f62 - (((abs2 * 0.2f) + 0.62f) * (((float) Math.sin(d2)) * z12)), g11, C2, g11);
                f25 = z13;
                f24 = abs2;
            } else {
                f20 = f64;
                f21 = uptimeMillis;
                f22 = 0.4f;
                f23 = f61;
                float f70 = (f66 - 0.55f) / 0.45f;
                float f71 = f58 - f70;
                float f72 = f58 - (f71 * f71);
                float L9 = (org.telegram.messenger.g0.L(16.0f) * f72) + org.telegram.messenger.g0.L(3.0f) + f16;
                double d10 = (f58 - f72) * f19 * 0.55f * 3.1415927f;
                f24 = abs2;
                float cos = (((float) Math.cos(d10)) * L9) + f20;
                float z14 = org.telegram.ui.Cells.c0.z((float) Math.sin(d10), L9, 0.7f, f62);
                float f73 = f70 * f70;
                float L10 = cos + ((((org.telegram.messenger.g0.L(26.0f) * f24) + (f12 + org.telegram.messenger.g0.L(8.0f))) - cos) * f73);
                float L11 = (((((abs3 - 0.5f) * org.telegram.messenger.g0.L(4.0f)) + (f23 - org.telegram.messenger.g0.L(6.0f))) - z14) * f73) + z14;
                f25 = L10;
                f26 = L11;
            }
            float sin = (float) Math.sin(f66 * 3.141592653589793d);
            i13 = i16;
            int f74 = i0.a.f((abs3 * 0.25f) + 0.12f, i13, -1);
            Paint paint3 = this.d;
            paint3.setColor(f74);
            if (f24 > 0.87f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                e10 = org.telegram.messenger.g0.N(1.1f);
                f27 = 0.6f;
            } else {
                f27 = 0.6f;
                e10 = org.telegram.ui.Cells.c0.e(0.6f, f24, org.telegram.messenger.g0.N(0.5f));
            }
            float f75 = e10;
            if (z11) {
                float sin2 = (((float) Math.sin((f21 * 6.0f) + i15)) * f22) + f27;
                paint3.setAlpha((int) (70.0f * sin * sin2));
                canvas2.drawCircle(f25, f26, 3.2f * f75, paint3);
                paint3.setAlpha((int) (sin * 255.0f * sin2));
                f29 = 0.6f;
                paint3.setStrokeWidth(org.telegram.messenger.g0.N(0.6f));
                f31 = 3.0f;
                float f76 = f75 * 3.0f * sin2;
                i10 = i15;
                float f77 = f26;
                f30 = f20;
                canvas2.drawLine(f25 - f76, f77, f25 + f76, f26, paint3);
                float f78 = f25;
                f28 = f25;
                f32 = f77;
                canvas2 = canvas;
                canvas2.drawLine(f28, f77 - f76, f78, f77 + f76, paint3);
            } else {
                i10 = i15;
                f28 = f25;
                f29 = f27;
                f30 = f20;
                f31 = 3.0f;
                f32 = f26;
            }
            paint3.setAlpha((int) com.google.android.gms.internal.vision.e2.B(f24, 0.55f, 0.45f, sin * 255.0f));
            canvas2.drawCircle(f28, f32, f75, paint3);
            i15 = i10 + 1;
            f64 = f30;
            f61 = f23;
            f60 = f31;
            uptimeMillis = f21;
            f18 = f29;
        }
        float f79 = f64;
        canvas2.drawCircle(f79, f62, f16, this.f1374a);
        float L12 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        Drawable drawable = this.f1378f;
        drawable.setBounds((int) (f79 - L12), (int) (f62 - L12), (int) (f79 + L12), (int) (f62 + L12));
        drawable.draw(canvas2);
        invalidate();
    }
}
