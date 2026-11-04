package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class q5 extends FrameLayout implements r0.l {
    public final d2.t0 f10806a;
    public final s5 f10807b;

    public q5(s5 s5Var, Context context) {
        super(context);
        this.f10807b = s5Var;
        this.f10806a = new Object();
    }

    @Override
    public final void m(int i3, View view) {
        this.f10806a.f8413a = 0;
    }

    @Override
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        s5 s5Var = this.f10807b;
        r9 r9Var = s5Var.f11003r;
        if (s5Var.f11007y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = r9Var.f10923f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            s5Var.setOffset(f10);
            r9Var.f10923f0 = f10;
            j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            f9 f9Var = r9Var.f10957w;
            if (f9Var != null) {
                f9Var.invalidate();
            }
        }
    }

    @Override
    public final boolean p(View view, View view2, int i3, int i10) {
        if (this.f10807b.f11007y <= 0 && i3 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i3, int i10) {
        this.f10806a.f8413a = i3;
    }

    @Override
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
        s5 s5Var = this.f10807b;
        r9 r9Var = s5Var.f11003r;
        if (s5Var.f11007y <= 0) {
            float f10 = r9Var.f10923f0;
            float f11 = s5Var.f10999c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                s5Var.setOffset(f11);
                r9Var.f10923f0 = f11;
                j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                f9 f9Var = r9Var.f10957w;
                if (f9Var != null) {
                    f9Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
