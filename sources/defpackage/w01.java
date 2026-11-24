package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public final class w01 {
    public static final long[] Q = {300000, 1000000, 3300000};
    public final boolean F;
    public HashMap I;
    public q01 L;
    public boolean M;
    public int N;
    public k01 O;
    public final l01 a;
    public int b;
    public long e;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public k01 l;
    public k01 m;
    public k01 n;
    public long o;
    public boolean q;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public long w;
    public byte c = 0;
    public final TreeMap d = new TreeMap();
    public long f = -1;
    public long g = -1;
    public long p = -1;
    public float r = 1.0f;
    public int x = -1;
    public boolean y = false;
    public final a64[] z = new a64[2];
    public final boolean[] A = new boolean[2];
    public final long[][] B = (long[][]) Array.newInstance(Long.TYPE, 3, 10);
    public final int[] C = new int[3];
    public final int[] D = new int[3];
    public byte E = 2;
    public final ArrayDeque G = new ArrayDeque();
    public final ArrayList H = new ArrayList();
    public final HashMap J = new HashMap();
    public final HashMap K = new HashMap();
    public final ArrayList P = new ArrayList();

    public w01(l01 l01Var, boolean z) {
        this.a = l01Var;
        this.F = z;
    }

    public static void d(k01 k01Var) {
        if (k01Var != null) {
            k01Var.cancel();
        }
    }

    public static long m(long j) {
        long j2 = j / 1000;
        if (j - (1000 * j2) != 0 && (((j ^ 1000) >> 63) | 1) < 0) {
            j2--;
        }
        return j2 * 1000;
    }

    public final void A(long j, long j2, boolean z) {
        if (z && this.v == 0) {
            double d = j2 - j;
            k().d.b(Math.exp((-Math.pow(d / 1000.0d, 2.0d)) / 2.0d) * 1.4142135623730951d, Math.max(d, 5.0d));
        }
    }

    public final void B() {
        d(this.n);
        this.n = this.a.j(new f01(this, (byte) 4), 100L);
    }

    public final void C() {
        if (this.c == 4) {
            return;
        }
        this.a.d("stop");
        this.c = (byte) 4;
        this.b++;
        e(true);
        d(this.l);
        d(this.m);
        d(this.n);
        d(this.O);
        this.O = null;
        this.n = null;
        this.m = null;
        this.l = null;
        this.G.clear();
        this.L = null;
        int i = 0;
        this.M = false;
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f((r01) obj);
        }
        arrayList.clear();
    }

    public final long D() {
        int i;
        ArrayDeque arrayDeque = this.G;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        if (this.L == null) {
            i = this.N;
        } else {
            i = 0;
        }
        return (arrayDeque.size() * 1000) - i;
    }

    public final void E() {
        long j;
        long j2;
        int i = (this.k > 0L ? 1 : (this.k == 0L ? 0 : -1));
        l01 l01Var = this.a;
        if (i > 0 && this.p >= 0) {
            j = ((l01Var.h() - this.k) + this.j) - this.p;
        } else {
            j = -1;
        }
        float f = 1.0f;
        if (!this.F && this.c == 2 && this.q && !this.h && this.g < 0 && j >= 0 && this.f - this.p > 1000) {
            long min = j - (Math.min(this.i * 1000, 1000L) + 3000);
            if (this.r > 1.0f) {
                j2 = 100;
            } else {
                j2 = 500;
            }
            if (min > j2) {
                if (l01Var.h() - this.k > 10000) {
                    if (!this.s) {
                        this.s = true;
                        l01Var.e(new c01(this, this.b, (byte) 0));
                    }
                    f = this.r;
                } else {
                    f = 1.05f;
                }
            }
        }
        if (f != this.r) {
            this.r = f;
            l01Var.d("playback rate " + f + ", latency " + j + " ms, target " + (Math.min(this.i * 1000, 1000L) + 3000) + " ms");
            l01Var.a(f);
        }
    }

    public final int a(a64 a64Var, long j, long j2, int i, int i2, long j3) {
        double max;
        double b = a64Var.b();
        if (j - Math.max(j2, this.w) > Math.max(b, 500.0d)) {
            double c = c();
            double a = a64Var.a();
            double d = b / 1000.0d;
            double s = ((s(i) * 1.0d) / a) + d;
            if (s > c) {
                int i3 = i - 1;
                double d2 = Double.POSITIVE_INFINITY;
                int i4 = i;
                while (true) {
                    if (i3 >= i2) {
                        double d3 = d;
                        d2 = ((s(i3) * 1.0d) / a) + d3;
                        if (d2 < Math.min(c, d3 + 1.0d)) {
                            break;
                        }
                        i4 = i3;
                        i3--;
                        d = d3;
                    } else {
                        i3 = i4;
                        break;
                    }
                }
                if (i3 != i && d2 < s && d2 <= 10.0d) {
                    double s2 = s(i3);
                    if (a64Var.a() * 0.7d > s2) {
                        this.z[this.y ? 1 : 0] = new a64(s2);
                        this.A[this.y ? 1 : 0] = true;
                    }
                    this.a.d("abandon " + j3 + " q" + i + " -> q" + i3 + ", loading " + ((long) max) + " ms, buffer " + String.format("%.2f", Double.valueOf(c)) + " s");
                    return i3;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public final long b() {
        long max;
        long j = this.g;
        if (j >= 0) {
            max = m(j);
        } else {
            max = Math.max(this.f, 0L);
        }
        while (true) {
            m01 m01Var = (m01) this.d.get(Long.valueOf(max));
            if (m01Var == null || !m01Var.a()) {
                break;
            }
            max += 1000;
        }
        if (this.g < 0 && this.f < 0) {
            return 0L;
        }
        return max;
    }

    public final double c() {
        long max;
        if (this.g < 0) {
            long j = this.f;
            if (j >= 0) {
                if (this.F) {
                    max = t();
                } else {
                    long j2 = this.p;
                    if (j2 >= 0) {
                        j = j2;
                    }
                    max = Math.max(0L, b() - j);
                }
                return max / 1000.0d;
            }
            return 0.0d;
        }
        return 0.0d;
    }

    public final void e(boolean z) {
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            m01 m01Var = (m01) ((Map.Entry) it.next()).getValue();
            k01 k01Var = m01Var.c;
            if (k01Var != null) {
                k01Var.cancel();
                m01Var.c = null;
                m01Var.e++;
                this.v--;
            }
            d(m01Var.d);
            m01Var.d = null;
            for (u01 u01Var : m01Var.k.values()) {
                g(u01Var);
            }
            if (z || !m01Var.a()) {
                it.remove();
            }
        }
        this.e = b();
    }

    public final void f(r01 r01Var) {
        k01 k01Var = r01Var.e;
        if (k01Var != null) {
            k01Var.cancel();
            r01Var.e = null;
            this.v--;
        }
        r01Var.g++;
        d(r01Var.f);
        r01Var.f = null;
    }

    public final void g(u01 u01Var) {
        k01 k01Var = u01Var.d;
        if (k01Var != null) {
            k01Var.cancel();
            u01Var.d = null;
            this.v--;
        }
        u01Var.f++;
        d(u01Var.e);
        u01Var.e = null;
    }

    public final int[] h() {
        long j;
        int i;
        int i2;
        double d;
        int[] iArr;
        int i3;
        int i4;
        double d2;
        int intValue;
        long j2;
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iArr2[i6] = ((t01) arrayList.get(i6)).b;
        }
        a64 a64Var = this.z[this.y ? 1 : 0];
        if (o(a64Var) && size != 0) {
            Integer[] numArr = new Integer[size];
            for (int i7 = 0; i7 < size; i7++) {
                numArr[i7] = Integer.valueOf(i7);
            }
            Arrays.sort(numArr, new i01(this, (byte) 0));
            double a = a64Var.a();
            double b = a64Var.b() / 1000.0d;
            if (this.g < 0 && this.f >= 0) {
                j = t();
            } else {
                j = 0;
            }
            double d3 = j / 1000.0d;
            int i8 = 0;
            while (true) {
                HashMap hashMap = this.J;
                if (i8 < 2) {
                    if (i8 == 0) {
                        d = d3;
                    } else {
                        d = d3 + 1.0d;
                    }
                    int[] iArr3 = (int[]) iArr2.clone();
                    while (true) {
                        iArr = iArr2;
                        int i9 = i5;
                        i3 = i9;
                        i4 = i8;
                        long j3 = 100000;
                        while (i9 < iArr3.length) {
                            long s = s(iArr3[i9]) + j3;
                            Integer num = (Integer) hashMap.get(((t01) arrayList.get(i9)).a);
                            if (num != null) {
                                j2 = s;
                                if (iArr3[i9] > num.intValue()) {
                                    i3 = 1;
                                }
                            } else {
                                j2 = s;
                            }
                            i9++;
                            j3 = j2;
                        }
                        if (i3 != 0) {
                            d2 = 0.7d;
                        } else {
                            d2 = 0.95d;
                        }
                        double d4 = j3;
                        if (d4 <= d2 * a && ((d4 * 1.0d) / a) + b <= d) {
                            return iArr3;
                        }
                        for (int i10 = i3; i10 < size; i10++) {
                            intValue = numArr[i10].intValue();
                            int i11 = iArr3[intValue];
                            ((t01) arrayList.get(intValue)).getClass();
                            if (i11 > 0) {
                                break;
                            }
                        }
                        iArr3[intValue] = iArr3[intValue] - 1;
                        i5 = i3;
                        i8 = i4;
                        iArr2 = iArr;
                    }
                } else {
                    int[] iArr4 = iArr2;
                    int i12 = i5;
                    int[] iArr5 = new int[size];
                    long j4 = 0;
                    long j5 = 0;
                    while (i5 < size) {
                        t01 t01Var = (t01) arrayList.get(i5);
                        t01Var.getClass();
                        iArr5[i5] = i12;
                        int i13 = i12;
                        j4 += s(i13);
                        Integer num2 = (Integer) hashMap.get(t01Var.a);
                        if (num2 != null) {
                            i2 = num2.intValue();
                        } else {
                            i2 = t01Var.b;
                        }
                        j5 = s(i2) + j5;
                        i5++;
                        i12 = i13;
                    }
                    int i14 = i12;
                    if (j4 < j5) {
                        return iArr5;
                    }
                    for (int i15 = i14; i15 < size; i15++) {
                        Integer num3 = (Integer) hashMap.get(((t01) arrayList.get(i15)).a);
                        if (num3 != null) {
                            i = num3.intValue();
                        } else {
                            i = ((t01) arrayList.get(i15)).b;
                        }
                        iArr4[i15] = i;
                    }
                    return iArr4;
                }
                i8 = i4 + 1;
                i5 = i3;
                iArr2 = iArr;
            }
        } else {
            return iArr2;
        }
    }

    public final void i(m01 m01Var, long j) {
        boolean a = m01Var.a();
        LinkedHashMap linkedHashMap = m01Var.k;
        if (!a) {
            return;
        }
        if (linkedHashMap.isEmpty() && m01Var.j == 0) {
            this.w = j;
            j();
            w();
            return;
        }
        a64 k = k();
        long j2 = m01Var.f;
        boolean z = m01Var.g;
        for (u01 u01Var : linkedHashMap.values()) {
            long j3 = u01Var.g;
            if (j3 < j2) {
                z = u01Var.h;
                j2 = j3;
            }
        }
        double max = j - Math.max(j2, this.w);
        if (z) {
            max -= k.b();
        }
        k.c(m01Var.l, max);
        this.w = j;
        j();
        w();
    }

    public final void j() {
        int i;
        boolean z = this.F;
        l01 l01Var = this.a;
        if (z) {
            long j = this.g;
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            TreeMap treeMap = this.d;
            if (i2 >= 0) {
                long m = m(j);
                m01 m01Var = (m01) treeMap.get(Long.valueOf(m));
                if (m01Var != null && m01Var.a()) {
                    this.N = (int) (this.g - m);
                    this.f = m;
                    this.g = -1L;
                } else {
                    return;
                }
            }
            if (this.f >= 0) {
                while (true) {
                    m01 m01Var2 = (m01) treeMap.get(Long.valueOf(this.f));
                    if (m01Var2 == null) {
                        break;
                    }
                    LinkedHashMap linkedHashMap = m01Var2.k;
                    if (!m01Var2.a()) {
                        break;
                    }
                    treeMap.remove(Long.valueOf(this.f));
                    this.f += 1000;
                    if (linkedHashMap.isEmpty()) {
                        i = m01Var2.j;
                    } else {
                        i = 1000;
                    }
                    s01 s01Var = new s01(m01Var2.a, 0, m01Var2.h, m01Var2.i, i);
                    for (u01 u01Var : linkedHashMap.values()) {
                        String str = u01Var.a;
                        s01Var.f.add(new v01(str, u01Var.b, u01Var.c, u01Var.i, u01Var.j));
                        Integer num = (Integer) this.K.put(str, Integer.valueOf(u01Var.c));
                        if (num == null || num.intValue() != u01Var.c) {
                            l01Var.d("video " + str + " quality " + num + " -> " + u01Var.c + " at " + m01Var2.a);
                        }
                    }
                    l01Var.b(s01Var);
                    this.G.addLast(s01Var);
                }
                u();
            }
        } else if (this.g >= 0) {
            long b = b();
            long j2 = this.g;
            if (b - j2 >= 2000) {
                this.g = -1L;
                this.h = false;
                l01Var.d("player starts at " + j2);
                this.u = true;
                l01Var.c(j2);
                this.f = m(j2);
                n();
            }
        } else {
            long j3 = this.f;
            if (j3 >= 0) {
                if (this.h) {
                    long j4 = this.p;
                    if (j4 >= 0) {
                        j3 = j4;
                    }
                    if (b() - j3 < 2000) {
                        return;
                    }
                    l01Var.d("resume buffer loaded ahead of " + j3);
                    this.h = false;
                    this.u = true;
                }
                n();
            }
        }
    }

    public final a64 k() {
        boolean z = this.y;
        a64[] a64VarArr = this.z;
        a64 a64Var = a64VarArr[z ? 1 : 0];
        if (a64Var == null) {
            a64 a64Var2 = new a64(500000.0d);
            a64VarArr[z ? 1 : 0] = a64Var2;
            return a64Var2;
        }
        return a64Var;
    }

    public final t01 l(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t01 t01Var = (t01) obj;
            if (t01Var.a.equals(str)) {
                return t01Var;
            }
        }
        return null;
    }

    public final void n() {
        while (true) {
            Long valueOf = Long.valueOf(this.f);
            TreeMap treeMap = this.d;
            m01 m01Var = (m01) treeMap.get(valueOf);
            if (m01Var != null && m01Var.h != null) {
                treeMap.remove(Long.valueOf(this.f));
                this.f += 1000;
                this.a.b(new s01(m01Var.a, m01Var.b, m01Var.h, m01Var.i, m01Var.j));
            } else {
                return;
            }
        }
    }

    public final boolean o(a64 a64Var) {
        if (a64Var != null) {
            if (a64Var.c.c >= 0.001d || this.A[this.y ? 1 : 0]) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(m01 m01Var) {
        boolean z;
        p01 p01Var;
        m01Var.d = null;
        l01 l01Var = this.a;
        m01Var.f = l01Var.h();
        int i = this.v;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        m01Var.g = z;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = m01Var.e + 1;
        m01Var.e = i3;
        long j = m01Var.a;
        if (this.F) {
            p01Var = new p01(j, 0, 0);
        } else {
            p01Var = new p01(j, 1, m01Var.b);
        }
        m01Var.c = new qn0((byte) 11);
        ji i4 = l01Var.i(p01Var, new d01(this, i2, m01Var, i3, (byte) 0));
        if (m01Var.e == i3 && m01Var.c != null) {
            m01Var.c = i4;
        }
    }

    public final void q(r01 r01Var) {
        boolean z;
        r01Var.f = null;
        l01 l01Var = this.a;
        r01Var.h = l01Var.h();
        int i = this.v;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        r01Var.i = z;
        this.v = i + 1;
        int i2 = this.b;
        int i3 = r01Var.g + 1;
        r01Var.g = i3;
        r01Var.e = new qn0((byte) 11);
        ji i4 = l01Var.i(new p01(r01Var.a.a, r01Var.c, r01Var.d), new d01(this, i2, r01Var, i3, (byte) 1));
        if (r01Var.g == i3 && r01Var.e != null) {
            r01Var.e = i4;
        }
    }

    public final void r(final m01 m01Var, final u01 u01Var) {
        boolean z;
        u01Var.e = null;
        l01 l01Var = this.a;
        u01Var.g = l01Var.h();
        int i = this.v;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        u01Var.h = z;
        this.v = i + 1;
        final int i2 = this.b;
        final int i3 = u01Var.f + 1;
        u01Var.f = i3;
        u01Var.d = new qn0((byte) 11);
        ji i4 = l01Var.i(new p01(m01Var.a, u01Var.b, u01Var.c), new o01() {
            @Override
            public final void b(n01 n01Var) {
                w01 w01Var = w01.this;
                w01Var.a.j(new h01(w01Var, i2, u01Var, i3, m01Var, n01Var), 0L);
            }
        });
        if (u01Var.f == i3 && u01Var.d != null) {
            u01Var.d = i4;
        }
    }

    public final long s(int i) {
        int i2 = this.C[i];
        if (i2 == 0) {
            return Q[i];
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += this.B[i][i3];
        }
        return j / i2;
    }

    public final long t() {
        long D = D();
        q01 q01Var = this.L;
        if (q01Var != null && this.M) {
            return Math.max(0L, (Math.max(1000 - q01Var.c, 0L) + q01Var.b) - this.a.h()) + D;
        }
        return D;
    }

    public final void u() {
        long j;
        q01 q01Var;
        q01 q01Var2;
        long j2;
        int i;
        if (this.c != 4) {
            d(this.O);
            this.O = null;
            l01 l01Var = this.a;
            long h = l01Var.h();
            boolean z = this.M;
            ArrayDeque arrayDeque = this.G;
            if (!z) {
                if (this.L == null) {
                    j2 = 1000;
                } else {
                    j2 = 2000;
                }
                if (!arrayDeque.isEmpty() && D() >= j2) {
                    if (this.L == null) {
                        i = this.N;
                    } else {
                        i = 0;
                    }
                    s01 s01Var = (s01) arrayDeque.pollFirst();
                    this.L = new q01(s01Var, h, i);
                    l01Var.g(s01Var.a, i, h);
                    j = h;
                    this.M = true;
                    if (!this.t) {
                        this.t = true;
                        B();
                    }
                } else {
                    return;
                }
            } else {
                j = h;
            }
            long j3 = this.L.b;
            if (j3 > j) {
                this.O = l01Var.j(new f01(this, (byte) 1), j3 - j);
                return;
            }
            long max = Math.max(1000 - q01Var.c, 0L) + j3;
            if (!arrayDeque.isEmpty()) {
                long min = Math.min(this.L.b + Math.max(q01Var2.d - q01Var2.c, 0), max);
                if (min < max && (arrayDeque.size() - 1) * 1000 < 1000) {
                    min = max;
                }
                long max2 = Math.max(min, j);
                if (max2 <= max) {
                    s01 s01Var2 = (s01) arrayDeque.pollFirst();
                    this.L = new q01(s01Var2, max2, 0);
                    l01Var.g(s01Var2.a, 0, max2);
                    this.O = l01Var.j(new f01(this, (byte) 2), max2 - j);
                    return;
                }
            }
            if (j >= max) {
                this.M = false;
                this.i++;
                l01Var.d("stall after " + this.L.a + ", buffered to " + this.f);
                u();
                return;
            }
            this.O = l01Var.j(new f01(this, (byte) 3), max - j);
        }
    }

    public final void v(m01 m01Var, HashMap hashMap) {
        if (hashMap != null) {
            ArrayList arrayList = this.H;
            if (!arrayList.isEmpty()) {
                int[] h = h();
                for (int i = 0; i < arrayList.size(); i++) {
                    String str = ((t01) arrayList.get(i)).a;
                    Integer num = (Integer) hashMap.get(str);
                    LinkedHashMap linkedHashMap = m01Var.k;
                    u01 u01Var = (u01) linkedHashMap.get(str);
                    if (num == null) {
                        if (u01Var != null) {
                            g(u01Var);
                            linkedHashMap.remove(str);
                        }
                    } else if (u01Var == null) {
                        u01 u01Var2 = new u01(str, num.intValue(), h[i]);
                        linkedHashMap.put(str, u01Var2);
                        r(m01Var, u01Var2);
                    } else if (u01Var.b != num.intValue()) {
                        g(u01Var);
                        u01Var.b = num.intValue();
                        u01Var.i = null;
                        r(m01Var, u01Var);
                    }
                }
            }
        }
    }

    public final void w() {
        l01 l01Var;
        long j;
        long j2;
        long j3;
        int i;
        double d;
        double d2;
        int i2;
        int i3 = 2;
        if (this.c == 2) {
            d(this.l);
            this.l = null;
            while (true) {
                TreeMap treeMap = this.d;
                int i4 = 0;
                for (m01 m01Var : treeMap.values()) {
                    if (!m01Var.a()) {
                        i4++;
                    }
                }
                if (i4 < i3) {
                    l01 l01Var2 = this.a;
                    boolean z = this.F;
                    if (z && this.g < 0 && this.f >= 0) {
                        j3 = (this.e - this.f) + t();
                        l01Var = l01Var2;
                        j = 1000;
                    } else {
                        long j4 = this.e;
                        if (z) {
                            j2 = this.g;
                            if (j2 >= 0) {
                                l01Var = l01Var2;
                                j = 1000;
                            } else {
                                long h = l01Var2.h();
                                q01 q01Var = this.L;
                                if (q01Var != null && this.M) {
                                    j = 1000;
                                    long j5 = q01Var.b;
                                    if (j5 <= h) {
                                        long j6 = q01Var.a;
                                        l01Var = l01Var2;
                                        long j7 = q01Var.c;
                                        j2 = Math.min(h - j5, 1000 - j7) + j6 + j7;
                                    } else {
                                        l01Var = l01Var2;
                                    }
                                } else {
                                    l01Var = l01Var2;
                                    j = 1000;
                                }
                                ArrayDeque arrayDeque = this.G;
                                if (!arrayDeque.isEmpty()) {
                                    j2 = ((s01) arrayDeque.peekFirst()).a;
                                } else {
                                    j2 = Math.max(this.f, 0L);
                                }
                            }
                        } else {
                            l01Var = l01Var2;
                            j = 1000;
                            j2 = this.g;
                            if (j2 < 0) {
                                j2 = this.p;
                                if (j2 < 0) {
                                    j2 = Math.max(this.f, 0L);
                                }
                            }
                        }
                        j3 = j4 - j2;
                    }
                    if (j3 < 30000) {
                        long h2 = (l01Var.h() - this.k) + this.j;
                        long j8 = this.e;
                        long j9 = j8 + j;
                        if (j9 > h2) {
                            this.l = l01Var.j(new f01(this, (byte) 5), j9 - h2);
                            return;
                        }
                        l01 l01Var3 = l01Var;
                        m01 m01Var2 = new m01(j8);
                        treeMap.put(Long.valueOf(m01Var2.a), m01Var2);
                        this.e += j;
                        if (z) {
                            i2 = 0;
                        } else {
                            a64 a64Var = this.z[this.y ? 1 : 0];
                            if (!o(a64Var)) {
                                i = this.E;
                            } else {
                                double a = a64Var.a();
                                double b = a64Var.b() / 1000.0d;
                                double c = c();
                                int i5 = 0;
                                while (true) {
                                    i = 1;
                                    if (i5 < 2) {
                                        double d3 = 1.0d;
                                        if (i5 == 0) {
                                            d = c;
                                        } else {
                                            d = c + 1.0d;
                                        }
                                        int i6 = this.E;
                                        while (i6 >= 1) {
                                            double d4 = d3;
                                            long s = s(i6);
                                            int i7 = this.x;
                                            if (i7 >= 0 && i6 > i7) {
                                                d2 = 0.7d;
                                            } else {
                                                d2 = 0.95d;
                                            }
                                            double d5 = s;
                                            if (d5 <= d2 * a && ((d5 * d4) / a) + b <= d) {
                                                i = i6;
                                                break;
                                            } else {
                                                i6--;
                                                d3 = d4;
                                            }
                                        }
                                        i5++;
                                    } else {
                                        int i8 = this.x;
                                        int i9 = this.E;
                                        if (i8 >= 0) {
                                            i9 = Math.min(i8, i9);
                                        }
                                        if (s(1) >= s(i9)) {
                                            i = i9;
                                        }
                                    }
                                }
                            }
                            i2 = i;
                        }
                        m01Var2.b = i2;
                        l01Var3.h();
                        p(m01Var2);
                        if (z) {
                            v(m01Var2, this.I);
                        }
                        i3 = 2;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void x(int i, int i2) {
        long[] jArr = this.B[i];
        int[] iArr = this.D;
        int i3 = iArr[i];
        jArr[i3] = ((i2 << 3) * 1000) / 1000;
        iArr[i] = (i3 + 1) % 10;
        int[] iArr2 = this.C;
        iArr2[i] = Math.min(iArr2[i] + 1, 10);
    }

    public final void y() {
        this.c = (byte) 1;
        this.a.e(new c01(this, this.b, (byte) 1));
    }

    public final void z(long j) {
        e(false);
        d(this.l);
        this.l = null;
        if (j <= 0) {
            y();
            return;
        }
        this.j = j;
        l01 l01Var = this.a;
        this.k = l01Var.h();
        long min = Math.min(Math.max(j - 30000, j - (Math.min(this.i * 1000, 1000L) + 3000)), j - 1000);
        if (this.f < 0) {
            this.g = min;
            this.e = m(min);
        } else {
            long m = m(min);
            long b = b();
            if (m > b) {
                e(true);
                ArrayList arrayList = this.P;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    f((r01) obj);
                }
                arrayList.clear();
                this.h = false;
                this.f = m;
                this.e = m;
            } else {
                this.e = b;
            }
        }
        StringBuilder o = wi8.o(j, "listener resync at server time ", ", fetching from ");
        o.append(this.e);
        l01Var.d(o.toString());
        w();
    }
}
