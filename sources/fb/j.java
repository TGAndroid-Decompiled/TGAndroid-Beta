package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9030a;
    public l f9031b = null;
    public int f9032c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9030a = mVar.f9045f.d;
        this.f9032c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9030a;
        m mVar = this.d;
        if (lVar != mVar.f9045f) {
            if (mVar.e == this.f9032c) {
                this.f9030a = lVar.d;
                this.f9031b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9030a != this.d.f9045f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9038f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9031b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9031b = null;
            this.f9032c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
