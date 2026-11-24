package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
public final class cwd extends fcd {
    public static final cwd c;
    public final ArrayList b;

    static {
        cwd cwdVar = new cwd(new ArrayList(10));
        c = cwdVar;
        cwdVar.a = false;
    }

    public cwd(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override
    public final void add(int i, Object obj) {
        h();
        this.b.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final omd f(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i);
            arrayList2.addAll(arrayList);
            return new cwd(arrayList2);
        }
        i98.g();
        return null;
    }

    @Override
    public final Object get(int i) {
        return this.b.get(i);
    }

    @Override
    public final Object remove(int i) {
        h();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override
    public final Object set(int i, Object obj) {
        h();
        Object obj2 = this.b.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override
    public final int size() {
        return this.b.size();
    }
}
