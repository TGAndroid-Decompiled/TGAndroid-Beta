package n2;

import java.nio.ByteBuffer;
public final class a1 extends f2.o {
    public int f21089i;
    public int f21090j;
    public boolean f21091k;
    public int f21092l;
    public byte[] f21093m;
    public int f21094n;
    public long f21095o;

    @Override
    public final boolean a() {
        if (super.a() && this.f21094n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f21094n) > 0) {
            l(i7).put(this.f21093m, 0, this.f21094n).flip();
            this.f21094n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f21092l);
            this.f21095o += min / this.f11087b.d;
            this.f21092l -= min;
            byteBuffer.position(position + min);
            if (this.f21092l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f21094n + i10) - this.f21093m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.l0.i(length, 0, this.f21094n);
            l10.put(this.f21093m, 0, i11);
            int i12 = h2.l0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f21094n - i11;
            this.f21094n = i14;
            byte[] bArr = this.f21093m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f21093m, this.f21094n, i13);
            this.f21094n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.l0.Y(this.f11087b.f11081a, this.f21090j + this.f21089i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.l0.M(kVar.f11083c)) {
            this.f21091k = true;
            if (this.f21089i == 0 && this.f21090j == 0) {
                return f2.k.f11080e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f21091k) {
            this.f21091k = false;
            int i7 = this.f21090j;
            int i10 = this.f11087b.d;
            this.f21093m = new byte[i7 * i10];
            this.f21092l = this.f21089i * i10;
        }
        this.f21094n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f21091k) {
            if (this.f21094n > 0) {
                this.f21095o += i7 / this.f11087b.d;
            }
            this.f21094n = 0;
        }
    }

    @Override
    public final void k() {
        this.f21093m = h2.l0.f13816b;
    }
}
