package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f15927c;

    public q(r rVar) {
        this.f15927c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f15927c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f15931c.f15875f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15927c.d.d.size();
    }
}
