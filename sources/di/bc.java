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
public final class bc {
    public final int f8266a;
    public final ArrayList f8267b;
    public final Bitmap d;
    public int f8269e;
    public int f8273j;
    public a4.k f8275l;
    public final Paint f8276m;
    public long f8277n;
    public long f8278o;
    public final RectF f8268c = new RectF();
    public final Paint f8270f = new Paint(3);
    public final Rect f8271g = new Rect();
    public float h = 1.0f;
    public final float f8272i = 1.0f;
    public boolean f8274k = true;

    public bc(int i7, int i10) {
        this.f8266a = i7;
        this.f8273j = i10;
        this.f8267b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8267b.add(new ac(this));
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
            this.f8275l = kVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i13 = 0; i13 < kVar.f191b; i13++) {
                a4.k.d((float[]) kVar.d, i13, 0.0f, 0.0f, width, height);
            }
            this.f8276m = ai.d.b(createBitmap);
            return;
        }
        this.f8275l = null;
        this.f8276m = null;
    }

    public final void a(Canvas canvas, int i7) {
        b(canvas, i7, 1.0f);
    }

    public final void b(Canvas canvas, int i7, float f10) {
        if (!qc.e(131072)) {
            return;
        }
        int i10 = this.f8273j;
        ArrayList arrayList = this.f8267b;
        int min = Math.min(i10, arrayList.size());
        float f11 = 2.0f;
        if (this.f8275l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i11 = 0; i11 < min; i11++) {
                ac acVar = (ac) arrayList.get(i11);
                float f12 = acVar.f8225i * acVar.f8222e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                a4.k kVar = this.f8275l;
                float f15 = acVar.f8219a;
                float f16 = acVar.f8220b;
                a4.k.d((float[]) kVar.f192c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f8275l.s(i11, i0.a.o(i7, (int) (Utilities.l(acVar.h * f10) * 255.0f)));
            }
            ai.d.c(canvas, this.f8275l, min, this.f8276m);
        } else {
            if (this.f8269e != i7) {
                this.f8269e = i7;
                this.f8270f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            int i12 = 0;
            while (i12 < min) {
                ac acVar2 = (ac) arrayList.get(i12);
                float f17 = acVar2.h * f10;
                bc bcVar = acVar2.f8226j;
                Paint paint = bcVar.f8270f;
                Rect rect = bcVar.f8271g;
                Bitmap bitmap2 = bcVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                float f18 = f11;
                rect.set((int) org.telegram.ui.Cells.y0.x((bitmap2.getWidth() / f11) * acVar2.f8225i, acVar2.f8222e, f17, acVar2.f8219a), (int) org.telegram.ui.Cells.y0.x((bitmap2.getHeight() / f11) * acVar2.f8225i, acVar2.f8222e, f17, acVar2.f8220b), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f11) * acVar2.f8225i, acVar2.f8222e, f17, acVar2.f8219a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / f18) * acVar2.f8225i, acVar2.f8222e, f17, acVar2.f8220b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i12++;
                f11 = f18;
            }
        }
        this.f8274k = false;
    }

    public final void c(ac acVar, long j3, boolean z10) {
        long j10;
        acVar.f8223f = j3;
        g5.a aVar = Utilities.f22415c;
        acVar.f8224g = org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.f8272i;
        if (z10) {
            acVar.f8223f -= Utilities.l(aVar.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f8268c;
        acVar.f8219a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        acVar.f8220b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.f8266a == 0) {
            acVar.f8221c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            acVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            acVar.f8221c = rectF.centerX() - acVar.f8219a;
            acVar.d = rectF.centerY() - acVar.f8220b;
            float f10 = acVar.f8221c;
            float f11 = acVar.d;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            acVar.f8221c *= L;
            acVar.d *= L;
        }
        acVar.f8225i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        acVar.f8222e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (qc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f8278o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i7 = 0;
            while (true) {
                int i10 = this.f8273j;
                ArrayList arrayList = this.f8267b;
                if (i7 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                ac acVar = (ac) arrayList.get(i7);
                long j3 = acVar.f8224g;
                if (j3 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - acVar.f8223f)) / ((float) j3);
                }
                if (f10 > 1.0f) {
                    c(acVar, currentTimeMillis, this.f8274k);
                    f10 = 0.0f;
                }
                acVar.f8219a = (acVar.f8221c * min) + acVar.f8219a;
                acVar.f8220b = (acVar.d * min) + acVar.f8220b;
                float f11 = 4.0f * f10;
                acVar.h = f11 - (f10 * f11);
                i7++;
            }
            this.f8278o = currentTimeMillis;
            long j10 = this.f8277n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f8277n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f8266a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f8267b;
                if (i7 < arrayList.size()) {
                    ac acVar = (ac) arrayList.get(i7);
                    if (!this.f8268c.contains((int) acVar.f8219a, (int) acVar.f8220b)) {
                        c(acVar, currentTimeMillis, this.f8274k);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f8268c.set(i7, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.f8268c.set(rectF);
        e();
    }
}
