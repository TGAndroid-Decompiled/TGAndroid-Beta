package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f15341c;

    public p(q qVar) {
        this.f15341c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f15341c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f15345c.f15365f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15341c.d.d.size();
    }
}
