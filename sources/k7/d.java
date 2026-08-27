package k7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class d extends AbstractMap implements Serializable {

    public static final Object f14528s = new Object();

    public transient Object f14529a;

    public transient int[] f14530b;

    public transient Object[] f14531c;
    public transient Object[] d;

    public transient int f14532e = Math.min(Math.max(12, 1), 1073741823);

    public transient int f14533f;
    public transient b h;

    public transient b f14534n;

    public transient i7.m f14535r;

    public final Map a() {
        Object obj = this.f14529a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i10, int i11) {
        Object obj = this.f14529a;
        obj.getClass();
        int[] iArr = this.f14530b;
        iArr.getClass();
        Object[] objArr = this.f14531c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArr[i12];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[i12];
        objArr[i12] = null;
        objArr2[i12] = null;
        iArr[i10] = iArr[i12];
        iArr[i12] = 0;
        int iA = g7.u8.a(obj2) & i11;
        int iB = g7.t8.b(iA, obj);
        if (iB == size) {
            g7.t8.d(iA, i13, obj);
            return;
        }
        while (true) {
            int i14 = iB - 1;
            int i15 = iArr[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArr[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iB = i16;
        }
    }

    public final boolean c() {
        return this.f14529a == null;
    }

    @Override
    public final void clear() {
        if (c()) {
            return;
        }
        this.f14532e += 32;
        Map mapA = a();
        if (mapA != null) {
            this.f14532e = Math.min(Math.max(size(), 3), 1073741823);
            mapA.clear();
            this.f14529a = null;
            this.f14533f = 0;
            return;
        }
        Object[] objArr = this.f14531c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f14533f, (Object) null);
        Object[] objArr2 = this.d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f14533f, (Object) null);
        Object obj = this.f14529a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f14530b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f14533f, 0);
        this.f14533f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f14533f; i10++) {
            Object[] objArr = this.d;
            objArr.getClass();
            if (g7.x8.a(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f14532e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int iA = g7.u8.a(obj);
        int iD = d();
        Object obj2 = this.f14529a;
        obj2.getClass();
        int iB = g7.t8.b(iA & iD, obj2);
        if (iB != 0) {
            int i10 = ~iD;
            int i11 = iA & i10;
            do {
                int i12 = iB - 1;
                int[] iArr = this.f14530b;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f14531c;
                    objArr.getClass();
                    if (g7.x8.a(obj, objArr[i12])) {
                        return i12;
                    }
                }
                iB = i13 & iD;
            } while (iB != 0);
        }
        return -1;
    }

    @Override
    public final Set entrySet() {
        b bVar = this.f14534n;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.f14534n = bVar2;
        return bVar2;
    }

    public final int f(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objC = g7.t8.c(i11);
        if (i13 != 0) {
            g7.t8.d(i12 & i14, i13 + 1, objC);
        }
        Object obj = this.f14529a;
        obj.getClass();
        int[] iArr = this.f14530b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iB = g7.t8.b(i15, obj);
            while (iB != 0) {
                int i16 = iB - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iB2 = g7.t8.b(i19, objC);
                g7.t8.d(i19, iB, objC);
                iArr[i16] = ((~i14) & i18) | (iB2 & i14);
                iB = i17 & i10;
            }
        }
        this.f14529a = objC;
        this.f14532e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f14532e & (-32));
        return i14;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int iD = d();
            Object obj2 = this.f14529a;
            obj2.getClass();
            int[] iArr = this.f14530b;
            iArr.getClass();
            Object[] objArr = this.f14531c;
            objArr.getClass();
            int iA = g7.t8.a(obj, null, iD, obj2, iArr, objArr, null);
            if (iA != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[iA];
                b(iA, iD);
                this.f14533f--;
                this.f14532e += 32;
                return obj3;
            }
        }
        return f14528s;
    }

    @Override
    public final Object get(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[iE];
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Set keySet() {
        b bVar = this.h;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 1);
        this.h = bVar2;
        return bVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i10 = this.f14532e;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f14529a = g7.t8.c(iMax2);
            this.f14532e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f14532e & (-32));
            this.f14530b = new int[i10];
            this.f14531c = new Object[i10];
            this.d = new Object[i10];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.f14530b;
        iArr.getClass();
        Object[] objArr = this.f14531c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i11 = this.f14533f;
        int i12 = i11 + 1;
        int iA = g7.u8.a(obj);
        int iD = d();
        int i13 = iA & iD;
        Object obj3 = this.f14529a;
        obj3.getClass();
        int iB = g7.t8.b(i13, obj3);
        if (iB != 0) {
            int i14 = ~iD;
            int i15 = iA & i14;
            int i16 = 0;
            while (true) {
                int i17 = iB - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && g7.x8.a(obj, objArr[i17])) {
                    Object obj4 = objArr2[i17];
                    objArr2[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & iD;
                int i21 = i16 + 1;
                if (i20 == 0) {
                    if (i21 < 9) {
                        if (i12 <= iD) {
                            iArr[i17] = (i12 & iD) | i19;
                            break;
                        }
                        iD = f(iD, (iD + 1) * (iD < 32 ? 4 : 2), iA, i11);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                    int i22 = isEmpty() ? -1 : 0;
                    while (i22 >= 0) {
                        Object[] objArr3 = this.f14531c;
                        objArr3.getClass();
                        Object obj5 = objArr3[i22];
                        Object[] objArr4 = this.d;
                        objArr4.getClass();
                        linkedHashMap.put(obj5, objArr4[i22]);
                        int i23 = i22 + 1;
                        i22 = i23 < this.f14533f ? i23 : -1;
                    }
                    this.f14529a = linkedHashMap;
                    this.f14530b = null;
                    this.f14531c = null;
                    this.d = null;
                    this.f14532e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i16 = i21;
                iB = i20;
            }
        } else if (i12 > iD) {
            iD = f(iD, (iD + 1) * (iD < 32 ? 4 : 2), iA, i11);
        } else {
            Object obj6 = this.f14529a;
            obj6.getClass();
            g7.t8.d(i13, i12, obj6);
        }
        int[] iArr2 = this.f14530b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i12 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f14530b;
            iArr3.getClass();
            this.f14530b = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f14531c;
            objArr5.getClass();
            this.f14531c = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.d;
            objArr6.getClass();
            this.d = Arrays.copyOf(objArr6, iMin);
        }
        int i24 = (~iD) & iA;
        int[] iArr4 = this.f14530b;
        iArr4.getClass();
        iArr4[i11] = i24;
        Object[] objArr7 = this.f14531c;
        objArr7.getClass();
        objArr7[i11] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i11] = obj2;
        this.f14533f = i12;
        this.f14532e += 32;
        return null;
    }

    @Override
    public final Object remove(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f14528s) {
            return null;
        }
        return objG;
    }

    @Override
    public final int size() {
        Map mapA = a();
        return mapA != null ? mapA.size() : this.f14533f;
    }

    @Override
    public final Collection values() {
        i7.m mVar = this.f14535r;
        if (mVar != null) {
            return mVar;
        }
        i7.m mVar2 = new i7.m(2, this);
        this.f14535r = mVar2;
        return mVar2;
    }
}
