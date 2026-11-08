package di;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.pv;
public final class m extends rg.b {
    public final boolean d;
    public final pv f9341e;

    public m(pv pvVar, boolean z9) {
        this.f9341e = pvVar;
        this.d = z9;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z9 = this.d;
        pv pvVar = this.f9341e;
        if (z9) {
            arrayList = pvVar.D;
        } else {
            arrayList = pvVar.f9618y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        p pVar = (p) d1Var.f57043a;
        pVar.f9484b = i7;
        boolean z9 = this.d;
        pv pvVar = this.f9341e;
        if (z9) {
            pVar.setDialogId(((n) pvVar.D.get(i7)).f9375c);
        } else {
            pVar.setDialogId(((n) pvVar.f9618y.get(i7)).f9375c);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.f9341e, viewGroup.getContext());
        boolean z9 = this.d;
        pVar.N = z9;
        if (z9) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new v4.d1(pVar);
    }
}
