package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16699c;

    public p(q qVar) {
        this.f16699c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16699c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16703c.f16728f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16699c.d.d.size();
    }
}
