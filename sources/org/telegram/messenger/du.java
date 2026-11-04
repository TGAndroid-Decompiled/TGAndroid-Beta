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
public final class du extends xt {
    public final TL_iv.pageBlockDetails X;
    public final bv Y;
    public final bv[] Z;
    public final AnimatedArrowDrawable f22243a0;
    public final Paint f22244b0;
    public org.telegram.ui.Components.gc f22245c0;
    public boolean f22246d0;
    public float f22247e0;
    public float f22248f0;

    public du(cv cvVar, Rect rect, int i3, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3);
        int i10;
        float f10;
        this.f22244b0 = new Paint(1);
        this.X = pageblockdetails;
        bv bvVar = new bv(cvVar, spannableStringBuilder, k2.p1.d(16.0f, this.f26436c - g0.L(53.0f), 0));
        this.Y = bvVar;
        this.Z = new bv[]{bvVar};
        if (cvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.sl;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.rl;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D));
        this.f22243a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f10);
    }

    @Override
    public final void A(int i3, Rect rect) {
        Rect rect2 = this.f26435b;
        int i10 = ((int) this.N) + rect2.top;
        int i11 = rect2.left;
        cv cvVar = this.f26434a;
        rect.set(i11 - cvVar.S, i10, (cvVar.C + cvVar.T) - rect2.right, i0() + i10);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final CharSequence D() {
        int i3;
        if (this.X.open) {
            i3 = 2131754882;
        } else {
            i3 = 2131754892;
        }
        return bd.M0(i3, null);
    }

    @Override
    public final CharSequence E(int i3) {
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        StaticLayout staticLayout;
        bv bvVar = this.Y;
        if (bvVar != null && (staticLayout = bvVar.f21888b) != null) {
            charSequence = xt.h0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String M0 = bd.M0(2131753987, null);
        if (this.X.open) {
            i10 = 2131754882;
        } else {
            i10 = 2131754892;
        }
        String M02 = bd.M0(i10, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(M0, ", ", M02, concat);
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return i0() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
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
    public final boolean U(int i3, View view) {
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
        int i3;
        int i10;
        org.telegram.ui.Components.gc gcVar = this.f22245c0;
        if (gcVar != null) {
            f10 = gcVar.a(0.02f);
        } else {
            f10 = 1.0f;
        }
        cv cvVar = this.f26434a;
        float f11 = -cvVar.S;
        int i11 = cvVar.C + cvVar.T;
        Rect rect = this.f26435b;
        float f12 = (i11 - rect.left) - rect.right;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0) {
            canvas.save();
            canvas.scale(f10, f10, (f11 + f12) / 2.0f, i0() / 2.0f);
        }
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.sl;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.rl;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.f22243a0;
        animatedArrowDrawable.f31072a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f11, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f11, g0.L(14.0f));
        bv bvVar = this.Y;
        bvVar.d(canvas, bvVar.T);
        canvas.restore();
        if (i12 != 0) {
            canvas.restore();
        }
        if (!this.X.open && !cvVar.f22081s) {
            if (cvVar.E()) {
                i10 = org.telegram.ui.ActionBar.k6.ul;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.tl;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D);
            Paint paint = this.f22244b0;
            paint.setColor(w03);
            canvas.drawRect(f11, i0() - 1.0f, f12, i0(), paint);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        cv cvVar = this.f26434a;
        if (actionMasked == 0) {
            this.f22246d0 = true;
            if (this.f22245c0 == null && (view = cvVar.Q) != null) {
                this.f22245c0 = new org.telegram.ui.Components.gc(view);
            }
            org.telegram.ui.Components.gc gcVar = this.f22245c0;
            if (gcVar != null) {
                gcVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f22246d0) {
                return false;
            }
            this.f22246d0 = false;
            org.telegram.ui.Components.gc gcVar2 = this.f22245c0;
            if (gcVar2 != null) {
                gcVar2.c(false);
            }
            View view2 = cvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            j0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f22246d0 = false;
                org.telegram.ui.Components.gc gcVar3 = this.f22245c0;
                if (gcVar3 != null) {
                    gcVar3.c(false);
                }
            }
            return this.f22246d0;
        }
    }

    @Override
    public final void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i3 - this.f26434a.S);
        bv bvVar = this.Y;
        bvVar.f21889c = L - bvVar.f21891f;
        bvVar.d = g0.L(14.0f) + i10;
        bvVar.f21890e = i11;
    }

    public final int i0() {
        return k5.b(12.66f, this.Y.f21888b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        float f10;
        cv cvVar = this.f26434a;
        cvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        if (!z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.f22243a0.a(f10);
        cvVar.f22081s = true;
        cvVar.Q();
        View view = cvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        if (q1Var != null && l1Var != null) {
            l1Var.r1(q1Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, this.Y, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        bv bvVar = this.Y;
        if (bvVar.o(characterStyle, otVar)) {
            Rect rect = this.f26435b;
            otVar.f24597e = (g0.L(53.0f) + (rect.left - this.f26434a.S)) - bvVar.f21891f;
            otVar.f24598f = g0.L(14.0f) + i3 + rect.top;
            return true;
        }
        return false;
    }
}
