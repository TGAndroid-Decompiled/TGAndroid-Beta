package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class jh9 extends mg9 {
    public final qh9 X;
    public final qh9 Y;
    public final qh9[] Z;
    public final boolean a0;

    public jh9(rh9 rh9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(rh9Var, rect, i);
        boolean z;
        qh9 qh9Var;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z = true;
        } else {
            z = false;
        }
        this.a0 = z;
        qh9 qh9Var2 = new qh9(rh9Var, spannableStringBuilder, this.c, alignment);
        this.X = qh9Var2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            qh9Var = new qh9(rh9Var, spannableStringBuilder2, this.c, alignment);
        } else {
            qh9Var = null;
        }
        this.Y = qh9Var;
        this.Z = qh9Var == null ? new qh9[]{qh9Var2} : new qh9[]{qh9Var2, qh9Var};
    }

    @Override
    public final int I() {
        int i;
        Rect rect = this.b;
        int i0 = i0() + this.X.b.getHeight() + rect.top;
        qh9 qh9Var = this.Y;
        if (qh9Var != null) {
            i = qh9Var.b.getHeight();
        } else {
            i = 0;
        }
        return i0 + i + rect.bottom;
    }

    @Override
    public final int J() {
        qh9 qh9Var = this.Y;
        if (qh9Var == null) {
            qh9Var = this.X;
        }
        Rect rect = this.b;
        return qh9Var.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        int i;
        Rect rect = this.b;
        int i2 = rect.left;
        int r = this.X.r();
        qh9 qh9Var = this.Y;
        if (qh9Var != null) {
            i = qh9Var.r();
        } else {
            i = 0;
        }
        return Math.max(r, i) + i2 + rect.right;
    }

    @Override
    public final pib[] L() {
        return this.Z;
    }

    @Override
    public final void T() {
        this.X.i(this.W);
        qh9 qh9Var = this.Y;
        if (qh9Var != null) {
            qh9Var.i(this.W);
        }
    }

    @Override
    public final void V() {
        this.X.f(this.W);
        qh9 qh9Var = this.Y;
        if (qh9Var != null) {
            qh9Var.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        canvas.save();
        qh9 qh9Var = this.X;
        canvas.translate(j0(qh9Var), 0.0f);
        qh9Var.d(canvas, qh9Var.T);
        canvas.restore();
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            canvas.save();
            canvas.translate(j0(qh9Var2), i0() + qh9Var.b.getHeight());
            qh9Var2.d(canvas, qh9Var2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i;
        qh9 qh9Var = this.X;
        int height = qh9Var.b.getHeight();
        float y = motionEvent.getY();
        int i2 = 0;
        if (y >= 0.0f && y < height) {
            i = j0(qh9Var);
        } else {
            qh9Var = this.Y;
            if (qh9Var == null || y < i0() + height) {
                return false;
            }
            int j0 = j0(qh9Var);
            i2 = i0() + height;
            i = j0;
        }
        motionEvent.offsetLocation(-i, -i2);
        boolean t = qh9Var.t(motionEvent);
        motionEvent.offsetLocation(i, i2);
        return t;
    }

    @Override
    public final void Z(int i, int i2, int i3) {
        qh9 qh9Var = this.X;
        qh9Var.c = (j0(qh9Var) + i) - qh9Var.f;
        qh9Var.d = i2;
        qh9Var.e = i3;
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            qh9Var2.c = (j0(qh9Var2) + i) - qh9Var2.f;
            qh9Var2.d = i0() + qh9Var.b.getHeight() + i2;
            qh9Var2.e = i3;
        }
    }

    @Override
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        if (this.Y != null) {
            return gl.L(2.0f);
        }
        return 0;
    }

    public final int j0(qh9 qh9Var) {
        int L;
        int r;
        Rect rect = this.b;
        boolean z = this.a0;
        rh9 rh9Var = this.a;
        if (z) {
            L = (((rh9Var.C + rh9Var.T) - rh9Var.S) - qh9Var.r()) / 2;
            r = rect.left;
        } else if (!rh9Var.H()) {
            return 0;
        } else {
            L = (((rh9Var.C + rh9Var.T) - gl.L(14.0f)) - rect.right) - rect.left;
            r = qh9Var.r();
        }
        return L - r;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        mg9.m(spannableStringBuilder, null, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        qh9 qh9Var = this.X;
        boolean o = qh9Var.o(characterStyle, eg9Var);
        Rect rect = this.b;
        if (o) {
            eg9Var.e = (j0(qh9Var) + rect.left) - qh9Var.f;
            eg9Var.f = i + rect.top;
            return true;
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null && qh9Var2.o(characterStyle, eg9Var)) {
            eg9Var.e = (j0(qh9Var2) + rect.left) - qh9Var2.f;
            int i2 = i + rect.top;
            eg9Var.f = i0() + qh9Var.b.getHeight() + i2;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.a0;
    }
}
