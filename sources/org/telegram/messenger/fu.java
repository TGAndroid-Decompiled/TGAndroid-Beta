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
public final class fu extends zt {
    public final TL_iv.pageBlockDetails X;
    public final dv Y;
    public final dv[] Z;
    public final AnimatedArrowDrawable f24063a0;
    public final Paint f24064b0;
    public org.telegram.ui.Components.mc f24065c0;
    public boolean f24066d0;
    public float f24067e0;
    public float f24068f0;

    public fu(ev evVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7);
        int i10;
        float f10;
        this.f24064b0 = new Paint(1);
        this.X = pageblockdetails;
        dv dvVar = new dv(evVar, spannableStringBuilder, i5.c.d(16.0f, this.f28353c - g0.L(53.0f), 0));
        this.Y = dvVar;
        this.Z = new dv[]{dvVar};
        if (evVar.E()) {
            i10 = org.telegram.ui.ActionBar.n6.vl;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.ul;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.n6.w0(i10, evVar.D));
        this.f24063a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f10);
    }

    @Override
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.f28352b;
        int i10 = ((int) this.N) + rect2.top;
        int i11 = rect2.left;
        ev evVar = this.f28351a;
        rect.set(i11 - evVar.S, i10, (evVar.C + evVar.T) - rect2.right, i0() + i10);
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
        return gd.M0(i7, null);
    }

    @Override
    public final CharSequence E(int i7) {
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        StaticLayout staticLayout;
        dv dvVar = this.Y;
        if (dvVar != null && (staticLayout = dvVar.f23580b) != null) {
            charSequence = zt.h0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String M0 = gd.M0(2131753985, null);
        if (this.X.open) {
            i10 = 2131754882;
        } else {
            i10 = 2131754892;
        }
        String M02 = gd.M0(i10, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(M0, ", ", M02, concat);
    }

    @Override
    public final int I() {
        Rect rect = this.f28352b;
        return i0() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28352b;
        return g0.L(16.0f) + this.Y.r() + g0.L(53.0f) + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
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
        org.telegram.ui.Components.mc mcVar = this.f24065c0;
        if (mcVar != null) {
            f10 = mcVar.a(0.02f);
        } else {
            f10 = 1.0f;
        }
        ev evVar = this.f28351a;
        float f11 = -evVar.S;
        int i11 = evVar.C + evVar.T;
        Rect rect = this.f28352b;
        float f12 = (i11 - rect.left) - rect.right;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0) {
            canvas.save();
            canvas.scale(f10, f10, (f11 + f12) / 2.0f, i0() / 2.0f);
        }
        if (evVar.E()) {
            i7 = org.telegram.ui.ActionBar.n6.vl;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.ul;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, evVar.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.f24063a0;
        animatedArrowDrawable.f32527a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(g0.N(22.6f) + f11, g0.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(g0.L(53.0f) + f11, g0.L(14.0f));
        dv dvVar = this.Y;
        dvVar.d(canvas, dvVar.T);
        canvas.restore();
        if (i12 != 0) {
            canvas.restore();
        }
        if (!this.X.open && !evVar.f23786s) {
            if (evVar.E()) {
                i10 = org.telegram.ui.ActionBar.n6.xl;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.wl;
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(i10, evVar.D);
            Paint paint = this.f24064b0;
            paint.setColor(w03);
            canvas.drawRect(f11, i0() - 1.0f, f12, i0(), paint);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        ev evVar = this.f28351a;
        if (actionMasked == 0) {
            this.f24066d0 = true;
            if (this.f24065c0 == null && (view = evVar.Q) != null) {
                this.f24065c0 = new org.telegram.ui.Components.mc(view);
            }
            org.telegram.ui.Components.mc mcVar = this.f24065c0;
            if (mcVar != null) {
                mcVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f24066d0) {
                return false;
            }
            this.f24066d0 = false;
            org.telegram.ui.Components.mc mcVar2 = this.f24065c0;
            if (mcVar2 != null) {
                mcVar2.c(false);
            }
            View view2 = evVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            j0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f24066d0 = false;
                org.telegram.ui.Components.mc mcVar3 = this.f24065c0;
                if (mcVar3 != null) {
                    mcVar3.c(false);
                }
            }
            return this.f24066d0;
        }
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i7 - this.f28351a.S);
        dv dvVar = this.Y;
        dvVar.f23581c = L - dvVar.f23583f;
        dvVar.d = g0.L(14.0f) + i10;
        dvVar.f23582e = i11;
    }

    public final int i0() {
        return f3.b(12.66f, this.Y.f23580b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        float f10;
        ev evVar = this.f28351a;
        evVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        if (!z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.f24063a0.a(f10);
        evVar.f23786s = true;
        evVar.Q();
        View view = evVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.q1 q1Var = evVar.E;
        org.telegram.ui.Cells.l1 l1Var = evVar.F;
        if (q1Var != null && l1Var != null) {
            l1Var.B1(q1Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, this.Y, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        dv dvVar = this.Y;
        if (dvVar.o(characterStyle, qtVar)) {
            Rect rect = this.f28352b;
            qtVar.f26452e = (g0.L(53.0f) + (rect.left - this.f28351a.S)) - dvVar.f23583f;
            qtVar.f26453f = g0.L(14.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }
}
