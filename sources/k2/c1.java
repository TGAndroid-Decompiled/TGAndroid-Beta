package k2;

import java.nio.ByteBuffer;
public final class c1 extends c2.o {
    public int f13856i;
    public int f13857j;
    public boolean f13858k;
    public int f13859l;
    public byte[] f13860m;
    public int f13861n;
    public long f13862o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f13861n) > 0) {
            l(i10).put(this.f13860m, 0, this.f13861n).flip();
            this.f13861n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f13861n == 0) {
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
            int min = Math.min(i10, this.f13859l);
            this.f13862o += min / this.f4148b.d;
            this.f13859l -= min;
            byteBuffer.position(position + min);
            if (this.f13859l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f13861n + i11) - this.f13860m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.m0.i(length, 0, this.f13861n);
            l4.put(this.f13860m, 0, i12);
            int i13 = e2.m0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f13861n - i12;
            this.f13861n = i15;
            byte[] bArr = this.f13860m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f13860m, this.f13861n, i14);
            this.f13861n += i14;
            l4.flip();
        }
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.m0.Y(this.f4148b.f4142a, this.f13857j + this.f13856i));
    }

    @Override
    public final c2.k h(c2.k kVar) {
        if (e2.m0.M(kVar.f4144c)) {
            this.f13858k = true;
            if (this.f13856i == 0 && this.f13857j == 0) {
                return c2.k.e;
            }
            return kVar;
        }
        throw new c2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f13858k) {
            this.f13858k = false;
            int i10 = this.f13857j;
            int i11 = this.f4148b.d;
            this.f13860m = new byte[i10 * i11];
            this.f13859l = this.f13856i * i11;
        }
        this.f13861n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f13858k) {
            if (this.f13861n > 0) {
                this.f13862o += i10 / this.f4148b.d;
            }
            this.f13861n = 0;
        }
    }

    @Override
    public final void k() {
        this.f13860m = e2.m0.f8373b;
    }
}
