package cd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public class b implements Iterator {
    public final int f4905a;
    public int f4906b;
    public final Object f4907c;

    public b(Object[] array) {
        this.f4905a = 2;
        j.e(array, "array");
        this.f4907c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f4905a) {
            case 0:
                if (this.f4906b < ((c) this.f4907c).f4908a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f4906b < ((hd.c) this.f4907c).f()) {
                    return true;
                }
                return false;
            default:
                if (this.f4906b < ((Object[]) this.f4907c).length) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f4905a) {
            case 0:
                c cVar = (c) this.f4907c;
                String[] strArr = cVar.f4910c;
                int i7 = this.f4906b;
                String str = strArr[i7];
                String str2 = cVar.f4909b[i7];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f4902a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f4903b = str;
                        obj.f4904c = cVar;
                        this.f4906b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i10 = this.f4906b;
                    this.f4906b = i10 + 1;
                    return ((hd.c) this.f4907c).get(i10);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i11 = this.f4906b;
                    this.f4906b = i11 + 1;
                    return ((Object[]) this.f4907c)[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f4906b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override
    public final void remove() {
        switch (this.f4905a) {
            case 0:
                c cVar = (c) this.f4907c;
                int i7 = this.f4906b;
                int i10 = i7 - 1;
                this.f4906b = i10;
                int i11 = cVar.f4908a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f4909b;
                        System.arraycopy(strArr, i7, strArr, i10, i12);
                        String[] strArr2 = cVar.f4910c;
                        System.arraycopy(strArr2, i7, strArr2, i10, i12);
                    }
                    int i13 = cVar.f4908a - 1;
                    cVar.f4908a = i13;
                    cVar.f4909b[i13] = null;
                    cVar.f4910c[i13] = null;
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
        this.f4905a = 1;
        this.f4907c = cVar;
    }

    public b(c cVar) {
        this.f4905a = 0;
        this.f4907c = cVar;
        this.f4906b = 0;
    }
}
