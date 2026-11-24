package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class so2 extends AbstractMap implements Serializable {
    public static final Object w = new Object();
    public static final Object x = new Object();
    public static final Object y = new Object();
    public final byte a;
    public transient Object b;
    public transient int[] c;
    public transient Object[] d;
    public transient Object[] e;
    public transient int f;
    public transient int h;
    public transient AbstractSet n;
    public transient AbstractSet r;
    public transient AbstractCollection s;

    public so2(byte b) {
        this.a = b;
        this.f = 12;
    }

    public static so2 b() {
        so2 so2Var = new so2();
        so2Var.f = 3;
        return so2Var;
    }

    public static so2 c(int i) {
        boolean z;
        so2 so2Var = new so2();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.e("Expected size must be >= 0", z);
        so2Var.f = Math.min(Math.max(i, 1), 1073741823);
        return so2Var;
    }

    @Override
    public final void clear() {
        switch (this.a) {
            case 0:
                if (!i()) {
                    this.f += 32;
                    Map d = d();
                    if (d != null) {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        d.clear();
                        this.b = null;
                        this.h = 0;
                        return;
                    }
                    Object[] objArr = this.d;
                    Objects.requireNonNull(objArr);
                    Arrays.fill(objArr, 0, this.h, (Object) null);
                    Object[] objArr2 = this.e;
                    Objects.requireNonNull(objArr2);
                    Arrays.fill(objArr2, 0, this.h, (Object) null);
                    Object obj = this.b;
                    Objects.requireNonNull(obj);
                    if (obj instanceof byte[]) {
                        Arrays.fill((byte[]) obj, (byte) 0);
                    } else if (obj instanceof short[]) {
                        Arrays.fill((short[]) obj, (short) 0);
                    } else {
                        Arrays.fill((int[]) obj, 0);
                    }
                    int[] iArr = this.c;
                    Objects.requireNonNull(iArr);
                    Arrays.fill(iArr, 0, this.h, 0);
                    this.h = 0;
                    return;
                }
                return;
            case 1:
                if (!p()) {
                    this.f += 32;
                    Map m = m();
                    if (m == null) {
                        Object[] objArr3 = this.d;
                        objArr3.getClass();
                        Arrays.fill(objArr3, 0, this.h, (Object) null);
                        Object[] objArr4 = this.e;
                        objArr4.getClass();
                        Arrays.fill(objArr4, 0, this.h, (Object) null);
                        Object obj2 = this.b;
                        obj2.getClass();
                        if (obj2 instanceof byte[]) {
                            Arrays.fill((byte[]) obj2, (byte) 0);
                        } else if (obj2 instanceof short[]) {
                            Arrays.fill((short[]) obj2, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj2, 0);
                        }
                        int[] iArr2 = this.c;
                        iArr2.getClass();
                        Arrays.fill(iArr2, 0, this.h, 0);
                        this.h = 0;
                        return;
                    }
                    this.f = Math.min(Math.max(size(), 3), 1073741823);
                    m.clear();
                    this.b = null;
                    this.h = 0;
                    return;
                }
                return;
            default:
                if (!t()) {
                    this.f += 32;
                    Map n = n();
                    if (n != null) {
                        this.f = Math.min(Math.max(size(), 3), 1073741823);
                        n.clear();
                        this.b = null;
                        this.h = 0;
                        return;
                    }
                    Object[] objArr5 = this.d;
                    objArr5.getClass();
                    Arrays.fill(objArr5, 0, this.h, (Object) null);
                    Object[] objArr6 = this.e;
                    objArr6.getClass();
                    Arrays.fill(objArr6, 0, this.h, (Object) null);
                    Object obj3 = this.b;
                    obj3.getClass();
                    if (obj3 instanceof byte[]) {
                        Arrays.fill((byte[]) obj3, (byte) 0);
                    } else if (obj3 instanceof short[]) {
                        Arrays.fill((short[]) obj3, (short) 0);
                    } else {
                        Arrays.fill((int[]) obj3, 0);
                    }
                    int[] iArr3 = this.c;
                    iArr3.getClass();
                    Arrays.fill(iArr3, 0, this.h, 0);
                    this.h = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.containsKey(obj);
                }
                if (f(obj) != -1) {
                    return true;
                }
                return false;
            case 1:
                Map m = m();
                if (m != null) {
                    return m.containsKey(obj);
                }
                if (s(obj) != -1) {
                    return true;
                }
                return false;
            default:
                Map n = n();
                if (n != null) {
                    return n.containsKey(obj);
                }
                if (x(obj) != -1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.containsValue(obj);
                }
                for (int i = 0; i < this.h; i++) {
                    if (bqe.a(obj, l(i))) {
                        return true;
                    }
                }
                return false;
            case 1:
                Map m = m();
                if (m == null) {
                    for (int i2 = 0; i2 < this.h; i2++) {
                        Object[] objArr = this.e;
                        objArr.getClass();
                        if (m1f.a(obj, objArr[i2])) {
                            return true;
                        }
                    }
                    return false;
                }
                return m.containsValue(obj);
            default:
                Map n = n();
                if (n == null) {
                    for (int i3 = 0; i3 < this.h; i3++) {
                        Object[] objArr2 = this.e;
                        objArr2.getClass();
                        if (s3f.a(obj, objArr2[i3])) {
                            return true;
                        }
                    }
                    return false;
                }
                return n.containsValue(obj);
        }
    }

    public final Map d() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int e() {
        return (1 << (this.f & 31)) - 1;
    }

    @Override
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                po2 po2Var = (po2) this.r;
                if (po2Var == null) {
                    po2 po2Var2 = new po2(this, (byte) 0);
                    this.r = po2Var2;
                    return po2Var2;
                }
                return po2Var;
            case 1:
                m6d m6dVar = (m6d) this.r;
                if (m6dVar == null) {
                    m6d m6dVar2 = new m6d(this, (byte) 0);
                    this.r = m6dVar2;
                    return m6dVar2;
                }
                return m6dVar;
            default:
                u8d u8dVar = (u8d) this.r;
                if (u8dVar == null) {
                    u8d u8dVar2 = new u8d(this, (byte) 0);
                    this.r = u8dVar2;
                    return u8dVar2;
                }
                return u8dVar;
        }
    }

    public final int f(Object obj) {
        if (i()) {
            return -1;
        }
        int b = cje.b(obj);
        int e = e();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int d = dsd.d(b & e, obj2);
        if (d == 0) {
            return -1;
        }
        int i = ~e;
        int i2 = b & i;
        do {
            int i3 = d - 1;
            int[] iArr = this.c;
            Objects.requireNonNull(iArr);
            int i4 = iArr[i3];
            if ((i4 & i) == i2 && bqe.a(obj, g(i3))) {
                return i3;
            }
            d = i4 & e;
        } while (d != 0);
        return -1;
    }

    public final Object g(int i) {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    @Override
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.get(obj);
                }
                int f = f(obj);
                if (f == -1) {
                    return null;
                }
                return l(f);
            case 1:
                Map m = m();
                if (m != null) {
                    return m.get(obj);
                }
                int s = s(obj);
                if (s == -1) {
                    return null;
                }
                Object[] objArr = this.e;
                objArr.getClass();
                return objArr[s];
            default:
                Map n = n();
                if (n != null) {
                    return n.get(obj);
                }
                int x2 = x(obj);
                if (x2 == -1) {
                    return null;
                }
                Object[] objArr2 = this.e;
                objArr2.getClass();
                return objArr2[x2];
        }
    }

    public final void h(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.e;
        Objects.requireNonNull(objArr2);
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = objArr[i3];
            objArr[i] = obj2;
            objArr2[i] = objArr2[i3];
            objArr[i3] = null;
            objArr2[i3] = null;
            iArr[i] = iArr[i3];
            iArr[i3] = 0;
            int b = cje.b(obj2) & i2;
            int d = dsd.d(b, obj);
            if (d == size) {
                dsd.e(b, i + 1, obj);
                return;
            }
            while (true) {
                int i4 = d - 1;
                int i5 = iArr[i4];
                int i6 = i5 & i2;
                if (i6 == size) {
                    iArr[i4] = dsd.b(i5, i + 1, i2);
                    return;
                }
                d = i6;
            }
        } else {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
        }
    }

    public final boolean i() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (size() == 0) {
                    return true;
                }
                return false;
            case 1:
                if (size() == 0) {
                    return true;
                }
                return false;
            default:
                if (size() == 0) {
                    return true;
                }
                return false;
        }
    }

    public final Object j(Object obj) {
        if (!i()) {
            int e = e();
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int[] iArr = this.c;
            Objects.requireNonNull(iArr);
            Object[] objArr = this.d;
            Objects.requireNonNull(objArr);
            int c = dsd.c(obj, null, e, obj2, iArr, objArr, null);
            if (c != -1) {
                Object l = l(c);
                h(c, e);
                this.h--;
                this.f += 32;
                return l;
            }
        }
        return w;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object a = dsd.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            dsd.e(i3 & i5, i4 + 1, a);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        for (int i6 = 0; i6 <= i; i6++) {
            int d = dsd.d(i6, obj);
            while (d != 0) {
                int i7 = d - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int d2 = dsd.d(i10, a);
                dsd.e(i10, d, a);
                iArr[i7] = dsd.b(i9, d2, i5);
                d = i8 & i;
            }
        }
        this.b = a;
        this.f = dsd.b(this.f, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override
    public final Set keySet() {
        switch (this.a) {
            case 0:
                po2 po2Var = (po2) this.n;
                if (po2Var == null) {
                    po2 po2Var2 = new po2(this, (byte) 1);
                    this.n = po2Var2;
                    return po2Var2;
                }
                return po2Var;
            case 1:
                m6d m6dVar = (m6d) this.n;
                if (m6dVar == null) {
                    m6d m6dVar2 = new m6d(this, (byte) 1);
                    this.n = m6dVar2;
                    return m6dVar2;
                }
                return m6dVar;
            default:
                u8d u8dVar = (u8d) this.n;
                if (u8dVar == null) {
                    u8d u8dVar2 = new u8d(this, (byte) 1);
                    this.n = u8dVar2;
                    return u8dVar2;
                }
                return u8dVar;
        }
    }

    public final Object l(int i) {
        Object[] objArr = this.e;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    public final Map m() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Map n() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void o(int i, int i2) {
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        Object[] objArr = this.d;
        objArr.getClass();
        Object[] objArr2 = this.e;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            int i4 = i + 1;
            Object obj2 = objArr[i3];
            objArr[i] = obj2;
            objArr2[i] = objArr2[i3];
            objArr[i3] = null;
            objArr2[i3] = null;
            iArr[i] = iArr[i3];
            iArr[i3] = 0;
            int a = kze.a(obj2) & i2;
            int b = gze.b(a, obj);
            if (b == size) {
                gze.d(a, i4, obj);
                return;
            }
            while (true) {
                int i5 = b - 1;
                int i6 = iArr[i5];
                int i7 = i6 & i2;
                if (i7 != size) {
                    b = i7;
                } else {
                    iArr[i5] = (i6 & (~i2)) | (i4 & i2);
                    return;
                }
            }
        } else {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
        }
    }

    public final boolean p() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so2.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int q() {
        return (1 << (this.f & 31)) - 1;
    }

    public final void r(int i, int i2) {
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        Object[] objArr = this.d;
        objArr.getClass();
        Object[] objArr2 = this.e;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            Object obj2 = objArr[i3];
            objArr[i] = obj2;
            objArr2[i] = objArr2[i3];
            objArr[i3] = null;
            objArr2[i3] = null;
            iArr[i] = iArr[i3];
            iArr[i3] = 0;
            int a = oze.a(obj2) & i2;
            int b = nze.b(a, obj);
            if (b == size) {
                nze.d(a, i + 1, obj);
                return;
            }
            while (true) {
                int i4 = b - 1;
                int i5 = iArr[i4];
                int i6 = i5 & i2;
                if (i6 != size) {
                    b = i6;
                } else {
                    iArr[i4] = (i5 & (~i2)) | ((i + 1) & i2);
                    return;
                }
            }
        } else {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
        }
    }

    @Override
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.remove(obj);
                }
                Object j = j(obj);
                if (j == w) {
                    return null;
                }
                return j;
            case 1:
                Map m = m();
                if (m != null) {
                    return m.remove(obj);
                }
                Object v = v(obj);
                if (v == x) {
                    return null;
                }
                return v;
            default:
                Map n = n();
                if (n != null) {
                    return n.remove(obj);
                }
                Object z = z(obj);
                if (z == y) {
                    return null;
                }
                return z;
        }
    }

    public final int s(Object obj) {
        if (p()) {
            return -1;
        }
        int a = kze.a(obj);
        int q = q();
        Object obj2 = this.b;
        obj2.getClass();
        int b = gze.b(a & q, obj2);
        if (b == 0) {
            return -1;
        }
        int i = ~q;
        int i2 = a & i;
        do {
            int i3 = b - 1;
            int[] iArr = this.c;
            iArr.getClass();
            int i4 = iArr[i3];
            if ((i4 & i) == i2) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (m1f.a(obj, objArr[i3])) {
                    return i3;
                }
            }
            b = i4 & q;
        } while (b != 0);
        return -1;
    }

    @Override
    public final int size() {
        switch (this.a) {
            case 0:
                Map d = d();
                if (d != null) {
                    return d.size();
                }
                return this.h;
            case 1:
                Map m = m();
                if (m != null) {
                    return m.size();
                }
                return this.h;
            default:
                Map n = n();
                if (n != null) {
                    return n.size();
                }
                return this.h;
        }
    }

    public final boolean t() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public final int u(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object c = gze.c(i2);
        if (i4 != 0) {
            gze.d(i3 & i5, i4 + 1, c);
        }
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int b = gze.b(i6, obj);
            while (b != 0) {
                int i7 = b - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int b2 = gze.b(i10, c);
                gze.d(i10, b, c);
                iArr[i7] = (i9 & (~i5)) | (b2 & i5);
                b = i8 & i;
            }
        }
        this.b = c;
        this.f = (this.f & (-32)) | ((32 - Integer.numberOfLeadingZeros(i5)) & 31);
        return i5;
    }

    public final Object v(Object obj) {
        if (!p()) {
            int q = q();
            Object obj2 = this.b;
            obj2.getClass();
            int[] iArr = this.c;
            iArr.getClass();
            Object[] objArr = this.d;
            objArr.getClass();
            int a = gze.a(obj, null, q, obj2, iArr, objArr, null);
            if (a != -1) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                Object obj3 = objArr2[a];
                o(a, q);
                this.h--;
                this.f += 32;
                return obj3;
            }
        }
        return x;
    }

    @Override
    public final Collection values() {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.s;
                if (p3Var == null) {
                    p3 p3Var2 = new p3((Object) this, (byte) 2);
                    this.s = p3Var2;
                    return p3Var2;
                }
                return p3Var;
            case 1:
                p3 p3Var3 = (p3) this.s;
                if (p3Var3 == null) {
                    p3 p3Var4 = new p3((Object) this, (byte) 4);
                    this.s = p3Var4;
                    return p3Var4;
                }
                return p3Var3;
            default:
                p3 p3Var5 = (p3) this.s;
                if (p3Var5 == null) {
                    p3 p3Var6 = new p3((Object) this, (byte) 5);
                    this.s = p3Var6;
                    return p3Var6;
                }
                return p3Var5;
        }
    }

    public final int w() {
        return (1 << (this.f & 31)) - 1;
    }

    public final int x(Object obj) {
        if (t()) {
            return -1;
        }
        int a = oze.a(obj);
        int w2 = w();
        Object obj2 = this.b;
        obj2.getClass();
        int b = nze.b(a & w2, obj2);
        if (b == 0) {
            return -1;
        }
        int i = ~w2;
        int i2 = a & i;
        do {
            int i3 = b - 1;
            int[] iArr = this.c;
            iArr.getClass();
            int i4 = iArr[i3];
            if ((i4 & i) == i2) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (s3f.a(obj, objArr[i3])) {
                    return i3;
                }
            }
            b = i4 & w2;
        } while (b != 0);
        return -1;
    }

    public final int y(int i, int i2, int i3, int i4) {
        Object c = nze.c(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            nze.d(i3 & i5, i4 + 1, c);
        }
        Object obj = this.b;
        obj.getClass();
        int[] iArr = this.c;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int b = nze.b(i6, obj);
            while (b != 0) {
                int i7 = b - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int b2 = nze.b(i10, c);
                nze.d(i10, b, c);
                iArr[i7] = (i9 & (~i5)) | (b2 & i5);
                b = i8 & i;
            }
        }
        this.b = c;
        this.f = (this.f & (-32)) | ((32 - Integer.numberOfLeadingZeros(i5)) & 31);
        return i5;
    }

    public final Object z(Object obj) {
        if (!t()) {
            int w2 = w();
            Object obj2 = this.b;
            obj2.getClass();
            int[] iArr = this.c;
            iArr.getClass();
            Object[] objArr = this.d;
            objArr.getClass();
            int a = nze.a(obj, null, w2, obj2, iArr, objArr, null);
            if (a != -1) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                Object obj3 = objArr2[a];
                r(a, w2);
                this.h--;
                this.f += 32;
                return obj3;
            }
        }
        return y;
    }

    public so2() {
        this.a = (byte) 0;
    }
}
