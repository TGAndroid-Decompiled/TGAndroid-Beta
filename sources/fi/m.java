package fi;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.sv;
public final class m extends rg.b {
    public final boolean d;
    public final sv f12248e;

    public m(sv svVar, boolean z10) {
        this.f12248e = svVar;
        this.d = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.d;
        sv svVar = this.f12248e;
        if (z10) {
            arrayList = svVar.E;
        } else {
            arrayList = svVar.f12447y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        p pVar = (p) f1Var.f59245a;
        pVar.f12361b = i7;
        boolean z10 = this.d;
        sv svVar = this.f12248e;
        if (z10) {
            pVar.setDialogId(((n) svVar.E.get(i7)).f12282c);
        } else {
            pVar.setDialogId(((n) svVar.f12447y.get(i7)).f12282c);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.f12248e, viewGroup.getContext());
        boolean z10 = this.d;
        pVar.O = z10;
        if (z10) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new v4.f1(pVar);
    }
}
