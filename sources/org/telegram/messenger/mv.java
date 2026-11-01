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
public final class mv extends lv {
    public li.k f17198c0;
    public org.telegram.ui.Components.dc f17199d0;
    public boolean f17200e0;
    public boolean f17201f0;
    public boolean f17202g0;
    public boolean f17203h0;
    public float f17204i0;
    public int f17205j0;
    public final Drawable f17206k0;
    public int f17207l0;

    public mv(wv wvVar, Rect rect, int i10, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(wvVar, rect, i10, spannableStringBuilder);
        this.f17206k0 = i0.a.f(w0.f18945b, 2131230871);
        boolean z10 = pageblockblockquote.collapsed;
        this.f17202g0 = z10;
        this.f17203h0 = z10;
    }

    @Override
    public final int H() {
        if (this.f17202g0) {
            Rect rect = this.f17968b;
            return (int) Math.min((this.W.f18904b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.Z + rect.bottom, super.H());
        }
        return super.H();
    }

    @Override
    public final void V(Canvas canvas) {
        float f7;
        boolean z10;
        org.telegram.ui.Components.dc dcVar = this.f17199d0;
        if (dcVar != null) {
            f7 = dcVar.a(0.01f);
        } else {
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        int i11 = this.f17969c;
        if (i10 != 0) {
            canvas.save();
            canvas.scale(f7, f7, i11 / 2.0f, H() / 2.0f);
        }
        if (this.f17204i0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = (this.f17205j0 - this.f17968b.bottom) - this.f17002a0;
        canvas.save();
        canvas.clipRect(0, 0, i11, i12);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i11, i12, null);
        }
        super.V(canvas);
        if (z10) {
            if (this.f17198c0 == null) {
                this.f17198c0 = new li.k(23);
            }
            RectF rectF = i0.P;
            rectF.set(0.0f, i12 - i0.L(24.0f), i11, i12 + 1);
            this.f17198c0.o(canvas, rectF, 3, this.f17204i0);
            canvas.restore();
        }
        canvas.restore();
        wv wvVar = this.f17967a;
        int i13 = wvVar.f19349y.i();
        int i14 = this.f17207l0;
        Drawable drawable = this.f17206k0;
        if (i13 != i14) {
            int i15 = wvVar.f19349y.i();
            this.f17207l0 = i15;
            drawable.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        }
        rf.o.e(this.f17206k0, wvVar.C - i0.L(24.0f), i0.L(8.0f) + ((i12 - i0.L(16.0f)) - i0.L(2.0f)), i0.L(16.0f), i0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(i0.W1(this.f17204i0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
        if (i10 != 0) {
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f17201f0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f17201f0 = false;
            }
            return super.X(motionEvent);
        }
        wv wvVar = this.f17967a;
        if (actionMasked == 0) {
            boolean X = super.X(motionEvent);
            this.f17201f0 = X;
            if (!X) {
                this.f17200e0 = true;
                if (this.f17199d0 == null && (view = wvVar.Q) != null) {
                    this.f17199d0 = new org.telegram.ui.Components.dc(view);
                }
                org.telegram.ui.Components.dc dcVar = this.f17199d0;
                if (dcVar != null) {
                    dcVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f17200e0) {
                return false;
            }
            this.f17200e0 = false;
            org.telegram.ui.Components.dc dcVar2 = this.f17199d0;
            if (dcVar2 != null) {
                dcVar2.c(false);
            }
            View view2 = wvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            wvVar.X();
            this.f17202g0 = !this.f17202g0;
            wvVar.f19346u = true;
            wvVar.Q();
            View view3 = wvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = wvVar.E;
            org.telegram.ui.Cells.l1 l1Var = wvVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.l1(q1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f17200e0 = false;
                org.telegram.ui.Components.dc dcVar3 = this.f17199d0;
                if (dcVar3 != null) {
                    dcVar3.c(false);
                }
            }
            return this.f17200e0;
        }
        return true;
    }

    @Override
    public final void c0() {
        super.c0();
        this.f17203h0 = this.f17202g0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.dc dcVar = this.f17199d0;
        if (dcVar != null) {
            return dcVar.a(0.01f);
        }
        return 1.0f;
    }
}
