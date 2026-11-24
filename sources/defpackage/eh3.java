package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class eh3 extends ka {
    public final boolean d;
    public final aj3 e;

    public eh3(aj3 aj3Var, boolean z) {
        this.e = aj3Var;
        this.d = z;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z = this.d;
        aj3 aj3Var = this.e;
        if (z) {
            arrayList = aj3Var.E;
        } else {
            arrayList = aj3Var.y;
        }
        return arrayList.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        hh3 hh3Var = (hh3) u69Var.a;
        hh3Var.b = i;
        boolean z = this.d;
        aj3 aj3Var = this.e;
        if (z) {
            hh3Var.setDialogId(((fh3) aj3Var.E.get(i)).c);
        } else {
            hh3Var.setDialogId(((fh3) aj3Var.y.get(i)).c);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        hh3 hh3Var = new hh3(this.e, viewGroup.getContext());
        boolean z = this.d;
        hh3Var.O = z;
        if (z) {
            hh3Var.d(1.0f, 1.0f, 0.0f, false);
        }
        return new u69(hh3Var);
    }
}
