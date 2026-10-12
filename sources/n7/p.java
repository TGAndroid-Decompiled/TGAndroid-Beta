package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16542c;

    public p(q qVar) {
        this.f16542c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16542c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16546c.f16571f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16542c.d.d.size();
    }
}
