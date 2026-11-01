package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class vu extends ru {
    public final vv W;
    public final vv X;
    public final boolean Y;
    public final org.telegram.ui.Cells.u9[] Z;

    public vu(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(wvVar, rect, i10);
        vv vvVar;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            vvVar = new vv(wvVar, spannableStringBuilder, this.f17969c);
        } else {
            vvVar = null;
        }
        this.W = vvVar;
        vv vvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new vv(wvVar, spannableStringBuilder2, this.f17969c);
        this.X = vvVar2;
        this.Y = wvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (vvVar != null) {
            arrayList.add(vvVar);
        }
        if (vvVar2 != null) {
            arrayList.add(vvVar2);
        }
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int H() {
        int i10;
        Rect rect = this.f17968b;
        int i11 = rect.top;
        int i12 = 0;
        vv vvVar = this.W;
        if (vvVar != null) {
            i10 = vvVar.f18904b.getHeight();
        } else {
            i10 = 0;
        }
        int i02 = i0() + i10 + i11;
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            i12 = vvVar2.f18904b.getHeight();
        }
        return i02 + i12 + rect.bottom;
    }

    @Override
    public final int I() {
        int i10;
        int i11;
        Rect rect = this.f17968b;
        vv vvVar = this.X;
        if (vvVar != null) {
            i10 = vvVar.q() + rect.left;
            i11 = rect.right;
        } else {
            vv vvVar2 = this.W;
            if (vvVar2 != null) {
                i10 = vvVar2.q() + rect.left;
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
        vv vvVar = this.W;
        if (vvVar != null) {
            i10 = Math.max(0, vvVar.r());
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            i10 = Math.max(i10, vvVar2.r());
        }
        Rect rect = this.f17968b;
        return rect.left + i10 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override
    public final void S() {
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.i(this.V);
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.i(this.V);
        }
    }

    @Override
    public final void U() {
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.f(this.V);
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.f(this.V);
        }
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.d(canvas, vvVar.S);
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            canvas.save();
            float h02 = h0();
            if (vvVar != null) {
                i10 = vvVar.f18904b.getHeight();
            } else {
                i10 = 0;
            }
            canvas.translate(h02, i0() + i10);
            vvVar2.d(canvas, vvVar2.S);
            canvas.restore();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int i10;
        Rect rect;
        int i11;
        vv vvVar = this.W;
        if (vvVar != null) {
            i10 = vvVar.f18904b.getHeight();
        } else {
            i10 = 0;
        }
        int i02 = i0();
        float y3 = motionEvent.getY();
        int i12 = this.f17968b.top;
        float f7 = y3 - i12;
        if (vvVar != null && f7 >= 0.0f && f7 < i10) {
            motionEvent.offsetLocation(0.0f, -i12);
            boolean t10 = vvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t10;
        }
        vv vvVar2 = this.X;
        if (vvVar2 == null || f7 < i10 + i02) {
            return false;
        }
        int h02 = h0();
        motionEvent.offsetLocation(-h02, -i11);
        boolean t11 = vvVar2.t(motionEvent);
        motionEvent.offsetLocation(h02, i12 + i10 + i02);
        return t11;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        int i13;
        this.S = i10;
        this.T = i11;
        this.U = i12;
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.f18905c = i10 - vvVar.f18906f;
            vvVar.d = i11;
            vvVar.e = i12;
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.f18905c = (h0() + i10) - vvVar2.f18906f;
            if (vvVar != null) {
                i13 = vvVar.f18904b.getHeight();
            } else {
                i13 = 0;
            }
            vvVar2.d = i0() + i13 + i11;
            vvVar2.e = i12;
        }
    }

    public final int h0() {
        vv vvVar = this.X;
        if (vvVar == null || !this.Y) {
            return 0;
        }
        int i10 = this.f17967a.C;
        Rect rect = this.f17968b;
        return Math.max(0, ((i10 - rect.left) - rect.right) - vvVar.r());
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
        ru.l(spannableStringBuilder, this.W, null);
        vv vvVar = this.X;
        if (vvVar != null && (staticLayout = vvVar.f18904b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
