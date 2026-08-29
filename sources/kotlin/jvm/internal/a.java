package kotlin.jvm.internal;

import com.google.android.gms.common.data.DataHolder;
import j7.l1;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class a implements Iterator {
    public final int f13914a;
    public int f13915b;
    public final Object f13916c;

    public a(j8.e eVar) {
        this.f13914a = 3;
        this.f13916c = eVar;
        this.f13915b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f13914a) {
            case 0:
                if (this.f13915b < ((Object[]) this.f13916c).length) {
                    return true;
                }
                return false;
            case 1:
                if (this.f13915b < ((mc.b) this.f13916c).f16974a) {
                    return true;
                }
                return false;
            case 2:
                if (this.f13915b < ((rc.c) this.f13916c).i()) {
                    return true;
                }
                return false;
            default:
                j8.e eVar = (j8.e) this.f13916c;
                int i10 = this.f13915b;
                eVar.o();
                if (i10 < eVar.f11280c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f13914a) {
            case 0:
                try {
                    int i10 = this.f13915b;
                    this.f13915b = i10 + 1;
                    return ((Object[]) this.f13916c)[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f13915b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 1:
                mc.b bVar = (mc.b) this.f13916c;
                String[] strArr = bVar.f16976c;
                int i11 = this.f13915b;
                String str = strArr[i11];
                String str2 = bVar.f16975b[i11];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f16971a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f16972b = str;
                        obj.f16973c = bVar;
                        this.f13915b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 2:
                if (hasNext()) {
                    int i12 = this.f13915b;
                    this.f13915b = i12 + 1;
                    return ((rc.c) this.f13916c).get(i12);
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    j8.e eVar = (j8.e) this.f13916c;
                    int i13 = this.f13915b;
                    int i14 = i13 + 1;
                    this.f13915b = i14;
                    DataHolder dataHolder = eVar.f11278a;
                    eVar.o();
                    int n10 = eVar.n(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f11280c.size()) {
                        if (i14 == eVar.f11280c.size() - 1) {
                            z5.l.h(dataHolder);
                            intValue = dataHolder.f3974n;
                            intValue2 = ((Integer) eVar.f11280c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f11280c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f11280c.get(i14)).intValue();
                        }
                        i15 = intValue - intValue2;
                        if (i15 == 1) {
                            int n11 = eVar.n(i14);
                            z5.l.h(dataHolder);
                            dataHolder.b(n11);
                            i15 = 1;
                        }
                    }
                    return new k8.k(dataHolder, n10, i15, 0);
                }
                throw new NoSuchElementException(l1.k(this.f13915b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f13914a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                mc.b bVar = (mc.b) this.f13916c;
                int i10 = this.f13915b;
                int i11 = i10 - 1;
                this.f13915b = i11;
                int i12 = bVar.f16974a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = bVar.f16975b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = bVar.f16976c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = bVar.f16974a - 1;
                    bVar.f16974a = i14;
                    bVar.f16975b[i14] = null;
                    bVar.f16976c[i14] = null;
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
        this.f13914a = 0;
        j.e(array, "array");
        this.f13916c = array;
    }

    public a(rc.c cVar) {
        this.f13914a = 2;
        this.f13916c = cVar;
    }

    public a(mc.b bVar) {
        this.f13914a = 1;
        this.f13916c = bVar;
        this.f13915b = 0;
    }
}
