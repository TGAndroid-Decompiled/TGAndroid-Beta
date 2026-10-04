package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16815c;

    public p(q qVar) {
        this.f16815c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16815c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16819c.f16844f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16815c.d.d.size();
    }
}
