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
public final class xu extends ru {
    public final TL_iv.pageBlockDetails W;
    public final vv X;
    public final vv[] Y;
    public final AnimatedArrowDrawable Z;
    public final Paint f19477a0;
    public org.telegram.ui.Components.dc f19478b0;
    public boolean f19479c0;
    public float f19480d0;
    public float f19481e0;

    public xu(wv wvVar, Rect rect, int i10, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(wvVar, rect, i10);
        int i11;
        float f7;
        this.f19477a0 = new Paint(1);
        this.W = pageblockdetails;
        vv vvVar = new vv(wvVar, spannableStringBuilder, i0.a.d(16.0f, this.f17969c - i0.L(53.0f), 0));
        this.X = vvVar;
        this.Y = new vv[]{vvVar};
        if (wvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.sl;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.rl;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D));
        this.Z = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f7);
    }

    @Override
    public final void A(int i10, Rect rect) {
        Rect rect2 = this.f17968b;
        int i11 = ((int) this.M) + rect2.top;
        int i12 = rect2.left;
        wv wvVar = this.f17967a;
        rect.set(i12 - wvVar.S, i11, (wvVar.C + wvVar.T) - rect2.right, h0() + i11);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final CharSequence C() {
        int i10;
        if (this.W.open) {
            i10 = 2131754882;
        } else {
            i10 = 2131754892;
        }
        return dd.L0(i10, null);
    }

    @Override
    public final CharSequence E(int i10) {
        CharSequence charSequence;
        int i11;
        CharSequence concat;
        StaticLayout staticLayout;
        vv vvVar = this.X;
        if (vvVar != null && (staticLayout = vvVar.f18904b) != null) {
            charSequence = ru.g0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String L0 = dd.L0(2131753987, null);
        if (this.W.open) {
            i11 = 2131754882;
        } else {
            i11 = 2131754892;
        }
        String L02 = dd.L0(i11, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(L0, ", ", L02, concat);
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return h0() + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return i0.L(16.0f) + this.X.r() + i0.L(53.0f) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Y;
    }

    @Override
    public final void S() {
        this.X.i(this.V);
    }

    @Override
    public final boolean T(int i10, View view) {
        i0();
        return true;
    }

    @Override
    public final void U() {
        this.X.f(this.V);
    }

    @Override
    public final void V(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.Components.dc dcVar = this.f19478b0;
        if (dcVar != null) {
            f7 = dcVar.a(0.02f);
        } else {
            f7 = 1.0f;
        }
        wv wvVar = this.f17967a;
        float f10 = -wvVar.S;
        int i12 = wvVar.C + wvVar.T;
        Rect rect = this.f17968b;
        float f11 = (i12 - rect.left) - rect.right;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i13 != 0) {
            canvas.save();
            canvas.scale(f7, f7, (f10 + f11) / 2.0f, h0() / 2.0f);
        }
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.sl;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.rl;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.Z;
        animatedArrowDrawable.f23664a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(i0.N(22.6f) + f10, i0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(i0.L(53.0f) + f10, i0.L(14.0f));
        vv vvVar = this.X;
        vvVar.d(canvas, vvVar.S);
        canvas.restore();
        if (i13 != 0) {
            canvas.restore();
        }
        if (!this.W.open && !wvVar.f19344s) {
            if (wvVar.E()) {
                i11 = org.telegram.ui.ActionBar.t6.ul;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.tl;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D);
            Paint paint = this.f19477a0;
            paint.setColor(w03);
            canvas.drawRect(f10, h0() - 1.0f, f11, h0(), paint);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        wv wvVar = this.f17967a;
        if (actionMasked == 0) {
            this.f19479c0 = true;
            if (this.f19478b0 == null && (view = wvVar.Q) != null) {
                this.f19478b0 = new org.telegram.ui.Components.dc(view);
            }
            org.telegram.ui.Components.dc dcVar = this.f19478b0;
            if (dcVar != null) {
                dcVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f19479c0) {
                return false;
            }
            this.f19479c0 = false;
            org.telegram.ui.Components.dc dcVar2 = this.f19478b0;
            if (dcVar2 != null) {
                dcVar2.c(false);
            }
            View view2 = wvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            i0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f19479c0 = false;
                org.telegram.ui.Components.dc dcVar3 = this.f19478b0;
                if (dcVar3 != null) {
                    dcVar3.c(false);
                }
            }
            return this.f19479c0;
        }
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        int L = i0.L(53.0f) + (i10 - this.f17967a.S);
        vv vvVar = this.X;
        vvVar.f18905c = L - vvVar.f18906f;
        vvVar.d = i0.L(14.0f) + i11;
        vvVar.e = i12;
    }

    public final int h0() {
        return m5.b(12.66f, this.X.f18904b.getHeight() + i0.L(14.0f), i0.L(27.82f));
    }

    public final void i0() {
        float f7;
        wv wvVar = this.f17967a;
        wvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.W;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        if (!z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.Z.a(f7);
        wvVar.f19344s = true;
        wvVar.Q();
        View view = wvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = wvVar.E;
        org.telegram.ui.Cells.l1 l1Var = wvVar.F;
        if (q1Var != null && l1Var != null) {
            l1Var.l1(q1Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        vv vvVar = this.X;
        if (vvVar.o(characterStyle, iuVar)) {
            Rect rect = this.f17968b;
            iuVar.e = (i0.L(53.0f) + (rect.left - this.f17967a.S)) - vvVar.f18906f;
            iuVar.f16348f = i0.L(14.0f) + i10 + rect.top;
            return true;
        }
        return false;
    }
}
