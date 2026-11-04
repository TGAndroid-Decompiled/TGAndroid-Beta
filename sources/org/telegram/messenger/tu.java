package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class tu extends xt {
    public final bv X;
    public final bv Y;
    public final bv[] Z;
    public final boolean f25596a0;

    public tu(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(cvVar, rect, i3);
        boolean z10;
        bv bvVar;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25596a0 = z10;
        bv bvVar2 = new bv(cvVar, spannableStringBuilder, this.f26436c, alignment);
        this.X = bvVar2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            bvVar = new bv(cvVar, spannableStringBuilder2, this.f26436c, alignment);
        } else {
            bvVar = null;
        }
        this.Y = bvVar;
        this.Z = bvVar == null ? new bv[]{bvVar2} : new bv[]{bvVar2, bvVar};
    }

    @Override
    public final int I() {
        int i3;
        Rect rect = this.f26435b;
        int i02 = i0() + this.X.f21888b.getHeight() + rect.top;
        bv bvVar = this.Y;
        if (bvVar != null) {
            i3 = bvVar.f21888b.getHeight();
        } else {
            i3 = 0;
        }
        return i02 + i3 + rect.bottom;
    }

    @Override
    public final int J() {
        bv bvVar = this.Y;
        if (bvVar == null) {
            bvVar = this.X;
        }
        Rect rect = this.f26435b;
        return bvVar.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        int i3;
        Rect rect = this.f26435b;
        int i10 = rect.left;
        int r5 = this.X.r();
        bv bvVar = this.Y;
        if (bvVar != null) {
            i3 = bvVar.r();
        } else {
            i3 = 0;
        }
        return Math.max(r5, i3) + i10 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Z;
    }

    @Override
    public final void T() {
        this.X.i(this.W);
        bv bvVar = this.Y;
        if (bvVar != null) {
            bvVar.i(this.W);
        }
    }

    @Override
    public final void V() {
        this.X.f(this.W);
        bv bvVar = this.Y;
        if (bvVar != null) {
            bvVar.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        canvas.save();
        bv bvVar = this.X;
        canvas.translate(j0(bvVar), 0.0f);
        bvVar.d(canvas, bvVar.T);
        canvas.restore();
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            canvas.save();
            canvas.translate(j0(bvVar2), i0() + bvVar.f21888b.getHeight());
            bvVar2.d(canvas, bvVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i3;
        bv bvVar = this.X;
        int height = bvVar.f21888b.getHeight();
        float y9 = motionEvent.getY();
        int i10 = 0;
        if (y9 >= 0.0f && y9 < height) {
            i3 = j0(bvVar);
        } else {
            bvVar = this.Y;
            if (bvVar == null || y9 < i0() + height) {
                return false;
            }
            int j02 = j0(bvVar);
            i10 = i0() + height;
            i3 = j02;
        }
        motionEvent.offsetLocation(-i3, -i10);
        boolean t10 = bvVar.t(motionEvent);
        motionEvent.offsetLocation(i3, i10);
        return t10;
    }

    @Override
    public final void Z(int i3, int i10, int i11) {
        bv bvVar = this.X;
        bvVar.f21889c = (j0(bvVar) + i3) - bvVar.f21891f;
        bvVar.d = i10;
        bvVar.f21890e = i11;
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.f21889c = (j0(bvVar2) + i3) - bvVar2.f21891f;
            bvVar2.d = i0() + bvVar.f21888b.getHeight() + i10;
            bvVar2.f21890e = i11;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f21888b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(bv bvVar) {
        int L;
        int r5;
        boolean z10 = this.f25596a0;
        Rect rect = this.f26435b;
        cv cvVar = this.f26434a;
        if (z10) {
            L = (((cvVar.C + cvVar.T) - cvVar.S) - bvVar.r()) / 2;
            r5 = rect.left;
        } else if (!cvVar.I()) {
            return 0;
        } else {
            L = (((cvVar.C + cvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r5 = bvVar.r();
        }
        return L - r5;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, null, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        bv bvVar = this.X;
        boolean o10 = bvVar.o(characterStyle, otVar);
        Rect rect = this.f26435b;
        if (o10) {
            otVar.f24597e = (j0(bvVar) + rect.left) - bvVar.f21891f;
            otVar.f24598f = i3 + rect.top;
            return true;
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null && bvVar2.o(characterStyle, otVar)) {
            otVar.f24597e = (j0(bvVar2) + rect.left) - bvVar2.f21891f;
            otVar.f24598f = i0() + bvVar.f21888b.getHeight() + i3 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.f25596a0;
    }
}
