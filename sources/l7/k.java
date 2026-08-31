package l7;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class k implements Iterator {
    public final int f11903a = 0;
    public int f11904b;
    public int f11905c;
    public int d;
    public final AbstractMap f11906e;

    public k(n nVar) {
        this.f11906e = nVar;
        this.f11904b = nVar.f11956e;
        this.f11905c = nVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i10);

    @Override
    public final boolean hasNext() {
        switch (this.f11903a) {
            case 0:
                if (this.f11905c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f11905c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f11903a) {
            case 0:
                n nVar = (n) this.f11906e;
                if (nVar.f11956e == this.f11904b) {
                    if (hasNext()) {
                        int i10 = this.f11905c;
                        this.d = i10;
                        Object a2 = a(i10);
                        int i11 = this.f11905c + 1;
                        if (i11 >= nVar.f11957f) {
                            i11 = -1;
                        }
                        this.f11905c = i11;
                        return a2;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
            default:
                n7.d dVar = (n7.d) this.f11906e;
                if (dVar.f15304e == this.f11904b) {
                    if (hasNext()) {
                        int i12 = this.f11905c;
                        this.d = i12;
                        Object a10 = a(i12);
                        int i13 = this.f11905c + 1;
                        if (i13 >= dVar.f15305f) {
                            i13 = -1;
                        }
                        this.f11905c = i13;
                        return a10;
                    }
                    throw new NoSuchElementException();
                }
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void remove() {
        boolean z4;
        boolean z10;
        switch (this.f11903a) {
            case 0:
                n nVar = (n) this.f11906e;
                int i10 = nVar.f11956e;
                int i11 = this.f11904b;
                if (i10 == i11) {
                    int i12 = this.d;
                    if (i12 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        this.f11904b = i11 + 32;
                        Object[] objArr = nVar.f11955c;
                        objArr.getClass();
                        nVar.remove(objArr[i12]);
                        this.f11905c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
            default:
                n7.d dVar = (n7.d) this.f11906e;
                int i13 = dVar.f15304e;
                int i14 = this.f11904b;
                if (i13 == i14) {
                    int i15 = this.d;
                    if (i15 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f11904b = i14 + 32;
                        Object[] objArr2 = dVar.f15303c;
                        objArr2.getClass();
                        dVar.remove(objArr2[i15]);
                        this.f11905c--;
                        this.d = -1;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                throw new ConcurrentModificationException();
        }
    }

    public k(n7.d dVar) {
        this.f11906e = dVar;
        this.f11904b = dVar.f15304e;
        this.f11905c = dVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
