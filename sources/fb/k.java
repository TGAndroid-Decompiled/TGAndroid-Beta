package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class k implements Iterator {
    public m f9031a;
    public m f9032b = null;
    public int f9033c;
    public final n d;
    public final int e;

    public k(n nVar, int i10) {
        this.e = i10;
        this.d = nVar;
        this.f9031a = nVar.f9046f.d;
        this.f9033c = nVar.e;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.f9031a;
        n nVar = this.d;
        if (mVar != nVar.f9046f) {
            if (nVar.e == this.f9033c) {
                this.f9031a = mVar.d;
                this.f9032b = mVar;
                return mVar;
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
        m mVar = this.f9032b;
        if (mVar != null) {
            n nVar = this.d;
            nVar.c(mVar, true);
            this.f9032b = null;
            this.f9033c = nVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
