package a0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k2.p1;
public class l {
    public int[] f29a;
    public Object[] f30b;
    public int f31c;

    public l(int i3) {
        int[] iArr;
        Object[] objArr;
        if (i3 == 0) {
            iArr = b0.a.f2320a;
        } else {
            iArr = new int[i3];
        }
        this.f29a = iArr;
        if (i3 == 0) {
            objArr = b0.a.f2322c;
        } else {
            objArr = new Object[i3 << 1];
        }
        this.f30b = objArr;
    }

    public final int b(Object obj) {
        int i3 = this.f31c * 2;
        Object[] objArr = this.f30b;
        if (obj == null) {
            for (int i10 = 1; i10 < i3; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i3; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final int c(int i3, Object obj) {
        int i10 = this.f31c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = b0.a.a(i10, i3, this.f29a);
        if (a10 < 0 || kotlin.jvm.internal.j.a(obj, this.f30b[a10 << 1])) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f29a[i11] == i3) {
            if (kotlin.jvm.internal.j.a(obj, this.f30b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f29a[i12] == i3; i12--) {
            if (kotlin.jvm.internal.j.a(obj, this.f30b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f31c > 0) {
            this.f29a = b0.a.f2320a;
            this.f30b = b0.a.f2322c;
            this.f31c = 0;
        }
        if (this.f31c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.f31c;
        if (i3 == 0) {
            return -1;
        }
        int a10 = b0.a.a(i3, 0, this.f29a);
        if (a10 < 0 || this.f30b[a10 << 1] == null) {
            return a10;
        }
        int i10 = a10 + 1;
        while (i10 < i3 && this.f29a[i10] == 0) {
            if (this.f30b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a10 - 1; i11 >= 0 && this.f29a[i11] == 0; i11--) {
            if (this.f30b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof l) {
                int i3 = this.f31c;
                if (i3 != ((l) obj).f31c) {
                    return false;
                }
                l lVar = (l) obj;
                for (int i10 = 0; i10 < i3; i10++) {
                    Object f10 = f(i10);
                    Object i11 = i(i10);
                    Object obj2 = lVar.get(f10);
                    if (i11 == null) {
                        if (obj2 != null || !lVar.containsKey(f10)) {
                            return false;
                        }
                    } else if (!i11.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f31c != ((Map) obj).size()) {
                return false;
            } else {
                int i12 = this.f31c;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object f11 = f(i13);
                    Object i14 = i(i13);
                    Object obj3 = ((Map) obj).get(f11);
                    if (i14 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f11)) {
                            return false;
                        }
                    } else if (!i14.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i3) {
        if (i3 >= 0 && i3 < this.f31c) {
            return this.f30b[i3 << 1];
        }
        throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object g(int i3) {
        int i10;
        if (i3 >= 0 && i3 < (i10 = this.f31c)) {
            Object[] objArr = this.f30b;
            int i11 = i3 << 1;
            Object obj = objArr[i11 + 1];
            if (i10 <= 1) {
                clear();
                return obj;
            }
            int i12 = i10 - 1;
            int[] iArr = this.f29a;
            int i13 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i13 = i10 + (i10 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i13);
                kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
                this.f29a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f30b, i13 << 1);
                kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
                this.f30b = copyOf2;
                if (i10 == this.f31c) {
                    if (i3 > 0) {
                        ed.f.b(0, 0, i3, iArr, this.f29a);
                        ed.f.c(0, 0, i11, objArr, this.f30b);
                    }
                    if (i3 < i12) {
                        int i14 = i3 + 1;
                        ed.f.b(i3, i14, i10, iArr, this.f29a);
                        ed.f.c(i11, i14 << 1, i10 << 1, objArr, this.f30b);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i3 < i12) {
                    int i15 = i3 + 1;
                    ed.f.b(i3, i15, i10, iArr, iArr);
                    Object[] objArr2 = this.f30b;
                    ed.f.c(i11, i15 << 1, i10 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f30b;
                int i16 = i12 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            }
            if (i10 == this.f31c) {
                this.f31c = i12;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.f30b[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return this.f30b[(d << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i3, Object obj) {
        if (i3 >= 0 && i3 < this.f31c) {
            int i10 = (i3 << 1) + 1;
            Object[] objArr = this.f30b;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int hashCode() {
        int i3;
        int[] iArr = this.f29a;
        Object[] objArr = this.f30b;
        int i10 = this.f31c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i13 += i3 ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final Object i(int i3) {
        if (i3 >= 0 && i3 < this.f31c) {
            return this.f30b[(i3 << 1) + 1];
        }
        throw new IllegalArgumentException(p1.i(i3, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean isEmpty() {
        if (this.f31c <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int e10;
        int i10 = this.f31c;
        if (obj != null) {
            i3 = obj.hashCode();
        } else {
            i3 = 0;
        }
        if (obj != null) {
            e10 = c(i3, obj);
        } else {
            e10 = e();
        }
        if (e10 >= 0) {
            int i11 = (e10 << 1) + 1;
            Object[] objArr = this.f30b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~e10;
        int[] iArr = this.f29a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f29a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f30b, i13 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f30b = copyOf2;
            if (i10 != this.f31c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f29a;
            int i14 = i12 + 1;
            ed.f.b(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f30b;
            ed.f.c(i14 << 1, i12 << 1, this.f31c << 1, objArr2, objArr2);
        }
        int i15 = this.f31c;
        if (i10 == i15) {
            int[] iArr3 = this.f29a;
            if (i12 < iArr3.length) {
                iArr3[i12] = i3;
                Object[] objArr3 = this.f30b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f31c = i15 + 1;
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
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f31c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f31c * 28);
        sb2.append('{');
        int i3 = this.f31c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object f10 = f(i10);
            if (f10 != sb2) {
                sb2.append(f10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object i11 = i(i10);
            if (i11 != sb2) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !kotlin.jvm.internal.j.a(obj2, i(d))) {
            return false;
        }
        g(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !kotlin.jvm.internal.j.a(obj2, i(d))) {
            return false;
        }
        h(d, obj3);
        return true;
    }
}
