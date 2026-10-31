package k2;

import java.nio.ByteBuffer;
public final class f1 extends c2.n {
    public int f10650i;
    public int f10651j;
    public boolean f10652k;
    public int f10653l;
    public byte[] f10654m;
    public int f10655n;
    public long f10656o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.f10655n) > 0) {
            l(i10).put(this.f10654m, 0, this.f10655n).flip();
            this.f10655n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f10653l);
            this.f10656o += min / this.f3553b.d;
            this.f10653l -= min;
            byteBuffer.position(position + min);
            if (this.f10653l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f10655n + i11) - this.f10654m.length;
            ByteBuffer l4 = l(length);
            int i12 = e2.l0.i(length, 0, this.f10655n);
            l4.put(this.f10654m, 0, i12);
            int i13 = e2.l0.i(length - i12, 0, i11);
            byteBuffer.limit(byteBuffer.position() + i13);
            l4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i14 = i11 - i13;
            int i15 = this.f10655n - i12;
            this.f10655n = i15;
            byte[] bArr = this.f10654m;
            System.arraycopy(bArr, i12, bArr, 0, i15);
            byteBuffer.get(this.f10654m, this.f10655n, i14);
            this.f10655n += i14;
            l4.flip();
        }
    }

    @Override
    public final boolean c() {
        if (super.c() && this.f10655n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.l0.Y(this.f3553b.f3547a, this.f10651j + this.f10650i));
    }

    @Override
    public final c2.j h(c2.j jVar) {
        if (e2.l0.M(jVar.f3549c)) {
            this.f10652k = true;
            if (this.f10650i == 0 && this.f10651j == 0) {
                return c2.j.e;
            }
            return jVar;
        }
        throw new c2.l(jVar);
    }

    @Override
    public final void i() {
        if (this.f10652k) {
            this.f10652k = false;
            int i10 = this.f10651j;
            int i11 = this.f3553b.d;
            this.f10654m = new byte[i10 * i11];
            this.f10653l = this.f10650i * i11;
        }
        this.f10655n = 0;
    }

    @Override
    public final void j() {
        int i10;
        if (this.f10652k) {
            if (this.f10655n > 0) {
                this.f10656o += i10 / this.f3553b.d;
            }
            this.f10655n = 0;
        }
    }

    @Override
    public final void k() {
        this.f10654m = e2.l0.f6166b;
    }
}
