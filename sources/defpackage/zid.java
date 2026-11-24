package defpackage;

import java.util.AbstractMap;
public final class zid extends xhd {
    public final fjd r;

    public zid(fjd fjdVar) {
        super((byte) 4);
        this.r = fjdVar;
    }

    @Override
    public final Object get(int i) {
        njd njdVar = this.r.s;
        return new AbstractMap.SimpleImmutableEntry(njdVar.c.x.get(i), njdVar.d.get(i));
    }

    @Override
    public final int size() {
        return this.r.s.d.size();
    }
}
