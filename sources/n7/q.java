package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f13991c;

    public q(r rVar) {
        this.f13991c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f13991c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f13995c.f13936f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f13991c.d.d.size();
    }
}
