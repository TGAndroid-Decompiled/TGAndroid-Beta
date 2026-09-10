package cd;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import n6.l;
import x8.e;
import y8.k;
public class b implements Iterator {
    public final int f4634a;
    public int f4635b;
    public final Object f4636c;

    public b(e eVar) {
        this.f4634a = 3;
        this.f4636c = eVar;
        this.f4635b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f4634a) {
            case 0:
                if (this.f4635b < ((c) this.f4636c).f4637a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f4635b < ((hd.c) this.f4636c).i()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f4635b < ((Object[]) this.f4636c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f4636c;
                int i10 = this.f4635b;
                eVar.o();
                if (i10 < eVar.f45030c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f4634a) {
            case 0:
                c cVar = (c) this.f4636c;
                String[] strArr = cVar.f4639c;
                int i10 = this.f4635b;
                String str = strArr[i10];
                String str2 = cVar.f4638b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f4631a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f4632b = str;
                        obj.f4633c = cVar;
                        this.f4635b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f4635b;
                    this.f4635b = i11 + 1;
                    return ((hd.c) this.f4636c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f4635b;
                    this.f4635b = i12 + 1;
                    return ((Object[]) this.f4636c)[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f4635b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f4636c;
                    int i13 = this.f4635b;
                    int i14 = i13 + 1;
                    this.f4635b = i14;
                    DataHolder dataHolder = eVar.f45028a;
                    eVar.o();
                    int n10 = eVar.n(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f45030c.size()) {
                        if (i14 == eVar.f45030c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f4999n;
                            intValue2 = ((Integer) eVar.f45030c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f45030c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f45030c.get(i14)).intValue();
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
                throw new NoSuchElementException(hc.b.j(this.f4635b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f4634a) {
            case 0:
                c cVar = (c) this.f4636c;
                int i10 = this.f4635b;
                int i11 = i10 - 1;
                this.f4635b = i11;
                int i12 = cVar.f4637a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f4638b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f4639c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f4637a - 1;
                    cVar.f4637a = i14;
                    cVar.f4638b[i14] = null;
                    cVar.f4639c[i14] = null;
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
        this.f4634a = 2;
        i.e(array, "array");
        this.f4636c = array;
    }

    public b(hd.c cVar) {
        this.f4634a = 1;
        this.f4636c = cVar;
    }

    public b(c cVar) {
        this.f4634a = 0;
        this.f4636c = cVar;
        this.f4635b = 0;
    }
}
