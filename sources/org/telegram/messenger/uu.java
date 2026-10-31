package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class uu extends qu {
    public final uv W;
    public final uv X;
    public final boolean Y;
    public final org.telegram.ui.Cells.u9[] Z;

    public uu(vv vvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(vvVar, rect, i10);
        uv uvVar;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            uvVar = new uv(vvVar, spannableStringBuilder, this.f17623c);
        } else {
            uvVar = null;
        }
        this.W = uvVar;
        uv uvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new uv(vvVar, spannableStringBuilder2, this.f17623c);
        this.X = uvVar2;
        this.Y = vvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (uvVar != null) {
            arrayList.add(uvVar);
        }
        if (uvVar2 != null) {
            arrayList.add(uvVar2);
        }
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int H() {
        int i10;
        Rect rect = this.f17622b;
        int i11 = rect.top;
        int i12 = 0;
        uv uvVar = this.W;
        if (uvVar != null) {
            i10 = uvVar.f18396b.getHeight();
        } else {
            i10 = 0;
        }
        int i02 = i0() + i10 + i11;
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            i12 = uvVar2.f18396b.getHeight();
        }
        return i02 + i12 + rect.bottom;
    }

    @Override
    public final int I() {
        int i10;
        int i11;
        Rect rect = this.f17622b;
        uv uvVar = this.X;
        if (uvVar != null) {
            i10 = uvVar.q() + rect.left;
            i11 = rect.right;
        } else {
            uv uvVar2 = this.W;
            if (uvVar2 != null) {
                i10 = uvVar2.q() + rect.left;
                i11 = rect.right;
            } else {
                i10 = rect.left;
                i11 = rect.right;
            }
        }
        return i10 + i11;
    }

    @Override
    public final int J() {
        int i10 = 0;
        uv uvVar = this.W;
        if (uvVar != null) {
            i10 = Math.max(0, uvVar.r());
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            i10 = Math.max(i10, uvVar2.r());
        }
        Rect rect = this.f17622b;
        return rect.left + i10 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override
    public final void S() {
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.i(this.V);
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.i(this.V);
        }
    }

    @Override
    public final void U() {
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.f(this.V);
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.f(this.V);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.d(canvas, uvVar.S);
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            canvas.save();
            float h02 = h0();
            if (uvVar != null) {
                i10 = uvVar.f18396b.getHeight();
            } else {
                i10 = 0;
            }
            canvas.translate(h02, i0() + i10);
            uvVar2.d(canvas, uvVar2.S);
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int i10;
        Rect rect;
        int i11;
        uv uvVar = this.W;
        if (uvVar != null) {
            i10 = uvVar.f18396b.getHeight();
        } else {
            i10 = 0;
        }
        int i02 = i0();
        float y3 = motionEvent.getY();
        int i12 = this.f17622b.top;
        float f7 = y3 - i12;
        if (uvVar != null && f7 >= 0.0f && f7 < i10) {
            motionEvent.offsetLocation(0.0f, -i12);
            boolean t10 = uvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t10;
        }
        uv uvVar2 = this.X;
        if (uvVar2 == null || f7 < i10 + i02) {
            return false;
        }
        int h02 = h0();
        motionEvent.offsetLocation(-h02, -i11);
        boolean t11 = uvVar2.t(motionEvent);
        motionEvent.offsetLocation(h02, i12 + i10 + i02);
        return t11;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        int i13;
        this.S = i10;
        this.T = i11;
        this.U = i12;
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.f18397c = i10 - uvVar.f18398f;
            uvVar.d = i11;
            uvVar.e = i12;
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.f18397c = (h0() + i10) - uvVar2.f18398f;
            if (uvVar != null) {
                i13 = uvVar.f18396b.getHeight();
            } else {
                i13 = 0;
            }
            uvVar2.d = i0() + i13 + i11;
            uvVar2.e = i12;
        }
    }

    public final int h0() {
        uv uvVar = this.X;
        if (uvVar == null || !this.Y) {
            return 0;
        }
        int i10 = this.f17621a.C;
        Rect rect = this.f17622b;
        return Math.max(0, ((i10 - rect.left) - rect.right) - uvVar.r());
    }

    public final int i0() {
        if (this.W != null && this.X != null) {
            return i0.L(4.0f);
        }
        return 0;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        qu.l(spannableStringBuilder, this.W, null);
        uv uvVar = this.X;
        if (uvVar != null && (staticLayout = uvVar.f18396b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(staticLayout.getText());
        }
    }

    @Override
    public final boolean v() {
        return false;
    }
}
