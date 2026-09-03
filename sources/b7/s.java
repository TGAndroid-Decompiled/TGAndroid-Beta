package b7;

import java.util.AbstractMap;
public final class s extends o {
    public final t f1738c;

    public s(t tVar) {
        this.f1738c = tVar;
    }

    @Override
    public final Object get(int i10) {
        t tVar = this.f1738c;
        return new AbstractMap.SimpleImmutableEntry(tVar.d.f1743c.f1684f.get(i10), tVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f1738c.d.d.size();
    }
}
