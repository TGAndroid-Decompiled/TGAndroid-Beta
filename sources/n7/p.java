package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16838c;

    public p(q qVar) {
        this.f16838c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16838c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16842c.f16867f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16838c.d.d.size();
    }
}
