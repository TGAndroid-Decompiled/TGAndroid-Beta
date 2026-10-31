package a4;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.u1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z1;
import e2.l0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import v7.t6;
public final class g {
    public final int f259a;
    public Object f260b;
    public int f261c;
    public int d;
    public int e;

    public g() {
        this.f259a = 2;
        this.f260b = l0.f6166b;
    }

    public static void i0(int i10) {
        if ((i10 & 3) == 0) {
            return;
        }
        throw b0.e();
    }

    public static void j0(int i10) {
        if ((i10 & 7) == 0) {
            return;
        }
        throw b0.e();
    }

    public void A(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof s)) {
            int i10 = this.f261c & 7;
            if (i10 != 2) {
                if (i10 == 5) {
                    do {
                        list.add(Float.valueOf(hVar.k()));
                        if (!hVar.c()) {
                            z10 = hVar.z();
                        } else {
                            return;
                        }
                    } while (z10 == this.f261c);
                    this.e = z10;
                    return;
                }
                throw b0.b();
            }
            int A = hVar.A();
            i0(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Float.valueOf(hVar.k()));
            } while (hVar.b() < b10);
            return;
        }
        throw new ClassCastException();
    }

    public Object B(b1 b1Var, m mVar) {
        int i10 = this.d;
        this.d = ((this.f261c >>> 3) << 3) | 4;
        try {
            Object a2 = b1Var.a();
            b1Var.d(a2, this, mVar);
            b1Var.c(a2);
            if (this.f261c == this.d) {
                return a2;
            }
            throw b0.e();
        } finally {
            this.d = i10;
        }
    }

    public Object C(b1 b1Var, m mVar) {
        a0(3);
        return B(b1Var, mVar);
    }

    public void D(List list, b1 b1Var, m mVar) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        int i10 = this.f261c;
        if ((i10 & 7) == 3) {
            do {
                list.add(B(b1Var, mVar));
                if (!hVar.c() && this.e == 0) {
                    z10 = hVar.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.e = z10;
            return;
        }
        throw b0.b();
    }

    public int E() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).l();
    }

    public void F(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof x)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.l()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.l()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public long G() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).m();
    }

    public void H(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof i0)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Long.valueOf(hVar.m()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.m()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public Object I(b1 b1Var, m mVar) {
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        int A = hVar.A();
        if (hVar.f1281a < 100) {
            int e = hVar.e(A);
            Object a2 = b1Var.a();
            hVar.f1281a++;
            b1Var.d(a2, this, mVar);
            b1Var.c(a2);
            hVar.a(0);
            hVar.f1281a--;
            hVar.d(e);
            return a2;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public Object J(b1 b1Var, m mVar) {
        a0(2);
        return I(b1Var, mVar);
    }

    public int K() {
        a0(5);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).v();
    }

    public void L(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof x)) {
            int i10 = this.f261c & 7;
            if (i10 != 2) {
                if (i10 == 5) {
                    do {
                        list.add(Integer.valueOf(hVar.v()));
                        if (!hVar.c()) {
                            z10 = hVar.z();
                        } else {
                            return;
                        }
                    } while (z10 == this.f261c);
                    this.e = z10;
                    return;
                }
                throw b0.b();
            }
            int A = hVar.A();
            i0(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.v()));
            } while (hVar.b() < b10);
            return;
        }
        throw new ClassCastException();
    }

    public long M() {
        a0(1);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).w();
    }

    public void N(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof i0)) {
            int i10 = this.f261c & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int A = hVar.A();
                    j0(A);
                    int b10 = hVar.b() + A;
                    do {
                        list.add(Long.valueOf(hVar.w()));
                    } while (hVar.b() < b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.w()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public int O() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).x();
    }

    public void P(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof x)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.x()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.x()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public long Q() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).y();
    }

    public void R(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof i0)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Long.valueOf(hVar.y()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.y()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public String S() {
        a0(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        if (s10 > 0) {
            int i10 = hVar.e;
            int i11 = hVar.f1285g;
            if (s10 <= i10 - i11) {
                String str = new String(bArr, i11, s10, z.f1365a);
                hVar.f1285g += s10;
                return str;
            }
        }
        if (s10 == 0) {
            return "";
        }
        if (s10 <= hVar.e) {
            hVar.D(s10);
            String str2 = new String(bArr, hVar.f1285g, s10, z.f1365a);
            hVar.f1285g += s10;
            return str2;
        }
        return new String(hVar.n(s10), z.f1365a);
    }

    public void T(List list, boolean z10) {
        String S;
        int z11;
        int z12;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if ((this.f261c & 7) == 2) {
            if ((list instanceof e0) && !z10) {
                e0 e0Var = (e0) list;
                do {
                    e0Var.e(n());
                    if (!hVar.c()) {
                        z12 = hVar.z();
                    } else {
                        return;
                    }
                } while (z12 == this.f261c);
                this.e = z12;
                return;
            }
            do {
                if (z10) {
                    S = U();
                } else {
                    S = S();
                }
                list.add(S);
                if (hVar.c()) {
                    return;
                }
                z11 = hVar.z();
            } while (z11 == this.f261c);
            this.e = z11;
            return;
        }
        throw b0.b();
    }

    public String U() {
        a0(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        int i10 = hVar.f1285g;
        int i11 = hVar.e;
        if (s10 <= i11 - i10 && s10 > 0) {
            hVar.f1285g = i10 + s10;
        } else if (s10 == 0) {
            return "";
        } else {
            i10 = 0;
            if (s10 <= i11) {
                hVar.D(s10);
                hVar.f1285g = s10;
            } else {
                bArr = hVar.n(s10);
            }
        }
        return u1.f1359a.e(i10, s10, bArr);
    }

    public int V() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).A();
    }

    public void W(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof x)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.A()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.A()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public long X() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).B();
    }

    public void Y(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof i0)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Long.valueOf(hVar.B()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.B()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public void Z(int i10) {
        if (((androidx.datastore.preferences.protobuf.h) this.f260b).b() == i10) {
            return;
        }
        throw b0.f();
    }

    public void a() {
        boolean z10;
        int i10;
        int i11 = this.f261c;
        if (i11 >= 0 && (i11 < (i10 = this.e) || (i11 == i10 && this.d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
    }

    public void a0(int i10) {
        if ((this.f261c & 7) == i10) {
            return;
        }
        throw b0.b();
    }

    public int b() {
        return ((this.e - this.f261c) * 8) - this.d;
    }

    public void b0(int i10, byte[] bArr) {
        this.f260b = bArr;
        this.f261c = 0;
        this.d = 0;
        this.e = i10;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f261c++;
        a();
    }

    public void c0(e2.x xVar) {
        b0(xVar.f6209c, xVar.f6207a);
        d0(xVar.f6208b * 8);
    }

    public int d() {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        return this.f261c;
    }

    public void d0(int i10) {
        int i11 = i10 / 8;
        this.f261c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public int e() {
        int i10 = this.e;
        if (i10 != 0) {
            this.f261c = i10;
            this.e = 0;
        } else {
            this.f261c = ((androidx.datastore.preferences.protobuf.h) this.f260b).z();
        }
        int i11 = this.f261c;
        if (i11 != 0 && i11 != this.d) {
            return i11 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public void e0() {
        int i10 = this.d + 1;
        this.d = i10;
        if (i10 == 8) {
            this.d = 0;
            this.f261c++;
        }
        a();
    }

    public int f() {
        return (this.f261c * 8) + this.d;
    }

    public void f0(int i10) {
        int i11;
        switch (this.f259a) {
            case 1:
                int i12 = i10 / 8;
                int i13 = this.d + i12;
                this.d = i13;
                int i14 = (i10 - (i12 * 8)) + this.e;
                this.e = i14;
                boolean z10 = true;
                if (i14 > 7) {
                    this.d = i13 + 1;
                    this.e = i14 - 8;
                }
                int i15 = this.d;
                if (i15 < 0 || (i15 >= (i11 = this.f261c) && (i15 != i11 || this.e != 0))) {
                    z10 = false;
                }
                t6.p(z10);
                return;
            default:
                int i16 = i10 / 8;
                int i17 = this.f261c + i16;
                this.f261c = i17;
                int i18 = (i10 - (i16 * 8)) + this.d;
                this.d = i18;
                if (i18 > 7) {
                    this.f261c = i17 + 1;
                    this.d = i18 - 8;
                }
                a();
                return;
        }
    }

    public int g() {
        return this.f261c;
    }

    public void g0(int i10) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        this.f261c += i10;
        a();
    }

    public boolean h() {
        boolean z10;
        boolean z11;
        switch (this.f259a) {
            case 1:
                if ((((((byte[]) this.f260b)[this.d] & 255) >> this.e) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f0(1);
                return z10;
            default:
                if ((((byte[]) this.f260b)[this.f261c] & (128 >> this.d)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e0();
                return z11;
        }
    }

    public boolean h0() {
        int i10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!hVar.c() && (i10 = this.f261c) != this.d) {
            return hVar.E(i10);
        }
        return false;
    }

    public int i(int i10) {
        switch (this.f259a) {
            case 1:
                int i11 = this.d;
                int min = Math.min(i10, 8 - this.e);
                byte[] bArr = (byte[]) this.f260b;
                int i12 = i11 + 1;
                int i13 = ((bArr[i11] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i10) {
                    i13 |= (bArr[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                f0(i10);
                return i14;
            default:
                if (i10 == 0) {
                    return 0;
                }
                this.d += i10;
                int i15 = 0;
                while (true) {
                    int i16 = this.d;
                    if (i16 > 8) {
                        int i17 = i16 - 8;
                        this.d = i17;
                        int i18 = this.f261c;
                        this.f261c = i18 + 1;
                        i15 |= (((byte[]) this.f260b)[i18] & 255) << i17;
                    } else {
                        int i19 = this.f261c;
                        int i20 = ((-1) >>> (32 - i10)) & (i15 | ((((byte[]) this.f260b)[i19] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.d = 0;
                            this.f261c = i19 + 1;
                        }
                        a();
                        return i20;
                    }
                }
        }
    }

    public void j(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = (byte[]) this.f260b;
            int i13 = this.f261c;
            int i14 = i13 + 1;
            this.f261c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.d;
        if (i17 + i16 > 8) {
            int i18 = this.f261c;
            this.f261c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((((byte[]) this.f260b)[i18] & 255) << i17));
            this.d = i17 - 8;
        }
        int i19 = this.d + i16;
        this.d = i19;
        int i20 = this.f261c;
        bArr[i11] = (byte) (((byte) (((255 & ((byte[]) this.f260b)[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.d = 0;
            this.f261c = i20 + 1;
        }
        a();
    }

    public long k(int i10) {
        if (i10 <= 32) {
            int i11 = i(i10);
            String str = l0.f6165a;
            return 4294967295L & i11;
        }
        int i12 = i(i10 - 32);
        int i13 = i(32);
        String str2 = l0.f6165a;
        return (4294967295L & i13) | ((i12 & 4294967295L) << 32);
    }

    public boolean l() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).f();
    }

    public void m(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof androidx.datastore.preferences.protobuf.d)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Boolean.valueOf(hVar.f()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Boolean.valueOf(hVar.f()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public androidx.datastore.preferences.protobuf.g n() {
        a0(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        int i10 = hVar.e;
        int i11 = hVar.f1285g;
        if (s10 <= i10 - i11 && s10 > 0) {
            androidx.datastore.preferences.protobuf.g l4 = androidx.datastore.preferences.protobuf.g.l(i11, s10, bArr);
            hVar.f1285g += s10;
            return l4;
        } else if (s10 == 0) {
            return androidx.datastore.preferences.protobuf.g.f1275c;
        } else {
            byte[] o10 = hVar.o(s10);
            if (o10 != null) {
                return androidx.datastore.preferences.protobuf.g.l(0, o10.length, o10);
            }
            int i12 = hVar.f1285g;
            int i13 = hVar.e;
            int i14 = i13 - i12;
            hVar.f1286i += i13;
            hVar.f1285g = 0;
            hVar.e = 0;
            ArrayList p5 = hVar.p(s10 - i14);
            byte[] bArr2 = new byte[s10];
            System.arraycopy(bArr, i12, bArr2, 0, i14);
            int size = p5.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = p5.get(i15);
                i15++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
                i14 += bArr3.length;
            }
            androidx.datastore.preferences.protobuf.g gVar = androidx.datastore.preferences.protobuf.g.f1275c;
            return new androidx.datastore.preferences.protobuf.g(bArr2);
        }
    }

    public void o(int i10, byte[] bArr) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        System.arraycopy((byte[]) this.f260b, this.f261c, bArr, 0, i10);
        this.f261c += i10;
        a();
    }

    public void p(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if ((this.f261c & 7) == 2) {
            do {
                list.add(n());
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw b0.b();
    }

    public double q() {
        a0(1);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).g();
    }

    public void r(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof androidx.datastore.preferences.protobuf.k)) {
            int i10 = this.f261c & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int A = hVar.A();
                    j0(A);
                    int b10 = hVar.b() + A;
                    do {
                        list.add(Double.valueOf(hVar.g()));
                    } while (hVar.b() < b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Double.valueOf(hVar.g()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public int s() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).h();
    }

    public void t(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof x)) {
            int i10 = this.f261c & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int b10 = hVar.b() + hVar.A();
                    do {
                        list.add(Integer.valueOf(hVar.h()));
                    } while (hVar.b() < b10);
                    Z(b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Integer.valueOf(hVar.h()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public Object u(z1 z1Var, Class cls, m mVar) {
        switch (z1Var.ordinal()) {
            case 0:
                return Double.valueOf(q());
            case 1:
                return Float.valueOf(z());
            case 2:
                return Long.valueOf(G());
            case 3:
                return Long.valueOf(X());
            case 4:
                return Integer.valueOf(E());
            case 5:
                return Long.valueOf(x());
            case 6:
                return Integer.valueOf(v());
            case 7:
                return Boolean.valueOf(l());
            case 8:
                return U();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                a0(2);
                return I(y0.f1362c.a(cls), mVar);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(V());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Integer.valueOf(K());
            case 15:
                return Long.valueOf(M());
            case 16:
                return Integer.valueOf(O());
            case 17:
                return Long.valueOf(Q());
        }
    }

    public int v() {
        a0(5);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).i();
    }

    public void w(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof x)) {
            int i10 = this.f261c & 7;
            if (i10 != 2) {
                if (i10 == 5) {
                    do {
                        list.add(Integer.valueOf(hVar.i()));
                        if (!hVar.c()) {
                            z10 = hVar.z();
                        } else {
                            return;
                        }
                    } while (z10 == this.f261c);
                    this.e = z10;
                    return;
                }
                throw b0.b();
            }
            int A = hVar.A();
            i0(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.i()));
            } while (hVar.b() < b10);
            return;
        }
        throw new ClassCastException();
    }

    public long x() {
        a0(1);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).j();
    }

    public void y(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.f260b;
        if (!(list instanceof i0)) {
            int i10 = this.f261c & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int A = hVar.A();
                    j0(A);
                    int b10 = hVar.b() + A;
                    do {
                        list.add(Long.valueOf(hVar.j()));
                    } while (hVar.b() < b10);
                    return;
                }
                throw b0.b();
            }
            do {
                list.add(Long.valueOf(hVar.j()));
                if (hVar.c()) {
                    return;
                }
                z10 = hVar.z();
            } while (z10 == this.f261c);
            this.e = z10;
            return;
        }
        throw new ClassCastException();
    }

    public float z() {
        a0(5);
        return ((androidx.datastore.preferences.protobuf.h) this.f260b).k();
    }

    public g(byte[] bArr) {
        this.f259a = 1;
        this.f260b = bArr;
        this.f261c = bArr.length;
    }

    public g(byte[] bArr, int i10) {
        this.f259a = 2;
        this.f260b = bArr;
        this.e = i10;
    }

    public g(androidx.datastore.preferences.protobuf.h hVar) {
        this.f259a = 3;
        this.e = 0;
        Charset charset = z.f1365a;
        this.f260b = hVar;
        hVar.f1282b = this;
    }

    public g(int i10, int i11) {
        this.f259a = 0;
        this.f261c = i10;
        this.d = i11;
        this.f260b = new byte[(i11 * 2) - 1];
        this.e = 0;
    }
}
