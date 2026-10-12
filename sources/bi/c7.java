package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class c7 extends FrameLayout implements r0.n {
    public final b2.v0 f2902a;
    public final e7 f2903b;

    public c7(e7 e7Var, Context context) {
        super(context);
        this.f2903b = e7Var;
        this.f2902a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        e7 e7Var = this.f2903b;
        sb sbVar = e7Var.f2993r;
        if (e7Var.f2996x <= 0) {
            float f7 = sbVar.f3671e0;
            float f10 = e7Var.f2990c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                e7Var.setOffset(f10);
                sbVar.f3671e0 = f10;
                q5 currentPeerView = sbVar.f3689n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                hb hbVar = sbVar.v;
                if (hbVar != null) {
                    hbVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e7 e7Var = this.f2903b;
        sb sbVar = e7Var.f2993r;
        if (e7Var.f2996x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = sbVar.f3671e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            e7Var.setOffset(f7);
            sbVar.f3671e0 = f7;
            q5 currentPeerView = sbVar.f3689n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            hb hbVar = sbVar.v;
            if (hbVar != null) {
                hbVar.invalidate();
            }
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f2902a.f2444a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f2903b.f2996x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f2902a.f2444a = i10;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
