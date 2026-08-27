package hh;

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

    public final int f9032a;

    public final ArrayList f9033b;
    public final Bitmap d;

    public int f9035e;

    public int f9039j;

    public e0.i0 f9041l;

    public final Paint f9042m;

    public long f9043n;

    public long f9044o;

    public final RectF f9034c = new RectF();

    public final Paint f9036f = new Paint(3);

    public final Rect f9037g = new Rect();
    public float h = 1.0f;

    public final float f9038i = 1.0f;

    public boolean f9040k = true;

    public bb(int i10, int i11) {
        this.f9032a = i10;
        this.f9039j = i11;
        this.f9033b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f9033b.add(new ab(this));
        }
        int iDp = AndroidUtilities.dp(10.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
        this.d = bitmapCreateBitmap;
        Path path = new Path();
        float f10 = iDp >> 1;
        int i13 = (int) (0.85f * f10);
        path.moveTo(0.0f, f10);
        float f11 = i13;
        path.lineTo(f11, f11);
        path.lineTo(f10, 0.0f);
        float f12 = iDp - i13;
        path.lineTo(f12, f11);
        float f13 = iDp;
        path.lineTo(f13, f10);
        path.lineTo(f12, f12);
        path.lineTo(f10, f13);
        path.lineTo(f11, f12);
        path.lineTo(0.0f, f10);
        path.close();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT < 29) {
            this.f9041l = null;
            this.f9042m = null;
            return;
        }
        e0.i0 i0Var = new e0.i0(i11);
        this.f9041l = i0Var;
        float width = bitmapCreateBitmap.getWidth();
        float height = bitmapCreateBitmap.getHeight();
        for (int i14 = 0; i14 < i0Var.f5064a; i14++) {
            e0.i0.c((float[]) i0Var.f5066c, i14, 0.0f, 0.0f, width, height);
        }
        this.f9042m = g0.a.a(bitmapCreateBitmap);
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f10) {
        if (LiteMode.isEnabled(131072)) {
            int i11 = this.f9039j;
            ArrayList arrayList = this.f9033b;
            int iMin = Math.min(i11, arrayList.size());
            float f11 = 2.0f;
            if (this.f9041l != null) {
                Bitmap bitmap = this.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                for (int i12 = 0; i12 < iMin; i12++) {
                    ab abVar = (ab) arrayList.get(i12);
                    float f12 = abVar.f8976i * abVar.f8973e * f10;
                    float f13 = (width / 2.0f) * f12;
                    float f14 = (height / 2.0f) * f12;
                    e0.i0 i0Var = this.f9041l;
                    float f15 = abVar.f8970a;
                    float f16 = abVar.f8971b;
                    e0.i0.c((float[]) i0Var.f5065b, i12, f15 - f13, f16 - f14, f15 + f13, f16 + f14);
                    this.f9041l.e(i12, i0.b.k(i10, (int) (Utilities.clamp01(abVar.h * f10) * 255.0f)));
                }
                g0.a.b(canvas, this.f9041l, iMin, this.f9042m);
            } else {
                if (this.f9035e != i10) {
                    this.f9035e = i10;
                    this.f9036f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
                int i13 = 0;
                while (i13 < iMin) {
                    ab abVar2 = (ab) arrayList.get(i13);
                    float f17 = abVar2.h * f10;
                    bb bbVar = abVar2.f8977j;
                    Paint paint = bbVar.f9036f;
                    Rect rect = bbVar.f9037g;
                    Bitmap bitmap2 = bbVar.d;
                    paint.setAlpha((int) (f17 * 255.0f));
                    rect.set((int) (abVar2.f8970a - ((((bitmap2.getWidth() / f11) * abVar2.f8976i) * abVar2.f8973e) * f17)), (int) (abVar2.f8971b - ((((bitmap2.getHeight() / f11) * abVar2.f8976i) * abVar2.f8973e) * f17)), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getWidth() / f11) * abVar2.f8976i, abVar2.f8973e, f17, abVar2.f8970a), (int) com.google.android.recaptcha.internal.a.x((bitmap2.getHeight() / 2.0f) * abVar2.f8976i, abVar2.f8973e, f17, abVar2.f8971b));
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    i13++;
                    f11 = 2.0f;
                }
            }
            this.f9040k = false;
        }
    }

    public final void c(ab abVar, long j10, boolean z10) {
        abVar.f8974f = j10;
        long jLerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f9038i);
        abVar.f8975g = jLerp;
        if (z10) {
            abVar.f8974f -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * jLerp);
        }
        RectF rectF = this.f9034c;
        abVar.f8970a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        abVar.f8971b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f9032a == 0) {
            abVar.f8972c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            abVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            abVar.f8972c = rectF.centerX() - abVar.f8970a;
            abVar.d = rectF.centerY() - abVar.f8971b;
            float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
            float f10 = abVar.f8972c;
            float f11 = abVar.d;
            float fSqrt = fDp / ((float) Math.sqrt((f11 * f11) + (f10 * f10)));
            abVar.f8972c *= fSqrt;
            abVar.d *= fSqrt;
        }
        abVar.f8976i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        abVar.f8973e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        if (LiteMode.isEnabled(131072)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            float fMin = (Math.min(this.f9044o - jCurrentTimeMillis, 16L) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f9039j;
                ArrayList arrayList = this.f9033b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                ab abVar = (ab) arrayList.get(i10);
                long j10 = abVar.f8975g;
                float f10 = j10 <= 0 ? 2.0f : (jCurrentTimeMillis - abVar.f8974f) / j10;
                if (f10 > 1.0f) {
                    c(abVar, jCurrentTimeMillis, this.f9040k);
                    f10 = 0.0f;
                }
                abVar.f8970a = (abVar.f8972c * fMin) + abVar.f8970a;
                abVar.f8971b = (abVar.d * fMin) + abVar.f8971b;
                float f11 = 4.0f * f10;
                abVar.h = f11 - (f10 * f11);
                i10++;
            }
            this.f9044o = jCurrentTimeMillis;
            long j11 = this.f9043n;
            if (j11 == 0 || j11 - jCurrentTimeMillis >= 66) {
                this.f9043n = jCurrentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f9032a != 2) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9033b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ab abVar = (ab) arrayList.get(i10);
            if (!this.f9034c.contains((int) abVar.f8970a, (int) abVar.f8971b)) {
                c(abVar, jCurrentTimeMillis, this.f9040k);
            }
            i10++;
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f9034c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f9034c.set(rectF);
        e();
    }
}
