package defpackage;

import java.util.Iterator;
public final class xhd extends cfd {
    public final transient hid h;
    public final transient bid n;

    public xhd(hid hidVar, bid bidVar) {
        super((byte) 1);
        this.h = hidVar;
        this.n = bidVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.h.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return this.n.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.n.listIterator(0);
    }

    @Override
    public final int size() {
        this.h.getClass();
        return 1;
    }
}
