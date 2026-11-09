package di;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.rv;
public final class m extends rg.b {
    public final boolean d;
    public final rv f9352e;

    public m(rv rvVar, boolean z9) {
        this.f9352e = rvVar;
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
        rv rvVar = this.f9352e;
        if (z9) {
            arrayList = rvVar.D;
        } else {
            arrayList = rvVar.f9559y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        p pVar = (p) d1Var.f57056a;
        pVar.f9473b = i7;
        boolean z9 = this.d;
        rv rvVar = this.f9352e;
        if (z9) {
            pVar.setDialogId(((n) rvVar.D.get(i7)).f9366c);
        } else {
            pVar.setDialogId(((n) rvVar.f9559y.get(i7)).f9366c);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.f9352e, viewGroup.getContext());
        boolean z9 = this.d;
        pVar.N = z9;
        if (z9) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new v4.d1(pVar);
    }
}
