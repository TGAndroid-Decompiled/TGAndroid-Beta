package defpackage;

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
public final class yxa {
    public final byte a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public e0c l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public yxa(int i, int i2) {
        this.a = i;
        this.j = i2;
        this.b = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.b.add(new xxa(this));
        }
        int L = gm.L(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f = L >> 1;
        int i4 = (int) (0.85f * f);
        path.moveTo(0.0f, f);
        float f2 = i4;
        path.lineTo(f2, f2);
        path.lineTo(f, 0.0f);
        float f3 = L - i4;
        path.lineTo(f3, f2);
        float f4 = L;
        path.lineTo(f4, f);
        path.lineTo(f3, f3);
        path.lineTo(f, f4);
        path.lineTo(f2, f3);
        path.lineTo(0.0f, f);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(cmb.p1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0c e0cVar = new e0c(i2);
            this.l = e0cVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i5 = 0; i5 < e0cVar.b; i5++) {
                e0c.d((float[]) e0cVar.d, i5, 0.0f, 0.0f, width, height);
            }
            this.m = s4.a(createBitmap);
            return;
        }
        this.l = null;
        this.m = null;
    }

    public final void a(Canvas canvas, int i) {
        b(canvas, i, 1.0f);
    }

    public final void b(Canvas canvas, int i, float f) {
        if (!e86.e(131072)) {
            return;
        }
        int i2 = this.j;
        ArrayList arrayList = this.b;
        int min = Math.min(i2, arrayList.size());
        float f2 = 2.0f;
        if (this.l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i3 = 0; i3 < min; i3++) {
                xxa xxaVar = (xxa) arrayList.get(i3);
                float f3 = xxaVar.i * xxaVar.e * f;
                float f4 = (width / 2.0f) * f3;
                float f5 = (height / 2.0f) * f3;
                e0c e0cVar = this.l;
                float f6 = xxaVar.a;
                float f7 = xxaVar.b;
                e0c.d((float[]) e0cVar.c, i3, f6 - f4, f7 - f5, f6 + f4, f7 + f5);
                this.l.s(i3, on2.p(i, (int) (Utilities.l(xxaVar.h * f) * 255.0f)));
            }
            s4.b(canvas, this.l, min, this.m);
        } else {
            if (this.e != i) {
                this.e = i;
                this.f.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            int i4 = 0;
            while (i4 < min) {
                xxa xxaVar2 = (xxa) arrayList.get(i4);
                float f8 = xxaVar2.h * f;
                yxa yxaVar = xxaVar2.j;
                Paint paint = yxaVar.f;
                Rect rect = yxaVar.g;
                Bitmap bitmap2 = yxaVar.d;
                paint.setAlpha((int) (f8 * 255.0f));
                float f9 = f2;
                rect.set((int) aq1.v((bitmap2.getWidth() / f2) * xxaVar2.i, xxaVar2.e, f8, xxaVar2.a), (int) aq1.v((bitmap2.getHeight() / f2) * xxaVar2.i, xxaVar2.e, f8, xxaVar2.b), (int) b10.w((bitmap2.getWidth() / f2) * xxaVar2.i, xxaVar2.e, f8, xxaVar2.a), (int) b10.w((bitmap2.getHeight() / f9) * xxaVar2.i, xxaVar2.e, f8, xxaVar2.b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i4++;
                f2 = f9;
            }
        }
        this.k = false;
    }

    public final void c(xxa xxaVar, long j, boolean z) {
        long j2;
        xxaVar.f = j;
        z0d z0dVar = Utilities.c;
        xxaVar.g = gm.U1(z0dVar.nextFloat(), 500, 2500) * this.i;
        if (z) {
            xxaVar.f -= Utilities.l(z0dVar.nextFloat()) * ((float) j2);
        }
        RectF rectF = this.c;
        xxaVar.a = gm.R1(rectF.left, rectF.right, z0dVar.nextFloat());
        xxaVar.b = gm.R1(rectF.top, rectF.bottom, z0dVar.nextFloat());
        if (this.a == 0) {
            xxaVar.c = gm.L(gm.R1(-7.0f, -18.0f, z0dVar.nextFloat()));
            xxaVar.d = gm.L(gm.R1(-2.0f, 2.0f, z0dVar.nextFloat()));
        } else {
            xxaVar.c = rectF.centerX() - xxaVar.a;
            xxaVar.d = rectF.centerY() - xxaVar.b;
            float f = xxaVar.c;
            float f2 = xxaVar.d;
            float L = gm.L(gm.R1(1.0f, 4.0f, z0dVar.nextFloat())) / ((float) Math.sqrt((f2 * f2) + (f * f)));
            xxaVar.c *= L;
            xxaVar.d *= L;
        }
        xxaVar.i = gm.R1(0.4f, 1.0f, z0dVar.nextFloat());
        xxaVar.e = gm.R1(0.8f, 1.2f, z0dVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f;
        if (e86.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i = 0;
            while (true) {
                int i2 = this.j;
                ArrayList arrayList = this.b;
                if (i >= Math.min(i2, arrayList.size())) {
                    break;
                }
                xxa xxaVar = (xxa) arrayList.get(i);
                long j = xxaVar.g;
                if (j <= 0) {
                    f = 2.0f;
                } else {
                    f = ((float) (currentTimeMillis - xxaVar.f)) / ((float) j);
                }
                if (f > 1.0f) {
                    c(xxaVar, currentTimeMillis, this.k);
                    f = 0.0f;
                }
                xxaVar.a = (xxaVar.c * min) + xxaVar.a;
                xxaVar.b = (xxaVar.d * min) + xxaVar.b;
                float f2 = 4.0f * f;
                xxaVar.h = f2 - (f * f2);
                i++;
            }
            this.o = currentTimeMillis;
            long j2 = this.n;
            if (j2 == 0 || j2 - currentTimeMillis >= 66) {
                this.n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i < arrayList.size()) {
                    xxa xxaVar = (xxa) arrayList.get(i);
                    if (!this.c.contains((int) xxaVar.a, (int) xxaVar.b)) {
                        c(xxaVar, currentTimeMillis, this.k);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        e();
    }

    public final void g(RectF rectF) {
        this.c.set(rectF);
        e();
    }
}
