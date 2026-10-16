package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class l implements Iterator {
    public n f10059a;
    public n f10060b = null;
    public int f10061c;
    public final o d;
    public final int e;

    public l(o oVar, int i10) {
        this.e = i10;
        this.d = oVar;
        this.f10059a = oVar.f10074f.d;
        this.f10061c = oVar.e;
    }

    public final Object a() {
        return b();
    }

    public final n b() {
        n nVar = this.f10059a;
        o oVar = this.d;
        if (nVar != oVar.f10074f) {
            if (oVar.e == this.f10061c) {
                this.f10059a = nVar.d;
                this.f10060b = nVar;
                return nVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10059a != this.d.f10074f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f10067f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        n nVar = this.f10060b;
        if (nVar != null) {
            o oVar = this.d;
            oVar.c(nVar, true);
            this.f10060b = null;
            this.f10061c = oVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
