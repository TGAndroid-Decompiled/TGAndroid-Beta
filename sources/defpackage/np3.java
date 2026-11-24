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
public final class np3 extends View {
    public float E;
    public boolean F;
    public final lm G;
    public boolean H;
    public float I;
    public final lm J;
    public final lm K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public boolean P;
    public mp3 Q;
    public Runnable R;
    public final Paint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final n41 h;
    public oy8 n;
    public final StaticLayout r;
    public final float s;
    public final float w;
    public StaticLayout x;
    public float y;

    public np3(Context context, String str) {
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
        this.h = new n41(this);
        this.F = false;
        this.G = new lm(0.0f, this, 0L, 350L, s33.h);
        this.H = true;
        this.I = 0.0f;
        this.J = new lm(this);
        this.K = new lm(this);
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
        paint3.setStrokeWidth(gl.L(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(gl.L(4.0f));
        textPaint.setTextSize(gl.L(14.0f));
        textPaint2.setTextSize(gl.N(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, gl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        mp3 mp3Var = this.Q;
        if (mp3Var != null) {
            gl.r(mp3Var);
            this.Q = null;
        }
        this.F = false;
        invalidate();
    }

    public final void b(int i, int i2, String str) {
        float f;
        oy8 oy8Var = this.n;
        if (oy8Var != null) {
            oy8Var.setCallback(null);
            this.n.x(true);
        }
        oy8 oy8Var2 = new oy8(i, gl.L(36.0f), gl.L(36.0f));
        this.n = oy8Var2;
        oy8Var2.setCallback(this);
        this.n.start();
        StaticLayout staticLayout = new StaticLayout(str, this.c, gl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        mp3 mp3Var = this.Q;
        if (mp3Var != null) {
            gl.r(mp3Var);
        }
        mp3 mp3Var2 = new mp3(this, (byte) 1);
        this.Q = mp3Var2;
        gl.e3(mp3Var2, i2);
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
        float max = Math.max(this.s, gl.L(54.0f)) + gl.L(42.0f);
        int L = gl.L(111.0f);
        StaticLayout staticLayout = this.r;
        float height = staticLayout.getHeight() + L;
        RectF rectF2 = this.L;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float L2 = gl.L(74.0f) + this.y;
        float L3 = gl.L(48.0f);
        RectF rectF3 = this.M;
        rectF3.set((getWidth() - L2) / 2.0f, (getHeight() - L3) / 2.0f, (getWidth() + L2) / 2.0f, (getHeight() + L3) / 2.0f);
        RectF rectF4 = this.N;
        gl.X1(rectF2, rectF3, e2, rectF4);
        int i = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i < 0 && this.H) {
            f3 = 42.0f;
            RectF rectF5 = this.O;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            gl.X1(rectF5, rectF4, e, rectF4);
        } else {
            f3 = 42.0f;
        }
        if (i < 0 && !this.H) {
            canvas2.scale(gl.R1(0.8f, 1.0f, e), gl.R1(0.8f, 1.0f, e), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * e));
        canvas2.drawRoundRect(rectF4, gl.L(10.0f), gl.L(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (e2 < 1.0f) {
            float f8 = f7 * e;
            float e3 = this.K.e(false, this.I);
            float centerX = rectF2.centerX();
            float L4 = rectF2.top + gl.L(48.0f);
            float L5 = gl.L(25.0f);
            Paint paint3 = this.f;
            paint3.setAlpha((int) (51.0f * f8));
            canvas2.drawCircle(centerX, L4, L5, paint3);
            RectF rectF6 = gl.P;
            f6 = 255.0f;
            rectF6.set(centerX - L5, L4 - L5, centerX + L5, L5 + L4);
            int i2 = (int) (f8 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i2);
            paint4.setStrokeWidth(gl.L(4.0f));
            f4 = e;
            f5 = 2.0f;
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * e3, false, paint4);
            float a = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a, a, centerX, L4);
            paint4.setStrokeWidth(gl.L(3.4f));
            canvas.drawLine(centerX - gl.L(7.0f), L4 - gl.L(7.0f), gl.L(7.0f) + centerX, gl.L(7.0f) + L4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - gl.L(7.0f), L4 + gl.L(7.0f), centerX + gl.L(7.0f), L4 - gl.L(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + gl.L(21.0f)) - this.w, (rectF2.bottom - gl.L(18.0f)) - staticLayout.getHeight());
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
            oy8 oy8Var = this.n;
            if (oy8Var != null) {
                oy8Var.setAlpha((int) (f9 * f6));
                this.n.setBounds((int) (rectF.left + gl.L(9.0f)), (int) (rectF.top + gl.L(6.0f)), (int) (rectF.left + gl.L(45.0f)), (int) (rectF.top + gl.L(f3)));
                this.n.draw(canvas2);
            }
            if (this.x != null) {
                canvas2.save();
                de9.n(this.x.getHeight(), f5, rectF.centerY(), (rectF.left + gl.L(52.0f)) - this.E, canvas2);
                this.c.setAlpha((int) (f9 * f6));
                this.x.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (f4 <= 0.0f && !this.F && !this.P) {
            this.P = true;
            post(new mp3(this, (byte) 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        n41 n41Var = this.h;
        if (action == 0 && (this.H || contains)) {
            n41Var.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (n41Var.i) {
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
                n41Var.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            n41Var.c(false);
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

    public np3(Context context) {
        this(context, k96.M0(2131746727, null));
    }
}
