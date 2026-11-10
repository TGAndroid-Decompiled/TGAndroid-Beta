package n2;

import java.nio.ByteBuffer;
public final class z0 extends f2.o {
    public int f20360i;
    public int f20361j;
    public boolean f20362k;
    public int f20363l;
    public byte[] f20364m;
    public int f20365n;
    public long f20366o;

    @Override
    public final boolean a() {
        if (super.a() && this.f20365n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f20365n) > 0) {
            l(i7).put(this.f20364m, 0, this.f20365n).flip();
            this.f20365n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f20363l);
            this.f20366o += min / this.f10928b.d;
            this.f20363l -= min;
            byteBuffer.position(position + min);
            if (this.f20363l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f20365n + i10) - this.f20364m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.m0.i(length, 0, this.f20365n);
            l10.put(this.f20364m, 0, i11);
            int i12 = h2.m0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f20365n - i11;
            this.f20365n = i14;
            byte[] bArr = this.f20364m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f20364m, this.f20365n, i13);
            this.f20365n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.m0.Y(this.f10928b.f10922a, this.f20361j + this.f20360i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.m0.M(kVar.f10924c)) {
            this.f20362k = true;
            if (this.f20360i == 0 && this.f20361j == 0) {
                return f2.k.f10921e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f20362k) {
            this.f20362k = false;
            int i7 = this.f20361j;
            int i10 = this.f10928b.d;
            this.f20364m = new byte[i7 * i10];
            this.f20363l = this.f20360i * i10;
        }
        this.f20365n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f20362k) {
            if (this.f20365n > 0) {
                this.f20366o += i7 / this.f10928b.d;
            }
            this.f20365n = 0;
        }
    }

    @Override
    public final void k() {
        this.f20364m = h2.m0.f14115b;
    }
}
