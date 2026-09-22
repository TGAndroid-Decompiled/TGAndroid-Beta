package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f15159c;

    public q(r rVar) {
        this.f15159c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f15159c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f15163c.f15104f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15159c.d.d.size();
    }
}
