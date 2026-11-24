package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_iv;
public final class ih9 extends hh9 {
    public xl3 d0;
    public n41 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public ih9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(rh9Var, rect, i, spannableStringBuilder);
        this.l0 = b00.d(a.b, 2131230871);
        boolean z = pageblockblockquote.collapsed;
        this.h0 = z;
        this.i0 = z;
    }

    @Override
    public final int I() {
        if (this.h0) {
            Rect rect = this.b;
            return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.I());
        }
        return super.I();
    }

    @Override
    public final void W(Canvas canvas) {
        float f;
        boolean z;
        n41 n41Var = this.e0;
        if (n41Var != null) {
            f = n41Var.a(0.01f);
        } else {
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int i2 = this.c;
        if (i != 0) {
            canvas.save();
            canvas.scale(f, f, i2 / 2.0f, I() / 2.0f);
        }
        if (this.j0 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        int i3 = (this.k0 - this.b.bottom) - this.b0;
        canvas.save();
        canvas.clipRect(0, 0, i2, i3);
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, i2, i3, null);
        }
        super.W(canvas);
        if (z) {
            if (this.d0 == null) {
                this.d0 = new xl3((byte) 7);
            }
            RectF rectF = gl.P;
            rectF.set(0.0f, i3 - gl.L(24.0f), i2, i3 + 1);
            this.d0.s(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        rh9 rh9Var = this.a;
        int h = rh9Var.y.h();
        int i4 = this.m0;
        Drawable drawable = this.l0;
        if (h != i4) {
            int h2 = rh9Var.y.h();
            this.m0 = h2;
            drawable.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
        }
        kq3.e(this.l0, rh9Var.C - gl.L(24.0f), gl.L(8.0f) + ((i3 - gl.L(16.0f)) - gl.L(2.0f)), gl.L(16.0f), gl.L(16.0f), 17);
        canvas.save();
        canvas.rotate(gl.U1(this.j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (i != 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.Y(motionEvent);
        }
        rh9 rh9Var = this.a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.g0 = Y;
            if (!Y) {
                this.f0 = true;
                n41 n41Var = this.e0;
                if (n41Var == null && (view = rh9Var.Q) != null) {
                    n41Var = new n41(view);
                    this.e0 = n41Var;
                }
                if (n41Var != null) {
                    n41Var.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            n41 n41Var2 = this.e0;
            if (n41Var2 != null) {
                n41Var2.c(false);
            }
            View view2 = rh9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            rh9Var.W();
            this.h0 = !this.h0;
            rh9Var.u = true;
            rh9Var.P();
            View view3 = rh9Var.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            gb2 gb2Var = rh9Var.E;
            bb2 bb2Var = rh9Var.F;
            if (gb2Var != null && bb2Var != null) {
                bb2Var.G1(gb2Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f0 = false;
                n41 n41Var3 = this.e0;
                if (n41Var3 != null) {
                    n41Var3.c(false);
                }
            }
            return this.f0;
        }
        return true;
    }

    @Override
    public final void d0() {
        super.d0();
        this.i0 = this.h0;
    }

    @Override
    public final float z() {
        n41 n41Var = this.e0;
        if (n41Var != null) {
            return n41Var.a(0.01f);
        }
        return 1.0f;
    }
}
