package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class rf3 extends ka {
    public final boolean d;
    public final oh3 e;

    public rf3(oh3 oh3Var, boolean z) {
        this.e = oh3Var;
        this.d = z;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z = this.d;
        oh3 oh3Var = this.e;
        if (z) {
            arrayList = oh3Var.E;
        } else {
            arrayList = oh3Var.y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        uf3 uf3Var = (uf3) s49Var.a;
        uf3Var.b = i;
        boolean z = this.d;
        oh3 oh3Var = this.e;
        if (z) {
            uf3Var.setDialogId(((sf3) oh3Var.E.get(i)).c);
        } else {
            uf3Var.setDialogId(((sf3) oh3Var.y.get(i)).c);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        uf3 uf3Var = new uf3(this.e, viewGroup.getContext());
        boolean z = this.d;
        uf3Var.O = z;
        if (z) {
            uf3Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new s49(uf3Var);
    }
}
