package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
public final class ml2 extends nl2 {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public ml2(FileInputStream fileInputStream) {
        Charset charset = mr5.a;
        this.c = fileInputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final byte[] A(int i) {
        if (i == 0) {
            return mr5.b;
        }
        if (i >= 0) {
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = this.j;
                if (i4 <= i5) {
                    int i6 = this.e - i3;
                    int i7 = i - i6;
                    FileInputStream fileInputStream = this.c;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > fileInputStream.available()) {
                                return null;
                            }
                        } catch (yr5 e) {
                            e.a = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.d, this.g, bArr, 0, i6);
                    this.i += this.e;
                    this.g = 0;
                    this.e = 0;
                    while (i6 < i) {
                        try {
                            int read = fileInputStream.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.i += read;
                                i6 += read;
                            } else {
                                throw yr5.e();
                            }
                        } catch (yr5 e2) {
                            e2.a = true;
                            throw e2;
                        }
                    }
                    return bArr;
                }
                J((i5 - i2) - i3);
                throw yr5.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw yr5.d();
    }

    public final ArrayList B(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.c.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.i += read;
                    i2 += read;
                } else {
                    throw yr5.e();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i = this.g;
        if (this.e - i < 4) {
            I(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final long D() {
        int i = this.g;
        if (this.e - i < 8) {
            I(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int E() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml2.E():int");
    }

    public final long F() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml2.F():long");
    }

    public final long G() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                I(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= (b & Byte.MAX_VALUE) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw yr5.c();
    }

    public final void H() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f = i4;
            this.e = i - i4;
            return;
        }
        this.f = 0;
    }

    public final void I(int i) {
        if (!K(i)) {
            if (i > (Integer.MAX_VALUE - this.i) - this.g) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw yr5.e();
        }
    }

    public final void J(int i) {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i >= 0) {
            int i5 = this.i;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.j;
            if (i7 <= i8) {
                this.i = i6;
                this.e = 0;
                this.g = 0;
                while (i4 < i) {
                    long j = i - i4;
                    try {
                        try {
                            long skip = fileInputStream.skip(j);
                            int i9 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i9 >= 0 && skip <= j) {
                                if (i9 == 0) {
                                    break;
                                }
                                i4 += (int) skip;
                            } else {
                                throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (yr5 e) {
                            e.a = true;
                            throw e;
                        }
                    } finally {
                        this.i += i4;
                        H();
                    }
                }
                if (i4 < i) {
                    int i10 = this.e;
                    int i11 = i10 - this.g;
                    this.g = i10;
                    I(1);
                    while (true) {
                        int i12 = i - i11;
                        int i13 = this.e;
                        if (i12 > i13) {
                            i11 += i13;
                            this.g = i13;
                            I(1);
                        } else {
                            this.g = i12;
                            return;
                        }
                    }
                }
            } else {
                J((i8 - i5) - i3);
                throw yr5.e();
            }
        } else {
            throw yr5.d();
        }
    }

    public final boolean K(int i) {
        FileInputStream fileInputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 > i4) {
            int i5 = this.i;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
                byte[] bArr = this.d;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = this.i + i2;
                    this.i = i5;
                    i4 = this.e - i2;
                    this.e = i4;
                    this.g = 0;
                }
                try {
                    int read = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.e += read;
                            H();
                            if (this.e >= i) {
                                return true;
                            }
                            return K(i);
                        }
                    } else {
                        throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (yr5 e) {
                    e.a = true;
                    throw e;
                }
            }
            return false;
        }
        dq9.m(td4.o(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        return false;
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
        return this.i + this.g;
    }

    @Override
    public final boolean c() {
        if (this.g == this.e && !K(1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(int i) {
        this.j = i;
        H();
    }

    @Override
    public final int e(int i) {
        if (i >= 0) {
            int i2 = this.i + this.g + i;
            if (i2 >= 0) {
                int i3 = this.j;
                if (i2 <= i3) {
                    this.j = i2;
                    H();
                    return i3;
                }
                throw yr5.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw yr5.d();
    }

    @Override
    public final boolean f() {
        if (F() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final m61 g() {
        int E = E();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (E <= i3 && E > 0) {
            m61 j = m61.j(i2, E, bArr);
            this.g += E;
            return j;
        } else if (E == 0) {
            return m61.c;
        } else {
            if (E >= 0) {
                byte[] A = A(E);
                if (A != null) {
                    return m61.j(0, A.length, A);
                }
                int i4 = this.g;
                int i5 = this.e;
                int i6 = i5 - i4;
                this.i += i5;
                this.g = 0;
                this.e = 0;
                ArrayList B = B(E - i6);
                byte[] bArr2 = new byte[E];
                System.arraycopy(bArr, i4, bArr2, 0, i6);
                int size = B.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = B.get(i7);
                    i7++;
                    byte[] bArr3 = (byte[]) obj;
                    System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                    i6 += bArr3.length;
                }
                m61 m61Var = m61.c;
                return new m61(bArr2);
            }
            throw yr5.d();
        }
    }

    @Override
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override
    public final int i() {
        return E();
    }

    @Override
    public final int j() {
        return C();
    }

    @Override
    public final long k() {
        return D();
    }

    @Override
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override
    public final int m() {
        return E();
    }

    @Override
    public final long n() {
        return F();
    }

    @Override
    public final int o() {
        return C();
    }

    @Override
    public final long p() {
        return D();
    }

    @Override
    public final int q() {
        int E = E();
        return (E >>> 1) ^ (-(E & 1));
    }

    @Override
    public final long r() {
        long F = F();
        return (F >>> 1) ^ (-(F & 1));
    }

    @Override
    public final String s() {
        int E = E();
        byte[] bArr = this.d;
        if (E > 0) {
            int i = this.e;
            int i2 = this.g;
            if (E <= i - i2) {
                String str = new String(bArr, i2, E, mr5.a);
                this.g += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E >= 0) {
            if (E <= this.e) {
                I(E);
                String str2 = new String(bArr, this.g, E, mr5.a);
                this.g += E;
                return str2;
            }
            return new String(z(E), mr5.a);
        }
        throw yr5.d();
    }

    @Override
    public final String t() {
        int E = E();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArr = this.d;
        if (E <= i3 && E > 0) {
            this.g = i + E;
        } else if (E == 0) {
            return "";
        } else {
            if (E >= 0) {
                i = 0;
                if (E <= i2) {
                    I(E);
                    this.g = E;
                } else {
                    bArr = z(E);
                }
            } else {
                throw yr5.d();
            }
        }
        return gac.a.a(i, E, bArr);
    }

    @Override
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int E = E();
        this.h = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override
    public final int v() {
        return E();
    }

    @Override
    public final long w() {
        return F();
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
                            J(4);
                            return true;
                        }
                        throw yr5.b();
                    }
                    y();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                J(E());
                return true;
            }
            J(8);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw yr5.c();
        }
        while (i3 < 10) {
            if (this.g == this.e) {
                I(1);
            }
            int i6 = this.g;
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw yr5.c();
        return true;
    }

    public final byte[] z(int i) {
        byte[] A = A(i);
        if (A != null) {
            return A;
        }
        int i2 = this.g;
        int i3 = this.e;
        int i4 = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList B = B(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, i4);
        int size = B.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = B.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }
}
