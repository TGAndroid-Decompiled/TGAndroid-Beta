package defpackage;

import java.nio.ByteBuffer;
public final class ela extends ef0 {
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    @Override
    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        int limit;
        boolean z2;
        boolean z3;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            boolean z4 = this.k;
            boolean z5 = true;
            if (z4) {
                if (z4) {
                    if (this.o < this.n.length) {
                        z = true;
                    } else {
                        z = false;
                    }
                    yve.p(z);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2 - 1) & 255) | (byteBuffer.get(position2) << 8)) > 1024) {
                                int i = this.i;
                                limit = (position2 / i) * i;
                                break;
                            }
                            position2 += 2;
                        } else {
                            limit = byteBuffer.limit();
                            break;
                        }
                    }
                    int position3 = limit - byteBuffer.position();
                    int i2 = this.o;
                    int i3 = this.p;
                    int i4 = i2 + i3;
                    byte[] bArr = this.n;
                    if (i4 < bArr.length) {
                        i2 = bArr.length;
                    } else {
                        i4 = i3 - (bArr.length - i2);
                    }
                    int i5 = i2 - i4;
                    if (limit < limit2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int min = Math.min(position3, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, i4, min);
                    int i6 = this.p + min;
                    this.p = i6;
                    if (i6 <= this.n.length) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    yve.p(z3);
                    if (!z2 || position3 >= i5) {
                        z5 = false;
                    }
                    n(z5);
                    if (z5) {
                        this.k = false;
                        this.m = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    grb.g();
                    return;
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4 - 1) & 255) | (byteBuffer.get(limit4) << 8)) > 1024) {
                            int i7 = this.i;
                            position = ((limit4 / i7) * i7) + i7;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.k = true;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final void i() {
        if (isActive()) {
            m20 m20Var = this.b;
            int i = m20Var.b << 1;
            this.i = i;
            int i2 = ((((((int) ((100000 * m20Var.a) / 1000000)) * i) / 2) / i) * i) << 1;
            if (this.n.length != i2) {
                this.n = new byte[i2];
                this.q = new byte[i2];
            }
        }
        this.k = false;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override
    public final boolean isActive() {
        if (super.isActive() && this.j) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        if (this.p > 0) {
            n(true);
            this.m = 0;
        }
    }

    @Override
    public final void k() {
        this.j = false;
        byte[] bArr = gcc.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final int m(int i) {
        boolean z;
        int length = ((((int) ((2000000 * this.b.a) / 1000000)) - this.m) * this.i) - (this.n.length / 2);
        if (length >= 0) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        int i2 = this.i;
        return (((int) Math.min((i * 0.2f) + 0.5f, length)) / i2) * i2;
    }

    public final void n(boolean z) {
        int length;
        int m;
        boolean z2;
        int i;
        boolean z3;
        int i2 = this.p;
        byte[] bArr = this.n;
        if (i2 != bArr.length && !z) {
            return;
        }
        boolean z4 = false;
        if (this.m == 0) {
            if (z) {
                o(i2, 3);
                length = i2;
            } else {
                if (i2 >= bArr.length / 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                yve.p(z3);
                length = this.n.length / 2;
                o(length, 0);
            }
            m = length;
        } else if (z) {
            int length2 = i2 - (bArr.length / 2);
            int length3 = (bArr.length / 2) + length2;
            int m2 = m(length2) + (this.n.length / 2);
            o(m2, 2);
            m = m2;
            length = length3;
        } else {
            length = i2 - (bArr.length / 2);
            m = m(length);
            o(m, 1);
        }
        if (length % this.i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i2 >= m) {
                z4 = true;
            }
            yve.p(z4);
            this.p -= length;
            int i3 = this.o + length;
            this.o = i3;
            this.o = i3 % this.n.length;
            this.m = (m / this.i) + this.m;
            this.l += (length - m) / i;
            return;
        }
        grb.i(fze.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
    }

    public final void o(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i == 0) {
            return;
        }
        if (this.p >= i) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        int i3 = this.o;
        if (i2 == 2) {
            int i4 = this.p;
            int i5 = i3 + i4;
            byte[] bArr = this.n;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.q, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.q;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.n, 0, this.q, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.n, 0, this.q, length3, i - length3);
            }
        }
        if (i % this.i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.c(i, "sizeToOutput is not aligned to frame size: %s", z2);
        if (this.o < this.n.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        yve.p(z3);
        byte[] bArr5 = this.q;
        if (i % this.i == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        yve.c(i, "byteOutput size is not aligned to frame size %s", z4);
        if (i2 != 3) {
            int i8 = (i / this.i) - 1;
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr5[i9] & 255) | (bArr5[i10] << 8);
                int i12 = 10;
                if (i2 == 0) {
                    int i13 = i9 / this.i;
                    if (i8 != 0) {
                        i12 = ((((i13 * 1000) / i8) * (-90)) / 1000) + 100;
                    }
                } else if (i2 == 2) {
                    i12 = i8 == 0 ? 100 : ((((i9 / this.i) * 90000) / i8) / 1000) + 10;
                }
                int i14 = (i11 * i12) / 100;
                if (i14 >= 32767) {
                    bArr5[i9] = -1;
                    bArr5[i10] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr5[i9] = 0;
                    bArr5[i10] = Byte.MIN_VALUE;
                } else {
                    bArr5[i9] = (byte) (i14 & 255);
                    bArr5[i10] = (byte) (i14 >> 8);
                }
            }
        }
        l(i).put(bArr5, 0, i).flip();
    }
}
