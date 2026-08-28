package ih;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.vw;
public final class n extends wf.b {
    public final boolean d;
    public final vw f11837e;

    public n(vw vwVar, boolean z10) {
        this.f11837e = vwVar;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z10 = this.d;
        vw vwVar = this.f11837e;
        if (z10) {
            arrayList = vwVar.f12051y;
        } else {
            arrayList = vwVar.f12049x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        q qVar = (q) q1Var.f5501a;
        qVar.f11980b = i9;
        boolean z10 = this.d;
        vw vwVar = this.f11837e;
        if (z10) {
            qVar.setDialogId(((o) vwVar.f12051y.get(i9)).f11875c);
        } else {
            qVar.setDialogId(((o) vwVar.f12049x.get(i9)).f11875c);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        q qVar = new q(this.f11837e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.J = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new f2.q1(qVar);
    }
}
