package j3;

import java.nio.ByteBuffer;

public final class u0 extends y {

    public int f12455i;

    public int f12456j;

    public boolean f12457k;

    public int f12458l;

    public byte[] f12459m;

    public int f12460n;

    public long f12461o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.f12460n) > 0) {
            j(i10).put(this.f12459m, 0, this.f12460n).flip();
            this.f12460n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f12458l);
        this.f12461o += (long) (iMin / this.f12490b.d);
        this.f12458l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f12458l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f12460n + i11) - this.f12459m.length;
        ByteBuffer byteBufferJ = j(length);
        int iH = d5.g0.h(length, 0, this.f12460n);
        byteBufferJ.put(this.f12459m, 0, iH);
        int iH2 = d5.g0.h(length - iH, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iH2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iH2;
        int i13 = this.f12460n - iH;
        this.f12460n = i13;
        byte[] bArr = this.f12459m;
        System.arraycopy(bArr, iH, bArr, 0, i13);
        byteBuffer.get(this.f12459m, this.f12460n, i12);
        this.f12460n += i12;
        byteBufferJ.flip();
    }

    @Override
    public final boolean d() {
        return super.d() && this.f12460n == 0;
    }

    @Override
    public final h f(h hVar) throws i {
        if (hVar.f12345c != 2) {
            throw new i(hVar);
        }
        this.f12457k = true;
        return (this.f12455i == 0 && this.f12456j == 0) ? h.f12342e : hVar;
    }

    @Override
    public final void g() {
        if (this.f12457k) {
            this.f12457k = false;
            int i10 = this.f12456j;
            int i11 = this.f12490b.d;
            this.f12459m = new byte[i10 * i11];
            this.f12458l = this.f12455i * i11;
        }
        this.f12460n = 0;
    }

    @Override
    public final void h() {
        if (this.f12457k) {
            int i10 = this.f12460n;
            if (i10 > 0) {
                this.f12461o += (long) (i10 / this.f12490b.d);
            }
            this.f12460n = 0;
        }
    }

    @Override
    public final void i() {
        this.f12459m = d5.g0.f4799f;
    }
}
