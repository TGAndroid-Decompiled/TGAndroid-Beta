package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class i5 extends FrameLayout implements r0.l {
    public final e2.r0 f11818a;
    public final k5 f11819b;

    public i5(k5 k5Var, Context context) {
        super(context);
        this.f11819b = k5Var;
        this.f11818a = new Object();
    }

    @Override
    public final void k(int i7, View view) {
        this.f11818a.f10369a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        k5 k5Var = this.f11819b;
        i9 i9Var = k5Var.f11933r;
        if (k5Var.f11937y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = i9Var.f11845f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            k5Var.setOffset(f10);
            i9Var.f11845f0 = f10;
            b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            x8 x8Var = i9Var.f11879w;
            if (x8Var != null) {
                x8Var.invalidate();
            }
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f11819b.f11937y <= 0 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f11818a.f10369a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        k5 k5Var = this.f11819b;
        i9 i9Var = k5Var.f11933r;
        if (k5Var.f11937y <= 0) {
            float f10 = i9Var.f11845f0;
            float f11 = k5Var.f11929c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                k5Var.setOffset(f11);
                i9Var.f11845f0 = f11;
                b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                x8 x8Var = i9Var.f11879w;
                if (x8Var != null) {
                    x8Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
