package fb;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class j implements Iterator {
    public l f9013a;
    public l f9014b = null;
    public int f9015c;
    public final m d;
    public final int e;

    public j(m mVar, int i10) {
        this.e = i10;
        this.d = mVar;
        this.f9013a = mVar.f9028f.d;
        this.f9015c = mVar.e;
    }

    public final Object a() {
        return b();
    }

    public final l b() {
        l lVar = this.f9013a;
        m mVar = this.d;
        if (lVar != mVar.f9028f) {
            if (mVar.e == this.f9015c) {
                this.f9013a = lVar.d;
                this.f9014b = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f9013a != this.d.f9028f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f9021f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        l lVar = this.f9014b;
        if (lVar != null) {
            m mVar = this.d;
            mVar.c(lVar, true);
            this.f9014b = null;
            this.f9015c = mVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
