package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f10965a;
    public l f10966b = null;
    public int f10967c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f10965a = mVar.f10980f.d;
        this.f10967c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f10965a;
        m mVar = this.d;
        if (lVar != mVar.f10980f) {
            if (mVar.e == this.f10967c) {
                this.f10965a = lVar.d;
                this.f10966b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10965a != this.d.f10980f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f10973f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f10966b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f10966b = null;
            this.f10967c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
