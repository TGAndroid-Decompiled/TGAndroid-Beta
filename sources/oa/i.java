package oa;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i implements Iterator {

    public k f19389a;

    public k f19390b = null;

    public int f19391c;
    public final l d;

    public final int f19392e;

    public i(l lVar, int i10) {
        this.f19392e = i10;
        this.d = lVar;
        this.f19389a = lVar.f19407f.d;
        this.f19391c = lVar.f19406e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f19389a;
        l lVar = this.d;
        if (kVar == lVar.f19407f) {
            throw new NoSuchElementException();
        }
        if (lVar.f19406e != this.f19391c) {
            throw new ConcurrentModificationException();
        }
        this.f19389a = kVar.d;
        this.f19390b = kVar;
        return kVar;
    }

    @Override
    public final boolean hasNext() {
        return this.f19389a != this.d.f19407f;
    }

    @Override
    public Object next() {
        switch (this.f19392e) {
            case 1:
                return b().f19399f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        k kVar = this.f19390b;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        l lVar = this.d;
        lVar.c(kVar, true);
        this.f19390b = null;
        this.f19391c = lVar.f19406e;
    }
}
