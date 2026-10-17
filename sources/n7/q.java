package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f17303c;

    public q(r rVar) {
        this.f17303c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f17303c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f17307c.f17251f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f17303c.d.d.size();
    }
}
