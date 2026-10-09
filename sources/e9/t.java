package e9;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class t implements Iterator {
    public final int f8798a = 0;
    public int f8799b;
    public int f8800c;
    public int d;
    public final AbstractMap f8801e;

    public t(x7.j jVar) {
        this.f8801e = jVar;
        this.f8799b = jVar.f50818e;
        this.f8800c = jVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f8798a) {
            case 0:
                if (this.f8800c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f8800c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f8800c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f8798a) {
            case 0:
                v vVar = (v) this.f8801e;
                if (vVar.f8810e == this.f8799b) {
                    if (hasNext()) {
                        int i10 = this.f8800c;
                        this.d = i10;
                        Object a2 = a(i10);
                        int i11 = this.f8800c + 1;
                        if (i11 >= vVar.f8811f) {
                            i11 = -1;
                        }
                        this.f8800c = i11;
                        return a2;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.f8801e;
                if (jVar.f50818e == this.f8799b) {
                    if (hasNext()) {
                        int i12 = this.f8800c;
                        this.d = i12;
                        Object b10 = b(i12);
                        int i13 = this.f8800c + 1;
                        if (i13 >= jVar.f50819f) {
                            i13 = -1;
                        }
                        this.f8800c = i13;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.f8801e;
                if (dVar.f53624e == this.f8799b) {
                    if (hasNext()) {
                        int i14 = this.f8800c;
                        this.d = i14;
                        Object b11 = b(i14);
                        int i15 = this.f8800c + 1;
                        if (i15 >= dVar.f53625f) {
                            i15 = -1;
                        }
                        this.f8800c = i15;
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
        switch (this.f8798a) {
            case 0:
                v vVar = (v) this.f8801e;
                int i10 = vVar.f8810e;
                int i11 = this.f8799b;
                if (i10 == i11) {
                    int i12 = this.d;
                    if (i12 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f8799b = i11 + 32;
                        vVar.remove(vVar.i()[i12]);
                        this.f8800c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.f8801e;
                int i13 = jVar.f50818e;
                int i14 = this.f8799b;
                if (i13 == i14) {
                    int i15 = this.d;
                    if (i15 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f8799b = i14 + 32;
                        Object[] objArr = jVar.f50817c;
                        objArr.getClass();
                        jVar.remove(objArr[i15]);
                        this.f8800c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.f8801e;
                int i16 = dVar.f53624e;
                int i17 = this.f8799b;
                if (i16 == i17) {
                    int i18 = this.d;
                    if (i18 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f8799b = i17 + 32;
                        Object[] objArr2 = dVar.f53623c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i18]);
                        this.f8800c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public t(z7.d dVar) {
        this.f8801e = dVar;
        this.f8799b = dVar.f53624e;
        this.f8800c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public t(v vVar) {
        this.f8801e = vVar;
        this.f8799b = vVar.f8810e;
        this.f8800c = vVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
