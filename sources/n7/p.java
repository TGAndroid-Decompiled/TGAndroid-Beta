package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16213c;

    public p(q qVar) {
        this.f16213c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16213c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16217c.f16237f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16213c.d.d.size();
    }
}
