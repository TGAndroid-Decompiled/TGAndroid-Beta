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
public final class lj9 extends kj9 {
    public in3 d0;
    public u51 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public int k0;
    public final Drawable l0;
    public int m0;

    public lj9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(uj9Var, rect, i, spannableStringBuilder);
        this.l0 = b10.d(a.b, 2131230872);
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
        u51 u51Var = this.e0;
        if (u51Var != null) {
            f = u51Var.a(0.01f);
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
                this.d0 = new in3((byte) 7);
            }
            RectF rectF = gm.P;
            rectF.set(0.0f, i3 - gm.L(24.0f), i2, i3 + 1);
            this.d0.r(canvas, rectF, 3, this.j0);
            canvas.restore();
        }
        canvas.restore();
        uj9 uj9Var = this.a;
        int h = uj9Var.y.h();
        int i4 = this.m0;
        Drawable drawable = this.l0;
        if (h != i4) {
            int h2 = uj9Var.y.h();
            this.m0 = h2;
            drawable.setColorFilter(new PorterDuffColorFilter(h2, PorterDuff.Mode.SRC_IN));
        }
        ur3.e(this.l0, uj9Var.C - gm.L(24.0f), gm.L(8.0f) + ((i3 - gm.L(16.0f)) - gm.L(2.0f)), gm.L(16.0f), gm.L(16.0f), 17);
        canvas.save();
        canvas.rotate(gm.U1(this.j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
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
        uj9 uj9Var = this.a;
        if (actionMasked == 0) {
            boolean X = super.X(motionEvent);
            this.g0 = X;
            if (!X) {
                this.f0 = true;
                u51 u51Var = this.e0;
                if (u51Var == null && (view = uj9Var.Q) != null) {
                    u51Var = new u51(view);
                    this.e0 = u51Var;
                }
                if (u51Var != null) {
                    u51Var.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f0) {
                return false;
            }
            this.f0 = false;
            u51 u51Var2 = this.e0;
            if (u51Var2 != null) {
                u51Var2.c(false);
            }
            View view2 = uj9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            uj9Var.W();
            this.h0 = !this.h0;
            uj9Var.u = true;
            uj9Var.P();
            View view3 = uj9Var.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            rc2 rc2Var = uj9Var.E;
            mc2 mc2Var = uj9Var.F;
            if (rc2Var != null && mc2Var != null) {
                mc2Var.u1(rc2Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f0 = false;
                u51 u51Var3 = this.e0;
                if (u51Var3 != null) {
                    u51Var3.c(false);
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
        u51 u51Var = this.e0;
        if (u51Var != null) {
            return u51Var.a(0.01f);
        }
        return 1.0f;
    }
}
