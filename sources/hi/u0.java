package hi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
public final class u0 extends View {
    public float E;
    public boolean F;
    public final org.telegram.ui.Components.d6 G;
    public boolean H;
    public float I;
    public final org.telegram.ui.Components.d6 J;
    public final org.telegram.ui.Components.d6 K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public boolean P;
    public t0 Q;
    public Runnable R;
    public final Paint f15525a;
    public final TextPaint f15526b;
    public final TextPaint f15527c;
    public final Paint d;
    public final Paint f15528e;
    public final Paint f15529f;
    public final mc h;
    public oh0 f15530n;
    public final StaticLayout f15531r;
    public final float f15532s;
    public final float f15533w;
    public StaticLayout f15534x;
    public float f15535y;

    public u0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f15525a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f15526b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f15527c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f15528e = paint3;
        Paint paint4 = new Paint(1);
        this.f15529f = paint4;
        this.h = new mc(this);
        this.F = false;
        this.G = new org.telegram.ui.Components.d6(0.0f, this, 0L, 350L, nr.h);
        this.H = true;
        this.I = 0.0f;
        this.J = new org.telegram.ui.Components.d6(this);
        this.K = new org.telegram.ui.Components.d6(this);
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
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.N(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, org.telegram.messenger.g0.f24046q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15531r = staticLayout;
        this.f15532s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f15533w = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.F = true;
        invalidate();
    }

    public final void a() {
        t0 t0Var = this.Q;
        if (t0Var != null) {
            org.telegram.messenger.g0.r(t0Var);
            this.Q = null;
        }
        this.F = false;
        invalidate();
    }

    public final void b(int i7, int i10, CharSequence charSequence) {
        float f10;
        oh0 oh0Var = this.f15530n;
        if (oh0Var != null) {
            oh0Var.setCallback(null);
            this.f15530n.C(true);
        }
        oh0 oh0Var2 = new oh0(i7, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        this.f15530n = oh0Var2;
        oh0Var2.setCallback(this);
        this.f15530n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f15527c, org.telegram.messenger.g0.f24046q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15534x = staticLayout;
        float f11 = 0.0f;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.f15534x.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f15535y = f10;
        if (this.f15534x.getLineCount() > 0) {
            f11 = this.f15534x.getLineLeft(0);
        }
        this.E = f11;
        this.H = false;
        invalidate();
        t0 t0Var = this.Q;
        if (t0Var != null) {
            org.telegram.messenger.g0.r(t0Var);
        }
        t0 t0Var2 = new t0(this, 1);
        this.Q = t0Var2;
        org.telegram.messenger.g0.h3(t0Var2, i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF rectF;
        float f15;
        int saveCount = canvas.getSaveCount();
        if (this.F) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.G.e(false, f10);
        if (this.H) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float e11 = this.J.e(false, f11);
        float f16 = 1.0f - e11;
        Paint paint = this.f15525a;
        paint.setAlpha((int) (90.0f * f16 * e10));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.f15532s, org.telegram.messenger.g0.L(54.0f)) + org.telegram.messenger.g0.L(42.0f);
        int L = org.telegram.messenger.g0.L(111.0f);
        StaticLayout staticLayout = this.f15531r;
        float height = staticLayout.getHeight() + L;
        RectF rectF2 = this.L;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float L2 = org.telegram.messenger.g0.L(74.0f) + this.f15535y;
        float L3 = org.telegram.messenger.g0.L(48.0f);
        RectF rectF3 = this.M;
        rectF3.set((getWidth() - L2) / 2.0f, (getHeight() - L3) / 2.0f, (getWidth() + L2) / 2.0f, (getHeight() + L3) / 2.0f);
        RectF rectF4 = this.N;
        org.telegram.messenger.g0.Z1(rectF2, rectF3, e11, rectF4);
        int i7 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        if (i7 < 0 && this.H) {
            f12 = 42.0f;
            RectF rectF5 = this.O;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            org.telegram.messenger.g0.Z1(rectF5, rectF4, e10, rectF4);
        } else {
            f12 = 42.0f;
        }
        if (i7 < 0 && !this.H) {
            canvas2.scale(org.telegram.messenger.g0.T1(0.8f, 1.0f, e10), org.telegram.messenger.g0.T1(0.8f, 1.0f, e10), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * e10));
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (e11 < 1.0f) {
            float f17 = f16 * e10;
            float e12 = this.K.e(false, this.I);
            float centerX = rectF2.centerX();
            float L4 = rectF2.top + org.telegram.messenger.g0.L(48.0f);
            float L5 = org.telegram.messenger.g0.L(25.0f);
            Paint paint3 = this.f15529f;
            paint3.setAlpha((int) (51.0f * f17));
            canvas2.drawCircle(centerX, L4, L5, paint3);
            RectF rectF6 = org.telegram.messenger.g0.P;
            f15 = 255.0f;
            rectF6.set(centerX - L5, L4 - L5, centerX + L5, L5 + L4);
            int i10 = (int) (f17 * 255.0f);
            Paint paint4 = this.f15528e;
            paint4.setAlpha(i10);
            paint4.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
            f13 = e10;
            f14 = 2.0f;
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * e12, false, paint4);
            float a10 = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a10, a10, centerX, L4);
            paint4.setStrokeWidth(org.telegram.messenger.g0.L(3.4f));
            canvas.drawLine(centerX - org.telegram.messenger.g0.L(7.0f), L4 - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f) + centerX, org.telegram.messenger.g0.L(7.0f) + L4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - org.telegram.messenger.g0.L(7.0f), L4 + org.telegram.messenger.g0.L(7.0f), centerX + org.telegram.messenger.g0.L(7.0f), L4 - org.telegram.messenger.g0.L(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(21.0f)) - this.f15533w, (rectF2.bottom - org.telegram.messenger.g0.L(18.0f)) - staticLayout.getHeight());
            this.f15526b.setAlpha(i10);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            f13 = e10;
            f14 = 2.0f;
            rectF = rectF3;
            f15 = 255.0f;
        }
        if (e11 > 0.0f) {
            float f18 = f13 * e11;
            oh0 oh0Var = this.f15530n;
            if (oh0Var != null) {
                oh0Var.setAlpha((int) (f18 * f15));
                this.f15530n.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(9.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(6.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(45.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(f12)));
                this.f15530n.draw(canvas2);
            }
            if (this.f15534x != null) {
                canvas2.save();
                o10.k(this.f15534x.getHeight(), f14, rectF.centerY(), (rectF.left + org.telegram.messenger.g0.L(52.0f)) - this.E, canvas2);
                this.f15527c.setAlpha((int) (f18 * f15));
                this.f15534x.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (f13 <= 0.0f && !this.F && !this.P) {
            this.P = true;
            post(new t0(this, 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        mc mcVar = this.h;
        if (action == 0 && (this.H || contains)) {
            mcVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (mcVar.f37478i) {
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
                mcVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            mcVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.R = runnable;
    }

    public void setProgress(float f10) {
        this.I = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15530n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public u0(Context context) {
        this(context, hd.N0(2131746724, null));
    }
}
