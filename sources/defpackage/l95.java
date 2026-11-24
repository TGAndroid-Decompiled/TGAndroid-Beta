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
public final class l95 extends FrameLayout implements vlb, nb5 {
    public int E;
    public final TextPaint F;
    public final cj1 G;
    public float H;
    public boolean I;
    public ob5 J;
    public final vb5 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final m95 Q;
    public final pc0 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final bf0 d;
    public long e;
    public rd2 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public ha5 w;
    public String x;
    public String y;

    public l95(m95 m95Var, Context context) {
        super(context);
        this.Q = m95Var;
        pc0 pc0Var = new pc0((ylb) null);
        this.a = pc0Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new vb5(gm.L(26.0f), gm.L(29.0f));
        pc0Var.s((int) (gm.L(18.0f) / 1.15f));
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var, qoe.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(cmb.w0(null, cmb.jh, false));
        paint2.setColor(cmb.w0(null, cmb.gh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gm.L(2.0f));
        textPaint.setColor(-1);
        cj1 cj1Var = new cj1((byte) 2, context, this);
        this.G = cj1Var;
        cj1Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(cj1Var, qoe.c(24.0f, 24));
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
        m95 m95Var = this.Q;
        g95 g95Var = m95Var.r;
        if (!g95Var.J) {
            ha5 ha5Var = this.w;
            if (z) {
                if (ha5Var == null) {
                    this.w = ha5.c(m95Var.h, m95Var.n, null, this, null, this.f, m95Var.c, g95Var);
                    return;
                }
                return;
            }
            if (ha5Var != null) {
                ha5Var.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int D = wi8.D(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, gm.L(22.0f) + D, gm.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(D, gm.L(53.0f));
            cj1 cj1Var = this.G;
            if (cj1Var.getDrawable() != null) {
                cj1Var.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                cj1Var.draw(canvas);
                cj1Var.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l95.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ha5 ha5Var = this.w;
        if (ha5Var != null && !ha5Var.b && !ha5Var.r && ha5Var.w && ha5Var.a.d.isFirstFrameRendered() && ha5Var.getAlpha() == 1.0f && !this.Q.r.v4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = gm.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), this.n);
            d(canvas);
        }
        bf0 bf0Var = this.d;
        float x = bf0Var.getX() + (bf0Var.getMeasuredWidth() / 2);
        float y = bf0Var.getY() + (bf0Var.getMeasuredHeight() / 2);
        vb5 vb5Var = this.K;
        vb5Var.f();
        vb5Var.a(canvas, x, y, this);
        float L = gm.L(46.0f) / gm.L(40.0f);
        float f = this.s;
        float f2 = (f * 1.0f) + ((1.0f - f) * L);
        bf0Var.setScaleX(vb5Var.b() * f2);
        bf0Var.setScaleY(vb5Var.b() * f2);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(rd2 rd2Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z;
        float f;
        this.f = rd2Var;
        this.h = groupCallParticipant;
        long j = this.e;
        long B1 = k47.B1(groupCallParticipant.peer);
        this.e = B1;
        int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        m95 m95Var = this.Q;
        int i2 = m95Var.d;
        bf0 bf0Var = this.d;
        pc0 pc0Var = this.a;
        boolean z2 = true;
        if (i > 0) {
            TLRPC.User W1 = oc7.r1(j5.a(i2).a).W1(Long.valueOf(this.e));
            this.b = W1;
            this.c = null;
            pc0Var.q(W1);
            this.y = m9c.k(this.b, true);
            bf0Var.getImageReceiver().d = i2;
            bf0Var.m(gn5.l(z8c.t0, 1, this.b), "50_50", pc0Var, this.b);
        } else {
            TLRPC.Chat L0 = oc7.r1(j5.a(i2).a).L0(Long.valueOf(-this.e));
            this.c = L0;
            this.b = null;
            pc0Var.p(L0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                bf0Var.getImageReceiver().d = i2;
                bf0Var.m(gn5.a(1, this.c), "50_50", pc0Var, this.c);
            }
        }
        boolean z3 = false;
        if (j == this.e) {
            z = true;
        } else {
            z = false;
        }
        c75 c75Var = m95Var.n;
        if (rd2Var == null) {
            if (c75Var.d != k47.B1(groupCallParticipant.peer)) {
                z2 = false;
            }
            this.I = z2;
            z3 = z2;
        } else {
            rd2 rd2Var2 = c75Var.e;
            if (rd2Var2 != null) {
                z3 = rd2Var2.equals(rd2Var);
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
        ob5 ob5Var = this.J;
        if (ob5Var != null) {
            ob5Var.h = groupCallParticipant;
            ob5Var.c(z);
            f(z);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l95.f(boolean):void");
    }

    public bf0 getAvatarImageView() {
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

    public ha5 getRenderer() {
        return this.w;
    }

    public rd2 getVideoParticipant() {
        return this.f;
    }

    @Override
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        ha5 ha5Var = this.w;
        if (ha5Var != null) {
            ha5Var.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override
    public final void onAttachedToWindow() {
        ob5 ob5Var;
        super.onAttachedToWindow();
        m95 m95Var = this.Q;
        g95 g95Var = m95Var.r;
        if (m95Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (g95Var.l4.size() > 0) {
            ob5Var = (ob5) td4.m(1, g95Var.l4);
            this.J = ob5Var;
        } else {
            ob5Var = new ob5();
            this.J = ob5Var;
        }
        ob5Var.g = this;
        ob5Var.c = this.G;
        ob5Var.c(false);
        ob5 ob5Var2 = this.J;
        ob5Var2.h = this.h;
        ob5Var2.c(false);
        f(false);
        boolean z = this.J.e;
        vb5 vb5Var = this.K;
        vb5Var.e(this, z);
        if (!this.J.e) {
            vb5Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        ob5 ob5Var = this.J;
        if (ob5Var != null) {
            this.Q.r.l4.add(ob5Var);
            ob5 ob5Var2 = this.J;
            ob5Var2.c = null;
            ob5Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(gm.L(12.0f));
        if (this.y != null) {
            int min = (int) Math.min(gm.L(46.0f), textPaint.measureText(this.y));
            this.E = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAmplitude(double d) {
        ob5 ob5Var = this.J;
        if (ob5Var != null) {
            ob5Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f) {
        if (this.s != f) {
            this.s = f;
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            Paint paint = this.n;
            bf0 bf0Var = this.d;
            if (i == 0) {
                bf0Var.setTranslationY(0.0f);
                bf0Var.setScaleX(1.0f);
                bf0Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                ha5 ha5Var = this.w;
                if (ha5Var != null) {
                    ha5Var.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((bf0Var.getMeasuredHeight() / 2.0f) + bf0Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f2 = 1.0f - f;
            float f3 = 1.0f * f;
            float L = f3 + ((gm.L(46.0f) / gm.L(40.0f)) * f2);
            bf0Var.setTranslationY((-measuredHeight) * f2);
            bf0Var.setScaleX(L);
            bf0Var.setScaleY(L);
            paint.setAlpha((int) (f * 255.0f));
            invalidate();
            ha5 ha5Var2 = this.w;
            if (ha5Var2 != null) {
                ha5Var2.invalidate();
            }
        }
    }

    public void setRenderer(ha5 ha5Var) {
        this.w = ha5Var;
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(cmb.w0(null, cmb.jh, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
