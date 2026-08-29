package l7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class d extends AbstractMap implements Serializable {
    public static final Object f14533s = new Object();
    public transient Object f14534a;
    public transient int[] f14535b;
    public transient Object[] f14536c;
    public transient Object[] d;
    public transient int f14537e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f14538f;
    public transient b h;
    public transient b f14539n;
    public transient j7.m f14540r;

    public final Map a() {
        Object obj = this.f14534a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i10, int i11) {
        Object obj = this.f14534a;
        obj.getClass();
        int[] iArr = this.f14535b;
        iArr.getClass();
        Object[] objArr = this.f14536c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            int i13 = i10 + 1;
            Object obj2 = objArr[i12];
            objArr[i10] = obj2;
            objArr2[i10] = objArr2[i12];
            objArr[i12] = null;
            objArr2[i12] = null;
            iArr[i10] = iArr[i12];
            iArr[i12] = 0;
            int a2 = i7.n.a(obj2) & i11;
            int b10 = i7.m.b(a2, obj);
            if (b10 == size) {
                i7.m.d(a2, i13, obj);
                return;
            }
            while (true) {
                int i14 = b10 - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i11;
                if (i16 != size) {
                    b10 = i16;
                } else {
                    iArr[i14] = (i15 & (~i11)) | (i11 & i13);
                    return;
                }
            }
        } else {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
        }
    }

    public final boolean c() {
        if (this.f14534a == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void clear() {
        if (c()) {
            return;
        }
        this.f14537e += 32;
        Map a2 = a();
        if (a2 == null) {
            Object[] objArr = this.f14536c;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f14538f, (Object) null);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f14538f, (Object) null);
            Object obj = this.f14534a;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f14535b;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f14538f, 0);
            this.f14538f = 0;
            return;
        }
        this.f14537e = Math.min(Math.max(size(), 3), 1073741823);
        a2.clear();
        this.f14534a = null;
        this.f14538f = 0;
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
            for (int i10 = 0; i10 < this.f14538f; i10++) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (i7.q.a(obj, objArr[i10])) {
                    return true;
                }
            }
            return false;
        }
        return a2.containsValue(obj);
    }

    public final int d() {
        return (1 << (this.f14537e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int a2 = i7.n.a(obj);
        int d = d();
        Object obj2 = this.f14534a;
        obj2.getClass();
        int b10 = i7.m.b(a2 & d, obj2);
        if (b10 == 0) {
            return -1;
        }
        int i10 = ~d;
        int i11 = a2 & i10;
        do {
            int i12 = b10 - 1;
            int[] iArr = this.f14535b;
            iArr.getClass();
            int i13 = iArr[i12];
            if ((i13 & i10) == i11) {
                Object[] objArr = this.f14536c;
                objArr.getClass();
                if (i7.q.a(obj, objArr[i12])) {
                    return i12;
                }
            }
            b10 = i13 & d;
        } while (b10 != 0);
        return -1;
    }

    @Override
    public final Set entrySet() {
        b bVar = this.f14539n;
        if (bVar == null) {
            b bVar2 = new b(this, 0);
            this.f14539n = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final int f(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object c3 = i7.m.c(i11);
        if (i13 != 0) {
            i7.m.d(i12 & i14, i13 + 1, c3);
        }
        Object obj = this.f14534a;
        obj.getClass();
        int[] iArr = this.f14535b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int b10 = i7.m.b(i15, obj);
            while (b10 != 0) {
                int i16 = b10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int b11 = i7.m.b(i19, c3);
                i7.m.d(i19, b10, c3);
                iArr[i16] = ((~i14) & i18) | (b11 & i14);
                b10 = i17 & i10;
            }
        }
        this.f14534a = c3;
        this.f14537e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f14537e & (-32));
        return i14;
    }

    public final Object g(Object obj) {
        if (!c()) {
            int d = d();
            Object obj2 = this.f14534a;
            obj2.getClass();
            int[] iArr = this.f14535b;
            iArr.getClass();
            Object[] objArr = this.f14536c;
            objArr.getClass();
            int a2 = i7.m.a(obj, null, d, obj2, iArr, objArr, null);
            if (a2 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a2];
                b(a2, d);
                this.f14538f--;
                this.f14537e += 32;
                return obj3;
            }
        }
        return f14533s;
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
        b bVar = this.h;
        if (bVar == null) {
            b bVar2 = new b(this, 1);
            this.h = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        int i10;
        int min;
        int i11;
        if (c()) {
            if (c()) {
                int i12 = this.f14537e;
                int max = Math.max(i12 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f14534a = i7.m.c(max2);
                this.f14537e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f14537e & (-32));
                this.f14535b = new int[i12];
                this.f14536c = new Object[i12];
                this.d = new Object[i12];
            } else {
                throw new IllegalStateException("Arrays already allocated");
            }
        }
        Map a2 = a();
        if (a2 == null) {
            int[] iArr = this.f14535b;
            iArr.getClass();
            Object[] objArr = this.f14536c;
            objArr.getClass();
            Object[] objArr2 = this.d;
            objArr2.getClass();
            int i13 = this.f14538f;
            int i14 = i13 + 1;
            int a10 = i7.n.a(obj);
            int d = d();
            int i15 = a10 & d;
            Object obj3 = this.f14534a;
            obj3.getClass();
            int b10 = i7.m.b(i15, obj3);
            if (b10 == 0) {
                if (i14 > d) {
                    if (d < 32) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    d = f(d, (d + 1) * i11, a10, i13);
                } else {
                    Object obj4 = this.f14534a;
                    obj4.getClass();
                    i7.m.d(i15, i14, obj4);
                }
            } else {
                int i16 = ~d;
                int i17 = a10 & i16;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    int i20 = b10 - 1;
                    int i21 = iArr[i20];
                    int i22 = i21 & i16;
                    if (i22 == i17 && i7.q.a(obj, objArr[i20])) {
                        Object obj5 = objArr2[i20];
                        objArr2[i20] = obj2;
                        return obj5;
                    }
                    int i23 = i21 & d;
                    int i24 = i19 + 1;
                    if (i23 == 0) {
                        if (i24 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                            if (isEmpty()) {
                                i18 = -1;
                            }
                            while (i18 >= 0) {
                                Object[] objArr3 = this.f14536c;
                                objArr3.getClass();
                                Object obj6 = objArr3[i18];
                                Object[] objArr4 = this.d;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[i18]);
                                int i25 = i18 + 1;
                                if (i25 >= this.f14538f) {
                                    i18 = -1;
                                } else {
                                    i18 = i25;
                                }
                            }
                            this.f14534a = linkedHashMap;
                            this.f14535b = null;
                            this.f14536c = null;
                            this.d = null;
                            this.f14537e += 32;
                            return linkedHashMap.put(obj, obj2);
                        } else if (i14 > d) {
                            if (d < 32) {
                                i10 = 4;
                            } else {
                                i10 = 2;
                            }
                            d = f(d, (d + 1) * i10, a10, i13);
                        } else {
                            iArr[i20] = (i14 & d) | i22;
                        }
                    } else {
                        i19 = i24;
                        b10 = i23;
                    }
                }
            }
            int[] iArr2 = this.f14535b;
            iArr2.getClass();
            int length = iArr2.length;
            if (i14 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                int[] iArr3 = this.f14535b;
                iArr3.getClass();
                this.f14535b = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.f14536c;
                objArr5.getClass();
                this.f14536c = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.d;
                objArr6.getClass();
                this.d = Arrays.copyOf(objArr6, min);
            }
            int[] iArr4 = this.f14535b;
            iArr4.getClass();
            iArr4[i13] = (~d) & a10;
            Object[] objArr7 = this.f14536c;
            objArr7.getClass();
            objArr7[i13] = obj;
            Object[] objArr8 = this.d;
            objArr8.getClass();
            objArr8[i13] = obj2;
            this.f14538f = i14;
            this.f14537e += 32;
            return null;
        }
        return a2.put(obj, obj2);
    }

    @Override
    public final Object remove(Object obj) {
        Map a2 = a();
        if (a2 != null) {
            return a2.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f14533s) {
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
        return this.f14538f;
    }

    @Override
    public final Collection values() {
        j7.m mVar = this.f14540r;
        if (mVar == null) {
            j7.m mVar2 = new j7.m(2, this);
            this.f14540r = mVar2;
            return mVar2;
        }
        return mVar;
    }
}
