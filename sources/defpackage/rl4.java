package defpackage;

import java.util.ArrayList;
public final class rl4 implements ht3 {
    public final ArrayList a;
    public final f43 b;

    public rl4(f43 f43Var, ArrayList arrayList) {
        this.b = f43Var;
        this.a = arrayList;
    }

    @Override
    public final void a(zna znaVar, boolean z, float f, float f2) {
        ArrayList arrayList = znaVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.a;
        arrayList2.add(znaVar);
        if (arrayList2.size() == 2) {
            this.b.b();
        }
    }
}
