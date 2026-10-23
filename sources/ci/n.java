package ci;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.vw;
public final class n extends pg.b {
    public final boolean d;
    public final vw e;

    public n(vw vwVar, boolean z10) {
        this.e = vwVar;
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
        vw vwVar = this.e;
        if (z10) {
            arrayList = vwVar.f5843y;
        } else {
            arrayList = vwVar.f5841x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        q qVar = (q) b1Var.f46343a;
        qVar.f5755b = i10;
        boolean z10 = this.d;
        vw vwVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) vwVar.f5843y.get(i10)).f5615c);
        } else {
            qVar.setDialogId(((o) vwVar.f5841x.get(i10)).f5615c);
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
