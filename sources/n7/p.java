package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f13705c;

    public p(q qVar) {
        this.f13705c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f13705c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f13709c.f13729f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f13705c.d.d.size();
    }
}
