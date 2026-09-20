package cd;

import com.google.android.gms.common.data.DataHolder;
import hg.k0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import n6.l;
import x8.e;
import y8.k;
public class b implements Iterator {
    public final int f4221a;
    public int f4222b;
    public final Object f4223c;

    public b(e eVar) {
        this.f4221a = 3;
        this.f4223c = eVar;
        this.f4222b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f4221a) {
            case 0:
                if (this.f4222b < ((c) this.f4223c).f4224a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f4222b < ((hd.c) this.f4223c).i()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f4222b < ((Object[]) this.f4223c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f4223c;
                int i10 = this.f4222b;
                eVar.o();
                if (i10 < eVar.f45988c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f4221a) {
            case 0:
                c cVar = (c) this.f4223c;
                String[] strArr = cVar.f4226c;
                int i10 = this.f4222b;
                String str = strArr[i10];
                String str2 = cVar.f4225b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f4218a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f4219b = str;
                        obj.f4220c = cVar;
                        this.f4222b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f4222b;
                    this.f4222b = i11 + 1;
                    return ((hd.c) this.f4223c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f4222b;
                    this.f4222b = i12 + 1;
                    return ((Object[]) this.f4223c)[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f4222b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f4223c;
                    int i13 = this.f4222b;
                    int i14 = i13 + 1;
                    this.f4222b = i14;
                    DataHolder dataHolder = eVar.f45986a;
                    eVar.o();
                    int n10 = eVar.n(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f45988c.size()) {
                        if (i14 == eVar.f45988c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f6226n;
                            intValue2 = ((Integer) eVar.f45988c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f45988c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f45988c.get(i14)).intValue();
                        }
                        i15 = intValue - intValue2;
                        if (i15 == 1) {
                            int n11 = eVar.n(i14);
                            l.h(dataHolder);
                            dataHolder.b(n11);
                            i15 = 1;
                        }
                    }
                    return new k(dataHolder, n10, i15, 0);
                }
                throw new NoSuchElementException(k0.h(this.f4222b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f4221a) {
            case 0:
                c cVar = (c) this.f4223c;
                int i10 = this.f4222b;
                int i11 = i10 - 1;
                this.f4222b = i11;
                int i12 = cVar.f4224a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f4225b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f4226c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f4224a - 1;
                    cVar.f4224a = i14;
                    cVar.f4225b[i14] = null;
                    cVar.f4226c[i14] = null;
                    return;
                }
                throw new IllegalArgumentException("Must be false");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
    }

    public b(Object[] array) {
        this.f4221a = 2;
        i.e(array, "array");
        this.f4223c = array;
    }

    public b(hd.c cVar) {
        this.f4221a = 1;
        this.f4223c = cVar;
    }

    public b(c cVar) {
        this.f4221a = 0;
        this.f4223c = cVar;
        this.f4222b = 0;
    }
}
