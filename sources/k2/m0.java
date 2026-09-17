package k2;

import java.nio.ByteBuffer;
public final class m0 extends c2.i {
    public int f14626i;
    public int f14627j;
    public boolean f14628k;
    public int f14629l;
    public byte[] f14630m;
    public int f14631n;
    public long f14632o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14631n) > 0) {
            j(i10).put(this.f14630m, 0, this.f14631n).flip();
            this.f14631n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14631n == 0) {
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
            int min = Math.min(i10, this.f14629l);
            this.f14632o += min / this.f4157b.d;
            this.f14629l -= min;
            byteBuffer.position(position + min);
            if (this.f14629l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14631n + i11) - this.f14630m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f14631n);
            j3.put(this.f14630m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f14631n - h;
            this.f14631n = i13;
            byte[] bArr = this.f14630m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f14630m, this.f14631n, i12);
            this.f14631n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f4155c)) {
            this.f14628k = true;
            if (this.f14626i == 0 && this.f14627j == 0) {
                return c2.f.f4152e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f14628k) {
            this.f14628k = false;
            int i10 = this.f14627j;
            int i11 = this.f4157b.d;
            this.f14630m = new byte[i10 * i11];
            this.f14629l = this.f14626i * i11;
        }
        this.f14631n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f14628k) {
            if (this.f14631n > 0) {
                this.f14632o += i10 / this.f4157b.d;
            }
            this.f14631n = 0;
        }
    }

    @Override
    public final void i() {
        this.f14630m = e2.d0.f8738b;
    }
}
