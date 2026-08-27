package kotlin.jvm.internal;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class a implements Iterator {

    public final int f15240a;

    public int f15241b;

    public final Object f15242c;

    public a(i8.e eVar) {
        this.f15240a = 3;
        this.f15242c = eVar;
        this.f15241b = -1;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f15240a) {
            case 0:
                return this.f15241b < ((Object[]) this.f15242c).length;
            case 1:
                return this.f15241b < ((lc.b) this.f15242c).f15534a;
            case 2:
                return this.f15241b < ((qc.c) this.f15242c).i();
            default:
                i8.e eVar = (i8.e) this.f15242c;
                int i10 = this.f15241b;
                eVar.o();
                return i10 < eVar.f10953c.size() + (-1);
        }
    }

    @Override
    public final Object next() {
        int iIntValue;
        int iIntValue2;
        switch (this.f15240a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f15242c;
                    int i10 = this.f15241b;
                    this.f15241b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e9) {
                    this.f15241b--;
                    throw new NoSuchElementException(e9.getMessage());
                }
            case 1:
                lc.b bVar = (lc.b) this.f15242c;
                String[] strArr = bVar.f15536c;
                int i11 = this.f15241b;
                String str = strArr[i11];
                String str2 = bVar.f15535b[i11];
                if (str == null) {
                    str = "";
                }
                lc.a aVar = new lc.a();
                if (str2 == null) {
                    throw new IllegalArgumentException("Object must not be null");
                }
                aVar.f15531a = str2.trim();
                if (str2.length() == 0) {
                    throw new IllegalArgumentException("String must not be empty");
                }
                aVar.f15532b = str;
                aVar.f15533c = bVar;
                this.f15241b++;
                return aVar;
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                qc.c cVar = (qc.c) this.f15242c;
                int i12 = this.f15241b;
                this.f15241b = i12 + 1;
                return cVar.get(i12);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException(i0.a.k(this.f15241b, "Cannot advance the iterator beyond "));
                }
                i8.e eVar = (i8.e) this.f15242c;
                int i13 = this.f15241b;
                int i14 = i13 + 1;
                this.f15241b = i14;
                DataHolder dataHolder = eVar.f10951a;
                eVar.o();
                int iN = eVar.n(i14);
                int i15 = 0;
                if (i14 >= 0 && i14 != eVar.f10953c.size()) {
                    if (i14 == eVar.f10953c.size() - 1) {
                        y5.l.h(dataHolder);
                        iIntValue = dataHolder.f3405n;
                        iIntValue2 = ((Integer) eVar.f10953c.get(i14)).intValue();
                    } else {
                        iIntValue = ((Integer) eVar.f10953c.get(i13 + 2)).intValue();
                        iIntValue2 = ((Integer) eVar.f10953c.get(i14)).intValue();
                    }
                    i15 = iIntValue - iIntValue2;
                    if (i15 == 1) {
                        int iN2 = eVar.n(i14);
                        y5.l.h(dataHolder);
                        dataHolder.b(iN2);
                        i15 = 1;
                    }
                }
                return new j8.k(dataHolder, iN, i15, 0);
        }
    }

    @Override
    public final void remove() {
        switch (this.f15240a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                lc.b bVar = (lc.b) this.f15242c;
                int i10 = this.f15241b;
                int i11 = i10 - 1;
                this.f15241b = i11;
                int i12 = bVar.f15534a;
                if (i11 >= i12) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i13 = (i12 - i11) - 1;
                if (i13 > 0) {
                    String[] strArr = bVar.f15535b;
                    System.arraycopy(strArr, i10, strArr, i11, i13);
                    String[] strArr2 = bVar.f15536c;
                    System.arraycopy(strArr2, i10, strArr2, i11, i13);
                }
                int i14 = bVar.f15534a - 1;
                bVar.f15534a = i14;
                bVar.f15535b[i14] = null;
                bVar.f15536c[i14] = null;
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
    }

    public a(Object[] array) {
        this.f15240a = 0;
        j.e(array, "array");
        this.f15242c = array;
    }

    public a(qc.c cVar) {
        this.f15240a = 2;
        this.f15242c = cVar;
    }

    public a(lc.b bVar) {
        this.f15240a = 1;
        this.f15242c = bVar;
        this.f15241b = 0;
    }
}
