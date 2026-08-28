package a0;

import j3.r0;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
public class k {
    public int[] f26a;
    public Object[] f27b;
    public int f28c;

    public k(int i9) {
        int[] iArr;
        Object[] objArr;
        if (i9 == 0) {
            iArr = b0.a.f1385a;
        } else {
            iArr = new int[i9];
        }
        this.f26a = iArr;
        if (i9 == 0) {
            objArr = b0.a.f1387c;
        } else {
            objArr = new Object[i9 << 1];
        }
        this.f27b = objArr;
    }

    public final int a(Object obj) {
        int i9 = this.f28c * 2;
        Object[] objArr = this.f27b;
        if (obj == null) {
            for (int i10 = 1; i10 < i9; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i9; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i9, Object obj) {
        int i10 = this.f28c;
        if (i10 == 0) {
            return -1;
        }
        int a2 = b0.a.a(i10, i9, this.f26a);
        if (a2 < 0 || kotlin.jvm.internal.i.a(obj, this.f27b[a2 << 1])) {
            return a2;
        }
        int i11 = a2 + 1;
        while (i11 < i10 && this.f26a[i11] == i9) {
            if (kotlin.jvm.internal.i.a(obj, this.f27b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a2 - 1; i12 >= 0 && this.f26a[i12] == i9; i12--) {
            if (kotlin.jvm.internal.i.a(obj, this.f27b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int c(Object obj) {
        if (obj == null) {
            return d();
        }
        return b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f28c > 0) {
            this.f26a = b0.a.f1385a;
            this.f27b = b0.a.f1387c;
            this.f28c = 0;
        }
        if (this.f28c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (c(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        int i9 = this.f28c;
        if (i9 == 0) {
            return -1;
        }
        int a2 = b0.a.a(i9, 0, this.f26a);
        if (a2 < 0 || this.f27b[a2 << 1] == null) {
            return a2;
        }
        int i10 = a2 + 1;
        while (i10 < i9 && this.f26a[i10] == 0) {
            if (this.f27b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a2 - 1; i11 >= 0 && this.f26a[i11] == 0; i11--) {
            if (this.f27b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final Object e(int i9) {
        if (i9 >= 0 && i9 < this.f28c) {
            return this.f27b[i9 << 1];
        }
        throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i9 = this.f28c;
                if (i9 != ((k) obj).f28c) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object e10 = e(i10);
                    Object h = h(i10);
                    Object obj2 = kVar.get(e10);
                    if (h == null) {
                        if (obj2 != null || !kVar.containsKey(e10)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f28c != ((Map) obj).size()) {
                return false;
            } else {
                int i11 = this.f28c;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object e11 = e(i12);
                    Object h10 = h(i12);
                    Object obj3 = ((Map) obj).get(e11);
                    if (h10 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(e11)) {
                            return false;
                        }
                    } else if (!h10.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i9) {
        int i10;
        if (i9 >= 0 && i9 < (i10 = this.f28c)) {
            Object[] objArr = this.f27b;
            int i11 = i9 << 1;
            Object obj = objArr[i11 + 1];
            if (i10 <= 1) {
                clear();
                return obj;
            }
            int i12 = i10 - 1;
            int[] iArr = this.f26a;
            int i13 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i13 = i10 + (i10 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i13);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
                this.f26a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f27b, i13 << 1);
                kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
                this.f27b = copyOf2;
                if (i10 == this.f28c) {
                    if (i9 > 0) {
                        pc.f.b(0, 0, i9, iArr, this.f26a);
                        pc.f.c(0, 0, i11, objArr, this.f27b);
                    }
                    if (i9 < i12) {
                        int i14 = i9 + 1;
                        pc.f.b(i9, i14, i10, iArr, this.f26a);
                        pc.f.c(i11, i14 << 1, i10 << 1, objArr, this.f27b);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i9 < i12) {
                    int i15 = i9 + 1;
                    pc.f.b(i9, i15, i10, iArr, iArr);
                    Object[] objArr2 = this.f27b;
                    pc.f.c(i11, i15 << 1, i10 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f27b;
                int i16 = i12 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            }
            if (i10 == this.f28c) {
                this.f28c = i12;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object g(int i9, Object obj) {
        if (i9 >= 0 && i9 < this.f28c) {
            int i10 = (i9 << 1) + 1;
            Object[] objArr = this.f27b;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object get(Object obj) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return this.f27b[(c10 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return this.f27b[(c10 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i9) {
        if (i9 >= 0 && i9 < this.f28c) {
            return this.f27b[(i9 << 1) + 1];
        }
        throw new IllegalArgumentException(r0.l(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int hashCode() {
        int i9;
        int[] iArr = this.f26a;
        Object[] objArr = this.f27b;
        int i10 = this.f28c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i13 += i9 ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final boolean isEmpty() {
        if (this.f28c <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i9;
        int d;
        int i10 = this.f28c;
        if (obj != null) {
            i9 = obj.hashCode();
        } else {
            i9 = 0;
        }
        if (obj != null) {
            d = b(i9, obj);
        } else {
            d = d();
        }
        if (d >= 0) {
            int i11 = (d << 1) + 1;
            Object[] objArr = this.f27b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~d;
        int[] iArr = this.f26a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f26a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f27b, i13 << 1);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f27b = copyOf2;
            if (i10 != this.f28c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f26a;
            int i14 = i12 + 1;
            pc.f.b(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f27b;
            pc.f.c(i14 << 1, i12 << 1, this.f28c << 1, objArr2, objArr2);
        }
        int i15 = this.f28c;
        if (i10 == i15) {
            int[] iArr3 = this.f26a;
            if (i12 < iArr3.length) {
                iArr3[i12] = i9;
                Object[] objArr3 = this.f27b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f28c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return f(c10);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c10 = c(obj);
        if (c10 >= 0) {
            return g(c10, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f28c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f28c * 28);
        sb2.append('{');
        int i9 = this.f28c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object e10 = e(i10);
            if (e10 != sb2) {
                sb2.append(e10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object h = h(i10);
            if (h != sb2) {
                sb2.append(h);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c10 = c(obj);
        if (c10 < 0 || !kotlin.jvm.internal.i.a(obj2, h(c10))) {
            return false;
        }
        f(c10);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c10 = c(obj);
        if (c10 < 0 || !kotlin.jvm.internal.i.a(obj2, h(c10))) {
            return false;
        }
        g(c10, obj3);
        return true;
    }
}
