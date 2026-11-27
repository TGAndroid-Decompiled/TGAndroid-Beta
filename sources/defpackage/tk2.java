package defpackage;

import java.io.IOException;
import java.util.Arrays;
public final class tk2 extends vk2 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public tk2(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    public final long A() {
        int i = this.f;
        if (this.d - i >= 8) {
            this.f = i + 8;
            byte[] bArr = this.c;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
        }
        throw bs5.e();
    }

    public final int B() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk2.B():int");
    }

    public final long C() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk2.C():long");
    }

    public final long D() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 != this.d) {
                this.f = i2 + 1;
                byte b = this.c[i2];
                j |= (b & Byte.MAX_VALUE) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw bs5.e();
            }
        }
        throw bs5.c();
    }

    public final void E() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.e = i4;
            this.d = i - i4;
            return;
        }
        this.e = 0;
    }

    public final void F(int i) {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
            throw bs5.e();
        }
        throw bs5.d();
    }

    @Override
    public final void a(int i) {
        if (this.h == i) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override
    public final int b() {
        return this.f - this.g;
    }

    @Override
    public final boolean c() {
        if (this.f == this.d) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(int i) {
        this.i = i;
        E();
    }

    @Override
    public final int e(int i) {
        if (i >= 0) {
            int b = b() + i;
            if (b >= 0) {
                int i2 = this.i;
                if (b <= i2) {
                    this.i = b;
                    E();
                    return i2;
                }
                throw bs5.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw bs5.d();
    }

    @Override
    public final boolean f() {
        if (C() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final n51 g() {
        byte[] bArr;
        int B = B();
        byte[] bArr2 = this.c;
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                n51 j = n51.j(i2, B, bArr2);
                this.f += B;
                return j;
            }
        }
        if (B == 0) {
            return n51.c;
        }
        if (B > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (B <= i3 - i4) {
                int i5 = B + i4;
                this.f = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
            } else {
                throw bs5.e();
            }
        } else if (B == 0) {
            bArr = pr5.b;
        } else {
            throw bs5.d();
        }
        n51 n51Var = n51.c;
        return new n51(bArr);
    }

    @Override
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override
    public final int i() {
        return B();
    }

    @Override
    public final int j() {
        return z();
    }

    @Override
    public final long k() {
        return A();
    }

    @Override
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override
    public final int m() {
        return B();
    }

    @Override
    public final long n() {
        return C();
    }

    @Override
    public final int o() {
        return z();
    }

    @Override
    public final long p() {
        return A();
    }

    @Override
    public final int q() {
        int B = B();
        return (B >>> 1) ^ (-(B & 1));
    }

    @Override
    public final long r() {
        long C = C();
        return (C >>> 1) ^ (-(C & 1));
    }

    @Override
    public final String s() {
        int B = B();
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                String str = new String(this.c, i2, B, pr5.a);
                this.f += B;
                return str;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B < 0) {
            throw bs5.d();
        }
        throw bs5.e();
    }

    @Override
    public final String t() {
        int B = B();
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                String a = fcc.a.a(i2, B, this.c);
                this.f += B;
                return a;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B <= 0) {
            throw bs5.d();
        }
        throw bs5.e();
    }

    @Override
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int B = B();
        this.h = B;
        if ((B >>> 3) != 0) {
            return B;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override
    public final int v() {
        return B();
    }

    @Override
    public final long w() {
        return C();
    }

    @Override
    public final boolean x(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            F(4);
                            return true;
                        }
                        throw bs5.b();
                    }
                    y();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                F(B());
                return true;
            }
            F(8);
            return true;
        }
        int i4 = this.d - this.f;
        byte[] bArr = this.c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw bs5.c();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 != this.d) {
                this.f = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            } else {
                throw bs5.e();
            }
        }
        throw bs5.c();
        return true;
    }

    public final int z() {
        int i = this.f;
        if (this.d - i >= 4) {
            this.f = i + 4;
            byte[] bArr = this.c;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }
        throw bs5.e();
    }
}
