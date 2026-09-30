package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class q7 extends FrameLayout implements r0.m {
    public final b2.q0 f1433a;
    public final s7 f1434b;

    public q7(s7 s7Var, Context context) {
        super(context);
        this.f1434b = s7Var;
        this.f1433a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        s7 s7Var = this.f1434b;
        jc jcVar = s7Var.f1508r;
        if (s7Var.f1511x <= 0) {
            float f7 = jcVar.f1071e0;
            float f10 = s7Var.f1505c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                s7Var.setOffset(f10);
                jcVar.f1071e0 = f10;
                e6 currentPeerView = jcVar.f1089n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                yb ybVar = jcVar.v;
                if (ybVar != null) {
                    ybVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        s7 s7Var = this.f1434b;
        jc jcVar = s7Var.f1508r;
        if (s7Var.f1511x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = jcVar.f1071e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            s7Var.setOffset(f7);
            jcVar.f1071e0 = f7;
            e6 currentPeerView = jcVar.f1089n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            yb ybVar = jcVar.v;
            if (ybVar != null) {
                ybVar.invalidate();
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f1433a.f3202a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f1434b.f1511x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f1433a.f3202a = i10;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
