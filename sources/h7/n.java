package h7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class n extends AbstractMap implements Serializable {
    public static final Object f10031s = new Object();
    public transient Object f10032a;
    public transient int[] f10033b;
    public transient Object[] f10034c;
    public transient Object[] d;
    public transient int f10035e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f10036f;
    public transient j h;
    public transient j f10037n;
    public transient m f10038r;

    public final Map a() {
        Object obj = this.f10032a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i9, int i10) {
        Object obj = this.f10032a;
        obj.getClass();
        int[] iArr = this.f10033b;
        iArr.getClass();
        Object[] objArr = this.f10034c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i11 = size - 1;
        if (i9 < i11) {
            Object obj2 = objArr[i11];
            objArr[i9] = obj2;
            objArr2[i9] = objArr2[i11];
            objArr[i11] = null;
            objArr2[i11] = null;
            iArr[i9] = iArr[i11];
            iArr[i11] = 0;
            int a2 = f7.x7.a(obj2) & i10;
            int b10 = f7.w7.b(a2, obj);
            if (b10 == size) {
                f7.w7.d(a2, i9 + 1, obj);
                return;
            }
            while (true) {
                int i12 = b10 - 1;
                int i13 = iArr[i12];
                int i14 = i13 & i10;
                if (i14 != size) {
                    b10 = i14;
                } else {
                    iArr[i12] = ((i9 + 1) & i10) | (i13 & (~i10));
                    return;
                }
            }
        } else {
            objArr[i9] = null;
            objArr2[i9] = null;
            iArr[i9] = 0;
        }
    }

    public final boolean c() {
        if (this.f10032a == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void clear() {
        if (c()) {
            return;
        }
        this.f10035e += 32;
        Map a2 = a();
        if (a2 != null) {
            this.f10035e = Math.min(Math.max(size(), 3), 1073741823);
            a2.clear();
            this.f10032a = null;
            this.f10036f = 0;
            return;
        }
        Object[] objArr = this.f10034c;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f10036f, (Object) null);
        Object[] objArr2 = this.d;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f10036f, (Object) null);
        Object obj = this.f10032a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f10033b;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f10036f, 0);
        this.f10036f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.containsKey(obj);
        }
        if (e(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map a2 = a();
        if (a2 == null) {
            for (int i9 = 0; i9 < this.f10036f; i9++) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (f7.a8.a(obj, objArr[i9])) {
                    return true;
                }
            }
            return false;
        }
        return a2.containsValue(obj);
    }

    public final int d() {
        return (1 << (this.f10035e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int a2 = f7.x7.a(obj);
        int d = d();
        Object obj2 = this.f10032a;
        obj2.getClass();
        int b10 = f7.w7.b(a2 & d, obj2);
        if (b10 == 0) {
            return -1;
        }
        int i9 = ~d;
        int i10 = a2 & i9;
        do {
            int i11 = b10 - 1;
            int[] iArr = this.f10033b;
            iArr.getClass();
            int i12 = iArr[i11];
            if ((i12 & i9) == i10) {
                Object[] objArr = this.f10034c;
                objArr.getClass();
                if (f7.a8.a(obj, objArr[i11])) {
                    return i11;
                }
            }
            b10 = i12 & d;
        } while (b10 != 0);
        return -1;
    }

    @Override
    public final Set entrySet() {
        j jVar = this.f10037n;
        if (jVar == null) {
            j jVar2 = new j(this, 0);
            this.f10037n = jVar2;
            return jVar2;
        }
        return jVar;
    }

    public final int f(int i9, int i10, int i11, int i12) {
        Object c10 = f7.w7.c(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            f7.w7.d(i11 & i13, i12 + 1, c10);
        }
        Object obj = this.f10032a;
        obj.getClass();
        int[] iArr = this.f10033b;
        iArr.getClass();
        for (int i14 = 0; i14 <= i9; i14++) {
            int b10 = f7.w7.b(i14, obj);
            while (b10 != 0) {
                int i15 = b10 - 1;
                int i16 = iArr[i15];
                int i17 = ((~i9) & i16) | i14;
                int i18 = i17 & i13;
                int b11 = f7.w7.b(i18, c10);
                f7.w7.d(i18, b10, c10);
                iArr[i15] = ((~i13) & i17) | (b11 & i13);
                b10 = i16 & i9;
            }
        }
        this.f10032a = c10;
        this.f10035e = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f10035e & (-32));
        return i13;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int d = d();
            Object obj2 = this.f10032a;
            obj2.getClass();
            int[] iArr = this.f10033b;
            iArr.getClass();
            Object[] objArr = this.f10034c;
            objArr.getClass();
            int a2 = f7.w7.a(obj, null, d, obj2, iArr, objArr, null);
            if (a2 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a2];
                b(a2, d);
                this.f10036f--;
                this.f10035e += 32;
                return obj3;
            }
        }
        return f10031s;
    }

    @Override
    public final Object get(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.get(obj);
        }
        int e10 = e(obj);
        if (e10 == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[e10];
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        j jVar = this.h;
        if (jVar == null) {
            j jVar2 = new j(this, 1);
            this.h = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int i9;
        int min;
        int i10;
        if (c()) {
            if (c()) {
                int i11 = this.f10035e;
                int max = Math.max(i11 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f10032a = f7.w7.c(max2);
                this.f10035e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f10035e & (-32));
                this.f10033b = new int[i11];
                this.f10034c = new Object[i11];
                this.d = new Object[i11];
            } else {
                throw new IllegalStateException("Arrays already allocated");
            }
        }
        Map a2 = a();
        if (a2 != null) {
            return a2.put(obj, obj2);
        }
        int[] iArr = this.f10033b;
        iArr.getClass();
        Object[] objArr = this.f10034c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int i12 = this.f10036f;
        int i13 = i12 + 1;
        int a3 = f7.x7.a(obj);
        int d = d();
        int i14 = a3 & d;
        Object obj3 = this.f10032a;
        obj3.getClass();
        int b10 = f7.w7.b(i14, obj3);
        if (b10 == 0) {
            if (i13 > d) {
                if (d < 32) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                d = f(d, (d + 1) * i10, a3, i12);
            } else {
                Object obj4 = this.f10032a;
                obj4.getClass();
                f7.w7.d(i14, i13, obj4);
            }
        } else {
            int i15 = ~d;
            int i16 = a3 & i15;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int i19 = b10 - 1;
                int i20 = iArr[i19];
                int i21 = i20 & i15;
                if (i21 == i16 && f7.a8.a(obj, objArr[i19])) {
                    Object obj5 = objArr2[i19];
                    objArr2[i19] = obj2;
                    return obj5;
                }
                int i22 = i20 & d;
                int i23 = i18 + 1;
                if (i22 == 0) {
                    if (i23 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        if (isEmpty()) {
                            i17 = -1;
                        }
                        while (i17 >= 0) {
                            Object[] objArr3 = this.f10034c;
                            objArr3.getClass();
                            Object obj6 = objArr3[i17];
                            Object[] objArr4 = this.d;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i17]);
                            int i24 = i17 + 1;
                            if (i24 >= this.f10036f) {
                                i17 = -1;
                            } else {
                                i17 = i24;
                            }
                        }
                        this.f10032a = linkedHashMap;
                        this.f10033b = null;
                        this.f10034c = null;
                        this.d = null;
                        this.f10035e += 32;
                        return linkedHashMap.put(obj, obj2);
                    } else if (i13 > d) {
                        if (d < 32) {
                            i9 = 4;
                        } else {
                            i9 = 2;
                        }
                        d = f(d, (d + 1) * i9, a3, i12);
                    } else {
                        iArr[i19] = (i13 & d) | i21;
                    }
                } else {
                    i18 = i23;
                    b10 = i22;
                }
            }
        }
        int[] iArr2 = this.f10033b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f10033b;
            iArr3.getClass();
            this.f10033b = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.f10034c;
            objArr5.getClass();
            this.f10034c = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.d;
            objArr6.getClass();
            this.d = Arrays.copyOf(objArr6, min);
        }
        int[] iArr4 = this.f10033b;
        iArr4.getClass();
        iArr4[i12] = (~d) & a3;
        Object[] objArr7 = this.f10034c;
        objArr7.getClass();
        objArr7[i12] = obj;
        Object[] objArr8 = this.d;
        objArr8.getClass();
        objArr8[i12] = obj2;
        this.f10036f = i13;
        this.f10035e += 32;
        return null;
    }

    @Override
    public final Object remove(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f10031s) {
            return null;
        }
        return g10;
    }

    @Override
    public final int size() {
        Map a2 = a();
        if (a2 != null) {
            return a2.size();
        }
        return this.f10036f;
    }

    @Override
    public final Collection values() {
        m mVar = this.f10038r;
        if (mVar == null) {
            m mVar2 = new m(0, this);
            this.f10038r = mVar2;
            return mVar2;
        }
        return mVar;
    }
}
