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
public final class tg9 extends mg9 {
    public final TL_iv.pageBlockDetails X;
    public final qh9 Y;
    public final qh9[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public n41 c0;
    public boolean d0;
    public float e0;
    public float f0;

    public tg9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(rh9Var, rect, i);
        int i2;
        float f;
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        qh9 qh9Var = new qh9(rh9Var, spannableStringBuilder, b00.c(16.0f, this.c - gl.L(53.0f), 0));
        this.Y = qh9Var;
        this.Z = new qh9[]{qh9Var};
        if (rh9Var.D()) {
            i2 = bkb.ul;
        } else {
            i2 = bkb.tl;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(bkb.v0(i2, rh9Var.D));
        this.a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f);
    }

    @Override
    public final void A(int i, Rect rect) {
        Rect rect2 = this.b;
        int i2 = ((int) this.N) + rect2.top;
        int i3 = rect2.left;
        rh9 rh9Var = this.a;
        rect.set(i3 - rh9Var.S, i2, (rh9Var.C + rh9Var.T) - rect2.right, i0() + i2);
    }

    @Override
    public final int C() {
        return 1;
    }

    @Override
    public final CharSequence D() {
        int i;
        if (this.X.open) {
            i = 2131754882;
        } else {
            i = 2131754892;
        }
        return k96.M0(i, null);
    }

    @Override
    public final CharSequence E(int i) {
        CharSequence charSequence;
        int i2;
        CharSequence concat;
        StaticLayout staticLayout = this.Y.b;
        if (staticLayout != null) {
            charSequence = mg9.h0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String M0 = k96.M0(2131753984, null);
        if (this.X.open) {
            i2 = 2131754882;
        } else {
            i2 = 2131754892;
        }
        String M02 = k96.M0(i2, null);
        if (TextUtils.isEmpty(charSequence)) {
            concat = "";
        } else {
            concat = TextUtils.concat(", ", charSequence);
        }
        return TextUtils.concat(M0, ", ", M02, concat);
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return i0() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.b;
        int i = rect.left;
        int r = this.Y.r();
        return gl.L(16.0f) + r + gl.L(53.0f) + i + rect.right;
    }

    @Override
    public final pib[] L() {
        return this.Z;
    }

    @Override
    public final void T() {
        this.Y.i(this.W);
    }

    @Override
    public final boolean U(int i, View view) {
        j0();
        return true;
    }

    @Override
    public final void V() {
        this.Y.f(this.W);
    }

    @Override
    public final void W(Canvas canvas) {
        float f;
        int i;
        int i2;
        n41 n41Var = this.c0;
        if (n41Var != null) {
            f = n41Var.a(0.02f);
        } else {
            f = 1.0f;
        }
        rh9 rh9Var = this.a;
        float f2 = -rh9Var.S;
        int i3 = rh9Var.C + rh9Var.T;
        Rect rect = this.b;
        float f3 = (i3 - rect.left) - rect.right;
        int i4 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i4 != 0) {
            canvas.save();
            canvas.scale(f, f, (f2 + f3) / 2.0f, i0() / 2.0f);
        }
        if (rh9Var.D()) {
            i = bkb.ul;
        } else {
            i = bkb.tl;
        }
        int v0 = bkb.v0(i, rh9Var.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(gl.N(22.6f) + f2, gl.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(gl.L(53.0f) + f2, gl.L(14.0f));
        qh9 qh9Var = this.Y;
        qh9Var.d(canvas, qh9Var.T);
        canvas.restore();
        if (i4 != 0) {
            canvas.restore();
        }
        if (!this.X.open && !rh9Var.s) {
            if (rh9Var.D()) {
                i2 = bkb.wl;
            } else {
                i2 = bkb.vl;
            }
            int v02 = bkb.v0(i2, rh9Var.D);
            Paint paint = this.b0;
            paint.setColor(v02);
            canvas.drawRect(f2, i0() - 1.0f, f3, i0(), paint);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        rh9 rh9Var = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            n41 n41Var = this.c0;
            if (n41Var == null && (view = rh9Var.Q) != null) {
                n41Var = new n41(view);
                this.c0 = n41Var;
            }
            if (n41Var != null) {
                n41Var.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.d0) {
                return false;
            }
            this.d0 = false;
            n41 n41Var2 = this.c0;
            if (n41Var2 != null) {
                n41Var2.c(false);
            }
            View view2 = rh9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            j0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.d0 = false;
                n41 n41Var3 = this.c0;
                if (n41Var3 != null) {
                    n41Var3.c(false);
                }
            }
            return this.d0;
        }
    }

    @Override
    public final void Z(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        int i4 = i - this.a.S;
        qh9 qh9Var = this.Y;
        qh9Var.c = (gl.L(53.0f) + i4) - qh9Var.f;
        qh9Var.d = gl.L(14.0f) + i2;
        qh9Var.e = i3;
    }

    public final int i0() {
        return ls6.e(12.66f, this.Y.b.getHeight() + gl.L(14.0f), gl.L(27.82f));
    }

    public final void j0() {
        float f;
        rh9 rh9Var = this.a;
        rh9Var.W();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z = pageblockdetails.open;
        pageblockdetails.open = !z;
        if (!z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.a0.a(f);
        rh9Var.s = true;
        rh9Var.P();
        View view = rh9Var.Q;
        if (view != null) {
            view.invalidate();
        }
        gb2 gb2Var = rh9Var.E;
        bb2 bb2Var = rh9Var.F;
        if (gb2Var != null && bb2Var != null) {
            bb2Var.G1(gb2Var, true, true);
        }
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        mg9.m(spannableStringBuilder, this.Y, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        qh9 qh9Var = this.Y;
        if (qh9Var.o(characterStyle, eg9Var)) {
            Rect rect = this.b;
            eg9Var.e = (gl.L(53.0f) + (rect.left - this.a.S)) - qh9Var.f;
            eg9Var.f = gl.L(14.0f) + i + rect.top;
            return true;
        }
        return false;
    }
}
