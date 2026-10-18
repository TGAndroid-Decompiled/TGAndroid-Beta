package k2;

import java.nio.ByteBuffer;
public final class c1 extends c2.o {
    public int f14661i;
    public int f14662j;
    public boolean f14663k;
    public int f14664l;
    public byte[] f14665m;
    public int f14666n;
    public long f14667o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14666n) > 0) {
            l(i10).put(this.f14665m, 0, this.f14666n).flip();
            this.f14666n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14666n == 0) {
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
            int min = Math.min(i10, this.f14664l);
            this.f14667o += min / this.f4523b.d;
            this.f14664l -= min;
            byteBuffer.position(position + min);
            if (this.f14664l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14666n + i11) - this.f14665m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.m0.i(length, 0, this.f14666n);
            l4.put(this.f14665m, 0, i12);
            int i13 = e2.m0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f14666n - i12;
            this.f14666n = i15;
            byte[] bArr = this.f14665m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f14665m, this.f14666n, i14);
            this.f14666n += i14;
            l4.flip();
        }
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.m0.Y(this.f4523b.f4517a, this.f14662j + this.f14661i));
    }

    @Override
    public final c2.k h(c2.k kVar) {
        if (e2.m0.M(kVar.f4519c)) {
            this.f14663k = true;
            if (this.f14661i == 0 && this.f14662j == 0) {
                return c2.k.e;
            }
            return kVar;
        }
        throw new c2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f14663k) {
            this.f14663k = false;
            int i10 = this.f14662j;
            int i11 = this.f4523b.d;
            this.f14665m = new byte[i10 * i11];
            this.f14664l = this.f14661i * i11;
        }
        this.f14666n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f14663k) {
            if (this.f14666n > 0) {
                this.f14667o += i10 / this.f4523b.d;
            }
            this.f14666n = 0;
        }
    }

    @Override
    public final void k() {
        this.f14665m = e2.m0.f8256b;
    }
}
