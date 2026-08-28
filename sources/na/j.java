package na;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f18540a;
    public l f18541b = null;
    public int f18542c;
    public final m d;
    public final int f18543e;

    public j(m mVar, int i9) {
        this.f18543e = i9;
        this.d = mVar;
        this.f18540a = mVar.f18558f.d;
        this.f18542c = mVar.f18557e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f18540a;
        m mVar = this.d;
        if (lVar != mVar.f18558f) {
            if (mVar.f18557e == this.f18542c) {
                this.f18540a = lVar.d;
                this.f18541b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f18540a != this.d.f18558f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f18543e) {
            case 1:
                return b().f18550f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f18541b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f18541b = null;
            this.f18542c = mVar.f18557e;
            return;
        }
        throw new IllegalStateException();
    }
}
