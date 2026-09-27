package k2;

import java.nio.ByteBuffer;
public final class m0 extends c2.i {
    public int f13326i;
    public int f13327j;
    public boolean f13328k;
    public int f13329l;
    public byte[] f13330m;
    public int f13331n;
    public long f13332o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f13331n) > 0) {
            j(i10).put(this.f13330m, 0, this.f13331n).flip();
            this.f13331n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f13331n == 0) {
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
            int min = Math.min(i10, this.f13329l);
            this.f13332o += min / this.f3667b.d;
            this.f13329l -= min;
            byteBuffer.position(position + min);
            if (this.f13329l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f13331n + i11) - this.f13330m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f13331n);
            j3.put(this.f13330m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f13331n - h;
            this.f13331n = i13;
            byte[] bArr = this.f13330m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f13330m, this.f13331n, i12);
            this.f13331n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f3665c)) {
            this.f13328k = true;
            if (this.f13326i == 0 && this.f13327j == 0) {
                return c2.f.e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f13328k) {
            this.f13328k = false;
            int i10 = this.f13327j;
            int i11 = this.f3667b.d;
            this.f13330m = new byte[i10 * i11];
            this.f13329l = this.f13326i * i11;
        }
        this.f13331n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f13328k) {
            if (this.f13331n > 0) {
                this.f13332o += i10 / this.f3667b.d;
            }
            this.f13331n = 0;
        }
    }

    @Override
    public final void i() {
        this.f13330m = e2.d0.f7873b;
    }
}
