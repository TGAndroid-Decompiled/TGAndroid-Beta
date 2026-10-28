package f9;

import a8.xb;
import a8.yb;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class s extends AbstractMap implements Serializable {
    public static final Object f10334s = new Object();
    public transient Object f10335a;
    public transient int[] f10336b;
    public transient Object[] f10337c;
    public transient Object[] d;
    public transient int e;
    public transient int f10338f;
    public transient q h;
    public transient q f10339n;
    public transient a8.f f10340r;

    public static s a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.e = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    public static s b(int i10) {
        boolean z10;
        ?? abstractMap = new AbstractMap();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.f("Expected size must be >= 0", z10);
        abstractMap.e = Math.min(Math.max(i10, 1), 1073741823);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.f10335a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override
    public final void clear() {
        if (g()) {
            return;
        }
        this.e += 32;
        Map c10 = c();
        if (c10 != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            c10.clear();
            this.f10335a = null;
            this.f10338f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f10338f, (Object) null);
        Arrays.fill(k(), 0, this.f10338f, (Object) null);
        Object obj = this.f10335a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f10338f, 0);
        this.f10338f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f10338f; i10++) {
            if (xb.a(obj, k()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int u10 = o.u(obj);
        int d = d();
        Object obj2 = this.f10335a;
        Objects.requireNonNull(obj2);
        int v = o.v(u10 & d, obj2);
        if (v == 0) {
            return -1;
        }
        int i10 = ~d;
        int i11 = u10 & i10;
        do {
            int i12 = v - 1;
            int i13 = i()[i12];
            if ((i13 & i10) == i11 && xb.a(obj, j()[i12])) {
                return i12;
            }
            v = i13 & d;
        } while (v != 0);
        return -1;
    }

    @Override
    public final Set entrySet() {
        q qVar = this.f10339n;
        if (qVar == null) {
            q qVar2 = new q(this, 0);
            this.f10339n = qVar2;
            return qVar2;
        }
        return qVar;
    }

    public final void f(int i10, int i11) {
        Object obj = this.f10335a;
        Objects.requireNonNull(obj);
        int[] i12 = i();
        Object[] j10 = j();
        Object[] k10 = k();
        int size = size();
        int i13 = size - 1;
        if (i10 < i13) {
            Object obj2 = j10[i13];
            j10[i10] = obj2;
            k10[i10] = k10[i13];
            j10[i13] = null;
            k10[i13] = null;
            i12[i10] = i12[i13];
            i12[i13] = 0;
            int u10 = o.u(obj2) & i11;
            int v = o.v(u10, obj);
            if (v == size) {
                o.w(u10, i10 + 1, obj);
                return;
            }
            while (true) {
                int i14 = v - 1;
                int i15 = i12[i14];
                int i16 = i15 & i11;
                if (i16 == size) {
                    i12[i14] = o.p(i15, i10 + 1, i11);
                    return;
                }
                v = i16;
            }
        } else {
            j10[i10] = null;
            k10[i10] = null;
            i12[i10] = 0;
        }
    }

    public final boolean g() {
        if (this.f10335a == null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.get(obj);
        }
        int e = e(obj);
        if (e == -1) {
            return null;
        }
        return k()[e];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int d = d();
            Object obj2 = this.f10335a;
            Objects.requireNonNull(obj2);
            int r6 = o.r(obj, null, d, obj2, i(), j(), null);
            if (r6 != -1) {
                Object obj3 = k()[r6];
                f(r6, d);
                this.f10338f--;
                this.e += 32;
                return obj3;
            }
        }
        return f10334s;
    }

    public final int[] i() {
        int[] iArr = this.f10336b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f10337c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.d;
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

    public final int l(int i10, int i11, int i12, int i13) {
        Object g7 = o.g(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            o.w(i12 & i14, i13 + 1, g7);
        }
        Object obj = this.f10335a;
        Objects.requireNonNull(obj);
        int[] i15 = i();
        for (int i16 = 0; i16 <= i10; i16++) {
            int v = o.v(i16, obj);
            while (v != 0) {
                int i17 = v - 1;
                int i18 = i15[i17];
                int i19 = ((~i10) & i18) | i16;
                int i20 = i19 & i14;
                int v10 = o.v(i20, g7);
                o.w(i20, v, g7);
                i15[i17] = o.p(i19, v10, i14);
                v = i18 & i10;
            }
        }
        this.f10335a = g7;
        this.e = o.p(this.e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: f9.s.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.remove(obj);
        }
        Object h = h(obj);
        if (h == f10334s) {
            return null;
        }
        return h;
    }

    @Override
    public final int size() {
        Map c10 = c();
        if (c10 != null) {
            return c10.size();
        }
        return this.f10338f;
    }

    @Override
    public final Collection values() {
        a8.f fVar = this.f10340r;
        if (fVar == null) {
            a8.f fVar2 = new a8.f((Object) this, 4);
            this.f10340r = fVar2;
            return fVar2;
        }
        return fVar;
    }
}
