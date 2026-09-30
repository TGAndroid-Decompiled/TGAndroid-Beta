package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9025a;
    public l f9026b = null;
    public int f9027c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9025a = mVar.f9040f.d;
        this.f9027c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9025a;
        m mVar = this.d;
        if (lVar != mVar.f9040f) {
            if (mVar.e == this.f9027c) {
                this.f9025a = lVar.d;
                this.f9026b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9025a != this.d.f9040f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9033f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9026b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9026b = null;
            this.f9027c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
