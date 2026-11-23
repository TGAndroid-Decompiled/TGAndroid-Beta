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
public final class gu extends au {
    public final TL_iv.pageBlockDetails X;
    public final ev Y;
    public final ev[] Z;
    public final AnimatedArrowDrawable f24308a0;
    public final Paint f24309b0;
    public org.telegram.ui.Components.mc f24310c0;
    public boolean f24311d0;
    public float f24312e0;
    public float f24313f0;

    public gu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(fvVar, rect, i7);
        int i10;
        float f10;
        this.f24309b0 = new Paint(1);
        this.X = pageblockdetails;
        ev evVar = new ev(fvVar, spannableStringBuilder, i5.c.d(16.0f, this.f22970c - g0.L(53.0f), 0));
        this.Y = evVar;
        this.Z = new ev[]{evVar};
        if (fvVar.E()) {
            i10 = org.telegram.ui.ActionBar.m6.vl;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.ul;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.m6.w0(i10, fvVar.D));
        this.f24308a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f10);
    }

    @Override
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.f22969b;
        int i10 = ((int) this.N) + rect2.top;
        int i11 = rect2.left;
        fv fvVar = this.f22968a;
        rect.set(i11 - fvVar.S, i10, (fvVar.C + fvVar.T) - rect2.right, i0() + i10);
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
        return hd.N0(i7, null);
    }

    @Override
    public final CharSequence E(int i7) {
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        StaticLayout staticLayout;
        ev evVar = this.Y;
        if (evVar != null && (staticLayout = evVar.f23770b) != null) {
            charSequence = au.h0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String N0 = hd.N0(2131753984, null);
        if (this.X.open) {
            i10 = 2131754882;
        } else {
            i10 = 2131754892;
        }
        String N02 = hd.N0(i10, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(N0, ", ", N02, concat);
    }

    @Override
    public final int I() {
        Rect rect = this.f22969b;
        return i0() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22969b;
        return g0.L(16.0f) + this.Y.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
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
        org.telegram.ui.Components.mc mcVar = this.f24310c0;
        if (mcVar != null) {
            f10 = mcVar.a(0.02f);
        } else {
            f10 = 1.0f;
        }
        fv fvVar = this.f22968a;
        float f11 = -fvVar.S;
        int i11 = fvVar.C + fvVar.T;
        Rect rect = this.f22969b;
        float f12 = (i11 - rect.left) - rect.right;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0) {
            canvas.save();
            canvas.scale(f10, f10, (f11 + f12) / 2.0f, i0() / 2.0f);
        }
        if (fvVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.vl;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.ul;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, fvVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.f24308a0;
        animatedArrowDrawable.f32558a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f11, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f11, g0.L(14.0f));
        ev evVar = this.Y;
        evVar.d(canvas, evVar.T);
        canvas.restore();
        if (i12 != 0) {
            canvas.restore();
        }
        if (!this.X.open && !fvVar.f23992s) {
            if (fvVar.E()) {
                i10 = org.telegram.ui.ActionBar.m6.xl;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.wl;
            }
            int w03 = org.telegram.ui.ActionBar.m6.w0(i10, fvVar.D);
            Paint paint = this.f24309b0;
            paint.setColor(w03);
            canvas.drawRect(f11, i0() - 1.0f, f12, i0(), paint);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        fv fvVar = this.f22968a;
        if (actionMasked == 0) {
            this.f24311d0 = true;
            if (this.f24310c0 == null && (view = fvVar.Q) != null) {
                this.f24310c0 = new org.telegram.ui.Components.mc(view);
            }
            org.telegram.ui.Components.mc mcVar = this.f24310c0;
            if (mcVar != null) {
                mcVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f24311d0) {
                return false;
            }
            this.f24311d0 = false;
            org.telegram.ui.Components.mc mcVar2 = this.f24310c0;
            if (mcVar2 != null) {
                mcVar2.c(false);
            }
            View view2 = fvVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            j0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f24311d0 = false;
                org.telegram.ui.Components.mc mcVar3 = this.f24310c0;
                if (mcVar3 != null) {
                    mcVar3.c(false);
                }
            }
            return this.f24311d0;
        }
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i7 - this.f22968a.S);
        ev evVar = this.Y;
        evVar.f23771c = L - evVar.f23773f;
        evVar.d = g0.L(14.0f) + i10;
        evVar.f23772e = i11;
    }

    public final int i0() {
        return f3.b(12.66f, this.Y.f23770b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        float f10;
        fv fvVar = this.f22968a;
        fvVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        if (!z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.f24308a0.a(f10);
        fvVar.f23992s = true;
        fvVar.Q();
        View view = fvVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.r1 r1Var = fvVar.E;
        org.telegram.ui.Cells.m1 m1Var = fvVar.F;
        if (r1Var != null && m1Var != null) {
            m1Var.B1(r1Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, this.Y, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        ev evVar = this.Y;
        if (evVar.o(characterStyle, rtVar)) {
            Rect rect = this.f22969b;
            rtVar.f26661e = (g0.L(53.0f) + (rect.left - this.f22968a.S)) - evVar.f23773f;
            rtVar.f26662f = g0.L(14.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }
}
