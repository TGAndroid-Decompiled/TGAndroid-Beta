package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public class b implements Iterator {
    public final int f5220a;
    public int f5221b;
    public final Object f5222c;

    public b(Object[] array) {
        this.f5220a = 2;
        j.e(array, "array");
        this.f5222c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f5220a) {
            case 0:
                if (this.f5221b < ((c) this.f5222c).f5223a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f5221b < ((hd.c) this.f5222c).f()) {
                    return true;
                }
                return false;
            default:
                if (this.f5221b < ((Object[]) this.f5222c).length) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f5220a) {
            case 0:
                c cVar = (c) this.f5222c;
                String[] strArr = cVar.f5225c;
                int i7 = this.f5221b;
                String str = strArr[i7];
                String str2 = cVar.f5224b[i7];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f5217a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f5218b = str;
                        obj.f5219c = cVar;
                        this.f5221b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i10 = this.f5221b;
                    this.f5221b = i10 + 1;
                    return ((hd.c) this.f5222c).get(i10);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i11 = this.f5221b;
                    this.f5221b = i11 + 1;
                    return ((Object[]) this.f5222c)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f5221b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override
    public final void remove() {
        switch (this.f5220a) {
            case 0:
                c cVar = (c) this.f5222c;
                int i7 = this.f5221b;
                int i10 = i7 - 1;
                this.f5221b = i10;
                int i11 = cVar.f5223a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f5224b;
                        System.arraycopy(strArr, i7, strArr, i10, i12);
                        String[] strArr2 = cVar.f5225c;
                        System.arraycopy(strArr2, i7, strArr2, i10, i12);
                    }
                    int i13 = cVar.f5223a - 1;
                    cVar.f5223a = i13;
                    cVar.f5224b[i13] = null;
                    cVar.f5225c[i13] = null;
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
        this.f5220a = 1;
        this.f5222c = cVar;
    }

    public b(c cVar) {
        this.f5220a = 0;
        this.f5222c = cVar;
        this.f5221b = 0;
    }
}
