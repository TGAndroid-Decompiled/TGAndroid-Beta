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
public final class yk9 extends xk9 {
    public pm3 d0;
    public v41 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public yk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(hl9Var, rect, i, spannableStringBuilder);
        this.l0 = c00.e(a.b, 2131230871);
        boolean z = pageblockblockquote.collapsed;
        this.h0 = z;
        this.i0 = z;
    }

    @Override
    public final int H() {
        if (this.h0) {
            Rect rect = this.b;
            return (int) Math.min((this.X.b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.a0 + rect.bottom, super.H());
        }
        return super.H();
    }

    @Override
    public final void V(Canvas canvas) {
        float f;
        boolean z;
        v41 v41Var = this.e0;
        if (v41Var != null) {
            f = v41Var.a(0.01f);
        } else {
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int i2 = this.c;
        if (i != 0) {
            canvas.save();
            canvas.scale(f, f, i2 / 2.0f, H() / 2.0f);
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
        super.V(canvas);
        if (z) {
            if (this.d0 == null) {
                this.d0 = new pm3((byte) 7);
            }
            RectF rectF = hl.P;
            rectF.set(0.0f, i3 - hl.L(24.0f), i2, i3 + 1);
            this.d0.r(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        hl9 hl9Var = this.a;
        int h = hl9Var.y.h();
        int i4 = this.m0;
        Drawable drawable = this.l0;
        if (h != i4) {
            int h2 = hl9Var.y.h();
            this.m0 = h2;
            drawable.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
        }
        br3.e(this.l0, hl9Var.C - hl.L(24.0f), hl.L(8.0f) + ((i3 - hl.L(16.0f)) - hl.L(2.0f)), hl.L(16.0f), hl.L(16.0f), 17);
        canvas.save();
        canvas.rotate(hl.U1(this.j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (i != 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g0 = false;
            }
            return super.X(motionEvent);
        }
        hl9 hl9Var = this.a;
        if (actionMasked == 0) {
            boolean X = super.X(motionEvent);
            this.g0 = X;
            if (!X) {
                this.f0 = true;
                v41 v41Var = this.e0;
                if (v41Var == null && (view = hl9Var.Q) != null) {
                    v41Var = new v41(view);
                    this.e0 = v41Var;
                }
                if (v41Var != null) {
                    v41Var.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            v41 v41Var2 = this.e0;
            if (v41Var2 != null) {
                v41Var2.c(false);
            }
            View view2 = hl9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            hl9Var.W();
            this.h0 = !this.h0;
            hl9Var.u = true;
            hl9Var.P();
            View view3 = hl9Var.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            wb2 wb2Var = hl9Var.E;
            rb2 rb2Var = hl9Var.F;
            if (wb2Var != null && rb2Var != null) {
                rb2Var.r1(wb2Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f0 = false;
                v41 v41Var3 = this.e0;
                if (v41Var3 != null) {
                    v41Var3.c(false);
                }
            }
            return this.f0;
        }
        return true;
    }

    @Override
    public final void c0() {
        super.c0();
        this.i0 = this.h0;
    }

    @Override
    public final float y() {
        v41 v41Var = this.e0;
        if (v41Var != null) {
            return v41Var.a(0.01f);
        }
        return 1.0f;
    }
}
