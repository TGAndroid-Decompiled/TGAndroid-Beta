package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public class xk9 extends dk9 {
    public final gl9 X;
    public final gl9[] Y;
    public final boolean Z;
    public int a0;
    public int b0;
    public int c0;

    public xk9(hl9 hl9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder) {
        super(hl9Var, rect, i);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        gl9 gl9Var = new gl9(hl9Var, spannableStringBuilder, this.c, alignment);
        this.X = gl9Var;
        this.Y = r3;
        gl9[] gl9VarArr = {gl9Var};
    }

    @Override
    public final int G() {
        return this.a0;
    }

    @Override
    public int H() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + this.a0 + this.b0 + rect.bottom;
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override
    public final kmb[] K() {
        return this.Y;
    }

    @Override
    public final void S() {
        this.X.i(this.W);
    }

    @Override
    public final void U() {
        this.X.f(this.W);
    }

    @Override
    public void V(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int h0 = h0();
        gl9 gl9Var = this.X;
        if (h0 != 0) {
            gl9Var.c = (this.b.left + h0) - gl9Var.f;
            canvas.save();
            canvas.translate(h0, 0.0f);
            gl9Var.d(canvas, gl9Var.T);
            canvas.restore();
        } else {
            gl9Var.d(canvas, gl9Var.T);
        }
        canvas.restore();
    }

    @Override
    public final void W(Canvas canvas, int i, float f) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int h0 = h0();
        gl9 gl9Var = this.X;
        if (h0 != 0) {
            gl9Var.c = (this.b.left + h0) - gl9Var.f;
            canvas.save();
            canvas.translate(h0, 0.0f);
            gl9Var.m(canvas, i, f);
            canvas.restore();
        } else {
            gl9Var.m(canvas, i, f);
        }
        canvas.restore();
    }

    @Override
    public boolean X(MotionEvent motionEvent) {
        int h0 = h0();
        motionEvent.offsetLocation(-h0, -this.a0);
        boolean t = this.X.t(motionEvent);
        motionEvent.offsetLocation(h0, this.a0);
        return t;
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        super.Y(i, i2 + this.a0, i3);
        int h0 = h0();
        if (h0 != 0) {
            gl9 gl9Var = this.X;
            gl9Var.c = (i + h0) - gl9Var.f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.b;
    }

    public final int h0() {
        int L;
        int r;
        Rect rect = this.b;
        gl9 gl9Var = this.X;
        boolean z = this.Z;
        hl9 hl9Var = this.a;
        if (z) {
            L = (((hl9Var.C + hl9Var.T) - hl9Var.S) - gl9Var.r()) / 2;
            r = rect.left;
        } else if (!hl9Var.H()) {
            return 0;
        } else {
            L = (((hl9Var.C + hl9Var.T) - hl.L(14.0f)) - rect.right) - rect.left;
            r = gl9Var.r();
        }
        return L - r;
    }

    public final void i0(int i, int i2) {
        this.a0 = i;
        this.b0 = i2;
        f0();
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        dk9.k(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        gl9 gl9Var = this.X;
        if (gl9Var.o(characterStyle, vj9Var)) {
            Rect rect = this.b;
            vj9Var.e = (h0() + rect.left) - gl9Var.f;
            vj9Var.f = i + rect.top + this.a0;
            return true;
        }
        return false;
    }

    @Override
    public final boolean u() {
        return this.Z;
    }
}
