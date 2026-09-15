package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9026a;
    public l f9027b = null;
    public int f9028c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9026a = mVar.f9041f.d;
        this.f9028c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9026a;
        m mVar = this.d;
        if (lVar != mVar.f9041f) {
            if (mVar.e == this.f9028c) {
                this.f9026a = lVar.d;
                this.f9027b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9026a != this.d.f9041f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9034f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9027b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9027b = null;
            this.f9028c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
