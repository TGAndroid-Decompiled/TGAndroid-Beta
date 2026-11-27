package defpackage;

import java.util.AbstractMap;
public final class qnd extends omd {
    public final wnd r;

    public qnd(wnd wndVar) {
        super((byte) 4);
        this.r = wndVar;
    }

    @Override
    public final Object get(int i) {
        eod eodVar = this.r.s;
        return new AbstractMap.SimpleImmutableEntry(eodVar.c.x.get(i), eodVar.d.get(i));
    }

    @Override
    public final int size() {
        return this.r.s.d.size();
    }
}
