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
    public final int f4843a;
    public final ArrayList f4844b;
    public final Bitmap d;
    public int f4846e;
    public int f4850j;
    public a4.k f4852l;
    public final Paint f4853m;
    public long f4854n;
    public long f4855o;
    public final RectF f4845c = new RectF();
    public final Paint f4847f = new Paint(3);
    public final Rect f4848g = new Rect();
    public float h = 1.0f;
    public final float f4849i = 1.0f;
    public boolean f4851k = true;

    public ud(int i7, int i10) {
        this.f4843a = i7;
        this.f4850j = i10;
        this.f4844b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4844b.add(new td(this));
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
            a4.k kVar = new a4.k(i10);
            this.f4852l = kVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i13 = 0; i13 < kVar.f191b; i13++) {
                a4.k.d((float[]) kVar.d, i13, 0.0f, 0.0f, width, height);
            }
            this.f4853m = g0.a.a(createBitmap);
            return;
        }
        this.f4852l = null;
        this.f4853m = null;
    }

    public final void a(Canvas canvas, int i7) {
        b(canvas, i7, 1.0f);
    }

    public final void b(Canvas canvas, int i7, float f10) {
        if (!org.telegram.messenger.sc.e(131072)) {
            return;
        }
        int i10 = this.f4850j;
        ArrayList arrayList = this.f4844b;
        int min = Math.min(i10, arrayList.size());
        float f11 = 2.0f;
        if (this.f4852l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i11 = 0; i11 < min; i11++) {
                td tdVar = (td) arrayList.get(i11);
                float f12 = tdVar.f4777i * tdVar.f4774e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                a4.k kVar = this.f4852l;
                float f15 = tdVar.f4771a;
                float f16 = tdVar.f4772b;
                a4.k.d((float[]) kVar.f192c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f4852l.t(i11, i0.a.o(i7, (int) (Utilities.l(tdVar.h * f10) * 255.0f)));
            }
            g0.a.b(canvas, this.f4852l, min, this.f4853m);
        } else {
            if (this.f4846e != i7) {
                this.f4846e = i7;
                this.f4847f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            int i12 = 0;
            while (i12 < min) {
                td tdVar2 = (td) arrayList.get(i12);
                float f17 = tdVar2.h * f10;
                ud udVar = tdVar2.f4778j;
                Paint paint = udVar.f4847f;
                Rect rect = udVar.f4848g;
                Bitmap bitmap2 = udVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                float f18 = f11;
                rect.set((int) org.telegram.ui.Cells.f1.x((bitmap2.getWidth() / f11) * tdVar2.f4777i, tdVar2.f4774e, f17, tdVar2.f4771a), (int) org.telegram.ui.Cells.f1.x((bitmap2.getHeight() / f11) * tdVar2.f4777i, tdVar2.f4774e, f17, tdVar2.f4772b), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getWidth() / f11) * tdVar2.f4777i, tdVar2.f4774e, f17, tdVar2.f4771a), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getHeight() / f18) * tdVar2.f4777i, tdVar2.f4774e, f17, tdVar2.f4772b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i12++;
                f11 = f18;
            }
        }
        this.f4851k = false;
    }

    public final void c(td tdVar, long j3, boolean z9) {
        long j10;
        tdVar.f4775f = j3;
        g5.a aVar = Utilities.f21335c;
        tdVar.f4776g = org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.f4849i;
        if (z9) {
            tdVar.f4775f -= Utilities.l(aVar.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f4845c;
        tdVar.f4771a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        tdVar.f4772b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.f4843a == 0) {
            tdVar.f4773c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            tdVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            tdVar.f4773c = rectF.centerX() - tdVar.f4771a;
            tdVar.d = rectF.centerY() - tdVar.f4772b;
            float f10 = tdVar.f4773c;
            float f11 = tdVar.d;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            tdVar.f4773c *= L;
            tdVar.d *= L;
        }
        tdVar.f4777i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        tdVar.f4774e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (org.telegram.messenger.sc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f4855o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i7 = 0;
            while (true) {
                int i10 = this.f4850j;
                ArrayList arrayList = this.f4844b;
                if (i7 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                td tdVar = (td) arrayList.get(i7);
                long j3 = tdVar.f4776g;
                if (j3 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - tdVar.f4775f)) / ((float) j3);
                }
                if (f10 > 1.0f) {
                    c(tdVar, currentTimeMillis, this.f4851k);
                    f10 = 0.0f;
                }
                tdVar.f4771a = (tdVar.f4773c * min) + tdVar.f4771a;
                tdVar.f4772b = (tdVar.d * min) + tdVar.f4772b;
                float f11 = 4.0f * f10;
                tdVar.h = f11 - (f10 * f11);
                i7++;
            }
            this.f4855o = currentTimeMillis;
            long j10 = this.f4854n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f4854n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f4843a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f4844b;
                if (i7 < arrayList.size()) {
                    td tdVar = (td) arrayList.get(i7);
                    if (!this.f4845c.contains((int) tdVar.f4771a, (int) tdVar.f4772b)) {
                        c(tdVar, currentTimeMillis, this.f4851k);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f4845c.set(i7, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.f4845c.set(rectF);
        e();
    }
}
