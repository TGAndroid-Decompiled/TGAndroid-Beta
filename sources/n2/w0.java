package n2;

import a8.ja;
import a8.ka;
import java.nio.ByteBuffer;
public final class w0 extends f2.n {
    public int f20907n;
    public boolean f20908o;
    public int f20909p;
    public long f20910q;
    public byte[] f20912s;
    public byte[] v;
    public int f20911r = 0;
    public int f20913t = 0;
    public int f20914u = 0;
    public final long f20905l = 100000;
    public final float f20902i = 0.2f;
    public final long f20906m = 2000000;
    public final int f20904k = 10;
    public final short f20903j = 1024;

    public w0() {
        byte[] bArr = h2.l0.f13472b;
        this.f20912s = bArr;
        this.v = bArr;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        boolean z10;
        int limit;
        boolean z11;
        boolean z12;
        int position;
        while (byteBuffer.hasRemaining() && !this.f10740g.hasRemaining()) {
            int i7 = this.f20909p;
            short s5 = this.f20903j;
            boolean z13 = true;
            if (i7 != 0) {
                if (i7 == 1) {
                    if (this.f20913t < this.f20912s.length) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ja.p(z10);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s5) {
                                int i10 = this.f20907n;
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
                    int i11 = this.f20913t;
                    int i12 = this.f20914u;
                    int i13 = i11 + i12;
                    byte[] bArr = this.f20912s;
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
                    byteBuffer.get(this.f20912s, i13, min);
                    int i15 = this.f20914u + min;
                    this.f20914u = i15;
                    if (i15 <= this.f20912s.length) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ja.p(z12);
                    if (!z11 || position3 >= i14) {
                        z13 = false;
                    }
                    n(z13);
                    if (z13) {
                        this.f20909p = 0;
                        this.f20911r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f20912s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s5) {
                            int i16 = this.f20907n;
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
                    this.f20909p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final f2.j h(f2.j jVar) {
        if (jVar.f10732c == 2) {
            if (jVar.f10730a == -1) {
                return f2.j.f10729e;
            }
            return jVar;
        }
        throw new f2.l(jVar);
    }

    @Override
    public final void i() {
        if (isActive()) {
            f2.j jVar = this.f10736b;
            int i7 = jVar.f10731b * 2;
            this.f20907n = i7;
            int i10 = ((((int) ((this.f20905l * jVar.f10730a) / 1000000)) / 2) / i7) * i7 * 2;
            if (this.f20912s.length != i10) {
                this.f20912s = new byte[i10];
                this.v = new byte[i10];
            }
        }
        this.f20909p = 0;
        this.f20910q = 0L;
        this.f20911r = 0;
        this.f20913t = 0;
        this.f20914u = 0;
    }

    @Override
    public final boolean isActive() {
        if (super.isActive() && this.f20908o) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        if (this.f20914u > 0) {
            n(true);
            this.f20911r = 0;
        }
    }

    @Override
    public final void k() {
        this.f20908o = false;
        byte[] bArr = h2.l0.f13472b;
        this.f20912s = bArr;
        this.v = bArr;
    }

    public final int m(int i7) {
        boolean z10;
        int length = ((((int) ((this.f20906m * this.f10736b.f10730a) / 1000000)) - this.f20911r) * this.f20907n) - (this.f20912s.length / 2);
        if (length >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        int i10 = this.f20907n;
        return (((int) Math.min((i7 * this.f20902i) + 0.5f, length)) / i10) * i10;
    }

    public final void n(boolean z10) {
        int length;
        int m10;
        boolean z11;
        int i7;
        boolean z12;
        int i10 = this.f20914u;
        byte[] bArr = this.f20912s;
        if (i10 != bArr.length && !z10) {
            return;
        }
        boolean z13 = false;
        if (this.f20911r == 0) {
            if (z10) {
                o(i10, 3);
                length = i10;
            } else {
                if (i10 >= bArr.length / 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ja.p(z12);
                length = this.f20912s.length / 2;
                o(length, 0);
            }
            m10 = length;
        } else if (z10) {
            int length2 = i10 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int m11 = m(length2) + (this.f20912s.length / 2);
            o(m11, 2);
            m10 = m11;
            length = length3;
        } else {
            length = i10 - (bArr.length / 2);
            m10 = m(length);
            o(m10, 1);
        }
        if (length % this.f20907n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 >= m10) {
                z13 = true;
            }
            ja.p(z13);
            this.f20914u -= length;
            int i11 = this.f20913t + length;
            this.f20913t = i11;
            this.f20913t = i11 % this.f20912s.length;
            this.f20911r = (m10 / this.f20907n) + this.f20911r;
            this.f20910q += (length - m10) / i7;
            return;
        }
        throw new IllegalStateException(ka.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
    }

    public final void o(int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i7 == 0) {
            return;
        }
        boolean z13 = true;
        if (this.f20914u >= i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        if (i10 == 2) {
            int i11 = this.f20913t;
            int i12 = this.f20914u;
            int i13 = i11 + i12;
            byte[] bArr = this.f20912s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i7, this.v, 0, i7);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.v, 0, i7);
                } else {
                    int i14 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.v, 0, i14);
                    System.arraycopy(this.f20912s, 0, this.v, i14, length);
                }
            }
        } else {
            int i15 = this.f20913t;
            int i16 = i15 + i7;
            byte[] bArr2 = this.f20912s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.v, 0, i7);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.v, 0, length2);
                System.arraycopy(this.f20912s, 0, this.v, length2, i7 - length2);
            }
        }
        if (i7 % this.f20907n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.c(i7, "sizeToOutput is not aligned to frame size: %s", z11);
        if (this.f20913t < this.f20912s.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        ja.p(z12);
        byte[] bArr3 = this.v;
        if (i7 % this.f20907n != 0) {
            z13 = false;
        }
        ja.c(i7, "byteOutput size is not aligned to frame size %s", z13);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i7; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.f20904k;
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
