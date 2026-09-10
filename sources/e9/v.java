package e9;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import v7.s6;
public final class v extends AbstractMap implements Serializable {
    public static final Object f7434s = new Object();
    public transient Object f7435a;
    public transient int[] f7436b;
    public transient Object[] f7437c;
    public transient Object[] d;
    public transient int e;
    public transient int f7438f;
    public transient s h;
    public transient s f7439n;
    public transient n f7440r;

    public static v a(int i10) {
        boolean z10;
        ?? abstractMap = new AbstractMap();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            abstractMap.e = Math.min(Math.max(i10, 1), 1073741823);
            return abstractMap;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final Map b() {
        Object obj = this.f7435a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override
    public final void clear() {
        if (f()) {
            return;
        }
        this.e += 32;
        Map b10 = b();
        if (b10 != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            b10.clear();
            this.f7435a = null;
            this.f7438f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f7438f, (Object) null);
        Arrays.fill(j(), 0, this.f7438f, (Object) null);
        Object obj = this.f7435a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f7438f, 0);
        this.f7438f = 0;
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
        for (int i10 = 0; i10 < this.f7438f; i10++) {
            if (s6.a(obj, j()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int t10 = q.t(obj);
        int c10 = c();
        Object obj2 = this.f7435a;
        Objects.requireNonNull(obj2);
        int u10 = q.u(t10 & c10, obj2);
        if (u10 == 0) {
            return -1;
        }
        int i10 = ~c10;
        int i11 = t10 & i10;
        do {
            int i12 = u10 - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && s6.a(obj, i()[i12])) {
                return i12;
            }
            u10 = i13 & c10;
        } while (u10 != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f7435a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i12 = i();
        Object[] j3 = j();
        int size = size();
        int i13 = size - 1;
        if (i10 < i13) {
            Object obj2 = i12[i13];
            i12[i10] = obj2;
            j3[i10] = j3[i13];
            i12[i13] = null;
            j3[i13] = null;
            h[i10] = h[i13];
            h[i13] = 0;
            int t10 = q.t(obj2) & i11;
            int u10 = q.u(t10, obj);
            if (u10 == size) {
                q.v(t10, i10 + 1, obj);
                return;
            }
            while (true) {
                int i14 = u10 - 1;
                int i15 = h[i14];
                int i16 = i15 & i11;
                if (i16 == size) {
                    h[i14] = q.o(i15, i10 + 1, i11);
                    return;
                }
                u10 = i16;
            }
        } else {
            i12[i10] = null;
            j3[i10] = null;
            h[i10] = 0;
        }
    }

    @Override
    public final Set entrySet() {
        s sVar = this.f7439n;
        if (sVar == null) {
            s sVar2 = new s(this, 0);
            this.f7439n = sVar2;
            return sVar2;
        }
        return sVar;
    }

    public final boolean f() {
        if (this.f7435a == null) {
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int c10 = c();
            Object obj2 = this.f7435a;
            Objects.requireNonNull(obj2);
            int q6 = q.q(obj, null, c10, obj2, h(), i(), null);
            if (q6 != -1) {
                Object obj3 = j()[q6];
                e(q6, c10);
                this.f7438f--;
                this.e += 32;
                return obj3;
            }
        }
        return f7434s;
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
        int[] iArr = this.f7436b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f7437c;
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

    public final int k(int i10, int i11, int i12, int i13) {
        Object f7 = q.f(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            q.v(i12 & i14, i13 + 1, f7);
        }
        Object obj = this.f7435a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int u10 = q.u(i15, obj);
            while (u10 != 0) {
                int i16 = u10 - 1;
                int i17 = h[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int u11 = q.u(i19, f7);
                q.v(i19, u10, f7);
                h[i16] = q.o(i18, u11, i14);
                u10 = i17 & i10;
            }
        }
        this.f7435a = f7;
        this.e = q.o(this.e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override
    public final Set keySet() {
        s sVar = this.h;
        if (sVar == null) {
            s sVar2 = new s(this, 1);
            this.h = sVar2;
            return sVar2;
        }
        return sVar;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: e9.v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object g10 = g(obj);
        if (g10 == f7434s) {
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
        return this.f7438f;
    }

    @Override
    public final Collection values() {
        n nVar = this.f7440r;
        if (nVar == null) {
            n nVar2 = new n(1, this);
            this.f7440r = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
