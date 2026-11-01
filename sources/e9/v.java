package e9;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public abstract class v implements Iterator {
    public final int f6432a = 0;
    public int f6433b;
    public int f6434c;
    public int d;
    public final AbstractMap e;

    public v(x7.j jVar) {
        this.e = jVar;
        this.f6433b = jVar.e;
        this.f6434c = jVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f6432a) {
            case 0:
                if (this.f6434c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f6434c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f6434c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f6432a) {
            case 0:
                x xVar = (x) this.e;
                if (xVar.e == this.f6433b) {
                    if (hasNext()) {
                        int i10 = this.f6434c;
                        this.d = i10;
                        Object a2 = a(i10);
                        int i11 = this.f6434c + 1;
                        if (i11 >= xVar.f6447f) {
                            i11 = -1;
                        }
                        this.f6434c = i11;
                        return a2;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.e;
                if (jVar.e == this.f6433b) {
                    if (hasNext()) {
                        int i12 = this.f6434c;
                        this.d = i12;
                        Object b10 = b(i12);
                        int i13 = this.f6434c + 1;
                        if (i13 >= jVar.f53217f) {
                            i13 = -1;
                        }
                        this.f6434c = i13;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.e;
                if (dVar.e == this.f6433b) {
                    if (hasNext()) {
                        int i14 = this.f6434c;
                        this.d = i14;
                        Object b11 = b(i14);
                        int i15 = this.f6434c + 1;
                        if (i15 >= dVar.f54698f) {
                            i15 = -1;
                        }
                        this.f6434c = i15;
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
        switch (this.f6432a) {
            case 0:
                x xVar = (x) this.e;
                if (xVar.e == this.f6433b) {
                    if (this.d >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.o("no calls to next() since the last call to remove()", z10);
                    this.f6433b += 32;
                    xVar.remove(xVar.j()[this.d]);
                    this.f6434c--;
                    this.d = -1;
                    return;
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.e;
                int i10 = jVar.e;
                int i11 = this.f6433b;
                if (i10 == i11) {
                    int i12 = this.d;
                    if (i12 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f6433b = i11 + 32;
                        Object[] objArr = jVar.f53216c;
                        objArr.getClass();
                        jVar.remove(objArr[i12]);
                        this.f6434c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.e;
                int i13 = dVar.e;
                int i14 = this.f6433b;
                if (i13 == i14) {
                    int i15 = this.d;
                    if (i15 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f6433b = i14 + 32;
                        Object[] objArr2 = dVar.f54697c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i15]);
                        this.f6434c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public v(z7.d dVar) {
        this.e = dVar;
        this.f6433b = dVar.e;
        this.f6434c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public v(x xVar) {
        this.e = xVar;
        this.f6433b = xVar.e;
        this.f6434c = xVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
