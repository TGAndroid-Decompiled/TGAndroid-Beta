package defpackage;

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
public final class wi9 extends qi9 {
    public final TL_iv.pageBlockDetails X;
    public final tj9 Y;
    public final tj9[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public u51 c0;
    public boolean d0;
    public float e0;
    public float f0;

    public wi9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(uj9Var, rect, i);
        int i2;
        float f;
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        tj9 tj9Var = new tj9(uj9Var, spannableStringBuilder, b10.c(16.0f, this.c - gm.L(53.0f), 0));
        this.Y = tj9Var;
        this.Z = new tj9[]{tj9Var};
        if (uj9Var.D()) {
            i2 = cmb.ul;
        } else {
            i2 = cmb.tl;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(cmb.v0(i2, uj9Var.D));
        this.a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f);
    }

    @Override
    public final int B() {
        return 1;
    }

    @Override
    public final CharSequence C() {
        int i;
        if (this.X.open) {
            i = 2131754882;
        } else {
            i = 2131754892;
        }
        return jb6.M0(i, null);
    }

    @Override
    public final CharSequence D(int i) {
        CharSequence charSequence;
        int i2;
        CharSequence concat;
        StaticLayout staticLayout = this.Y.b;
        if (staticLayout != null) {
            charSequence = qi9.g0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String M0 = jb6.M0(2131753952, null);
        if (this.X.open) {
            i2 = 2131754882;
        } else {
            i2 = 2131754892;
        }
        String M02 = jb6.M0(i2, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(M0, ", ", M02, concat);
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return h0() + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        int i = rect.left;
        int r = this.Y.r();
        return gm.L(16.0f) + r + gm.L(53.0f) + i + rect.right;
    }

    @Override
    public final qkb[] K() {
        return this.Z;
    }

    @Override
    public final void S() {
        this.Y.i(this.W);
    }

    @Override
    public final boolean T(int i, View view) {
        i0();
        return true;
    }

    @Override
    public final void U() {
        this.Y.f(this.W);
    }

    @Override
    public final void V(Canvas canvas) {
        float f;
        int i;
        int i2;
        u51 u51Var = this.c0;
        if (u51Var != null) {
            f = u51Var.a(0.02f);
        } else {
            f = 1.0f;
        }
        uj9 uj9Var = this.a;
        float f2 = -uj9Var.S;
        int i3 = uj9Var.C + uj9Var.T;
        Rect rect = this.b;
        float f3 = (i3 - rect.left) - rect.right;
        int i4 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i4 != 0) {
            canvas.save();
            canvas.scale(f, f, (f2 + f3) / 2.0f, h0() / 2.0f);
        }
        if (uj9Var.D()) {
            i = cmb.ul;
        } else {
            i = cmb.tl;
        }
        int v0 = cmb.v0(i, uj9Var.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(gm.N(22.6f) + f2, gm.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(gm.L(53.0f) + f2, gm.L(14.0f));
        tj9 tj9Var = this.Y;
        tj9Var.d(canvas, tj9Var.T);
        canvas.restore();
        if (i4 != 0) {
            canvas.restore();
        }
        if (!this.X.open && !uj9Var.s) {
            if (uj9Var.D()) {
                i2 = cmb.wl;
            } else {
                i2 = cmb.vl;
            }
            int v02 = cmb.v0(i2, uj9Var.D);
            Paint paint = this.b0;
            paint.setColor(v02);
            canvas.drawRect(f2, h0() - 1.0f, f3, h0(), paint);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        uj9 uj9Var = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            u51 u51Var = this.c0;
            if (u51Var == null && (view = uj9Var.Q) != null) {
                u51Var = new u51(view);
                this.c0 = u51Var;
            }
            if (u51Var != null) {
                u51Var.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.d0) {
                return false;
            }
            this.d0 = false;
            u51 u51Var2 = this.c0;
            if (u51Var2 != null) {
                u51Var2.c(false);
            }
            View view2 = uj9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            i0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.d0 = false;
                u51 u51Var3 = this.c0;
                if (u51Var3 != null) {
                    u51Var3.c(false);
                }
            }
            return this.d0;
        }
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        int i4 = i - this.a.S;
        tj9 tj9Var = this.Y;
        tj9Var.c = (gm.L(53.0f) + i4) - tj9Var.f;
        tj9Var.d = gm.L(14.0f) + i2;
        tj9Var.e = i3;
    }

    public final int h0() {
        return kt6.e(12.66f, this.Y.b.getHeight() + gm.L(14.0f), gm.L(27.82f));
    }

    public final void i0() {
        float f;
        uj9 uj9Var = this.a;
        uj9Var.W();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z = pageblockdetails.open;
        pageblockdetails.open = !z;
        if (!z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.a0.a(f);
        uj9Var.s = true;
        uj9Var.P();
        View view = uj9Var.Q;
        if (view != null) {
            view.invalidate();
        }
        rc2 rc2Var = uj9Var.E;
        mc2 mc2Var = uj9Var.F;
        if (rc2Var != null && mc2Var != null) {
            mc2Var.u1(rc2Var, true, true);
        }
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        qi9.k(spannableStringBuilder, this.Y, this.Z);
    }

    @Override
    public final boolean t(CharacterStyle characterStyle, int i, ii9 ii9Var) {
        tj9 tj9Var = this.Y;
        if (tj9Var.o(characterStyle, ii9Var)) {
            Rect rect = this.b;
            ii9Var.e = (gm.L(53.0f) + (rect.left - this.a.S)) - tj9Var.f;
            ii9Var.f = gm.L(14.0f) + i + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final void z(int i, Rect rect) {
        Rect rect2 = this.b;
        int i2 = ((int) this.N) + rect2.top;
        int i3 = rect2.left;
        uj9 uj9Var = this.a;
        rect.set(i3 - uj9Var.S, i2, (uj9Var.C + uj9Var.T) - rect2.right, h0() + i2);
    }
}
