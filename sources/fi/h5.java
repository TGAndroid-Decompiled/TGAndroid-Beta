package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class h5 extends FrameLayout implements r0.l {
    public final e2.r0 f12043a;
    public final j5 f12044b;

    public h5(j5 j5Var, Context context) {
        super(context);
        this.f12044b = j5Var;
        this.f12043a = new Object();
    }

    @Override
    public final void k(int i7, View view) {
        this.f12043a.f10677a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        j5 j5Var = this.f12044b;
        f9 f9Var = j5Var.f12155r;
        if (j5Var.f12159y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = f9Var.f11973f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            j5Var.setOffset(f10);
            f9Var.f11973f0 = f10;
            z3 currentPeerView = f9Var.f11989o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            u8 u8Var = f9Var.f12007w;
            if (u8Var != null) {
                u8Var.invalidate();
            }
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f12044b.f12159y <= 0 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f12043a.f10677a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        j5 j5Var = this.f12044b;
        f9 f9Var = j5Var.f12155r;
        if (j5Var.f12159y <= 0) {
            float f10 = f9Var.f11973f0;
            float f11 = j5Var.f12151c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                j5Var.setOffset(f11);
                f9Var.f11973f0 = f11;
                z3 currentPeerView = f9Var.f11989o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                u8 u8Var = f9Var.f12007w;
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
