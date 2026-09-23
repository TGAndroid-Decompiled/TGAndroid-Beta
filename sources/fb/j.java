package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9014a;
    public l f9015b = null;
    public int f9016c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9014a = mVar.f9029f.d;
        this.f9016c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9014a;
        m mVar = this.d;
        if (lVar != mVar.f9029f) {
            if (mVar.e == this.f9016c) {
                this.f9014a = lVar.d;
                this.f9015b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9014a != this.d.f9029f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9022f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9015b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9015b = null;
            this.f9016c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
