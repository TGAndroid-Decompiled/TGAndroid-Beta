package ai;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.mx;
public final class v extends og.b {
    public final boolean d;
    public final mx f1811e;

    public v(mx mxVar, boolean z10) {
        this.f1811e = mxVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        mx mxVar = this.f1811e;
        if (z10) {
            arrayList = mxVar.f695y;
        } else {
            arrayList = mxVar.f693x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        a0 a0Var = (a0) d1Var.f47897a;
        a0Var.f624b = i10;
        boolean z10 = this.d;
        mx mxVar = this.f1811e;
        if (z10) {
            a0Var.setDialogId(((w) mxVar.f695y.get(i10)).f1839c);
        } else {
            a0Var.setDialogId(((w) mxVar.f693x.get(i10)).f1839c);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        a0 a0Var = new a0(this.f1811e, viewGroup.getContext());
        boolean z10 = this.d;
        a0Var.N = z10;
        if (z10) {
            a0Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.d1(a0Var);
    }
}
