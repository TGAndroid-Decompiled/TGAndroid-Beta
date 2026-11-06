package c8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class d extends AbstractMap implements Serializable {
    public static final Object f5413s = new Object();
    public transient Object f5414a;
    public transient int[] f5415b;
    public transient Object[] f5416c;
    public transient Object[] d;
    public transient int f5417e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f5418f;
    public transient b h;
    public transient b f5419n;
    public transient a8.n f5420r;

    public final Map b() {
        Object obj = this.f5414a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void c(int i7, int i10) {
        Object obj = this.f5414a;
        obj.getClass();
        int[] iArr = this.f5415b;
        iArr.getClass();
        Object[] objArr = this.f5416c;
        objArr.getClass();
        Object[] objArr2 = this.d;
        objArr2.getClass();
        int size = size();
        int i11 = size - 1;
        if (i7 < i11) {
            int i12 = i7 + 1;
            Object obj2 = objArr[i11];
            objArr[i7] = obj2;
            objArr2[i7] = objArr2[i11];
            objArr[i11] = null;
            objArr2[i11] = null;
            iArr[i7] = iArr[i11];
            iArr[i11] = 0;
            int a10 = a8.w7.a(obj2) & i10;
            int b10 = a8.v7.b(a10, obj);
            if (b10 == size) {
                a8.v7.d(a10, i12, obj);
                return;
            }
            while (true) {
                int i13 = b10 - 1;
                int i14 = iArr[i13];
                int i15 = i14 & i10;
                if (i15 != size) {
                    b10 = i15;
                } else {
                    iArr[i13] = (i14 & (~i10)) | (i10 & i12);
                    return;
                }
            }
        } else {
            objArr[i7] = null;
            objArr2[i7] = null;
            iArr[i7] = 0;
        }
    }

    @Override
    public final void clear() {
        if (d()) {
            return;
        }
        this.f5417e += 32;
        Map b10 = b();
        if (b10 == null) {
            Object[] objArr = this.f5416c;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f5418f, (Object) null);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f5418f, (Object) null);
            Object obj = this.f5414a;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f5415b;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f5418f, 0);
            this.f5418f = 0;
            return;
        }
        this.f5417e = Math.min(Math.max(size(), 3), 1073741823);
        b10.clear();
        this.f5414a = null;
        this.f5418f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsKey(obj);
        }
        if (f(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 == null) {
            for (int i7 = 0; i7 < this.f5418f; i7++) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (a8.e8.a(obj, objArr[i7])) {
                    return true;
                }
            }
            return false;
        }
        return b10.containsValue(obj);
    }

    public final boolean d() {
        if (this.f5414a == null) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (1 << (this.f5417e & 31)) - 1;
    }

    @Override
    public final Set entrySet() {
        b bVar = this.f5419n;
        if (bVar == null) {
            b bVar2 = new b(this, 0);
            this.f5419n = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final int f(Object obj) {
        if (d()) {
            return -1;
        }
        int a10 = a8.w7.a(obj);
        int e10 = e();
        Object obj2 = this.f5414a;
        obj2.getClass();
        int b10 = a8.v7.b(a10 & e10, obj2);
        if (b10 == 0) {
            return -1;
        }
        int i7 = ~e10;
        int i10 = a10 & i7;
        do {
            int i11 = b10 - 1;
            int[] iArr = this.f5415b;
            iArr.getClass();
            int i12 = iArr[i11];
            if ((i12 & i7) == i10) {
                Object[] objArr = this.f5416c;
                objArr.getClass();
                if (a8.e8.a(obj, objArr[i11])) {
                    return i11;
                }
            }
            b10 = i12 & e10;
        } while (b10 != 0);
        return -1;
    }

    public final int g(int i7, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object c10 = a8.v7.c(i10);
        if (i12 != 0) {
            a8.v7.d(i11 & i13, i12 + 1, c10);
        }
        Object obj = this.f5414a;
        obj.getClass();
        int[] iArr = this.f5415b;
        iArr.getClass();
        for (int i14 = 0; i14 <= i7; i14++) {
            int b10 = a8.v7.b(i14, obj);
            while (b10 != 0) {
                int i15 = b10 - 1;
                int i16 = iArr[i15];
                int i17 = ((~i7) & i16) | i14;
                int i18 = i17 & i13;
                int b11 = a8.v7.b(i18, c10);
                a8.v7.d(i18, b10, c10);
                iArr[i15] = ((~i13) & i17) | (b11 & i13);
                b10 = i16 & i7;
            }
        }
        this.f5414a = c10;
        this.f5417e = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f5417e & (-32));
        return i13;
    }

    @Override
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int f10 = f(obj);
        if (f10 == -1) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[f10];
    }

    public final Object h(Object obj) {
        if (!d()) {
            int e10 = e();
            Object obj2 = this.f5414a;
            obj2.getClass();
            int[] iArr = this.f5415b;
            iArr.getClass();
            Object[] objArr = this.f5416c;
            objArr.getClass();
            int a10 = a8.v7.a(obj, null, e10, obj2, iArr, objArr, null);
            if (a10 != -1) {
                Object[] objArr2 = this.d;
                objArr2.getClass();
                Object obj3 = objArr2[a10];
                c(a10, e10);
                this.f5418f--;
                this.f5417e += 32;
                return obj3;
            }
        }
        return f5413s;
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
        int i7;
        int i10;
        int i11;
        int i12 = 32;
        if (d()) {
            if (d()) {
                int i13 = this.f5417e;
                int max = Math.max(i13 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f5414a = a8.v7.c(max2);
                this.f5417e = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f5417e & (-32));
                this.f5415b = new int[i13];
                this.f5416c = new Object[i13];
                this.d = new Object[i13];
            } else {
                throw new IllegalStateException("Arrays already allocated");
            }
        }
        Map b10 = b();
        if (b10 == null) {
            int[] iArr = this.f5415b;
            iArr.getClass();
            Object[] objArr = this.f5416c;
            objArr.getClass();
            Object[] objArr2 = this.d;
            objArr2.getClass();
            int i14 = this.f5418f;
            int i15 = i14 + 1;
            int a10 = a8.w7.a(obj);
            int e10 = e();
            int i16 = a10 & e10;
            Object obj3 = this.f5414a;
            obj3.getClass();
            int b11 = a8.v7.b(i16, obj3);
            if (b11 == 0) {
                if (i15 > e10) {
                    if (e10 < 32) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    e10 = g(e10, (e10 + 1) * i11, a10, i14);
                } else {
                    Object obj4 = this.f5414a;
                    obj4.getClass();
                    a8.v7.d(i16, i15, obj4);
                }
                i7 = 1;
            } else {
                int i17 = ~e10;
                int i18 = a10 & i17;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    int i21 = b11 - 1;
                    int i22 = iArr[i21];
                    i7 = 1;
                    int i23 = i22 & i17;
                    int i24 = i12;
                    if (i23 == i18 && a8.e8.a(obj, objArr[i21])) {
                        Object obj5 = objArr2[i21];
                        objArr2[i21] = obj2;
                        return obj5;
                    }
                    int i25 = i22 & e10;
                    int i26 = i20 + 1;
                    if (i25 == 0) {
                        if (i26 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(e() + 1, 1.0f);
                            if (isEmpty()) {
                                i19 = -1;
                            }
                            while (i19 >= 0) {
                                Object[] objArr3 = this.f5416c;
                                objArr3.getClass();
                                Object obj6 = objArr3[i19];
                                Object[] objArr4 = this.d;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[i19]);
                                int i27 = i19 + 1;
                                if (i27 >= this.f5418f) {
                                    i19 = -1;
                                } else {
                                    i19 = i27;
                                }
                            }
                            this.f5414a = linkedHashMap;
                            this.f5415b = null;
                            this.f5416c = null;
                            this.d = null;
                            this.f5417e += 32;
                            return linkedHashMap.put(obj, obj2);
                        } else if (i15 > e10) {
                            if (e10 < i24) {
                                i10 = 4;
                            } else {
                                i10 = 2;
                            }
                            e10 = g(e10, (e10 + 1) * i10, a10, i14);
                        } else {
                            iArr[i21] = (i15 & e10) | i23;
                        }
                    } else {
                        i20 = i26;
                        b11 = i25;
                        i12 = i24;
                    }
                }
            }
            int[] iArr2 = this.f5415b;
            iArr2.getClass();
            int length = iArr2.length;
            if (i15 > length) {
                int i28 = i7;
                int min = Math.min(1073741823, (Math.max(i28, length >>> 1) + length) | i28);
                if (min != length) {
                    int[] iArr3 = this.f5415b;
                    iArr3.getClass();
                    this.f5415b = Arrays.copyOf(iArr3, min);
                    Object[] objArr5 = this.f5416c;
                    objArr5.getClass();
                    this.f5416c = Arrays.copyOf(objArr5, min);
                    Object[] objArr6 = this.d;
                    objArr6.getClass();
                    this.d = Arrays.copyOf(objArr6, min);
                }
            }
            int[] iArr4 = this.f5415b;
            iArr4.getClass();
            iArr4[i14] = (~e10) & a10;
            Object[] objArr7 = this.f5416c;
            objArr7.getClass();
            objArr7[i14] = obj;
            Object[] objArr8 = this.d;
            objArr8.getClass();
            objArr8[i14] = obj2;
            this.f5418f = i15;
            this.f5417e += 32;
            return null;
        }
        return b10.put(obj, obj2);
    }

    @Override
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object h = h(obj);
        if (h == f5413s) {
            return null;
        }
        return h;
    }

    @Override
    public final int size() {
        Map b10 = b();
        if (b10 != null) {
            return b10.size();
        }
        return this.f5418f;
    }

    @Override
    public final Collection values() {
        a8.n nVar = this.f5420r;
        if (nVar == null) {
            a8.n nVar2 = new a8.n((Object) this, 2);
            this.f5420r = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
