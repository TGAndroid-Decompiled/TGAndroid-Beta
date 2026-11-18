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
public final class uu extends tu {
    public h6.m f27254d0;
    public org.telegram.ui.Components.mc f27255e0;
    public boolean f27256f0;
    public boolean f27257g0;
    public boolean f27258h0;
    public boolean f27259i0;
    public float f27260j0;
    public int f27261k0;
    public final Drawable f27262l0;
    public int m0;

    public uu(ev evVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7, spannableStringBuilder);
        this.f27262l0 = i5.c.g(t0.f26915b, 2131230871);
        boolean z10 = pageblockblockquote.collapsed;
        this.f27258h0 = z10;
        this.f27259i0 = z10;
    }

    @Override
    public final int I() {
        if (this.f27258h0) {
            Rect rect = this.f28352b;
            return (int) Math.min((this.X.f23580b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.f27071a0 + rect.bottom, super.I());
        }
        return super.I();
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        boolean z10;
        org.telegram.ui.Components.mc mcVar = this.f27255e0;
        if (mcVar != null) {
            f10 = mcVar.a(0.01f);
        } else {
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int i10 = this.f28353c;
        if (i7 != 0) {
            canvas.save();
            canvas.scale(f10, f10, i10 / 2.0f, I() / 2.0f);
        }
        if (this.f27260j0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (this.f27261k0 - this.f28352b.bottom) - this.f27072b0;
        canvas.save();
        canvas.clipRect(0, 0, i10, i11);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i10, i11, null);
        }
        super.W(canvas);
        if (z10) {
            if (this.f27254d0 == null) {
                this.f27254d0 = new h6.m(29);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i11 - g0.L(24.0f), i10, i11 + 1);
            this.f27254d0.n(canvas, rectF, 3, this.f27260j0);
            canvas.restore();
        }
        canvas.restore();
        ev evVar = this.f28351a;
        int i12 = evVar.f23791y.i();
        int i13 = this.m0;
        Drawable drawable = this.f27262l0;
        if (i12 != i13) {
            int i14 = evVar.f23791y.i();
            this.m0 = i14;
            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        bg.t.e(this.f27262l0, evVar.C - g0.L(24.0f), g0.L(8.0f) + ((i11 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.f27260j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
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
        if (this.f27257g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f27257g0 = false;
            }
            return super.Y(motionEvent);
        }
        ev evVar = this.f28351a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.f27257g0 = Y;
            if (!Y) {
                this.f27256f0 = true;
                if (this.f27255e0 == null && (view = evVar.Q) != null) {
                    this.f27255e0 = new org.telegram.ui.Components.mc(view);
                }
                org.telegram.ui.Components.mc mcVar = this.f27255e0;
                if (mcVar != null) {
                    mcVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f27256f0) {
                return false;
            }
            this.f27256f0 = false;
            org.telegram.ui.Components.mc mcVar2 = this.f27255e0;
            if (mcVar2 != null) {
                mcVar2.c(false);
            }
            View view2 = evVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            evVar.X();
            this.f27258h0 = !this.f27258h0;
            evVar.f23788u = true;
            evVar.Q();
            View view3 = evVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = evVar.E;
            org.telegram.ui.Cells.l1 l1Var = evVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.B1(q1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f27256f0 = false;
                org.telegram.ui.Components.mc mcVar3 = this.f27255e0;
                if (mcVar3 != null) {
                    mcVar3.c(false);
                }
            }
            return this.f27256f0;
        }
        return true;
    }

    @Override
    public final void d0() {
        super.d0();
        this.f27259i0 = this.f27258h0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.mc mcVar = this.f27255e0;
        if (mcVar != null) {
            return mcVar.a(0.01f);
        }
        return 1.0f;
    }
}
