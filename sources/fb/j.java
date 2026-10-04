package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9810a;
    public l f9811b = null;
    public int f9812c;
    public final m d;
    public final int f9813e;

    public j(m mVar, int i10) {
        this.f9813e = i10;
        this.d = mVar;
        this.f9810a = mVar.f9828f.d;
        this.f9812c = mVar.f9827e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9810a;
        m mVar = this.d;
        if (lVar != mVar.f9828f) {
            if (mVar.f9827e == this.f9812c) {
                this.f9810a = lVar.d;
                this.f9811b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9810a != this.d.f9828f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f9813e) {
            case 1:
                return b().f9820f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9811b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9811b = null;
            this.f9812c = mVar.f9827e;
            return;
        }
        throw new IllegalStateException();
    }
}
