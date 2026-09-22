package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f15390c;

    public p(q qVar) {
        this.f15390c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f15390c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f15394c.f15414f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15390c.d.d.size();
    }
}
