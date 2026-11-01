package bd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class b implements Iterator {
    public final int f2648a;
    public int f2649b;
    public final Object f2650c;

    public b(Object[] array) {
        this.f2648a = 1;
        kotlin.jvm.internal.i.e(array, "array");
        this.f2650c = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f2648a) {
            case 0:
                if (this.f2649b < ((e) this.f2650c).l()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f2649b < ((Object[]) this.f2650c).length) {
                    return true;
                }
                return false;
            default:
                if (this.f2649b < ((wc.b) this.f2650c).f52817a) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        switch (this.f2648a) {
            case 0:
                if (hasNext()) {
                    int i10 = this.f2649b;
                    this.f2649b = i10 + 1;
                    return ((e) this.f2650c).get(i10);
                }
                throw new NoSuchElementException();
            case 1:
                try {
                    int i11 = this.f2649b;
                    this.f2649b = i11 + 1;
                    return ((Object[]) this.f2650c)[i11];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f2649b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                wc.b bVar = (wc.b) this.f2650c;
                String[] strArr = bVar.f52819c;
                int i12 = this.f2649b;
                String str = strArr[i12];
                String str2 = bVar.f52818b[i12];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f52814a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f52815b = str;
                        obj.f52816c = bVar;
                        this.f2649b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
        }
    }

    @Override
    public final void remove() {
        switch (this.f2648a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                wc.b bVar = (wc.b) this.f2650c;
                int i10 = this.f2649b;
                int i11 = i10 - 1;
                this.f2649b = i11;
                int i12 = bVar.f52817a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = bVar.f52818b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = bVar.f52819c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = bVar.f52817a - 1;
                    bVar.f52817a = i14;
                    bVar.f52818b[i14] = null;
                    bVar.f52819c[i14] = null;
                    return;
                }
                throw new IllegalArgumentException("Must be false");
        }
    }

    public b(e eVar) {
        this.f2648a = 0;
        this.f2650c = eVar;
    }

    public b(wc.b bVar) {
        this.f2648a = 2;
        this.f2650c = bVar;
        this.f2649b = 0;
    }
}
