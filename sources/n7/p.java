package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16820c;

    public p(q qVar) {
        this.f16820c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16820c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16824c.f16849f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16820c.d.d.size();
    }
}
