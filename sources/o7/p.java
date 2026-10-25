package o7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f19247c;

    public p(q qVar) {
        this.f19247c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f19247c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f19251c.f19271f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f19247c.d.d.size();
    }
}
