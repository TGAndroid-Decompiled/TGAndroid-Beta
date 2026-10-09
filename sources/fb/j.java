package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9821a;
    public l f9822b = null;
    public int f9823c;
    public final m d;
    public final int f9824e;

    public j(m mVar, int i10) {
        this.f9824e = i10;
        this.d = mVar;
        this.f9821a = mVar.f9839f.d;
        this.f9823c = mVar.f9838e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9821a;
        m mVar = this.d;
        if (lVar != mVar.f9839f) {
            if (mVar.f9838e == this.f9823c) {
                this.f9821a = lVar.d;
                this.f9822b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9821a != this.d.f9839f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f9824e) {
            case 1:
                return b().f9831f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9822b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9822b = null;
            this.f9823c = mVar.f9838e;
            return;
        }
        throw new IllegalStateException();
    }
}
