package n2;

import a8.ia;
import a8.ja;
import java.nio.ByteBuffer;
public final class v0 extends f2.o {
    public int f20325n;
    public boolean f20326o;
    public int f20327p;
    public long f20328q;
    public byte[] f20330s;
    public byte[] v;
    public int f20329r = 0;
    public int f20331t = 0;
    public int f20332u = 0;
    public final long f20323l = 100000;
    public final float f20320i = 0.2f;
    public final long f20324m = 2000000;
    public final int f20322k = 10;
    public final short f20321j = 1024;

    public v0() {
        byte[] bArr = h2.m0.f14113b;
        this.f20330s = bArr;
        this.v = bArr;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        boolean z9;
        int limit;
        boolean z10;
        boolean z11;
        int position;
        while (byteBuffer.hasRemaining() && !this.f10927g.hasRemaining()) {
            int i7 = this.f20327p;
            short s5 = this.f20321j;
            boolean z12 = true;
            if (i7 != 0) {
                if (i7 == 1) {
                    if (this.f20331t < this.f20330s.length) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.p(z9);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s5) {
                                int i10 = this.f20325n;
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
                    int i11 = this.f20331t;
                    int i12 = this.f20332u;
                    int i13 = i11 + i12;
                    byte[] bArr = this.f20330s;
                    if (i13 < bArr.length) {
                        i11 = bArr.length;
                    } else {
                        i13 = i12 - (bArr.length - i11);
                    }
                    int i14 = i11 - i13;
                    if (limit < limit2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int min = Math.min(position3, i14);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f20330s, i13, min);
                    int i15 = this.f20332u + min;
                    this.f20332u = i15;
                    if (i15 <= this.f20330s.length) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ia.p(z11);
                    if (!z10 || position3 >= i14) {
                        z12 = false;
                    }
                    n(z12);
                    if (z12) {
                        this.f20327p = 0;
                        this.f20329r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f20330s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s5) {
                            int i16 = this.f20325n;
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
                    this.f20327p = 1;
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
        if (kVar.f10919c == 2) {
            if (kVar.f10917a == -1) {
                return f2.k.f10916e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (isActive()) {
            f2.k kVar = this.f10923b;
            int i7 = kVar.f10918b * 2;
            this.f20325n = i7;
            int i10 = ((((int) ((this.f20323l * kVar.f10917a) / 1000000)) / 2) / i7) * i7 * 2;
            if (this.f20330s.length != i10) {
                this.f20330s = new byte[i10];
                this.v = new byte[i10];
            }
        }
        this.f20327p = 0;
        this.f20328q = 0L;
        this.f20329r = 0;
        this.f20331t = 0;
        this.f20332u = 0;
    }

    @Override
    public final boolean isActive() {
        if (super.isActive() && this.f20326o) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        if (this.f20332u > 0) {
            n(true);
            this.f20329r = 0;
        }
    }

    @Override
    public final void k() {
        this.f20326o = false;
        byte[] bArr = h2.m0.f14113b;
        this.f20330s = bArr;
        this.v = bArr;
    }

    public final int m(int i7) {
        boolean z9;
        int length = ((((int) ((this.f20324m * this.f10923b.f10917a) / 1000000)) - this.f20329r) * this.f20325n) - (this.f20330s.length / 2);
        if (length >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        int i10 = this.f20325n;
        return (((int) Math.min((i7 * this.f20320i) + 0.5f, length)) / i10) * i10;
    }

    public final void n(boolean z9) {
        int length;
        int m10;
        boolean z10;
        int i7;
        boolean z11;
        int i10 = this.f20332u;
        byte[] bArr = this.f20330s;
        if (i10 != bArr.length && !z9) {
            return;
        }
        boolean z12 = false;
        if (this.f20329r == 0) {
            if (z9) {
                o(i10, 3);
                length = i10;
            } else {
                if (i10 >= bArr.length / 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ia.p(z11);
                length = this.f20330s.length / 2;
                o(length, 0);
            }
            m10 = length;
        } else if (z9) {
            int length2 = i10 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int m11 = m(length2) + (this.f20330s.length / 2);
            o(m11, 2);
            m10 = m11;
            length = length3;
        } else {
            length = i10 - (bArr.length / 2);
            m10 = m(length);
            o(m10, 1);
        }
        if (length % this.f20325n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= m10) {
                z12 = true;
            }
            ia.p(z12);
            this.f20332u -= length;
            int i11 = this.f20331t + length;
            this.f20331t = i11;
            this.f20331t = i11 % this.f20330s.length;
            this.f20329r = (m10 / this.f20325n) + this.f20329r;
            this.f20328q += (length - m10) / i7;
            return;
        }
        throw new IllegalStateException(ja.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
    }

    public final void o(int i7, int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (i7 == 0) {
            return;
        }
        boolean z12 = true;
        if (this.f20332u >= i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (i10 == 2) {
            int i11 = this.f20331t;
            int i12 = this.f20332u;
            int i13 = i11 + i12;
            byte[] bArr = this.f20330s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i7, this.v, 0, i7);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.v, 0, i7);
                } else {
                    int i14 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.v, 0, i14);
                    System.arraycopy(this.f20330s, 0, this.v, i14, length);
                }
            }
        } else {
            int i15 = this.f20331t;
            int i16 = i15 + i7;
            byte[] bArr2 = this.f20330s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.v, 0, i7);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.v, 0, length2);
                System.arraycopy(this.f20330s, 0, this.v, length2, i7 - length2);
            }
        }
        if (i7 % this.f20325n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.c(i7, "sizeToOutput is not aligned to frame size: %s", z10);
        if (this.f20331t < this.f20330s.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ia.p(z11);
        byte[] bArr3 = this.v;
        if (i7 % this.f20325n != 0) {
            z12 = false;
        }
        ia.c(i7, "byteOutput size is not aligned to frame size %s", z12);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i7; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.f20322k;
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
