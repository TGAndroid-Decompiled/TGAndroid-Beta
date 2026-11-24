package defpackage;

import java.util.ArrayList;
public abstract class i81 extends h81 {
    public final ArrayList f;
    public final w81 h;

    public i81(w81 w81Var, int i) {
        super(i);
        this.h = w81Var;
        this.f = new ArrayList();
    }

    @Override
    public final boolean D(u69 u69Var) {
        return !(this instanceof r81);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        c81 c81Var = this.h.h;
        if (c81Var != null) {
            byte b = this.d;
            if (b == 1) {
                arrayList = c81Var.d;
            } else if (b == 2) {
                arrayList = c81Var.e;
            } else if (b == 3) {
                arrayList = c81Var.f;
            } else if (b == 5) {
                arrayList = c81Var.g;
            } else if (b == 4) {
                arrayList = c81Var.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ?? jaVar = new ja(2, true);
                    jaVar.d = (b81) arrayList.get(i);
                    arrayList3.add(jaVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
