package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9031a;
    public l f9032b = null;
    public int f9033c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9031a = mVar.f9046f.d;
        this.f9033c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9031a;
        m mVar = this.d;
        if (lVar != mVar.f9046f) {
            if (mVar.e == this.f9033c) {
                this.f9031a = lVar.d;
                this.f9032b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9031a != this.d.f9046f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9039f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9032b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9032b = null;
            this.f9033c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
