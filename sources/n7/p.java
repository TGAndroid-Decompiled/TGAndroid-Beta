package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f15384c;

    public p(q qVar) {
        this.f15384c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f15384c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f15388c.f15408f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15384c.d.d.size();
    }
}
