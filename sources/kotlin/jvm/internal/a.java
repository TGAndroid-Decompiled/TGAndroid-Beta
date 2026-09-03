package kotlin.jvm.internal;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kf.k0;
public class a implements Iterator {
    public final int f11087a;
    public int f11088b;
    public final Object f11089c;

    public a(l8.e eVar) {
        this.f11087a = 3;
        this.f11089c = eVar;
        this.f11088b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f11087a) {
            case 0:
                if (this.f11088b < ((Object[]) this.f11089c).length) {
                    return true;
                }
                return false;
            case 1:
                if (this.f11088b < ((oc.b) this.f11089c).f16522a) {
                    return true;
                }
                return false;
            case 2:
                if (this.f11088b < ((tc.c) this.f11089c).i()) {
                    return true;
                }
                return false;
            default:
                l8.e eVar = (l8.e) this.f11089c;
                int i10 = this.f11088b;
                eVar.o();
                if (i10 < eVar.f11827c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f11087a) {
            case 0:
                try {
                    int i10 = this.f11088b;
                    this.f11088b = i10 + 1;
                    return ((Object[]) this.f11089c)[i10];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f11088b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                oc.b bVar = (oc.b) this.f11089c;
                String[] strArr = bVar.f16524c;
                int i11 = this.f11088b;
                String str = strArr[i11];
                String str2 = bVar.f16523b[i11];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f16519a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f16520b = str;
                        obj.f16521c = bVar;
                        this.f11088b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 2:
                if (hasNext()) {
                    int i12 = this.f11088b;
                    this.f11088b = i12 + 1;
                    return ((tc.c) this.f11089c).get(i12);
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    l8.e eVar = (l8.e) this.f11089c;
                    int i13 = this.f11088b;
                    int i14 = i13 + 1;
                    this.f11088b = i14;
                    DataHolder dataHolder = eVar.f11825a;
                    eVar.o();
                    int n10 = eVar.n(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f11827c.size()) {
                        if (i14 == eVar.f11827c.size() - 1) {
                            b6.m.h(dataHolder);
                            intValue = dataHolder.f2910n;
                            intValue2 = ((Integer) eVar.f11827c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f11827c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f11827c.get(i14)).intValue();
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
                throw new NoSuchElementException(k0.j(this.f11088b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f11087a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                oc.b bVar = (oc.b) this.f11089c;
                int i10 = this.f11088b;
                int i11 = i10 - 1;
                this.f11088b = i11;
                int i12 = bVar.f16522a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = bVar.f16523b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = bVar.f16524c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = bVar.f16522a - 1;
                    bVar.f16522a = i14;
                    bVar.f16523b[i14] = null;
                    bVar.f16524c[i14] = null;
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
        this.f11087a = 0;
        j.e(array, "array");
        this.f11089c = array;
    }

    public a(tc.c cVar) {
        this.f11087a = 2;
        this.f11089c = cVar;
    }

    public a(oc.b bVar) {
        this.f11087a = 1;
        this.f11089c = bVar;
        this.f11088b = 0;
    }
}
