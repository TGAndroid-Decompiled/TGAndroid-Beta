package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class bu extends xt {
    public final bv X;
    public final bv Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.s9[] f21886a0;

    public bu(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(cvVar, rect, i3);
        bv bvVar;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            bvVar = new bv(cvVar, spannableStringBuilder, this.f26436c);
        } else {
            bvVar = null;
        }
        this.X = bvVar;
        bv bvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new bv(cvVar, spannableStringBuilder2, this.f26436c);
        this.Y = bvVar2;
        this.Z = cvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (bvVar != null) {
            arrayList.add(bvVar);
        }
        if (bvVar2 != null) {
            arrayList.add(bvVar2);
        }
        this.f21886a0 = (org.telegram.ui.Cells.s9[]) arrayList.toArray(new org.telegram.ui.Cells.s9[0]);
    }

    @Override
    public final int I() {
        int i3;
        Rect rect = this.f26435b;
        int i10 = rect.top;
        int i11 = 0;
        bv bvVar = this.X;
        if (bvVar != null) {
            i3 = bvVar.f21888b.getHeight();
        } else {
            i3 = 0;
        }
        int j02 = j0() + i3 + i10;
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            i11 = bvVar2.f21888b.getHeight();
        }
        return j02 + i11 + rect.bottom;
    }

    @Override
    public final int J() {
        int i3;
        int i10;
        Rect rect = this.f26435b;
        bv bvVar = this.Y;
        if (bvVar != null) {
            i3 = bvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            bv bvVar2 = this.X;
            if (bvVar2 != null) {
                i3 = bvVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i3 = rect.left;
                i10 = rect.right;
            }
        }
        return i3 + i10;
    }

    @Override
    public final int K() {
        int i3 = 0;
        bv bvVar = this.X;
        if (bvVar != null) {
            i3 = Math.max(0, bvVar.r());
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            i3 = Math.max(i3, bvVar2.r());
        }
        Rect rect = this.f26435b;
        return rect.left + i3 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.f21886a0;
    }

    @Override
    public final void T() {
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.i(this.W);
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.i(this.W);
        }
    }

    @Override
    public final void V() {
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.f(this.W);
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i3;
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.d(canvas, bvVar.T);
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            canvas.save();
            float i02 = i0();
            if (bvVar != null) {
                i3 = bvVar.f21888b.getHeight();
            } else {
                i3 = 0;
            }
            canvas.translate(i02, j0() + i3);
            bvVar2.d(canvas, bvVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i3;
        Rect rect;
        int i10;
        bv bvVar = this.X;
        if (bvVar != null) {
            i3 = bvVar.f21888b.getHeight();
        } else {
            i3 = 0;
        }
        int j02 = j0();
        float y9 = motionEvent.getY();
        int i11 = this.f26435b.top;
        float f10 = y9 - i11;
        if (bvVar != null && f10 >= 0.0f && f10 < i3) {
            motionEvent.offsetLocation(0.0f, -i11);
            boolean t10 = bvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t10;
        }
        bv bvVar2 = this.Y;
        if (bvVar2 == null || f10 < i3 + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -i10);
        boolean t11 = bvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i11 + i3 + j02);
        return t11;
    }

    @Override
    public final void Z(int i3, int i10, int i11) {
        int i12;
        this.T = i3;
        this.U = i10;
        this.V = i11;
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.f21889c = i3 - bvVar.f21891f;
            bvVar.d = i10;
            bvVar.f21890e = i11;
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.f21889c = (i0() + i3) - bvVar2.f21891f;
            if (bvVar != null) {
                i12 = bvVar.f21888b.getHeight();
            } else {
                i12 = 0;
            }
            bvVar2.d = j0() + i12 + i10;
            bvVar2.f21890e = i11;
        }
    }

    public final int i0() {
        bv bvVar = this.Y;
        if (bvVar == null || !this.Z) {
            return 0;
        }
        int i3 = this.f26434a.C;
        Rect rect = this.f26435b;
        return Math.max(0, ((i3 - rect.left) - rect.right) - bvVar.r());
    }

    public final int j0() {
        if (this.X != null && this.Y != null) {
            return g0.L(4.0f);
        }
        return 0;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        xt.l(spannableStringBuilder, this.X, null);
        bv bvVar = this.Y;
        if (bvVar != null && (staticLayout = bvVar.f21888b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
