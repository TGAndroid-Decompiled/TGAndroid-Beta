package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public class tu extends zt {
    public final dv X;
    public final dv[] Y;
    public final boolean Z;
    public int f27069a0;
    public int f27070b0;
    public int f27071c0;

    public tu(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f27071c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        dv dvVar = new dv(evVar, spannableStringBuilder, this.f28351c, alignment);
        this.X = dvVar;
        this.Y = r3;
        dv[] dvVarArr = {dvVar};
    }

    @Override
    public final int H() {
        return this.f27069a0;
    }

    @Override
    public int I() {
        Rect rect = this.f28350b;
        return this.X.f23577b.getHeight() + rect.top + this.f27069a0 + this.f27070b0 + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f28350b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f28350b;
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
        canvas.translate(0.0f, this.f27069a0);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.f23578c = (this.f28350b.left + i02) - dvVar.f23580f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            dvVar.d(canvas, dvVar.T);
            canvas.restore();
        } else {
            dvVar.d(canvas, dvVar.T);
        }
        canvas.restore();
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.f27069a0);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.f23578c = (this.f28350b.left + i02) - dvVar.f23580f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            dvVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            dvVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.f27069a0);
        boolean t6 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.f27069a0);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.f27069a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            dv dvVar = this.X;
            dvVar.f23578c = i12 - dvVar.f23580f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f23577b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.f28350b;
        dv dvVar = this.X;
        ev evVar = this.f28349a;
        if (z10) {
            L = (((evVar.C + evVar.T) - evVar.S) - dvVar.r()) / 2;
            r10 = rect.left;
        } else if (!evVar.I()) {
            return 0;
        } else {
            L = (((evVar.C + evVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = dvVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.f27069a0 = i7;
        this.f27070b0 = i10;
        g0();
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        dv dvVar = this.X;
        if (dvVar.o(characterStyle, qtVar)) {
            Rect rect = this.f28350b;
            qtVar.f26450e = (i0() + rect.left) - dvVar.f23580f;
            qtVar.f26451f = i7 + rect.top + this.f27069a0;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Z;
    }
}
