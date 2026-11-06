package h9;

import a8.ha;
import a8.ia;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class s extends AbstractMap implements Serializable {
    public static final Object f14382s = new Object();
    public transient Object f14383a;
    public transient int[] f14384b;
    public transient Object[] f14385c;
    public transient Object[] d;
    public transient int f14386e;
    public transient int f14387f;
    public transient q h;
    public transient q f14388n;
    public transient a8.n f14389r;

    public static s b() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f14386e = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    public static s c(int i7) {
        boolean z9;
        ?? abstractMap = new AbstractMap();
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.e("Expected size must be >= 0", z9);
        abstractMap.f14386e = Math.min(Math.max(i7, 1), 1073741823);
        return abstractMap;
    }

    @Override
    public final void clear() {
        if (h()) {
            return;
        }
        this.f14386e += 32;
        Map d = d();
        if (d != null) {
            this.f14386e = Math.min(Math.max(size(), 3), 1073741823);
            d.clear();
            this.f14383a = null;
            this.f14387f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f14387f, (Object) null);
        Arrays.fill(l(), 0, this.f14387f, (Object) null);
        Object obj = this.f14383a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f14387f, 0);
        this.f14387f = 0;
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
        for (int i7 = 0; i7 < this.f14387f; i7++) {
            if (ha.a(obj, l()[i7])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.f14383a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int e() {
        return (1 << (this.f14386e & 31)) - 1;
    }

    @Override
    public final Set entrySet() {
        q qVar = this.f14388n;
        if (qVar == null) {
            q qVar2 = new q(this, 0);
            this.f14388n = qVar2;
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
        Object obj2 = this.f14383a;
        Objects.requireNonNull(obj2);
        int w10 = o.w(v & e10, obj2);
        if (w10 == 0) {
            return -1;
        }
        int i7 = ~e10;
        int i10 = v & i7;
        do {
            int i11 = w10 - 1;
            int i12 = j()[i11];
            if ((i12 & i7) == i10 && ha.a(obj, k()[i11])) {
                return i11;
            }
            w10 = i12 & e10;
        } while (w10 != 0);
        return -1;
    }

    public final void g(int i7, int i10) {
        Object obj = this.f14383a;
        Objects.requireNonNull(obj);
        int[] j3 = j();
        Object[] k10 = k();
        Object[] l10 = l();
        int size = size();
        int i11 = size - 1;
        if (i7 < i11) {
            Object obj2 = k10[i11];
            k10[i7] = obj2;
            l10[i7] = l10[i11];
            k10[i11] = null;
            l10[i11] = null;
            j3[i7] = j3[i11];
            j3[i11] = 0;
            int v = o.v(obj2) & i10;
            int w10 = o.w(v, obj);
            if (w10 == size) {
                o.x(v, i7 + 1, obj);
                return;
            }
            while (true) {
                int i12 = w10 - 1;
                int i13 = j3[i12];
                int i14 = i13 & i10;
                if (i14 == size) {
                    j3[i12] = o.q(i13, i7 + 1, i10);
                    return;
                }
                w10 = i14;
            }
        } else {
            k10[i7] = null;
            l10[i7] = null;
            j3[i7] = 0;
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
        if (this.f14383a == null) {
            return true;
        }
        return false;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int e10 = e();
            Object obj2 = this.f14383a;
            Objects.requireNonNull(obj2);
            int s5 = o.s(obj, null, e10, obj2, j(), k(), null);
            if (s5 != -1) {
                Object obj3 = l()[s5];
                g(s5, e10);
                this.f14387f--;
                this.f14386e += 32;
                return obj3;
            }
        }
        return f14382s;
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int[] j() {
        int[] iArr = this.f14384b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f14385c;
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

    public final int m(int i7, int i10, int i11, int i12) {
        Object h = o.h(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            o.x(i11 & i13, i12 + 1, h);
        }
        Object obj = this.f14383a;
        Objects.requireNonNull(obj);
        int[] j3 = j();
        for (int i14 = 0; i14 <= i7; i14++) {
            int w10 = o.w(i14, obj);
            while (w10 != 0) {
                int i15 = w10 - 1;
                int i16 = j3[i15];
                int i17 = ((~i7) & i16) | i14;
                int i18 = i17 & i13;
                int w11 = o.w(i18, h);
                o.x(i18, w10, h);
                j3[i15] = o.q(i17, w11, i13);
                w10 = i16 & i7;
            }
        }
        this.f14383a = h;
        this.f14386e = o.q(this.f14386e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: h9.s.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map d = d();
        if (d != null) {
            return d.remove(obj);
        }
        Object i7 = i(obj);
        if (i7 == f14382s) {
            return null;
        }
        return i7;
    }

    @Override
    public final int size() {
        Map d = d();
        if (d != null) {
            return d.size();
        }
        return this.f14387f;
    }

    @Override
    public final Collection values() {
        a8.n nVar = this.f14389r;
        if (nVar == null) {
            a8.n nVar2 = new a8.n((Object) this, 6);
            this.f14389r = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
