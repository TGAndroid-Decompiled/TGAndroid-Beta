package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class j5 extends FrameLayout implements r0.n {
    public final a5.e f15804a;
    public final l5 f15805b;

    public j5(l5 l5Var, Context context) {
        super(context);
        this.f15805b = l5Var;
        this.f15804a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        l5 l5Var = this.f15805b;
        i9 i9Var = l5Var.f15888r;
        if (l5Var.f15891x <= 0) {
            float f9 = i9Var.f15743a0;
            float f10 = l5Var.f15884c;
            if (f9 < f10 && i11 > 0) {
                float f11 = f9 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                l5Var.setOffset(f10);
                i9Var.f15743a0 = f10;
                d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
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
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        l5 l5Var = this.f15805b;
        i9 i9Var = l5Var.f15888r;
        if (l5Var.f15891x <= 0 && i13 != 0 && i11 == 0) {
            float f9 = i9Var.f15743a0;
            float f10 = i13 + f9;
            if (f10 <= f9) {
                f9 = f10;
            }
            l5Var.setOffset(f9);
            i9Var.f15743a0 = f9;
            d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
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
    public final void n(int i10, View view) {
        this.f15804a.f165a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (this.f15805b.f15891x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f15804a.f165a = i10;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
