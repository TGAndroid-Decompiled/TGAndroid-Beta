package a8;

import java.util.Iterator;
public final class u extends n {
    public final transient w f944c;
    public final transient v d;

    public u(w wVar, v vVar) {
        this.f944c = wVar;
        this.d = vVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f944c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return this.d.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f944c.getClass();
        return 1;
    }
}
