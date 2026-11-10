package d4;

import a8.ia;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.v1;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import h2.m0;
import h2.x;
import java.io.IOException;
import java.nio.charset.Charset;
public final class f {
    public final int f8166a;
    public Object f8167b;
    public int f8168c;
    public int d;
    public int f8169e;

    public f() {
        this.f8166a = 2;
        this.f8167b = m0.f14115b;
    }

    public static void O(int i7) {
        if ((i7 & 3) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public static void P(int i7) {
        if ((i7 & 7) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void A(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Integer.valueOf(kVar.q()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.q()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void B(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Long.valueOf(kVar.r()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Long.valueOf(kVar.r()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void C(b0 b0Var, boolean z9) {
        String s5;
        int u10;
        k kVar = (k) this.f8167b;
        if ((this.f8168c & 7) == 2) {
            do {
                if (z9) {
                    G(2);
                    s5 = kVar.t();
                } else {
                    G(2);
                    s5 = kVar.s();
                }
                b0Var.add(s5);
                if (kVar.c()) {
                    return;
                }
                u10 = kVar.u();
            } while (u10 == this.f8168c);
            this.f8169e = u10;
            return;
        }
        throw e0.b();
    }

    public void D(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Integer.valueOf(kVar.v()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.v()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void E(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Long.valueOf(kVar.w()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Long.valueOf(kVar.w()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void F(int i7) {
        if (((k) this.f8167b).b() == i7) {
            return;
        }
        throw e0.e();
    }

    public void G(int i7) {
        if ((this.f8168c & 7) == i7) {
            return;
        }
        throw e0.b();
    }

    public void H(int i7, byte[] bArr) {
        this.f8167b = bArr;
        this.f8168c = 0;
        this.d = 0;
        this.f8169e = i7;
    }

    public void I(x xVar) {
        H(xVar.f14166c, xVar.f14164a);
        J(xVar.f14165b * 8);
    }

    public void J(int i7) {
        int i10 = i7 / 8;
        this.f8168c = i10;
        this.d = i7 - (i10 * 8);
        a();
    }

    public void K() {
        int i7 = this.d + 1;
        this.d = i7;
        if (i7 == 8) {
            this.d = 0;
            this.f8168c++;
        }
        a();
    }

    public void L(int i7) {
        int i10;
        switch (this.f8166a) {
            case 1:
                int i11 = i7 / 8;
                int i12 = this.d + i11;
                this.d = i12;
                int i13 = (i7 - (i11 * 8)) + this.f8169e;
                this.f8169e = i13;
                boolean z9 = true;
                if (i13 > 7) {
                    this.d = i12 + 1;
                    this.f8169e = i13 - 8;
                }
                int i14 = this.d;
                if (i14 < 0 || (i14 >= (i10 = this.f8168c) && (i14 != i10 || this.f8169e != 0))) {
                    z9 = false;
                }
                ia.p(z9);
                return;
            default:
                int i15 = i7 / 8;
                int i16 = this.f8168c + i15;
                this.f8168c = i16;
                int i17 = (i7 - (i15 * 8)) + this.d;
                this.d = i17;
                if (i17 > 7) {
                    this.f8168c = i16 + 1;
                    this.d = i17 - 8;
                }
                a();
                return;
        }
    }

    public void M(int i7) {
        boolean z9;
        if (this.d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        this.f8168c += i7;
        a();
    }

    public boolean N() {
        int i7;
        k kVar = (k) this.f8167b;
        if (!kVar.c() && (i7 = this.f8168c) != this.d) {
            return kVar.x(i7);
        }
        return false;
    }

    public void a() {
        boolean z9;
        int i7;
        int i10 = this.f8168c;
        if (i10 >= 0 && (i10 < (i7 = this.f8169e) || (i10 == i7 && this.d == 0))) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
    }

    public int b() {
        return ((this.f8169e - this.f8168c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f8168c++;
        a();
    }

    public int d() {
        boolean z9;
        if (this.d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        return this.f8168c;
    }

    public int e() {
        int i7 = this.f8169e;
        if (i7 != 0) {
            this.f8168c = i7;
            this.f8169e = 0;
        } else {
            this.f8168c = ((k) this.f8167b).u();
        }
        int i10 = this.f8168c;
        if (i10 != 0 && i10 != this.d) {
            return i10 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public int f() {
        return (this.f8168c * 8) + this.d;
    }

    public void g(Object obj, b1 b1Var, p pVar) {
        int i7 = this.d;
        this.d = ((this.f8168c >>> 3) << 3) | 4;
        try {
            b1Var.i(obj, this, pVar);
            if (this.f8168c == this.d) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.d = i7;
        }
    }

    public void h(Object obj, b1 b1Var, p pVar) {
        k kVar = (k) this.f8167b;
        int v = kVar.v();
        if (kVar.f2209a < 100) {
            int e10 = kVar.e(v);
            kVar.f2209a++;
            b1Var.i(obj, this, pVar);
            kVar.a(0);
            kVar.f2209a--;
            kVar.d(e10);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public boolean i() {
        boolean z9;
        boolean z10;
        switch (this.f8166a) {
            case 1:
                if ((((((byte[]) this.f8167b)[this.d] & 255) >> this.f8169e) & 1) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                L(1);
                return z9;
            default:
                if ((((byte[]) this.f8167b)[this.f8168c] & (128 >> this.d)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K();
                return z10;
        }
    }

    public int j(int i7) {
        switch (this.f8166a) {
            case 1:
                int i10 = this.d;
                int min = Math.min(i7, 8 - this.f8169e);
                byte[] bArr = (byte[]) this.f8167b;
                int i11 = i10 + 1;
                int i12 = ((bArr[i10] & 255) >> this.f8169e) & (255 >> (8 - min));
                while (min < i7) {
                    i12 |= (bArr[i11] & 255) << min;
                    min += 8;
                    i11++;
                }
                int i13 = i12 & ((-1) >>> (32 - i7));
                L(i7);
                return i13;
            default:
                if (i7 == 0) {
                    return 0;
                }
                this.d += i7;
                int i14 = 0;
                while (true) {
                    int i15 = this.d;
                    if (i15 > 8) {
                        int i16 = i15 - 8;
                        this.d = i16;
                        int i17 = this.f8168c;
                        this.f8168c = i17 + 1;
                        i14 |= (((byte[]) this.f8167b)[i17] & 255) << i16;
                    } else {
                        int i18 = this.f8168c;
                        int i19 = ((-1) >>> (32 - i7)) & (i14 | ((((byte[]) this.f8167b)[i18] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.d = 0;
                            this.f8168c = i18 + 1;
                        }
                        a();
                        return i19;
                    }
                }
        }
    }

    public void k(int i7, byte[] bArr) {
        int i10 = i7 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = (byte[]) this.f8167b;
            int i12 = this.f8168c;
            int i13 = i12 + 1;
            this.f8168c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i7 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.d;
        if (i16 + i15 > 8) {
            int i17 = this.f8168c;
            this.f8168c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((((byte[]) this.f8167b)[i17] & 255) << i16));
            this.d = i16 - 8;
        }
        int i18 = this.d + i15;
        this.d = i18;
        int i19 = this.f8168c;
        bArr[i10] = (byte) (((byte) (((255 & ((byte[]) this.f8167b)[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.d = 0;
            this.f8168c = i19 + 1;
        }
        a();
    }

    public long l(int i7) {
        if (i7 <= 32) {
            int j3 = j(i7);
            String str = m0.f14114a;
            return 4294967295L & j3;
        }
        int j10 = j(i7 - 32);
        int j11 = j(32);
        String str2 = m0.f14114a;
        return (4294967295L & j11) | ((j10 & 4294967295L) << 32);
    }

    public void m(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Boolean.valueOf(kVar.f()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Boolean.valueOf(kVar.f()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public androidx.datastore.preferences.protobuf.h n() {
        G(2);
        return ((k) this.f8167b).g();
    }

    public void o(int i7, byte[] bArr) {
        boolean z9;
        if (this.d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        System.arraycopy((byte[]) this.f8167b, this.f8168c, bArr, 0, i7);
        this.f8168c += i7;
        a();
    }

    public void p(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        if ((this.f8168c & 7) == 2) {
            do {
                b0Var.add(n());
                if (kVar.c()) {
                    return;
                }
                u10 = kVar.u();
            } while (u10 == this.f8168c);
            this.f8169e = u10;
            return;
        }
        throw e0.b();
    }

    public void q(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 1) {
            if (i7 == 2) {
                int v = kVar.v();
                P(v);
                int b10 = kVar.b() + v;
                do {
                    b0Var.add(Double.valueOf(kVar.h()));
                } while (kVar.b() < b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Double.valueOf(kVar.h()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void r(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Integer.valueOf(kVar.i()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.i()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public Object s(v1 v1Var, Class cls, p pVar) {
        k kVar = (k) this.f8167b;
        switch (v1Var.ordinal()) {
            case 0:
                G(1);
                return Double.valueOf(kVar.h());
            case 1:
                G(5);
                return Float.valueOf(kVar.l());
            case 2:
                G(0);
                return Long.valueOf(kVar.n());
            case 3:
                G(0);
                return Long.valueOf(kVar.w());
            case 4:
                G(0);
                return Integer.valueOf(kVar.m());
            case 5:
                G(1);
                return Long.valueOf(kVar.k());
            case 6:
                G(5);
                return Integer.valueOf(kVar.j());
            case 7:
                G(0);
                return Boolean.valueOf(kVar.f());
            case 8:
                G(2);
                return kVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                G(2);
                b1 a10 = y0.f2288c.a(cls);
                z a11 = a10.a();
                h(a11, a10, pVar);
                a10.d(a11);
                return a11;
            case 11:
                return n();
            case 12:
                G(0);
                return Integer.valueOf(kVar.v());
            case 13:
                G(0);
                return Integer.valueOf(kVar.i());
            case 14:
                G(5);
                return Integer.valueOf(kVar.o());
            case 15:
                G(1);
                return Long.valueOf(kVar.p());
            case 16:
                G(0);
                return Integer.valueOf(kVar.q());
            case 17:
                G(0);
                return Long.valueOf(kVar.r());
        }
    }

    public void t(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 2) {
            if (i7 == 5) {
                do {
                    b0Var.add(Integer.valueOf(kVar.j()));
                    if (!kVar.c()) {
                        u10 = kVar.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f8168c);
                this.f8169e = u10;
                return;
            }
            throw e0.b();
        }
        int v = kVar.v();
        O(v);
        int b10 = kVar.b() + v;
        do {
            b0Var.add(Integer.valueOf(kVar.j()));
        } while (kVar.b() < b10);
    }

    public void u(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 1) {
            if (i7 == 2) {
                int v = kVar.v();
                P(v);
                int b10 = kVar.b() + v;
                do {
                    b0Var.add(Long.valueOf(kVar.k()));
                } while (kVar.b() < b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Long.valueOf(kVar.k()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void v(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 2) {
            if (i7 == 5) {
                do {
                    b0Var.add(Float.valueOf(kVar.l()));
                    if (!kVar.c()) {
                        u10 = kVar.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f8168c);
                this.f8169e = u10;
                return;
            }
            throw e0.b();
        }
        int v = kVar.v();
        O(v);
        int b10 = kVar.b() + v;
        do {
            b0Var.add(Float.valueOf(kVar.l()));
        } while (kVar.b() < b10);
    }

    public void w(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Integer.valueOf(kVar.m()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.m()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void x(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int b10 = kVar.b() + kVar.v();
                do {
                    b0Var.add(Long.valueOf(kVar.n()));
                } while (kVar.b() < b10);
                F(b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Long.valueOf(kVar.n()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public void y(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 2) {
            if (i7 == 5) {
                do {
                    b0Var.add(Integer.valueOf(kVar.o()));
                    if (!kVar.c()) {
                        u10 = kVar.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f8168c);
                this.f8169e = u10;
                return;
            }
            throw e0.b();
        }
        int v = kVar.v();
        O(v);
        int b10 = kVar.b() + v;
        do {
            b0Var.add(Integer.valueOf(kVar.o()));
        } while (kVar.b() < b10);
    }

    public void z(b0 b0Var) {
        int u10;
        k kVar = (k) this.f8167b;
        int i7 = this.f8168c & 7;
        if (i7 != 1) {
            if (i7 == 2) {
                int v = kVar.v();
                P(v);
                int b10 = kVar.b() + v;
                do {
                    b0Var.add(Long.valueOf(kVar.p()));
                } while (kVar.b() < b10);
                return;
            }
            throw e0.b();
        }
        do {
            b0Var.add(Long.valueOf(kVar.p()));
            if (kVar.c()) {
                return;
            }
            u10 = kVar.u();
        } while (u10 == this.f8168c);
        this.f8169e = u10;
    }

    public f(k kVar) {
        this.f8166a = 3;
        this.f8169e = 0;
        Charset charset = c0.f2156a;
        this.f8167b = kVar;
        kVar.f2210b = this;
    }

    public f(byte[] bArr) {
        this.f8166a = 1;
        this.f8167b = bArr;
        this.f8168c = bArr.length;
    }

    public f(byte[] bArr, int i7) {
        this.f8166a = 2;
        this.f8167b = bArr;
        this.f8169e = i7;
    }

    public f(int i7, int i10) {
        this.f8166a = 0;
        this.f8168c = i7;
        this.d = i10;
        this.f8167b = new byte[(i10 * 2) - 1];
        this.f8169e = 0;
    }
}
