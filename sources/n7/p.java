package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f17304c;

    public p(q qVar) {
        this.f17304c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f17304c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f17308c.f17328f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f17304c.d.d.size();
    }
}
