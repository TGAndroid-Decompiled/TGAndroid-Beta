package nh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class k5 extends FrameLayout implements r0.n {
    public final c5.e f15538a;
    public final m5 f15539b;

    public k5(m5 m5Var, Context context) {
        super(context);
        this.f15539b = m5Var;
        this.f15538a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        m5 m5Var = this.f15539b;
        i9 i9Var = m5Var.f15613r;
        if (m5Var.f15616x <= 0) {
            float f10 = i9Var.f15452b0;
            float f11 = m5Var.f15610c;
            if (f10 < f11 && i11 > 0) {
                float f12 = f10 + i11;
                iArr[1] = i11;
                if (f12 <= f11) {
                    f11 = f12;
                }
                m5Var.setOffset(f11);
                i9Var.f15452b0 = f11;
                d4 currentPeerView = i9Var.f15472k0.getCurrentPeerView();
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
        m5 m5Var = this.f15539b;
        i9 i9Var = m5Var.f15613r;
        if (m5Var.f15616x <= 0 && i13 != 0 && i11 == 0) {
            float f10 = i9Var.f15452b0;
            float f11 = i13 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            m5Var.setOffset(f10);
            i9Var.f15452b0 = f10;
            d4 currentPeerView = i9Var.f15472k0.getCurrentPeerView();
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
        this.f15538a.f2085a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (this.f15539b.f15616x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f15538a.f2085a = i10;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
