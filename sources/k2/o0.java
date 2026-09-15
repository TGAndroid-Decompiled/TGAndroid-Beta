package k2;

import java.nio.ByteBuffer;
public final class o0 extends c2.i {
    public int f13339i;
    public int f13340j;
    public boolean f13341k;
    public int f13342l;
    public byte[] f13343m;
    public int f13344n;
    public long f13345o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f13344n) > 0) {
            j(i10).put(this.f13343m, 0, this.f13344n).flip();
            this.f13344n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f13344n == 0) {
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
            int min = Math.min(i10, this.f13342l);
            this.f13345o += min / this.f3668b.d;
            this.f13342l -= min;
            byteBuffer.position(position + min);
            if (this.f13342l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f13344n + i11) - this.f13343m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f13344n);
            j3.put(this.f13343m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f13344n - h;
            this.f13344n = i13;
            byte[] bArr = this.f13343m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f13343m, this.f13344n, i12);
            this.f13344n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f3666c)) {
            this.f13341k = true;
            if (this.f13339i == 0 && this.f13340j == 0) {
                return c2.f.e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f13341k) {
            this.f13341k = false;
            int i10 = this.f13340j;
            int i11 = this.f3668b.d;
            this.f13343m = new byte[i10 * i11];
            this.f13342l = this.f13339i * i11;
        }
        this.f13344n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f13341k) {
            if (this.f13344n > 0) {
                this.f13345o += i10 / this.f3668b.d;
            }
            this.f13344n = 0;
        }
    }

    @Override
    public final void i() {
        this.f13343m = e2.d0.f7884b;
    }
}
