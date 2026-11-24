package defpackage;

import java.util.AbstractMap;
public final class bld extends yjd {
    public final hld r;

    public bld(hld hldVar) {
        super((byte) 4);
        this.r = hldVar;
    }

    @Override
    public final Object get(int i) {
        pld pldVar = this.r.s;
        return new AbstractMap.SimpleImmutableEntry(pldVar.c.x.get(i), pldVar.d.get(i));
    }

    @Override
    public final int size() {
        return this.r.s.d.size();
    }
}
