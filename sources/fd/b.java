package fd;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import o6.l;
import y8.e;
public class b implements Iterator {
    public final int f10429a;
    public int f10430b;
    public final Object f10431c;

    public b(e eVar) {
        this.f10429a = 3;
        this.f10431c = eVar;
        this.f10430b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f10429a) {
            case 0:
                if (this.f10430b < ((c) this.f10431c).f10432a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f10430b < ((kd.c) this.f10431c).h()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f10430b < ((Object[]) this.f10431c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f10431c;
                int i10 = this.f10430b;
                eVar.n();
                if (i10 < eVar.f52397c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f10429a) {
            case 0:
                c cVar = (c) this.f10431c;
                String[] strArr = cVar.f10434c;
                int i10 = this.f10430b;
                String str = strArr[i10];
                String str2 = cVar.f10433b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f10426a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f10427b = str;
                        obj.f10428c = cVar;
                        this.f10430b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f10430b;
                    this.f10430b = i11 + 1;
                    return ((kd.c) this.f10431c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f10430b;
                    this.f10430b = i12 + 1;
                    return ((Object[]) this.f10431c)[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f10430b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f10431c;
                    int i13 = this.f10430b;
                    int i14 = i13 + 1;
                    this.f10430b = i14;
                    DataHolder dataHolder = eVar.f52395a;
                    eVar.n();
                    int m10 = eVar.m(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f52397c.size()) {
                        if (i14 == eVar.f52397c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f6668n;
                            intValue2 = ((Integer) eVar.f52397c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f52397c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f52397c.get(i14)).intValue();
                        }
                        i15 = intValue - intValue2;
                        if (i15 == 1) {
                            int m11 = eVar.m(i14);
                            l.h(dataHolder);
                            dataHolder.b(m11);
                            i15 = 1;
                        }
                    }
                    return new z8.l(dataHolder, m10, i15, 0);
                }
                throw new NoSuchElementException(ic.a.i(this.f10430b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f10429a) {
            case 0:
                c cVar = (c) this.f10431c;
                int i10 = this.f10430b;
                int i11 = i10 - 1;
                this.f10430b = i11;
                int i12 = cVar.f10432a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f10433b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f10434c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f10432a - 1;
                    cVar.f10432a = i14;
                    cVar.f10433b[i14] = null;
                    cVar.f10434c[i14] = null;
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
        this.f10429a = 2;
        i.e(array, "array");
        this.f10431c = array;
    }

    public b(kd.c cVar) {
        this.f10429a = 1;
        this.f10431c = cVar;
    }

    public b(c cVar) {
        this.f10429a = 0;
        this.f10431c = cVar;
        this.f10430b = 0;
    }
}
