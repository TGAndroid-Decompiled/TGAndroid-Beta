package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public class uu extends au {
    public final ev X;
    public final ev[] Y;
    public final boolean Z;
    public int f27231a0;
    public int f27232b0;
    public int f27233c0;

    public uu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(fvVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f27233c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        ev evVar = new ev(fvVar, spannableStringBuilder, this.f22934c, alignment);
        this.X = evVar;
        this.Y = r3;
        ev[] evVarArr = {evVar};
    }

    @Override
    public final int H() {
        return this.f27231a0;
    }

    @Override
    public int I() {
        Rect rect = this.f22933b;
        return this.X.f23734b.getHeight() + rect.top + this.f27231a0 + this.f27232b0 + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f22933b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f22933b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
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
        canvas.translate(0.0f, this.f27231a0);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.f23735c = (this.f22933b.left + i02) - evVar.f23737f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            evVar.d(canvas, evVar.T);
            canvas.restore();
        } else {
            evVar.d(canvas, evVar.T);
        }
        canvas.restore();
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.f27231a0);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.f23735c = (this.f22933b.left + i02) - evVar.f23737f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            evVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            evVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.f27231a0);
        boolean t6 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.f27231a0);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.f27231a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            ev evVar = this.X;
            evVar.f23735c = i12 - evVar.f23737f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f23734b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.f22933b;
        ev evVar = this.X;
        fv fvVar = this.f22932a;
        if (z10) {
            L = (((fvVar.C + fvVar.T) - fvVar.S) - evVar.r()) / 2;
            r10 = rect.left;
        } else if (!fvVar.I()) {
            return 0;
        } else {
            L = (((fvVar.C + fvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = evVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.f27231a0 = i7;
        this.f27232b0 = i10;
        g0();
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        ev evVar = this.X;
        if (evVar.o(characterStyle, rtVar)) {
            Rect rect = this.f22933b;
            rtVar.f26625e = (i0() + rect.left) - evVar.f23737f;
            rtVar.f26626f = i7 + rect.top + this.f27231a0;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Z;
    }
}
