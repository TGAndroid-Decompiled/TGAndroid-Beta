package l3;

import java.nio.ByteBuffer;
public final class q0 extends a0 {
    public final long f11326i = 150000;
    public final long f11327j = 20000;
    public final short f11328k = 1024;
    public int f11329l;
    public boolean f11330m;
    public byte[] f11331n;
    public byte[] f11332o;
    public int f11333p;
    public int f11334q;
    public int f11335r;
    public boolean f11336s;
    public long f11337t;

    public q0() {
        byte[] bArr = h5.d0.f6927f;
        this.f11331n = bArr;
        this.f11332o = bArr;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f11240g.hasRemaining()) {
            int i10 = this.f11333p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int k10 = k(byteBuffer);
                        byteBuffer.limit(k10);
                        this.f11337t += byteBuffer.remaining() / this.f11329l;
                        m(byteBuffer, this.f11332o, this.f11335r);
                        if (k10 < limit) {
                            l(this.f11335r, this.f11332o);
                            this.f11333p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int k11 = k(byteBuffer);
                    int position2 = k11 - byteBuffer.position();
                    byte[] bArr = this.f11331n;
                    int length = bArr.length;
                    int i11 = this.f11334q;
                    int i12 = length - i11;
                    if (k11 < limit2 && position2 < i12) {
                        l(i11, bArr);
                        this.f11334q = 0;
                        this.f11333p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f11331n, this.f11334q, min);
                        int i13 = this.f11334q + min;
                        this.f11334q = i13;
                        byte[] bArr2 = this.f11331n;
                        if (i13 == bArr2.length) {
                            if (this.f11336s) {
                                l(this.f11335r, bArr2);
                                this.f11337t += (this.f11334q - (this.f11335r * 2)) / this.f11329l;
                            } else {
                                this.f11337t += (i13 - this.f11335r) / this.f11329l;
                            }
                            m(byteBuffer, this.f11331n, this.f11334q);
                            this.f11334q = 0;
                            this.f11333p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f11331n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f11328k) {
                            int i14 = this.f11329l;
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
                    this.f11333p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f11336s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final l f(l lVar) {
        if (lVar.f11306c == 2) {
            if (this.f11330m) {
                return lVar;
            }
            return l.e;
        }
        throw new m(lVar);
    }

    @Override
    public final void g() {
        if (this.f11330m) {
            l lVar = this.f11237b;
            int i10 = lVar.d;
            this.f11329l = i10;
            int i11 = lVar.f11304a;
            int i12 = ((int) ((this.f11326i * i11) / 1000000)) * i10;
            if (this.f11331n.length != i12) {
                this.f11331n = new byte[i12];
            }
            int i13 = ((int) ((this.f11327j * i11) / 1000000)) * i10;
            this.f11335r = i13;
            if (this.f11332o.length != i13) {
                this.f11332o = new byte[i13];
            }
        }
        this.f11333p = 0;
        this.f11337t = 0L;
        this.f11334q = 0;
        this.f11336s = false;
    }

    @Override
    public final void h() {
        int i10 = this.f11334q;
        if (i10 > 0) {
            l(i10, this.f11331n);
        }
        if (!this.f11336s) {
            this.f11337t += this.f11335r / this.f11329l;
        }
    }

    @Override
    public final void i() {
        this.f11330m = false;
        this.f11335r = 0;
        byte[] bArr = h5.d0.f6927f;
        this.f11331n = bArr;
        this.f11332o = bArr;
    }

    @Override
    public final boolean isActive() {
        return this.f11330m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f11328k) {
                int i10 = this.f11329l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i10, byte[] bArr) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f11336s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f11335r);
        int i11 = this.f11335r - min;
        System.arraycopy(bArr, i10 - i11, this.f11332o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f11332o, i11, min);
    }
}
