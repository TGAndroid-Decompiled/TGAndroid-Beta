package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class g5 extends FrameLayout implements r0.l {
    public final e2.r0 f12017a;
    public final i5 f12018b;

    public g5(i5 i5Var, Context context) {
        super(context);
        this.f12018b = i5Var;
        this.f12017a = new Object();
    }

    @Override
    public final void k(int i7, View view) {
        this.f12017a.f10687a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        i5 i5Var = this.f12018b;
        f9 f9Var = i5Var.f12107r;
        if (i5Var.f12111y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = f9Var.f11970f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            i5Var.setOffset(f10);
            f9Var.f11970f0 = f10;
            z3 currentPeerView = f9Var.f11986o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            u8 u8Var = f9Var.f12004w;
            if (u8Var != null) {
                u8Var.invalidate();
            }
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f12018b.f12111y <= 0 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f12017a.f10687a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        i5 i5Var = this.f12018b;
        f9 f9Var = i5Var.f12107r;
        if (i5Var.f12111y <= 0) {
            float f10 = f9Var.f11970f0;
            float f11 = i5Var.f12103c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                i5Var.setOffset(f11);
                f9Var.f11970f0 = f11;
                z3 currentPeerView = f9Var.f11986o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                u8 u8Var = f9Var.f12004w;
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
