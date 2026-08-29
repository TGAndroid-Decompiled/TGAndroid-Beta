package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class va {
    public final int f12986a;
    public final ArrayList f12987b;
    public final Bitmap d;
    public int f12989e;
    public int f12993j;
    public e0.i0 f12995l;
    public final Paint f12996m;
    public long f12997n;
    public long f12998o;
    public final RectF f12988c = new RectF();
    public final Paint f12990f = new Paint(3);
    public final Rect f12991g = new Rect();
    public float h = 1.0f;
    public final float f12992i = 1.0f;
    public boolean f12994k = true;

    public va(int i10, int i11) {
        this.f12986a = i10;
        this.f12993j = i11;
        this.f12987b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12987b.add(new ua(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f9 = dp >> 1;
        int i13 = (int) (0.85f * f9);
        path.moveTo(0.0f, f9);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f9, 0.0f);
        float f11 = dp - i13;
        path.lineTo(f11, f10);
        float f12 = dp;
        path.lineTo(f12, f9);
        path.lineTo(f11, f11);
        path.lineTo(f9, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f9);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.i0 i0Var = new e0.i0(i11);
            this.f12995l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < i0Var.f5677a; i14++) {
                e0.i0.a((float[]) i0Var.f5679c, i14, 0.0f, 0.0f, width, height);
            }
            this.f12996m = g0.a.a(createBitmap);
            return;
        }
        this.f12995l = null;
        this.f12996m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f9) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f12993j;
        ArrayList arrayList = this.f12987b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f12995l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                ua uaVar = (ua) arrayList.get(i12);
                float f11 = uaVar.f12934i * uaVar.f12931e * f9;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.i0 i0Var = this.f12995l;
                float f14 = uaVar.f12928a;
                float f15 = uaVar.f12929b;
                e0.i0.a((float[]) i0Var.f5678b, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f12995l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(uaVar.h * f9) * 255.0f)));
            }
            g0.a.b(canvas, this.f12995l, min, this.f12996m);
        } else {
            if (this.f12989e != i10) {
                this.f12989e = i10;
                this.f12990f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                ua uaVar2 = (ua) arrayList.get(i13);
                float f16 = uaVar2.h * f9;
                va vaVar = uaVar2.f12935j;
                Paint paint = vaVar.f12990f;
                Rect rect = vaVar.f12991g;
                Bitmap bitmap2 = vaVar.d;
                paint.setAlpha((int) (f16 * 255.0f));
                rect.set((int) (uaVar2.f12928a - ((((bitmap2.getWidth() / f10) * uaVar2.f12934i) * uaVar2.f12931e) * f16)), (int) (uaVar2.f12929b - ((((bitmap2.getHeight() / f10) * uaVar2.f12934i) * uaVar2.f12931e) * f16)), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getWidth() / f10) * uaVar2.f12934i, uaVar2.f12931e, f16, uaVar2.f12928a), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getHeight() / 2.0f) * uaVar2.f12934i, uaVar2.f12931e, f16, uaVar2.f12929b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = 2.0f;
            }
        }
        this.f12994k = false;
    }

    public final void c(ua uaVar, long j10, boolean z10) {
        long j11;
        uaVar.f12932f = j10;
        uaVar.f12933g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f12992i;
        if (z10) {
            uaVar.f12932f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f12988c;
        uaVar.f12928a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        uaVar.f12929b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f12986a == 0) {
            uaVar.f12930c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            uaVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            uaVar.f12930c = rectF.centerX() - uaVar.f12928a;
            uaVar.d = rectF.centerY() - uaVar.f12929b;
            float f9 = uaVar.f12930c;
            float f10 = uaVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f9 * f9)));
            uaVar.f12930c *= dp;
            uaVar.d *= dp;
        }
        uaVar.f12934i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        uaVar.f12931e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f9;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f12998o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f12993j;
                ArrayList arrayList = this.f12987b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                ua uaVar = (ua) arrayList.get(i10);
                long j10 = uaVar.f12933g;
                if (j10 <= 0) {
                    f9 = 2.0f;
                } else {
                    f9 = ((float) (currentTimeMillis - uaVar.f12932f)) / ((float) j10);
                }
                if (f9 > 1.0f) {
                    c(uaVar, currentTimeMillis, this.f12994k);
                    f9 = 0.0f;
                }
                uaVar.f12928a = (uaVar.f12930c * min) + uaVar.f12928a;
                uaVar.f12929b = (uaVar.d * min) + uaVar.f12929b;
                float f10 = 4.0f * f9;
                uaVar.h = f10 - (f9 * f10);
                i10++;
            }
            this.f12998o = currentTimeMillis;
            long j11 = this.f12997n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f12997n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f12986a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f12987b;
                if (i10 < arrayList.size()) {
                    ua uaVar = (ua) arrayList.get(i10);
                    if (!this.f12988c.contains((int) uaVar.f12928a, (int) uaVar.f12929b)) {
                        c(uaVar, currentTimeMillis, this.f12994k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f12988c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f12988c.set(rectF);
        e();
    }
}
