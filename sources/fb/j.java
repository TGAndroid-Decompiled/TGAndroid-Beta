package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f7913a;
    public l f7914b = null;
    public int f7915c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f7913a = mVar.f7928f.d;
        this.f7915c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f7913a;
        m mVar = this.d;
        if (lVar != mVar.f7928f) {
            if (mVar.e == this.f7915c) {
                this.f7913a = lVar.d;
                this.f7914b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f7913a != this.d.f7928f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f7921f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f7914b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f7914b = null;
            this.f7915c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
