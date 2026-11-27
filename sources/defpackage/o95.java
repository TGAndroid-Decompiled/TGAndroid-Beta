package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class o95 extends FrameLayout implements snb, qb5 {
    public int E;
    public final TextPaint F;
    public final di1 G;
    public float H;
    public boolean I;
    public rb5 J;
    public final yb5 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final p95 Q;
    public final rb0 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final de0 d;
    public long e;
    public wc2 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public ka5 w;
    public String x;
    public String y;

    public o95(p95 p95Var, Context context) {
        super(context);
        this.Q = p95Var;
        rb0 rb0Var = new rb0((vnb) null);
        this.a = rb0Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new yb5(hl.L(26.0f), hl.L(29.0f));
        rb0Var.s((int) (hl.L(18.0f) / 1.15f));
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var, tre.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(aob.w0(null, aob.kh, false));
        paint2.setColor(aob.w0(null, aob.hh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.L(2.0f));
        textPaint.setColor(-1);
        di1 di1Var = new di1((byte) 2, context, this);
        this.G = di1Var;
        di1Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(di1Var, tre.c(24.0f, 24));
    }

    private void setSelectedProgress(float f) {
        if (this.H != f) {
            this.H = f;
            this.r.setAlpha((int) (f * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.K.e(this, this.J.e);
        f(true);
    }

    public final void b(boolean z) {
        p95 p95Var = this.Q;
        j95 j95Var = p95Var.r;
        if (!j95Var.J) {
            ka5 ka5Var = this.w;
            if (z) {
                if (ka5Var == null) {
                    this.w = ka5.c(p95Var.h, p95Var.n, null, this, null, this.f, p95Var.c, j95Var);
                    return;
                }
                return;
            }
            if (ka5Var != null) {
                ka5Var.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int D = ik8.D(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, hl.L(22.0f) + D, hl.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(D, hl.L(53.0f));
            di1 di1Var = this.G;
            if (di1Var.getDrawable() != null) {
                di1Var.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                di1Var.draw(canvas);
                di1Var.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o95.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ka5 ka5Var = this.w;
        if (ka5Var != null && !ka5Var.b && !ka5Var.r && ka5Var.w && ka5Var.a.d.c.P && ka5Var.getAlpha() == 1.0f && !this.Q.r.v4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = hl.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), this.n);
            d(canvas);
        }
        de0 de0Var = this.d;
        float x = de0Var.getX() + (de0Var.getMeasuredWidth() / 2);
        float y = de0Var.getY() + (de0Var.getMeasuredHeight() / 2);
        yb5 yb5Var = this.K;
        yb5Var.f();
        yb5Var.a(canvas, x, y, this);
        float L = hl.L(46.0f) / hl.L(40.0f);
        float f = this.s;
        float f2 = (f * 1.0f) + ((1.0f - f) * L);
        de0Var.setScaleX(yb5Var.b() * f2);
        de0Var.setScaleY(yb5Var.b() * f2);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(wc2 wc2Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z;
        float f;
        this.f = wc2Var;
        this.h = groupCallParticipant;
        long j = this.e;
        long B1 = r47.B1(groupCallParticipant.peer);
        this.e = B1;
        int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        p95 p95Var = this.Q;
        int i2 = p95Var.d;
        de0 de0Var = this.d;
        rb0 rb0Var = this.a;
        boolean z2 = true;
        if (i > 0) {
            TLRPC.User X1 = uc7.s1(k5.a(i2).a).X1(Long.valueOf(this.e));
            this.b = X1;
            this.c = null;
            rb0Var.q(X1);
            this.y = lbc.k(this.b, true);
            de0Var.getImageReceiver().d = i2;
            de0Var.m(jn5.l(yac.t0, 1, this.b), "50_50", rb0Var, this.b);
        } else {
            TLRPC.Chat M0 = uc7.s1(k5.a(i2).a).M0(Long.valueOf(-this.e));
            this.c = M0;
            this.b = null;
            rb0Var.p(M0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                de0Var.getImageReceiver().d = i2;
                de0Var.m(jn5.a(1, this.c), "50_50", rb0Var, this.c);
            }
        }
        boolean z3 = false;
        if (j == this.e) {
            z = true;
        } else {
            z = false;
        }
        g75 g75Var = p95Var.n;
        if (wc2Var == null) {
            if (g75Var.d != r47.B1(groupCallParticipant.peer)) {
                z2 = false;
            }
            this.I = z2;
            z3 = z2;
        } else {
            wc2 wc2Var2 = g75Var.e;
            if (wc2Var2 != null) {
                z3 = wc2Var2.equals(wc2Var);
                this.I = z3;
            } else {
                this.I = false;
            }
        }
        if (!z) {
            if (z3) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            setSelectedProgress(f);
        }
        rb5 rb5Var = this.J;
        if (rb5Var != null) {
            rb5Var.h = groupCallParticipant;
            rb5Var.c(z);
            f(z);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o95.f(boolean):void");
    }

    public de0 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.s;
    }

    public ka5 getRenderer() {
        return this.w;
    }

    public wc2 getVideoParticipant() {
        return this.f;
    }

    @Override
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        ka5 ka5Var = this.w;
        if (ka5Var != null) {
            ka5Var.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override
    public final void onAttachedToWindow() {
        rb5 rb5Var;
        super.onAttachedToWindow();
        p95 p95Var = this.Q;
        j95 j95Var = p95Var.r;
        if (p95Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (j95Var.l4.size() > 0) {
            rb5Var = (rb5) qd4.l(1, j95Var.l4);
            this.J = rb5Var;
        } else {
            rb5Var = new rb5();
            this.J = rb5Var;
        }
        rb5Var.g = this;
        rb5Var.c = this.G;
        rb5Var.c(false);
        rb5 rb5Var2 = this.J;
        rb5Var2.h = this.h;
        rb5Var2.c(false);
        f(false);
        boolean z = this.J.e;
        yb5 yb5Var = this.K;
        yb5Var.e(this, z);
        if (!this.J.e) {
            yb5Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        rb5 rb5Var = this.J;
        if (rb5Var != null) {
            this.Q.r.l4.add(rb5Var);
            rb5 rb5Var2 = this.J;
            rb5Var2.c = null;
            rb5Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(hl.L(12.0f));
        if (this.y != null) {
            int min = (int) Math.min(hl.L(46.0f), textPaint.measureText(this.y));
            this.E = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAmplitude(double d) {
        rb5 rb5Var = this.J;
        if (rb5Var != null) {
            rb5Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f) {
        if (this.s != f) {
            this.s = f;
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            Paint paint = this.n;
            de0 de0Var = this.d;
            if (i == 0) {
                de0Var.setTranslationY(0.0f);
                de0Var.setScaleX(1.0f);
                de0Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                ka5 ka5Var = this.w;
                if (ka5Var != null) {
                    ka5Var.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((de0Var.getMeasuredHeight() / 2.0f) + de0Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f2 = 1.0f - f;
            float f3 = 1.0f * f;
            float L = f3 + ((hl.L(46.0f) / hl.L(40.0f)) * f2);
            de0Var.setTranslationY((-measuredHeight) * f2);
            de0Var.setScaleX(L);
            de0Var.setScaleY(L);
            paint.setAlpha((int) (f * 255.0f));
            invalidate();
            ka5 ka5Var2 = this.w;
            if (ka5Var2 != null) {
                ka5Var2.invalidate();
            }
        }
    }

    public void setRenderer(ka5 ka5Var) {
        this.w = ka5Var;
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(aob.w0(null, aob.kh, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
