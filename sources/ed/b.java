package ed;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import n6.l;
import x8.e;
import y8.k;
public class b implements Iterator {
    public final int f8606a;
    public int f8607b;
    public final Object f8608c;

    public b(e eVar) {
        this.f8606a = 3;
        this.f8608c = eVar;
        this.f8607b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f8606a) {
            case 0:
                if (this.f8607b < ((c) this.f8608c).f8609a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f8607b < ((jd.c) this.f8608c).h()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f8607b < ((Object[]) this.f8608c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f8608c;
                int i10 = this.f8607b;
                eVar.n();
                if (i10 < eVar.f49655c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f8606a) {
            case 0:
                c cVar = (c) this.f8608c;
                String[] strArr = cVar.f8611c;
                int i10 = this.f8607b;
                String str = strArr[i10];
                String str2 = cVar.f8610b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f8603a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f8604b = str;
                        obj.f8605c = cVar;
                        this.f8607b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f8607b;
                    this.f8607b = i11 + 1;
                    return ((jd.c) this.f8608c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f8607b;
                    this.f8607b = i12 + 1;
                    return ((Object[]) this.f8608c)[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f8607b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f8608c;
                    int i13 = this.f8607b;
                    int i14 = i13 + 1;
                    this.f8607b = i14;
                    DataHolder dataHolder = eVar.f49653a;
                    eVar.n();
                    int m10 = eVar.m(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f49655c.size()) {
                        if (i14 == eVar.f49655c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f6543n;
                            intValue2 = ((Integer) eVar.f49655c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f49655c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f49655c.get(i14)).intValue();
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
                throw new NoSuchElementException(i2.e.j(this.f8607b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f8606a) {
            case 0:
                c cVar = (c) this.f8608c;
                int i10 = this.f8607b;
                int i11 = i10 - 1;
                this.f8607b = i11;
                int i12 = cVar.f8609a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f8610b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f8611c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f8609a - 1;
                    cVar.f8609a = i14;
                    cVar.f8610b[i14] = null;
                    cVar.f8611c[i14] = null;
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
        this.f8606a = 2;
        i.e(array, "array");
        this.f8608c = array;
    }

    public b(jd.c cVar) {
        this.f8606a = 1;
        this.f8608c = cVar;
    }

    public b(c cVar) {
        this.f8606a = 0;
        this.f8608c = cVar;
        this.f8607b = 0;
    }
}
