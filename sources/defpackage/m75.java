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
public final class m75 extends FrameLayout implements tjb, p95 {
    public int E;
    public final TextPaint F;
    public final vh1 G;
    public float H;
    public boolean I;
    public q95 J;
    public final x95 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final n75 Q;
    public final pb0 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final be0 d;
    public long e;
    public gc2 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public h85 w;
    public String x;
    public String y;

    public m75(n75 n75Var, Context context) {
        super(context);
        this.Q = n75Var;
        pb0 pb0Var = new pb0((wjb) null);
        this.a = pb0Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new x95(gl.L(26.0f), gl.L(29.0f));
        pb0Var.s((int) (gl.L(18.0f) / 1.15f));
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var, nme.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(bkb.w0(null, bkb.jh, false));
        paint2.setColor(bkb.w0(null, bkb.gh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gl.L(2.0f));
        textPaint.setColor(-1);
        vh1 vh1Var = new vh1((byte) 2, context, this);
        this.G = vh1Var;
        vh1Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(vh1Var, nme.c(24.0f, 24));
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
        n75 n75Var = this.Q;
        h75 h75Var = n75Var.r;
        if (!h75Var.J) {
            h85 h85Var = this.w;
            if (z) {
                if (h85Var == null) {
                    this.w = h85.c(n75Var.h, n75Var.n, null, this, null, this.f, n75Var.c, h75Var);
                    return;
                }
                return;
            }
            if (h85Var != null) {
                h85Var.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int D = ug8.D(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, gl.L(22.0f) + D, gl.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(D, gl.L(53.0f));
            vh1 vh1Var = this.G;
            if (vh1Var.getDrawable() != null) {
                vh1Var.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                vh1Var.draw(canvas);
                vh1Var.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m75.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h85 h85Var = this.w;
        if (h85Var != null && !h85Var.b && !h85Var.r && h85Var.w && h85Var.a.d.isFirstFrameRendered() && h85Var.getAlpha() == 1.0f && !this.Q.r.v4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = gl.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), this.n);
            d(canvas);
        }
        be0 be0Var = this.d;
        float x = be0Var.getX() + (be0Var.getMeasuredWidth() / 2);
        float y = be0Var.getY() + (be0Var.getMeasuredHeight() / 2);
        x95 x95Var = this.K;
        x95Var.f();
        x95Var.a(canvas, x, y, this);
        float L = gl.L(46.0f) / gl.L(40.0f);
        float f = this.s;
        float f2 = (f * 1.0f) + ((1.0f - f) * L);
        be0Var.setScaleX(x95Var.b() * f2);
        be0Var.setScaleY(x95Var.b() * f2);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(gc2 gc2Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z;
        float f;
        this.f = gc2Var;
        this.h = groupCallParticipant;
        long j = this.e;
        long B1 = k27.B1(groupCallParticipant.peer);
        this.e = B1;
        int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        n75 n75Var = this.Q;
        int i2 = n75Var.d;
        be0 be0Var = this.d;
        pb0 pb0Var = this.a;
        boolean z2 = true;
        if (i > 0) {
            TLRPC.User V1 = na7.q1(j5.a(i2).a).V1(Long.valueOf(this.e));
            this.b = V1;
            this.c = null;
            pb0Var.q(V1);
            this.y = l7c.k(this.b, true);
            be0Var.getImageReceiver().d = i2;
            be0Var.m(gl5.l(y6c.t0, 1, this.b), "50_50", pb0Var, this.b);
        } else {
            TLRPC.Chat K0 = na7.q1(j5.a(i2).a).K0(Long.valueOf(-this.e));
            this.c = K0;
            this.b = null;
            pb0Var.p(K0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                be0Var.getImageReceiver().d = i2;
                be0Var.m(gl5.a(1, this.c), "50_50", pb0Var, this.c);
            }
        }
        boolean z3 = false;
        if (j == this.e) {
            z = true;
        } else {
            z = false;
        }
        e55 e55Var = n75Var.n;
        if (gc2Var == null) {
            if (e55Var.d != k27.B1(groupCallParticipant.peer)) {
                z2 = false;
            }
            this.I = z2;
            z3 = z2;
        } else {
            gc2 gc2Var2 = e55Var.e;
            if (gc2Var2 != null) {
                z3 = gc2Var2.equals(gc2Var);
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
        q95 q95Var = this.J;
        if (q95Var != null) {
            q95Var.h = groupCallParticipant;
            q95Var.c(z);
            f(z);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m75.f(boolean):void");
    }

    public be0 getAvatarImageView() {
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

    public h85 getRenderer() {
        return this.w;
    }

    public gc2 getVideoParticipant() {
        return this.f;
    }

    @Override
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        h85 h85Var = this.w;
        if (h85Var != null) {
            h85Var.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override
    public final void onAttachedToWindow() {
        q95 q95Var;
        super.onAttachedToWindow();
        n75 n75Var = this.Q;
        h75 h75Var = n75Var.r;
        if (n75Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (h75Var.l4.size() > 0) {
            q95Var = (q95) tb4.l(1, h75Var.l4);
            this.J = q95Var;
        } else {
            q95Var = new q95();
            this.J = q95Var;
        }
        q95Var.g = this;
        q95Var.c = this.G;
        q95Var.c(false);
        q95 q95Var2 = this.J;
        q95Var2.h = this.h;
        q95Var2.c(false);
        f(false);
        boolean z = this.J.e;
        x95 x95Var = this.K;
        x95Var.e(this, z);
        if (!this.J.e) {
            x95Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        q95 q95Var = this.J;
        if (q95Var != null) {
            this.Q.r.l4.add(q95Var);
            q95 q95Var2 = this.J;
            q95Var2.c = null;
            q95Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(gl.L(12.0f));
        if (this.y != null) {
            int min = (int) Math.min(gl.L(46.0f), textPaint.measureText(this.y));
            this.E = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAmplitude(double d) {
        q95 q95Var = this.J;
        if (q95Var != null) {
            q95Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f) {
        if (this.s != f) {
            this.s = f;
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            Paint paint = this.n;
            be0 be0Var = this.d;
            if (i == 0) {
                be0Var.setTranslationY(0.0f);
                be0Var.setScaleX(1.0f);
                be0Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                h85 h85Var = this.w;
                if (h85Var != null) {
                    h85Var.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((be0Var.getMeasuredHeight() / 2.0f) + be0Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f2 = 1.0f - f;
            float f3 = 1.0f * f;
            float L = f3 + ((gl.L(46.0f) / gl.L(40.0f)) * f2);
            be0Var.setTranslationY((-measuredHeight) * f2);
            be0Var.setScaleX(L);
            be0Var.setScaleY(L);
            paint.setAlpha((int) (f * 255.0f));
            invalidate();
            h85 h85Var2 = this.w;
            if (h85Var2 != null) {
                h85Var2.invalidate();
            }
        }
    }

    public void setRenderer(h85 h85Var) {
        this.w = h85Var;
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(bkb.w0(null, bkb.jh, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
