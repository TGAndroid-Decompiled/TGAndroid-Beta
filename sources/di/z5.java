package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class z5 extends FrameLayout implements r0.m {
    public final b2.v0 f9485a;
    public final b6 f9486b;

    public z5(b6 b6Var, Context context) {
        super(context);
        this.f9486b = b6Var;
        this.f9485a = new Object();
    }

    @Override
    public final void m(int i10, View view) {
        this.f9485a.f3511a = 0;
    }

    @Override
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b6 b6Var = this.f9486b;
        y9 y9Var = b6Var.f8431r;
        if (b6Var.f8434x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = y9Var.f9426e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            b6Var.setOffset(f7);
            y9Var.f9426e0 = f7;
            q4 currentPeerView = y9Var.f9444n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            n9 n9Var = y9Var.v;
            if (n9Var != null) {
                n9Var.invalidate();
            }
        }
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f9486b.f8434x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f9485a.f3511a = i10;
    }

    @Override
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        b6 b6Var = this.f9486b;
        y9 y9Var = b6Var.f8431r;
        if (b6Var.f8434x <= 0) {
            float f7 = y9Var.f9426e0;
            float f10 = b6Var.f8428c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                b6Var.setOffset(f10);
                y9Var.f9426e0 = f10;
                q4 currentPeerView = y9Var.f9444n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                n9 n9Var = y9Var.v;
                if (n9Var != null) {
                    n9Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
