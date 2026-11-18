package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public class b implements Iterator {
    public final int f5194a;
    public int f5195b;
    public final Object f5196c;

    public b(Object[] array) {
        this.f5194a = 2;
        j.e(array, "array");
        this.f5196c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f5194a) {
            case 0:
                if (this.f5195b < ((c) this.f5196c).f5197a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f5195b < ((hd.c) this.f5196c).f()) {
                    return true;
                }
                return false;
            default:
                if (this.f5195b < ((Object[]) this.f5196c).length) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f5194a) {
            case 0:
                c cVar = (c) this.f5196c;
                String[] strArr = cVar.f5199c;
                int i7 = this.f5195b;
                String str = strArr[i7];
                String str2 = cVar.f5198b[i7];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f5191a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f5192b = str;
                        obj.f5193c = cVar;
                        this.f5195b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i10 = this.f5195b;
                    this.f5195b = i10 + 1;
                    return ((hd.c) this.f5196c).get(i10);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i11 = this.f5195b;
                    this.f5195b = i11 + 1;
                    return ((Object[]) this.f5196c)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f5195b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override
    public final void remove() {
        switch (this.f5194a) {
            case 0:
                c cVar = (c) this.f5196c;
                int i7 = this.f5195b;
                int i10 = i7 - 1;
                this.f5195b = i10;
                int i11 = cVar.f5197a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f5198b;
                        System.arraycopy(strArr, i7, strArr, i10, i12);
                        String[] strArr2 = cVar.f5199c;
                        System.arraycopy(strArr2, i7, strArr2, i10, i12);
                    }
                    int i13 = cVar.f5197a - 1;
                    cVar.f5197a = i13;
                    cVar.f5198b[i13] = null;
                    cVar.f5199c[i13] = null;
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
        this.f5194a = 1;
        this.f5196c = cVar;
    }

    public b(c cVar) {
        this.f5194a = 0;
        this.f5196c = cVar;
        this.f5195b = 0;
    }
}
