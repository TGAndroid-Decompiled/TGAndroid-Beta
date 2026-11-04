package ed;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class a implements Iterator {
    public final int f9943a;
    public int f9944b;
    public final Object f9945c;

    public a(Object[] array) {
        this.f9943a = 1;
        kotlin.jvm.internal.j.e(array, "array");
        this.f9945c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f9943a) {
            case 0:
                if (this.f9944b < ((d) this.f9945c).h()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f9944b < ((Object[]) this.f9945c).length) {
                    return true;
                }
                return false;
            default:
                if (this.f9944b < ((zc.b) this.f9945c).f60377a) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f9943a) {
            case 0:
                if (hasNext()) {
                    int i3 = this.f9944b;
                    this.f9944b = i3 + 1;
                    return ((d) this.f9945c).get(i3);
                }
                throw new NoSuchElementException();
            case 1:
                try {
                    int i10 = this.f9944b;
                    this.f9944b = i10 + 1;
                    return ((Object[]) this.f9945c)[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f9944b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            default:
                zc.b bVar = (zc.b) this.f9945c;
                String[] strArr = bVar.f60379c;
                int i11 = this.f9944b;
                String str = strArr[i11];
                String str2 = bVar.f60378b[i11];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f60374a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f60375b = str;
                        obj.f60376c = bVar;
                        this.f9944b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
        }
    }

    @Override
    public final void remove() {
        switch (this.f9943a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                zc.b bVar = (zc.b) this.f9945c;
                int i3 = this.f9944b;
                int i10 = i3 - 1;
                this.f9944b = i10;
                int i11 = bVar.f60377a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = bVar.f60378b;
                        System.arraycopy(strArr, i3, strArr, i10, i12);
                        String[] strArr2 = bVar.f60379c;
                        System.arraycopy(strArr2, i3, strArr2, i10, i12);
                    }
                    int i13 = bVar.f60377a - 1;
                    bVar.f60377a = i13;
                    bVar.f60378b[i13] = null;
                    bVar.f60379c[i13] = null;
                    return;
                }
                throw new IllegalArgumentException("Must be false");
        }
    }

    public a(d dVar) {
        this.f9943a = 0;
        this.f9945c = dVar;
    }

    public a(zc.b bVar) {
        this.f9943a = 2;
        this.f9945c = bVar;
        this.f9944b = 0;
    }
}
