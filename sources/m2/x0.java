package m2;

import b8.ac;
import b8.zb;
import java.nio.ByteBuffer;
public final class x0 extends e2.n {
    public int f19037n;
    public boolean f19038o;
    public int f19039p;
    public long f19040q;
    public byte[] f19042s;
    public byte[] v;
    public int f19041r = 0;
    public int f19043t = 0;
    public int f19044u = 0;
    public final long f19035l = 100000;
    public final float f19032i = 0.2f;
    public final long f19036m = 2000000;
    public final int f19034k = 10;
    public final short f19033j = 1024;

    public x0() {
        byte[] bArr = g2.n0.f11874b;
        this.f19042s = bArr;
        this.v = bArr;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        boolean z10;
        int limit;
        boolean z11;
        boolean z12;
        int position;
        while (byteBuffer.hasRemaining() && !this.f9363g.hasRemaining()) {
            int i3 = this.f19039p;
            short s6 = this.f19033j;
            boolean z13 = true;
            if (i3 != 0) {
                if (i3 == 1) {
                    if (this.f19043t < this.f19042s.length) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zb.p(z10);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s6) {
                                int i10 = this.f19037n;
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
                    int i11 = this.f19043t;
                    int i12 = this.f19044u;
                    int i13 = i11 + i12;
                    byte[] bArr = this.f19042s;
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
                    byteBuffer.get(this.f19042s, i13, min);
                    int i15 = this.f19044u + min;
                    this.f19044u = i15;
                    if (i15 <= this.f19042s.length) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zb.p(z12);
                    if (!z11 || position3 >= i14) {
                        z13 = false;
                    }
                    n(z13);
                    if (z13) {
                        this.f19039p = 0;
                        this.f19041r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f19042s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s6) {
                            int i16 = this.f19037n;
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
                    this.f19039p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final e2.j h(e2.j jVar) {
        if (jVar.f9355c == 2) {
            if (jVar.f9353a == -1) {
                return e2.j.f9352e;
            }
            return jVar;
        }
        throw new e2.l(jVar);
    }

    @Override
    public final void i() {
        if (isActive()) {
            e2.j jVar = this.f9359b;
            int i3 = jVar.f9354b * 2;
            this.f19037n = i3;
            int i10 = ((((int) ((this.f19035l * jVar.f9353a) / 1000000)) / 2) / i3) * i3 * 2;
            if (this.f19042s.length != i10) {
                this.f19042s = new byte[i10];
                this.v = new byte[i10];
            }
        }
        this.f19039p = 0;
        this.f19040q = 0L;
        this.f19041r = 0;
        this.f19043t = 0;
        this.f19044u = 0;
    }

    @Override
    public final boolean isActive() {
        if (super.isActive() && this.f19038o) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        if (this.f19044u > 0) {
            n(true);
            this.f19041r = 0;
        }
    }

    @Override
    public final void k() {
        this.f19038o = false;
        byte[] bArr = g2.n0.f11874b;
        this.f19042s = bArr;
        this.v = bArr;
    }

    public final int m(int i3) {
        boolean z10;
        int length = ((((int) ((this.f19036m * this.f9359b.f9353a) / 1000000)) - this.f19041r) * this.f19037n) - (this.f19042s.length / 2);
        if (length >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        int i10 = this.f19037n;
        return (((int) Math.min((i3 * this.f19032i) + 0.5f, length)) / i10) * i10;
    }

    public final void n(boolean z10) {
        int length;
        int m10;
        boolean z11;
        int i3;
        boolean z12;
        int i10 = this.f19044u;
        byte[] bArr = this.f19042s;
        if (i10 != bArr.length && !z10) {
            return;
        }
        boolean z13 = false;
        if (this.f19041r == 0) {
            if (z10) {
                o(i10, 3);
                length = i10;
            } else {
                if (i10 >= bArr.length / 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zb.p(z12);
                length = this.f19042s.length / 2;
                o(length, 0);
            }
            m10 = length;
        } else if (z10) {
            int length2 = i10 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int m11 = m(length2) + (this.f19042s.length / 2);
            o(m11, 2);
            m10 = m11;
            length = length3;
        } else {
            length = i10 - (bArr.length / 2);
            m10 = m(length);
            o(m10, 1);
        }
        if (length % this.f19037n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 >= m10) {
                z13 = true;
            }
            zb.p(z13);
            this.f19044u -= length;
            int i11 = this.f19043t + length;
            this.f19043t = i11;
            this.f19043t = i11 % this.f19042s.length;
            this.f19041r = (m10 / this.f19037n) + this.f19041r;
            this.f19040q += (length - m10) / i3;
            return;
        }
        throw new IllegalStateException(ac.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
    }

    public final void o(int i3, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i3 == 0) {
            return;
        }
        boolean z13 = true;
        if (this.f19044u >= i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (i10 == 2) {
            int i11 = this.f19043t;
            int i12 = this.f19044u;
            int i13 = i11 + i12;
            byte[] bArr = this.f19042s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i3, this.v, 0, i3);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i3) {
                    System.arraycopy(bArr, length - i3, this.v, 0, i3);
                } else {
                    int i14 = i3 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.v, 0, i14);
                    System.arraycopy(this.f19042s, 0, this.v, i14, length);
                }
            }
        } else {
            int i15 = this.f19043t;
            int i16 = i15 + i3;
            byte[] bArr2 = this.f19042s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.v, 0, i3);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.v, 0, length2);
                System.arraycopy(this.f19042s, 0, this.v, length2, i3 - length2);
            }
        }
        if (i3 % this.f19037n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.c(i3, "sizeToOutput is not aligned to frame size: %s", z11);
        if (this.f19043t < this.f19042s.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        zb.p(z12);
        byte[] bArr3 = this.v;
        if (i3 % this.f19037n != 0) {
            z13 = false;
        }
        zb.c(i3, "byteOutput size is not aligned to frame size %s", z13);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i3; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.f19034k;
                if (i10 == 0) {
                    i20 = ((((i17 * 1000) / (i3 - 1)) * (i20 - 100)) / 1000) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * 1000) * (100 - i20)) / (i3 - 1)) / 1000;
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
        l(i3).put(bArr3, 0, i3).flip();
    }
}
