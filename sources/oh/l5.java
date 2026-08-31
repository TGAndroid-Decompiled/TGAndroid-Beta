package oh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class l5 extends FrameLayout implements r0.n {
    public final c5.e f17394a;
    public final n5 f17395b;

    public l5(n5 n5Var, Context context) {
        super(context);
        this.f17395b = n5Var;
        this.f17394a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        n5 n5Var = this.f17395b;
        i9 i9Var = n5Var.f17493r;
        if (n5Var.f17496x <= 0) {
            float f10 = i9Var.f17256b0;
            float f11 = n5Var.f17489c;
            if (f10 < f11 && i11 > 0) {
                float f12 = f10 + i11;
                iArr[1] = i11;
                if (f12 <= f11) {
                    f11 = f12;
                }
                n5Var.setOffset(f11);
                i9Var.f17256b0 = f11;
                f4 currentPeerView = i9Var.f17277k0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                x8 x8Var = i9Var.v;
                if (x8Var != null) {
                    x8Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n5 n5Var = this.f17395b;
        i9 i9Var = n5Var.f17493r;
        if (n5Var.f17496x <= 0 && i13 != 0 && i11 == 0) {
            float f10 = i9Var.f17256b0;
            float f11 = i13 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            n5Var.setOffset(f10);
            i9Var.f17256b0 = f10;
            f4 currentPeerView = i9Var.f17277k0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            x8 x8Var = i9Var.v;
            if (x8Var != null) {
                x8Var.invalidate();
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f17394a.f2268a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f17395b.f17496x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f17394a.f2268a = i10;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
