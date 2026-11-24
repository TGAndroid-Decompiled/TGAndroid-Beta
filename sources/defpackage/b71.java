package defpackage;

import java.util.ArrayList;
public abstract class b71 extends a71 {
    public final ArrayList f;
    public final o71 h;

    public b71(o71 o71Var, int i) {
        super(i);
        this.h = o71Var;
        this.f = new ArrayList();
    }

    @Override
    public final boolean D(s49 s49Var) {
        return !(this instanceof j71);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        v61 v61Var = this.h.h;
        if (v61Var != null) {
            byte b = this.d;
            if (b == 1) {
                arrayList = v61Var.d;
            } else if (b == 2) {
                arrayList = v61Var.e;
            } else if (b == 3) {
                arrayList = v61Var.f;
            } else if (b == 5) {
                arrayList = v61Var.g;
            } else if (b == 4) {
                arrayList = v61Var.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ?? jaVar = new ja(2, true);
                    jaVar.d = (u61) arrayList.get(i);
                    arrayList3.add(jaVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
