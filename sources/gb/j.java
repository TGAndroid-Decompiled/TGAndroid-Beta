package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f10962a;
    public l f10963b = null;
    public int f10964c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f10962a = mVar.f10977f.d;
        this.f10964c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f10962a;
        m mVar = this.d;
        if (lVar != mVar.f10977f) {
            if (mVar.e == this.f10964c) {
                this.f10962a = lVar.d;
                this.f10963b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10962a != this.d.f10977f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f10970f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f10963b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f10963b = null;
            this.f10964c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
