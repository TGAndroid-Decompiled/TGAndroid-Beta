package fi;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.tv;
public final class m extends rg.b {
    public final boolean d;
    public final tv f12286e;

    public m(tv tvVar, boolean z10) {
        this.f12286e = tvVar;
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
        tv tvVar = this.f12286e;
        if (z10) {
            arrayList = tvVar.E;
        } else {
            arrayList = tvVar.f12485y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        p pVar = (p) f1Var.f59165a;
        pVar.f12399b = i7;
        boolean z10 = this.d;
        tv tvVar = this.f12286e;
        if (z10) {
            pVar.setDialogId(((n) tvVar.E.get(i7)).f12320c);
        } else {
            pVar.setDialogId(((n) tvVar.f12485y.get(i7)).f12320c);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.f12286e, viewGroup.getContext());
        boolean z10 = this.d;
        pVar.O = z10;
        if (z10) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new v4.f1(pVar);
    }
}
