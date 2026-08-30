package l3;

import java.nio.ByteBuffer;
public final class q0 extends a0 {
    public final long f11216i = 150000;
    public final long f11217j = 20000;
    public final short f11218k = 1024;
    public int f11219l;
    public boolean f11220m;
    public byte[] f11221n;
    public byte[] f11222o;
    public int f11223p;
    public int f11224q;
    public int f11225r;
    public boolean f11226s;
    public long f11227t;

    public q0() {
        byte[] bArr = h5.d0.f6940f;
        this.f11221n = bArr;
        this.f11222o = bArr;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f11130g.hasRemaining()) {
            int i10 = this.f11223p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int k10 = k(byteBuffer);
                        byteBuffer.limit(k10);
                        this.f11227t += byteBuffer.remaining() / this.f11219l;
                        m(byteBuffer, this.f11222o, this.f11225r);
                        if (k10 < limit) {
                            l(this.f11225r, this.f11222o);
                            this.f11223p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int k11 = k(byteBuffer);
                    int position2 = k11 - byteBuffer.position();
                    byte[] bArr = this.f11221n;
                    int length = bArr.length;
                    int i11 = this.f11224q;
                    int i12 = length - i11;
                    if (k11 < limit2 && position2 < i12) {
                        l(i11, bArr);
                        this.f11224q = 0;
                        this.f11223p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f11221n, this.f11224q, min);
                        int i13 = this.f11224q + min;
                        this.f11224q = i13;
                        byte[] bArr2 = this.f11221n;
                        if (i13 == bArr2.length) {
                            if (this.f11226s) {
                                l(this.f11225r, bArr2);
                                this.f11227t += (this.f11224q - (this.f11225r * 2)) / this.f11219l;
                            } else {
                                this.f11227t += (i13 - this.f11225r) / this.f11219l;
                            }
                            m(byteBuffer, this.f11221n, this.f11224q);
                            this.f11224q = 0;
                            this.f11223p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f11221n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f11218k) {
                            int i14 = this.f11219l;
                            position = ((limit4 / i14) * i14) + i14;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f11223p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f11226s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final l f(l lVar) {
        if (lVar.f11196c == 2) {
            if (this.f11220m) {
                return lVar;
            }
            return l.e;
        }
        throw new m(lVar);
    }

    @Override
    public final void g() {
        if (this.f11220m) {
            l lVar = this.f11127b;
            int i10 = lVar.d;
            this.f11219l = i10;
            int i11 = lVar.f11194a;
            int i12 = ((int) ((this.f11216i * i11) / 1000000)) * i10;
            if (this.f11221n.length != i12) {
                this.f11221n = new byte[i12];
            }
            int i13 = ((int) ((this.f11217j * i11) / 1000000)) * i10;
            this.f11225r = i13;
            if (this.f11222o.length != i13) {
                this.f11222o = new byte[i13];
            }
        }
        this.f11223p = 0;
        this.f11227t = 0L;
        this.f11224q = 0;
        this.f11226s = false;
    }

    @Override
    public final void h() {
        int i10 = this.f11224q;
        if (i10 > 0) {
            l(i10, this.f11221n);
        }
        if (!this.f11226s) {
            this.f11227t += this.f11225r / this.f11219l;
        }
    }

    @Override
    public final void i() {
        this.f11220m = false;
        this.f11225r = 0;
        byte[] bArr = h5.d0.f6940f;
        this.f11221n = bArr;
        this.f11222o = bArr;
    }

    @Override
    public final boolean isActive() {
        return this.f11220m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f11218k) {
                int i10 = this.f11219l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i10, byte[] bArr) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f11226s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f11225r);
        int i11 = this.f11225r - min;
        System.arraycopy(bArr, i10 - i11, this.f11222o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f11222o, i11, min);
    }
}
