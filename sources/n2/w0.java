package n2;

import a8.bb;
import a8.ma;
import java.nio.ByteBuffer;
public final class w0 extends f2.o {
    public int f21265n;
    public boolean f21266o;
    public int f21267p;
    public long f21268q;
    public byte[] f21270s;
    public byte[] v;
    public int f21269r = 0;
    public int f21271t = 0;
    public int f21272u = 0;
    public final long f21263l = 100000;
    public final float f21260i = 0.2f;
    public final long f21264m = 2000000;
    public final int f21262k = 10;
    public final short f21261j = 1024;

    public w0() {
        byte[] bArr = h2.l0.f13779b;
        this.f21270s = bArr;
        this.v = bArr;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        boolean z10;
        int limit;
        boolean z11;
        boolean z12;
        int position;
        while (byteBuffer.hasRemaining() && !this.f11054g.hasRemaining()) {
            int i7 = this.f21267p;
            short s5 = this.f21261j;
            boolean z13 = true;
            if (i7 != 0) {
                if (i7 == 1) {
                    if (this.f21271t < this.f21270s.length) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ma.p(z10);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s5) {
                                int i10 = this.f21265n;
                                limit = (position2 / i10) * i10;
                                break;
                            }
                            position2 += 2;
                        } else {
                            limit = byteBuffer.limit();
                            break;
                        }
                    }
                    int position3 = limit - byteBuffer.position();
                    int i11 = this.f21271t;
                    int i12 = this.f21272u;
                    int i13 = i11 + i12;
                    byte[] bArr = this.f21270s;
                    if (i13 < bArr.length) {
                        i11 = bArr.length;
                    } else {
                        i13 = i12 - (bArr.length - i11);
                    }
                    int i14 = i11 - i13;
                    if (limit < limit2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int min = Math.min(position3, i14);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f21270s, i13, min);
                    int i15 = this.f21272u + min;
                    this.f21272u = i15;
                    if (i15 <= this.f21270s.length) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ma.p(z12);
                    if (!z11 || position3 >= i14) {
                        z13 = false;
                    }
                    n(z13);
                    if (z13) {
                        this.f21267p = 0;
                        this.f21269r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f21270s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s5) {
                            int i16 = this.f21265n;
                            position = ((limit4 / i16) * i16) + i16;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f21267p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (kVar.f11046c == 2) {
            if (kVar.f11044a == -1) {
                return f2.k.f11043e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (isActive()) {
            f2.k kVar = this.f11050b;
            int i7 = kVar.f11045b * 2;
            this.f21265n = i7;
            int i10 = ((((int) ((this.f21263l * kVar.f11044a) / 1000000)) / 2) / i7) * i7 * 2;
            if (this.f21270s.length != i10) {
                this.f21270s = new byte[i10];
                this.v = new byte[i10];
            }
        }
        this.f21267p = 0;
        this.f21268q = 0L;
        this.f21269r = 0;
        this.f21271t = 0;
        this.f21272u = 0;
    }

    @Override
    public final boolean isActive() {
        if (super.isActive() && this.f21266o) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        if (this.f21272u > 0) {
            n(true);
            this.f21269r = 0;
        }
    }

    @Override
    public final void k() {
        this.f21266o = false;
        byte[] bArr = h2.l0.f13779b;
        this.f21270s = bArr;
        this.v = bArr;
    }

    public final int m(int i7) {
        boolean z10;
        int length = ((((int) ((this.f21264m * this.f11050b.f11044a) / 1000000)) - this.f21269r) * this.f21265n) - (this.f21270s.length / 2);
        if (length >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        int i10 = this.f21265n;
        return (((int) Math.min((i7 * this.f21260i) + 0.5f, length)) / i10) * i10;
    }

    public final void n(boolean z10) {
        int length;
        int m10;
        boolean z11;
        int i7;
        boolean z12;
        int i10 = this.f21272u;
        byte[] bArr = this.f21270s;
        if (i10 != bArr.length && !z10) {
            return;
        }
        boolean z13 = false;
        if (this.f21269r == 0) {
            if (z10) {
                o(i10, 3);
                length = i10;
            } else {
                if (i10 >= bArr.length / 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ma.p(z12);
                length = this.f21270s.length / 2;
                o(length, 0);
            }
            m10 = length;
        } else if (z10) {
            int length2 = i10 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int m11 = m(length2) + (this.f21270s.length / 2);
            o(m11, 2);
            m10 = m11;
            length = length3;
        } else {
            length = i10 - (bArr.length / 2);
            m10 = m(length);
            o(m10, 1);
        }
        if (length % this.f21265n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 >= m10) {
                z13 = true;
            }
            ma.p(z13);
            this.f21272u -= length;
            int i11 = this.f21271t + length;
            this.f21271t = i11;
            this.f21271t = i11 % this.f21270s.length;
            this.f21269r = (m10 / this.f21265n) + this.f21269r;
            this.f21268q += (length - m10) / i7;
            return;
        }
        throw new IllegalStateException(bb.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
    }

    public final void o(int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i7 == 0) {
            return;
        }
        boolean z13 = true;
        if (this.f21272u >= i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        if (i10 == 2) {
            int i11 = this.f21271t;
            int i12 = this.f21272u;
            int i13 = i11 + i12;
            byte[] bArr = this.f21270s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i7, this.v, 0, i7);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.v, 0, i7);
                } else {
                    int i14 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.v, 0, i14);
                    System.arraycopy(this.f21270s, 0, this.v, i14, length);
                }
            }
        } else {
            int i15 = this.f21271t;
            int i16 = i15 + i7;
            byte[] bArr2 = this.f21270s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.v, 0, i7);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.v, 0, length2);
                System.arraycopy(this.f21270s, 0, this.v, length2, i7 - length2);
            }
        }
        if (i7 % this.f21265n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.c(i7, "sizeToOutput is not aligned to frame size: %s", z11);
        if (this.f21271t < this.f21270s.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        ma.p(z12);
        byte[] bArr3 = this.v;
        if (i7 % this.f21265n != 0) {
            z13 = false;
        }
        ma.c(i7, "byteOutput size is not aligned to frame size %s", z13);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i7; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.f21262k;
                if (i10 == 0) {
                    i20 = ((((i17 * 1000) / (i7 - 1)) * (i20 - 100)) / 1000) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * 1000) * (100 - i20)) / (i7 - 1)) / 1000;
                }
                int i21 = (i19 * i20) / 100;
                if (i21 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = Byte.MAX_VALUE;
                } else if (i21 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = Byte.MIN_VALUE;
                } else {
                    bArr3[i17] = (byte) (i21 & 255);
                    bArr3[i18] = (byte) (i21 >> 8);
                }
            }
        }
        l(i7).put(bArr3, 0, i7).flip();
    }
}
