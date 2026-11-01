package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public class lv extends ru {
    public final vv W;
    public final vv[] X;
    public final boolean Y;
    public int Z;
    public int f17002a0;
    public int f17003b0;

    public lv(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder) {
        super(wvVar, rect, i10);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f17003b0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Y = false;
        vv vvVar = new vv(wvVar, spannableStringBuilder, this.f17969c, alignment);
        this.W = vvVar;
        this.X = r3;
        vv[] vvVarArr = {vvVar};
    }

    @Override
    public final int G() {
        return this.Z;
    }

    @Override
    public int H() {
        Rect rect = this.f17968b;
        return this.W.f18904b.getHeight() + rect.top + this.Z + this.f17002a0 + rect.bottom;
    }

    @Override
    public final int I() {
        Rect rect = this.f17968b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override
    public final void S() {
        this.W.i(this.V);
    }

    @Override
    public final void U() {
        this.W.f(this.V);
    }

    @Override
    public void V(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.f18905c = (this.f17968b.left + h02) - vvVar.f18906f;
            canvas.save();
            canvas.translate(h02, 0.0f);
            vvVar.d(canvas, vvVar.S);
            canvas.restore();
        } else {
            vvVar.d(canvas, vvVar.S);
        }
        canvas.restore();
    }

    @Override
    public final void W(Canvas canvas, int i10, float f7) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.f18905c = (this.f17968b.left + h02) - vvVar.f18906f;
            canvas.save();
            canvas.translate(h02, 0.0f);
            vvVar.m(canvas, i10, f7);
            canvas.restore();
        } else {
            vvVar.m(canvas, i10, f7);
        }
        canvas.restore();
    }

    @Override
    public boolean X(MotionEvent motionEvent) {
        int h02 = h0();
        motionEvent.offsetLocation(-h02, -this.Z);
        boolean t10 = this.W.t(motionEvent);
        motionEvent.offsetLocation(h02, this.Z);
        return t10;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        super.Y(i10, i11 + this.Z, i12);
        int h02 = h0();
        if (h02 != 0) {
            int i13 = i10 + h02;
            vv vvVar = this.W;
            vvVar.f18905c = i13 - vvVar.f18906f;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f18904b;
    }

    public final int h0() {
        int L;
        int r10;
        boolean z10 = this.Y;
        Rect rect = this.f17968b;
        vv vvVar = this.W;
        wv wvVar = this.f17967a;
        if (z10) {
            L = (((wvVar.C + wvVar.T) - wvVar.S) - vvVar.r()) / 2;
            r10 = rect.left;
        } else if (!wvVar.I()) {
            return 0;
        } else {
            L = (((wvVar.C + wvVar.T) - i0.L(14.0f)) - rect.right) - rect.left;
            r10 = vvVar.r();
        }
        return L - r10;
    }

    public final void i0(int i10, int i11) {
        this.Z = i10;
        this.f17002a0 = i11;
        f0();
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, this.W, this.X);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        vv vvVar = this.W;
        if (vvVar.o(characterStyle, iuVar)) {
            Rect rect = this.f17968b;
            iuVar.e = (h0() + rect.left) - vvVar.f18906f;
            iuVar.f16348f = i10 + rect.top + this.Z;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Y;
    }
}
