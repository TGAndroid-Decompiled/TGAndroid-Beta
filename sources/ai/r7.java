package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class r7 extends FrameLayout implements r0.m {
    public final b2.q0 f1663a;
    public final t7 f1664b;

    public r7(t7 t7Var, Context context) {
        super(context);
        this.f1664b = t7Var;
        this.f1663a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        t7 t7Var = this.f1664b;
        kc kcVar = t7Var.f1744r;
        if (t7Var.f1747x <= 0) {
            float f7 = kcVar.f1265e0;
            float f10 = t7Var.f1740c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                t7Var.setOffset(f10);
                kcVar.f1265e0 = f10;
                f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                zb zbVar = kcVar.v;
                if (zbVar != null) {
                    zbVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        t7 t7Var = this.f1664b;
        kc kcVar = t7Var.f1744r;
        if (t7Var.f1747x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = kcVar.f1265e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            t7Var.setOffset(f7);
            kcVar.f1265e0 = f7;
            f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            zb zbVar = kcVar.v;
            if (zbVar != null) {
                zbVar.invalidate();
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f1663a.f3533a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f1664b.f1747x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f1663a.f3533a = i10;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
