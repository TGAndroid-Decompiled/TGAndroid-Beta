package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class wu extends au {
    public final ev X;
    public final ev Y;
    public final ev[] Z;
    public final boolean f27768a0;

    public wu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(fvVar, rect, i7);
        boolean z10;
        ev evVar;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27768a0 = z10;
        ev evVar2 = new ev(fvVar, spannableStringBuilder, this.f22934c, alignment);
        this.X = evVar2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            evVar = new ev(fvVar, spannableStringBuilder2, this.f22934c, alignment);
        } else {
            evVar = null;
        }
        this.Y = evVar;
        this.Z = evVar == null ? new ev[]{evVar2} : new ev[]{evVar2, evVar};
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f22933b;
        int i02 = i0() + this.X.f23734b.getHeight() + rect.top;
        ev evVar = this.Y;
        if (evVar != null) {
            i7 = evVar.f23734b.getHeight();
        } else {
            i7 = 0;
        }
        return i02 + i7 + rect.bottom;
    }

    @Override
    public final int J() {
        ev evVar = this.Y;
        if (evVar == null) {
            evVar = this.X;
        }
        Rect rect = this.f22933b;
        return evVar.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        int i7;
        Rect rect = this.f22933b;
        int i10 = rect.left;
        int r10 = this.X.r();
        ev evVar = this.Y;
        if (evVar != null) {
            i7 = evVar.r();
        } else {
            i7 = 0;
        }
        return Math.max(r10, i7) + i10 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Z;
    }

    @Override
    public final void T() {
        this.X.i(this.W);
        ev evVar = this.Y;
        if (evVar != null) {
            evVar.i(this.W);
        }
    }

    @Override
    public final void V() {
        this.X.f(this.W);
        ev evVar = this.Y;
        if (evVar != null) {
            evVar.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        canvas.save();
        ev evVar = this.X;
        canvas.translate(j0(evVar), 0.0f);
        evVar.d(canvas, evVar.T);
        canvas.restore();
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            canvas.save();
            canvas.translate(j0(evVar2), i0() + evVar.f23734b.getHeight());
            evVar2.d(canvas, evVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        ev evVar = this.X;
        int height = evVar.f23734b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 >= 0.0f && y10 < height) {
            i7 = j0(evVar);
        } else {
            evVar = this.Y;
            if (evVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(evVar);
            i10 = i0() + height;
            i7 = j02;
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = evVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        ev evVar = this.X;
        evVar.f23735c = (j0(evVar) + i7) - evVar.f23737f;
        evVar.d = i10;
        evVar.f23736e = i11;
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.f23735c = (j0(evVar2) + i7) - evVar2.f23737f;
            evVar2.d = i0() + evVar.f23734b.getHeight() + i10;
            evVar2.f23736e = i11;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f23734b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(ev evVar) {
        int L;
        int r10;
        boolean z10 = this.f27768a0;
        Rect rect = this.f22933b;
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

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, null, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        ev evVar = this.X;
        boolean o4 = evVar.o(characterStyle, rtVar);
        Rect rect = this.f22933b;
        if (o4) {
            rtVar.f26625e = (j0(evVar) + rect.left) - evVar.f23737f;
            rtVar.f26626f = i7 + rect.top;
            return true;
        }
        ev evVar2 = this.Y;
        if (evVar2 != null && evVar2.o(characterStyle, rtVar)) {
            rtVar.f26625e = (j0(evVar2) + rect.left) - evVar2.f23737f;
            rtVar.f26626f = i0() + evVar.f23734b.getHeight() + i7 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.f27768a0;
    }
}
