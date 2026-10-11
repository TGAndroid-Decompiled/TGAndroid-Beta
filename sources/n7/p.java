package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16874c;

    public p(q qVar) {
        this.f16874c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16874c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16878c.f16903f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16874c.d.d.size();
    }
}
