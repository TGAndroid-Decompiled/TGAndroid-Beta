package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class vu extends uu {
    public h6.m f27580d0;
    public org.telegram.ui.Components.mc f27581e0;
    public boolean f27582f0;
    public boolean f27583g0;
    public boolean f27584h0;
    public boolean f27585i0;
    public float f27586j0;
    public int f27587k0;
    public final Drawable f27588l0;
    public int m0;

    public vu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(fvVar, rect, i7, spannableStringBuilder);
        this.f27588l0 = i5.c.g(t0.f26895b, 2131230871);
        boolean z10 = pageblockblockquote.collapsed;
        this.f27584h0 = z10;
        this.f27585i0 = z10;
    }

    @Override
    public final int I() {
        if (this.f27584h0) {
            Rect rect = this.f22933b;
            return (int) Math.min((this.X.f23734b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.f27231a0 + rect.bottom, super.I());
        }
        return super.I();
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        boolean z10;
        org.telegram.ui.Components.mc mcVar = this.f27581e0;
        if (mcVar != null) {
            f10 = mcVar.a(0.01f);
        } else {
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int i10 = this.f22934c;
        if (i7 != 0) {
            canvas.save();
            canvas.scale(f10, f10, i10 / 2.0f, I() / 2.0f);
        }
        if (this.f27586j0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (this.f27587k0 - this.f22933b.bottom) - this.f27232b0;
        canvas.save();
        canvas.clipRect(0, 0, i10, i11);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i10, i11, null);
        }
        super.W(canvas);
        if (z10) {
            if (this.f27580d0 == null) {
                this.f27580d0 = new h6.m(29);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i11 - g0.L(24.0f), i10, i11 + 1);
            this.f27580d0.n(canvas, rectF, 3, this.f27586j0);
            canvas.restore();
        }
        canvas.restore();
        fv fvVar = this.f22932a;
        int i12 = fvVar.f23961y.i();
        int i13 = this.m0;
        Drawable drawable = this.f27588l0;
        if (i12 != i13) {
            int i14 = fvVar.f23961y.i();
            this.m0 = i14;
            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        bg.t.e(this.f27588l0, fvVar.C - g0.L(24.0f), g0.L(8.0f) + ((i11 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.f27586j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (i7 != 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27583g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f27583g0 = false;
            }
            return super.Y(motionEvent);
        }
        fv fvVar = this.f22932a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.f27583g0 = Y;
            if (!Y) {
                this.f27582f0 = true;
                if (this.f27581e0 == null && (view = fvVar.Q) != null) {
                    this.f27581e0 = new org.telegram.ui.Components.mc(view);
                }
                org.telegram.ui.Components.mc mcVar = this.f27581e0;
                if (mcVar != null) {
                    mcVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f27582f0) {
                return false;
            }
            this.f27582f0 = false;
            org.telegram.ui.Components.mc mcVar2 = this.f27581e0;
            if (mcVar2 != null) {
                mcVar2.c(false);
            }
            View view2 = fvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            fvVar.X();
            this.f27584h0 = !this.f27584h0;
            fvVar.f23958u = true;
            fvVar.Q();
            View view3 = fvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.r1 r1Var = fvVar.E;
            org.telegram.ui.Cells.m1 m1Var = fvVar.F;
            if (r1Var != null && m1Var != null) {
                m1Var.B1(r1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f27582f0 = false;
                org.telegram.ui.Components.mc mcVar3 = this.f27581e0;
                if (mcVar3 != null) {
                    mcVar3.c(false);
                }
            }
            return this.f27582f0;
        }
        return true;
    }

    @Override
    public final void d0() {
        super.d0();
        this.f27585i0 = this.f27584h0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.mc mcVar = this.f27581e0;
        if (mcVar != null) {
            return mcVar.a(0.01f);
        }
        return 1.0f;
    }
}
