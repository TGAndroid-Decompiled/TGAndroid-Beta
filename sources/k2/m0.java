package k2;

import java.nio.ByteBuffer;
public final class m0 extends c2.i {
    public int f14516i;
    public int f14517j;
    public boolean f14518k;
    public int f14519l;
    public byte[] f14520m;
    public int f14521n;
    public long f14522o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14521n) > 0) {
            j(i10).put(this.f14520m, 0, this.f14521n).flip();
            this.f14521n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14521n == 0) {
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
            int min = Math.min(i10, this.f14519l);
            this.f14522o += min / this.f4012b.d;
            this.f14519l -= min;
            byteBuffer.position(position + min);
            if (this.f14519l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14521n + i11) - this.f14520m.length;
            ByteBuffer j3 = j(length);
            int h = e2.d0.h(length, 0, this.f14521n);
            j3.put(this.f14520m, 0, h);
            int h10 = e2.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f14521n - h;
            this.f14521n = i13;
            byte[] bArr = this.f14520m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f14520m, this.f14521n, i12);
            this.f14521n += i12;
            j3.flip();
        }
    }

    @Override
    public final c2.f f(c2.f fVar) {
        if (e2.d0.J(fVar.f4010c)) {
            this.f14518k = true;
            if (this.f14516i == 0 && this.f14517j == 0) {
                return c2.f.f4007e;
            }
            return fVar;
        }
        throw new c2.g(fVar);
    }

    @Override
    public final void g() {
        if (this.f14518k) {
            this.f14518k = false;
            int i10 = this.f14517j;
            int i11 = this.f4012b.d;
            this.f14520m = new byte[i10 * i11];
            this.f14519l = this.f14516i * i11;
        }
        this.f14521n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f14518k) {
            if (this.f14521n > 0) {
                this.f14522o += i10 / this.f4012b.d;
            }
            this.f14521n = 0;
        }
    }

    @Override
    public final void i() {
        this.f14520m = e2.d0.f8532b;
    }
}
