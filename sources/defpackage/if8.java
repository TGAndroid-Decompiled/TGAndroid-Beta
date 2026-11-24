package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class if8 extends hf0 implements wu9, sp3, tjb {
    public byte E;
    public int F;
    public int G;
    public boolean H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f;
    public k27 h;
    public int n;
    public TextPaint r;
    public xu9 s;
    public ms8 w;
    public int x;
    public int y;

    @Override
    public final void B(boolean z) {
        x();
    }

    @Override
    public final void N(String str) {
        x();
    }

    @Override
    public final void f(float f) {
        k27 k27Var = this.h;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        MediaController.w().h0(this.h, f);
    }

    public final k27 getMessageObject() {
        return this.h;
    }

    @Override
    public int getObserverTag() {
        return this.L;
    }

    @Override
    public final void i(long j, long j2) {
        this.w.a(Math.min(1.0f, ((float) j) / ((float) j2)));
        if (this.E != 3) {
            x();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        up3.q(this.n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f) {
                requestLayout();
                return;
            }
            Point point = gl.q;
            int i = point.y;
            int i2 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i = view.getMeasuredHeight();
                i2 = measuredWidth;
            }
            bkb.p3.o((int) getY(), i2, i);
            m17 m17Var = bkb.p3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (m17Var != null) {
                m17Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            bkb.p3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            byte b = this.E;
            if (b != 0 && b != 1) {
                canvas.translate(gl.L(12.0f) + this.x, this.y);
                ms8 ms8Var = this.w;
                float f = ms8Var.e / 2;
                float f2 = ms8Var.f / 2.0f;
                canvas.drawRect(0.0f, f - f2, ms8Var.d, f2 + f, ms8Var.a);
                float f3 = ms8Var.e / 2;
                canvas.drawRect(0.0f, f3 - f2, ms8Var.c * ms8Var.d, f2 + f3, ms8Var.b);
            } else {
                canvas.translate(this.x, this.y);
                this.s.b(canvas);
            }
            canvas.restore();
            byte b2 = this.E;
            this.r.setColor(-6182221);
            Drawable drawable = bkb.T4[b2][this.H ? 1 : 0];
            int L = gl.L(36.0f);
            hf0.t(((L - drawable.getIntrinsicWidth()) / 2) + this.F, ((L - drawable.getIntrinsicHeight()) / 2) + this.G, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.J, gl.L(18.0f));
            this.I.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ms8 ms8Var = this.w;
        if (this.h != null) {
            this.x = gl.L(54.0f);
            this.F = gl.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - gl.L(16.0f);
            this.s.h((getMeasuredWidth() - gl.L(70.0f)) - this.K, gl.L(30.0f));
            ms8Var.d = (getMeasuredWidth() - gl.L(94.0f)) - this.K;
            ms8Var.e = gl.L(30.0f);
            this.y = gl.L(13.0f);
            this.G = gl.L(10.0f);
            y();
            if (!z && this.f) {
                return;
            }
            this.f = true;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(k27 k27Var) {
        if (this.h != k27Var) {
            this.n = k27Var.K1;
            xu9 xu9Var = this.s;
            int i = bkb.ke;
            int w0 = bkb.w0(null, i, false);
            int w02 = bkb.w0(null, i, false);
            int i2 = bkb.ne;
            xu9Var.f(w0, w02, bkb.w0(null, i2, false), bkb.w0(null, i2, false), bkb.w0(null, bkb.me, false));
            ms8 ms8Var = this.w;
            ms8Var.a.setColor(-2497813);
            ms8Var.b.setColor(-7944712);
            this.h = k27Var;
            this.f = false;
            requestLayout();
        }
        x();
    }

    @Override
    public final void updateColors() {
        try {
            xu9 xu9Var = this.s;
            if (xu9Var != null && this.h != null) {
                int i = bkb.ke;
                int w0 = bkb.w0(null, i, false);
                int w02 = bkb.w0(null, i, false);
                int i2 = bkb.ne;
                xu9Var.f(w0, w02, bkb.w0(null, i2, false), bkb.w0(null, i2, false), bkb.w0(null, bkb.me, false));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void x() {
        ms8 ms8Var = this.w;
        String S0 = this.h.S0();
        ba4.G(this.n);
        boolean exists = ba4.M(this.h.k, false, true).exists();
        int i = this.n;
        if (exists) {
            up3.q(i).v(this);
            boolean D = MediaController.w().D(this.h);
            if (D && (!D || !MediaController.w().C())) {
                this.E = (byte) 1;
            } else {
                this.E = (byte) 0;
            }
            ms8Var.a(0.0f);
        } else {
            up3.q(i).a(S0, null, this);
            if (!ba4.G(this.n).S(S0)) {
                this.E = (byte) 2;
                ms8Var.a(0.0f);
            } else {
                this.E = (byte) 3;
                Float s = fl5.z().s(S0);
                if (s != null) {
                    ms8Var.a(s.floatValue());
                } else {
                    ms8Var.a(0.0f);
                }
            }
        }
        y();
    }

    public final void y() {
        int i;
        TextPaint textPaint = this.r;
        k27 k27Var = this.h;
        if (k27Var == null) {
            return;
        }
        xu9 xu9Var = this.s;
        if (!xu9Var.e) {
            xu9Var.g(k27Var.b0);
        }
        if (!MediaController.w().D(this.h)) {
            int i2 = 0;
            while (true) {
                if (i2 < this.h.F0().attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i = (int) documentAttribute.duration;
                        break;
                    }
                    i2++;
                } else {
                    i = 0;
                    break;
                }
            }
        } else {
            i = this.h.i0;
        }
        String g0 = gl.g0(i, true, false);
        this.K = (int) Math.ceil(textPaint.measureText(g0));
        this.I = new StaticLayout(g0, textPaint, this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void h(float f) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
