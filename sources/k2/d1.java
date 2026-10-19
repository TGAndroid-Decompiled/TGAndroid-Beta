package k2;

import java.nio.ByteBuffer;
public final class d1 extends c2.o {
    public int f14665i;
    public int f14666j;
    public boolean f14667k;
    public int f14668l;
    public byte[] f14669m;
    public int f14670n;
    public long f14671o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14670n) > 0) {
            l(i10).put(this.f14669m, 0, this.f14670n).flip();
            this.f14670n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14670n == 0) {
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
            int min = Math.min(i10, this.f14668l);
            this.f14671o += min / this.f4519b.d;
            this.f14668l -= min;
            byteBuffer.position(position + min);
            if (this.f14668l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14670n + i11) - this.f14669m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.m0.i(length, 0, this.f14670n);
            l4.put(this.f14669m, 0, i12);
            int i13 = e2.m0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f14670n - i12;
            this.f14670n = i15;
            byte[] bArr = this.f14669m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f14669m, this.f14670n, i14);
            this.f14670n += i14;
            l4.flip();
        }
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.m0.Y(this.f4519b.f4513a, this.f14666j + this.f14665i));
    }

    @Override
    public final c2.k h(c2.k kVar) {
        if (e2.m0.M(kVar.f4515c)) {
            this.f14667k = true;
            if (this.f14665i == 0 && this.f14666j == 0) {
                return c2.k.e;
            }
            return kVar;
        }
        throw new c2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f14667k) {
            this.f14667k = false;
            int i10 = this.f14666j;
            int i11 = this.f4519b.d;
            this.f14669m = new byte[i10 * i11];
            this.f14668l = this.f14665i * i11;
        }
        this.f14670n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f14667k) {
            if (this.f14670n > 0) {
                this.f14671o += i10 / this.f4519b.d;
            }
            this.f14670n = 0;
        }
    }

    @Override
    public final void k() {
        this.f14669m = e2.m0.f8253b;
    }
}
