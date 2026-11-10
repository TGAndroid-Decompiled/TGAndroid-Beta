package di;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.sv;
public final class m extends rg.b {
    public final boolean d;
    public final sv f9357e;

    public m(sv svVar, boolean z9) {
        this.f9357e = svVar;
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
        sv svVar = this.f9357e;
        if (z9) {
            arrayList = svVar.D;
        } else {
            arrayList = svVar.f9564y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        p pVar = (p) d1Var.f57052a;
        pVar.f9478b = i7;
        boolean z9 = this.d;
        sv svVar = this.f9357e;
        if (z9) {
            pVar.setDialogId(((n) svVar.D.get(i7)).f9371c);
        } else {
            pVar.setDialogId(((n) svVar.f9564y.get(i7)).f9371c);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.f9357e, viewGroup.getContext());
        boolean z9 = this.d;
        pVar.N = z9;
        if (z9) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new v4.d1(pVar);
    }
}
