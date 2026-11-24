package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class rg9 extends mg9 {
    public final qh9 X;
    public final qh9 Y;
    public final boolean Z;
    public final pib[] a0;

    public rg9(rh9 rh9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(rh9Var, rect, i);
        qh9 qh9Var;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            qh9Var = new qh9(rh9Var, spannableStringBuilder, this.c);
        } else {
            qh9Var = null;
        }
        this.X = qh9Var;
        qh9 qh9Var2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new qh9(rh9Var, spannableStringBuilder2, this.c);
        this.Y = qh9Var2;
        this.Z = rh9Var.H();
        ArrayList arrayList = new ArrayList(2);
        if (qh9Var != null) {
            arrayList.add(qh9Var);
        }
        if (qh9Var2 != null) {
            arrayList.add(qh9Var2);
        }
        this.a0 = (pib[]) arrayList.toArray(new pib[0]);
    }

    @Override
    public final int I() {
        int i;
        Rect rect = this.b;
        int i2 = rect.top;
        int i3 = 0;
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            i = qh9Var.b.getHeight();
        } else {
            i = 0;
        }
        int j0 = j0() + i + i2;
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            i3 = qh9Var2.b.getHeight();
        }
        return j0 + i3 + rect.bottom;
    }

    @Override
    public final int J() {
        int i;
        int i2;
        Rect rect = this.b;
        qh9 qh9Var = this.Y;
        if (qh9Var != null) {
            i = qh9Var.q() + rect.left;
            i2 = rect.right;
        } else {
            i = rect.left;
            qh9 qh9Var2 = this.X;
            if (qh9Var2 != null) {
                return qh9Var2.q() + i + rect.right;
            }
            i2 = rect.right;
        }
        return i + i2;
    }

    @Override
    public final int K() {
        int i = 0;
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            i = Math.max(0, qh9Var.r());
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            i = Math.max(i, qh9Var2.r());
        }
        Rect rect = this.b;
        return rect.left + i + rect.right;
    }

    @Override
    public final pib[] L() {
        return this.a0;
    }

    @Override
    public final void T() {
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.i(this.W);
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            qh9Var2.i(this.W);
        }
    }

    @Override
    public final void V() {
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.f(this.W);
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            qh9Var2.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i;
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.d(canvas, qh9Var.T);
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            canvas.save();
            float i0 = i0();
            if (qh9Var != null) {
                i = qh9Var.b.getHeight();
            } else {
                i = 0;
            }
            canvas.translate(i0, j0() + i);
            qh9Var2.d(canvas, qh9Var2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i;
        Rect rect;
        int i2;
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            i = qh9Var.b.getHeight();
        } else {
            i = 0;
        }
        int j0 = j0();
        float y = motionEvent.getY();
        int i3 = this.b.top;
        float f = y - i3;
        if (qh9Var != null && f >= 0.0f && f < i) {
            motionEvent.offsetLocation(0.0f, -i3);
            boolean t = qh9Var.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t;
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 == null || f < i + j0) {
            return false;
        }
        int i0 = i0();
        motionEvent.offsetLocation(-i0, -i2);
        boolean t2 = qh9Var2.t(motionEvent);
        motionEvent.offsetLocation(i0, i3 + i + j0);
        return t2;
    }

    @Override
    public final void Z(int i, int i2, int i3) {
        int i4;
        this.T = i;
        this.U = i2;
        this.V = i3;
        qh9 qh9Var = this.X;
        if (qh9Var != null) {
            qh9Var.c = i - qh9Var.f;
            qh9Var.d = i2;
            qh9Var.e = i3;
        }
        qh9 qh9Var2 = this.Y;
        if (qh9Var2 != null) {
            qh9Var2.c = (i0() + i) - qh9Var2.f;
            if (qh9Var != null) {
                i4 = qh9Var.b.getHeight();
            } else {
                i4 = 0;
            }
            qh9Var2.d = j0() + i4 + i2;
            qh9Var2.e = i3;
        }
    }

    public final int i0() {
        qh9 qh9Var = this.Y;
        if (qh9Var == null || !this.Z) {
            return 0;
        }
        int i = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i - rect.left) - rect.right) - qh9Var.r());
    }

    public final int j0() {
        if (this.X != null && this.Y != null) {
            return gl.L(4.0f);
        }
        return 0;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        mg9.m(spannableStringBuilder, this.X, null);
        qh9 qh9Var = this.Y;
        if (qh9Var != null && (staticLayout = qh9Var.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(staticLayout.getText());
        }
    }

    @Override
    public final boolean v() {
        return false;
    }
}
