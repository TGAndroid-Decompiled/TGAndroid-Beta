package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public class xu extends cu {
    public final hv X;
    public final hv[] Y;
    public final boolean Z;
    public int f27603a0;
    public int f27604b0;
    public int f27605c0;

    public xu(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f27605c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        hv hvVar = new hv(ivVar, spannableStringBuilder, this.f22935c, alignment);
        this.X = hvVar;
        this.Y = r3;
        hv[] hvVarArr = {hvVar};
    }

    @Override
    public final int H() {
        return this.f27603a0;
    }

    @Override
    public int I() {
        Rect rect = this.f22934b;
        return this.X.f24222b.getHeight() + rect.top + this.f27603a0 + this.f27604b0 + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f22934b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f22934b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Y;
    }

    @Override
    public final void T() {
        this.X.i(this.W);
    }

    @Override
    public final void V() {
        this.X.f(this.W);
    }

    @Override
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.f27603a0);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.f24223c = (this.f22934b.left + i02) - hvVar.f24225f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            hvVar.d(canvas, hvVar.T);
            canvas.restore();
        } else {
            hvVar.d(canvas, hvVar.T);
        }
        canvas.restore();
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.f27603a0);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.f24223c = (this.f22934b.left + i02) - hvVar.f24225f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            hvVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            hvVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.f27603a0);
        boolean t6 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.f27603a0);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.f27603a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            hv hvVar = this.X;
            hvVar.f24223c = i12 - hvVar.f24225f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f24222b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.f22934b;
        hv hvVar = this.X;
        iv ivVar = this.f22933a;
        if (z10) {
            L = (((ivVar.C + ivVar.T) - ivVar.S) - hvVar.r()) / 2;
            r10 = rect.left;
        } else if (!ivVar.I()) {
            return 0;
        } else {
            L = (((ivVar.C + ivVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = hvVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.f27603a0 = i7;
        this.f27604b0 = i10;
        g0();
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        hv hvVar = this.X;
        if (hvVar.o(characterStyle, ttVar)) {
            Rect rect = this.f22934b;
            ttVar.f26731e = (i0() + rect.left) - hvVar.f24225f;
            ttVar.f26732f = i7 + rect.top + this.f27603a0;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Z;
    }
}
