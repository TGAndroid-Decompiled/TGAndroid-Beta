package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
public final class eu extends au {
    public final ev X;
    public final ev Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.u9[] f23768a0;

    public eu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(fvVar, rect, i7);
        ev evVar;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            evVar = new ev(fvVar, spannableStringBuilder, this.f22970c);
        } else {
            evVar = null;
        }
        this.X = evVar;
        ev evVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new ev(fvVar, spannableStringBuilder2, this.f22970c);
        this.Y = evVar2;
        this.Z = fvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (evVar != null) {
            arrayList.add(evVar);
        }
        if (evVar2 != null) {
            arrayList.add(evVar2);
        }
        this.f23768a0 = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override
    public final int I() {
        int i7;
        Rect rect = this.f22969b;
        int i10 = rect.top;
        int i11 = 0;
        ev evVar = this.X;
        if (evVar != null) {
            i7 = evVar.f23770b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0() + i7 + i10;
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            i11 = evVar2.f23770b.getHeight();
        }
        return j02 + i11 + rect.bottom;
    }

    @Override
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.f22969b;
        ev evVar = this.Y;
        if (evVar != null) {
            i7 = evVar.q() + rect.left;
            i10 = rect.right;
        } else {
            ev evVar2 = this.X;
            if (evVar2 != null) {
                i7 = evVar2.q() + rect.left;
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
        ev evVar = this.X;
        if (evVar != null) {
            i7 = Math.max(0, evVar.r());
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            i7 = Math.max(i7, evVar2.r());
        }
        Rect rect = this.f22969b;
        return rect.left + i7 + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.f23768a0;
    }

    @Override
    public final void T() {
        ev evVar = this.X;
        if (evVar != null) {
            evVar.i(this.W);
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.i(this.W);
        }
    }

    @Override
    public final void V() {
        ev evVar = this.X;
        if (evVar != null) {
            evVar.f(this.W);
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.f(this.W);
        }
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        ev evVar = this.X;
        if (evVar != null) {
            evVar.d(canvas, evVar.T);
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            canvas.save();
            float i02 = i0();
            if (evVar != null) {
                i7 = evVar.f23770b.getHeight();
            } else {
                i7 = 0;
            }
            canvas.translate(i02, j0() + i7);
            evVar2.d(canvas, evVar2.T);
            canvas.restore();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        Rect rect;
        int i10;
        ev evVar = this.X;
        if (evVar != null) {
            i7 = evVar.f23770b.getHeight();
        } else {
            i7 = 0;
        }
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i11 = this.f22969b.top;
        float f10 = y10 - i11;
        if (evVar != null && f10 >= 0.0f && f10 < i7) {
            motionEvent.offsetLocation(0.0f, -i11);
            boolean t6 = evVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, rect.top);
            return t6;
        }
        ev evVar2 = this.Y;
        if (evVar2 == null || f10 < i7 + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -i10);
        boolean t10 = evVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i11 + i7 + j02);
        return t10;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        int i12;
        this.T = i7;
        this.U = i10;
        this.V = i11;
        ev evVar = this.X;
        if (evVar != null) {
            evVar.f23771c = i7 - evVar.f23773f;
            evVar.d = i10;
            evVar.f23772e = i11;
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.f23771c = (i0() + i7) - evVar2.f23773f;
            if (evVar != null) {
                i12 = evVar.f23770b.getHeight();
            } else {
                i12 = 0;
            }
            evVar2.d = j0() + i12 + i10;
            evVar2.f23772e = i11;
        }
    }

    public final int i0() {
        ev evVar = this.Y;
        if (evVar == null || !this.Z) {
            return 0;
        }
        int i7 = this.f22968a.C;
        Rect rect = this.f22969b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - evVar.r());
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
        au.l(spannableStringBuilder, this.X, null);
        ev evVar = this.Y;
        if (evVar != null && (staticLayout = evVar.f23770b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
