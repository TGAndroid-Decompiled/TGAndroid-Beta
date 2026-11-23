package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public class b implements Iterator {
    public final int f5223a;
    public int f5224b;
    public final Object f5225c;

    public b(Object[] array) {
        this.f5223a = 2;
        j.e(array, "array");
        this.f5225c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f5223a) {
            case 0:
                if (this.f5224b < ((c) this.f5225c).f5226a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f5224b < ((hd.c) this.f5225c).f()) {
                    return true;
                }
                return false;
            default:
                if (this.f5224b < ((Object[]) this.f5225c).length) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f5223a) {
            case 0:
                c cVar = (c) this.f5225c;
                String[] strArr = cVar.f5228c;
                int i7 = this.f5224b;
                String str = strArr[i7];
                String str2 = cVar.f5227b[i7];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f5220a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f5221b = str;
                        obj.f5222c = cVar;
                        this.f5224b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i10 = this.f5224b;
                    this.f5224b = i10 + 1;
                    return ((hd.c) this.f5225c).get(i10);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i11 = this.f5224b;
                    this.f5224b = i11 + 1;
                    return ((Object[]) this.f5225c)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f5224b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override
    public final void remove() {
        switch (this.f5223a) {
            case 0:
                c cVar = (c) this.f5225c;
                int i7 = this.f5224b;
                int i10 = i7 - 1;
                this.f5224b = i10;
                int i11 = cVar.f5226a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f5227b;
                        System.arraycopy(strArr, i7, strArr, i10, i12);
                        String[] strArr2 = cVar.f5228c;
                        System.arraycopy(strArr2, i7, strArr2, i10, i12);
                    }
                    int i13 = cVar.f5226a - 1;
                    cVar.f5226a = i13;
                    cVar.f5227b[i13] = null;
                    cVar.f5228c[i13] = null;
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
        this.f5223a = 1;
        this.f5225c = cVar;
    }

    public b(c cVar) {
        this.f5223a = 0;
        this.f5225c = cVar;
        this.f5224b = 0;
    }
}
