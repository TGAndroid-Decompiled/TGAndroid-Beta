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
    public final AnimatedArrowDrawable f24168a0;
    public final Paint f24169b0;
    public org.telegram.ui.Components.lc f24170c0;
    public boolean f24171d0;
    public float f24172e0;
    public float f24173f0;

    public fu(ev evVar, Rect rect, int i7, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7);
        int i10;
        float f10;
        this.f24169b0 = new Paint(1);
        this.X = pageblockdetails;
        dv dvVar = new dv(evVar, spannableStringBuilder, i5.c.d(16.0f, this.f28443c - g0.L(53.0f), 0));
        this.Y = dvVar;
        this.Z = new dv[]{dvVar};
        if (evVar.E()) {
            i10 = org.telegram.ui.ActionBar.n6.vl;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.ul;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.n6.w0(i10, evVar.D));
        this.f24168a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f10);
    }

    @Override
    public final void A(int i7, Rect rect) {
        Rect rect2 = this.f28442b;
        int i10 = ((int) this.N) + rect2.top;
        int i11 = rect2.left;
        ev evVar = this.f28441a;
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
        return gd.N0(i7, null);
    }

    @Override
    public final CharSequence E(int i7) {
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        StaticLayout staticLayout;
        dv dvVar = this.Y;
        if (dvVar != null && (staticLayout = dvVar.f23706b) != null) {
            charSequence = zt.h0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String N0 = gd.N0(2131753984, null);
        if (this.X.open) {
            i10 = 2131754882;
        } else {
            i10 = 2131754892;
        }
        String N02 = gd.N0(i10, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(N0, ", ", N02, concat);
    }

    @Override
    public final int I() {
        Rect rect = this.f28442b;
        return i0() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28442b;
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
        org.telegram.ui.Components.lc lcVar = this.f24170c0;
        if (lcVar != null) {
            f10 = lcVar.a(0.02f);
        } else {
            f10 = 1.0f;
        }
        ev evVar = this.f28441a;
        float f11 = -evVar.S;
        int i11 = evVar.C + evVar.T;
        Rect rect = this.f28442b;
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
        AnimatedArrowDrawable animatedArrowDrawable = this.f24168a0;
        animatedArrowDrawable.f32622a.setColor(w02);
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
        if (!this.X.open && !evVar.f23888s) {
            if (evVar.E()) {
                i10 = org.telegram.ui.ActionBar.n6.xl;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.wl;
            }
            int w03 = org.telegram.ui.ActionBar.n6.w0(i10, evVar.D);
            Paint paint = this.f24169b0;
            paint.setColor(w03);
            canvas.drawRect(f11, i0() - 1.0f, f12, i0(), paint);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        ev evVar = this.f28441a;
        if (actionMasked == 0) {
            this.f24171d0 = true;
            if (this.f24170c0 == null && (view = evVar.Q) != null) {
                this.f24170c0 = new org.telegram.ui.Components.lc(view);
            }
            org.telegram.ui.Components.lc lcVar = this.f24170c0;
            if (lcVar != null) {
                lcVar.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.f24171d0) {
                return false;
            }
            this.f24171d0 = false;
            org.telegram.ui.Components.lc lcVar2 = this.f24170c0;
            if (lcVar2 != null) {
                lcVar2.c(false);
            }
            View view2 = evVar.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            j0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.f24171d0 = false;
                org.telegram.ui.Components.lc lcVar3 = this.f24170c0;
                if (lcVar3 != null) {
                    lcVar3.c(false);
                }
            }
            return this.f24171d0;
        }
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = g0.L(53.0f) + (i7 - this.f28441a.S);
        dv dvVar = this.Y;
        dvVar.f23707c = L - dvVar.f23709f;
        dvVar.d = g0.L(14.0f) + i10;
        dvVar.f23708e = i11;
    }

    public final int i0() {
        return f3.b(12.66f, this.Y.f23706b.getHeight() + g0.L(14.0f), g0.L(27.82f));
    }

    public final void j0() {
        float f10;
        ev evVar = this.f28441a;
        evVar.X();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z10 = pageblockdetails.open;
        pageblockdetails.open = !z10;
        if (!z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.f24168a0.a(f10);
        evVar.f23888s = true;
        evVar.Q();
        View view = evVar.Q;
        if (view != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.r1 r1Var = evVar.E;
        org.telegram.ui.Cells.m1 m1Var = evVar.F;
        if (r1Var != null && m1Var != null) {
            m1Var.B1(r1Var, true, true);
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
            Rect rect = this.f28442b;
            qtVar.f26562e = (g0.L(53.0f) + (rect.left - this.f28441a.S)) - dvVar.f23709f;
            qtVar.f26563f = g0.L(14.0f) + i7 + rect.top;
            return true;
        }
        return false;
    }
}
