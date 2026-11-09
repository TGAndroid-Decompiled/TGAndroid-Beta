package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class r5 extends FrameLayout implements r0.l {
    public final e2.r0 f9686a;
    public final t5 f9687b;

    public r5(t5 t5Var, Context context) {
        super(context);
        this.f9687b = t5Var;
        this.f9686a = new Object();
    }

    @Override
    public final void k(int i7, View view) {
        this.f9686a.f10533a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        t5 t5Var = this.f9687b;
        q9 q9Var = t5Var.f9790r;
        if (t5Var.f9794y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = q9Var.f9606e0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            t5Var.setOffset(f10);
            q9Var.f9606e0 = f10;
            j4 currentPeerView = q9Var.f9624n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            f9 f9Var = q9Var.f9643w;
            if (f9Var != null) {
                f9Var.invalidate();
            }
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f9687b.f9794y <= 0 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f9686a.f10533a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        t5 t5Var = this.f9687b;
        q9 q9Var = t5Var.f9790r;
        if (t5Var.f9794y <= 0) {
            float f10 = q9Var.f9606e0;
            float f11 = t5Var.f9786c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                t5Var.setOffset(f11);
                q9Var.f9606e0 = f11;
                j4 currentPeerView = q9Var.f9624n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                f9 f9Var = q9Var.f9643w;
                if (f9Var != null) {
                    f9Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
