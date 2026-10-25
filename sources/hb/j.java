package hb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f12741a;
    public l f12742b = null;
    public int f12743c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f12741a = mVar.f12756f.d;
        this.f12743c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f12741a;
        m mVar = this.d;
        if (lVar != mVar.f12756f) {
            if (mVar.e == this.f12743c) {
                this.f12741a = lVar.d;
                this.f12742b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f12741a != this.d.f12756f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f12749f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f12742b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f12742b = null;
            this.f12743c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
