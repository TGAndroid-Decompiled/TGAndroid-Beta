package fi;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.qv;
public final class m extends rg.b {
    public final boolean d;
    public final qv f12021e;

    public m(qv qvVar, boolean z10) {
        this.f12021e = qvVar;
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
        qv qvVar = this.f12021e;
        if (z10) {
            arrayList = qvVar.E;
        } else {
            arrayList = qvVar.f12217y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        p pVar = (p) e1Var.f58535a;
        pVar.f12145b = i7;
        boolean z10 = this.d;
        qv qvVar = this.f12021e;
        if (z10) {
            pVar.setDialogId(((n) qvVar.E.get(i7)).f12049c);
        } else {
            pVar.setDialogId(((n) qvVar.f12217y.get(i7)).f12049c);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.f12021e, viewGroup.getContext());
        boolean z10 = this.d;
        pVar.O = z10;
        if (z10) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new v4.e1(pVar);
    }
}
