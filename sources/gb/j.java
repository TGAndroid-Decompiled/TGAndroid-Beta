package gb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f10981a;
    public l f10982b = null;
    public int f10983c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f10981a = mVar.f10996f.d;
        this.f10983c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f10981a;
        m mVar = this.d;
        if (lVar != mVar.f10996f) {
            if (mVar.e == this.f10983c) {
                this.f10981a = lVar.d;
                this.f10982b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f10981a != this.d.f10996f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f10989f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f10982b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f10982b = null;
            this.f10983c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
