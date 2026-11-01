package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class nv extends ru {
    public final vv W;
    public final vv X;
    public final vv[] Y;
    public final boolean Z;

    public nv(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(wvVar, rect, i10);
        boolean z10;
        vv vvVar;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        vv vvVar2 = new vv(wvVar, spannableStringBuilder, this.f17969c, alignment);
        this.W = vvVar2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            vvVar = new vv(wvVar, spannableStringBuilder2, this.f17969c, alignment);
        } else {
            vvVar = null;
        }
        this.X = vvVar;
        this.Y = vvVar == null ? new vv[]{vvVar2} : new vv[]{vvVar2, vvVar};
    }

    @Override
    public final int H() {
        int i10;
        Rect rect = this.f17968b;
        int h02 = h0() + this.W.f18904b.getHeight() + rect.top;
        vv vvVar = this.X;
        if (vvVar != null) {
            i10 = vvVar.f18904b.getHeight();
        } else {
            i10 = 0;
        }
        return h02 + i10 + rect.bottom;
    }

    @Override
    public final int I() {
        vv vvVar = this.X;
        if (vvVar == null) {
            vvVar = this.W;
        }
        Rect rect = this.f17968b;
        return vvVar.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        int i10;
        Rect rect = this.f17968b;
        int i11 = rect.left;
        int r10 = this.W.r();
        vv vvVar = this.X;
        if (vvVar != null) {
            i10 = vvVar.r();
        } else {
            i10 = 0;
        }
        return Math.max(r10, i10) + i11 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Y;
    }

    @Override
    public final void S() {
        this.W.i(this.V);
        vv vvVar = this.X;
        if (vvVar != null) {
            vvVar.i(this.V);
        }
    }

    @Override
    public final void U() {
        this.W.f(this.V);
        vv vvVar = this.X;
        if (vvVar != null) {
            vvVar.f(this.V);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        canvas.save();
        vv vvVar = this.W;
        canvas.translate(i0(vvVar), 0.0f);
        vvVar.d(canvas, vvVar.S);
        canvas.restore();
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            canvas.save();
            canvas.translate(i0(vvVar2), h0() + vvVar.f18904b.getHeight());
            vvVar2.d(canvas, vvVar2.S);
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int i10;
        vv vvVar = this.W;
        int height = vvVar.f18904b.getHeight();
        float y3 = motionEvent.getY();
        int i11 = 0;
        if (y3 >= 0.0f && y3 < height) {
            i10 = i0(vvVar);
        } else {
            vvVar = this.X;
            if (vvVar == null || y3 < h0() + height) {
                return false;
            }
            int i02 = i0(vvVar);
            i11 = h0() + height;
            i10 = i02;
        }
        motionEvent.offsetLocation(-i10, -i11);
        boolean t10 = vvVar.t(motionEvent);
        motionEvent.offsetLocation(i10, i11);
        return t10;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        vv vvVar = this.W;
        vvVar.f18905c = (i0(vvVar) + i10) - vvVar.f18906f;
        vvVar.d = i11;
        vvVar.e = i12;
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.f18905c = (i0(vvVar2) + i10) - vvVar2.f18906f;
            vvVar2.d = h0() + vvVar.f18904b.getHeight() + i11;
            vvVar2.e = i12;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f18904b;
    }

    public final int h0() {
        if (this.X != null) {
            return i0.L(2.0f);
        }
        return 0;
    }

    public final int i0(vv vvVar) {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.f17968b;
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

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, null, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        vv vvVar = this.W;
        boolean o10 = vvVar.o(characterStyle, iuVar);
        Rect rect = this.f17968b;
        if (o10) {
            iuVar.e = (i0(vvVar) + rect.left) - vvVar.f18906f;
            iuVar.f16348f = i10 + rect.top;
            return true;
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null && vvVar2.o(characterStyle, iuVar)) {
            iuVar.e = (i0(vvVar2) + rect.left) - vvVar2.f18906f;
            iuVar.f16348f = h0() + vvVar.f18904b.getHeight() + i10 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Z;
    }
}
