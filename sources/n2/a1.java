package n2;

import java.nio.ByteBuffer;
public final class a1 extends f2.o {
    public int f21058i;
    public int f21059j;
    public boolean f21060k;
    public int f21061l;
    public byte[] f21062m;
    public int f21063n;
    public long f21064o;

    @Override
    public final boolean a() {
        if (super.a() && this.f21063n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f21063n) > 0) {
            l(i7).put(this.f21062m, 0, this.f21063n).flip();
            this.f21063n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f21061l);
            this.f21064o += min / this.f11055b.d;
            this.f21061l -= min;
            byteBuffer.position(position + min);
            if (this.f21061l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f21063n + i10) - this.f21062m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.l0.i(length, 0, this.f21063n);
            l10.put(this.f21062m, 0, i11);
            int i12 = h2.l0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f21063n - i11;
            this.f21063n = i14;
            byte[] bArr = this.f21062m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f21062m, this.f21063n, i13);
            this.f21063n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.l0.Y(this.f11055b.f11049a, this.f21059j + this.f21058i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.l0.M(kVar.f11051c)) {
            this.f21060k = true;
            if (this.f21058i == 0 && this.f21059j == 0) {
                return f2.k.f11048e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f21060k) {
            this.f21060k = false;
            int i7 = this.f21059j;
            int i10 = this.f11055b.d;
            this.f21062m = new byte[i7 * i10];
            this.f21061l = this.f21058i * i10;
        }
        this.f21063n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f21060k) {
            if (this.f21063n > 0) {
                this.f21064o += i7 / this.f11055b.d;
            }
            this.f21063n = 0;
        }
    }

    @Override
    public final void k() {
        this.f21062m = h2.l0.f13784b;
    }
}
