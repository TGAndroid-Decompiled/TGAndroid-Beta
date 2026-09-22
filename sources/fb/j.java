package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9028a;
    public l f9029b = null;
    public int f9030c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9028a = mVar.f9043f.d;
        this.f9030c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9028a;
        m mVar = this.d;
        if (lVar != mVar.f9043f) {
            if (mVar.e == this.f9030c) {
                this.f9028a = lVar.d;
                this.f9029b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9028a != this.d.f9043f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9036f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9029b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9029b = null;
            this.f9030c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
