package j3;

import java.nio.ByteBuffer;

public final class q0 extends y {

    public final long f12403i = 150000;

    public final long f12404j = 20000;

    public final short f12405k = 1024;

    public int f12406l;

    public boolean f12407m;

    public byte[] f12408n;

    public byte[] f12409o;

    public int f12410p;

    public int f12411q;

    public int f12412r;

    public boolean f12413s;

    public long f12414t;

    public q0() {
        byte[] bArr = d5.g0.f4799f;
        this.f12408n = bArr;
        this.f12409o = bArr;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f12494g.hasRemaining()) {
            int i10 = this.f12410p;
            if (i10 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f12408n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f12405k) {
                            int i11 = this.f12406l;
                            iPosition = ((iLimit2 / i11) * i11) + i11;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f12410p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f12413s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i10 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iK = k(byteBuffer);
                int iPosition2 = iK - byteBuffer.position();
                byte[] bArr = this.f12408n;
                int length = bArr.length;
                int i12 = this.f12411q;
                int i13 = length - i12;
                if (iK >= iLimit3 || iPosition2 >= i13) {
                    int iMin = Math.min(iPosition2, i13);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f12408n, this.f12411q, iMin);
                    int i14 = this.f12411q + iMin;
                    this.f12411q = i14;
                    byte[] bArr2 = this.f12408n;
                    if (i14 == bArr2.length) {
                        if (this.f12413s) {
                            l(this.f12412r, bArr2);
                            this.f12414t += (long) ((this.f12411q - (this.f12412r * 2)) / this.f12406l);
                        } else {
                            this.f12414t += (long) ((i14 - this.f12412r) / this.f12406l);
                        }
                        m(byteBuffer, this.f12408n, this.f12411q);
                        this.f12411q = 0;
                        this.f12410p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    l(i12, bArr);
                    this.f12411q = 0;
                    this.f12410p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iK2 = k(byteBuffer);
                byteBuffer.limit(iK2);
                this.f12414t += (long) (byteBuffer.remaining() / this.f12406l);
                m(byteBuffer, this.f12409o, this.f12412r);
                if (iK2 < iLimit4) {
                    l(this.f12412r, this.f12409o);
                    this.f12410p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override
    public final h f(h hVar) throws i {
        if (hVar.f12345c == 2) {
            return this.f12407m ? hVar : h.f12342e;
        }
        throw new i(hVar);
    }

    @Override
    public final void g() {
        if (this.f12407m) {
            h hVar = this.f12490b;
            int i10 = hVar.d;
            this.f12406l = i10;
            int i11 = hVar.f12343a;
            int i12 = ((int) ((this.f12403i * ((long) i11)) / 1000000)) * i10;
            if (this.f12408n.length != i12) {
                this.f12408n = new byte[i12];
            }
            int i13 = ((int) ((this.f12404j * ((long) i11)) / 1000000)) * i10;
            this.f12412r = i13;
            if (this.f12409o.length != i13) {
                this.f12409o = new byte[i13];
            }
        }
        this.f12410p = 0;
        this.f12414t = 0L;
        this.f12411q = 0;
        this.f12413s = false;
    }

    @Override
    public final void h() {
        int i10 = this.f12411q;
        if (i10 > 0) {
            l(i10, this.f12408n);
        }
        if (this.f12413s) {
            return;
        }
        this.f12414t += (long) (this.f12412r / this.f12406l);
    }

    @Override
    public final void i() {
        this.f12407m = false;
        this.f12412r = 0;
        byte[] bArr = d5.g0.f4799f;
        this.f12408n = bArr;
        this.f12409o = bArr;
    }

    @Override
    public final boolean isActive() {
        return this.f12407m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f12405k) {
                int i10 = this.f12406l;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i10, byte[] bArr) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f12413s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f12412r);
        int i11 = this.f12412r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f12409o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f12409o, i11, iMin);
    }
}
