package k2;

import java.nio.ByteBuffer;
public final class m0 extends c2.i {
    public int f14513i;
    public int f14514j;
    public boolean f14515k;
    public int f14516l;
    public byte[] f14517m;
    public int f14518n;
    public long f14519o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14518n) > 0) {
            j(i10).put(this.f14517m, 0, this.f14518n).flip();
            this.f14518n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14518n == 0) {
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
            int min = Math.min(i10, this.f14516l);
            this.f14519o += min / this.f4011b.d;
            this.f14516l -= min;
            byteBuffer.position(position + min);
            if (this.f14516l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14518n + i11) - this.f14517m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f14518n);
            j3.put(this.f14517m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f14518n - h;
            this.f14518n = i13;
            byte[] bArr = this.f14517m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f14517m, this.f14518n, i12);
            this.f14518n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.J(fVar.f4009c)) {
            this.f14515k = true;
            if (this.f14513i == 0 && this.f14514j == 0) {
                return c2.f.f4006e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f14515k) {
            this.f14515k = false;
            int i10 = this.f14514j;
            int i11 = this.f4011b.d;
            this.f14517m = new byte[i10 * i11];
            this.f14516l = this.f14513i * i11;
        }
        this.f14518n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f14515k) {
            if (this.f14518n > 0) {
                this.f14519o += i10 / this.f4011b.d;
            }
            this.f14518n = 0;
        }
    }

    @Override
    public final void i() {
        this.f14517m = e2.d0.f8530b;
    }
}
