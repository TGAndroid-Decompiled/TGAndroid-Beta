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
public final class av extends zu {
    public h6.m f21527c0;
    public org.telegram.ui.Components.ic f21528d0;
    public boolean f21529e0;
    public boolean f21530f0;
    public boolean f21531g0;
    public boolean f21532h0;
    public float f21533i0;
    public int f21534j0;
    public final Drawable f21535k0;
    public int f21536l0;

    public av(kv kvVar, Rect rect, int i7, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7, spannableStringBuilder);
        this.f21535k0 = jg.g.h(t0.f25563b, 2131230871);
        boolean z9 = pageblockblockquote.collapsed;
        this.f21531g0 = z9;
        this.f21532h0 = z9;
    }

    @Override
    public final int I() {
        if (this.f21531g0) {
            Rect rect = this.f22451b;
            return (int) Math.min((this.W.f23593b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.Z + rect.bottom, super.I());
        }
        return super.I();
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        boolean z9;
        org.telegram.ui.Components.ic icVar = this.f21528d0;
        if (icVar != null) {
            f10 = icVar.a(0.01f);
        } else {
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        int i10 = this.f22452c;
        if (i7 != 0) {
            canvas.save();
            canvas.scale(f10, f10, i10 / 2.0f, I() / 2.0f);
        }
        if (this.f21533i0 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = (this.f21534j0 - this.f22451b.bottom) - this.f26922a0;
        canvas.save();
        canvas.clipRect(0, 0, i10, i11);
        if (z9) {
            canvas.saveLayer(0.0f, 0.0f, i10, i11, null);
        }
        super.W(canvas);
        if (z9) {
            if (this.f21527c0 == null) {
                this.f21527c0 = new h6.m(28);
            }
            RectF rectF = g0.P;
            rectF.set(0.0f, i11 - g0.L(24.0f), i10, i11 + 1);
            this.f21527c0.m(canvas, rectF, 3, this.f21533i0);
            canvas.restore();
        }
        canvas.restore();
        kv kvVar = this.f22450a;
        int i12 = kvVar.f23784y.i();
        int i13 = this.f21536l0;
        Drawable drawable = this.f21535k0;
        if (i12 != i13) {
            int i14 = kvVar.f23784y.i();
            this.f21536l0 = i14;
            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
        }
        bg.s.e(this.f21535k0, kvVar.C - g0.L(24.0f), g0.L(8.0f) + ((i11 - g0.L(16.0f)) - g0.L(2.0f)), g0.L(16.0f), g0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(g0.W1(this.f21533i0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
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
        if (this.f21530f0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f21530f0 = false;
            }
            return super.Y(motionEvent);
        }
        kv kvVar = this.f22450a;
        if (actionMasked == 0) {
            boolean Y = super.Y(motionEvent);
            this.f21530f0 = Y;
            if (!Y) {
                this.f21529e0 = true;
                if (this.f21528d0 == null && (view = kvVar.Q) != null) {
                    this.f21528d0 = new org.telegram.ui.Components.ic(view);
                }
                org.telegram.ui.Components.ic icVar = this.f21528d0;
                if (icVar != null) {
                    icVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f21529e0) {
                return false;
            }
            this.f21529e0 = false;
            org.telegram.ui.Components.ic icVar2 = this.f21528d0;
            if (icVar2 != null) {
                icVar2.c(false);
            }
            View view2 = kvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            kvVar.X();
            this.f21531g0 = !this.f21531g0;
            kvVar.f23781u = true;
            kvVar.Q();
            View view3 = kvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = kvVar.E;
            org.telegram.ui.Cells.l1 l1Var = kvVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.q1(q1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f21529e0 = false;
                org.telegram.ui.Components.ic icVar3 = this.f21528d0;
                if (icVar3 != null) {
                    icVar3.c(false);
                }
            }
            return this.f21529e0;
        }
        return true;
    }

    @Override
    public final void d0() {
        super.d0();
        this.f21532h0 = this.f21531g0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.ic icVar = this.f21528d0;
        if (icVar != null) {
            return icVar.a(0.01f);
        }
        return 1.0f;
    }
}
