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
public final class wu extends qu {
    public final TL_iv.pageBlockDetails W;
    public final uv X;
    public final uv[] Y;
    public final AnimatedArrowDrawable Z;
    public final Paint f19134a0;
    public org.telegram.ui.Components.dc f19135b0;
    public boolean f19136c0;
    public float f19137d0;
    public float f19138e0;

    public wu(vv vvVar, Rect rect, int i10, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(vvVar, rect, i10);
        int i11;
        float f7;
        this.f19134a0 = new Paint(1);
        this.W = pageblockdetails;
        uv uvVar = new uv(vvVar, spannableStringBuilder, i0.a.d(16.0f, this.f17623c - i0.L(53.0f), 0));
        this.X = uvVar;
        this.Y = new uv[]{uvVar};
        if (vvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.sl;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.rl;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.t6.w0(i11, vvVar.D));
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
        Rect rect2 = this.f17622b;
        int i11 = ((int) this.M) + rect2.top;
        int i12 = rect2.left;
        vv vvVar = this.f17621a;
        rect.set(i12 - vvVar.S, i11, (vvVar.C + vvVar.T) - rect2.right, h0() + i11);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final CharSequence D() {
        int i10;
        if (this.W.open) {
            i10 = 2131754882;
        } else {
            i10 = 2131754892;
        }
        return cd.L0(i10, null);
    }

    @Override
    public final CharSequence E(int i10) {
        CharSequence charSequence;
        int i11;
        CharSequence concat;
        StaticLayout staticLayout;
        uv uvVar = this.X;
        if (uvVar != null && (staticLayout = uvVar.f18396b) != null) {
            charSequence = qu.g0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String L0 = cd.L0(2131753987, null);
        if (this.W.open) {
            i11 = 2131754882;
        } else {
            i11 = 2131754892;
        }
        String L02 = cd.L0(i11, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(L0, ", ", L02, concat);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return h0() + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
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
        org.telegram.ui.Components.dc dcVar = this.f19135b0;
        if (dcVar != null) {
            f7 = dcVar.a(0.02f);
        } else {
            f7 = 1.0f;
        }
        vv vvVar = this.f17621a;
        float f10 = -vvVar.S;
        int i12 = vvVar.C + vvVar.T;
        Rect rect = this.f17622b;
        float f11 = (i12 - rect.left) - rect.right;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i13 != 0) {
            canvas.save();
            canvas.scale(f7, f7, (f10 + f11) / 2.0f, h0() / 2.0f);
        }
        if (vvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.sl;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.rl;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.Z;
        animatedArrowDrawable.f23663a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(i0.N(22.6f) + f10, i0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(i0.L(53.0f) + f10, i0.L(14.0f));
        uv uvVar = this.X;
        uvVar.d(canvas, uvVar.S);
        canvas.restore();
        if (i13 != 0) {
            canvas.restore();
        }
        if (!this.W.open && !vvVar.f19001s) {
            if (vvVar.E()) {
                i11 = org.telegram.ui.ActionBar.t6.ul;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.tl;
            }
            int w03 = org.telegram.ui.ActionBar.t6.w0(i11, vvVar.D);
            Paint paint = this.f19134a0;
            paint.setColor(w03);
            canvas.drawRect(f10, h0() - 1.0f, f11, h0(), paint);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        vv vvVar = this.f17621a;
        if (actionMasked == 0) {
            this.f19136c0 = true;
            if (this.f19135b0 == null && (view = vvVar.Q) != null) {
                this.f19135b0 = new org.telegram.ui.Components.dc(view);
            }
            org.telegram.ui.Components.dc dcVar = this.f19135b0;
            if (dcVar != null) {
                dcVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f19136c0) {
                return false;
            }
            this.f19136c0 = false;
            org.telegram.ui.Components.dc dcVar2 = this.f19135b0;
            if (dcVar2 != null) {
                dcVar2.c(false);
            }
            View view2 = vvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            i0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f19136c0 = false;
                org.telegram.ui.Components.dc dcVar3 = this.f19135b0;
                if (dcVar3 != null) {
                    dcVar3.c(false);
                }
            }
            return this.f19136c0;
        }
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        int L = i0.L(53.0f) + (i10 - this.f17621a.S);
        uv uvVar = this.X;
        uvVar.f18397c = L - uvVar.f18398f;
        uvVar.d = i0.L(14.0f) + i11;
        uvVar.e = i12;
    }

    public final int h0() {
        return m5.b(12.66f, this.X.f18396b.getHeight() + i0.L(14.0f), i0.L(27.82f));
    }

    public final void i0() {
        float f7;
        vv vvVar = this.f17621a;
        vvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.W;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        if (!z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.Z.a(f7);
        vvVar.f19001s = true;
        vvVar.Q();
        View view = vvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = vvVar.E;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        if (q1Var != null && l1Var != null) {
            l1Var.l1(q1Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        qu.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        uv uvVar = this.X;
        if (uvVar.o(characterStyle, huVar)) {
            Rect rect = this.f17622b;
            huVar.e = (i0.L(53.0f) + (rect.left - this.f17621a.S)) - uvVar.f18398f;
            huVar.f15956f = i0.L(14.0f) + i10 + rect.top;
            return true;
        }
        return false;
    }
}
