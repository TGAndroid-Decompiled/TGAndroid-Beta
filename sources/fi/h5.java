package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class h5 extends FrameLayout implements r0.l {
    public final e2.r0 f12081a;
    public final j5 f12082b;

    public h5(j5 j5Var, Context context) {
        super(context);
        this.f12082b = j5Var;
        this.f12081a = new Object();
    }

    @Override
    public final void k(int i7, View view) {
        this.f12081a.f10716a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        j5 j5Var = this.f12082b;
        f9 f9Var = j5Var.f12193r;
        if (j5Var.f12197y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = f9Var.f12011f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            j5Var.setOffset(f10);
            f9Var.f12011f0 = f10;
            z3 currentPeerView = f9Var.f12027o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            u8 u8Var = f9Var.f12045w;
            if (u8Var != null) {
                u8Var.invalidate();
            }
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f12082b.f12197y <= 0 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f12081a.f10716a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        j5 j5Var = this.f12082b;
        f9 f9Var = j5Var.f12193r;
        if (j5Var.f12197y <= 0) {
            float f10 = f9Var.f12011f0;
            float f11 = j5Var.f12189c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                j5Var.setOffset(f11);
                f9Var.f12011f0 = f11;
                z3 currentPeerView = f9Var.f12027o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                u8 u8Var = f9Var.f12045w;
                if (u8Var != null) {
                    u8Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
