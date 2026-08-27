package i7;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class k implements Iterator {

    public final int f10690a = 0;

    public int f10691b;

    public int f10692c;
    public int d;

    public final AbstractMap f10693e;

    public k(n nVar) {
        this.f10693e = nVar;
        this.f10691b = nVar.f10744e;
        this.f10692c = nVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f10690a) {
            case 0:
                return this.f10692c >= 0;
            case 1:
                return this.f10692c >= 0;
            default:
                return this.f10692c >= 0;
        }
    }

    @Override
    public final Object next() {
        switch (this.f10690a) {
            case 0:
                n nVar = (n) this.f10693e;
                if (nVar.f10744e != this.f10691b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f10692c;
                this.d = i10;
                Object objB = b(i10);
                int i11 = this.f10692c + 1;
                if (i11 >= nVar.f10745f) {
                    i11 = -1;
                }
                this.f10692c = i11;
                return objB;
            case 1:
                k7.d dVar = (k7.d) this.f10693e;
                if (dVar.f14532e != this.f10691b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f10692c;
                this.d = i12;
                Object objB2 = b(i12);
                int i13 = this.f10692c + 1;
                if (i13 >= dVar.f14533f) {
                    i13 = -1;
                }
                this.f10692c = i13;
                return objB2;
            default:
                p8.p pVar = (p8.p) this.f10693e;
                if (pVar.f45571e != this.f10691b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i14 = this.f10692c;
                this.d = i14;
                Object objA = a(i14);
                int i15 = this.f10692c + 1;
                if (i15 >= pVar.f45572f) {
                    i15 = -1;
                }
                this.f10692c = i15;
                return objA;
        }
    }

    @Override
    public final void remove() {
        switch (this.f10690a) {
            case 0:
                n nVar = (n) this.f10693e;
                int i10 = nVar.f10744e;
                int i11 = this.f10691b;
                if (i10 != i11) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.d;
                if (!(i12 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f10691b = i11 + 32;
                Object[] objArr = nVar.f10743c;
                objArr.getClass();
                nVar.remove(objArr[i12]);
                this.f10692c--;
                this.d = -1;
                return;
            case 1:
                k7.d dVar = (k7.d) this.f10693e;
                int i13 = dVar.f14532e;
                int i14 = this.f10691b;
                if (i13 != i14) {
                    throw new ConcurrentModificationException();
                }
                int i15 = this.d;
                if (!(i15 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f10691b = i14 + 32;
                Object[] objArr2 = dVar.f14531c;
                objArr2.getClass();
                dVar.remove(objArr2[i15]);
                this.f10692c--;
                this.d = -1;
                return;
            default:
                p8.p pVar = (p8.p) this.f10693e;
                int i16 = pVar.f45571e;
                int i17 = this.f10691b;
                if (i16 != i17) {
                    throw new ConcurrentModificationException();
                }
                int i18 = this.d;
                if (!(i18 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f10691b = i17 + 32;
                pVar.remove(pVar.i()[i18]);
                this.f10692c--;
                this.d = -1;
                return;
        }
    }

    public k(k7.d dVar) {
        this.f10693e = dVar;
        this.f10691b = dVar.f14532e;
        this.f10692c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public k(p8.p pVar) {
        this.f10693e = pVar;
        this.f10691b = pVar.f45571e;
        this.f10692c = pVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
