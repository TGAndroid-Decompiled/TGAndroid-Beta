package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16541c;

    public p(q qVar) {
        this.f16541c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16541c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16545c.f16570f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16541c.d.d.size();
    }
}
