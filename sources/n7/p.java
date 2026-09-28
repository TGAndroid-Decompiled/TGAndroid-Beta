package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f15385c;

    public p(q qVar) {
        this.f15385c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f15385c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f15389c.f15409f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15385c.d.d.size();
    }
}
