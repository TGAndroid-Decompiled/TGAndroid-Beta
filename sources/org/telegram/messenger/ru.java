package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public class ru extends xt {
    public final bv X;
    public final bv[] Y;
    public final boolean Z;
    public int f25232a0;
    public int f25233b0;
    public int f25234c0;

    public ru(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25234c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        bv bvVar = new bv(cvVar, spannableStringBuilder, this.f26436c, alignment);
        this.X = bvVar;
        this.Y = r3;
        bv[] bvVarArr = {bvVar};
    }

    @Override
    public final int H() {
        return this.f25232a0;
    }

    @Override
    public int I() {
        Rect rect = this.f26435b;
        return this.X.f21888b.getHeight() + rect.top + this.f25232a0 + this.f25233b0 + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f26435b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
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
        canvas.translate(0.0f, this.f25232a0);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.f21889c = (this.f26435b.left + i02) - bvVar.f21891f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            bvVar.d(canvas, bvVar.T);
            canvas.restore();
        } else {
            bvVar.d(canvas, bvVar.T);
        }
        canvas.restore();
    }

    @Override
    public final void X(Canvas canvas, int i3, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.f25232a0);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.f21889c = (this.f26435b.left + i02) - bvVar.f21891f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            bvVar.m(canvas, i3, f10);
            canvas.restore();
        } else {
            bvVar.m(canvas, i3, f10);
        }
        canvas.restore();
    }

    @Override
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.f25232a0);
        boolean t10 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.f25232a0);
        return t10;
    }

    @Override
    public final void Z(int i3, int i10, int i11) {
        super.Z(i3, i10 + this.f25232a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i3 + i02;
            bv bvVar = this.X;
            bvVar.f21889c = i12 - bvVar.f21891f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f21888b;
    }

    public final int i0() {
        int L;
        int r5;
        boolean z10 = this.Z;
        Rect rect = this.f26435b;
        bv bvVar = this.X;
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

    public final void j0(int i3, int i10) {
        this.f25232a0 = i3;
        this.f25233b0 = i10;
        g0();
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        bv bvVar = this.X;
        if (bvVar.o(characterStyle, otVar)) {
            Rect rect = this.f26435b;
            otVar.f24597e = (i0() + rect.left) - bvVar.f21891f;
            otVar.f24598f = i3 + rect.top + this.f25232a0;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Z;
    }
}
