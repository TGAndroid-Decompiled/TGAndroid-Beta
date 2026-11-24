package defpackage;

import java.util.Arrays;
import java.util.Map;
public class aia {
    public int[] a;
    public Object[] b;
    public int c;

    public aia(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = yp3.c;
        } else {
            iArr = new int[i];
        }
        this.a = iArr;
        if (i == 0) {
            objArr = yp3.e;
        } else {
            objArr = new Object[i << 1];
        }
        this.b = objArr;
    }

    public final int b(Object obj) {
        int i = this.c << 1;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a = yp3.a(i2, i, this.a);
        if (a < 0 || rp5.a(obj, this.b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (rp5.a(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (rp5.a(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        int i = this.c;
        if (i > 0) {
            this.a = yp3.c;
            this.b = yp3.e;
            i = 0;
            this.c = 0;
        }
        if (i <= 0) {
            return;
        }
        ag.b();
    }

    public final boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
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
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a = yp3.a(i, 0, this.a);
        if (a < 0 || this.b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof aia) {
                int i = this.c;
                if (i != ((aia) obj).c) {
                    return false;
                }
                aia aiaVar = (aia) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f = f(i2);
                    Object i3 = i(i2);
                    Object obj2 = aiaVar.get(f);
                    if (i3 == null) {
                        if (obj2 != null || !aiaVar.containsKey(f)) {
                            return false;
                        }
                    } else if (!i3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object f2 = f(i5);
                    Object i6 = i(i5);
                    Object obj3 = ((Map) obj).get(f2);
                    if (i6 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f2)) {
                            return false;
                        }
                    } else if (!i6.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i << 1];
        }
        v0b.a(de9.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.c)) {
            Object[] objArr = this.b;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return obj;
            }
            int i4 = i2 - 1;
            int[] iArr = this.a;
            int i5 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                this.a = Arrays.copyOf(iArr, i5);
                this.b = Arrays.copyOf(this.b, i5 << 1);
                if (i2 == this.c) {
                    if (i > 0) {
                        ss.b(0, 0, i, iArr, this.a);
                        ss.c(0, 0, i3, objArr, this.b);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        ss.b(i, i6, i2, iArr, this.a);
                        ss.c(i3, i6 << 1, i2 << 1, objArr, this.b);
                    }
                } else {
                    ag.b();
                    return null;
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    ss.b(i, i7, i2, iArr, iArr);
                    Object[] objArr2 = this.b;
                    ss.c(i3, i7 << 1, i2 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.b;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 == this.c) {
                this.c = i4;
                return obj;
            }
            ag.b();
            return null;
        }
        v0b.a(de9.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.b[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return this.b[(d << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i, Object obj) {
        if (i >= 0 && i < this.c) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.b;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        v0b.a(de9.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i2 = this.c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i6 ^ i;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[(i << 1) + 1];
        }
        v0b.a(de9.k(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int e;
        int i;
        int i2 = this.c;
        if (obj != null) {
            i = obj.hashCode();
            e = c(i, obj);
        } else {
            e = e();
            i = 0;
        }
        if (e >= 0) {
            int i3 = (e << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~e;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            this.a = Arrays.copyOf(iArr, i5);
            this.b = Arrays.copyOf(this.b, i5 << 1);
            if (i2 != this.c) {
                ag.b();
                return null;
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.a;
            int i6 = i4 + 1;
            ss.b(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.b;
            ss.c(i6 << 1, i4 << 1, this.c << 1, objArr2, objArr2);
        }
        int i7 = this.c;
        if (i2 == i7) {
            int[] iArr3 = this.a;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.b;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.c = i7 + 1;
                return null;
            }
        }
        ag.b();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0 && rp5.a(obj2, i(d))) {
            g(d);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d >= 0 && rp5.a(obj2, i(d))) {
            h(d, obj3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object remove(Object obj) {
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
}
