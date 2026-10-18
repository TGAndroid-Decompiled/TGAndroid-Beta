package ed;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import n6.l;
import x8.e;
import y8.k;
public class b implements Iterator {
    public final int f8607a;
    public int f8608b;
    public final Object f8609c;

    public b(e eVar) {
        this.f8607a = 3;
        this.f8609c = eVar;
        this.f8608b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f8607a) {
            case 0:
                if (this.f8608b < ((c) this.f8609c).f8610a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f8608b < ((jd.c) this.f8609c).h()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f8608b < ((Object[]) this.f8609c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f8609c;
                int i10 = this.f8608b;
                eVar.n();
                if (i10 < eVar.f49646c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f8607a) {
            case 0:
                c cVar = (c) this.f8609c;
                String[] strArr = cVar.f8612c;
                int i10 = this.f8608b;
                String str = strArr[i10];
                String str2 = cVar.f8611b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f8604a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f8605b = str;
                        obj.f8606c = cVar;
                        this.f8608b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f8608b;
                    this.f8608b = i11 + 1;
                    return ((jd.c) this.f8609c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f8608b;
                    this.f8608b = i12 + 1;
                    return ((Object[]) this.f8609c)[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f8608b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f8609c;
                    int i13 = this.f8608b;
                    int i14 = i13 + 1;
                    this.f8608b = i14;
                    DataHolder dataHolder = eVar.f49644a;
                    eVar.n();
                    int m10 = eVar.m(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f49646c.size()) {
                        if (i14 == eVar.f49646c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f6544n;
                            intValue2 = ((Integer) eVar.f49646c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f49646c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f49646c.get(i14)).intValue();
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
                throw new NoSuchElementException(i2.d.j(this.f8608b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f8607a) {
            case 0:
                c cVar = (c) this.f8609c;
                int i10 = this.f8608b;
                int i11 = i10 - 1;
                this.f8608b = i11;
                int i12 = cVar.f8610a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f8611b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f8612c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f8610a - 1;
                    cVar.f8610a = i14;
                    cVar.f8611b[i14] = null;
                    cVar.f8612c[i14] = null;
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
        this.f8607a = 2;
        i.e(array, "array");
        this.f8609c = array;
    }

    public b(jd.c cVar) {
        this.f8607a = 1;
        this.f8609c = cVar;
    }

    public b(c cVar) {
        this.f8607a = 0;
        this.f8609c = cVar;
        this.f8608b = 0;
    }
}
