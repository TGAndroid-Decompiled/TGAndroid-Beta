package k2;

import java.nio.ByteBuffer;
public final class m0 extends c2.i {
    public int f12178i;
    public int f12179j;
    public boolean f12180k;
    public int f12181l;
    public byte[] f12182m;
    public int f12183n;
    public long f12184o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f12183n) > 0) {
            j(i10).put(this.f12182m, 0, this.f12183n).flip();
            this.f12183n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f12183n == 0) {
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
            int min = Math.min(i10, this.f12181l);
            this.f12184o += min / this.f4087b.d;
            this.f12181l -= min;
            byteBuffer.position(position + min);
            if (this.f12181l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f12183n + i11) - this.f12182m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f12183n);
            j3.put(this.f12182m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f12183n - h;
            this.f12183n = i13;
            byte[] bArr = this.f12182m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f12182m, this.f12183n, i12);
            this.f12183n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f4085c)) {
            this.f12180k = true;
            if (this.f12178i == 0 && this.f12179j == 0) {
                return c2.f.e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f12180k) {
            this.f12180k = false;
            int i10 = this.f12179j;
            int i11 = this.f4087b.d;
            this.f12182m = new byte[i10 * i11];
            this.f12181l = this.f12178i * i11;
        }
        this.f12183n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f12180k) {
            if (this.f12183n > 0) {
                this.f12184o += i10 / this.f4087b.d;
            }
            this.f12183n = 0;
        }
    }

    @Override
    public final void i() {
        this.f12182m = e2.d0.f7189b;
    }
}
