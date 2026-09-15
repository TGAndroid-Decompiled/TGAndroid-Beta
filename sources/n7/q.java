package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f15161c;

    public q(r rVar) {
        this.f15161c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f15161c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f15165c.f15106f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15161c.d.d.size();
    }
}
