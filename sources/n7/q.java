package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f17310c;

    public q(r rVar) {
        this.f17310c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f17310c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f17314c.f17258f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f17310c.d.d.size();
    }
}
