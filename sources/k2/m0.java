package k2;

import java.nio.ByteBuffer;
public final class m0 extends c2.i {
    public int f14652i;
    public int f14653j;
    public boolean f14654k;
    public int f14655l;
    public byte[] f14656m;
    public int f14657n;
    public long f14658o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14657n) > 0) {
            j(i10).put(this.f14656m, 0, this.f14657n).flip();
            this.f14657n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14657n == 0) {
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
            int min = Math.min(i10, this.f14655l);
            this.f14658o += min / this.f4184b.d;
            this.f14655l -= min;
            byteBuffer.position(position + min);
            if (this.f14655l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14657n + i11) - this.f14656m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f14657n);
            j3.put(this.f14656m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f14657n - h;
            this.f14657n = i13;
            byte[] bArr = this.f14656m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f14656m, this.f14657n, i12);
            this.f14657n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.K(fVar.f4182c)) {
            this.f14654k = true;
            if (this.f14652i == 0 && this.f14653j == 0) {
                return c2.f.f4179e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f14654k) {
            this.f14654k = false;
            int i10 = this.f14653j;
            int i11 = this.f4184b.d;
            this.f14656m = new byte[i10 * i11];
            this.f14655l = this.f14652i * i11;
        }
        this.f14657n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f14654k) {
            if (this.f14657n > 0) {
                this.f14658o += i10 / this.f4184b.d;
            }
            this.f14657n = 0;
        }
    }

    @Override
    public final void i() {
        this.f14656m = e2.d0.f8766b;
    }
}
