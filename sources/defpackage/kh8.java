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
public final class kh8 extends hg0 implements zw9, cr3, vlb {
    public byte E;
    public int F;
    public int G;
    public boolean H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f;
    public k47 h;
    public int n;
    public TextPaint r;
    public ax9 s;
    public nu8 w;
    public int x;
    public int y;

    @Override
    public final void A(boolean z) {
        v();
    }

    @Override
    public final void N(String str) {
        v();
    }

    @Override
    public final void f(float f) {
        k47 k47Var = this.h;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(this.h, f);
    }

    public final k47 getMessageObject() {
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
            v();
        }
        invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        er3.q(this.n).v(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f) {
                requestLayout();
                return;
            }
            Point point = gm.q;
            int i = point.y;
            int i2 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i = view.getMeasuredHeight();
                i2 = measuredWidth;
            }
            cmb.p3.o((int) getY(), i2, i);
            m37 m37Var = cmb.p3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (m37Var != null) {
                m37Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            cmb.p3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            byte b = this.E;
            if (b != 0 && b != 1) {
                canvas.translate(gm.L(12.0f) + this.x, this.y);
                nu8 nu8Var = this.w;
                float f = nu8Var.e / 2;
                float f2 = nu8Var.f / 2.0f;
                canvas.drawRect(0.0f, f - f2, nu8Var.d, f2 + f, nu8Var.a);
                float f3 = nu8Var.e / 2;
                canvas.drawRect(0.0f, f3 - f2, nu8Var.c * nu8Var.d, f2 + f3, nu8Var.b);
            } else {
                canvas.translate(this.x, this.y);
                this.s.b(canvas);
            }
            canvas.restore();
            byte b2 = this.E;
            this.r.setColor(-6182221);
            Drawable drawable = cmb.T4[b2][this.H ? 1 : 0];
            int L = gm.L(36.0f);
            hg0.s(((L - drawable.getIntrinsicWidth()) / 2) + this.F, ((L - drawable.getIntrinsicHeight()) / 2) + this.G, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.J, gm.L(18.0f));
            this.I.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        nu8 nu8Var = this.w;
        if (this.h != null) {
            this.x = gm.L(54.0f);
            this.F = gm.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - gm.L(16.0f);
            this.s.h((getMeasuredWidth() - gm.L(70.0f)) - this.K, gm.L(30.0f));
            nu8Var.d = (getMeasuredWidth() - gm.L(94.0f)) - this.K;
            nu8Var.e = gm.L(30.0f);
            this.y = gm.L(13.0f);
            this.G = gm.L(10.0f);
            w();
            if (!z && this.f) {
                return;
            }
            this.f = true;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(56.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMessageObject(k47 k47Var) {
        if (this.h != k47Var) {
            this.n = k47Var.K1;
            ax9 ax9Var = this.s;
            int i = cmb.ke;
            int w0 = cmb.w0(null, i, false);
            int w02 = cmb.w0(null, i, false);
            int i2 = cmb.ne;
            ax9Var.f(w0, w02, cmb.w0(null, i2, false), cmb.w0(null, i2, false), cmb.w0(null, cmb.me, false));
            nu8 nu8Var = this.w;
            nu8Var.a.setColor(-2497813);
            nu8Var.b.setColor(-7944712);
            this.h = k47Var;
            this.f = false;
            requestLayout();
        }
        v();
    }

    @Override
    public final void updateColors() {
        try {
            ax9 ax9Var = this.s;
            if (ax9Var != null && this.h != null) {
                int i = cmb.ke;
                int w0 = cmb.w0(null, i, false);
                int w02 = cmb.w0(null, i, false);
                int i2 = cmb.ne;
                ax9Var.f(w0, w02, cmb.w0(null, i2, false), cmb.w0(null, i2, false), cmb.w0(null, cmb.me, false));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v() {
        nu8 nu8Var = this.w;
        String S0 = this.h.S0();
        bc4.G(this.n);
        boolean exists = bc4.M(this.h.k, false, true).exists();
        int i = this.n;
        if (exists) {
            er3.q(i).v(this);
            boolean D = MediaController.w().D(this.h);
            if (D && (!D || !MediaController.w().C())) {
                this.E = (byte) 1;
            } else {
                this.E = (byte) 0;
            }
            nu8Var.a(0.0f);
        } else {
            er3.q(i).a(S0, null, this);
            if (!bc4.G(this.n).S(S0)) {
                this.E = (byte) 2;
                nu8Var.a(0.0f);
            } else {
                this.E = (byte) 3;
                Float s = fn5.z().s(S0);
                if (s != null) {
                    nu8Var.a(s.floatValue());
                } else {
                    nu8Var.a(0.0f);
                }
            }
        }
        w();
    }

    public final void w() {
        int i;
        TextPaint textPaint = this.r;
        k47 k47Var = this.h;
        if (k47Var == null) {
            return;
        }
        ax9 ax9Var = this.s;
        if (!ax9Var.e) {
            ax9Var.g(k47Var.b0);
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
        String g0 = gm.g0(i, true, false);
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
