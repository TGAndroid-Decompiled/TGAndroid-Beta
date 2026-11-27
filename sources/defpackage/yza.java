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
public final class yza {
    public final byte a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public d2c l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public yza(int i, int i2) {
        this.a = i;
        this.j = i2;
        this.b = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.b.add(new xza(this));
        }
        int L = hl.L(10.0f);
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
        paint.setColor(aob.p1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            d2c d2cVar = new d2c(i2);
            this.l = d2cVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i5 = 0; i5 < d2cVar.b; i5++) {
                d2c.d((float[]) d2cVar.d, i5, 0.0f, 0.0f, width, height);
            }
            this.m = t4.a(createBitmap);
            return;
        }
        this.l = null;
        this.m = null;
    }

    public final void a(Canvas canvas, int i) {
        b(canvas, i, 1.0f);
    }

    public final void b(Canvas canvas, int i, float f) {
        if (!i86.e(131072)) {
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
                xza xzaVar = (xza) arrayList.get(i3);
                float f3 = xzaVar.i * xzaVar.e * f;
                float f4 = (width / 2.0f) * f3;
                float f5 = (height / 2.0f) * f3;
                d2c d2cVar = this.l;
                float f6 = xzaVar.a;
                float f7 = xzaVar.b;
                d2c.d((float[]) d2cVar.c, i3, f6 - f4, f7 - f5, f6 + f4, f7 + f5);
                this.l.s(i3, vm2.o(i, (int) (Utilities.l(xzaVar.h * f) * 255.0f)));
            }
            t4.b(canvas, this.l, min, this.m);
        } else {
            if (this.e != i) {
                this.e = i;
                this.f.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            int i4 = 0;
            while (i4 < min) {
                xza xzaVar2 = (xza) arrayList.get(i4);
                float f8 = xzaVar2.h * f;
                yza yzaVar = xzaVar2.j;
                Paint paint = yzaVar.f;
                Rect rect = yzaVar.g;
                Bitmap bitmap2 = yzaVar.d;
                paint.setAlpha((int) (f8 * 255.0f));
                float f9 = f2;
                rect.set((int) bp1.v((bitmap2.getWidth() / f2) * xzaVar2.i, xzaVar2.e, f8, xzaVar2.a), (int) bp1.v((bitmap2.getHeight() / f2) * xzaVar2.i, xzaVar2.e, f8, xzaVar2.b), (int) c00.x((bitmap2.getWidth() / f2) * xzaVar2.i, xzaVar2.e, f8, xzaVar2.a), (int) c00.x((bitmap2.getHeight() / f9) * xzaVar2.i, xzaVar2.e, f8, xzaVar2.b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i4++;
                f2 = f9;
            }
        }
        this.k = false;
    }

    public final void c(xza xzaVar, long j, boolean z) {
        long j2;
        xzaVar.f = j;
        o3d o3dVar = Utilities.c;
        xzaVar.g = hl.U1(o3dVar.nextFloat(), 500, 2500) * this.i;
        if (z) {
            xzaVar.f -= Utilities.l(o3dVar.nextFloat()) * ((float) j2);
        }
        RectF rectF = this.c;
        xzaVar.a = hl.R1(rectF.left, rectF.right, o3dVar.nextFloat());
        xzaVar.b = hl.R1(rectF.top, rectF.bottom, o3dVar.nextFloat());
        if (this.a == 0) {
            xzaVar.c = hl.L(hl.R1(-7.0f, -18.0f, o3dVar.nextFloat()));
            xzaVar.d = hl.L(hl.R1(-2.0f, 2.0f, o3dVar.nextFloat()));
        } else {
            xzaVar.c = rectF.centerX() - xzaVar.a;
            xzaVar.d = rectF.centerY() - xzaVar.b;
            float f = xzaVar.c;
            float f2 = xzaVar.d;
            float L = hl.L(hl.R1(1.0f, 4.0f, o3dVar.nextFloat())) / ((float) Math.sqrt((f2 * f2) + (f * f)));
            xzaVar.c *= L;
            xzaVar.d *= L;
        }
        xzaVar.i = hl.R1(0.4f, 1.0f, o3dVar.nextFloat());
        xzaVar.e = hl.R1(0.8f, 1.2f, o3dVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f;
        if (i86.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i = 0;
            while (true) {
                int i2 = this.j;
                ArrayList arrayList = this.b;
                if (i >= Math.min(i2, arrayList.size())) {
                    break;
                }
                xza xzaVar = (xza) arrayList.get(i);
                long j = xzaVar.g;
                if (j <= 0) {
                    f = 2.0f;
                } else {
                    f = ((float) (currentTimeMillis - xzaVar.f)) / ((float) j);
                }
                if (f > 1.0f) {
                    c(xzaVar, currentTimeMillis, this.k);
                    f = 0.0f;
                }
                xzaVar.a = (xzaVar.c * min) + xzaVar.a;
                xzaVar.b = (xzaVar.d * min) + xzaVar.b;
                float f2 = 4.0f * f;
                xzaVar.h = f2 - (f * f2);
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
                    xza xzaVar = (xza) arrayList.get(i);
                    if (!this.c.contains((int) xzaVar.a, (int) xzaVar.b)) {
                        c(xzaVar, currentTimeMillis, this.k);
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
