package i7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class n extends AbstractMap implements Serializable {

    public static final Object f10740s = new Object();

    public transient Object f10741a;

    public transient int[] f10742b;

    public transient Object[] f10743c;
    public transient Object[] d;

    public transient int f10744e = Math.min(Math.max(12, 1), 1073741823);

    public transient int f10745f;
    public transient j h;

    public transient j f10746n;

    public transient m f10747r;

    public final Map a() {
        Object obj = this.f10741a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i10, int i11) {
        Object obj = this.f10741a;
        obj.getClass();
        int[] iArr = this.f10742b;
        iArr.getClass();
        Object[] objArr = this.f10743c;
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
        Object obj2 = objArr[i12];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[i12];
        objArr[i12] = null;
        objArr2[i12] = null;
        iArr[i10] = iArr[i12];
        iArr[i12] = 0;
        int iA = g7.a8.a(obj2) & i11;
        int iB = g7.z7.b(iA, obj);
        if (iB == size) {
            g7.z7.d(iA, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iB - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iB = i15;
        }
    }

    public final boolean c() {
        return this.f10741a == null;
    }

    @Override
    public final void clear() {
        if (c()) {
            return;
        }
        this.f10744e += 32;
        Map mapA = a();
        if (mapA != null) {
            this.f10744e = Math.min(Math.max(size(), 3), 1073741823);
            mapA.clear();
            this.f10741a = null;
            this.f10745f = 0;
            return;
        }
        Object[] objArr = this.f10743c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f10745f, (Object) null);
        Object[] objArr2 = this.d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f10745f, (Object) null);
        Object obj = this.f10741a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f10742b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f10745f, 0);
        this.f10745f = 0;
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
        for (int i10 = 0; i10 < this.f10745f; i10++) {
            Object[] objArr = this.d;
            objArr.getClass();
            if (g7.d8.a(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f10744e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int iA = g7.a8.a(obj);
        int iD = d();
        Object obj2 = this.f10741a;
        obj2.getClass();
        int iB = g7.z7.b(iA & iD, obj2);
        if (iB != 0) {
            int i10 = ~iD;
            int i11 = iA & i10;
            do {
                int i12 = iB - 1;
                int[] iArr = this.f10742b;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f10743c;
                    objArr.getClass();
                    if (g7.d8.a(obj, objArr[i12])) {
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
        j jVar = this.f10746n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.f10746n = jVar2;
        return jVar2;
    }

    public final int f(int i10, int i11, int i12, int i13) {
        Object objC = g7.z7.c(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            g7.z7.d(i12 & i14, i13 + 1, objC);
        }
        Object obj = this.f10741a;
        obj.getClass();
        int[] iArr = this.f10742b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iB = g7.z7.b(i15, obj);
            while (iB != 0) {
                int i16 = iB - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iB2 = g7.z7.b(i19, objC);
                g7.z7.d(i19, iB, objC);
                iArr[i16] = ((~i14) & i18) | (iB2 & i14);
                iB = i17 & i10;
            }
        }
        this.f10741a = objC;
        this.f10744e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f10744e & (-32));
        return i14;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int iD = d();
            Object obj2 = this.f10741a;
            obj2.getClass();
            int[] iArr = this.f10742b;
            iArr.getClass();
            Object[] objArr = this.f10743c;
            objArr.getClass();
            int iA = g7.z7.a(obj, null, iD, obj2, iArr, objArr, null);
            if (iA != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[iA];
                b(iA, iD);
                this.f10745f--;
                this.f10744e += 32;
                return obj3;
            }
        }
        return f10740s;
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
        j jVar = this.h;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.h = jVar2;
        return jVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i10 = this.f10744e;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f10741a = g7.z7.c(iMax2);
            this.f10744e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f10744e & (-32));
            this.f10742b = new int[i10];
            this.f10743c = new Object[i10];
            this.d = new Object[i10];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.f10742b;
        iArr.getClass();
        Object[] objArr = this.f10743c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i11 = this.f10745f;
        int i12 = i11 + 1;
        int iA = g7.a8.a(obj);
        int iD = d();
        int i13 = iA & iD;
        Object obj3 = this.f10741a;
        obj3.getClass();
        int iB = g7.z7.b(i13, obj3);
        if (iB != 0) {
            int i14 = ~iD;
            int i15 = iA & i14;
            int i16 = 0;
            while (true) {
                int i17 = iB - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && g7.d8.a(obj, objArr[i17])) {
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
                        Object[] objArr3 = this.f10743c;
                        objArr3.getClass();
                        Object obj5 = objArr3[i22];
                        Object[] objArr4 = this.d;
                        objArr4.getClass();
                        linkedHashMap.put(obj5, objArr4[i22]);
                        int i23 = i22 + 1;
                        i22 = i23 < this.f10745f ? i23 : -1;
                    }
                    this.f10741a = linkedHashMap;
                    this.f10742b = null;
                    this.f10743c = null;
                    this.d = null;
                    this.f10744e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i16 = i21;
                iB = i20;
            }
        } else if (i12 > iD) {
            iD = f(iD, (iD + 1) * (iD < 32 ? 4 : 2), iA, i11);
        } else {
            Object obj6 = this.f10741a;
            obj6.getClass();
            g7.z7.d(i13, i12, obj6);
        }
        int[] iArr2 = this.f10742b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i12 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f10742b;
            iArr3.getClass();
            this.f10742b = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f10743c;
            objArr5.getClass();
            this.f10743c = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.d;
            objArr6.getClass();
            this.d = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.f10742b;
        iArr4.getClass();
        iArr4[i11] = (~iD) & iA;
        Object[] objArr7 = this.f10743c;
        objArr7.getClass();
        objArr7[i11] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i11] = obj2;
        this.f10745f = i12;
        this.f10744e += 32;
        return null;
    }

    @Override
    public final Object remove(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f10740s) {
            return null;
        }
        return objG;
    }

    @Override
    public final int size() {
        Map mapA = a();
        return mapA != null ? mapA.size() : this.f10745f;
    }

    @Override
    public final Collection values() {
        m mVar = this.f10747r;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(0, this);
        this.f10747r = mVar2;
        return mVar2;
    }
}
