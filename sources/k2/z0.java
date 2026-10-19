package k2;

import java.nio.ByteBuffer;
import v7.u6;
import v7.v6;
public final class z0 extends c2.o {
    public int f14857n;
    public boolean f14858o;
    public int f14859p;
    public long f14860q;
    public byte[] f14862s;
    public byte[] v;
    public int f14861r = 0;
    public int f14863t = 0;
    public int f14864u = 0;
    public final long f14855l = 100000;
    public final float f14852i = 0.2f;
    public final long f14856m = 2000000;
    public final int f14854k = 10;
    public final short f14853j = 1024;

    public z0() {
        byte[] bArr = e2.m0.f8253b;
        this.f14862s = bArr;
        this.v = bArr;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        boolean z10;
        int limit;
        boolean z11;
        boolean z12;
        int position;
        while (byteBuffer.hasRemaining() && !this.f4522g.hasRemaining()) {
            int i10 = this.f14859p;
            short s10 = this.f14853j;
            boolean z13 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (this.f14863t < this.f14862s.length) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.p(z10);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s10) {
                                int i11 = this.f14857n;
                                limit = (position2 / i11) * i11;
                                break;
                            }
                            position2 += 2;
                        } else {
                            limit = byteBuffer.limit();
                            break;
                        }
                    }
                    int position3 = limit - byteBuffer.position();
                    int i12 = this.f14863t;
                    int i13 = this.f14864u;
                    int i14 = i12 + i13;
                    byte[] bArr = this.f14862s;
                    if (i14 < bArr.length) {
                        i12 = bArr.length;
                    } else {
                        i14 = i13 - (bArr.length - i12);
                    }
                    int i15 = i12 - i14;
                    if (limit < limit2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int min = Math.min(position3, i15);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f14862s, i14, min);
                    int i16 = this.f14864u + min;
                    this.f14864u = i16;
                    if (i16 <= this.f14862s.length) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u6.p(z12);
                    if (!z11 || position3 >= i15) {
                        z13 = false;
                    }
                    n(z13);
                    if (z13) {
                        this.f14859p = 0;
                        this.f14861r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f14862s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s10) {
                            int i17 = this.f14857n;
                            position = ((limit4 / i17) * i17) + i17;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f14859p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final c2.k h(c2.k kVar) {
        if (kVar.f4515c == 2) {
            if (kVar.f4513a == -1) {
                return c2.k.e;
            }
            return kVar;
        }
        throw new c2.m(kVar);
    }

    @Override
    public final void i() {
        if (isActive()) {
            c2.k kVar = this.f4519b;
            int i10 = kVar.f4514b * 2;
            this.f14857n = i10;
            int i11 = ((((int) ((this.f14855l * kVar.f4513a) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f14862s.length != i11) {
                this.f14862s = new byte[i11];
                this.v = new byte[i11];
            }
        }
        this.f14859p = 0;
        this.f14860q = 0L;
        this.f14861r = 0;
        this.f14863t = 0;
        this.f14864u = 0;
    }

    @Override
    public final boolean isActive() {
        if (super.isActive() && this.f14858o) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        if (this.f14864u > 0) {
            n(true);
            this.f14861r = 0;
        }
    }

    @Override
    public final void k() {
        this.f14858o = false;
        byte[] bArr = e2.m0.f8253b;
        this.f14862s = bArr;
        this.v = bArr;
    }

    public final int m(int i10) {
        boolean z10;
        int length = ((((int) ((this.f14856m * this.f4519b.f4513a) / 1000000)) - this.f14861r) * this.f14857n) - (this.f14862s.length / 2);
        if (length >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        int i11 = this.f14857n;
        return (((int) Math.min((i10 * this.f14852i) + 0.5f, length)) / i11) * i11;
    }

    public final void n(boolean z10) {
        int length;
        int m10;
        boolean z11;
        int i10;
        boolean z12;
        int i11 = this.f14864u;
        byte[] bArr = this.f14862s;
        if (i11 != bArr.length && !z10) {
            return;
        }
        boolean z13 = false;
        if (this.f14861r == 0) {
            if (z10) {
                o(i11, 3);
                length = i11;
            } else {
                if (i11 >= bArr.length / 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.p(z12);
                length = this.f14862s.length / 2;
                o(length, 0);
            }
            m10 = length;
        } else if (z10) {
            int length2 = i11 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int m11 = m(length2) + (this.f14862s.length / 2);
            o(m11, 2);
            m10 = m11;
            length = length3;
        } else {
            length = i11 - (bArr.length / 2);
            m10 = m(length);
            o(m10, 1);
        }
        if (length % this.f14857n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i11 >= m10) {
                z13 = true;
            }
            u6.p(z13);
            this.f14864u -= length;
            int i12 = this.f14863t + length;
            this.f14863t = i12;
            this.f14863t = i12 % this.f14862s.length;
            this.f14861r = (m10 / this.f14857n) + this.f14861r;
            this.f14860q += (length - m10) / i10;
            return;
        }
        throw new IllegalStateException(v6.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
    }

    public final void o(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i10 == 0) {
            return;
        }
        boolean z13 = true;
        if (this.f14864u >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        if (i11 == 2) {
            int i12 = this.f14863t;
            int i13 = this.f14864u;
            int i14 = i12 + i13;
            byte[] bArr = this.f14862s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.v, 0, i15);
                    System.arraycopy(this.f14862s, 0, this.v, i15, length);
                }
            }
        } else {
            int i16 = this.f14863t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f14862s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.v, 0, length2);
                System.arraycopy(this.f14862s, 0, this.v, length2, i10 - length2);
            }
        }
        if (i10 % this.f14857n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.b(i10, "sizeToOutput is not aligned to frame size: %s", z11);
        if (this.f14863t < this.f14862s.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        u6.p(z12);
        byte[] bArr3 = this.v;
        if (i10 % this.f14857n != 0) {
            z13 = false;
        }
        u6.b(i10, "byteOutput size is not aligned to frame size %s", z13);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f14854k;
                if (i11 == 0) {
                    i21 = ((((i18 * 1000) / (i10 - 1)) * (i21 - 100)) / 1000) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * 1000) * (100 - i21)) / (i10 - 1)) / 1000;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = Byte.MAX_VALUE;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = Byte.MIN_VALUE;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        l(i10).put(bArr3, 0, i10).flip();
    }
}
