package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f15136c;

    public q(r rVar) {
        this.f15136c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f15136c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f15140c.f15081f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15136c.d.d.size();
    }
}
