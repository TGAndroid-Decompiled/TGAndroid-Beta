package k2;

import java.nio.ByteBuffer;
public final class j0 extends c2.i {
    public int f14633n;
    public boolean f14634o;
    public int f14635p;
    public long f14636q;
    public byte[] f14638s;
    public byte[] v;
    public int f14637r = 0;
    public int f14639t = 0;
    public int f14640u = 0;
    public final long f14631l = 100000;
    public final float f14628i = 0.2f;
    public final long f14632m = 2000000;
    public final int f14630k = 10;
    public final short f14629j = 1024;

    public j0() {
        byte[] bArr = e2.d0.f8766b;
        this.f14638s = bArr;
        this.v = bArr;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        boolean z10;
        int limit;
        boolean z11;
        boolean z12;
        int position;
        while (byteBuffer.hasRemaining() && !this.f4188g.hasRemaining()) {
            int i10 = this.f14635p;
            short s10 = this.f14629j;
            boolean z13 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (this.f14639t < this.f14638s.length) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s10) {
                                int i11 = this.f14633n;
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
                    int i12 = this.f14639t;
                    int i13 = this.f14640u;
                    int i14 = i12 + i13;
                    byte[] bArr = this.f14638s;
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
                    byteBuffer.get(this.f14638s, i14, min);
                    int i16 = this.f14640u + min;
                    this.f14640u = i16;
                    if (i16 <= this.f14638s.length) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    e2.d.g(z12);
                    z13 = (!z11 || position3 >= i15) ? false : false;
                    l(z13);
                    if (z13) {
                        this.f14635p = 0;
                        this.f14637r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f14638s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s10) {
                            int i17 = this.f14633n;
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
                    this.f14635p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (fVar.f4182c == 2) {
            if (fVar.f4180a == -1) {
                return c2.f.f4179e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (isActive()) {
            c2.f fVar = this.f4184b;
            int i10 = fVar.f4181b * 2;
            this.f14633n = i10;
            int i11 = ((((int) ((this.f14631l * fVar.f4180a) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f14638s.length != i11) {
                this.f14638s = new byte[i11];
                this.v = new byte[i11];
            }
        }
        this.f14635p = 0;
        this.f14636q = 0L;
        this.f14637r = 0;
        this.f14639t = 0;
        this.f14640u = 0;
    }

    @Override
    public final void h() {
        if (this.f14640u > 0) {
            l(true);
            this.f14637r = 0;
        }
    }

    @Override
    public final void i() {
        this.f14634o = false;
        byte[] bArr = e2.d0.f8766b;
        this.f14638s = bArr;
        this.v = bArr;
    }

    @Override
    public final boolean isActive() {
        if (super.isActive() && this.f14634o) {
            return true;
        }
        return false;
    }

    public final int k(int i10) {
        boolean z10;
        int length = ((((int) ((this.f14632m * this.f4184b.f4180a) / 1000000)) - this.f14637r) * this.f14633n) - (this.f14638s.length / 2);
        if (length >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        int i11 = this.f14633n;
        return (((int) Math.min((i10 * this.f14628i) + 0.5f, length)) / i11) * i11;
    }

    public final void l(boolean z10) {
        int length;
        int k10;
        boolean z11;
        int i10;
        boolean z12;
        int i11 = this.f14640u;
        byte[] bArr = this.f14638s;
        if (i11 != bArr.length && !z10) {
            return;
        }
        boolean z13 = false;
        if (this.f14637r == 0) {
            if (z10) {
                m(i11, 3);
                length = i11;
            } else {
                if (i11 >= bArr.length / 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.g(z12);
                length = this.f14638s.length / 2;
                m(length, 0);
            }
            k10 = length;
        } else if (z10) {
            int length2 = i11 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int k11 = k(length2) + (this.f14638s.length / 2);
            m(k11, 2);
            k10 = k11;
            length = length3;
        } else {
            length = i11 - (bArr.length / 2);
            k10 = k(length);
            m(k10, 1);
        }
        if (length % this.f14633n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.f("bytesConsumed is not aligned to frame size: %s" + length, z11);
        if (i11 >= k10) {
            z13 = true;
        }
        e2.d.g(z13);
        this.f14640u -= length;
        int i12 = this.f14639t + length;
        this.f14639t = i12;
        this.f14639t = i12 % this.f14638s.length;
        this.f14637r = (k10 / this.f14633n) + this.f14637r;
        this.f14636q += (length - k10) / i10;
    }

    public final void m(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i10 == 0) {
            return;
        }
        boolean z13 = true;
        if (this.f14640u >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (i11 == 2) {
            int i12 = this.f14639t;
            int i13 = this.f14640u;
            int i14 = i12 + i13;
            byte[] bArr = this.f14638s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.v, 0, i15);
                    System.arraycopy(this.f14638s, 0, this.v, i15, length);
                }
            }
        } else {
            int i16 = this.f14639t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f14638s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.v, 0, length2);
                System.arraycopy(this.f14638s, 0, this.v, length2, i10 - length2);
            }
        }
        if (i10 % this.f14633n == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.a("sizeToOutput is not aligned to frame size: " + i10, z11);
        if (this.f14639t < this.f14638s.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        e2.d.g(z12);
        byte[] bArr3 = this.v;
        if (i10 % this.f14633n != 0) {
            z13 = false;
        }
        e2.d.a("byteOutput size is not aligned to frame size " + i10, z13);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f14630k;
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
        j(i10).put(bArr3, 0, i10).flip();
    }
}
