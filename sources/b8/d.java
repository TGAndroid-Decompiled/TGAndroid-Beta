package b8;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class d implements Iterator {
    public final int f2528a = 0;
    public int f2529b;
    public int f2530c;
    public int d;
    public final AbstractMap f2531e;

    public d(g gVar) {
        this.f2531e = gVar;
        this.f2529b = gVar.f2615e;
        this.f2530c = gVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i3);

    public abstract Object b(int i3);

    @Override
    public final boolean hasNext() {
        switch (this.f2528a) {
            case 0:
                if (this.f2530c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f2530c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f2530c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f2528a) {
            case 0:
                g gVar = (g) this.f2531e;
                if (gVar.f2615e == this.f2529b) {
                    if (hasNext()) {
                        int i3 = this.f2530c;
                        this.d = i3;
                        Object b10 = b(i3);
                        int i10 = this.f2530c + 1;
                        if (i10 >= gVar.f2616f) {
                            i10 = -1;
                        }
                        this.f2530c = i10;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                g9.s sVar = (g9.s) this.f2531e;
                if (sVar.f12142e == this.f2529b) {
                    if (hasNext()) {
                        int i11 = this.f2530c;
                        this.d = i11;
                        Object a10 = a(i11);
                        int i12 = this.f2530c + 1;
                        if (i12 >= sVar.f12143f) {
                            i12 = -1;
                        }
                        this.f2530c = i12;
                        return a10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                z7.i iVar = (z7.i) this.f2531e;
                if (iVar.f59908e == this.f2529b) {
                    if (hasNext()) {
                        int i13 = this.f2530c;
                        this.d = i13;
                        Object b11 = b(i13);
                        int i14 = this.f2530c + 1;
                        if (i14 >= iVar.f59909f) {
                            i14 = -1;
                        }
                        this.f2530c = i14;
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
        switch (this.f2528a) {
            case 0:
                g gVar = (g) this.f2531e;
                int i3 = gVar.f2615e;
                int i10 = this.f2529b;
                if (i3 == i10) {
                    int i11 = this.d;
                    if (i11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f2529b = i10 + 32;
                        Object[] objArr = gVar.f2614c;
                        objArr.getClass();
                        gVar.remove(objArr[i11]);
                        this.f2530c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                g9.s sVar = (g9.s) this.f2531e;
                if (sVar.f12142e == this.f2529b) {
                    if (this.d >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zb.o("no calls to next() since the last call to remove()", z11);
                    this.f2529b += 32;
                    sVar.remove(sVar.k()[this.d]);
                    this.f2530c--;
                    this.d = -1;
                    return;
                }
                throw new ConcurrentModificationException();
            default:
                z7.i iVar = (z7.i) this.f2531e;
                int i12 = iVar.f59908e;
                int i13 = this.f2529b;
                if (i12 == i13) {
                    int i14 = this.d;
                    if (i14 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f2529b = i13 + 32;
                        Object[] objArr2 = iVar.f59907c;
                        objArr2.getClass();
                        iVar.remove(objArr2[i14]);
                        this.f2530c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public d(z7.i iVar) {
        this.f2531e = iVar;
        this.f2529b = iVar.f59908e;
        this.f2530c = iVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public d(g9.s sVar) {
        this.f2531e = sVar;
        this.f2529b = sVar.f12142e;
        this.f2530c = sVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
