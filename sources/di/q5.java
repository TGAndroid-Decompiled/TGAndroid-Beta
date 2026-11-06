package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class q5 extends FrameLayout implements r0.l {
    public final e2.r0 f9635a;
    public final s5 f9636b;

    public q5(s5 s5Var, Context context) {
        super(context);
        this.f9636b = s5Var;
        this.f9635a = new Object();
    }

    @Override
    public final void k(int i7, View view) {
        this.f9635a.f10533a = 0;
    }

    @Override
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        s5 s5Var = this.f9636b;
        p9 p9Var = s5Var.f9761r;
        if (s5Var.f9765y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = p9Var.f9541e0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            s5Var.setOffset(f10);
            p9Var.f9541e0 = f10;
            i4 currentPeerView = p9Var.f9559n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            e9 e9Var = p9Var.f9578w;
            if (e9Var != null) {
                e9Var.invalidate();
            }
        }
    }

    @Override
    public final boolean o(View view, View view2, int i7, int i10) {
        if (this.f9636b.f9765y <= 0 && i7 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(View view, View view2, int i7, int i10) {
        this.f9635a.f10533a = i7;
    }

    @Override
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        s5 s5Var = this.f9636b;
        p9 p9Var = s5Var.f9761r;
        if (s5Var.f9765y <= 0) {
            float f10 = p9Var.f9541e0;
            float f11 = s5Var.f9757c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                s5Var.setOffset(f11);
                p9Var.f9541e0 = f11;
                i4 currentPeerView = p9Var.f9559n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                e9 e9Var = p9Var.f9578w;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
