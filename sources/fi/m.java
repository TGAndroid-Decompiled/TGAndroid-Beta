package fi;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.tv;
public final class m extends rg.b {
    public final boolean d;
    public final tv f12235e;

    public m(tv tvVar, boolean z10) {
        this.f12235e = tvVar;
        this.d = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.d;
        tv tvVar = this.f12235e;
        if (z10) {
            arrayList = tvVar.E;
        } else {
            arrayList = tvVar.f12437y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        p pVar = (p) e1Var.f59111a;
        pVar.f12349b = i7;
        boolean z10 = this.d;
        tv tvVar = this.f12235e;
        if (z10) {
            pVar.setDialogId(((n) tvVar.E.get(i7)).f12274c);
        } else {
            pVar.setDialogId(((n) tvVar.f12437y.get(i7)).f12274c);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.f12235e, viewGroup.getContext());
        boolean z10 = this.d;
        pVar.O = z10;
        if (z10) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new v4.e1(pVar);
    }
}
