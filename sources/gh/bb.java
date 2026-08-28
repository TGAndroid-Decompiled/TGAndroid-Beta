package gh;

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
public final class bb {
    public final int f7877a;
    public final ArrayList f7878b;
    public final Bitmap d;
    public int f7880e;
    public int f7884j;
    public e0.i0 f7886l;
    public final Paint f7887m;
    public long f7888n;
    public long f7889o;
    public final RectF f7879c = new RectF();
    public final Paint f7881f = new Paint(3);
    public final Rect f7882g = new Rect();
    public float h = 1.0f;
    public final float f7883i = 1.0f;
    public boolean f7885k = true;

    public bb(int i9, int i10) {
        this.f7877a = i9;
        this.f7884j = i10;
        this.f7878b = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7878b.add(new ab(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f10 = dp >> 1;
        int i12 = (int) (0.85f * f10);
        path.moveTo(0.0f, f10);
        float f11 = i12;
        path.lineTo(f11, f11);
        path.lineTo(f10, 0.0f);
        float f12 = dp - i12;
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
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            e0.i0 i0Var = new e0.i0(i10);
            this.f7886l = i0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i13 = 0; i13 < i0Var.f4707a; i13++) {
                e0.i0.a((float[]) i0Var.f4709c, i13, 0.0f, 0.0f, width, height);
            }
            this.f7887m = g0.a.a(createBitmap);
            return;
        }
        this.f7886l = null;
        this.f7887m = null;
    }

    public final void a(Canvas canvas, int i9) {
        b(canvas, i9, 1.0f);
    }

    public final void b(Canvas canvas, int i9, float f10) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i10 = this.f7884j;
        ArrayList arrayList = this.f7878b;
        int min = Math.min(i10, arrayList.size());
        float f11 = 2.0f;
        if (this.f7886l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i11 = 0; i11 < min; i11++) {
                ab abVar = (ab) arrayList.get(i11);
                float f12 = abVar.f7818i * abVar.f7815e * f10;
                float f13 = (width / 2.0f) * f12;
                float f14 = (height / 2.0f) * f12;
                e0.i0 i0Var = this.f7886l;
                float f15 = abVar.f7812a;
                float f16 = abVar.f7813b;
                e0.i0.a((float[]) i0Var.f4708b, i11, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                this.f7886l.c(i11, i0.a.k(i9, (int) (Utilities.clamp01(abVar.h * f10) * 255.0f)));
            }
            g0.a.b(canvas, this.f7886l, min, this.f7887m);
        } else {
            if (this.f7880e != i9) {
                this.f7880e = i9;
                this.f7881f.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
            }
            int i12 = 0;
            while (i12 < min) {
                ab abVar2 = (ab) arrayList.get(i12);
                float f17 = abVar2.h * f10;
                bb bbVar = abVar2.f7819j;
                Paint paint = bbVar.f7881f;
                Rect rect = bbVar.f7882g;
                Bitmap bitmap2 = bbVar.d;
                paint.setAlpha((int) (f17 * 255.0f));
                rect.set((int) (abVar2.f7812a - ((((bitmap2.getWidth() / f11) * abVar2.f7818i) * abVar2.f7815e) * f17)), (int) (abVar2.f7813b - ((((bitmap2.getHeight() / f11) * abVar2.f7818i) * abVar2.f7815e) * f17)), (int) e2.c.x((bitmap2.getWidth() / f11) * abVar2.f7818i, abVar2.f7815e, f17, abVar2.f7812a), (int) e2.c.x((bitmap2.getHeight() / 2.0f) * abVar2.f7818i, abVar2.f7815e, f17, abVar2.f7813b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i12++;
                f11 = 2.0f;
            }
        }
        this.f7885k = false;
    }

    public final void c(ab abVar, long j10, boolean z10) {
        long j11;
        abVar.f7816f = j10;
        abVar.f7817g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f7883i;
        if (z10) {
            abVar.f7816f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f7879c;
        abVar.f7812a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        abVar.f7813b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f7877a == 0) {
            abVar.f7814c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            abVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            abVar.f7814c = rectF.centerX() - abVar.f7812a;
            abVar.d = rectF.centerY() - abVar.f7813b;
            float f10 = abVar.f7814c;
            float f11 = abVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            abVar.f7814c *= dp;
            abVar.d *= dp;
        }
        abVar.f7818i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        abVar.f7815e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f10;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f7889o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i9 = 0;
            while (true) {
                int i10 = this.f7884j;
                ArrayList arrayList = this.f7878b;
                if (i9 >= Math.min(i10, arrayList.size())) {
                    break;
                }
                ab abVar = (ab) arrayList.get(i9);
                long j10 = abVar.f7817g;
                if (j10 <= 0) {
                    f10 = 2.0f;
                } else {
                    f10 = ((float) (currentTimeMillis - abVar.f7816f)) / ((float) j10);
                }
                if (f10 > 1.0f) {
                    c(abVar, currentTimeMillis, this.f7885k);
                    f10 = 0.0f;
                }
                abVar.f7812a = (abVar.f7814c * min) + abVar.f7812a;
                abVar.f7813b = (abVar.d * min) + abVar.f7813b;
                float f11 = 4.0f * f10;
                abVar.h = f11 - (f10 * f11);
                i9++;
            }
            this.f7889o = currentTimeMillis;
            long j11 = this.f7888n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f7888n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f7877a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.f7878b;
                if (i9 < arrayList.size()) {
                    ab abVar = (ab) arrayList.get(i9);
                    if (!this.f7879c.contains((int) abVar.f7812a, (int) abVar.f7813b)) {
                        c(abVar, currentTimeMillis, this.f7885k);
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i9, int i10, int i11, int i12) {
        this.f7879c.set(i9, i10, i11, i12);
        e();
    }

    public final void g(RectF rectF) {
        this.f7879c.set(rectF);
        e();
    }
}
