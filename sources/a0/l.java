package a0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
public class l {
    public int[] f26a;
    public Object[] f27b;
    public int f28c;

    public l(int i10) {
        int[] iArr;
        Object[] objArr;
        if (i10 == 0) {
            iArr = b0.a.f1576a;
        } else {
            iArr = new int[i10];
        }
        this.f26a = iArr;
        if (i10 == 0) {
            objArr = b0.a.f1578c;
        } else {
            objArr = new Object[i10 << 1];
        }
        this.f27b = objArr;
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
        int a2 = b0.a.a(i11, i10, this.f26a);
        if (a2 < 0 || kotlin.jvm.internal.i.a(obj, this.f27b[a2 << 1])) {
            return a2;
        }
        int i12 = a2 + 1;
        while (i12 < i11 && this.f26a[i12] == i10) {
            if (kotlin.jvm.internal.i.a(obj, this.f27b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a2 - 1; i13 >= 0 && this.f26a[i13] == i10; i13--) {
            if (kotlin.jvm.internal.i.a(obj, this.f27b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c(Object obj) {
        if (obj == null) {
            return d();
        }
        return b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f28c > 0) {
            this.f26a = b0.a.f1576a;
            this.f27b = b0.a.f1578c;
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
        int i10 = this.f28c;
        if (i10 == 0) {
            return -1;
        }
        int a2 = b0.a.a(i10, 0, this.f26a);
        if (a2 < 0 || this.f27b[a2 << 1] == null) {
            return a2;
        }
        int i11 = a2 + 1;
        while (i11 < i10 && this.f26a[i11] == 0) {
            if (this.f27b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a2 - 1; i12 >= 0 && this.f26a[i12] == 0; i12--) {
            if (this.f27b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object e(int i10) {
        if (i10 >= 0 && i10 < this.f28c) {
            return this.f27b[i10 << 1];
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof l) {
                int i10 = this.f28c;
                if (i10 != ((l) obj).f28c) {
                    return false;
                }
                l lVar = (l) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object e = e(i11);
                    Object h = h(i11);
                    Object obj2 = lVar.get(e);
                    if (h == null) {
                        if (obj2 != null || !lVar.containsKey(e)) {
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
                int i12 = this.f28c;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object e7 = e(i13);
                    Object h10 = h(i13);
                    Object obj3 = ((Map) obj).get(e7);
                    if (h10 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(e7)) {
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

    public final Object f(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f28c)) {
            Object[] objArr = this.f27b;
            int i12 = i10 << 1;
            Object obj = objArr[i12 + 1];
            if (i11 <= 1) {
                clear();
                return obj;
            }
            int i13 = i11 - 1;
            int[] iArr = this.f26a;
            int i14 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i14 = i11 + (i11 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i14);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
                this.f26a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f27b, i14 << 1);
                kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
                this.f27b = copyOf2;
                if (i11 == this.f28c) {
                    if (i10 > 0) {
                        hd.f.b(0, 0, i10, iArr, this.f26a);
                        hd.f.c(0, 0, i12, objArr, this.f27b);
                    }
                    if (i10 < i13) {
                        int i15 = i10 + 1;
                        hd.f.b(i10, i15, i11, iArr, this.f26a);
                        hd.f.c(i12, i15 << 1, i11 << 1, objArr, this.f27b);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i10 < i13) {
                    int i16 = i10 + 1;
                    hd.f.b(i10, i16, i11, iArr, iArr);
                    Object[] objArr2 = this.f27b;
                    hd.f.c(i12, i16 << 1, i11 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f27b;
                int i17 = i13 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            }
            if (i11 == this.f28c) {
                this.f28c = i13;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object g(int i10, Object obj) {
        if (i10 >= 0 && i10 < this.f28c) {
            int i11 = (i10 << 1) + 1;
            Object[] objArr = this.f27b;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
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

    public final Object h(int i10) {
        if (i10 >= 0 && i10 < this.f28c) {
            return this.f27b[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(hc.b.j(i10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int hashCode() {
        int i10;
        int[] iArr = this.f26a;
        Object[] objArr = this.f27b;
        int i11 = this.f28c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            int i15 = iArr[i13];
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i14 += i10 ^ i15;
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public final boolean isEmpty() {
        if (this.f28c <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i10;
        int d;
        int i11 = this.f28c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        if (obj != null) {
            d = b(i10, obj);
        } else {
            d = d();
        }
        if (d >= 0) {
            int i12 = (d << 1) + 1;
            Object[] objArr = this.f27b;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~d;
        int[] iArr = this.f26a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i14);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f26a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f27b, i14 << 1);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f27b = copyOf2;
            if (i11 != this.f28c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.f26a;
            int i15 = i13 + 1;
            hd.f.b(i15, i13, i11, iArr2, iArr2);
            Object[] objArr2 = this.f27b;
            hd.f.c(i15 << 1, i13 << 1, this.f28c << 1, objArr2, objArr2);
        }
        int i16 = this.f28c;
        if (i11 == i16) {
            int[] iArr3 = this.f26a;
            if (i13 < iArr3.length) {
                iArr3[i13] = i10;
                Object[] objArr3 = this.f27b;
                int i17 = i13 << 1;
                objArr3[i17] = obj;
                objArr3[i17 + 1] = obj2;
                this.f28c = i16 + 1;
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
        int i10 = this.f28c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object e = e(i11);
            if (e != sb2) {
                sb2.append(e);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object h = h(i11);
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
