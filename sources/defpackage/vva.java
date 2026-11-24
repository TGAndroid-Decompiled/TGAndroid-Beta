package defpackage;

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
public final class vva {
    public final byte a;
    public final ArrayList b;
    public final Bitmap d;
    public int e;
    public int j;
    public cyb l;
    public final Paint m;
    public long n;
    public long o;
    public final RectF c = new RectF();
    public final Paint f = new Paint(3);
    public final Rect g = new Rect();
    public float h = 1.0f;
    public final float i = 1.0f;
    public boolean k = true;

    public vva(int i, int i2) {
        this.a = i;
        this.j = i2;
        this.b = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.b.add(new uva(this));
        }
        int L = gl.L(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f = L >> 1;
        int i4 = (int) (0.85f * f);
        path.moveTo(0.0f, f);
        float f2 = i4;
        path.lineTo(f2, f2);
        path.lineTo(f, 0.0f);
        float f3 = L - i4;
        path.lineTo(f3, f2);
        float f4 = L;
        path.lineTo(f4, f);
        path.lineTo(f3, f3);
        path.lineTo(f, f4);
        path.lineTo(f2, f3);
        path.lineTo(0.0f, f);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(bkb.p1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (Build.VERSION.SDK_INT >= 29) {
            cyb cybVar = new cyb(i2);
            this.l = cybVar;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i5 = 0; i5 < cybVar.b; i5++) {
                cyb.d((float[]) cybVar.d, i5, 0.0f, 0.0f, width, height);
            }
            this.m = s4.a(createBitmap);
            return;
        }
        this.l = null;
        this.m = null;
    }

    public final void a(Canvas canvas, int i) {
        b(canvas, i, 1.0f);
    }

    public final void b(Canvas canvas, int i, float f) {
        if (!e66.e(131072)) {
            return;
        }
        int i2 = this.j;
        ArrayList arrayList = this.b;
        int min = Math.min(i2, arrayList.size());
        float f2 = 2.0f;
        if (this.l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i3 = 0; i3 < min; i3++) {
                uva uvaVar = (uva) arrayList.get(i3);
                float f3 = uvaVar.i * uvaVar.e * f;
                float f4 = (width / 2.0f) * f3;
                float f5 = (height / 2.0f) * f3;
                cyb cybVar = this.l;
                float f6 = uvaVar.a;
                float f7 = uvaVar.b;
                cyb.d((float[]) cybVar.c, i3, f6 - f4, f7 - f5, f6 + f4, f7 + f5);
                this.l.s(i3, bm2.o(i, (int) (Utilities.l(uvaVar.h * f) * 255.0f)));
            }
            s4.b(canvas, this.l, min, this.m);
        } else {
            if (this.e != i) {
                this.e = i;
                this.f.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            int i4 = 0;
            while (i4 < min) {
                uva uvaVar2 = (uva) arrayList.get(i4);
                float f8 = uvaVar2.h * f;
                vva vvaVar = uvaVar2.j;
                Paint paint = vvaVar.f;
                Rect rect = vvaVar.g;
                Bitmap bitmap2 = vvaVar.d;
                paint.setAlpha((int) (f8 * 255.0f));
                float f9 = f2;
                rect.set((int) oo1.v((bitmap2.getWidth() / f2) * uvaVar2.i, uvaVar2.e, f8, uvaVar2.a), (int) oo1.v((bitmap2.getHeight() / f2) * uvaVar2.i, uvaVar2.e, f8, uvaVar2.b), (int) b00.w((bitmap2.getWidth() / f2) * uvaVar2.i, uvaVar2.e, f8, uvaVar2.a), (int) b00.w((bitmap2.getHeight() / f9) * uvaVar2.i, uvaVar2.e, f8, uvaVar2.b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i4++;
                f2 = f9;
            }
        }
        this.k = false;
    }

    public final void c(uva uvaVar, long j, boolean z) {
        long j2;
        uvaVar.f = j;
        yyc yycVar = Utilities.c;
        uvaVar.g = gl.U1(yycVar.nextFloat(), 500, 2500) * this.i;
        if (z) {
            uvaVar.f -= Utilities.l(yycVar.nextFloat()) * ((float) j2);
        }
        RectF rectF = this.c;
        uvaVar.a = gl.R1(rectF.left, rectF.right, yycVar.nextFloat());
        uvaVar.b = gl.R1(rectF.top, rectF.bottom, yycVar.nextFloat());
        if (this.a == 0) {
            uvaVar.c = gl.L(gl.R1(-7.0f, -18.0f, yycVar.nextFloat()));
            uvaVar.d = gl.L(gl.R1(-2.0f, 2.0f, yycVar.nextFloat()));
        } else {
            uvaVar.c = rectF.centerX() - uvaVar.a;
            uvaVar.d = rectF.centerY() - uvaVar.b;
            float f = uvaVar.c;
            float f2 = uvaVar.d;
            float L = gl.L(gl.R1(1.0f, 4.0f, yycVar.nextFloat())) / ((float) Math.sqrt((f2 * f2) + (f * f)));
            uvaVar.c *= L;
            uvaVar.d *= L;
        }
        uvaVar.i = gl.R1(0.4f, 1.0f, yycVar.nextFloat());
        uvaVar.e = gl.R1(0.8f, 1.2f, yycVar.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f;
        if (e66.e(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i = 0;
            while (true) {
                int i2 = this.j;
                ArrayList arrayList = this.b;
                if (i >= Math.min(i2, arrayList.size())) {
                    break;
                }
                uva uvaVar = (uva) arrayList.get(i);
                long j = uvaVar.g;
                if (j <= 0) {
                    f = 2.0f;
                } else {
                    f = ((float) (currentTimeMillis - uvaVar.f)) / ((float) j);
                }
                if (f > 1.0f) {
                    c(uvaVar, currentTimeMillis, this.k);
                    f = 0.0f;
                }
                uvaVar.a = (uvaVar.c * min) + uvaVar.a;
                uvaVar.b = (uvaVar.d * min) + uvaVar.b;
                float f2 = 4.0f * f;
                uvaVar.h = f2 - (f * f2);
                i++;
            }
            this.o = currentTimeMillis;
            long j2 = this.n;
            if (j2 == 0 || j2 - currentTimeMillis >= 66) {
                this.n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i < arrayList.size()) {
                    uva uvaVar = (uva) arrayList.get(i);
                    if (!this.c.contains((int) uvaVar.a, (int) uvaVar.b)) {
                        c(uvaVar, currentTimeMillis, this.k);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        e();
    }

    public final void g(RectF rectF) {
        this.c.set(rectF);
        e();
    }
}
