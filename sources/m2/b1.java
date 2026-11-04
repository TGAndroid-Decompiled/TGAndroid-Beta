package m2;

import java.nio.ByteBuffer;
public final class b1 extends e2.n {
    public int f18830i;
    public int f18831j;
    public boolean f18832k;
    public int f18833l;
    public byte[] f18834m;
    public int f18835n;
    public long f18836o;

    @Override
    public final boolean a() {
        if (super.a() && this.f18835n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i3;
        if (super.a() && (i3 = this.f18835n) > 0) {
            l(i3).put(this.f18834m, 0, this.f18835n).flip();
            this.f18835n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        if (i3 != 0) {
            int min = Math.min(i3, this.f18833l);
            this.f18836o += min / this.f9359b.d;
            this.f18833l -= min;
            byteBuffer.position(position + min);
            if (this.f18833l > 0) {
                return;
            }
            int i10 = i3 - min;
            int length = (this.f18835n + i10) - this.f18834m.length;
            ByteBuffer l10 = l(length);
            int i11 = g2.n0.i(length, 0, this.f18835n);
            l10.put(this.f18834m, 0, i11);
            int i12 = g2.n0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f18835n - i11;
            this.f18835n = i14;
            byte[] bArr = this.f18834m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f18834m, this.f18835n, i13);
            this.f18835n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j10) {
        return Math.max(0L, j10 - g2.n0.Y(this.f9359b.f9353a, this.f18831j + this.f18830i));
    }

    @Override
    public final e2.j h(e2.j jVar) {
        if (g2.n0.M(jVar.f9355c)) {
            this.f18832k = true;
            if (this.f18830i == 0 && this.f18831j == 0) {
                return e2.j.f9352e;
            }
            return jVar;
        }
        throw new e2.l(jVar);
    }

    @Override
    public final void i() {
        if (this.f18832k) {
            this.f18832k = false;
            int i3 = this.f18831j;
            int i10 = this.f9359b.d;
            this.f18834m = new byte[i3 * i10];
            this.f18833l = this.f18830i * i10;
        }
        this.f18835n = 0;
    }

    @Override
    public final void j() {
        int i3;
        if (this.f18832k) {
            if (this.f18835n > 0) {
                this.f18836o += i3 / this.f9359b.d;
            }
            this.f18835n = 0;
        }
    }

    @Override
    public final void k() {
        this.f18834m = g2.n0.f11874b;
    }
}
