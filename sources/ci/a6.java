package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class a6 extends FrameLayout implements r0.m {
    public final b2.u0 f5145a;
    public final c6 f5146b;

    public a6(c6 c6Var, Context context) {
        super(context);
        this.f5146b = c6Var;
        this.f5145a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        c6 c6Var = this.f5146b;
        aa aaVar = c6Var.f5285r;
        if (c6Var.f5288x <= 0) {
            float f7 = aaVar.f5188e0;
            float f10 = c6Var.f5282c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                c6Var.setOffset(f10);
                aaVar.f5188e0 = f10;
                q4 currentPeerView = aaVar.f5206n0.getCurrentPeerView();
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
        c6 c6Var = this.f5146b;
        aa aaVar = c6Var.f5285r;
        if (c6Var.f5288x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = aaVar.f5188e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            c6Var.setOffset(f7);
            aaVar.f5188e0 = f7;
            q4 currentPeerView = aaVar.f5206n0.getCurrentPeerView();
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
        this.f5145a.f4057a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f5146b.f5288x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f5145a.f4057a = i10;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
