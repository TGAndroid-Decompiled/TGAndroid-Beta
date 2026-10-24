package ed;

import com.google.android.gms.common.data.DataHolder;
import i2.o1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import n6.l;
import x8.e;
import y8.k;
public class b implements Iterator {
    public final int f8613a;
    public int f8614b;
    public final Object f8615c;

    public b(e eVar) {
        this.f8613a = 3;
        this.f8615c = eVar;
        this.f8614b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f8613a) {
            case 0:
                if (this.f8614b < ((c) this.f8615c).f8616a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f8614b < ((jd.c) this.f8615c).h()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f8614b < ((Object[]) this.f8615c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f8615c;
                int i10 = this.f8614b;
                eVar.n();
                if (i10 < eVar.f50097c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f8613a) {
            case 0:
                c cVar = (c) this.f8615c;
                String[] strArr = cVar.f8618c;
                int i10 = this.f8614b;
                String str = strArr[i10];
                String str2 = cVar.f8617b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f8610a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f8611b = str;
                        obj.f8612c = cVar;
                        this.f8614b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f8614b;
                    this.f8614b = i11 + 1;
                    return ((jd.c) this.f8615c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f8614b;
                    this.f8614b = i12 + 1;
                    return ((Object[]) this.f8615c)[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f8614b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f8615c;
                    int i13 = this.f8614b;
                    int i14 = i13 + 1;
                    this.f8614b = i14;
                    DataHolder dataHolder = eVar.f50095a;
                    eVar.n();
                    int m10 = eVar.m(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f50097c.size()) {
                        if (i14 == eVar.f50097c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f6555n;
                            intValue2 = ((Integer) eVar.f50097c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f50097c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f50097c.get(i14)).intValue();
                        }
                        i15 = intValue - intValue2;
                        if (i15 == 1) {
                            int m11 = eVar.m(i14);
                            l.h(dataHolder);
                            dataHolder.b(m11);
                            i15 = 1;
                        }
                    }
                    return new k(dataHolder, m10, i15, 0);
                }
                throw new NoSuchElementException(o1.k(this.f8614b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f8613a) {
            case 0:
                c cVar = (c) this.f8615c;
                int i10 = this.f8614b;
                int i11 = i10 - 1;
                this.f8614b = i11;
                int i12 = cVar.f8616a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f8617b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f8618c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f8616a - 1;
                    cVar.f8616a = i14;
                    cVar.f8617b[i14] = null;
                    cVar.f8618c[i14] = null;
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
        this.f8613a = 2;
        i.e(array, "array");
        this.f8615c = array;
    }

    public b(jd.c cVar) {
        this.f8613a = 1;
        this.f8615c = cVar;
    }

    public b(c cVar) {
        this.f8613a = 0;
        this.f8615c = cVar;
        this.f8614b = 0;
    }
}
