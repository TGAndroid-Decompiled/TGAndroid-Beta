package a8;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class l implements Iterator {
    public final int f516a = 0;
    public int f517b;
    public int f518c;
    public int d;
    public final AbstractMap f519e;

    public l(o oVar) {
        this.f519e = oVar;
        this.f517b = oVar.f551e;
        this.f518c = oVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i7);

    public abstract Object b(int i7);

    @Override
    public final boolean hasNext() {
        switch (this.f516a) {
            case 0:
                if (this.f518c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f518c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f518c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f516a) {
            case 0:
                o oVar = (o) this.f519e;
                if (oVar.f551e == this.f517b) {
                    if (hasNext()) {
                        int i7 = this.f518c;
                        this.d = i7;
                        Object b10 = b(i7);
                        int i10 = this.f518c + 1;
                        if (i10 >= oVar.f552f) {
                            i10 = -1;
                        }
                        this.f518c = i10;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                c8.d dVar = (c8.d) this.f519e;
                if (dVar.f5417e == this.f517b) {
                    if (hasNext()) {
                        int i11 = this.f518c;
                        this.d = i11;
                        Object b11 = b(i11);
                        int i12 = this.f518c + 1;
                        if (i12 >= dVar.f5418f) {
                            i12 = -1;
                        }
                        this.f518c = i12;
                        return b11;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                h9.s sVar = (h9.s) this.f519e;
                if (sVar.f14386e == this.f517b) {
                    if (hasNext()) {
                        int i13 = this.f518c;
                        this.d = i13;
                        Object a10 = a(i13);
                        int i14 = this.f518c + 1;
                        if (i14 >= sVar.f14387f) {
                            i14 = -1;
                        }
                        this.f518c = i14;
                        return a10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void remove() {
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f516a) {
            case 0:
                o oVar = (o) this.f519e;
                int i7 = oVar.f551e;
                int i10 = this.f517b;
                if (i7 == i10) {
                    int i11 = this.d;
                    if (i11 >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        this.f517b = i10 + 32;
                        Object[] objArr = oVar.f550c;
                        objArr.getClass();
                        oVar.remove(objArr[i11]);
                        this.f518c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                c8.d dVar = (c8.d) this.f519e;
                int i12 = dVar.f5417e;
                int i13 = this.f517b;
                if (i12 == i13) {
                    int i14 = this.d;
                    if (i14 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f517b = i13 + 32;
                        Object[] objArr2 = dVar.f5416c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i14]);
                        this.f518c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                h9.s sVar = (h9.s) this.f519e;
                if (sVar.f14386e == this.f517b) {
                    if (this.d >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ia.o("no calls to next() since the last call to remove()", z11);
                    this.f517b += 32;
                    sVar.remove(sVar.k()[this.d]);
                    this.f518c--;
                    this.d = -1;
                    return;
                }
                throw new ConcurrentModificationException();
        }
    }

    public l(c8.d dVar) {
        this.f519e = dVar;
        this.f517b = dVar.f5417e;
        this.f518c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public l(h9.s sVar) {
        this.f519e = sVar;
        this.f517b = sVar.f14386e;
        this.f518c = sVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
