package defpackage;

import java.util.Iterator;
public final class khf extends tcf {
    public final transient aif h;
    public final transient thf n;

    public khf(aif aifVar, thf thfVar) {
        super((byte) 2);
        this.h = aifVar;
        this.n = thfVar;
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
