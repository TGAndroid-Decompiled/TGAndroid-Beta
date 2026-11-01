package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f13706c;

    public p(q qVar) {
        this.f13706c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f13706c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f13710c.f13730f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f13706c.d.d.size();
    }
}
