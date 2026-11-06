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
public final class lu extends fu {
    public final TL_iv.pageBlockDetails W;
    public final jv X;
    public final jv[] Y;
    public final AnimatedArrowDrawable Z;
    public final Paint f23920a0;
    public org.telegram.ui.Components.ic f23921b0;
    public boolean f23922c0;
    public float f23923d0;
    public float f23924e0;

    public lu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7);
        int i10;
        float f10;
        this.f23920a0 = new Paint(1);
        this.W = pageblockdetails;
        jv jvVar = new jv(kvVar, spannableStringBuilder, jg.g.e(16.0f, this.f22445c - g0.L(53.0f), 0));
        this.X = jvVar;
        this.Y = new jv[]{jvVar};
        if (kvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.sl;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.rl;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.k6.w0(i10, kvVar.D));
        this.Z = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f10);
    }

    @Override
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.f22444b;
        int i10 = ((int) this.M) + rect2.top;
        int i11 = rect2.left;
        kv kvVar = this.f22443a;
        rect.set(i11 - kvVar.S, i10, (kvVar.C + kvVar.T) - rect2.right, i0() + i10);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final CharSequence D() {
        int i7;
        if (this.W.open) {
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
        jv jvVar = this.X;
        if (jvVar != null && (staticLayout = jvVar.f23586b) != null) {
            charSequence = fu.h0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String M0 = hd.M0(2131753987, null);
        if (this.W.open) {
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
        Rect rect = this.f22444b;
        return i0() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22444b;
        return g0.L(16.0f) + this.X.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Y;
    }

    @Override
    public final void T() {
        this.X.i(this.V);
    }

    @Override
    public final boolean U(int i7, View view) {
        j0();
        return true;
    }

    @Override
    public final void V() {
        this.X.f(this.V);
    }

    @Override
    public final void W(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        org.telegram.ui.Components.ic icVar = this.f23921b0;
        if (icVar != null) {
            f10 = icVar.a(0.02f);
        } else {
            f10 = 1.0f;
        }
        kv kvVar = this.f22443a;
        float f11 = -kvVar.S;
        int i11 = kvVar.C + kvVar.T;
        Rect rect = this.f22444b;
        float f12 = (i11 - rect.left) - rect.right;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0) {
            canvas.save();
            canvas.scale(f10, f10, (f11 + f12) / 2.0f, i0() / 2.0f);
        }
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.k6.sl;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.rl;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.Z;
        animatedArrowDrawable.f30998a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f11, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f11, g0.L(14.0f));
        jv jvVar = this.X;
        jvVar.d(canvas, jvVar.S);
        canvas.restore();
        if (i12 != 0) {
            canvas.restore();
        }
        if (!this.W.open && !kvVar.f23772s) {
            if (kvVar.E()) {
                i10 = org.telegram.ui.ActionBar.k6.ul;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.tl;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i10, kvVar.D);
            Paint paint = this.f23920a0;
            paint.setColor(w03);
            canvas.drawRect(f11, i0() - 1.0f, f12, i0(), paint);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        kv kvVar = this.f22443a;
        if (actionMasked == 0) {
            this.f23922c0 = true;
            if (this.f23921b0 == null && (view = kvVar.Q) != null) {
                this.f23921b0 = new org.telegram.ui.Components.ic(view);
            }
            org.telegram.ui.Components.ic icVar = this.f23921b0;
            if (icVar != null) {
                icVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f23922c0) {
                return false;
            }
            this.f23922c0 = false;
            org.telegram.ui.Components.ic icVar2 = this.f23921b0;
            if (icVar2 != null) {
                icVar2.c(false);
            }
            View view2 = kvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            j0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f23922c0 = false;
                org.telegram.ui.Components.ic icVar3 = this.f23921b0;
                if (icVar3 != null) {
                    icVar3.c(false);
                }
            }
            return this.f23922c0;
        }
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        this.S = i7;
        this.T = i10;
        this.U = i11;
        int L = g0.L(53.0f) + (i7 - this.f22443a.S);
        jv jvVar = this.X;
        jvVar.f23587c = L - jvVar.f23589f;
        jvVar.d = g0.L(14.0f) + i10;
        jvVar.f23588e = i11;
    }

    public final int i0() {
        return k5.b(12.66f, this.X.f23586b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        float f10;
        kv kvVar = this.f22443a;
        kvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.W;
        boolean z9 = pageblockdetails.open;
        pageblockdetails.open = !z9;
        if (!z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.Z.a(f10);
        kvVar.f23772s = true;
        kvVar.Q();
        View view = kvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        if (q1Var != null && l1Var != null) {
            l1Var.q1(q1Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        jv jvVar = this.X;
        if (jvVar.o(characterStyle, wtVar)) {
            Rect rect = this.f22444b;
            wtVar.f26360e = (g0.L(53.0f) + (rect.left - this.f22443a.S)) - jvVar.f23589f;
            wtVar.f26361f = g0.L(14.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }
}
