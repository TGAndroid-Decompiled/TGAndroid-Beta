package n7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f15171c;

    public q(r rVar) {
        this.f15171c = rVar;
    }

    @Override
    public final Object get(int i10) {
        r rVar = this.f15171c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f15175c.f15116f.get(i10), rVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15171c.d.d.size();
    }
}
