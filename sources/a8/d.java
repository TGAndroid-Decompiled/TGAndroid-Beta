package a8;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class d implements Iterator {
    public final int f395a = 0;
    public int f396b;
    public int f397c;
    public int d;
    public final AbstractMap e;

    public d(g gVar) {
        this.e = gVar;
        this.f396b = gVar.e;
        this.f397c = gVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f395a) {
            case 0:
                if (this.f397c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f397c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f397c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f395a) {
            case 0:
                g gVar = (g) this.e;
                if (gVar.e == this.f396b) {
                    if (hasNext()) {
                        int i10 = this.f397c;
                        this.d = i10;
                        Object b10 = b(i10);
                        int i11 = this.f397c + 1;
                        if (i11 >= gVar.f472f) {
                            i11 = -1;
                        }
                        this.f397c = i11;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                f9.s sVar = (f9.s) this.e;
                if (sVar.e == this.f396b) {
                    if (hasNext()) {
                        int i12 = this.f397c;
                        this.d = i12;
                        Object a2 = a(i12);
                        int i13 = this.f397c + 1;
                        if (i13 >= sVar.f10339f) {
                            i13 = -1;
                        }
                        this.f397c = i13;
                        return a2;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                y7.i iVar = (y7.i) this.e;
                if (iVar.e == this.f396b) {
                    if (hasNext()) {
                        int i14 = this.f397c;
                        this.d = i14;
                        Object b11 = b(i14);
                        int i15 = this.f397c + 1;
                        if (i15 >= iVar.f52175f) {
                            i15 = -1;
                        }
                        this.f397c = i15;
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
        switch (this.f395a) {
            case 0:
                g gVar = (g) this.e;
                int i10 = gVar.e;
                int i11 = this.f396b;
                if (i10 == i11) {
                    int i12 = this.d;
                    if (i12 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f396b = i11 + 32;
                        Object[] objArr = gVar.f471c;
                        objArr.getClass();
                        gVar.remove(objArr[i12]);
                        this.f397c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                f9.s sVar = (f9.s) this.e;
                if (sVar.e == this.f396b) {
                    if (this.d >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yb.o("no calls to next() since the last call to remove()", z11);
                    this.f396b += 32;
                    sVar.remove(sVar.j()[this.d]);
                    this.f397c--;
                    this.d = -1;
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                y7.i iVar = (y7.i) this.e;
                int i13 = iVar.e;
                int i14 = this.f396b;
                if (i13 == i14) {
                    int i15 = this.d;
                    if (i15 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f396b = i14 + 32;
                        Object[] objArr2 = iVar.f52174c;
                        objArr2.getClass();
                        iVar.remove(objArr2[i15]);
                        this.f397c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public d(y7.i iVar) {
        this.e = iVar;
        this.f396b = iVar.e;
        this.f397c = iVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public d(f9.s sVar) {
        this.e = sVar;
        this.f396b = sVar.e;
        this.f397c = sVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
