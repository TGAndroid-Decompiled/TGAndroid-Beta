package a0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class k {

    public int[] f26a;

    public Object[] f27b;

    public int f28c;

    public k(int i10) {
        this.f26a = i10 == 0 ? b0.a.f1881a : new int[i10];
        this.f27b = i10 == 0 ? b0.a.f1883c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f28c * 2;
        Object[] objArr = this.f27b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i10, Object obj) {
        int i11 = this.f28c;
        if (i11 == 0) {
            return -1;
        }
        int iA = b0.a.a(i11, i10, this.f26a);
        if (iA < 0 || kotlin.jvm.internal.j.a(obj, this.f27b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f26a[i12] == i10) {
            if (kotlin.jvm.internal.j.a(obj, this.f27b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f26a[i13] == i10; i13--) {
            if (kotlin.jvm.internal.j.a(obj, this.f27b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f28c > 0) {
            this.f26a = b0.a.f1881a;
            this.f27b = b0.a.f1883c;
            this.f28c = 0;
        }
        if (this.f28c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i10 = this.f28c;
        if (i10 == 0) {
            return -1;
        }
        int iA = b0.a.a(i10, 0, this.f26a);
        if (iA < 0 || this.f27b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f26a[i11] == 0) {
            if (this.f27b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f26a[i12] == 0; i12--) {
            if (this.f27b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object e(int i10) {
        if (i10 < 0 || i10 >= this.f28c) {
            throw new IllegalArgumentException(i0.a.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f27b[i10 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i10 = this.f28c;
                if (i10 != ((k) obj).f28c) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objE = e(i11);
                    Object objH = h(i11);
                    Object obj2 = kVar.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !kVar.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f28c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f28c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objE2 = e(i13);
                Object objH2 = h(i13);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f28c)) {
            throw new IllegalArgumentException(i0.a.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f27b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f26a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                qc.f.b(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f27b;
                qc.f.c(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f27b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.j.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f26a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f27b, i16 << 1);
            kotlin.jvm.internal.j.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f27b = objArrCopyOf;
            if (i11 != this.f28c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                qc.f.b(0, 0, i10, iArr, this.f26a);
                qc.f.c(0, 0, i12, objArr, this.f27b);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                qc.f.b(i10, i17, i11, iArr, this.f26a);
                qc.f.c(i12, i17 << 1, i11 << 1, objArr, this.f27b);
            }
        }
        if (i11 != this.f28c) {
            throw new ConcurrentModificationException();
        }
        this.f28c = i13;
        return obj;
    }

    public final Object g(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f28c) {
            throw new IllegalArgumentException(i0.a.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f27b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f27b[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f27b[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        if (i10 < 0 || i10 >= this.f28c) {
            throw new IllegalArgumentException(i0.a.k(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f27b[(i10 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f26a;
        Object[] objArr = this.f27b;
        int i10 = this.f28c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f28c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f28c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i11 = (iB << 1) + 1;
            Object[] objArr = this.f27b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iB;
        int[] iArr = this.f26a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.j.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f26a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f27b, i13 << 1);
            kotlin.jvm.internal.j.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f27b = objArrCopyOf;
            if (i10 != this.f28c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f26a;
            int i14 = i12 + 1;
            qc.f.b(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f27b;
            qc.f.c(i14 << 1, i12 << 1, this.f28c << 1, objArr2, objArr2);
        }
        int i15 = this.f28c;
        if (i10 == i15) {
            int[] iArr3 = this.f26a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
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
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
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
        int i10 = this.f28c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objE = e(i11);
            if (objE != sb2) {
                sb2.append(objE);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objH = h(i11);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.j.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !kotlin.jvm.internal.j.a(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !kotlin.jvm.internal.j.a(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }
}
