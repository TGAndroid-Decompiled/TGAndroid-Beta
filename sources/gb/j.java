package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f10963a;
    public l f10964b = null;
    public int f10965c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f10963a = mVar.f10978f.d;
        this.f10965c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f10963a;
        m mVar = this.d;
        if (lVar != mVar.f10978f) {
            if (mVar.e == this.f10965c) {
                this.f10963a = lVar.d;
                this.f10964b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10963a != this.d.f10978f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f10971f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f10964b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f10964b = null;
            this.f10965c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
