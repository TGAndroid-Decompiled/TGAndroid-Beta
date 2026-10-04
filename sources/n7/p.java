package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f16816c;

    public p(q qVar) {
        this.f16816c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f16816c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f16820c.f16845f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f16816c.d.d.size();
    }
}
