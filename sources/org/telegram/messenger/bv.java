package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class bv extends fu {
    public final jv W;
    public final jv X;
    public final jv[] Y;
    public final boolean Z;

    public bv(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(kvVar, rect, i7);
        boolean z9;
        jv jvVar;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.Z = z9;
        jv jvVar2 = new jv(kvVar, spannableStringBuilder, this.f22445c, alignment);
        this.W = jvVar2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            jvVar = new jv(kvVar, spannableStringBuilder2, this.f22445c, alignment);
        } else {
            jvVar = null;
        }
        this.X = jvVar;
        this.Y = jvVar == null ? new jv[]{jvVar2} : new jv[]{jvVar2, jvVar};
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f22444b;
        int i02 = i0() + this.W.f23586b.getHeight() + rect.top;
        jv jvVar = this.X;
        if (jvVar != null) {
            i7 = jvVar.f23586b.getHeight();
        } else {
            i7 = 0;
        }
        return i02 + i7 + rect.bottom;
    }

    @Override
    public final int J() {
        jv jvVar = this.X;
        if (jvVar == null) {
            jvVar = this.W;
        }
        Rect rect = this.f22444b;
        return jvVar.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        int i7;
        Rect rect = this.f22444b;
        int i10 = rect.left;
        int r10 = this.W.r();
        jv jvVar = this.X;
        if (jvVar != null) {
            i7 = jvVar.r();
        } else {
            i7 = 0;
        }
        return Math.max(r10, i7) + i10 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Y;
    }

    @Override
    public final void T() {
        this.W.i(this.V);
        jv jvVar = this.X;
        if (jvVar != null) {
            jvVar.i(this.V);
        }
    }

    @Override
    public final void V() {
        this.W.f(this.V);
        jv jvVar = this.X;
        if (jvVar != null) {
            jvVar.f(this.V);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        canvas.save();
        jv jvVar = this.W;
        canvas.translate(j0(jvVar), 0.0f);
        jvVar.d(canvas, jvVar.S);
        canvas.restore();
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            canvas.save();
            canvas.translate(j0(jvVar2), i0() + jvVar.f23586b.getHeight());
            jvVar2.d(canvas, jvVar2.S);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        jv jvVar = this.W;
        int height = jvVar.f23586b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 >= 0.0f && y10 < height) {
            i7 = j0(jvVar);
        } else {
            jvVar = this.X;
            if (jvVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(jvVar);
            i10 = i0() + height;
            i7 = j02;
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = jvVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        jv jvVar = this.W;
        jvVar.f23587c = (j0(jvVar) + i7) - jvVar.f23589f;
        jvVar.d = i10;
        jvVar.f23588e = i11;
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.f23587c = (j0(jvVar2) + i7) - jvVar2.f23589f;
            jvVar2.d = i0() + jvVar.f23586b.getHeight() + i10;
            jvVar2.f23588e = i11;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f23586b;
    }

    public final int i0() {
        if (this.X != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(jv jvVar) {
        int L;
        int r10;
        boolean z9 = this.Z;
        Rect rect = this.f22444b;
        kv kvVar = this.f22443a;
        if (z9) {
            L = (((kvVar.C + kvVar.T) - kvVar.S) - jvVar.r()) / 2;
            r10 = rect.left;
        } else if (!kvVar.I()) {
            return 0;
        } else {
            L = (((kvVar.C + kvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = jvVar.r();
        }
        return L - r10;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, null, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        jv jvVar = this.W;
        boolean o4 = jvVar.o(characterStyle, wtVar);
        Rect rect = this.f22444b;
        if (o4) {
            wtVar.f26360e = (j0(jvVar) + rect.left) - jvVar.f23589f;
            wtVar.f26361f = i7 + rect.top;
            return true;
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null && jvVar2.o(characterStyle, wtVar)) {
            wtVar.f26360e = (j0(jvVar2) + rect.left) - jvVar2.f23589f;
            wtVar.f26361f = i0() + jvVar.f23586b.getHeight() + i7 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Z;
    }
}
