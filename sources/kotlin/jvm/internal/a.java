package kotlin.jvm.internal;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kh.a2;
public class a implements Iterator {
    public final int f10977a;
    public int f10978b;
    public final Object f10979c;

    public a(l8.e eVar) {
        this.f10977a = 3;
        this.f10979c = eVar;
        this.f10978b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f10977a) {
            case 0:
                if (this.f10978b < ((Object[]) this.f10979c).length) {
                    return true;
                }
                return false;
            case 1:
                if (this.f10978b < ((oc.b) this.f10979c).f16540a) {
                    return true;
                }
                return false;
            case 2:
                if (this.f10978b < ((tc.c) this.f10979c).i()) {
                    return true;
                }
                return false;
            default:
                l8.e eVar = (l8.e) this.f10979c;
                int i10 = this.f10978b;
                eVar.o();
                if (i10 < eVar.f11717c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f10977a) {
            case 0:
                try {
                    int i10 = this.f10978b;
                    this.f10978b = i10 + 1;
                    return ((Object[]) this.f10979c)[i10];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f10978b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                oc.b bVar = (oc.b) this.f10979c;
                String[] strArr = bVar.f16542c;
                int i11 = this.f10978b;
                String str = strArr[i11];
                String str2 = bVar.f16541b[i11];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f16537a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f16538b = str;
                        obj.f16539c = bVar;
                        this.f10978b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 2:
                if (hasNext()) {
                    int i12 = this.f10978b;
                    this.f10978b = i12 + 1;
                    return ((tc.c) this.f10979c).get(i12);
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    l8.e eVar = (l8.e) this.f10979c;
                    int i13 = this.f10978b;
                    int i14 = i13 + 1;
                    this.f10978b = i14;
                    DataHolder dataHolder = eVar.f11715a;
                    eVar.o();
                    int n10 = eVar.n(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f11717c.size()) {
                        if (i14 == eVar.f11717c.size() - 1) {
                            b6.m.h(dataHolder);
                            intValue = dataHolder.f2927n;
                            intValue2 = ((Integer) eVar.f11717c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f11717c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f11717c.get(i14)).intValue();
                        }
                        i15 = intValue - intValue2;
                        if (i15 == 1) {
                            int n11 = eVar.n(i14);
                            b6.m.h(dataHolder);
                            dataHolder.e(n11);
                            i15 = 1;
                        }
                    }
                    return new m8.k(dataHolder, n10, i15, 0);
                }
                throw new NoSuchElementException(a2.j(this.f10978b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f10977a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                oc.b bVar = (oc.b) this.f10979c;
                int i10 = this.f10978b;
                int i11 = i10 - 1;
                this.f10978b = i11;
                int i12 = bVar.f16540a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = bVar.f16541b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = bVar.f16542c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = bVar.f16540a - 1;
                    bVar.f16540a = i14;
                    bVar.f16541b[i14] = null;
                    bVar.f16542c[i14] = null;
                    return;
                }
                throw new IllegalArgumentException("Must be false");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
    }

    public a(Object[] array) {
        this.f10977a = 0;
        j.e(array, "array");
        this.f10979c = array;
    }

    public a(tc.c cVar) {
        this.f10977a = 2;
        this.f10979c = cVar;
    }

    public a(oc.b bVar) {
        this.f10977a = 1;
        this.f10979c = bVar;
        this.f10978b = 0;
    }
}
