package bi;

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
public final class ud {
    public final int f4842a;
    public final ArrayList f4843b;
    public final Bitmap d;
    public int f4845e;
    public int f4849j;
    public a4.k f4851l;
    public final Paint f4852m;
    public long f4853n;
    public long f4854o;
    public final RectF f4844c = new RectF();
    public final Paint f4846f = new Paint(3);
    public final Rect f4847g = new Rect();
    public float h = 1.0f;
    public final float f4848i = 1.0f;
    public boolean f4850k = true;

    public ud(int i7, int i10) {
        this.f4842a = i7;
        this.f4849j = i10;
        this.f4843b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4843b.add(new td(this));
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
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            a4.k kVar = new a4.k(i10);
            this.f4851l = kVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i13 = 0; i13 < kVar.f191b; i13++) {
                a4.k.d((float[]) kVar.d, i13, 0.0f, 0.0f, width, height);
            }
            this.f4852m = g0.a.a(createBitmap);
            return;
        }
        this.f4851l = null;
        this.f4852m = null;
    }

    public final void a(Canvas canvas, int i7) {
        b(canvas, i7, 1.0f);
    }

    public final void b(Canvas canvas, int i7, float f10) {
        if (!org.telegram.messenger.sc.e(131072)) {
            return;
        }
        int i10 = this.f4849j;
        ArrayList arrayList = this.f4843b;
        int min = Math.min(i10, arrayList.size());
        float f11 = 2.0f;
        if (this.f4851l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i11 = 0; i11 < min; i11++) {
                td tdVar = (td) arrayList.get(i11);
                float f12 = tdVar.f4776i * tdVar.f4773e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                a4.k kVar = this.f4851l;
                float f15 = tdVar.f4770a;
                float f16 = tdVar.f4771b;
                a4.k.d((float[]) kVar.f192c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f4851l.t(i11, i0.a.o(i7, (int) (Utilities.l(tdVar.h * f10) * 255.0f)));
            }
            g0.a.b(canvas, this.f4851l, min, this.f4852m);
        } else {
            if (this.f4845e != i7) {
                this.f4845e = i7;
                this.f4846f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            int i12 = 0;
            while (i12 < min) {
                td tdVar2 = (td) arrayList.get(i12);
                float f17 = tdVar2.h * f10;
                ud udVar = tdVar2.f4777j;
                Paint paint = udVar.f4846f;
                Rect rect = udVar.f4847g;
                Bitmap bitmap2 = udVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                float f18 = f11;
                rect.set((int) org.telegram.ui.Cells.f1.x((bitmap2.getWidth() / f11) * tdVar2.f4776i, tdVar2.f4773e, f17, tdVar2.f4770a), (int) org.telegram.ui.Cells.f1.x((bitmap2.getHeight() / f11) * tdVar2.f4776i, tdVar2.f4773e, f17, tdVar2.f4771b), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getWidth() / f11) * tdVar2.f4776i, tdVar2.f4773e, f17, tdVar2.f4770a), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getHeight() / f18) * tdVar2.f4776i, tdVar2.f4773e, f17, tdVar2.f4771b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i12++;
                f11 = f18;
            }
        }
        this.f4850k = false;
    }

    public final void c(td tdVar, long j3, boolean z9) {
        long j10;
        tdVar.f4774f = j3;
        g5.a aVar = Utilities.f21340c;
        tdVar.f4775g = org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.f4848i;
        if (z9) {
            tdVar.f4774f -= Utilities.l(aVar.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f4844c;
        tdVar.f4770a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        tdVar.f4771b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.f4842a == 0) {
            tdVar.f4772c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            tdVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            tdVar.f4772c = rectF.centerX() - tdVar.f4770a;
            tdVar.d = rectF.centerY() - tdVar.f4771b;
            float f10 = tdVar.f4772c;
            float f11 = tdVar.d;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            tdVar.f4772c *= L;
            tdVar.d *= L;
        }
        tdVar.f4776i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        tdVar.f4773e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (org.telegram.messenger.sc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f4854o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i7 = 0;
            while (true) {
                int i10 = this.f4849j;
                ArrayList arrayList = this.f4843b;
                if (i7 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                td tdVar = (td) arrayList.get(i7);
                long j3 = tdVar.f4775g;
                if (j3 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - tdVar.f4774f)) / ((float) j3);
                }
                if (f10 > 1.0f) {
                    c(tdVar, currentTimeMillis, this.f4850k);
                    f10 = 0.0f;
                }
                tdVar.f4770a = (tdVar.f4772c * min) + tdVar.f4770a;
                tdVar.f4771b = (tdVar.d * min) + tdVar.f4771b;
                float f11 = 4.0f * f10;
                tdVar.h = f11 - (f10 * f11);
                i7++;
            }
            this.f4854o = currentTimeMillis;
            long j10 = this.f4853n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f4853n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f4842a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f4843b;
                if (i7 < arrayList.size()) {
                    td tdVar = (td) arrayList.get(i7);
                    if (!this.f4844c.contains((int) tdVar.f4770a, (int) tdVar.f4771b)) {
                        c(tdVar, currentTimeMillis, this.f4850k);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f4844c.set(i7, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.f4844c.set(rectF);
        e();
    }
}
