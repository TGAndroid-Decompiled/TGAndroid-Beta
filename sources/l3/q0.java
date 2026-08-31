package l3;

import java.nio.ByteBuffer;
public final class q0 extends a0 {
    public final long f11584i = 150000;
    public final long f11585j = 20000;
    public final short f11586k = 1024;
    public int f11587l;
    public boolean f11588m;
    public byte[] f11589n;
    public byte[] f11590o;
    public int f11591p;
    public int f11592q;
    public int f11593r;
    public boolean f11594s;
    public long f11595t;

    public q0() {
        byte[] bArr = h5.d0.f7241f;
        this.f11589n = bArr;
        this.f11590o = bArr;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f11491g.hasRemaining()) {
            int i10 = this.f11591p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int k10 = k(byteBuffer);
                        byteBuffer.limit(k10);
                        this.f11595t += byteBuffer.remaining() / this.f11587l;
                        m(byteBuffer, this.f11590o, this.f11593r);
                        if (k10 < limit) {
                            l(this.f11593r, this.f11590o);
                            this.f11591p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int k11 = k(byteBuffer);
                    int position2 = k11 - byteBuffer.position();
                    byte[] bArr = this.f11589n;
                    int length = bArr.length;
                    int i11 = this.f11592q;
                    int i12 = length - i11;
                    if (k11 < limit2 && position2 < i12) {
                        l(i11, bArr);
                        this.f11592q = 0;
                        this.f11591p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f11589n, this.f11592q, min);
                        int i13 = this.f11592q + min;
                        this.f11592q = i13;
                        byte[] bArr2 = this.f11589n;
                        if (i13 == bArr2.length) {
                            if (this.f11594s) {
                                l(this.f11593r, bArr2);
                                this.f11595t += (this.f11592q - (this.f11593r * 2)) / this.f11587l;
                            } else {
                                this.f11595t += (i13 - this.f11593r) / this.f11587l;
                            }
                            m(byteBuffer, this.f11589n, this.f11592q);
                            this.f11592q = 0;
                            this.f11591p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f11589n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f11586k) {
                            int i14 = this.f11587l;
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
                    this.f11591p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f11594s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final l f(l lVar) {
        if (lVar.f11562c == 2) {
            if (this.f11588m) {
                return lVar;
            }
            return l.f11559e;
        }
        throw new m(lVar);
    }

    @Override
    public final void g() {
        if (this.f11588m) {
            l lVar = this.f11487b;
            int i10 = lVar.d;
            this.f11587l = i10;
            int i11 = lVar.f11560a;
            int i12 = ((int) ((this.f11584i * i11) / 1000000)) * i10;
            if (this.f11589n.length != i12) {
                this.f11589n = new byte[i12];
            }
            int i13 = ((int) ((this.f11585j * i11) / 1000000)) * i10;
            this.f11593r = i13;
            if (this.f11590o.length != i13) {
                this.f11590o = new byte[i13];
            }
        }
        this.f11591p = 0;
        this.f11595t = 0L;
        this.f11592q = 0;
        this.f11594s = false;
    }

    @Override
    public final void h() {
        int i10 = this.f11592q;
        if (i10 > 0) {
            l(i10, this.f11589n);
        }
        if (!this.f11594s) {
            this.f11595t += this.f11593r / this.f11587l;
        }
    }

    @Override
    public final void i() {
        this.f11588m = false;
        this.f11593r = 0;
        byte[] bArr = h5.d0.f7241f;
        this.f11589n = bArr;
        this.f11590o = bArr;
    }

    @Override
    public final boolean isActive() {
        return this.f11588m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f11586k) {
                int i10 = this.f11587l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i10, byte[] bArr) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f11594s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f11593r);
        int i11 = this.f11593r - min;
        System.arraycopy(bArr, i10 - i11, this.f11590o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f11590o, i11, min);
    }
}
