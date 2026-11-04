package c4;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.v1;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import b8.zb;
import g2.n0;
import g2.y;
import java.io.IOException;
import java.nio.charset.Charset;
public final class f {
    public final int f4189a;
    public Object f4190b;
    public int f4191c;
    public int d;
    public int f4192e;

    public f() {
        this.f4189a = 2;
        this.f4190b = n0.f11874b;
    }

    public static void O(int i3) {
        if ((i3 & 3) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public static void P(int i3) {
        if ((i3 & 7) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void A(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void B(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void C(b0 b0Var, boolean z10) {
        String s6;
        int u10;
        k kVar = (k) this.f4190b;
        if ((this.f4191c & 7) == 2) {
            do {
                if (z10) {
                    G(2);
                    s6 = kVar.t();
                } else {
                    G(2);
                    s6 = kVar.s();
                }
                b0Var.add(s6);
                if (kVar.c()) {
                    return;
                }
                u10 = kVar.u();
            } while (u10 == this.f4191c);
            this.f4192e = u10;
            return;
        }
        throw e0.b();
    }

    public void D(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void E(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void F(int i3) {
        if (((k) this.f4190b).b() == i3) {
            return;
        }
        throw e0.e();
    }

    public void G(int i3) {
        if ((this.f4191c & 7) == i3) {
            return;
        }
        throw e0.b();
    }

    public void H(int i3, byte[] bArr) {
        this.f4190b = bArr;
        this.f4191c = 0;
        this.d = 0;
        this.f4192e = i3;
    }

    public void I(y yVar) {
        H(yVar.f11925c, yVar.f11923a);
        J(yVar.f11924b * 8);
    }

    public void J(int i3) {
        int i10 = i3 / 8;
        this.f4191c = i10;
        this.d = i3 - (i10 * 8);
        a();
    }

    public void K() {
        int i3 = this.d + 1;
        this.d = i3;
        if (i3 == 8) {
            this.d = 0;
            this.f4191c++;
        }
        a();
    }

    public void L(int i3) {
        int i10;
        switch (this.f4189a) {
            case 1:
                int i11 = i3 / 8;
                int i12 = this.d + i11;
                this.d = i12;
                int i13 = (i3 - (i11 * 8)) + this.f4192e;
                this.f4192e = i13;
                boolean z10 = true;
                if (i13 > 7) {
                    this.d = i12 + 1;
                    this.f4192e = i13 - 8;
                }
                int i14 = this.d;
                if (i14 < 0 || (i14 >= (i10 = this.f4191c) && (i14 != i10 || this.f4192e != 0))) {
                    z10 = false;
                }
                zb.p(z10);
                return;
            default:
                int i15 = i3 / 8;
                int i16 = this.f4191c + i15;
                this.f4191c = i16;
                int i17 = (i3 - (i15 * 8)) + this.d;
                this.d = i17;
                if (i17 > 7) {
                    this.f4191c = i16 + 1;
                    this.d = i17 - 8;
                }
                a();
                return;
        }
    }

    public void M(int i3) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        this.f4191c += i3;
        a();
    }

    public boolean N() {
        int i3;
        k kVar = (k) this.f4190b;
        if (!kVar.c() && (i3 = this.f4191c) != this.d) {
            return kVar.x(i3);
        }
        return false;
    }

    public void a() {
        boolean z10;
        int i3;
        int i10 = this.f4191c;
        if (i10 >= 0 && (i10 < (i3 = this.f4192e) || (i10 == i3 && this.d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
    }

    public int b() {
        return ((this.f4192e - this.f4191c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.f4191c++;
        a();
    }

    public int d() {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        return this.f4191c;
    }

    public int e() {
        int i3 = this.f4192e;
        if (i3 != 0) {
            this.f4191c = i3;
            this.f4192e = 0;
        } else {
            this.f4191c = ((k) this.f4190b).u();
        }
        int i10 = this.f4191c;
        if (i10 != 0 && i10 != this.d) {
            return i10 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public int f() {
        return (this.f4191c * 8) + this.d;
    }

    public void g(Object obj, b1 b1Var, p pVar) {
        int i3 = this.d;
        this.d = ((this.f4191c >>> 3) << 3) | 4;
        try {
            b1Var.i(obj, this, pVar);
            if (this.f4191c == this.d) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.d = i3;
        }
    }

    public void h(Object obj, b1 b1Var, p pVar) {
        k kVar = (k) this.f4190b;
        int v = kVar.v();
        if (kVar.f1632a < 100) {
            int e10 = kVar.e(v);
            kVar.f1632a++;
            b1Var.i(obj, this, pVar);
            kVar.a(0);
            kVar.f1632a--;
            kVar.d(e10);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public boolean i() {
        boolean z10;
        boolean z11;
        switch (this.f4189a) {
            case 1:
                if ((((((byte[]) this.f4190b)[this.d] & 255) >> this.f4192e) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                L(1);
                return z10;
            default:
                if ((((byte[]) this.f4190b)[this.f4191c] & (128 >> this.d)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                K();
                return z11;
        }
    }

    public int j(int i3) {
        switch (this.f4189a) {
            case 1:
                int i10 = this.d;
                int min = Math.min(i3, 8 - this.f4192e);
                byte[] bArr = (byte[]) this.f4190b;
                int i11 = i10 + 1;
                int i12 = ((bArr[i10] & 255) >> this.f4192e) & (255 >> (8 - min));
                while (min < i3) {
                    i12 |= (bArr[i11] & 255) << min;
                    min += 8;
                    i11++;
                }
                int i13 = i12 & ((-1) >>> (32 - i3));
                L(i3);
                return i13;
            default:
                if (i3 == 0) {
                    return 0;
                }
                this.d += i3;
                int i14 = 0;
                while (true) {
                    int i15 = this.d;
                    if (i15 > 8) {
                        int i16 = i15 - 8;
                        this.d = i16;
                        int i17 = this.f4191c;
                        this.f4191c = i17 + 1;
                        i14 |= (((byte[]) this.f4190b)[i17] & 255) << i16;
                    } else {
                        int i18 = this.f4191c;
                        int i19 = ((-1) >>> (32 - i3)) & (i14 | ((((byte[]) this.f4190b)[i18] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.d = 0;
                            this.f4191c = i18 + 1;
                        }
                        a();
                        return i19;
                    }
                }
        }
    }

    public void k(int i3, byte[] bArr) {
        int i10 = i3 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = (byte[]) this.f4190b;
            int i12 = this.f4191c;
            int i13 = i12 + 1;
            this.f4191c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i3 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.d;
        if (i16 + i15 > 8) {
            int i17 = this.f4191c;
            this.f4191c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((((byte[]) this.f4190b)[i17] & 255) << i16));
            this.d = i16 - 8;
        }
        int i18 = this.d + i15;
        this.d = i18;
        int i19 = this.f4191c;
        bArr[i10] = (byte) (((byte) (((255 & ((byte[]) this.f4190b)[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.d = 0;
            this.f4191c = i19 + 1;
        }
        a();
    }

    public long l(int i3) {
        if (i3 <= 32) {
            int j10 = j(i3);
            String str = n0.f11873a;
            return 4294967295L & j10;
        }
        int j11 = j(i3 - 32);
        int j12 = j(32);
        String str2 = n0.f11873a;
        return (4294967295L & j12) | ((j11 & 4294967295L) << 32);
    }

    public void m(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public androidx.datastore.preferences.protobuf.h n() {
        G(2);
        return ((k) this.f4190b).g();
    }

    public void o(int i3, byte[] bArr) {
        boolean z10;
        if (this.d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        System.arraycopy((byte[]) this.f4190b, this.f4191c, bArr, 0, i3);
        this.f4191c += i3;
        a();
    }

    public void p(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        if ((this.f4191c & 7) == 2) {
            do {
                b0Var.add(n());
                if (kVar.c()) {
                    return;
                }
                u10 = kVar.u();
            } while (u10 == this.f4191c);
            this.f4192e = u10;
            return;
        }
        throw e0.b();
    }

    public void q(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 1) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void r(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public Object s(v1 v1Var, Class cls, p pVar) {
        k kVar = (k) this.f4190b;
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
                b1 a10 = y0.f1711c.a(cls);
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
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    b0Var.add(Integer.valueOf(kVar.j()));
                    if (!kVar.c()) {
                        u10 = kVar.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f4191c);
                this.f4192e = u10;
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
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 1) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void v(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    b0Var.add(Float.valueOf(kVar.l()));
                    if (!kVar.c()) {
                        u10 = kVar.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f4191c);
                this.f4192e = u10;
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
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void x(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 0) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public void y(b0 b0Var) {
        int u10;
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    b0Var.add(Integer.valueOf(kVar.o()));
                    if (!kVar.c()) {
                        u10 = kVar.u();
                    } else {
                        return;
                    }
                } while (u10 == this.f4191c);
                this.f4192e = u10;
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
        k kVar = (k) this.f4190b;
        int i3 = this.f4191c & 7;
        if (i3 != 1) {
            if (i3 == 2) {
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
        } while (u10 == this.f4191c);
        this.f4192e = u10;
    }

    public f(k kVar) {
        this.f4189a = 3;
        this.f4192e = 0;
        Charset charset = c0.f1579a;
        this.f4190b = kVar;
        kVar.f1633b = this;
    }

    public f(byte[] bArr) {
        this.f4189a = 1;
        this.f4190b = bArr;
        this.f4191c = bArr.length;
    }

    public f(byte[] bArr, int i3) {
        this.f4189a = 2;
        this.f4190b = bArr;
        this.f4192e = i3;
    }

    public f(int i3, int i10) {
        this.f4189a = 0;
        this.f4191c = i3;
        this.d = i10;
        this.f4190b = new byte[(i10 * 2) - 1];
        this.f4192e = 0;
    }
}
