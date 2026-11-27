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
public final class jk9 extends dk9 {
    public final TL_iv.pageBlockDetails X;
    public final gl9 Y;
    public final gl9[] Z;
    public final AnimatedArrowDrawable a0;
    public final Paint b0;
    public v41 c0;
    public boolean d0;
    public float e0;
    public float f0;

    public jk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockDetails pageblockdetails, SpannableStringBuilder spannableStringBuilder) {
        super(hl9Var, rect, i);
        int i2;
        float f;
        this.b0 = new Paint(1);
        this.X = pageblockdetails;
        gl9 gl9Var = new gl9(hl9Var, spannableStringBuilder, c00.d(16.0f, this.c - hl.L(53.0f), 0));
        this.Y = gl9Var;
        this.Z = new gl9[]{gl9Var};
        if (hl9Var.D()) {
            i2 = aob.vl;
        } else {
            i2 = aob.ul;
        }
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(aob.v0(i2, hl9Var.D));
        this.a0 = animatedArrowDrawable;
        if (pageblockdetails.open) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animatedArrowDrawable.setAnimationProgress(f);
    }

    @Override
    public final int A() {
        return 1;
    }

    @Override
    public final CharSequence C() {
        int i;
        if (this.X.open) {
            i = 2131754878;
        } else {
            i = 2131754888;
        }
        return ob6.M0(i, null);
    }

    @Override
    public final CharSequence D(int i) {
        CharSequence charSequence;
        int i2;
        CharSequence concat;
        StaticLayout staticLayout = this.Y.b;
        if (staticLayout != null) {
            charSequence = dk9.g0(staticLayout.getText());
        } else {
            charSequence = null;
        }
        String M0 = ob6.M0(2131753980, null);
        if (this.X.open) {
            i2 = 2131754878;
        } else {
            i2 = 2131754888;
        }
        String M02 = ob6.M0(i2, null);
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
        return hl.L(16.0f) + r + hl.L(53.0f) + i + rect.right;
    }

    @Override
    public final kmb[] K() {
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
        v41 v41Var = this.c0;
        if (v41Var != null) {
            f = v41Var.a(0.02f);
        } else {
            f = 1.0f;
        }
        hl9 hl9Var = this.a;
        float f2 = -hl9Var.S;
        int i3 = hl9Var.C + hl9Var.T;
        Rect rect = this.b;
        float f3 = (i3 - rect.left) - rect.right;
        int i4 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i4 != 0) {
            canvas.save();
            canvas.scale(f, f, (f2 + f3) / 2.0f, h0() / 2.0f);
        }
        if (hl9Var.D()) {
            i = aob.vl;
        } else {
            i = aob.ul;
        }
        int v0 = aob.v0(i, hl9Var.D);
        AnimatedArrowDrawable animatedArrowDrawable = this.a0;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        canvas.save();
        canvas.translate(hl.N(22.6f) + f2, hl.N(21.66f));
        animatedArrowDrawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(hl.L(53.0f) + f2, hl.L(14.0f));
        gl9 gl9Var = this.Y;
        gl9Var.d(canvas, gl9Var.T);
        canvas.restore();
        if (i4 != 0) {
            canvas.restore();
        }
        if (!this.X.open && !hl9Var.s) {
            if (hl9Var.D()) {
                i2 = aob.xl;
            } else {
                i2 = aob.wl;
            }
            int v02 = aob.v0(i2, hl9Var.D);
            Paint paint = this.b0;
            paint.setColor(v02);
            canvas.drawRect(f2, h0() - 1.0f, f3, h0(), paint);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        hl9 hl9Var = this.a;
        if (actionMasked == 0) {
            this.d0 = true;
            v41 v41Var = this.c0;
            if (v41Var == null && (view = hl9Var.Q) != null) {
                v41Var = new v41(view);
                this.c0 = v41Var;
            }
            if (v41Var != null) {
                v41Var.c(true);
            }
            return true;
        } else if (actionMasked == 1) {
            if (!this.d0) {
                return false;
            }
            this.d0 = false;
            v41 v41Var2 = this.c0;
            if (v41Var2 != null) {
                v41Var2.c(false);
            }
            View view2 = hl9Var.Q;
            if (view2 != null) {
                view2.playSoundEffect(0);
            }
            i0();
            return true;
        } else {
            if (actionMasked == 3) {
                this.d0 = false;
                v41 v41Var3 = this.c0;
                if (v41Var3 != null) {
                    v41Var3.c(false);
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
        gl9 gl9Var = this.Y;
        gl9Var.c = (hl.L(53.0f) + i4) - gl9Var.f;
        gl9Var.d = hl.L(14.0f) + i2;
        gl9Var.e = i3;
    }

    public final int h0() {
        return qu6.e(12.66f, this.Y.b.getHeight() + hl.L(14.0f), hl.L(27.82f));
    }

    public final void i0() {
        float f;
        hl9 hl9Var = this.a;
        hl9Var.W();
        TL_iv.pageBlockDetails pageblockdetails = this.X;
        boolean z = pageblockdetails.open;
        pageblockdetails.open = !z;
        if (!z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.a0.a(f);
        hl9Var.s = true;
        hl9Var.P();
        View view = hl9Var.Q;
        if (view != null) {
            view.invalidate();
        }
        wb2 wb2Var = hl9Var.E;
        rb2 rb2Var = hl9Var.F;
        if (wb2Var != null && rb2Var != null) {
            rb2Var.r1(wb2Var, true, true);
        }
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        dk9.k(spannableStringBuilder, this.Y, this.Z);
    }

    @Override
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        gl9 gl9Var = this.Y;
        if (gl9Var.o(characterStyle, vj9Var)) {
            Rect rect = this.b;
            vj9Var.e = (hl.L(53.0f) + (rect.left - this.a.S)) - gl9Var.f;
            vj9Var.f = hl.L(14.0f) + i + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final void z(int i, Rect rect) {
        Rect rect2 = this.b;
        int i2 = ((int) this.N) + rect2.top;
        int i3 = rect2.left;
        hl9 hl9Var = this.a;
        rect.set(i3 - hl9Var.S, i2, (hl9Var.C + hl9Var.T) - rect2.right, h0() + i2);
    }
}
