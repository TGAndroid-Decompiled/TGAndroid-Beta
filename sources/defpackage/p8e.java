package defpackage;

import java.util.Iterator;
public final class p8e extends t6e {
    public final transient b9e s;
    public final transient v8e w;

    public p8e(b9e b9eVar, v8e v8eVar) {
        super((byte) 5);
        this.s = b9eVar;
        this.w = v8eVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.s.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override
    public final int p(Object[] objArr) {
        return this.w.p(objArr);
    }

    @Override
    public final int size() {
        return this.s.h;
    }
}
