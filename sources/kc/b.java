package kc;

import com.google.android.gms.common.data.DataHolder;
import h8.e;
import i8.k;
import j3.r0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import x5.l;
public class b implements Iterator {
    public final int f14753a;
    public int f14754b;
    public final Object f14755c;

    public b(e eVar) {
        this.f14753a = 3;
        this.f14755c = eVar;
        this.f14754b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f14753a) {
            case 0:
                if (this.f14754b < ((c) this.f14755c).f14756a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f14754b < ((Object[]) this.f14755c).length) {
                    return true;
                }
                return false;
            case 2:
                if (this.f14754b < ((pc.c) this.f14755c).i()) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f14755c;
                int i9 = this.f14754b;
                eVar.o();
                if (i9 < eVar.f10244c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f14753a) {
            case 0:
                c cVar = (c) this.f14755c;
                String[] strArr = cVar.f14758c;
                int i9 = this.f14754b;
                String str = strArr[i9];
                String str2 = cVar.f14757b[i9];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f14750a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f14751b = str;
                        obj.f14752c = cVar;
                        this.f14754b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                try {
                    int i10 = this.f14754b;
                    this.f14754b = i10 + 1;
                    return ((Object[]) this.f14755c)[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f14754b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 2:
                if (hasNext()) {
                    int i11 = this.f14754b;
                    this.f14754b = i11 + 1;
                    return ((pc.c) this.f14755c).get(i11);
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    e eVar = (e) this.f14755c;
                    int i12 = this.f14754b;
                    int i13 = i12 + 1;
                    this.f14754b = i13;
                    DataHolder dataHolder = eVar.f10242a;
                    eVar.o();
                    int n10 = eVar.n(i13);
                    int i14 = 0;
                    if (i13 >= 0 && i13 != eVar.f10244c.size()) {
                        if (i13 == eVar.f10244c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f2960n;
                            intValue2 = ((Integer) eVar.f10244c.get(i13)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f10244c.get(i12 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f10244c.get(i13)).intValue();
                        }
                        i14 = intValue - intValue2;
                        if (i14 == 1) {
                            int n11 = eVar.n(i13);
                            l.h(dataHolder);
                            dataHolder.b(n11);
                            i14 = 1;
                        }
                    }
                    return new k(dataHolder, n10, i14, 0);
                }
                throw new NoSuchElementException(r0.l(this.f14754b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f14753a) {
            case 0:
                c cVar = (c) this.f14755c;
                int i9 = this.f14754b;
                int i10 = i9 - 1;
                this.f14754b = i10;
                int i11 = cVar.f14756a;
                if (i10 < i11) {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        String[] strArr = cVar.f14757b;
                        System.arraycopy(strArr, i9, strArr, i10, i12);
                        String[] strArr2 = cVar.f14758c;
                        System.arraycopy(strArr2, i9, strArr2, i10, i12);
                    }
                    int i13 = cVar.f14756a - 1;
                    cVar.f14756a = i13;
                    cVar.f14757b[i13] = null;
                    cVar.f14758c[i13] = null;
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
        this.f14753a = 1;
        i.e(array, "array");
        this.f14755c = array;
    }

    public b(pc.c cVar) {
        this.f14753a = 2;
        this.f14755c = cVar;
    }

    public b(c cVar) {
        this.f14753a = 0;
        this.f14755c = cVar;
        this.f14754b = 0;
    }
}
