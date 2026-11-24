package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class ui9 extends qi9 {
    public final tj9 X;
    public final tj9 Y;
    public final boolean Z;
    public final qkb[] a0;

    public ui9(uj9 uj9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(uj9Var, rect, i);
        tj9 tj9Var;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            tj9Var = new tj9(uj9Var, spannableStringBuilder, this.c);
        } else {
            tj9Var = null;
        }
        this.X = tj9Var;
        tj9 tj9Var2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new tj9(uj9Var, spannableStringBuilder2, this.c);
        this.Y = tj9Var2;
        this.Z = uj9Var.H();
        ArrayList arrayList = new ArrayList(2);
        if (tj9Var != null) {
            arrayList.add(tj9Var);
        }
        if (tj9Var2 != null) {
            arrayList.add(tj9Var2);
        }
        this.a0 = (qkb[]) arrayList.toArray(new qkb[0]);
    }

    @Override
    public final int H() {
        int i;
        Rect rect = this.b;
        int i2 = rect.top;
        int i3 = 0;
        tj9 tj9Var = this.X;
        if (tj9Var != null) {
            i = tj9Var.b.getHeight();
        } else {
            i = 0;
        }
        int i0 = i0() + i + i2;
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            i3 = tj9Var2.b.getHeight();
        }
        return i0 + i3 + rect.bottom;
    }

    @Override
    public final int I() {
        int i;
        int i2;
        Rect rect = this.b;
        tj9 tj9Var = this.Y;
        if (tj9Var != null) {
            i = tj9Var.q() + rect.left;
            i2 = rect.right;
        } else {
            i = rect.left;
            tj9 tj9Var2 = this.X;
            if (tj9Var2 != null) {
                return tj9Var2.q() + i + rect.right;
            }
            i2 = rect.right;
        }
        return i + i2;
    }

    @Override
    public final int J() {
        int i = 0;
        tj9 tj9Var = this.X;
        if (tj9Var != null) {
            i = Math.max(0, tj9Var.r());
        }
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            i = Math.max(i, tj9Var2.r());
        }
        Rect rect = this.b;
        return rect.left + i + rect.right;
    }

    @Override
    public final qkb[] K() {
        return this.a0;
    }

    @Override
    public final void S() {
        tj9 tj9Var = this.X;
        if (tj9Var != null) {
            tj9Var.i(this.W);
        }
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            tj9Var2.i(this.W);
        }
    }

    @Override
    public final void U() {
        tj9 tj9Var = this.X;
        if (tj9Var != null) {
            tj9Var.f(this.W);
        }
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            tj9Var2.f(this.W);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        tj9 tj9Var = this.X;
        if (tj9Var != null) {
            tj9Var.d(canvas, tj9Var.T);
        }
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            canvas.save();
            float h0 = h0();
            if (tj9Var != null) {
                i = tj9Var.b.getHeight();
            } else {
                i = 0;
            }
            canvas.translate(h0, i0() + i);
            tj9Var2.d(canvas, tj9Var2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int i;
        Rect rect;
        int i2;
        tj9 tj9Var = this.X;
        if (tj9Var != null) {
            i = tj9Var.b.getHeight();
        } else {
            i = 0;
        }
        int i0 = i0();
        float y = motionEvent.getY();
        int i3 = this.b.top;
        float f = y - i3;
        if (tj9Var != null && f >= 0.0f && f < i) {
            motionEvent.offsetLocation(0.0f, -i3);
            boolean t = tj9Var.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t;
        }
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 == null || f < i + i0) {
            return false;
        }
        int h0 = h0();
        motionEvent.offsetLocation(-h0, -i2);
        boolean t2 = tj9Var2.t(motionEvent);
        motionEvent.offsetLocation(h0, i3 + i + i0);
        return t2;
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        int i4;
        this.T = i;
        this.U = i2;
        this.V = i3;
        tj9 tj9Var = this.X;
        if (tj9Var != null) {
            tj9Var.c = i - tj9Var.f;
            tj9Var.d = i2;
            tj9Var.e = i3;
        }
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            tj9Var2.c = (h0() + i) - tj9Var2.f;
            if (tj9Var != null) {
                i4 = tj9Var.b.getHeight();
            } else {
                i4 = 0;
            }
            tj9Var2.d = i0() + i4 + i2;
            tj9Var2.e = i3;
        }
    }

    public final int h0() {
        tj9 tj9Var = this.Y;
        if (tj9Var == null || !this.Z) {
            return 0;
        }
        int i = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i - rect.left) - rect.right) - tj9Var.r());
    }

    public final int i0() {
        if (this.X != null && this.Y != null) {
            return gm.L(4.0f);
        }
        return 0;
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        qi9.k(spannableStringBuilder, this.X, null);
        tj9 tj9Var = this.Y;
        if (tj9Var != null && (staticLayout = tj9Var.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
