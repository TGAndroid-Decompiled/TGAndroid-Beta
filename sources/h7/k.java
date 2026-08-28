package h7;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class k implements Iterator {
    public final int f9981a = 0;
    public int f9982b;
    public int f9983c;
    public int d;
    public final AbstractMap f9984e;

    public k(n nVar) {
        this.f9984e = nVar;
        this.f9982b = nVar.f10035e;
        this.f9983c = nVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i9);

    public abstract Object b(int i9);

    @Override
    public final boolean hasNext() {
        switch (this.f9981a) {
            case 0:
                if (this.f9983c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f9983c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f9983c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f9981a) {
            case 0:
                n nVar = (n) this.f9984e;
                if (nVar.f10035e == this.f9982b) {
                    if (hasNext()) {
                        int i9 = this.f9983c;
                        this.d = i9;
                        Object b10 = b(i9);
                        int i10 = this.f9983c + 1;
                        if (i10 >= nVar.f10036f) {
                            i10 = -1;
                        }
                        this.f9983c = i10;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                j7.d dVar = (j7.d) this.f9984e;
                if (dVar.f13678e == this.f9982b) {
                    if (hasNext()) {
                        int i11 = this.f9983c;
                        this.d = i11;
                        Object b11 = b(i11);
                        int i12 = this.f9983c + 1;
                        if (i12 >= dVar.f13679f) {
                            i12 = -1;
                        }
                        this.f9983c = i12;
                        return b11;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                o8.p pVar = (o8.p) this.f9984e;
                if (pVar.f19072e == this.f9982b) {
                    if (hasNext()) {
                        int i13 = this.f9983c;
                        this.d = i13;
                        Object a2 = a(i13);
                        int i14 = this.f9983c + 1;
                        if (i14 >= pVar.f19073f) {
                            i14 = -1;
                        }
                        this.f9983c = i14;
                        return a2;
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
        switch (this.f9981a) {
            case 0:
                n nVar = (n) this.f9984e;
                int i9 = nVar.f10035e;
                int i10 = this.f9982b;
                if (i9 == i10) {
                    int i11 = this.d;
                    if (i11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f9982b = i10 + 32;
                        Object[] objArr = nVar.f10034c;
                        objArr.getClass();
                        nVar.remove(objArr[i11]);
                        this.f9983c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                j7.d dVar = (j7.d) this.f9984e;
                int i12 = dVar.f13678e;
                int i13 = this.f9982b;
                if (i12 == i13) {
                    int i14 = this.d;
                    if (i14 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f9982b = i13 + 32;
                        Object[] objArr2 = dVar.f13677c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i14]);
                        this.f9983c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                o8.p pVar = (o8.p) this.f9984e;
                int i15 = pVar.f19072e;
                int i16 = this.f9982b;
                if (i15 == i16) {
                    int i17 = this.d;
                    if (i17 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f9982b = i16 + 32;
                        pVar.remove(pVar.i()[i17]);
                        this.f9983c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public k(j7.d dVar) {
        this.f9984e = dVar;
        this.f9982b = dVar.f13678e;
        this.f9983c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public k(o8.p pVar) {
        this.f9984e = pVar;
        this.f9982b = pVar.f19072e;
        this.f9983c = pVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
