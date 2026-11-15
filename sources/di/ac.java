package di;

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
import org.telegram.messenger.qc;
public final class ac {
    public final int f8217a;
    public final ArrayList f8218b;
    public final Bitmap d;
    public int f8220e;
    public int f8224j;
    public a4.k f8226l;
    public final Paint f8227m;
    public long f8228n;
    public long f8229o;
    public final RectF f8219c = new RectF();
    public final Paint f8221f = new Paint(3);
    public final Rect f8222g = new Rect();
    public float h = 1.0f;
    public final float f8223i = 1.0f;
    public boolean f8225k = true;

    public ac(int i7, int i10) {
        this.f8217a = i7;
        this.f8224j = i10;
        this.f8218b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8218b.add(new zb(this));
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
        paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            a4.k kVar = new a4.k(i10);
            this.f8226l = kVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i13 = 0; i13 < kVar.f191b; i13++) {
                a4.k.d((float[]) kVar.d, i13, 0.0f, 0.0f, width, height);
            }
            this.f8227m = ai.d.b(createBitmap);
            return;
        }
        this.f8226l = null;
        this.f8227m = null;
    }

    public final void a(Canvas canvas, int i7) {
        b(canvas, i7, 1.0f);
    }

    public final void b(Canvas canvas, int i7, float f10) {
        if (!qc.e(131072)) {
            return;
        }
        int i10 = this.f8224j;
        ArrayList arrayList = this.f8218b;
        int min = Math.min(i10, arrayList.size());
        float f11 = 2.0f;
        if (this.f8226l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i11 = 0; i11 < min; i11++) {
                zb zbVar = (zb) arrayList.get(i11);
                float f12 = zbVar.f9860i * zbVar.f9857e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                a4.k kVar = this.f8226l;
                float f15 = zbVar.f9854a;
                float f16 = zbVar.f9855b;
                a4.k.d((float[]) kVar.f192c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f8226l.s(i11, i0.a.o(i7, (int) (Utilities.l(zbVar.h * f10) * 255.0f)));
            }
            ai.d.c(canvas, this.f8226l, min, this.f8227m);
        } else {
            if (this.f8220e != i7) {
                this.f8220e = i7;
                this.f8221f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            int i12 = 0;
            while (i12 < min) {
                zb zbVar2 = (zb) arrayList.get(i12);
                float f17 = zbVar2.h * f10;
                ac acVar = zbVar2.f9861j;
                Paint paint = acVar.f8221f;
                Rect rect = acVar.f8222g;
                Bitmap bitmap2 = acVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                float f18 = f11;
                rect.set((int) org.telegram.ui.Cells.y0.x((bitmap2.getWidth() / f11) * zbVar2.f9860i, zbVar2.f9857e, f17, zbVar2.f9854a), (int) org.telegram.ui.Cells.y0.x((bitmap2.getHeight() / f11) * zbVar2.f9860i, zbVar2.f9857e, f17, zbVar2.f9855b), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f11) * zbVar2.f9860i, zbVar2.f9857e, f17, zbVar2.f9854a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / f18) * zbVar2.f9860i, zbVar2.f9857e, f17, zbVar2.f9855b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i12++;
                f11 = f18;
            }
        }
        this.f8225k = false;
    }

    public final void c(zb zbVar, long j3, boolean z10) {
        long j10;
        zbVar.f9858f = j3;
        g5.a aVar = Utilities.f22415c;
        zbVar.f9859g = org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.f8223i;
        if (z10) {
            zbVar.f9858f -= Utilities.l(aVar.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f8219c;
        zbVar.f9854a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        zbVar.f9855b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.f8217a == 0) {
            zbVar.f9856c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            zbVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            zbVar.f9856c = rectF.centerX() - zbVar.f9854a;
            zbVar.d = rectF.centerY() - zbVar.f9855b;
            float f10 = zbVar.f9856c;
            float f11 = zbVar.d;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            zbVar.f9856c *= L;
            zbVar.d *= L;
        }
        zbVar.f9860i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        zbVar.f9857e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (qc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f8229o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i7 = 0;
            while (true) {
                int i10 = this.f8224j;
                ArrayList arrayList = this.f8218b;
                if (i7 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                zb zbVar = (zb) arrayList.get(i7);
                long j3 = zbVar.f9859g;
                if (j3 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - zbVar.f9858f)) / ((float) j3);
                }
                if (f10 > 1.0f) {
                    c(zbVar, currentTimeMillis, this.f8225k);
                    f10 = 0.0f;
                }
                zbVar.f9854a = (zbVar.f9856c * min) + zbVar.f9854a;
                zbVar.f9855b = (zbVar.d * min) + zbVar.f9855b;
                float f11 = 4.0f * f10;
                zbVar.h = f11 - (f10 * f11);
                i7++;
            }
            this.f8229o = currentTimeMillis;
            long j10 = this.f8228n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f8228n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f8217a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f8218b;
                if (i7 < arrayList.size()) {
                    zb zbVar = (zb) arrayList.get(i7);
                    if (!this.f8219c.contains((int) zbVar.f9854a, (int) zbVar.f9855b)) {
                        c(zbVar, currentTimeMillis, this.f8225k);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f8219c.set(i7, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.f8219c.set(rectF);
        e();
    }
}
