package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
public final class x51 {
    public float A;
    public float B;
    public float C;
    public float D;
    public final z51 E;
    public final Paint a;
    public Bitmap b;
    public float c;
    public float d;
    public final mm e;
    public final mm f;
    public float g;
    public final mm h;
    public float i;
    public final mm j;
    public final hn k;
    public float l;
    public final mm m;
    public boolean n;
    public final mm o;
    public final Path p;
    public final Paint q;
    public final RectF r;
    public final Paint s;
    public final Paint t;
    public final RectF u;
    public RadialGradient v;
    public Matrix w;
    public float x;
    public float y;
    public float z;

    public x51(z51 z51Var) {
        this.E = z51Var;
        Paint paint = new Paint(3);
        this.a = paint;
        paint.setColor(-1);
        k43 k43Var = k43.h;
        this.e = new mm(650L, z51Var, k43Var);
        this.f = new mm(650L, z51Var, k43Var);
        k43 k43Var2 = k43.g;
        this.h = new mm(z51Var, 0L, 150L, k43Var2);
        this.i = 1.0f;
        this.j = new mm(z51Var, 0L, 150L, k43Var2);
        hn hnVar = new hn(false, true, true);
        this.k = hnVar;
        this.m = new mm(z51Var, 0L, 150L, k43Var2);
        this.o = new mm(z51Var, 0L, 200L, k43Var);
        hnVar.u(-1);
        hnVar.n(0.35f, 200L, k43Var);
        hnVar.x(hl.o());
        hnVar.w(hl.L(15.0f));
        hnVar.b = 17;
        this.p = new Path();
        Paint paint2 = new Paint(1);
        this.q = paint2;
        this.r = new RectF();
        this.s = new Paint(1);
        Paint paint3 = new Paint(1);
        this.t = paint3;
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.u = new RectF();
    }

    public final void a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        double d;
        if (f10 > 0.0f && i86.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = z51.c0;
            if (j < 0) {
                z51.c0 = currentTimeMillis;
                j = currentTimeMillis;
            }
            float f11 = ((float) (currentTimeMillis - j)) / 10000.0f;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                float f12 = width;
                float N = hl.N(15.0f) / f12;
                float f13 = 7.0f;
                int floor = (int) Math.floor((f5 % 360.0f) / 7.0f);
                int ceil = (int) Math.ceil((f6 % 360.0f) / 7.0f);
                while (floor <= ceil) {
                    float f14 = floor * f13;
                    float sin = (float) (((((Math.sin(2000.0f * f14) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f11)) % 1.0d);
                    float f15 = 1.4142135f * f12;
                    float f16 = f11;
                    double R1 = hl.R1(f7 - f15, f8 + f15, sin);
                    float d2 = (float) ik8.d(z51.f(f14), R1, f);
                    float sin2 = (float) ((Math.sin(z51.f(f14)) * R1) + f2);
                    float z = xnb.z((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, ((Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f) * 0.65f * f10);
                    int i = width;
                    float f17 = N;
                    Paint paint = this.a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, hl.R1(1.0f, Math.min(dte.a(d2, sin2, f3, f4) / hl.N(64.0f), 1.0f), f9) * z)) * 255.0f));
                    float sin3 = ((float) ((((Math.sin(f14) + 1.0d) * 0.25d) + 0.800000011920929d) * xnb.z((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f))) * f17;
                    canvas.save();
                    canvas.translate(d2, sin2);
                    canvas.scale(sin3, sin3);
                    float f18 = -(i >> 1);
                    canvas.drawBitmap(this.b, f18, f18, paint);
                    canvas.restore();
                    floor++;
                    N = f17;
                    width = i;
                    f11 = f16;
                    f13 = 7.0f;
                }
            }
        }
    }
}
