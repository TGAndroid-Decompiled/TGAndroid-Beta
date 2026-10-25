package k2;

import java.nio.ByteBuffer;
public final class d1 extends c2.p {
    public int f16140i;
    public int f16141j;
    public boolean f16142k;
    public int f16143l;
    public byte[] f16144m;
    public int f16145n;
    public long f16146o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.f16145n) > 0) {
            l(i10).put(this.f16144m, 0, this.f16145n).flip();
            this.f16145n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f16143l);
            this.f16146o += min / this.f5960b.d;
            this.f16143l -= min;
            byteBuffer.position(position + min);
            if (this.f16143l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f16145n + i11) - this.f16144m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.n0.i(length, 0, this.f16145n);
            l4.put(this.f16144m, 0, i12);
            int i13 = e2.n0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f16145n - i12;
            this.f16145n = i15;
            byte[] bArr = this.f16144m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f16144m, this.f16145n, i14);
            this.f16145n += i14;
            l4.flip();
        }
    }

    @Override
    public final boolean c() {
        if (super.c() && this.f16145n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.n0.Y(this.f5960b.f5954a, this.f16141j + this.f16140i));
    }

    @Override
    public final c2.l h(c2.l lVar) {
        if (e2.n0.M(lVar.f5956c)) {
            this.f16142k = true;
            if (this.f16140i == 0 && this.f16141j == 0) {
                return c2.l.e;
            }
            return lVar;
        }
        throw new c2.n(lVar);
    }

    @Override
    public final void i() {
        if (this.f16142k) {
            this.f16142k = false;
            int i10 = this.f16141j;
            int i11 = this.f5960b.d;
            this.f16144m = new byte[i10 * i11];
            this.f16143l = this.f16140i * i11;
        }
        this.f16145n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f16142k) {
            if (this.f16145n > 0) {
                this.f16146o += i10 / this.f5960b.d;
            }
            this.f16145n = 0;
        }
    }

    @Override
    public final void k() {
        this.f16144m = e2.n0.f9693b;
    }
}
