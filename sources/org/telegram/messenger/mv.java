package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
public abstract class mv extends qu {
    public final uv W;
    public final uv X;
    public final uv[] Y;
    public final boolean Z;

    public mv(vv vvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(vvVar, rect, i10);
        boolean z10;
        uv uvVar;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        uv uvVar2 = new uv(vvVar, spannableStringBuilder, this.f17623c, alignment);
        this.W = uvVar2;
        if (!TextUtils.isEmpty(spannableStringBuilder2)) {
            uvVar = new uv(vvVar, spannableStringBuilder2, this.f17623c, alignment);
        } else {
            uvVar = null;
        }
        this.X = uvVar;
        this.Y = uvVar == null ? new uv[]{uvVar2} : new uv[]{uvVar2, uvVar};
    }

    @Override
    public final int H() {
        int i10;
        Rect rect = this.f17622b;
        int h02 = h0() + this.W.f18396b.getHeight() + rect.top;
        uv uvVar = this.X;
        if (uvVar != null) {
            i10 = uvVar.f18396b.getHeight();
        } else {
            i10 = 0;
        }
        return h02 + i10 + rect.bottom;
    }

    @Override
    public final int I() {
        uv uvVar = this.X;
        if (uvVar == null) {
            uvVar = this.W;
        }
        Rect rect = this.f17622b;
        return uvVar.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        int i10;
        Rect rect = this.f17622b;
        int i11 = rect.left;
        int r10 = this.W.r();
        uv uvVar = this.X;
        if (uvVar != null) {
            i10 = uvVar.r();
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
        uv uvVar = this.X;
        if (uvVar != null) {
            uvVar.i(this.V);
        }
    }

    @Override
    public final void U() {
        this.W.f(this.V);
        uv uvVar = this.X;
        if (uvVar != null) {
            uvVar.f(this.V);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        canvas.save();
        uv uvVar = this.W;
        canvas.translate(i0(uvVar), 0.0f);
        uvVar.d(canvas, uvVar.S);
        canvas.restore();
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            canvas.save();
            canvas.translate(i0(uvVar2), h0() + uvVar.f18396b.getHeight());
            uvVar2.d(canvas, uvVar2.S);
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int i10;
        uv uvVar = this.W;
        int height = uvVar.f18396b.getHeight();
        float y3 = motionEvent.getY();
        int i11 = 0;
        if (y3 >= 0.0f && y3 < height) {
            i10 = i0(uvVar);
        } else {
            uvVar = this.X;
            if (uvVar == null || y3 < h0() + height) {
                return false;
            }
            int i02 = i0(uvVar);
            i11 = h0() + height;
            i10 = i02;
        }
        motionEvent.offsetLocation(-i10, -i11);
        boolean t10 = uvVar.t(motionEvent);
        motionEvent.offsetLocation(i10, i11);
        return t10;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        uv uvVar = this.W;
        uvVar.f18397c = (i0(uvVar) + i10) - uvVar.f18398f;
        uvVar.d = i11;
        uvVar.e = i12;
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.f18397c = (i0(uvVar2) + i10) - uvVar2.f18398f;
            uvVar2.d = h0() + uvVar.f18396b.getHeight() + i11;
            uvVar2.e = i12;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f18396b;
    }

    public final int h0() {
        if (this.X != null) {
            return i0.L(2.0f);
        }
        return 0;
    }

    public final int i0(uv uvVar) {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.f17622b;
        vv vvVar = this.f17621a;
        if (z10) {
            L = (((vvVar.C + vvVar.T) - vvVar.S) - uvVar.r()) / 2;
            r10 = rect.left;
        } else if (!vvVar.I()) {
            return 0;
        } else {
            L = (((vvVar.C + vvVar.T) - i0.L(14.0f)) - rect.right) - rect.left;
            r10 = uvVar.r();
        }
        return L - r10;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        qu.l(spannableStringBuilder, null, this.Y);
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        uv uvVar = this.W;
        boolean o10 = uvVar.o(characterStyle, huVar);
        Rect rect = this.f17622b;
        if (o10) {
            huVar.e = (i0(uvVar) + rect.left) - uvVar.f18398f;
            huVar.f15956f = i10 + rect.top;
            return true;
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null && uvVar2.o(characterStyle, huVar)) {
            huVar.e = (i0(uvVar2) + rect.left) - uvVar2.f18398f;
            huVar.f15956f = h0() + uvVar.f18396b.getHeight() + i10 + rect.top;
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return this.Z;
    }
}
