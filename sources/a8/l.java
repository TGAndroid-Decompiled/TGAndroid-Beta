package a8;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class l implements Iterator {
    public final int f518a = 0;
    public int f519b;
    public int f520c;
    public int d;
    public final AbstractMap f521e;

    public l(o oVar) {
        this.f521e = oVar;
        this.f519b = oVar.f556e;
        this.f520c = oVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i7);

    public abstract Object b(int i7);

    @Override
    public final boolean hasNext() {
        switch (this.f518a) {
            case 0:
                if (this.f520c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f520c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f520c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f518a) {
            case 0:
                o oVar = (o) this.f521e;
                if (oVar.f556e == this.f519b) {
                    if (hasNext()) {
                        int i7 = this.f520c;
                        this.d = i7;
                        Object b10 = b(i7);
                        int i10 = this.f520c + 1;
                        if (i10 >= oVar.f557f) {
                            i10 = -1;
                        }
                        this.f520c = i10;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                c8.d dVar = (c8.d) this.f521e;
                if (dVar.f4520e == this.f519b) {
                    if (hasNext()) {
                        int i11 = this.f520c;
                        this.d = i11;
                        Object b11 = b(i11);
                        int i12 = this.f520c + 1;
                        if (i12 >= dVar.f4521f) {
                            i12 = -1;
                        }
                        this.f520c = i12;
                        return b11;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                h9.s sVar = (h9.s) this.f521e;
                if (sVar.f14055e == this.f519b) {
                    if (hasNext()) {
                        int i13 = this.f520c;
                        this.d = i13;
                        Object a10 = a(i13);
                        int i14 = this.f520c + 1;
                        if (i14 >= sVar.f14056f) {
                            i14 = -1;
                        }
                        this.f520c = i14;
                        return a10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void remove() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f518a) {
            case 0:
                o oVar = (o) this.f521e;
                int i7 = oVar.f556e;
                int i10 = this.f519b;
                if (i7 == i10) {
                    int i11 = this.d;
                    if (i11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f519b = i10 + 32;
                        Object[] objArr = oVar.f555c;
                        objArr.getClass();
                        oVar.remove(objArr[i11]);
                        this.f520c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                c8.d dVar = (c8.d) this.f521e;
                int i12 = dVar.f4520e;
                int i13 = this.f519b;
                if (i12 == i13) {
                    int i14 = this.d;
                    if (i14 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f519b = i13 + 32;
                        Object[] objArr2 = dVar.f4519c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i14]);
                        this.f520c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                h9.s sVar = (h9.s) this.f521e;
                if (sVar.f14055e == this.f519b) {
                    if (this.d >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ma.o("no calls to next() since the last call to remove()", z12);
                    this.f519b += 32;
                    sVar.remove(sVar.k()[this.d]);
                    this.f520c--;
                    this.d = -1;
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    public l(c8.d dVar) {
        this.f521e = dVar;
        this.f519b = dVar.f4520e;
        this.f520c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public l(h9.s sVar) {
        this.f521e = sVar;
        this.f519b = sVar.f14055e;
        this.f520c = sVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
