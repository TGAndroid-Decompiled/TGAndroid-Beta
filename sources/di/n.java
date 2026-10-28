package di;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.sw;
public final class n extends qg.b {
    public final boolean d;
    public final sw e;

    public n(sw swVar, boolean z10) {
        this.e = swVar;
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
        sw swVar = this.e;
        if (z10) {
            arrayList = swVar.f9102y;
        } else {
            arrayList = swVar.f9100x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        q qVar = (q) e1Var.f47773a;
        qVar.f8936b = i10;
        boolean z10 = this.d;
        sw swVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) swVar.f9102y.get(i10)).f8854c);
        } else {
            qVar.setDialogId(((o) swVar.f9100x.get(i10)).f8854c);
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
