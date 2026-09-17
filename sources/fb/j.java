package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9433a;
    public l f9434b = null;
    public int f9435c;
    public final m d;
    public final int f9436e;

    public j(m mVar, int i10) {
        this.f9436e = i10;
        this.d = mVar;
        this.f9433a = mVar.f9451f.d;
        this.f9435c = mVar.f9450e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9433a;
        m mVar = this.d;
        if (lVar != mVar.f9451f) {
            if (mVar.f9450e == this.f9435c) {
                this.f9433a = lVar.d;
                this.f9434b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9433a != this.d.f9451f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f9436e) {
            case 1:
                return b().f9443f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9434b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9434b = null;
            this.f9435c = mVar.f9450e;
            return;
        }
        throw new IllegalStateException();
    }
}
