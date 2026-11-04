package ci;

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
import org.telegram.messenger.Utilities;
public final class lc {
    public final int f5513a;
    public final ArrayList f5514b;
    public final Bitmap d;
    public int f5516e;
    public int f5520j;
    public e0.e0 f5522l;
    public final Paint f5523m;
    public long f5524n;
    public long f5525o;
    public final RectF f5515c = new RectF();
    public final Paint f5517f = new Paint(3);
    public final Rect f5518g = new Rect();
    public float h = 1.0f;
    public final float f5519i = 1.0f;
    public boolean f5521k = true;

    public lc(int i3, int i10) {
        this.f5513a = i3;
        this.f5520j = i10;
        this.f5514b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f5514b.add(new kc(this));
        }
        int L = org.telegram.messenger.g0.L(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f10 = L >> 1;
        int i12 = (int) (0.85f * f10);
        path.moveTo(0.0f, f10);
        float f11 = i12;
        path.lineTo(f11, f11);
        path.lineTo(f10, 0.0f);
        float f12 = L - i12;
        path.lineTo(f12, f11);
        float f13 = L;
        path.lineTo(f13, f10);
        path.lineTo(f12, f12);
        path.lineTo(f10, f13);
        path.lineTo(f11, f12);
        path.lineTo(0.0f, f10);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.e0 e0Var = new e0.e0(i10);
            this.f5522l = e0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i13 = 0; i13 < e0Var.f9225b; i13++) {
                e0.e0.d((float[]) e0Var.d, i13, 0.0f, 0.0f, width, height);
            }
            this.f5523m = g0.a.a(createBitmap);
            return;
        }
        this.f5522l = null;
        this.f5523m = null;
    }

    public final void a(Canvas canvas, int i3) {
        b(canvas, i3, 1.0f);
    }

    public final void b(Canvas canvas, int i3, float f10) {
        if (!org.telegram.messenger.lc.e(131072)) {
            return;
        }
        int i10 = this.f5520j;
        ArrayList arrayList = this.f5514b;
        int min = Math.min(i10, arrayList.size());
        float f11 = 2.0f;
        if (this.f5522l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i11 = 0; i11 < min; i11++) {
                kc kcVar = (kc) arrayList.get(i11);
                float f12 = kcVar.f5421i * kcVar.f5418e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                e0.e0 e0Var = this.f5522l;
                float f15 = kcVar.f5415a;
                float f16 = kcVar.f5416b;
                e0.e0.d((float[]) e0Var.f9226c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f5522l.t(i11, i0.a.o(i3, (int) (Utilities.l(kcVar.h * f10) * 255.0f)));
            }
            g0.a.b(canvas, this.f5522l, min, this.f5523m);
        } else {
            if (this.f5516e != i3) {
                this.f5516e = i3;
                this.f5517f.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            }
            int i12 = 0;
            while (i12 < min) {
                kc kcVar2 = (kc) arrayList.get(i12);
                float f17 = kcVar2.h * f10;
                lc lcVar = kcVar2.f5422j;
                Paint paint = lcVar.f5517f;
                Rect rect = lcVar.f5518g;
                Bitmap bitmap2 = lcVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                float f18 = f11;
                rect.set((int) org.telegram.ui.Cells.f1.A((bitmap2.getWidth() / f11) * kcVar2.f5421i, kcVar2.f5418e, f17, kcVar2.f5415a), (int) org.telegram.ui.Cells.f1.A((bitmap2.getHeight() / f11) * kcVar2.f5421i, kcVar2.f5418e, f17, kcVar2.f5416b), (int) com.google.android.recaptcha.internal.a.v((bitmap2.getWidth() / f11) * kcVar2.f5421i, kcVar2.f5418e, f17, kcVar2.f5415a), (int) com.google.android.recaptcha.internal.a.v((bitmap2.getHeight() / f18) * kcVar2.f5421i, kcVar2.f5418e, f17, kcVar2.f5416b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i12++;
                f11 = f18;
            }
        }
        this.f5521k = false;
    }

    public final void c(kc kcVar, long j10, boolean z10) {
        long j11;
        kcVar.f5419f = j10;
        f5.a aVar = Utilities.f21386c;
        kcVar.f5420g = org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.f5519i;
        if (z10) {
            kcVar.f5419f -= Utilities.l(aVar.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f5515c;
        kcVar.f5415a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        kcVar.f5416b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.f5513a == 0) {
            kcVar.f5417c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            kcVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            kcVar.f5417c = rectF.centerX() - kcVar.f5415a;
            kcVar.d = rectF.centerY() - kcVar.f5416b;
            float f10 = kcVar.f5417c;
            float f11 = kcVar.d;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            kcVar.f5417c *= L;
            kcVar.d *= L;
        }
        kcVar.f5421i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        kcVar.f5418e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (org.telegram.messenger.lc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f5525o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i3 = 0;
            while (true) {
                int i10 = this.f5520j;
                ArrayList arrayList = this.f5514b;
                if (i3 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                kc kcVar = (kc) arrayList.get(i3);
                long j10 = kcVar.f5420g;
                if (j10 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - kcVar.f5419f)) / ((float) j10);
                }
                if (f10 > 1.0f) {
                    c(kcVar, currentTimeMillis, this.f5521k);
                    f10 = 0.0f;
                }
                kcVar.f5415a = (kcVar.f5417c * min) + kcVar.f5415a;
                kcVar.f5416b = (kcVar.d * min) + kcVar.f5416b;
                float f11 = 4.0f * f10;
                kcVar.h = f11 - (f10 * f11);
                i3++;
            }
            this.f5525o = currentTimeMillis;
            long j11 = this.f5524n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f5524n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f5513a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.f5514b;
                if (i3 < arrayList.size()) {
                    kc kcVar = (kc) arrayList.get(i3);
                    if (!this.f5515c.contains((int) kcVar.f5415a, (int) kcVar.f5416b)) {
                        c(kcVar, currentTimeMillis, this.f5521k);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i3, int i10, int i11, int i12) {
        this.f5515c.set(i3, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.f5515c.set(rectF);
        e();
    }
}
