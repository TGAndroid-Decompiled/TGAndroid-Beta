package j3;

import java.nio.ByteBuffer;
public final class p0 extends x {
    public final long f13303i = 150000;
    public final long f13304j = 20000;
    public final short f13305k = 1024;
    public int f13306l;
    public boolean f13307m;
    public byte[] f13308n;
    public byte[] f13309o;
    public int f13310p;
    public int f13311q;
    public int f13312r;
    public boolean f13313s;
    public long f13314t;

    public p0() {
        byte[] bArr = d5.f0.f4353f;
        this.f13308n = bArr;
        this.f13309o = bArr;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f13394g.hasRemaining()) {
            int i9 = this.f13310p;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int limit = byteBuffer.limit();
                        int k10 = k(byteBuffer);
                        byteBuffer.limit(k10);
                        this.f13314t += byteBuffer.remaining() / this.f13306l;
                        m(byteBuffer, this.f13309o, this.f13312r);
                        if (k10 < limit) {
                            l(this.f13312r, this.f13309o);
                            this.f13310p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int k11 = k(byteBuffer);
                    int position2 = k11 - byteBuffer.position();
                    byte[] bArr = this.f13308n;
                    int length = bArr.length;
                    int i10 = this.f13311q;
                    int i11 = length - i10;
                    if (k11 < limit2 && position2 < i11) {
                        l(i10, bArr);
                        this.f13311q = 0;
                        this.f13310p = 0;
                    } else {
                        int min = Math.min(position2, i11);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f13308n, this.f13311q, min);
                        int i12 = this.f13311q + min;
                        this.f13311q = i12;
                        byte[] bArr2 = this.f13308n;
                        if (i12 == bArr2.length) {
                            if (this.f13313s) {
                                l(this.f13312r, bArr2);
                                this.f13314t += (this.f13311q - (this.f13312r * 2)) / this.f13306l;
                            } else {
                                this.f13314t += (i12 - this.f13312r) / this.f13306l;
                            }
                            m(byteBuffer, this.f13308n, this.f13311q);
                            this.f13311q = 0;
                            this.f13310p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f13308n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f13305k) {
                            int i13 = this.f13306l;
                            position = ((limit4 / i13) * i13) + i13;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f13310p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f13313s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final h f(h hVar) {
        if (hVar.f13249c == 2) {
            if (this.f13307m) {
                return hVar;
            }
            return h.f13246e;
        }
        throw new i(hVar);
    }

    @Override
    public final void g() {
        if (this.f13307m) {
            h hVar = this.f13390b;
            int i9 = hVar.d;
            this.f13306l = i9;
            int i10 = hVar.f13247a;
            int i11 = ((int) ((this.f13303i * i10) / 1000000)) * i9;
            if (this.f13308n.length != i11) {
                this.f13308n = new byte[i11];
            }
            int i12 = ((int) ((this.f13304j * i10) / 1000000)) * i9;
            this.f13312r = i12;
            if (this.f13309o.length != i12) {
                this.f13309o = new byte[i12];
            }
        }
        this.f13310p = 0;
        this.f13314t = 0L;
        this.f13311q = 0;
        this.f13313s = false;
    }

    @Override
    public final void h() {
        int i9 = this.f13311q;
        if (i9 > 0) {
            l(i9, this.f13308n);
        }
        if (!this.f13313s) {
            this.f13314t += this.f13312r / this.f13306l;
        }
    }

    @Override
    public final void i() {
        this.f13307m = false;
        this.f13312r = 0;
        byte[] bArr = d5.f0.f4353f;
        this.f13308n = bArr;
        this.f13309o = bArr;
    }

    @Override
    public final boolean isActive() {
        return this.f13307m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f13305k) {
                int i9 = this.f13306l;
                return (position / i9) * i9;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i9, byte[] bArr) {
        j(i9).put(bArr, 0, i9).flip();
        if (i9 > 0) {
            this.f13313s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i9) {
        int min = Math.min(byteBuffer.remaining(), this.f13312r);
        int i10 = this.f13312r - min;
        System.arraycopy(bArr, i9 - i10, this.f13309o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f13309o, i10, min);
    }
}
