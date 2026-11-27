package defpackage;

import java.util.ArrayList;
public abstract class j71 extends i71 {
    public final ArrayList f;
    public final w71 h;

    public j71(w71 w71Var, int i) {
        super(i);
        this.h = w71Var;
        this.f = new ArrayList();
    }

    @Override
    public final boolean D(f89 f89Var) {
        return !(this instanceof r71);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        d71 d71Var = this.h.h;
        if (d71Var != null) {
            byte b = this.d;
            if (b == 1) {
                arrayList = d71Var.d;
            } else if (b == 2) {
                arrayList = d71Var.e;
            } else if (b == 3) {
                arrayList = d71Var.f;
            } else if (b == 5) {
                arrayList = d71Var.g;
            } else if (b == 4) {
                arrayList = d71Var.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ?? kaVar = new ka(2, true);
                    kaVar.d = (c71) arrayList.get(i);
                    arrayList3.add(kaVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
