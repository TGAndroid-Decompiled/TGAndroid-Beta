package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public class b implements Iterator {
    public final int f5186a;
    public int f5187b;
    public final Object f5188c;

    public b(Object[] array) {
        this.f5186a = 2;
        j.e(array, "array");
        this.f5188c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f5186a) {
            case 0:
                if (this.f5187b < ((c) this.f5188c).f5189a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f5187b < ((hd.c) this.f5188c).f()) {
                    return true;
                }
                return false;
            default:
                if (this.f5187b < ((Object[]) this.f5188c).length) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f5186a) {
            case 0:
                c cVar = (c) this.f5188c;
                String[] strArr = cVar.f5191c;
                int i7 = this.f5187b;
                String str = strArr[i7];
                String str2 = cVar.f5190b[i7];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f5183a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f5184b = str;
                        obj.f5185c = cVar;
                        this.f5187b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i10 = this.f5187b;
                    this.f5187b = i10 + 1;
                    return ((hd.c) this.f5188c).get(i10);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i11 = this.f5187b;
                    this.f5187b = i11 + 1;
                    return ((Object[]) this.f5188c)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f5187b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override
    public final void remove() {
        switch (this.f5186a) {
            case 0:
                c cVar = (c) this.f5188c;
                int i7 = this.f5187b;
                int i10 = i7 - 1;
                this.f5187b = i10;
                int i11 = cVar.f5189a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f5190b;
                        System.arraycopy(strArr, i7, strArr, i10, i12);
                        String[] strArr2 = cVar.f5191c;
                        System.arraycopy(strArr2, i7, strArr2, i10, i12);
                    }
                    int i13 = cVar.f5189a - 1;
                    cVar.f5189a = i13;
                    cVar.f5190b[i13] = null;
                    cVar.f5191c[i13] = null;
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
        this.f5186a = 1;
        this.f5188c = cVar;
    }

    public b(c cVar) {
        this.f5186a = 0;
        this.f5188c = cVar;
        this.f5187b = 0;
    }
}
