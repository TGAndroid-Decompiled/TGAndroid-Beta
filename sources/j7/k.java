package j7;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class k implements Iterator {
    public final int f11062a = 0;
    public int f11063b;
    public int f11064c;
    public int d;
    public final AbstractMap f11065e;

    public k(n nVar) {
        this.f11065e = nVar;
        this.f11063b = nVar.f11115e;
        this.f11064c = nVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f11062a) {
            case 0:
                if (this.f11064c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f11064c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f11064c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f11062a) {
            case 0:
                n nVar = (n) this.f11065e;
                if (nVar.f11115e == this.f11063b) {
                    if (hasNext()) {
                        int i10 = this.f11064c;
                        this.d = i10;
                        Object b10 = b(i10);
                        int i11 = this.f11064c + 1;
                        if (i11 >= nVar.f11116f) {
                            i11 = -1;
                        }
                        this.f11064c = i11;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                l7.d dVar = (l7.d) this.f11065e;
                if (dVar.f14537e == this.f11063b) {
                    if (hasNext()) {
                        int i12 = this.f11064c;
                        this.d = i12;
                        Object b11 = b(i12);
                        int i13 = this.f11064c + 1;
                        if (i13 >= dVar.f14538f) {
                            i13 = -1;
                        }
                        this.f11064c = i13;
                        return b11;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                q8.p pVar = (q8.p) this.f11065e;
                if (pVar.f46478e == this.f11063b) {
                    if (hasNext()) {
                        int i14 = this.f11064c;
                        this.d = i14;
                        Object a2 = a(i14);
                        int i15 = this.f11064c + 1;
                        if (i15 >= pVar.f46479f) {
                            i15 = -1;
                        }
                        this.f11064c = i15;
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
        switch (this.f11062a) {
            case 0:
                n nVar = (n) this.f11065e;
                int i10 = nVar.f11115e;
                int i11 = this.f11063b;
                if (i10 == i11) {
                    int i12 = this.d;
                    if (i12 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f11063b = i11 + 32;
                        Object[] objArr = nVar.f11114c;
                        objArr.getClass();
                        nVar.remove(objArr[i12]);
                        this.f11064c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                l7.d dVar = (l7.d) this.f11065e;
                int i13 = dVar.f14537e;
                int i14 = this.f11063b;
                if (i13 == i14) {
                    int i15 = this.d;
                    if (i15 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f11063b = i14 + 32;
                        Object[] objArr2 = dVar.f14536c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i15]);
                        this.f11064c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                q8.p pVar = (q8.p) this.f11065e;
                int i16 = pVar.f46478e;
                int i17 = this.f11063b;
                if (i16 == i17) {
                    int i18 = this.d;
                    if (i18 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f11063b = i17 + 32;
                        pVar.remove(pVar.i()[i18]);
                        this.f11064c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public k(l7.d dVar) {
        this.f11065e = dVar;
        this.f11063b = dVar.f14537e;
        this.f11064c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public k(q8.p pVar) {
        this.f11065e = pVar;
        this.f11063b = pVar.f46478e;
        this.f11064c = pVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
