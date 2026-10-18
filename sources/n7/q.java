package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f17306c;

    public q(r rVar) {
        this.f17306c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f17306c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f17310c.f17254f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f17306c.d.d.size();
    }
}
