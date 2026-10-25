package di;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.qw;
public final class n extends qg.b {
    public final boolean d;
    public final qw e;

    public n(qw qwVar, boolean z10) {
        this.e = qwVar;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        qw qwVar = this.e;
        if (z10) {
            arrayList = qwVar.f9103y;
        } else {
            arrayList = qwVar.f9101x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        q qVar = (q) e1Var.f47735a;
        qVar.f8937b = i10;
        boolean z10 = this.d;
        qw qwVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) qwVar.f9103y.get(i10)).f8855c);
        } else {
            qVar.setDialogId(((o) qwVar.f9101x.get(i10)).f8855c);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        q qVar = new q(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.N = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s4.e1(qVar);
    }
}
