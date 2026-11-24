package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Locale;
public final class iv9 extends Drawable {
    public final boolean a;
    public final Runnable b;
    public final Paint c = new Paint(1);
    public final Paint d;
    public oy8 e;
    public final Path f;
    public final tgb g;
    public final Path h;
    public final Path i;
    public boolean j;
    public int k;
    public final lm l;
    public final lm m;
    public final lm n;
    public final lm o;
    public final s7 p;
    public boolean q;
    public final RectF r;
    public final RectF s;
    public float t;
    public long u;
    public float v;
    public boolean w;
    public final zk9 x;

    public iv9(Runnable runnable, boolean z) {
        boolean z2 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f = path;
        this.g = new tgb(k96.M0(2131745489, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.i = path3;
        this.k = 1;
        this.r = new RectF();
        this.s = new RectF();
        this.x = new zk9(this, (byte) 19);
        this.b = runnable;
        this.a = z;
        s33 s33Var = s33.h;
        lm lmVar = new lm(runnable, 360L, s33Var, 0);
        this.l = lmVar;
        lmVar.e(true, 0.0f);
        this.m = new lm(runnable, 320L, s33Var, 0);
        this.n = new lm(runnable, 200L, s33Var, 0);
        lm lmVar2 = new lm(runnable, 360L, s33Var, 0);
        this.o = lmVar2;
        lmVar2.e(true, 0.0f);
        s7 s7Var = new s7(runnable);
        this.p = s7Var;
        s7Var.B = 0.3f;
        s7Var.m(0.4f, 650L, 1.6f, s33Var);
        s7Var.x(gl.n1("fonts/num.otf"));
        s7Var.w(gl.L(16.0f));
        c(false, 2.0f);
        s7Var.u(-1);
        s7Var.b = 17;
        paint.setPathEffect(new CornerPathEffect(gl.L(1.66f)));
        path2.moveTo(gl.L(8.66f), -gl.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(gl.L(8.66f), gl.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -gl.L(6.33f));
        path3.lineTo(gl.L(8.66f), 0.0f);
        path3.lineTo(0.0f, gl.L(6.33f));
        path3.close();
        this.q = (z || na7.c1().getBoolean("seekSpeedHintShowed", false)) ? false : z2;
        path.moveTo(-gl.L(6.5f), 0.0f);
        path.lineTo(0.0f, -gl.L(6.33f));
        path.lineTo(gl.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.j && this.l.c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z) {
        this.j = z;
        this.b.run();
        oy8 oy8Var = this.e;
        if (oy8Var != null && this.q) {
            if (z) {
                oy8Var.C(false);
            } else {
                oy8Var.stop();
            }
        }
    }

    public final void c(boolean z, float f) {
        int i;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f)) {
            s7 s7Var = this.p;
            s7Var.a();
            s7Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f))), z, true);
            this.v = f;
        }
        if (f > 0.0f) {
            i = 1;
        } else {
            i = -1;
        }
        this.k = i;
        if (!z) {
            this.m.e(true, i);
        }
        this.b.run();
        if (this.q && Math.abs(f) > 3.0f && !this.w) {
            this.w = true;
            gl.d3(this.x, 2500L);
            na7.c1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z;
        Rect bounds = getBounds();
        float c = this.p.c() + gl.L(46.0f);
        float d = this.l.d(this.j);
        float e = this.m.e(false, this.k);
        if (d > 0.0f) {
            float e2 = this.n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.u)) / 1000.0f);
            this.u = currentTimeMillis;
            this.t = (Math.min(e2, 4.0f) * 1.5f * min) + this.t;
            this.b.run();
            float f = c / 2.0f;
            this.r.set(bounds.centerX() - f, gl.L(9.0f) + bounds.top, bounds.centerX() + f, gl.L(37.0f) + bounds.top);
            canvas.save();
            float f2 = d * 0.4f;
            float f3 = 0.6f + f2;
            if (bounds.width() < gl.q.x * 0.7f) {
                f3 *= 0.75f;
                if (this.a) {
                    canvas.translate(-gl.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f3, f3, this.r.centerX(), this.r.top);
            canvas.translate(0.0f, (1.0f - d) * (-gl.L(15.0f)));
            canvas.clipRect(this.r);
            this.c.setColor(bkb.p1(f2, -16777216));
            RectF rectF = this.r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.r.height() / 2.0f, this.c);
            this.p.p(this.r);
            canvas.save();
            float f4 = -e;
            canvas.translate(((this.r.centerX() - f) + gl.L(9.0f)) - ((1.0f - Math.max(0.0f, f4)) * gl.L(30.0f)), this.r.centerY());
            this.d.setColor(bkb.p1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f4) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(gl.L(10.66f), 0.0f);
            this.d.setColor(bkb.p1(((((((float) Math.sin((this.t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f4) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-gl.L(28.0f)) / 2.0f) * e, 0.0f);
            s7 s7Var = this.p;
            s7Var.C = (int) (d * 255.0f);
            s7Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e)) * gl.L(30.0f)) + ((this.r.centerX() + f) - gl.L(30.0f)), this.r.centerY());
            this.d.setColor(bkb.p1(((((((float) Math.sin(this.t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
            canvas.drawPath(this.i, this.d);
            canvas.translate(gl.L(10.66f), 0.0f);
            this.d.setColor(bkb.p1(((((((float) Math.sin((this.t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
            canvas.drawPath(this.i, this.d);
            canvas.restore();
            canvas.restore();
            lm lmVar = this.o;
            if (this.q && this.j) {
                z = true;
            } else {
                z = false;
            }
            float d2 = lmVar.d(z);
            if (d2 > 0.0f) {
                if (this.e == null) {
                    oy8 oy8Var = new oy8(2131624186, gl.L(24.0f), gl.L(24.0f), true, null);
                    this.e = oy8Var;
                    oy8Var.E(true);
                    this.e.setCallback(new in(this, (byte) 10));
                    this.e.F(1);
                    this.e.start();
                }
                float L = this.g.c + gl.L(54.0f);
                RectF rectF2 = this.s;
                float f5 = L / 2.0f;
                float centerX = bounds.centerX() - f5;
                RectF rectF3 = this.r;
                float height = (rectF3.height() * d) + rectF3.top + gl.L(11.0f);
                float centerX2 = bounds.centerX() + f5;
                RectF rectF4 = this.r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + gl.L(11.0f) + gl.L(32.0f));
                canvas.save();
                float f6 = (0.25f * d2) + 0.75f;
                canvas.scale(f6, f6, this.s.centerX(), this.s.top);
                this.c.setColor(bkb.p1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.s.centerX(), this.s.top);
                canvas.drawPath(this.f, this.c);
                canvas.restore();
                canvas.drawRoundRect(this.s, gl.L(8.0f), gl.L(8.0f), this.c);
                this.e.setBounds(gl.L(11.0f) + ((int) this.s.left), ((int) this.s.centerY()) - (gl.L(24.0f) / 2), gl.L(35.0f) + ((int) this.s.left), (gl.L(24.0f) / 2) + ((int) this.s.centerY()));
                this.e.setAlpha((int) (255.0f * d2));
                if (!this.e.l0) {
                    this.e.C(true);
                }
                this.e.draw(canvas);
                this.g.c(this.s.left + gl.L(39.0f), this.s.centerY(), d2, -1, canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
