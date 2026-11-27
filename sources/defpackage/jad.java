package defpackage;

import java.util.Iterator;
public final class jad extends zlf {
    public final transient vad h;
    public final transient lad n;

    public jad(vad vadVar, lad ladVar) {
        super((byte) 3);
        this.h = vadVar;
        this.n = ladVar;
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
