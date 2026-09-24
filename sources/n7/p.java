package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f15369c;

    public p(q qVar) {
        this.f15369c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f15369c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f15373c.f15393f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15369c.d.d.size();
    }
}
