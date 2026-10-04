package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9809a;
    public l f9810b = null;
    public int f9811c;
    public final m d;
    public final int f9812e;

    public j(m mVar, int i10) {
        this.f9812e = i10;
        this.d = mVar;
        this.f9809a = mVar.f9827f.d;
        this.f9811c = mVar.f9826e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9809a;
        m mVar = this.d;
        if (lVar != mVar.f9827f) {
            if (mVar.f9826e == this.f9811c) {
                this.f9809a = lVar.d;
                this.f9810b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9809a != this.d.f9827f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f9812e) {
            case 1:
                return b().f9819f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9810b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9810b = null;
            this.f9811c = mVar.f9826e;
            return;
        }
        throw new IllegalStateException();
    }
}
