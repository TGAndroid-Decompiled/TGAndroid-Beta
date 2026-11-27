package defpackage;

import java.util.ArrayList;
public final class sl4 implements ps3 {
    public final ArrayList a;
    public final m33 b;

    public sl4(m33 m33Var, ArrayList arrayList) {
        this.b = m33Var;
        this.a = arrayList;
    }

    @Override
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        ArrayList arrayList = vpaVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.a;
        arrayList2.add(vpaVar);
        if (arrayList2.size() == 2) {
            this.b.b();
        }
    }
}
