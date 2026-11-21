package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class du extends zt {
    public final dv X;
    public final dv Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.u9[] f23603a0;

    public du(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(evVar, rect, i7);
        dv dvVar;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            dvVar = new dv(evVar, spannableStringBuilder, this.f28379c);
        } else {
            dvVar = null;
        }
        this.X = dvVar;
        dv dvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new dv(evVar, spannableStringBuilder2, this.f28379c);
        this.Y = dvVar2;
        this.Z = evVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (dvVar != null) {
            arrayList.add(dvVar);
        }
        if (dvVar2 != null) {
            arrayList.add(dvVar2);
        }
        this.f23603a0 = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f28378b;
        int i10 = rect.top;
        int i11 = 0;
        dv dvVar = this.X;
        if (dvVar != null) {
            i7 = dvVar.f23605b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0() + i7 + i10;
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            i11 = dvVar2.f23605b.getHeight();
        }
        return j02 + i11 + rect.bottom;
    }

    @Override
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.f28378b;
        dv dvVar = this.Y;
        if (dvVar != null) {
            i7 = dvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            dv dvVar2 = this.X;
            if (dvVar2 != null) {
                i7 = dvVar2.q() + rect.left;
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
        dv dvVar = this.X;
        if (dvVar != null) {
            i7 = Math.max(0, dvVar.r());
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            i7 = Math.max(i7, dvVar2.r());
        }
        Rect rect = this.f28378b;
        return rect.left + i7 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.f23603a0;
    }

    @Override
    public final void T() {
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.i(this.W);
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.i(this.W);
        }
    }

    @Override
    public final void V() {
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.f(this.W);
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.d(canvas, dvVar.T);
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            canvas.save();
            float i02 = i0();
            if (dvVar != null) {
                i7 = dvVar.f23605b.getHeight();
            } else {
                i7 = 0;
            }
            canvas.translate(i02, j0() + i7);
            dvVar2.d(canvas, dvVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        Rect rect;
        int i10;
        dv dvVar = this.X;
        if (dvVar != null) {
            i7 = dvVar.f23605b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i11 = this.f28378b.top;
        float f10 = y10 - i11;
        if (dvVar != null && f10 >= 0.0f && f10 < i7) {
            motionEvent.offsetLocation(0.0f, -i11);
            boolean t6 = dvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t6;
        }
        dv dvVar2 = this.Y;
        if (dvVar2 == null || f10 < i7 + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -i10);
        boolean t10 = dvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i11 + i7 + j02);
        return t10;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        int i12;
        this.T = i7;
        this.U = i10;
        this.V = i11;
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.f23606c = i7 - dvVar.f23608f;
            dvVar.d = i10;
            dvVar.f23607e = i11;
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.f23606c = (i0() + i7) - dvVar2.f23608f;
            if (dvVar != null) {
                i12 = dvVar.f23605b.getHeight();
            } else {
                i12 = 0;
            }
            dvVar2.d = j0() + i12 + i10;
            dvVar2.f23607e = i11;
        }
    }

    public final int i0() {
        dv dvVar = this.Y;
        if (dvVar == null || !this.Z) {
            return 0;
        }
        int i7 = this.f28377a.C;
        Rect rect = this.f28378b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - dvVar.r());
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
        zt.l(spannableStringBuilder, this.X, null);
        dv dvVar = this.Y;
        if (dvVar != null && (staticLayout = dvVar.f23605b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
