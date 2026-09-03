package kotlin.jvm.internal;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class a implements Iterator {
    public final int f11327a;
    public int f11328b;
    public final Object f11329c;

    public a(l8.e eVar) {
        this.f11327a = 3;
        this.f11329c = eVar;
        this.f11328b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f11327a) {
            case 0:
                if (this.f11328b < ((Object[]) this.f11329c).length) {
                    return true;
                }
                return false;
            case 1:
                if (this.f11328b < ((oc.b) this.f11329c).f16710a) {
                    return true;
                }
                return false;
            case 2:
                if (this.f11328b < ((tc.c) this.f11329c).i()) {
                    return true;
                }
                return false;
            default:
                l8.e eVar = (l8.e) this.f11329c;
                int i10 = this.f11328b;
                eVar.o();
                if (i10 < eVar.f12124c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f11327a) {
            case 0:
                try {
                    int i10 = this.f11328b;
                    this.f11328b = i10 + 1;
                    return ((Object[]) this.f11329c)[i10];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f11328b--;
                    throw new NoSuchElementException(e6.getMessage());
                }
            case 1:
                oc.b bVar = (oc.b) this.f11329c;
                String[] strArr = bVar.f16712c;
                int i11 = this.f11328b;
                String str = strArr[i11];
                String str2 = bVar.f16711b[i11];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f16707a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f16708b = str;
                        obj.f16709c = bVar;
                        this.f11328b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 2:
                if (hasNext()) {
                    int i12 = this.f11328b;
                    this.f11328b = i12 + 1;
                    return ((tc.c) this.f11329c).get(i12);
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    l8.e eVar = (l8.e) this.f11329c;
                    int i13 = this.f11328b;
                    int i14 = i13 + 1;
                    this.f11328b = i14;
                    DataHolder dataHolder = eVar.f12122a;
                    eVar.o();
                    int n10 = eVar.n(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f12124c.size()) {
                        if (i14 == eVar.f12124c.size() - 1) {
                            b6.m.h(dataHolder);
                            intValue = dataHolder.f2870n;
                            intValue2 = ((Integer) eVar.f12124c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f12124c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f12124c.get(i14)).intValue();
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
                throw new NoSuchElementException(l.d.j(this.f11328b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f11327a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                oc.b bVar = (oc.b) this.f11329c;
                int i10 = this.f11328b;
                int i11 = i10 - 1;
                this.f11328b = i11;
                int i12 = bVar.f16710a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = bVar.f16711b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = bVar.f16712c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = bVar.f16710a - 1;
                    bVar.f16710a = i14;
                    bVar.f16711b[i14] = null;
                    bVar.f16712c[i14] = null;
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
        this.f11327a = 0;
        j.e(array, "array");
        this.f11329c = array;
    }

    public a(tc.c cVar) {
        this.f11327a = 2;
        this.f11329c = cVar;
    }

    public a(oc.b bVar) {
        this.f11327a = 1;
        this.f11329c = bVar;
        this.f11328b = 0;
    }
}
