package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class vu extends zt {
    public final dv X;
    public final dv Y;
    public final dv[] Z;
    public final boolean f27628a0;

    public vu(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(evVar, rect, i7);
        boolean z10;
        dv dvVar;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27628a0 = z10;
        dv dvVar2 = new dv(evVar, spannableStringBuilder, this.f28379c, alignment);
        this.X = dvVar2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            dvVar = new dv(evVar, spannableStringBuilder2, this.f28379c, alignment);
        } else {
            dvVar = null;
        }
        this.Y = dvVar;
        this.Z = dvVar == null ? new dv[]{dvVar2} : new dv[]{dvVar2, dvVar};
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f28378b;
        int i02 = i0() + this.X.f23605b.getHeight() + rect.top;
        dv dvVar = this.Y;
        if (dvVar != null) {
            i7 = dvVar.f23605b.getHeight();
        } else {
            i7 = 0;
        }
        return i02 + i7 + rect.bottom;
    }

    @Override
    public final int J() {
        dv dvVar = this.Y;
        if (dvVar == null) {
            dvVar = this.X;
        }
        Rect rect = this.f28378b;
        return dvVar.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        int i7;
        Rect rect = this.f28378b;
        int i10 = rect.left;
        int r10 = this.X.r();
        dv dvVar = this.Y;
        if (dvVar != null) {
            i7 = dvVar.r();
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
        dv dvVar = this.Y;
        if (dvVar != null) {
            dvVar.i(this.W);
        }
    }

    @Override
    public final void V() {
        this.X.f(this.W);
        dv dvVar = this.Y;
        if (dvVar != null) {
            dvVar.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        canvas.save();
        dv dvVar = this.X;
        canvas.translate(j0(dvVar), 0.0f);
        dvVar.d(canvas, dvVar.T);
        canvas.restore();
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            canvas.save();
            canvas.translate(j0(dvVar2), i0() + dvVar.f23605b.getHeight());
            dvVar2.d(canvas, dvVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        dv dvVar = this.X;
        int height = dvVar.f23605b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 >= 0.0f && y10 < height) {
            i7 = j0(dvVar);
        } else {
            dvVar = this.Y;
            if (dvVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(dvVar);
            i10 = i0() + height;
            i7 = j02;
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = dvVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        dv dvVar = this.X;
        dvVar.f23606c = (j0(dvVar) + i7) - dvVar.f23608f;
        dvVar.d = i10;
        dvVar.f23607e = i11;
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.f23606c = (j0(dvVar2) + i7) - dvVar2.f23608f;
            dvVar2.d = i0() + dvVar.f23605b.getHeight() + i10;
            dvVar2.f23607e = i11;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f23605b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(dv dvVar) {
        int L;
        int r10;
        boolean z10 = this.f27628a0;
        Rect rect = this.f28378b;
        ev evVar = this.f28377a;
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

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, null, this.Z);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        dv dvVar = this.X;
        boolean o4 = dvVar.o(characterStyle, qtVar);
        Rect rect = this.f28378b;
        if (o4) {
            qtVar.f26478e = (j0(dvVar) + rect.left) - dvVar.f23608f;
            qtVar.f26479f = i7 + rect.top;
            return true;
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null && dvVar2.o(characterStyle, qtVar)) {
            qtVar.f26478e = (j0(dvVar2) + rect.left) - dvVar2.f23608f;
            qtVar.f26479f = i0() + dvVar.f23605b.getHeight() + i7 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.f27628a0;
    }
}
