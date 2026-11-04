package ei;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.mv;
public final class n extends sg.b {
    public final boolean d;
    public final mv f10645e;

    public n(mv mvVar, boolean z10) {
        this.f10645e = mvVar;
        this.d = z10;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.d;
        mv mvVar = this.f10645e;
        if (z10) {
            arrayList = mvVar.E;
        } else {
            arrayList = mvVar.f10855y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        q qVar = (q) d1Var.f55540a;
        qVar.f10782b = i3;
        boolean z10 = this.d;
        mv mvVar = this.f10645e;
        if (z10) {
            qVar.setDialogId(((o) mvVar.E.get(i3)).f10682c);
        } else {
            qVar.setDialogId(((o) mvVar.f10855y.get(i3)).f10682c);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        q qVar = new q(this.f10645e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.O = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new u4.d1(qVar);
    }
}
