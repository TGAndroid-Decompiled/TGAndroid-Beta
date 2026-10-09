package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16790c;

    public p(q qVar) {
        this.f16790c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16790c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16794c.f16819f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16790c.d.d.size();
    }
}
