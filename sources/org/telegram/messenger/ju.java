package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class ju extends fu {
    public final jv W;
    public final jv X;
    public final boolean Y;
    public final org.telegram.ui.Cells.t9[] Z;

    public ju(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(kvVar, rect, i7);
        jv jvVar;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            jvVar = new jv(kvVar, spannableStringBuilder, this.f22452c);
        } else {
            jvVar = null;
        }
        this.W = jvVar;
        jv jvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new jv(kvVar, spannableStringBuilder2, this.f22452c);
        this.X = jvVar2;
        this.Y = kvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (jvVar != null) {
            arrayList.add(jvVar);
        }
        if (jvVar2 != null) {
            arrayList.add(jvVar2);
        }
        this.Z = (org.telegram.ui.Cells.t9[]) arrayList.toArray(new org.telegram.ui.Cells.t9[0]);
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f22451b;
        int i10 = rect.top;
        int i11 = 0;
        jv jvVar = this.W;
        if (jvVar != null) {
            i7 = jvVar.f23593b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0() + i7 + i10;
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            i11 = jvVar2.f23593b.getHeight();
        }
        return j02 + i11 + rect.bottom;
    }

    @Override
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.f22451b;
        jv jvVar = this.X;
        if (jvVar != null) {
            i7 = jvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            jv jvVar2 = this.W;
            if (jvVar2 != null) {
                i7 = jvVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i7 = rect.left;
                i10 = rect.right;
            }
        }
        return i7 + i10;
    }

    @Override
    public final int K() {
        int i7 = 0;
        jv jvVar = this.W;
        if (jvVar != null) {
            i7 = Math.max(0, jvVar.r());
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            i7 = Math.max(i7, jvVar2.r());
        }
        Rect rect = this.f22451b;
        return rect.left + i7 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Z;
    }

    @Override
    public final void T() {
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.i(this.V);
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.i(this.V);
        }
    }

    @Override
    public final void V() {
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.f(this.V);
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.f(this.V);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.d(canvas, jvVar.S);
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            canvas.save();
            float i02 = i0();
            if (jvVar != null) {
                i7 = jvVar.f23593b.getHeight();
            } else {
                i7 = 0;
            }
            canvas.translate(i02, j0() + i7);
            jvVar2.d(canvas, jvVar2.S);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        Rect rect;
        int i10;
        jv jvVar = this.W;
        if (jvVar != null) {
            i7 = jvVar.f23593b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i11 = this.f22451b.top;
        float f10 = y10 - i11;
        if (jvVar != null && f10 >= 0.0f && f10 < i7) {
            motionEvent.offsetLocation(0.0f, -i11);
            boolean t6 = jvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t6;
        }
        jv jvVar2 = this.X;
        if (jvVar2 == null || f10 < i7 + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -i10);
        boolean t10 = jvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i11 + i7 + j02);
        return t10;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        int i12;
        this.S = i7;
        this.T = i10;
        this.U = i11;
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.f23594c = i7 - jvVar.f23596f;
            jvVar.d = i10;
            jvVar.f23595e = i11;
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.f23594c = (i0() + i7) - jvVar2.f23596f;
            if (jvVar != null) {
                i12 = jvVar.f23593b.getHeight();
            } else {
                i12 = 0;
            }
            jvVar2.d = j0() + i12 + i10;
            jvVar2.f23595e = i11;
        }
    }

    public final int i0() {
        jv jvVar = this.X;
        if (jvVar == null || !this.Y) {
            return 0;
        }
        int i7 = this.f22450a.C;
        Rect rect = this.f22451b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - jvVar.r());
    }

    public final int j0() {
        if (this.W != null && this.X != null) {
            return g0.L(4.0f);
        }
        return 0;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        fu.l(spannableStringBuilder, this.W, null);
        jv jvVar = this.X;
        if (jvVar != null && (staticLayout = jvVar.f23593b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
