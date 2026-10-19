package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f10964a;
    public l f10965b = null;
    public int f10966c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f10964a = mVar.f10979f.d;
        this.f10966c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f10964a;
        m mVar = this.d;
        if (lVar != mVar.f10979f) {
            if (mVar.e == this.f10966c) {
                this.f10964a = lVar.d;
                this.f10965b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10964a != this.d.f10979f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f10972f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f10965b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f10965b = null;
            this.f10966c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
