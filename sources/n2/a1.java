package n2;

import java.nio.ByteBuffer;
public final class a1 extends f2.o {
    public int f21061i;
    public int f21062j;
    public boolean f21063k;
    public int f21064l;
    public byte[] f21065m;
    public int f21066n;
    public long f21067o;

    @Override
    public final boolean a() {
        if (super.a() && this.f21066n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f21066n) > 0) {
            l(i7).put(this.f21065m, 0, this.f21066n).flip();
            this.f21066n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f21064l);
            this.f21067o += min / this.f11058b.d;
            this.f21064l -= min;
            byteBuffer.position(position + min);
            if (this.f21064l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f21066n + i10) - this.f21065m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.l0.i(length, 0, this.f21066n);
            l10.put(this.f21065m, 0, i11);
            int i12 = h2.l0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f21066n - i11;
            this.f21066n = i14;
            byte[] bArr = this.f21065m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f21065m, this.f21066n, i13);
            this.f21066n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.l0.Y(this.f11058b.f11052a, this.f21062j + this.f21061i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.l0.M(kVar.f11054c)) {
            this.f21063k = true;
            if (this.f21061i == 0 && this.f21062j == 0) {
                return f2.k.f11051e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f21063k) {
            this.f21063k = false;
            int i7 = this.f21062j;
            int i10 = this.f11058b.d;
            this.f21065m = new byte[i7 * i10];
            this.f21064l = this.f21061i * i10;
        }
        this.f21066n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f21063k) {
            if (this.f21066n > 0) {
                this.f21067o += i7 / this.f11058b.d;
            }
            this.f21066n = 0;
        }
    }

    @Override
    public final void k() {
        this.f21065m = h2.l0.f13787b;
    }
}
