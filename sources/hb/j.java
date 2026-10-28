package hb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f12740a;
    public l f12741b = null;
    public int f12742c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f12740a = mVar.f12755f.d;
        this.f12742c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f12740a;
        m mVar = this.d;
        if (lVar != mVar.f12755f) {
            if (mVar.e == this.f12742c) {
                this.f12740a = lVar.d;
                this.f12741b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f12740a != this.d.f12755f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f12748f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f12741b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f12741b = null;
            this.f12742c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
