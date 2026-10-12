package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class k implements Iterator {
    public m f9819a;
    public m f9820b = null;
    public int f9821c;
    public final n d;
    public final int f9822e;

    public k(n nVar, int i10) {
        this.f9822e = i10;
        this.d = nVar;
        this.f9819a = nVar.f9837f.d;
        this.f9821c = nVar.f9836e;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.f9819a;
        n nVar = this.d;
        if (mVar != nVar.f9837f) {
            if (nVar.f9836e == this.f9821c) {
                this.f9819a = mVar.d;
                this.f9820b = mVar;
                return mVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9819a != this.d.f9837f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f9822e) {
            case 1:
                return b().f9829f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        m mVar = this.f9820b;
        if (mVar != null) {
            n nVar = this.d;
            nVar.c(mVar, true);
            this.f9820b = null;
            this.f9821c = nVar.f9836e;
            return;
        }
        throw new IllegalStateException();
    }
}
