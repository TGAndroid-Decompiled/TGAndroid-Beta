package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9016a;
    public l f9017b = null;
    public int f9018c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9016a = mVar.f9031f.d;
        this.f9018c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9016a;
        m mVar = this.d;
        if (lVar != mVar.f9031f) {
            if (mVar.e == this.f9018c) {
                this.f9016a = lVar.d;
                this.f9017b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9016a != this.d.f9031f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9024f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9017b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9017b = null;
            this.f9018c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
