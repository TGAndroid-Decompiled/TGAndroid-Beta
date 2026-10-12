package dd;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import n6.m;
import x8.e;
import y8.k;
public class b implements Iterator {
    public final int f8301a;
    public int f8302b;
    public final Object f8303c;

    public b(e eVar) {
        this.f8301a = 3;
        this.f8303c = eVar;
        this.f8302b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f8301a) {
            case 0:
                if (this.f8302b < ((c) this.f8303c).f8304a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f8302b < ((id.c) this.f8303c).i()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f8302b < ((Object[]) this.f8303c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f8303c;
                int i10 = this.f8302b;
                eVar.o();
                if (i10 < eVar.f51293c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f8301a) {
            case 0:
                c cVar = (c) this.f8303c;
                String[] strArr = cVar.f8306c;
                int i10 = this.f8302b;
                String str = strArr[i10];
                String str2 = cVar.f8305b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f8298a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f8299b = str;
                        obj.f8300c = cVar;
                        this.f8302b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f8302b;
                    this.f8302b = i11 + 1;
                    return ((id.c) this.f8303c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f8302b;
                    this.f8302b = i12 + 1;
                    return ((Object[]) this.f8303c)[i12];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f8302b--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f8303c;
                    int i13 = this.f8302b;
                    int i14 = i13 + 1;
                    this.f8302b = i14;
                    DataHolder dataHolder = eVar.f51291a;
                    eVar.o();
                    int n10 = eVar.n(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f51293c.size()) {
                        if (i14 == eVar.f51293c.size() - 1) {
                            m.h(dataHolder);
                            intValue = dataHolder.f6740n;
                            intValue2 = ((Integer) eVar.f51293c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f51293c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f51293c.get(i14)).intValue();
                        }
                        i15 = intValue - intValue2;
                        if (i15 == 1) {
                            int n11 = eVar.n(i14);
                            m.h(dataHolder);
                            dataHolder.b(n11);
                            i15 = 1;
                        }
                    }
                    return new k(dataHolder, n10, i15, 0);
                }
                throw new NoSuchElementException(hg.c.i(this.f8302b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f8301a) {
            case 0:
                c cVar = (c) this.f8303c;
                int i10 = this.f8302b;
                int i11 = i10 - 1;
                this.f8302b = i11;
                int i12 = cVar.f8304a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f8305b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f8306c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f8304a - 1;
                    cVar.f8304a = i14;
                    cVar.f8305b[i14] = null;
                    cVar.f8306c[i14] = null;
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
        this.f8301a = 2;
        i.e(array, "array");
        this.f8303c = array;
    }

    public b(id.c cVar) {
        this.f8301a = 1;
        this.f8303c = cVar;
    }

    public b(c cVar) {
        this.f8301a = 0;
        this.f8303c = cVar;
        this.f8302b = 0;
    }
}
