package o8;

import g7.r6;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class p extends AbstractMap implements Serializable {
    public static final Object f19068s = new Object();
    public transient Object f19069a;
    public transient int[] f19070b;
    public transient Object[] f19071c;
    public transient Object[] d;
    public transient int f19072e;
    public transient int f19073f;
    public transient n h;
    public transient n f19074n;
    public transient h7.m f19075r;

    public static p a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f19072e = r6.b(8, 1);
        return abstractMap;
    }

    public final Map b() {
        Object obj = this.f19069a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f19072e & 31)) - 1;
    }

    @Override
    public final void clear() {
        if (f()) {
            return;
        }
        this.f19072e += 32;
        Map b10 = b();
        if (b10 != null) {
            this.f19072e = r6.b(size(), 3);
            b10.clear();
            this.f19069a = null;
            this.f19073f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f19073f, (Object) null);
        Arrays.fill(j(), 0, this.f19073f, (Object) null);
        Object obj = this.f19069a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f19073f, 0);
        this.f19073f = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsKey(obj);
        }
        if (d(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i9 = 0; i9 < this.f19073f; i9++) {
            if (g7.c0.a(obj, j()[i9])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int p6 = l.p(obj);
        int c10 = c();
        Object obj2 = this.f19069a;
        Objects.requireNonNull(obj2);
        int q10 = l.q(p6 & c10, obj2);
        if (q10 == 0) {
            return -1;
        }
        int i9 = ~c10;
        int i10 = p6 & i9;
        do {
            int i11 = q10 - 1;
            int i12 = h()[i11];
            if ((i12 & i9) == i10 && g7.c0.a(obj, i()[i11])) {
                return i11;
            }
            q10 = i12 & c10;
        } while (q10 != 0);
        return -1;
    }

    public final void e(int i9, int i10) {
        Object obj = this.f19069a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i11 = i();
        Object[] j10 = j();
        int size = size();
        int i12 = size - 1;
        if (i9 < i12) {
            Object obj2 = i11[i12];
            i11[i9] = obj2;
            j10[i9] = j10[i12];
            i11[i12] = null;
            j10[i12] = null;
            h[i9] = h[i12];
            h[i12] = 0;
            int p6 = l.p(obj2) & i10;
            int q10 = l.q(p6, obj);
            if (q10 == size) {
                l.r(p6, i9 + 1, obj);
                return;
            }
            while (true) {
                int i13 = q10 - 1;
                int i14 = h[i13];
                int i15 = i14 & i10;
                if (i15 == size) {
                    h[i13] = l.j(i14, i9 + 1, i10);
                    return;
                }
                q10 = i15;
            }
        } else {
            i11[i9] = null;
            j10[i9] = null;
            h[i9] = 0;
        }
    }

    @Override
    public final Set entrySet() {
        n nVar = this.f19074n;
        if (nVar == null) {
            n nVar2 = new n(this, 0);
            this.f19074n = nVar2;
            return nVar2;
        }
        return nVar;
    }

    public final boolean f() {
        if (this.f19069a == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int c10 = c();
            Object obj2 = this.f19069a;
            Objects.requireNonNull(obj2);
            int m10 = l.m(obj, null, c10, obj2, h(), i(), null);
            if (m10 != -1) {
                Object obj3 = j()[m10];
                e(m10, c10);
                this.f19073f--;
                this.f19072e += 32;
                return obj3;
            }
        }
        return f19068s;
    }

    @Override
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j()[d];
    }

    public final int[] h() {
        int[] iArr = this.f19070b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f19071c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i9, int i10, int i11, int i12) {
        Object b10 = l.b(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            l.r(i11 & i13, i12 + 1, b10);
        }
        Object obj = this.f19069a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i14 = 0; i14 <= i9; i14++) {
            int q10 = l.q(i14, obj);
            while (q10 != 0) {
                int i15 = q10 - 1;
                int i16 = h[i15];
                int i17 = ((~i9) & i16) | i14;
                int i18 = i17 & i13;
                int q11 = l.q(i18, b10);
                l.r(i18, q10, b10);
                h[i15] = l.j(i17, q11, i13);
                q10 = i16 & i9;
            }
        }
        this.f19069a = b10;
        this.f19072e = l.j(this.f19072e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    @Override
    public final Set keySet() {
        n nVar = this.h;
        if (nVar == null) {
            n nVar2 = new n(this, 1);
            this.h = nVar2;
            return nVar2;
        }
        return nVar;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: o8.p.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f19068s) {
            return null;
        }
        return g10;
    }

    @Override
    public final int size() {
        Map b10 = b();
        if (b10 != null) {
            return b10.size();
        }
        return this.f19073f;
    }

    @Override
    public final Collection values() {
        h7.m mVar = this.f19075r;
        if (mVar == null) {
            h7.m mVar2 = new h7.m(5, this);
            this.f19075r = mVar2;
            return mVar2;
        }
        return mVar;
    }
}
