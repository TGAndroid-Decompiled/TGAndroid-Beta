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
public final class ec {
    public final int f8756a;
    public final ArrayList f8757b;
    public final Bitmap d;
    public int f8759e;
    public int f8763j;
    public a4.k f8765l;
    public final Paint f8766m;
    public long f8767n;
    public long f8768o;
    public final RectF f8758c = new RectF();
    public final Paint f8760f = new Paint(3);
    public final Rect f8761g = new Rect();
    public float h = 1.0f;
    public final float f8762i = 1.0f;
    public boolean f8764k = true;

    public ec(int i7, int i10) {
        this.f8756a = i7;
        this.f8763j = i10;
        this.f8757b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8757b.add(new dc(this));
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
            this.f8765l = kVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i13 = 0; i13 < kVar.f191b; i13++) {
                a4.k.d((float[]) kVar.d, i13, 0.0f, 0.0f, width, height);
            }
            this.f8766m = ai.d.c(createBitmap);
            return;
        }
        this.f8765l = null;
        this.f8766m = null;
    }

    public final void a(Canvas canvas, int i7) {
        b(canvas, i7, 1.0f);
    }

    public final void b(Canvas canvas, int i7, float f10) {
        if (!qc.e(131072)) {
            return;
        }
        int i10 = this.f8763j;
        ArrayList arrayList = this.f8757b;
        int min = Math.min(i10, arrayList.size());
        float f11 = 2.0f;
        if (this.f8765l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i11 = 0; i11 < min; i11++) {
                dc dcVar = (dc) arrayList.get(i11);
                float f12 = dcVar.f8713i * dcVar.f8710e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                a4.k kVar = this.f8765l;
                float f15 = dcVar.f8707a;
                float f16 = dcVar.f8708b;
                a4.k.d((float[]) kVar.f192c, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f8765l.s(i11, i0.a.o(i7, (int) (Utilities.l(dcVar.h * f10) * 255.0f)));
            }
            ai.d.d(canvas, this.f8765l, min, this.f8766m);
        } else {
            if (this.f8759e != i7) {
                this.f8759e = i7;
                this.f8760f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            int i12 = 0;
            while (i12 < min) {
                dc dcVar2 = (dc) arrayList.get(i12);
                float f17 = dcVar2.h * f10;
                ec ecVar = dcVar2.f8714j;
                Paint paint = ecVar.f8760f;
                Rect rect = ecVar.f8761g;
                Bitmap bitmap2 = ecVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                float f18 = f11;
                rect.set((int) org.telegram.ui.Cells.c0.z((bitmap2.getWidth() / f11) * dcVar2.f8713i, dcVar2.f8710e, f17, dcVar2.f8707a), (int) org.telegram.ui.Cells.c0.z((bitmap2.getHeight() / f11) * dcVar2.f8713i, dcVar2.f8710e, f17, dcVar2.f8708b), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getWidth() / f11) * dcVar2.f8713i, dcVar2.f8710e, f17, dcVar2.f8707a), (int) com.google.android.gms.internal.vision.e2.x((bitmap2.getHeight() / f18) * dcVar2.f8713i, dcVar2.f8710e, f17, dcVar2.f8708b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i12++;
                f11 = f18;
            }
        }
        this.f8764k = false;
    }

    public final void c(dc dcVar, long j3, boolean z10) {
        long j10;
        dcVar.f8711f = j3;
        g5.a aVar = Utilities.f22809c;
        dcVar.f8712g = org.telegram.messenger.g0.W1(aVar.nextFloat(), 500, 2500) * this.f8762i;
        if (z10) {
            dcVar.f8711f -= Utilities.l(aVar.nextFloat()) * ((float) j10);
        }
        RectF rectF = this.f8758c;
        dcVar.f8707a = org.telegram.messenger.g0.T1(rectF.left, rectF.right, aVar.nextFloat());
        dcVar.f8708b = org.telegram.messenger.g0.T1(rectF.top, rectF.bottom, aVar.nextFloat());
        if (this.f8756a == 0) {
            dcVar.f8709c = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.0f, -18.0f, aVar.nextFloat()));
            dcVar.d = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-2.0f, 2.0f, aVar.nextFloat()));
        } else {
            dcVar.f8709c = rectF.centerX() - dcVar.f8707a;
            dcVar.d = rectF.centerY() - dcVar.f8708b;
            float f10 = dcVar.f8709c;
            float f11 = dcVar.d;
            float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(1.0f, 4.0f, aVar.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            dcVar.f8709c *= L;
            dcVar.d *= L;
        }
        dcVar.f8713i = org.telegram.messenger.g0.T1(0.4f, 1.0f, aVar.nextFloat());
        dcVar.f8710e = org.telegram.messenger.g0.T1(0.8f, 1.2f, aVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (qc.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f8768o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i7 = 0;
            while (true) {
                int i10 = this.f8763j;
                ArrayList arrayList = this.f8757b;
                if (i7 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                dc dcVar = (dc) arrayList.get(i7);
                long j3 = dcVar.f8712g;
                if (j3 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - dcVar.f8711f)) / ((float) j3);
                }
                if (f10 > 1.0f) {
                    c(dcVar, currentTimeMillis, this.f8764k);
                    f10 = 0.0f;
                }
                dcVar.f8707a = (dcVar.f8709c * min) + dcVar.f8707a;
                dcVar.f8708b = (dcVar.d * min) + dcVar.f8708b;
                float f11 = 4.0f * f10;
                dcVar.h = f11 - (f10 * f11);
                i7++;
            }
            this.f8768o = currentTimeMillis;
            long j10 = this.f8767n;
            if (j10 == 0 || j10 - currentTimeMillis >= 66) {
                this.f8767n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f8756a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f8757b;
                if (i7 < arrayList.size()) {
                    dc dcVar = (dc) arrayList.get(i7);
                    if (!this.f8758c.contains((int) dcVar.f8707a, (int) dcVar.f8708b)) {
                        c(dcVar, currentTimeMillis, this.f8764k);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f8758c.set(i7, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.f8758c.set(rectF);
        e();
    }
}
