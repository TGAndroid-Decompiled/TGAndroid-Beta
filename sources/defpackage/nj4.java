package defpackage;

import java.util.ArrayList;
public final class nj4 implements xr3 {
    public final ArrayList a;
    public final u23 b;

    public nj4(u23 u23Var, ArrayList arrayList) {
        this.b = u23Var;
        this.a = arrayList;
    }

    @Override
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        ArrayList arrayList = ylaVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.a;
        arrayList2.add(ylaVar);
        if (arrayList2.size() == 2) {
            this.b.b();
        }
    }
}
