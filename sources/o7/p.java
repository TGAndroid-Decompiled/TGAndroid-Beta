package o7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f19246c;

    public p(q qVar) {
        this.f19246c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f19246c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f19250c.f19270f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f19246c.d.d.size();
    }
}
