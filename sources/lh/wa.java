package lh;

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
public final class wa {
    public final int f13296a;
    public final ArrayList f13297b;
    public final Bitmap d;
    public int e;
    public int f13302j;
    public a4.k f13304l;
    public final Paint f13305m;
    public long f13306n;
    public long f13307o;
    public final RectF f13298c = new RectF();
    public final Paint f13299f = new Paint(3);
    public final Rect f13300g = new Rect();
    public float h = 1.0f;
    public final float f13301i = 1.0f;
    public boolean f13303k = true;

    public wa(int i10, int i11) {
        this.f13296a = i10;
        this.f13302j = i11;
        this.f13297b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f13297b.add(new va(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f10 = dp >> 1;
        int i13 = (int) (0.85f * f10);
        path.moveTo(0.0f, f10);
        float f11 = i13;
        path.lineTo(f11, f11);
        path.lineTo(f10, 0.0f);
        float f12 = dp - i13;
        path.lineTo(f12, f11);
        float f13 = dp;
        path.lineTo(f13, f10);
        path.lineTo(f12, f12);
        path.lineTo(f10, f13);
        path.lineTo(f11, f12);
        path.lineTo(0.0f, f10);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            a4.k kVar = new a4.k(i11);
            this.f13304l = kVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < kVar.f84a; i14++) {
                a4.k.b((float[]) kVar.f86c, i14, 0.0f, 0.0f, width, height);
            }
            this.f13305m = g0.a.a(createBitmap);
            return;
        }
        this.f13304l = null;
        this.f13305m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f10) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f13302j;
        ArrayList arrayList = this.f13297b;
        int min = Math.min(i11, arrayList.size());
        float f11 = 2.0f;
        if (this.f13304l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                va vaVar = (va) arrayList.get(i12);
                float f12 = vaVar.f13248i * vaVar.e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                a4.k kVar = this.f13304l;
                float f15 = vaVar.f13243a;
                float f16 = vaVar.f13244b;
                a4.k.b((float[]) kVar.f85b, i12, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f13304l.e(i12, i0.a.k(i10, (int) (Utilities.clamp01(vaVar.h * f10) * 255.0f)));
            }
            g0.a.b(canvas, this.f13304l, min, this.f13305m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f13299f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                va vaVar2 = (va) arrayList.get(i13);
                float f17 = vaVar2.h * f10;
                wa waVar = vaVar2.f13249j;
                Paint paint = waVar.f13299f;
                Rect rect = waVar.f13300g;
                Bitmap bitmap2 = waVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                rect.set((int) (vaVar2.f13243a - ((((bitmap2.getWidth() / f11) * vaVar2.f13248i) * vaVar2.e) * f17)), (int) (vaVar2.f13244b - ((((bitmap2.getHeight() / f11) * vaVar2.f13248i) * vaVar2.e) * f17)), (int) e2.c.u((bitmap2.getWidth() / f11) * vaVar2.f13248i, vaVar2.e, f17, vaVar2.f13243a), (int) e2.c.u((bitmap2.getHeight() / 2.0f) * vaVar2.f13248i, vaVar2.e, f17, vaVar2.f13244b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f11 = 2.0f;
            }
        }
        this.f13303k = false;
    }

    public final void c(va vaVar, long j10, boolean z4) {
        long j11;
        vaVar.f13246f = j10;
        vaVar.f13247g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f13301i;
        if (z4) {
            vaVar.f13246f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f13298c;
        vaVar.f13243a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        vaVar.f13244b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f13296a == 0) {
            vaVar.f13245c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            vaVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            vaVar.f13245c = rectF.centerX() - vaVar.f13243a;
            vaVar.d = rectF.centerY() - vaVar.f13244b;
            float f10 = vaVar.f13245c;
            float f11 = vaVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            vaVar.f13245c *= dp;
            vaVar.d *= dp;
        }
        vaVar.f13248i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        vaVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f13307o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f13302j;
                ArrayList arrayList = this.f13297b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                va vaVar = (va) arrayList.get(i10);
                long j10 = vaVar.f13247g;
                if (j10 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - vaVar.f13246f)) / ((float) j10);
                }
                if (f10 > 1.0f) {
                    c(vaVar, currentTimeMillis, this.f13303k);
                    f10 = 0.0f;
                }
                vaVar.f13243a = (vaVar.f13245c * min) + vaVar.f13243a;
                vaVar.f13244b = (vaVar.d * min) + vaVar.f13244b;
                float f11 = 4.0f * f10;
                vaVar.h = f11 - (f10 * f11);
                i10++;
            }
            this.f13307o = currentTimeMillis;
            long j11 = this.f13306n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f13306n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f13296a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f13297b;
                if (i10 < arrayList.size()) {
                    va vaVar = (va) arrayList.get(i10);
                    if (!this.f13298c.contains((int) vaVar.f13243a, (int) vaVar.f13244b)) {
                        c(vaVar, currentTimeMillis, this.f13303k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f13298c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f13298c.set(rectF);
        e();
    }
}
