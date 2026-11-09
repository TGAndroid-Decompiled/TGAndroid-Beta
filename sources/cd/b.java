package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public class b implements Iterator {
    public final int f6078a;
    public int f6079b;
    public final Object f6080c;

    public b(Object[] array) {
        this.f6078a = 2;
        j.e(array, "array");
        this.f6080c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f6078a) {
            case 0:
                if (this.f6079b < ((c) this.f6080c).f6081a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f6079b < ((hd.c) this.f6080c).f()) {
                    return true;
                }
                return false;
            default:
                if (this.f6079b < ((Object[]) this.f6080c).length) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f6078a) {
            case 0:
                c cVar = (c) this.f6080c;
                String[] strArr = cVar.f6083c;
                int i7 = this.f6079b;
                String str = strArr[i7];
                String str2 = cVar.f6082b[i7];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f6075a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f6076b = str;
                        obj.f6077c = cVar;
                        this.f6079b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i10 = this.f6079b;
                    this.f6079b = i10 + 1;
                    return ((hd.c) this.f6080c).get(i10);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i11 = this.f6079b;
                    this.f6079b = i11 + 1;
                    return ((Object[]) this.f6080c)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f6079b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override
    public final void remove() {
        switch (this.f6078a) {
            case 0:
                c cVar = (c) this.f6080c;
                int i7 = this.f6079b;
                int i10 = i7 - 1;
                this.f6079b = i10;
                int i11 = cVar.f6081a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f6082b;
                        System.arraycopy(strArr, i7, strArr, i10, i12);
                        String[] strArr2 = cVar.f6083c;
                        System.arraycopy(strArr2, i7, strArr2, i10, i12);
                    }
                    int i13 = cVar.f6081a - 1;
                    cVar.f6081a = i13;
                    cVar.f6082b[i13] = null;
                    cVar.f6083c[i13] = null;
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
        this.f6078a = 1;
        this.f6080c = cVar;
    }

    public b(c cVar) {
        this.f6078a = 0;
        this.f6080c = cVar;
        this.f6079b = 0;
    }
}
