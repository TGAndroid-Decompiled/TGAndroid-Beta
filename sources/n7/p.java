package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16794c;

    public p(q qVar) {
        this.f16794c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16794c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16798c.f16823f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16794c.d.d.size();
    }
}
