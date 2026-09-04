package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16672c;

    public p(q qVar) {
        this.f16672c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16672c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16676c.f16701f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16672c.d.d.size();
    }
}
