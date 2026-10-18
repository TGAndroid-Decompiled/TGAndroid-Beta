package k2;

import java.nio.ByteBuffer;
public final class c1 extends c2.o {
    public int f14659i;
    public int f14660j;
    public boolean f14661k;
    public int f14662l;
    public byte[] f14663m;
    public int f14664n;
    public long f14665o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f14664n) > 0) {
            l(i10).put(this.f14663m, 0, this.f14664n).flip();
            this.f14664n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f14664n == 0) {
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
            int min = Math.min(i10, this.f14662l);
            this.f14665o += min / this.f4523b.d;
            this.f14662l -= min;
            byteBuffer.position(position + min);
            if (this.f14662l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14664n + i11) - this.f14663m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.m0.i(length, 0, this.f14664n);
            l4.put(this.f14663m, 0, i12);
            int i13 = e2.m0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f14664n - i12;
            this.f14664n = i15;
            byte[] bArr = this.f14663m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f14663m, this.f14664n, i14);
            this.f14664n += i14;
            l4.flip();
        }
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.m0.Y(this.f4523b.f4517a, this.f14660j + this.f14659i));
    }

    @Override
    public final c2.k h(c2.k kVar) {
        if (e2.m0.M(kVar.f4519c)) {
            this.f14661k = true;
            if (this.f14659i == 0 && this.f14660j == 0) {
                return c2.k.e;
            }
            return kVar;
        }
        throw new c2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f14661k) {
            this.f14661k = false;
            int i10 = this.f14660j;
            int i11 = this.f4523b.d;
            this.f14663m = new byte[i10 * i11];
            this.f14662l = this.f14659i * i11;
        }
        this.f14664n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f14661k) {
            if (this.f14664n > 0) {
                this.f14665o += i10 / this.f4523b.d;
            }
            this.f14664n = 0;
        }
    }

    @Override
    public final void k() {
        this.f14663m = e2.m0.f8254b;
    }
}
