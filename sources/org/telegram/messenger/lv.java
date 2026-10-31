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
public final class lv extends kv {
    public li.k f16814c0;
    public org.telegram.ui.Components.dc f16815d0;
    public boolean f16816e0;
    public boolean f16817f0;
    public boolean f16818g0;
    public boolean f16819h0;
    public float f16820i0;
    public int f16821j0;
    public final Drawable f16822k0;
    public int f16823l0;

    public lv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockBlockquote pageblockblockquote, SpannableStringBuilder spannableStringBuilder) {
        super(vvVar, rect, i10, spannableStringBuilder);
        this.f16822k0 = i0.a.f(w0.f19025b, 2131230871);
        boolean z10 = pageblockblockquote.collapsed;
        this.f16818g0 = z10;
        this.f16819h0 = z10;
    }

    @Override
    public final int H() {
        if (this.f16818g0) {
            Rect rect = this.f17622b;
            return (int) Math.min((this.W.f18396b.getPaint().getTextSize() * 1.4f * 3.0f) + rect.top + this.Z + rect.bottom, super.H());
        }
        return super.H();
    }

    @Override
    public final void V(Canvas canvas) {
        float f7;
        boolean z10;
        org.telegram.ui.Components.dc dcVar = this.f16815d0;
        if (dcVar != null) {
            f7 = dcVar.a(0.01f);
        } else {
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        int i11 = this.f17623c;
        if (i10 != 0) {
            canvas.save();
            canvas.scale(f7, f7, i11 / 2.0f, H() / 2.0f);
        }
        if (this.f16820i0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = (this.f16821j0 - this.f17622b.bottom) - this.f16637a0;
        canvas.save();
        canvas.clipRect(0, 0, i11, i12);
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, i11, i12, null);
        }
        super.V(canvas);
        if (z10) {
            if (this.f16814c0 == null) {
                this.f16814c0 = new li.k(23);
            }
            RectF rectF = i0.P;
            rectF.set(0.0f, i12 - i0.L(24.0f), i11, i12 + 1);
            this.f16814c0.o(canvas, rectF, 3, this.f16820i0);
            canvas.restore();
        }
        canvas.restore();
        vv vvVar = this.f17621a;
        int i13 = vvVar.f19006y.i();
        int i14 = this.f16823l0;
        Drawable drawable = this.f16822k0;
        if (i13 != i14) {
            int i15 = vvVar.f19006y.i();
            this.f16823l0 = i15;
            drawable.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        }
        rf.o.e(this.f16822k0, vvVar.C - i0.L(24.0f), i0.L(8.0f) + ((i12 - i0.L(16.0f)) - i0.L(2.0f)), i0.L(16.0f), i0.L(16.0f), 17);
        canvas.save();
        canvas.rotate(i0.W1(this.f16820i0, 180, 0), drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
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
        if (this.f16817f0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f16817f0 = false;
            }
            return super.X(motionEvent);
        }
        vv vvVar = this.f17621a;
        if (actionMasked == 0) {
            boolean X = super.X(motionEvent);
            this.f16817f0 = X;
            if (!X) {
                this.f16816e0 = true;
                if (this.f16815d0 == null && (view = vvVar.Q) != null) {
                    this.f16815d0 = new org.telegram.ui.Components.dc(view);
                }
                org.telegram.ui.Components.dc dcVar = this.f16815d0;
                if (dcVar != null) {
                    dcVar.c(true);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (!this.f16816e0) {
                return false;
            }
            this.f16816e0 = false;
            org.telegram.ui.Components.dc dcVar2 = this.f16815d0;
            if (dcVar2 != null) {
                dcVar2.c(false);
            }
            View view2 = vvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            vvVar.X();
            this.f16818g0 = !this.f16818g0;
            vvVar.f19003u = true;
            vvVar.Q();
            View view3 = vvVar.Q;
            if (view3 != null) {
                view3.invalidate();
            }
            org.telegram.ui.Cells.q1 q1Var = vvVar.E;
            org.telegram.ui.Cells.l1 l1Var = vvVar.F;
            if (q1Var != null && l1Var != null) {
                l1Var.l1(q1Var, true, true);
            }
        } else {
            if (actionMasked == 3) {
                this.f16816e0 = false;
                org.telegram.ui.Components.dc dcVar3 = this.f16815d0;
                if (dcVar3 != null) {
                    dcVar3.c(false);
                }
            }
            return this.f16816e0;
        }
        return true;
    }

    @Override
    public final void c0() {
        super.c0();
        this.f16819h0 = this.f16818g0;
    }

    @Override
    public final float z() {
        org.telegram.ui.Components.dc dcVar = this.f16815d0;
        if (dcVar != null) {
            return dcVar.a(0.01f);
        }
        return 1.0f;
    }
}
