package b7;

import java.util.AbstractMap;
public final class s extends o {
    public final t f1870c;

    public s(t tVar) {
        this.f1870c = tVar;
    }

    @Override
    public final Object get(int i10) {
        t tVar = this.f1870c;
        return new AbstractMap.SimpleImmutableEntry(tVar.d.f1875c.f1812f.get(i10), tVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f1870c.d.d.size();
    }
}
