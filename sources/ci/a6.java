package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class a6 extends FrameLayout implements r0.m {
    public final b2.u0 f5144a;
    public final c6 f5145b;

    public a6(c6 c6Var, Context context) {
        super(context);
        this.f5145b = c6Var;
        this.f5144a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        c6 c6Var = this.f5145b;
        aa aaVar = c6Var.f5284r;
        if (c6Var.f5287x <= 0) {
            float f7 = aaVar.f5187e0;
            float f10 = c6Var.f5281c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                c6Var.setOffset(f10);
                aaVar.f5187e0 = f10;
                q4 currentPeerView = aaVar.f5205n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                p9 p9Var = aaVar.v;
                if (p9Var != null) {
                    p9Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c6 c6Var = this.f5145b;
        aa aaVar = c6Var.f5284r;
        if (c6Var.f5287x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = aaVar.f5187e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            c6Var.setOffset(f7);
            aaVar.f5187e0 = f7;
            q4 currentPeerView = aaVar.f5205n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            p9 p9Var = aaVar.v;
            if (p9Var != null) {
                p9Var.invalidate();
            }
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f5144a.f4055a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f5145b.f5287x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f5144a.f4055a = i10;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
