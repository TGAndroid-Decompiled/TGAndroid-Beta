package g9;

import b8.yb;
import b8.zb;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class s extends AbstractMap implements Serializable {
    public static final Object f12138s = new Object();
    public transient Object f12139a;
    public transient int[] f12140b;
    public transient Object[] f12141c;
    public transient Object[] d;
    public transient int f12142e;
    public transient int f12143f;
    public transient q h;
    public transient q f12144n;
    public transient b8.f f12145r;

    public static s b() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f12142e = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    public static s c(int i3) {
        boolean z10;
        ?? abstractMap = new AbstractMap();
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.e("Expected size must be >= 0", z10);
        abstractMap.f12142e = Math.min(Math.max(i3, 1), 1073741823);
        return abstractMap;
    }

    @Override
    public final void clear() {
        if (h()) {
            return;
        }
        this.f12142e += 32;
        Map d = d();
        if (d != null) {
            this.f12142e = Math.min(Math.max(size(), 3), 1073741823);
            d.clear();
            this.f12139a = null;
            this.f12143f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f12143f, (Object) null);
        Arrays.fill(l(), 0, this.f12143f, (Object) null);
        Object obj = this.f12139a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f12143f, 0);
        this.f12143f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map d = d();
        if (d != null) {
            return d.containsKey(obj);
        }
        if (f(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map d = d();
        if (d != null) {
            return d.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f12143f; i3++) {
            if (yb.a(obj, l()[i3])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.f12139a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int e() {
        return (1 << (this.f12142e & 31)) - 1;
    }

    @Override
    public final Set entrySet() {
        q qVar = this.f12144n;
        if (qVar == null) {
            q qVar2 = new q(this, 0);
            this.f12144n = qVar2;
            return qVar2;
        }
        return qVar;
    }

    public final int f(Object obj) {
        if (h()) {
            return -1;
        }
        int v = o.v(obj);
        int e10 = e();
        Object obj2 = this.f12139a;
        Objects.requireNonNull(obj2);
        int w10 = o.w(v & e10, obj2);
        if (w10 == 0) {
            return -1;
        }
        int i3 = ~e10;
        int i10 = v & i3;
        do {
            int i11 = w10 - 1;
            int i12 = j()[i11];
            if ((i12 & i3) == i10 && yb.a(obj, k()[i11])) {
                return i11;
            }
            w10 = i12 & e10;
        } while (w10 != 0);
        return -1;
    }

    public final void g(int i3, int i10) {
        Object obj = this.f12139a;
        Objects.requireNonNull(obj);
        int[] j10 = j();
        Object[] k10 = k();
        Object[] l10 = l();
        int size = size();
        int i11 = size - 1;
        if (i3 < i11) {
            Object obj2 = k10[i11];
            k10[i3] = obj2;
            l10[i3] = l10[i11];
            k10[i11] = null;
            l10[i11] = null;
            j10[i3] = j10[i11];
            j10[i11] = 0;
            int v = o.v(obj2) & i10;
            int w10 = o.w(v, obj);
            if (w10 == size) {
                o.x(v, i3 + 1, obj);
                return;
            }
            while (true) {
                int i12 = w10 - 1;
                int i13 = j10[i12];
                int i14 = i13 & i10;
                if (i14 == size) {
                    j10[i12] = o.q(i13, i3 + 1, i10);
                    return;
                }
                w10 = i14;
            }
        } else {
            k10[i3] = null;
            l10[i3] = null;
            j10[i3] = 0;
        }
    }

    @Override
    public final Object get(Object obj) {
        Map d = d();
        if (d != null) {
            return d.get(obj);
        }
        int f10 = f(obj);
        if (f10 == -1) {
            return null;
        }
        return l()[f10];
    }

    public final boolean h() {
        if (this.f12139a == null) {
            return true;
        }
        return false;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int e10 = e();
            Object obj2 = this.f12139a;
            Objects.requireNonNull(obj2);
            int s6 = o.s(obj, null, e10, obj2, j(), k(), null);
            if (s6 != -1) {
                Object obj3 = l()[s6];
                g(s6, e10);
                this.f12143f--;
                this.f12142e += 32;
                return obj3;
            }
        }
        return f12138s;
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int[] j() {
        int[] iArr = this.f12140b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f12141c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override
    public final Set keySet() {
        q qVar = this.h;
        if (qVar == null) {
            q qVar2 = new q(this, 1);
            this.h = qVar2;
            return qVar2;
        }
        return qVar;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i3, int i10, int i11, int i12) {
        Object h = o.h(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            o.x(i11 & i13, i12 + 1, h);
        }
        Object obj = this.f12139a;
        Objects.requireNonNull(obj);
        int[] j10 = j();
        for (int i14 = 0; i14 <= i3; i14++) {
            int w10 = o.w(i14, obj);
            while (w10 != 0) {
                int i15 = w10 - 1;
                int i16 = j10[i15];
                int i17 = ((~i3) & i16) | i14;
                int i18 = i17 & i13;
                int w11 = o.w(i18, h);
                o.x(i18, w10, h);
                j10[i15] = o.q(i17, w11, i13);
                w10 = i16 & i3;
            }
        }
        this.f12139a = h;
        this.f12142e = o.q(this.f12142e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: g9.s.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map d = d();
        if (d != null) {
            return d.remove(obj);
        }
        Object i3 = i(obj);
        if (i3 == f12138s) {
            return null;
        }
        return i3;
    }

    @Override
    public final int size() {
        Map d = d();
        if (d != null) {
            return d.size();
        }
        return this.f12143f;
    }

    @Override
    public final Collection values() {
        b8.f fVar = this.f12145r;
        if (fVar == null) {
            b8.f fVar2 = new b8.f((Object) this, 4);
            this.f12145r = fVar2;
            return fVar2;
        }
        return fVar;
    }
}
