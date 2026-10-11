package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9820a;
    public l f9821b = null;
    public int f9822c;
    public final m d;
    public final int f9823e;

    public j(m mVar, int i10) {
        this.f9823e = i10;
        this.d = mVar;
        this.f9820a = mVar.f9838f.d;
        this.f9822c = mVar.f9837e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9820a;
        m mVar = this.d;
        if (lVar != mVar.f9838f) {
            if (mVar.f9837e == this.f9822c) {
                this.f9820a = lVar.d;
                this.f9821b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9820a != this.d.f9838f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f9823e) {
            case 1:
                return b().f9830f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9821b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9821b = null;
            this.f9822c = mVar.f9837e;
            return;
        }
        throw new IllegalStateException();
    }
}
