package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public class b implements Iterator {
    public final int f6080a;
    public int f6081b;
    public final Object f6082c;

    public b(Object[] array) {
        this.f6080a = 2;
        j.e(array, "array");
        this.f6082c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f6080a) {
            case 0:
                if (this.f6081b < ((c) this.f6082c).f6083a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f6081b < ((hd.c) this.f6082c).f()) {
                    return true;
                }
                return false;
            default:
                if (this.f6081b < ((Object[]) this.f6082c).length) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f6080a) {
            case 0:
                c cVar = (c) this.f6082c;
                String[] strArr = cVar.f6085c;
                int i7 = this.f6081b;
                String str = strArr[i7];
                String str2 = cVar.f6084b[i7];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f6077a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f6078b = str;
                        obj.f6079c = cVar;
                        this.f6081b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i10 = this.f6081b;
                    this.f6081b = i10 + 1;
                    return ((hd.c) this.f6082c).get(i10);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i11 = this.f6081b;
                    this.f6081b = i11 + 1;
                    return ((Object[]) this.f6082c)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f6081b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override
    public final void remove() {
        switch (this.f6080a) {
            case 0:
                c cVar = (c) this.f6082c;
                int i7 = this.f6081b;
                int i10 = i7 - 1;
                this.f6081b = i10;
                int i11 = cVar.f6083a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f6084b;
                        System.arraycopy(strArr, i7, strArr, i10, i12);
                        String[] strArr2 = cVar.f6085c;
                        System.arraycopy(strArr2, i7, strArr2, i10, i12);
                    }
                    int i13 = cVar.f6083a - 1;
                    cVar.f6083a = i13;
                    cVar.f6084b[i13] = null;
                    cVar.f6085c[i13] = null;
                    return;
                }
                throw new IllegalArgumentException("Must be false");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(hd.c cVar) {
        this.f6080a = 1;
        this.f6082c = cVar;
    }

    public b(c cVar) {
        this.f6080a = 0;
        this.f6082c = cVar;
        this.f6081b = 0;
    }
}
