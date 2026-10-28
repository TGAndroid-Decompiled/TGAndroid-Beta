package k2;

import java.nio.ByteBuffer;
public final class d1 extends c2.p {
    public int f16139i;
    public int f16140j;
    public boolean f16141k;
    public int f16142l;
    public byte[] f16143m;
    public int f16144n;
    public long f16145o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.f16144n) > 0) {
            l(i10).put(this.f16143m, 0, this.f16144n).flip();
            this.f16144n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f16142l);
            this.f16145o += min / this.f5960b.d;
            this.f16142l -= min;
            byteBuffer.position(position + min);
            if (this.f16142l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f16144n + i11) - this.f16143m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.n0.i(length, 0, this.f16144n);
            l4.put(this.f16143m, 0, i12);
            int i13 = e2.n0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f16144n - i12;
            this.f16144n = i15;
            byte[] bArr = this.f16143m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f16143m, this.f16144n, i14);
            this.f16144n += i14;
            l4.flip();
        }
    }

    @Override
    public final boolean c() {
        if (super.c() && this.f16144n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.n0.Y(this.f5960b.f5954a, this.f16140j + this.f16139i));
    }

    @Override
    public final c2.l h(c2.l lVar) {
        if (e2.n0.M(lVar.f5956c)) {
            this.f16141k = true;
            if (this.f16139i == 0 && this.f16140j == 0) {
                return c2.l.e;
            }
            return lVar;
        }
        throw new c2.n(lVar);
    }

    @Override
    public final void i() {
        if (this.f16141k) {
            this.f16141k = false;
            int i10 = this.f16140j;
            int i11 = this.f5960b.d;
            this.f16143m = new byte[i10 * i11];
            this.f16142l = this.f16139i * i11;
        }
        this.f16144n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f16141k) {
            if (this.f16144n > 0) {
                this.f16145o += i10 / this.f5960b.d;
            }
            this.f16144n = 0;
        }
    }

    @Override
    public final void k() {
        this.f16143m = e2.n0.f9692b;
    }
}
