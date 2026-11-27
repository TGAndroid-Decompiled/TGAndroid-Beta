package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class zk9 extends dk9 {
    public final gl9 X;
    public final gl9 Y;
    public final gl9[] Z;
    public final boolean a0;

    public zk9(hl9 hl9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(hl9Var, rect, i);
        boolean z;
        gl9 gl9Var;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z = true;
        } else {
            z = false;
        }
        this.a0 = z;
        gl9 gl9Var2 = new gl9(hl9Var, spannableStringBuilder, this.c, alignment);
        this.X = gl9Var2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            gl9Var = new gl9(hl9Var, spannableStringBuilder2, this.c, alignment);
        } else {
            gl9Var = null;
        }
        this.Y = gl9Var;
        this.Z = gl9Var == null ? new gl9[]{gl9Var2} : new gl9[]{gl9Var2, gl9Var};
    }

    @Override
    public final int H() {
        int i;
        Rect rect = this.b;
        int h0 = h0() + this.X.b.getHeight() + rect.top;
        gl9 gl9Var = this.Y;
        if (gl9Var != null) {
            i = gl9Var.b.getHeight();
        } else {
            i = 0;
        }
        return h0 + i + rect.bottom;
    }

    @Override
    public final int I() {
        gl9 gl9Var = this.Y;
        if (gl9Var == null) {
            gl9Var = this.X;
        }
        Rect rect = this.b;
        return gl9Var.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        int i;
        Rect rect = this.b;
        int i2 = rect.left;
        int r = this.X.r();
        gl9 gl9Var = this.Y;
        if (gl9Var != null) {
            i = gl9Var.r();
        } else {
            i = 0;
        }
        return Math.max(r, i) + i2 + rect.right;
    }

    @Override
    public final kmb[] K() {
        return this.Z;
    }

    @Override
    public final void S() {
        this.X.i(this.W);
        gl9 gl9Var = this.Y;
        if (gl9Var != null) {
            gl9Var.i(this.W);
        }
    }

    @Override
    public final void U() {
        this.X.f(this.W);
        gl9 gl9Var = this.Y;
        if (gl9Var != null) {
            gl9Var.f(this.W);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        canvas.save();
        gl9 gl9Var = this.X;
        canvas.translate(i0(gl9Var), 0.0f);
        gl9Var.d(canvas, gl9Var.T);
        canvas.restore();
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            canvas.save();
            canvas.translate(i0(gl9Var2), h0() + gl9Var.b.getHeight());
            gl9Var2.d(canvas, gl9Var2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int i;
        gl9 gl9Var = this.X;
        int height = gl9Var.b.getHeight();
        float y = motionEvent.getY();
        int i2 = 0;
        if (y >= 0.0f && y < height) {
            i = i0(gl9Var);
        } else {
            gl9Var = this.Y;
            if (gl9Var == null || y < h0() + height) {
                return false;
            }
            int i0 = i0(gl9Var);
            i2 = h0() + height;
            i = i0;
        }
        motionEvent.offsetLocation(-i, -i2);
        boolean t = gl9Var.t(motionEvent);
        motionEvent.offsetLocation(i, i2);
        return t;
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        gl9 gl9Var = this.X;
        gl9Var.c = (i0(gl9Var) + i) - gl9Var.f;
        gl9Var.d = i2;
        gl9Var.e = i3;
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            gl9Var2.c = (i0(gl9Var2) + i) - gl9Var2.f;
            gl9Var2.d = h0() + gl9Var.b.getHeight() + i2;
            gl9Var2.e = i3;
        }
    }

    @Override
    public final Layout a() {
        return this.X.b;
    }

    public final int h0() {
        if (this.Y != null) {
            return hl.L(2.0f);
        }
        return 0;
    }

    public final int i0(gl9 gl9Var) {
        int L;
        int r;
        Rect rect = this.b;
        boolean z = this.a0;
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

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        dk9.k(spannableStringBuilder, null, this.Z);
    }

    @Override
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        gl9 gl9Var = this.X;
        boolean o = gl9Var.o(characterStyle, vj9Var);
        Rect rect = this.b;
        if (o) {
            vj9Var.e = (i0(gl9Var) + rect.left) - gl9Var.f;
            vj9Var.f = i + rect.top;
            return true;
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null && gl9Var2.o(characterStyle, vj9Var)) {
            vj9Var.e = (i0(gl9Var2) + rect.left) - gl9Var2.f;
            int i2 = i + rect.top;
            vj9Var.f = h0() + gl9Var.b.getHeight() + i2;
            return true;
        }
        return false;
    }

    @Override
    public final boolean u() {
        return this.a0;
    }
}
