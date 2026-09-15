package e9;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class t implements Iterator {
    public final int f8122a = 0;
    public int f8123b;
    public int f8124c;
    public int d;
    public final AbstractMap e;

    public t(x7.j jVar) {
        this.e = jVar;
        this.f8123b = jVar.e;
        this.f8124c = jVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f8122a) {
            case 0:
                if (this.f8124c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f8124c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f8124c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f8122a) {
            case 0:
                v vVar = (v) this.e;
                if (vVar.e == this.f8123b) {
                    if (hasNext()) {
                        int i10 = this.f8124c;
                        this.d = i10;
                        Object a2 = a(i10);
                        int i11 = this.f8124c + 1;
                        if (i11 >= vVar.f8133f) {
                            i11 = -1;
                        }
                        this.f8124c = i11;
                        return a2;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.e;
                if (jVar.e == this.f8123b) {
                    if (hasNext()) {
                        int i12 = this.f8124c;
                        this.d = i12;
                        Object b10 = b(i12);
                        int i13 = this.f8124c + 1;
                        if (i13 >= jVar.f45473f) {
                            i13 = -1;
                        }
                        this.f8124c = i13;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.e;
                if (dVar.e == this.f8123b) {
                    if (hasNext()) {
                        int i14 = this.f8124c;
                        this.d = i14;
                        Object b11 = b(i14);
                        int i15 = this.f8124c + 1;
                        if (i15 >= dVar.f48209f) {
                            i15 = -1;
                        }
                        this.f8124c = i15;
                        return b11;
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
        switch (this.f8122a) {
            case 0:
                v vVar = (v) this.e;
                int i10 = vVar.e;
                int i11 = this.f8123b;
                if (i10 == i11) {
                    int i12 = this.d;
                    if (i12 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f8123b = i11 + 32;
                        vVar.remove(vVar.i()[i12]);
                        this.f8124c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.e;
                int i13 = jVar.e;
                int i14 = this.f8123b;
                if (i13 == i14) {
                    int i15 = this.d;
                    if (i15 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f8123b = i14 + 32;
                        Object[] objArr = jVar.f45472c;
                        objArr.getClass();
                        jVar.remove(objArr[i15]);
                        this.f8124c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.e;
                int i16 = dVar.e;
                int i17 = this.f8123b;
                if (i16 == i17) {
                    int i18 = this.d;
                    if (i18 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f8123b = i17 + 32;
                        Object[] objArr2 = dVar.f48208c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i18]);
                        this.f8124c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public t(z7.d dVar) {
        this.e = dVar;
        this.f8123b = dVar.e;
        this.f8124c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public t(v vVar) {
        this.e = vVar;
        this.f8123b = vVar.e;
        this.f8124c = vVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
