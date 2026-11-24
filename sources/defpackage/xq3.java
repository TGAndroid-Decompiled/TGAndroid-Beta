package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class xq3 extends View {
    public float E;
    public boolean F;
    public final ln G;
    public boolean H;
    public float I;
    public final ln J;
    public final ln K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public boolean P;
    public wq3 Q;
    public Runnable R;
    public final Paint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final u51 h;
    public p09 n;
    public final StaticLayout r;
    public final float s;
    public final float w;
    public StaticLayout x;
    public float y;

    public xq3(Context context, String str) {
        super(context);
        float f;
        float f2;
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        Paint paint4 = new Paint(1);
        this.f = paint4;
        this.h = new u51(this);
        this.F = false;
        this.G = new ln(0.0f, this, 0L, 350L, d53.h);
        this.H = true;
        this.I = 0.0f;
        this.J = new ln(this);
        this.K = new ln(this);
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        paint.setColor(1509949440);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        paint2.setColor(-869783512);
        paint3.setColor(-1);
        paint4.setColor(872415231);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(gm.L(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(gm.L(4.0f));
        textPaint.setTextSize(gm.L(14.0f));
        textPaint2.setTextSize(gm.N(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.r = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f = staticLayout.getLineWidth(0);
        } else {
            f = 0.0f;
        }
        this.s = f;
        if (staticLayout.getLineCount() > 0) {
            f2 = staticLayout.getLineLeft(0);
        } else {
            f2 = 0.0f;
        }
        this.w = f2;
        this.F = true;
        invalidate();
    }

    public final void a() {
        wq3 wq3Var = this.Q;
        if (wq3Var != null) {
            gm.r(wq3Var);
            this.Q = null;
        }
        this.F = false;
        invalidate();
    }

    public final void b(int i, int i2, String str) {
        float f;
        p09 p09Var = this.n;
        if (p09Var != null) {
            p09Var.setCallback(null);
            this.n.x(true);
        }
        p09 p09Var2 = new p09(i, gm.L(36.0f), gm.L(36.0f));
        this.n = p09Var2;
        p09Var2.setCallback(this);
        this.n.start();
        StaticLayout staticLayout = new StaticLayout(str, this.c, gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.x = staticLayout;
        float f2 = 0.0f;
        if (staticLayout.getLineCount() > 0) {
            f = this.x.getLineWidth(0);
        } else {
            f = 0.0f;
        }
        this.y = f;
        if (this.x.getLineCount() > 0) {
            f2 = this.x.getLineLeft(0);
        }
        this.E = f2;
        this.H = false;
        invalidate();
        wq3 wq3Var = this.Q;
        if (wq3Var != null) {
            gm.r(wq3Var);
        }
        wq3 wq3Var2 = new wq3(this, (byte) 1);
        this.Q = wq3Var2;
        gm.d3(wq3Var2, i2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF rectF;
        float f6;
        int saveCount = canvas.getSaveCount();
        if (this.F) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.G.e(false, f);
        if (this.H) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        float e2 = this.J.e(false, f2);
        float f7 = 1.0f - e2;
        Paint paint = this.a;
        paint.setAlpha((int) (90.0f * f7 * e));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.s, gm.L(54.0f)) + gm.L(42.0f);
        int L = gm.L(111.0f);
        StaticLayout staticLayout = this.r;
        float height = staticLayout.getHeight() + L;
        RectF rectF2 = this.L;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float L2 = gm.L(74.0f) + this.y;
        float L3 = gm.L(48.0f);
        RectF rectF3 = this.M;
        rectF3.set((getWidth() - L2) / 2.0f, (getHeight() - L3) / 2.0f, (getWidth() + L2) / 2.0f, (getHeight() + L3) / 2.0f);
        RectF rectF4 = this.N;
        gm.X1(rectF2, rectF3, e2, rectF4);
        int i = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i < 0 && this.H) {
            f3 = 42.0f;
            RectF rectF5 = this.O;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            gm.X1(rectF5, rectF4, e, rectF4);
        } else {
            f3 = 42.0f;
        }
        if (i < 0 && !this.H) {
            canvas2.scale(gm.R1(0.8f, 1.0f, e), gm.R1(0.8f, 1.0f, e), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * e));
        canvas2.drawRoundRect(rectF4, gm.L(10.0f), gm.L(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (e2 < 1.0f) {
            float f8 = f7 * e;
            float e3 = this.K.e(false, this.I);
            float centerX = rectF2.centerX();
            float L4 = rectF2.top + gm.L(48.0f);
            float L5 = gm.L(25.0f);
            Paint paint3 = this.f;
            paint3.setAlpha((int) (51.0f * f8));
            canvas2.drawCircle(centerX, L4, L5, paint3);
            RectF rectF6 = gm.P;
            f6 = 255.0f;
            rectF6.set(centerX - L5, L4 - L5, centerX + L5, L5 + L4);
            int i2 = (int) (f8 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i2);
            paint4.setStrokeWidth(gm.L(4.0f));
            f4 = e;
            f5 = 2.0f;
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * e3, false, paint4);
            float a = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a, a, centerX, L4);
            paint4.setStrokeWidth(gm.L(3.4f));
            canvas.drawLine(centerX - gm.L(7.0f), L4 - gm.L(7.0f), gm.L(7.0f) + centerX, gm.L(7.0f) + L4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - gm.L(7.0f), L4 + gm.L(7.0f), centerX + gm.L(7.0f), L4 - gm.L(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + gm.L(21.0f)) - this.w, (rectF2.bottom - gm.L(18.0f)) - staticLayout.getHeight());
            this.b.setAlpha(i2);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            f4 = e;
            f5 = 2.0f;
            rectF = rectF3;
            f6 = 255.0f;
        }
        if (e2 > 0.0f) {
            float f9 = f4 * e2;
            p09 p09Var = this.n;
            if (p09Var != null) {
                p09Var.setAlpha((int) (f9 * f6));
                this.n.setBounds((int) (rectF.left + gm.L(9.0f)), (int) (rectF.top + gm.L(6.0f)), (int) (rectF.left + gm.L(45.0f)), (int) (rectF.top + gm.L(f3)));
                this.n.draw(canvas2);
            }
            if (this.x != null) {
                canvas2.save();
                hg9.m(this.x.getHeight(), f5, rectF.centerY(), (rectF.left + gm.L(52.0f)) - this.E, canvas2);
                this.c.setAlpha((int) (f9 * f6));
                this.x.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (f4 <= 0.0f && !this.F && !this.P) {
            this.P = true;
            post(new wq3(this, (byte) 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        u51 u51Var = this.h;
        if (action == 0 && (this.H || contains)) {
            u51Var.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (u51Var.i) {
                if (contains) {
                    if (this.H) {
                        Runnable runnable = this.R;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                u51Var.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            u51Var.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.R = runnable;
    }

    public void setProgress(float f) {
        this.I = f;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public xq3(Context context) {
        this(context, jb6.M0(2131746653, null));
    }
}
