package n2;

import java.nio.ByteBuffer;
public final class z0 extends f2.o {
    public int f20355i;
    public int f20356j;
    public boolean f20357k;
    public int f20358l;
    public byte[] f20359m;
    public int f20360n;
    public long f20361o;

    @Override
    public final boolean a() {
        if (super.a() && this.f20360n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f20360n) > 0) {
            l(i7).put(this.f20359m, 0, this.f20360n).flip();
            this.f20360n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f20358l);
            this.f20361o += min / this.f10923b.d;
            this.f20358l -= min;
            byteBuffer.position(position + min);
            if (this.f20358l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f20360n + i10) - this.f20359m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.m0.i(length, 0, this.f20360n);
            l10.put(this.f20359m, 0, i11);
            int i12 = h2.m0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f20360n - i11;
            this.f20360n = i14;
            byte[] bArr = this.f20359m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f20359m, this.f20360n, i13);
            this.f20360n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.m0.Y(this.f10923b.f10917a, this.f20356j + this.f20355i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.m0.M(kVar.f10919c)) {
            this.f20357k = true;
            if (this.f20355i == 0 && this.f20356j == 0) {
                return f2.k.f10916e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f20357k) {
            this.f20357k = false;
            int i7 = this.f20356j;
            int i10 = this.f10923b.d;
            this.f20359m = new byte[i7 * i10];
            this.f20358l = this.f20355i * i10;
        }
        this.f20360n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f20357k) {
            if (this.f20360n > 0) {
                this.f20361o += i7 / this.f10923b.d;
            }
            this.f20360n = 0;
        }
    }

    @Override
    public final void k() {
        this.f20359m = h2.m0.f14113b;
    }
}
