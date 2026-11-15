package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class gu extends cu {
    public final hv X;
    public final hv Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.s9[] f23913a0;

    public gu(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(ivVar, rect, i7);
        hv hvVar;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            hvVar = new hv(ivVar, spannableStringBuilder, this.f22935c);
        } else {
            hvVar = null;
        }
        this.X = hvVar;
        hv hvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new hv(ivVar, spannableStringBuilder2, this.f22935c);
        this.Y = hvVar2;
        this.Z = ivVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (hvVar != null) {
            arrayList.add(hvVar);
        }
        if (hvVar2 != null) {
            arrayList.add(hvVar2);
        }
        this.f23913a0 = (org.telegram.ui.Cells.s9[]) arrayList.toArray(new org.telegram.ui.Cells.s9[0]);
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f22934b;
        int i10 = rect.top;
        int i11 = 0;
        hv hvVar = this.X;
        if (hvVar != null) {
            i7 = hvVar.f24222b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0() + i7 + i10;
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            i11 = hvVar2.f24222b.getHeight();
        }
        return j02 + i11 + rect.bottom;
    }

    @Override
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.f22934b;
        hv hvVar = this.Y;
        if (hvVar != null) {
            i7 = hvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            hv hvVar2 = this.X;
            if (hvVar2 != null) {
                i7 = hvVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i7 = rect.left;
                i10 = rect.right;
            }
        }
        return i7 + i10;
    }

    @Override
    public final int K() {
        int i7 = 0;
        hv hvVar = this.X;
        if (hvVar != null) {
            i7 = Math.max(0, hvVar.r());
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            i7 = Math.max(i7, hvVar2.r());
        }
        Rect rect = this.f22934b;
        return rect.left + i7 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.f23913a0;
    }

    @Override
    public final void T() {
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.i(this.W);
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.i(this.W);
        }
    }

    @Override
    public final void V() {
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.f(this.W);
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.d(canvas, hvVar.T);
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            canvas.save();
            float i02 = i0();
            if (hvVar != null) {
                i7 = hvVar.f24222b.getHeight();
            } else {
                i7 = 0;
            }
            canvas.translate(i02, j0() + i7);
            hvVar2.d(canvas, hvVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        Rect rect;
        int i10;
        hv hvVar = this.X;
        if (hvVar != null) {
            i7 = hvVar.f24222b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i11 = this.f22934b.top;
        float f10 = y10 - i11;
        if (hvVar != null && f10 >= 0.0f && f10 < i7) {
            motionEvent.offsetLocation(0.0f, -i11);
            boolean t6 = hvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t6;
        }
        hv hvVar2 = this.Y;
        if (hvVar2 == null || f10 < i7 + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -i10);
        boolean t10 = hvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i11 + i7 + j02);
        return t10;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        int i12;
        this.T = i7;
        this.U = i10;
        this.V = i11;
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.f24223c = i7 - hvVar.f24225f;
            hvVar.d = i10;
            hvVar.f24224e = i11;
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.f24223c = (i0() + i7) - hvVar2.f24225f;
            if (hvVar != null) {
                i12 = hvVar.f24222b.getHeight();
            } else {
                i12 = 0;
            }
            hvVar2.d = j0() + i12 + i10;
            hvVar2.f24224e = i11;
        }
    }

    public final int i0() {
        hv hvVar = this.Y;
        if (hvVar == null || !this.Z) {
            return 0;
        }
        int i7 = this.f22933a.C;
        Rect rect = this.f22934b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - hvVar.r());
    }

    public final int j0() {
        if (this.X != null && this.Y != null) {
            return g0.L(4.0f);
        }
        return 0;
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        cu.l(spannableStringBuilder, this.X, null);
        hv hvVar = this.Y;
        if (hvVar != null && (staticLayout = hvVar.f24222b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
