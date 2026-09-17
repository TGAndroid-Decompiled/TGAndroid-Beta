package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9461a;
    public l f9462b = null;
    public int f9463c;
    public final m d;
    public final int f9464e;

    public j(m mVar, int i10) {
        this.f9464e = i10;
        this.d = mVar;
        this.f9461a = mVar.f9479f.d;
        this.f9463c = mVar.f9478e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9461a;
        m mVar = this.d;
        if (lVar != mVar.f9479f) {
            if (mVar.f9478e == this.f9463c) {
                this.f9461a = lVar.d;
                this.f9462b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9461a != this.d.f9479f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f9464e) {
            case 1:
                return b().f9471f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9462b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9462b = null;
            this.f9463c = mVar.f9478e;
            return;
        }
        throw new IllegalStateException();
    }
}
