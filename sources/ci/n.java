package ci;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.tw;
public final class n extends pg.b {
    public final boolean d;
    public final tw e;

    public n(tw twVar, boolean z10) {
        this.e = twVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        tw twVar = this.e;
        if (z10) {
            arrayList = twVar.f5898y;
        } else {
            arrayList = twVar.f5896x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        q qVar = (q) b1Var.f45921a;
        qVar.f5738b = i10;
        boolean z10 = this.d;
        tw twVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) twVar.f5898y.get(i10)).f5680c);
        } else {
            qVar.setDialogId(((o) twVar.f5896x.get(i10)).f5680c);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        q qVar = new q(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.N = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.b1(qVar);
    }
}
