package fd;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import o6.l;
import y8.e;
public class b implements Iterator {
    public final int f10428a;
    public int f10429b;
    public final Object f10430c;

    public b(e eVar) {
        this.f10428a = 3;
        this.f10430c = eVar;
        this.f10429b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f10428a) {
            case 0:
                if (this.f10429b < ((c) this.f10430c).f10431a) {
                    return true;
                }
                return false;
            case 1:
                if (this.f10429b < ((kd.c) this.f10430c).h()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f10429b < ((Object[]) this.f10430c).length) {
                    return true;
                }
                return false;
            default:
                e eVar = (e) this.f10430c;
                int i10 = this.f10429b;
                eVar.n();
                if (i10 < eVar.f52455c.size() - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        int intValue;
        int intValue2;
        switch (this.f10428a) {
            case 0:
                c cVar = (c) this.f10430c;
                String[] strArr = cVar.f10433c;
                int i10 = this.f10429b;
                String str = strArr[i10];
                String str2 = cVar.f10432b[i10];
                if (str == null) {
                    str = "";
                }
                ?? obj = new Object();
                if (str2 != null) {
                    obj.f10425a = str2.trim();
                    if (str2.length() != 0) {
                        obj.f10426b = str;
                        obj.f10427c = cVar;
                        this.f10429b++;
                        return obj;
                    }
                    throw new IllegalArgumentException("String must not be empty");
                }
                throw new IllegalArgumentException("Object must not be null");
            case 1:
                if (hasNext()) {
                    int i11 = this.f10429b;
                    this.f10429b = i11 + 1;
                    return ((kd.c) this.f10430c).get(i11);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i12 = this.f10429b;
                    this.f10429b = i12 + 1;
                    return ((Object[]) this.f10430c)[i12];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f10429b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    e eVar = (e) this.f10430c;
                    int i13 = this.f10429b;
                    int i14 = i13 + 1;
                    this.f10429b = i14;
                    DataHolder dataHolder = eVar.f52453a;
                    eVar.n();
                    int m10 = eVar.m(i14);
                    int i15 = 0;
                    if (i14 >= 0 && i14 != eVar.f52455c.size()) {
                        if (i14 == eVar.f52455c.size() - 1) {
                            l.h(dataHolder);
                            intValue = dataHolder.f6668n;
                            intValue2 = ((Integer) eVar.f52455c.get(i14)).intValue();
                        } else {
                            intValue = ((Integer) eVar.f52455c.get(i13 + 2)).intValue();
                            intValue2 = ((Integer) eVar.f52455c.get(i14)).intValue();
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
                throw new NoSuchElementException(ic.a.i(this.f10429b, "Cannot advance the iterator beyond "));
        }
    }

    @Override
    public final void remove() {
        switch (this.f10428a) {
            case 0:
                c cVar = (c) this.f10430c;
                int i10 = this.f10429b;
                int i11 = i10 - 1;
                this.f10429b = i11;
                int i12 = cVar.f10431a;
                if (i11 < i12) {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        String[] strArr = cVar.f10432b;
                        System.arraycopy(strArr, i10, strArr, i11, i13);
                        String[] strArr2 = cVar.f10433c;
                        System.arraycopy(strArr2, i10, strArr2, i11, i13);
                    }
                    int i14 = cVar.f10431a - 1;
                    cVar.f10431a = i14;
                    cVar.f10432b[i14] = null;
                    cVar.f10433c[i14] = null;
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
        this.f10428a = 2;
        i.e(array, "array");
        this.f10430c = array;
    }

    public b(kd.c cVar) {
        this.f10428a = 1;
        this.f10430c = cVar;
    }

    public b(c cVar) {
        this.f10428a = 0;
        this.f10430c = cVar;
        this.f10429b = 0;
    }
}
