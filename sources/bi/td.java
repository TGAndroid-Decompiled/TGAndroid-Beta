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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class td {
    public final int f5489a;
    public final ArrayList f5490b;
    public final Bitmap d;
    public int e;
    public int f5495j;
    public e0.e0 f5497l;
    public final Paint f5498m;
    public long f5499n;
    public long f5500o;
    public final RectF f5491c = new RectF();
    public final Paint f5492f = new Paint(3);
    public final Rect f5493g = new Rect();
    public float h = 1.0f;
    public final float f5494i = 1.0f;
    public boolean f5496k = true;

    public td(int i10, int i11) {
        this.f5489a = i10;
        this.f5495j = i11;
        this.f5490b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f5490b.add(new sd(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f7 = dp >> 1;
        int i13 = (int) (0.85f * f7);
        path.moveTo(0.0f, f7);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f7, 0.0f);
        float f11 = dp - i13;
        path.lineTo(f11, f10);
        float f12 = dp;
        path.lineTo(f12, f7);
        path.lineTo(f11, f11);
        path.lineTo(f7, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f7);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.e0 e0Var = new e0.e0(i11);
            this.f5497l = e0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < e0Var.f9528b; i14++) {
                e0.e0.c((float[]) e0Var.d, i14, 0.0f, 0.0f, width, height);
            }
            this.f5498m = org.telegram.ui.Components.aa.a(createBitmap);
            return;
        }
        this.f5497l = null;
        this.f5498m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f5495j;
        ArrayList arrayList = this.f5490b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f5497l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                sd sdVar = (sd) arrayList.get(i12);
                float f11 = sdVar.f5430i * sdVar.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.e0 e0Var = this.f5497l;
                float f14 = sdVar.f5425a;
                float f15 = sdVar.f5426b;
                e0.e0.c((float[]) e0Var.f9529c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f5497l.f(i12, i0.a.o(i10, (int) (Utilities.clamp01(sdVar.h * f7) * 255.0f)));
            }
            org.telegram.ui.Components.aa.b(canvas, this.f5497l, min, this.f5498m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f5492f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                sd sdVar2 = (sd) arrayList.get(i13);
                float f16 = sdVar2.h * f7;
                td tdVar = sdVar2.f5431j;
                Paint paint = tdVar.f5492f;
                Rect rect = tdVar.f5493g;
                Bitmap bitmap2 = tdVar.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) org.telegram.ui.d3.A((bitmap2.getWidth() / f10) * sdVar2.f5430i, sdVar2.e, f16, sdVar2.f5425a), (int) org.telegram.ui.d3.A((bitmap2.getHeight() / f10) * sdVar2.f5430i, sdVar2.e, f16, sdVar2.f5426b), (int) c3.h0.u((bitmap2.getWidth() / f10) * sdVar2.f5430i, sdVar2.e, f16, sdVar2.f5425a), (int) c3.h0.u((bitmap2.getHeight() / f17) * sdVar2.f5430i, sdVar2.e, f16, sdVar2.f5426b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f5496k = false;
    }

    public final void c(sd sdVar, long j10, boolean z10) {
        long j11;
        sdVar.f5428f = j10;
        sdVar.f5429g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f5494i;
        if (z10) {
            sdVar.f5428f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f5491c;
        sdVar.f5425a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        sdVar.f5426b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f5489a == 0) {
            sdVar.f5427c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            sdVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            sdVar.f5427c = rectF.centerX() - sdVar.f5425a;
            sdVar.d = rectF.centerY() - sdVar.f5426b;
            float f7 = sdVar.f5427c;
            float f10 = sdVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            sdVar.f5427c *= dp;
            sdVar.d *= dp;
        }
        sdVar.f5430i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        sdVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f5500o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f5495j;
                ArrayList arrayList = this.f5490b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                sd sdVar = (sd) arrayList.get(i10);
                long j10 = sdVar.f5429g;
                if (j10 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - sdVar.f5428f)) / ((float) j10);
                }
                if (f7 > 1.0f) {
                    c(sdVar, currentTimeMillis, this.f5496k);
                    f7 = 0.0f;
                }
                sdVar.f5425a = (sdVar.f5427c * min) + sdVar.f5425a;
                sdVar.f5426b = (sdVar.d * min) + sdVar.f5426b;
                float f10 = 4.0f * f7;
                sdVar.h = f10 - (f7 * f10);
                i10++;
            }
            this.f5500o = currentTimeMillis;
            long j11 = this.f5499n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f5499n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f5489a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f5490b;
                if (i10 < arrayList.size()) {
                    sd sdVar = (sd) arrayList.get(i10);
                    if (!this.f5491c.contains((int) sdVar.f5425a, (int) sdVar.f5426b)) {
                        c(sdVar, currentTimeMillis, this.f5496k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f5491c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f5491c.set(rectF);
        e();
    }
}
