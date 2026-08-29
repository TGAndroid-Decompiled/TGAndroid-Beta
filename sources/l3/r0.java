package l3;

import java.nio.ByteBuffer;
public final class r0 extends y {
    public final long f14162i = 150000;
    public final long f14163j = 20000;
    public final short f14164k = 1024;
    public int f14165l;
    public boolean f14166m;
    public byte[] f14167n;
    public byte[] f14168o;
    public int f14169p;
    public int f14170q;
    public int f14171r;
    public boolean f14172s;
    public long f14173t;

    public r0() {
        byte[] bArr = f5.d0.f6583f;
        this.f14167n = bArr;
        this.f14168o = bArr;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f14253g.hasRemaining()) {
            int i10 = this.f14169p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int k9 = k(byteBuffer);
                        byteBuffer.limit(k9);
                        this.f14173t += byteBuffer.remaining() / this.f14165l;
                        m(byteBuffer, this.f14168o, this.f14171r);
                        if (k9 < limit) {
                            l(this.f14171r, this.f14168o);
                            this.f14169p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int k10 = k(byteBuffer);
                    int position2 = k10 - byteBuffer.position();
                    byte[] bArr = this.f14167n;
                    int length = bArr.length;
                    int i11 = this.f14170q;
                    int i12 = length - i11;
                    if (k10 < limit2 && position2 < i12) {
                        l(i11, bArr);
                        this.f14170q = 0;
                        this.f14169p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f14167n, this.f14170q, min);
                        int i13 = this.f14170q + min;
                        this.f14170q = i13;
                        byte[] bArr2 = this.f14167n;
                        if (i13 == bArr2.length) {
                            if (this.f14172s) {
                                l(this.f14171r, bArr2);
                                this.f14173t += (this.f14170q - (this.f14171r * 2)) / this.f14165l;
                            } else {
                                this.f14173t += (i13 - this.f14171r) / this.f14165l;
                            }
                            m(byteBuffer, this.f14167n, this.f14170q);
                            this.f14170q = 0;
                            this.f14169p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f14167n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f14164k) {
                            int i14 = this.f14165l;
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
                    this.f14169p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f14172s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override
    public final h f(h hVar) {
        if (hVar.f14101c == 2) {
            if (this.f14166m) {
                return hVar;
            }
            return h.f14098e;
        }
        throw new i(hVar);
    }

    @Override
    public final void g() {
        if (this.f14166m) {
            h hVar = this.f14249b;
            int i10 = hVar.d;
            this.f14165l = i10;
            int i11 = hVar.f14099a;
            int i12 = ((int) ((this.f14162i * i11) / 1000000)) * i10;
            if (this.f14167n.length != i12) {
                this.f14167n = new byte[i12];
            }
            int i13 = ((int) ((this.f14163j * i11) / 1000000)) * i10;
            this.f14171r = i13;
            if (this.f14168o.length != i13) {
                this.f14168o = new byte[i13];
            }
        }
        this.f14169p = 0;
        this.f14173t = 0L;
        this.f14170q = 0;
        this.f14172s = false;
    }

    @Override
    public final void h() {
        int i10 = this.f14170q;
        if (i10 > 0) {
            l(i10, this.f14167n);
        }
        if (!this.f14172s) {
            this.f14173t += this.f14171r / this.f14165l;
        }
    }

    @Override
    public final void i() {
        this.f14166m = false;
        this.f14171r = 0;
        byte[] bArr = f5.d0.f6583f;
        this.f14167n = bArr;
        this.f14168o = bArr;
    }

    @Override
    public final boolean isActive() {
        return this.f14166m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f14164k) {
                int i10 = this.f14165l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i10, byte[] bArr) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f14172s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f14171r);
        int i11 = this.f14171r - min;
        System.arraycopy(bArr, i10 - i11, this.f14168o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f14168o, i11, min);
    }
}
