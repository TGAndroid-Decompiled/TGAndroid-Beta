package b7;

import java.util.AbstractMap;
public final class s extends o {
    public final t f1727c;

    public s(t tVar) {
        this.f1727c = tVar;
    }

    @Override
    public final Object get(int i10) {
        t tVar = this.f1727c;
        return new AbstractMap.SimpleImmutableEntry(tVar.d.f1732c.f1673f.get(i10), tVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f1727c.d.d.size();
    }
}
