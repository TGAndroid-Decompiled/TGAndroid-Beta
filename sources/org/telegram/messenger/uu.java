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
import org.telegram.ui.Components.i61;
public final class uu extends tu {
    public i61 f27356d0;
    public org.telegram.ui.Components.lc f27357e0;
    public boolean f27358f0;
    public boolean f27359g0;
    public boolean f27360h0;
    public boolean f27361i0;
    public float f27362j0;
    public int f27363k0;
    public final Drawable f27364l0;
    public int m0;

    public uu(ev evVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7, spannableStringBuilder);
        this.f27364l0 = i5.c.g(t0.f27013b, 2131230871);
        boolean z10 = pageblockblockquote.collapsed;
        this.f27360h0 = z10;
        this.f27361i0 = z10;
    }

    @Override
    public final int I() {
        if (this.f27360h0) {
            Rect rect = this.f28442b;
            return (int) Math.min((this.X.f23706b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.f27166a0 + rect.bottom, super.I());
        }
        return super.I();
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        boolean z10;
        org.telegram.ui.Components.lc lcVar = this.f27357e0;
        if (lcVar != null) {
            f10 = lcVar.a(0.01f);
        } else {
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int i10 = this.f28443c;
        if (i7 != 0) {
            canvas.save();
            canvas.scale(f10, f10, i10 / 2.0f, I() / 2.0f);
        }
        if (this.f27362j0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (this.f27363k0 - this.f28442b.bottom) - this.f27167b0;
        canvas.save();
        canvas.clipRect(0, 0, i10, i11);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i10, i11, null);
        }
        super.W(canvas);
        if (z10) {
            if (this.f27356d0 == null) {
                this.f27356d0 = new i61(1);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i11 - g0.L(24.0f), i10, i11 + 1);
            this.f27356d0.u(canvas, rectF, 3, this.f27362j0);
            canvas.restore();
        }
        canvas.restore();
        ev evVar = this.f28441a;
        int i12 = evVar.f23893y.i();
        int i13 = this.m0;
        Drawable drawable = this.f27364l0;
        if (i12 != i13) {
            int i14 = evVar.f23893y.i();
            this.m0 = i14;
            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        bg.t.e(this.f27364l0, evVar.C - g0.L(24.0f), g0.L(8.0f) + ((i11 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.f27362j0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
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
        if (this.f27359g0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f27359g0 = false;
            }
            return super.Y(motionEvent);
        }
        ev evVar = this.f28441a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.f27359g0 = Y;
            if (!Y) {
                this.f27358f0 = true;
                if (this.f27357e0 == null && (view = evVar.Q) != null) {
                    this.f27357e0 = new org.telegram.ui.Components.lc(view);
                }
                org.telegram.ui.Components.lc lcVar = this.f27357e0;
                if (lcVar != null) {
                    lcVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f27358f0) {
                return false;
            }
            this.f27358f0 = false;
            org.telegram.ui.Components.lc lcVar2 = this.f27357e0;
            if (lcVar2 != null) {
                lcVar2.c(false);
            }
            View view2 = evVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            evVar.X();
            this.f27360h0 = !this.f27360h0;
            evVar.f23890u = true;
            evVar.Q();
            View view3 = evVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.r1 r1Var = evVar.E;
            org.telegram.ui.Cells.m1 m1Var = evVar.F;
            if (r1Var != null && m1Var != null) {
                m1Var.B1(r1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f27358f0 = false;
                org.telegram.ui.Components.lc lcVar3 = this.f27357e0;
                if (lcVar3 != null) {
                    lcVar3.c(false);
                }
            }
            return this.f27358f0;
        }
        return true;
    }

    @Override
    public final void d0() {
        super.d0();
        this.f27361i0 = this.f27360h0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.lc lcVar = this.f27357e0;
        if (lcVar != null) {
            return lcVar.a(0.01f);
        }
        return 1.0f;
    }
}
