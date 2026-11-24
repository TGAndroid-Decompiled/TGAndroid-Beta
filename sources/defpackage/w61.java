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
public final class w61 {
    public float A;
    public float B;
    public float C;
    public float D;
    public final y61 E;
    public final Paint a;
    public Bitmap b;
    public float c;
    public float d;
    public final ln e;
    public final ln f;
    public float g;
    public final ln h;
    public float i;
    public final ln j;
    public final ho k;
    public float l;
    public final ln m;
    public boolean n;
    public final ln o;
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

    public w61(y61 y61Var) {
        this.E = y61Var;
        Paint paint = new Paint(3);
        this.a = paint;
        paint.setColor(-1);
        d53 d53Var = d53.h;
        this.e = new ln(650L, y61Var, d53Var);
        this.f = new ln(650L, y61Var, d53Var);
        d53 d53Var2 = d53.g;
        this.h = new ln(y61Var, 0L, 150L, d53Var2);
        this.i = 1.0f;
        this.j = new ln(y61Var, 0L, 150L, d53Var2);
        ho hoVar = new ho(false, true, true);
        this.k = hoVar;
        this.m = new ln(y61Var, 0L, 150L, d53Var2);
        this.o = new ln(y61Var, 0L, 200L, d53Var);
        hoVar.u(-1);
        hoVar.n(0.35f, 200L, d53Var);
        hoVar.x(gm.o());
        hoVar.w(gm.L(15.0f));
        hoVar.b = 17;
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
        if (f10 > 0.0f && e86.e(360928)) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = y61.c0;
            if (j < 0) {
                y61.c0 = currentTimeMillis;
                j = currentTimeMillis;
            }
            float f11 = ((float) (currentTimeMillis - j)) / 10000.0f;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                float f12 = width;
                float N = gm.N(15.0f) / f12;
                float f13 = 7.0f;
                int floor = (int) Math.floor((f5 % 360.0f) / 7.0f);
                int ceil = (int) Math.ceil((f6 % 360.0f) / 7.0f);
                while (floor <= ceil) {
                    float f14 = floor * f13;
                    float sin = (float) (((((Math.sin(2000.0f * f14) + 1.0d) * 0.25d) + 1.0d) * (100.0f + f11)) % 1.0d);
                    float f15 = 1.4142135f * f12;
                    float f16 = f11;
                    double R1 = gm.R1(f7 - f15, f8 + f15, sin);
                    float d2 = (float) wi8.d(y61.f(f14), R1, f);
                    float sin2 = (float) ((Math.sin(y61.f(f14)) * R1) + f2);
                    float A = mlb.A((float) (Math.sin(sin * 3.141592653589793d) - 1.0d), 0.25f, 1.0f, ((Math.abs(sin - 0.5f) * (-1.75f)) + 1.0f) * 0.65f * f10);
                    int i = width;
                    float f17 = N;
                    Paint paint = this.a;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, gm.R1(1.0f, Math.min(oqe.a(d2, sin2, f3, f4) / gm.N(64.0f), 1.0f), f9) * A)) * 255.0f));
                    float sin3 = ((float) ((((Math.sin(f14) + 1.0d) * 0.25d) + 0.800000011920929d) * mlb.A((float) (Math.sin(d) - 1.0d), 0.25f, 1.0f, 0.75f))) * f17;
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
