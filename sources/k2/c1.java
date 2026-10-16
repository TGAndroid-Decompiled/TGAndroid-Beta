package k2;

import java.nio.ByteBuffer;
public final class c1 extends c2.o {
    public int f13859i;
    public int f13860j;
    public boolean f13861k;
    public int f13862l;
    public byte[] f13863m;
    public int f13864n;
    public long f13865o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f13864n) > 0) {
            l(i10).put(this.f13863m, 0, this.f13864n).flip();
            this.f13864n = 0;
        }
        return super.a();
    }

    @Override
    public final boolean b() {
        if (super.b() && this.f13864n == 0) {
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
            int min = Math.min(i10, this.f13862l);
            this.f13865o += min / this.f4152b.d;
            this.f13862l -= min;
            byteBuffer.position(position + min);
            if (this.f13862l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f13864n + i11) - this.f13863m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.m0.i(length, 0, this.f13864n);
            l4.put(this.f13863m, 0, i12);
            int i13 = e2.m0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f13864n - i12;
            this.f13864n = i15;
            byte[] bArr = this.f13863m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f13863m, this.f13864n, i14);
            this.f13864n += i14;
            l4.flip();
        }
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.m0.Y(this.f4152b.f4146a, this.f13860j + this.f13859i));
    }

    @Override
    public final c2.k h(c2.k kVar) {
        if (e2.m0.M(kVar.f4148c)) {
            this.f13861k = true;
            if (this.f13859i == 0 && this.f13860j == 0) {
                return c2.k.e;
            }
            return kVar;
        }
        throw new c2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f13861k) {
            this.f13861k = false;
            int i10 = this.f13860j;
            int i11 = this.f4152b.d;
            this.f13863m = new byte[i10 * i11];
            this.f13862l = this.f13859i * i11;
        }
        this.f13864n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f13861k) {
            if (this.f13864n > 0) {
                this.f13865o += i10 / this.f4152b.d;
            }
            this.f13864n = 0;
        }
    }

    @Override
    public final void k() {
        this.f13863m = e2.m0.f8376b;
    }
}
