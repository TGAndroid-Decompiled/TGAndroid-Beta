package e9;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class t implements Iterator {
    public final int f9003a = 0;
    public int f9004b;
    public int f9005c;
    public int d;
    public final AbstractMap f9006e;

    public t(x7.j jVar) {
        this.f9006e = jVar;
        this.f9004b = jVar.f49047e;
        this.f9005c = jVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    public abstract Object b(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f9003a) {
            case 0:
                if (this.f9005c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.f9005c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f9005c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f9003a) {
            case 0:
                v vVar = (v) this.f9006e;
                if (vVar.f9015e == this.f9004b) {
                    if (hasNext()) {
                        int i10 = this.f9005c;
                        this.d = i10;
                        Object a2 = a(i10);
                        int i11 = this.f9005c + 1;
                        if (i11 >= vVar.f9016f) {
                            i11 = -1;
                        }
                        this.f9005c = i11;
                        return a2;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.f9006e;
                if (jVar.f49047e == this.f9004b) {
                    if (hasNext()) {
                        int i12 = this.f9005c;
                        this.d = i12;
                        Object b10 = b(i12);
                        int i13 = this.f9005c + 1;
                        if (i13 >= jVar.f49048f) {
                            i13 = -1;
                        }
                        this.f9005c = i13;
                        return b10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.f9006e;
                if (dVar.f50819e == this.f9004b) {
                    if (hasNext()) {
                        int i14 = this.f9005c;
                        this.d = i14;
                        Object b11 = b(i14);
                        int i15 = this.f9005c + 1;
                        if (i15 >= dVar.f50820f) {
                            i15 = -1;
                        }
                        this.f9005c = i15;
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
        switch (this.f9003a) {
            case 0:
                v vVar = (v) this.f9006e;
                int i10 = vVar.f9015e;
                int i11 = this.f9004b;
                if (i10 == i11) {
                    int i12 = this.d;
                    if (i12 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f9004b = i11 + 32;
                        vVar.remove(vVar.i()[i12]);
                        this.f9005c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            case 1:
                x7.j jVar = (x7.j) this.f9006e;
                int i13 = jVar.f49047e;
                int i14 = this.f9004b;
                if (i13 == i14) {
                    int i15 = this.d;
                    if (i15 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f9004b = i14 + 32;
                        Object[] objArr = jVar.f49046c;
                        objArr.getClass();
                        jVar.remove(objArr[i15]);
                        this.f9005c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                z7.d dVar = (z7.d) this.f9006e;
                int i16 = dVar.f50819e;
                int i17 = this.f9004b;
                if (i16 == i17) {
                    int i18 = this.d;
                    if (i18 >= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f9004b = i17 + 32;
                        Object[] objArr2 = dVar.f50818c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i18]);
                        this.f9005c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public t(z7.d dVar) {
        this.f9006e = dVar;
        this.f9004b = dVar.f50819e;
        this.f9005c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public t(v vVar) {
        this.f9006e = vVar;
        this.f9004b = vVar.f9015e;
        this.f9005c = vVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
