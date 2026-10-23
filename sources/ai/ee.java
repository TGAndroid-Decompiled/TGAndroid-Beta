package ai;

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
public final class ee {
    public final int f1233a;
    public final ArrayList f1234b;
    public final Bitmap d;
    public int e;
    public int f1239j;
    public e0.f0 f1241l;
    public final Paint f1242m;
    public long f1243n;
    public long f1244o;
    public final RectF f1235c = new RectF();
    public final Paint f1236f = new Paint(3);
    public final Rect f1237g = new Rect();
    public float h = 1.0f;
    public final float f1238i = 1.0f;
    public boolean f1240k = true;

    public ee(int i10, int i11) {
        this.f1233a = i10;
        this.f1239j = i11;
        this.f1234b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f1234b.add(new de(this));
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
        paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.f0 f0Var = new e0.f0(i11);
            this.f1241l = f0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < f0Var.f8102b; i14++) {
                e0.f0.c((float[]) f0Var.d, i14, 0.0f, 0.0f, width, height);
            }
            this.f1242m = g0.a.a(createBitmap);
            return;
        }
        this.f1241l = null;
        this.f1242m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f1239j;
        ArrayList arrayList = this.f1234b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f1241l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                de deVar = (de) arrayList.get(i12);
                float f11 = deVar.f1169i * deVar.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.f0 f0Var = this.f1241l;
                float f14 = deVar.f1164a;
                float f15 = deVar.f1165b;
                e0.f0.c((float[]) f0Var.f8103c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f1241l.e(i12, i0.a.o(i10, (int) (Utilities.clamp01(deVar.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f1241l, min, this.f1242m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f1236f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                de deVar2 = (de) arrayList.get(i13);
                float f16 = deVar2.h * f7;
                ee eeVar = deVar2.f1170j;
                Paint paint = eeVar.f1236f;
                Rect rect = eeVar.f1237g;
                Bitmap bitmap2 = eeVar.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) org.telegram.ui.Cells.b1.x((bitmap2.getWidth() / f10) * deVar2.f1169i, deVar2.e, f16, deVar2.f1164a), (int) org.telegram.ui.Cells.b1.x((bitmap2.getHeight() / f10) * deVar2.f1169i, deVar2.e, f16, deVar2.f1165b), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getWidth() / f10) * deVar2.f1169i, deVar2.e, f16, deVar2.f1164a), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getHeight() / f17) * deVar2.f1169i, deVar2.e, f16, deVar2.f1165b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f1240k = false;
    }

    public final void c(de deVar, long j10, boolean z10) {
        long j11;
        deVar.f1167f = j10;
        deVar.f1168g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f1238i;
        if (z10) {
            deVar.f1167f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f1235c;
        deVar.f1164a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        deVar.f1165b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f1233a == 0) {
            deVar.f1166c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            deVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            deVar.f1166c = rectF.centerX() - deVar.f1164a;
            deVar.d = rectF.centerY() - deVar.f1165b;
            float f7 = deVar.f1166c;
            float f10 = deVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            deVar.f1166c *= dp;
            deVar.d *= dp;
        }
        deVar.f1169i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        deVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f1244o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f1239j;
                ArrayList arrayList = this.f1234b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                de deVar = (de) arrayList.get(i10);
                long j10 = deVar.f1168g;
                if (j10 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - deVar.f1167f)) / ((float) j10);
                }
                if (f7 > 1.0f) {
                    c(deVar, currentTimeMillis, this.f1240k);
                    f7 = 0.0f;
                }
                deVar.f1164a = (deVar.f1166c * min) + deVar.f1164a;
                deVar.f1165b = (deVar.d * min) + deVar.f1165b;
                float f10 = 4.0f * f7;
                deVar.h = f10 - (f7 * f10);
                i10++;
            }
            this.f1244o = currentTimeMillis;
            long j11 = this.f1243n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f1243n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f1233a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1234b;
                if (i10 < arrayList.size()) {
                    de deVar = (de) arrayList.get(i10);
                    if (!this.f1235c.contains((int) deVar.f1164a, (int) deVar.f1165b)) {
                        c(deVar, currentTimeMillis, this.f1240k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f1235c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f1235c.set(rectF);
        e();
    }
}
