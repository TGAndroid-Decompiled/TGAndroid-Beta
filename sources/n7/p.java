package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f17306c;

    public p(q qVar) {
        this.f17306c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f17306c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f17310c.f17330f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f17306c.d.d.size();
    }
}
