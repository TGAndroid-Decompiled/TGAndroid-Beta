package n2;

import java.nio.ByteBuffer;
public final class a1 extends f2.o {
    public int f21055i;
    public int f21056j;
    public boolean f21057k;
    public int f21058l;
    public byte[] f21059m;
    public int f21060n;
    public long f21061o;

    @Override
    public final boolean a() {
        if (super.a() && this.f21060n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f21060n) > 0) {
            l(i7).put(this.f21059m, 0, this.f21060n).flip();
            this.f21060n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f21058l);
            this.f21061o += min / this.f11050b.d;
            this.f21058l -= min;
            byteBuffer.position(position + min);
            if (this.f21058l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f21060n + i10) - this.f21059m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.l0.i(length, 0, this.f21060n);
            l10.put(this.f21059m, 0, i11);
            int i12 = h2.l0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f21060n - i11;
            this.f21060n = i14;
            byte[] bArr = this.f21059m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f21059m, this.f21060n, i13);
            this.f21060n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.l0.Y(this.f11050b.f11044a, this.f21056j + this.f21055i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.l0.M(kVar.f11046c)) {
            this.f21057k = true;
            if (this.f21055i == 0 && this.f21056j == 0) {
                return f2.k.f11043e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f21057k) {
            this.f21057k = false;
            int i7 = this.f21056j;
            int i10 = this.f11050b.d;
            this.f21059m = new byte[i7 * i10];
            this.f21058l = this.f21055i * i10;
        }
        this.f21060n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f21057k) {
            if (this.f21060n > 0) {
                this.f21061o += i7 / this.f11050b.d;
            }
            this.f21060n = 0;
        }
    }

    @Override
    public final void k() {
        this.f21059m = h2.l0.f13779b;
    }
}
