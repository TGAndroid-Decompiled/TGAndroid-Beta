package k2;

import java.nio.ByteBuffer;
public final class n0 extends c2.i {
    public int f14489i;
    public int f14490j;
    public boolean f14491k;
    public int f14492l;
    public byte[] f14493m;
    public int f14494n;
    public long f14495o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14494n) > 0) {
            j(i10).put(this.f14493m, 0, this.f14494n).flip();
            this.f14494n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14494n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f14492l);
            this.f14495o += min / this.f3963b.d;
            this.f14492l -= min;
            byteBuffer.position(position + min);
            if (this.f14492l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14494n + i11) - this.f14493m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f14494n);
            j3.put(this.f14493m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f14494n - h;
            this.f14494n = i13;
            byte[] bArr = this.f14493m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f14493m, this.f14494n, i12);
            this.f14494n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f3961c)) {
            this.f14491k = true;
            if (this.f14489i == 0 && this.f14490j == 0) {
                return c2.f.f3958e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f14491k) {
            this.f14491k = false;
            int i10 = this.f14490j;
            int i11 = this.f3963b.d;
            this.f14493m = new byte[i10 * i11];
            this.f14492l = this.f14489i * i11;
        }
        this.f14494n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f14491k) {
            if (this.f14494n > 0) {
                this.f14495o += i10 / this.f3963b.d;
            }
            this.f14494n = 0;
        }
    }

    @Override
    public final void i() {
        this.f14493m = e2.d0.f8539b;
    }
}
