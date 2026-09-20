package k2;

import java.nio.ByteBuffer;
public final class n0 extends c2.i {
    public int f13338i;
    public int f13339j;
    public boolean f13340k;
    public int f13341l;
    public byte[] f13342m;
    public int f13343n;
    public long f13344o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f13343n) > 0) {
            j(i10).put(this.f13342m, 0, this.f13343n).flip();
            this.f13343n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f13343n == 0) {
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
            int min = Math.min(i10, this.f13341l);
            this.f13344o += min / this.f3673b.d;
            this.f13341l -= min;
            byteBuffer.position(position + min);
            if (this.f13341l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f13343n + i11) - this.f13342m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f13343n);
            j3.put(this.f13342m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f13343n - h;
            this.f13343n = i13;
            byte[] bArr = this.f13342m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f13342m, this.f13343n, i12);
            this.f13343n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f3671c)) {
            this.f13340k = true;
            if (this.f13338i == 0 && this.f13339j == 0) {
                return c2.f.e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f13340k) {
            this.f13340k = false;
            int i10 = this.f13339j;
            int i11 = this.f3673b.d;
            this.f13342m = new byte[i10 * i11];
            this.f13341l = this.f13338i * i11;
        }
        this.f13343n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f13340k) {
            if (this.f13343n > 0) {
                this.f13344o += i10 / this.f3673b.d;
            }
            this.f13343n = 0;
        }
    }

    @Override
    public final void i() {
        this.f13342m = e2.d0.f7889b;
    }
}
