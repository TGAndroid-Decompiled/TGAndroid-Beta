package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class y6 extends FrameLayout implements r0.m {
    public final b2.q0 f4015a;
    public final a7 f4016b;

    public y6(a7 a7Var, Context context) {
        super(context);
        this.f4016b = a7Var;
        this.f4015a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        a7 a7Var = this.f4016b;
        pb pbVar = a7Var.f2767r;
        if (a7Var.f2770x <= 0) {
            float f7 = pbVar.f3543e0;
            float f10 = a7Var.f2763c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                a7Var.setOffset(f10);
                pbVar.f3543e0 = f10;
                o5 currentPeerView = pbVar.f3561n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                eb ebVar = pbVar.v;
                if (ebVar != null) {
                    ebVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        a7 a7Var = this.f4016b;
        pb pbVar = a7Var.f2767r;
        if (a7Var.f2770x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = pbVar.f3543e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            a7Var.setOffset(f7);
            pbVar.f3543e0 = f7;
            o5 currentPeerView = pbVar.f3561n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            eb ebVar = pbVar.v;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f4015a.f2260a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f4016b.f2770x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f4015a.f2260a = i10;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
