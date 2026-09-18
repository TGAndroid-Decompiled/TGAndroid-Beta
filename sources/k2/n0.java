package k2;

import java.nio.ByteBuffer;
public final class n0 extends c2.i {
    public int f13337i;
    public int f13338j;
    public boolean f13339k;
    public int f13340l;
    public byte[] f13341m;
    public int f13342n;
    public long f13343o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f13342n) > 0) {
            j(i10).put(this.f13341m, 0, this.f13342n).flip();
            this.f13342n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f13342n == 0) {
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
            int min = Math.min(i10, this.f13340l);
            this.f13343o += min / this.f3673b.d;
            this.f13340l -= min;
            byteBuffer.position(position + min);
            if (this.f13340l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f13342n + i11) - this.f13341m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f13342n);
            j3.put(this.f13341m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f13342n - h;
            this.f13342n = i13;
            byte[] bArr = this.f13341m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f13341m, this.f13342n, i12);
            this.f13342n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f3671c)) {
            this.f13339k = true;
            if (this.f13337i == 0 && this.f13338j == 0) {
                return c2.f.e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f13339k) {
            this.f13339k = false;
            int i10 = this.f13338j;
            int i11 = this.f3673b.d;
            this.f13341m = new byte[i10 * i11];
            this.f13340l = this.f13337i * i11;
        }
        this.f13342n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f13339k) {
            if (this.f13342n > 0) {
                this.f13343o += i10 / this.f3673b.d;
            }
            this.f13342n = 0;
        }
    }

    @Override
    public final void i() {
        this.f13341m = e2.d0.f7888b;
    }
}
