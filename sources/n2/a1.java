package n2;

import java.nio.ByteBuffer;
public final class a1 extends f2.o {
    public int f21086i;
    public int f21087j;
    public boolean f21088k;
    public int f21089l;
    public byte[] f21090m;
    public int f21091n;
    public long f21092o;

    @Override
    public final boolean a() {
        if (super.a() && this.f21091n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f21091n) > 0) {
            l(i7).put(this.f21090m, 0, this.f21091n).flip();
            this.f21091n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f21089l);
            this.f21092o += min / this.f11084b.d;
            this.f21089l -= min;
            byteBuffer.position(position + min);
            if (this.f21089l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f21091n + i10) - this.f21090m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.l0.i(length, 0, this.f21091n);
            l10.put(this.f21090m, 0, i11);
            int i12 = h2.l0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f21091n - i11;
            this.f21091n = i14;
            byte[] bArr = this.f21090m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f21090m, this.f21091n, i13);
            this.f21091n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.l0.Y(this.f11084b.f11078a, this.f21087j + this.f21086i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.l0.M(kVar.f11080c)) {
            this.f21088k = true;
            if (this.f21086i == 0 && this.f21087j == 0) {
                return f2.k.f11077e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f21088k) {
            this.f21088k = false;
            int i7 = this.f21087j;
            int i10 = this.f11084b.d;
            this.f21090m = new byte[i7 * i10];
            this.f21089l = this.f21086i * i10;
        }
        this.f21091n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f21088k) {
            if (this.f21091n > 0) {
                this.f21092o += i7 / this.f11084b.d;
            }
            this.f21091n = 0;
        }
    }

    @Override
    public final void k() {
        this.f21090m = h2.l0.f13813b;
    }
}
