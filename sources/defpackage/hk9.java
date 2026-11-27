package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class hk9 extends dk9 {
    public final gl9 X;
    public final gl9 Y;
    public final boolean Z;
    public final kmb[] a0;

    public hk9(hl9 hl9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(hl9Var, rect, i);
        gl9 gl9Var;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            gl9Var = new gl9(hl9Var, spannableStringBuilder, this.c);
        } else {
            gl9Var = null;
        }
        this.X = gl9Var;
        gl9 gl9Var2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new gl9(hl9Var, spannableStringBuilder2, this.c);
        this.Y = gl9Var2;
        this.Z = hl9Var.H();
        ArrayList arrayList = new ArrayList(2);
        if (gl9Var != null) {
            arrayList.add(gl9Var);
        }
        if (gl9Var2 != null) {
            arrayList.add(gl9Var2);
        }
        this.a0 = (kmb[]) arrayList.toArray(new kmb[0]);
    }

    @Override
    public final int H() {
        int i;
        Rect rect = this.b;
        int i2 = rect.top;
        int i3 = 0;
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            i = gl9Var.b.getHeight();
        } else {
            i = 0;
        }
        int i0 = i0() + i + i2;
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            i3 = gl9Var2.b.getHeight();
        }
        return i0 + i3 + rect.bottom;
    }

    @Override
    public final int I() {
        int i;
        int i2;
        Rect rect = this.b;
        gl9 gl9Var = this.Y;
        if (gl9Var != null) {
            i = gl9Var.q() + rect.left;
            i2 = rect.right;
        } else {
            i = rect.left;
            gl9 gl9Var2 = this.X;
            if (gl9Var2 != null) {
                return gl9Var2.q() + i + rect.right;
            }
            i2 = rect.right;
        }
        return i + i2;
    }

    @Override
    public final int J() {
        int i = 0;
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            i = Math.max(0, gl9Var.r());
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            i = Math.max(i, gl9Var2.r());
        }
        Rect rect = this.b;
        return rect.left + i + rect.right;
    }

    @Override
    public final kmb[] K() {
        return this.a0;
    }

    @Override
    public final void S() {
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.i(this.W);
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            gl9Var2.i(this.W);
        }
    }

    @Override
    public final void U() {
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.f(this.W);
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            gl9Var2.f(this.W);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.d(canvas, gl9Var.T);
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            canvas.save();
            float h0 = h0();
            if (gl9Var != null) {
                i = gl9Var.b.getHeight();
            } else {
                i = 0;
            }
            canvas.translate(h0, i0() + i);
            gl9Var2.d(canvas, gl9Var2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int i;
        Rect rect;
        int i2;
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            i = gl9Var.b.getHeight();
        } else {
            i = 0;
        }
        int i0 = i0();
        float y = motionEvent.getY();
        int i3 = this.b.top;
        float f = y - i3;
        if (gl9Var != null && f >= 0.0f && f < i) {
            motionEvent.offsetLocation(0.0f, -i3);
            boolean t = gl9Var.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t;
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 == null || f < i + i0) {
            return false;
        }
        int h0 = h0();
        motionEvent.offsetLocation(-h0, -i2);
        boolean t2 = gl9Var2.t(motionEvent);
        motionEvent.offsetLocation(h0, i3 + i + i0);
        return t2;
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        int i4;
        this.T = i;
        this.U = i2;
        this.V = i3;
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.c = i - gl9Var.f;
            gl9Var.d = i2;
            gl9Var.e = i3;
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            gl9Var2.c = (h0() + i) - gl9Var2.f;
            if (gl9Var != null) {
                i4 = gl9Var.b.getHeight();
            } else {
                i4 = 0;
            }
            gl9Var2.d = i0() + i4 + i2;
            gl9Var2.e = i3;
        }
    }

    public final int h0() {
        gl9 gl9Var = this.Y;
        if (gl9Var == null || !this.Z) {
            return 0;
        }
        int i = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i - rect.left) - rect.right) - gl9Var.r());
    }

    public final int i0() {
        if (this.X != null && this.Y != null) {
            return hl.L(4.0f);
        }
        return 0;
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        dk9.k(spannableStringBuilder, this.X, null);
        gl9 gl9Var = this.Y;
        if (gl9Var != null && (staticLayout = gl9Var.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(staticLayout.getText());
        }
    }

    @Override
    public final boolean u() {
        return false;
    }
}
