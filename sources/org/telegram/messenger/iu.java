package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
public final class iu extends cu {
    public final TL_iv.pageBlockDetails X;
    public final hv Y;
    public final hv[] Z;
    public final AnimatedArrowDrawable f24434a0;
    public final Paint f24435b0;
    public org.telegram.ui.Components.dc f24436c0;
    public boolean f24437d0;
    public float f24438e0;
    public float f24439f0;

    public iu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7);
        int i10;
        float f10;
        this.f24435b0 = new Paint(1);
        this.X = pageblockdetails;
        hv hvVar = new hv(ivVar, spannableStringBuilder, i5.c.d(16.0f, this.f22935c - g0.L(53.0f), 0));
        this.Y = hvVar;
        this.Z = new hv[]{hvVar};
        if (ivVar.E()) {
            i10 = org.telegram.ui.ActionBar.j6.vl;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.ul;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D));
        this.f24434a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f10);
    }

    @Override
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.f22934b;
        int i10 = ((int) this.N) + rect2.top;
        int i11 = rect2.left;
        iv ivVar = this.f22933a;
        rect.set(i11 - ivVar.S, i10, (ivVar.C + ivVar.T) - rect2.right, i0() + i10);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final CharSequence D() {
        int i7;
        if (this.X.open) {
            i7 = 2131754882;
        } else {
            i7 = 2131754892;
        }
        return hd.M0(i7, null);
    }

    @Override
    public final CharSequence E(int i7) {
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        StaticLayout staticLayout;
        hv hvVar = this.Y;
        if (hvVar != null && (staticLayout = hvVar.f24222b) != null) {
            charSequence = cu.h0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String M0 = hd.M0(2131753987, null);
        if (this.X.open) {
            i10 = 2131754882;
        } else {
            i10 = 2131754892;
        }
        String M02 = hd.M0(i10, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(M0, ", ", M02, concat);
    }

    @Override
    public final int I() {
        Rect rect = this.f22934b;
        return i0() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22934b;
        return g0.L(16.0f) + this.Y.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Z;
    }

    @Override
    public final void T() {
        this.Y.i(this.W);
    }

    @Override
    public final boolean U(int i7, View view) {
        j0();
        return true;
    }

    @Override
    public final void V() {
        this.Y.f(this.W);
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        org.telegram.ui.Components.dc dcVar = this.f24436c0;
        if (dcVar != null) {
            f10 = dcVar.a(0.02f);
        } else {
            f10 = 1.0f;
        }
        iv ivVar = this.f22933a;
        float f11 = -ivVar.S;
        int i11 = ivVar.C + ivVar.T;
        Rect rect = this.f22934b;
        float f12 = (i11 - rect.left) - rect.right;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0) {
            canvas.save();
            canvas.scale(f10, f10, (f11 + f12) / 2.0f, i0() / 2.0f);
        }
        if (ivVar.E()) {
            i7 = org.telegram.ui.ActionBar.j6.vl;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.ul;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.f24434a0;
        animatedArrowDrawable.f32142a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f11, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f11, g0.L(14.0f));
        hv hvVar = this.Y;
        hvVar.d(canvas, hvVar.T);
        canvas.restore();
        if (i12 != 0) {
            canvas.restore();
        }
        if (!this.X.open && !ivVar.f24456s) {
            if (ivVar.E()) {
                i10 = org.telegram.ui.ActionBar.j6.xl;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.wl;
            }
            int w03 = org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D);
            Paint paint = this.f24435b0;
            paint.setColor(w03);
            canvas.drawRect(f11, i0() - 1.0f, f12, i0(), paint);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        iv ivVar = this.f22933a;
        if (actionMasked == 0) {
            this.f24437d0 = true;
            if (this.f24436c0 == null && (view = ivVar.Q) != null) {
                this.f24436c0 = new org.telegram.ui.Components.dc(view);
            }
            org.telegram.ui.Components.dc dcVar = this.f24436c0;
            if (dcVar != null) {
                dcVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f24437d0) {
                return false;
            }
            this.f24437d0 = false;
            org.telegram.ui.Components.dc dcVar2 = this.f24436c0;
            if (dcVar2 != null) {
                dcVar2.c(false);
            }
            View view2 = ivVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            j0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f24437d0 = false;
                org.telegram.ui.Components.dc dcVar3 = this.f24436c0;
                if (dcVar3 != null) {
                    dcVar3.c(false);
                }
            }
            return this.f24437d0;
        }
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i7 - this.f22933a.S);
        hv hvVar = this.Y;
        hvVar.f24223c = L - hvVar.f24225f;
        hvVar.d = g0.L(14.0f) + i10;
        hvVar.f24224e = i11;
    }

    public final int i0() {
        return k5.b(12.66f, this.Y.f24222b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        float f10;
        iv ivVar = this.f22933a;
        ivVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        if (!z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.f24434a0.a(f10);
        ivVar.f24456s = true;
        ivVar.Q();
        View view = ivVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = ivVar.E;
        org.telegram.ui.Cells.l1 l1Var = ivVar.F;
        if (q1Var != null && l1Var != null) {
            l1Var.B1(q1Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, this.Y, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        hv hvVar = this.Y;
        if (hvVar.o(characterStyle, ttVar)) {
            Rect rect = this.f22934b;
            ttVar.f26731e = (g0.L(53.0f) + (rect.left - this.f22933a.S)) - hvVar.f24225f;
            ttVar.f26732f = g0.L(14.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }
}
