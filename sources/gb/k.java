package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class k implements Iterator {
    public m f10055a;
    public m f10056b = null;
    public int f10057c;
    public final n d;
    public final int e;

    public k(n nVar, int i10) {
        this.e = i10;
        this.d = nVar;
        this.f10055a = nVar.f10070f.d;
        this.f10057c = nVar.e;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.f10055a;
        n nVar = this.d;
        if (mVar != nVar.f10070f) {
            if (nVar.e == this.f10057c) {
                this.f10055a = mVar.d;
                this.f10056b = mVar;
                return mVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10055a != this.d.f10070f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f10063f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        m mVar = this.f10056b;
        if (mVar != null) {
            n nVar = this.d;
            nVar.c(mVar, true);
            this.f10056b = null;
            this.f10057c = nVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
