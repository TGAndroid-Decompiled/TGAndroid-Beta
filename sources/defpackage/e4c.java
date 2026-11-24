package defpackage;

import java.nio.ByteBuffer;
public final class e4c extends cg0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override
    public final boolean a() {
        if (super.a() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i;
        if (super.a() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.l);
            this.o += min / this.b.d;
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l > 0) {
                return;
            }
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer l = l(length);
            int i3 = hac.i(length, 0, this.n);
            l.put(this.m, 0, i3);
            int i4 = hac.i(length - i3, 0, i2);
            byteBuffer.limit(byteBuffer.position() + i4);
            l.put(byteBuffer);
            byteBuffer.limit(limit);
            int i5 = i2 - i4;
            int i6 = this.n - i3;
            this.n = i6;
            byte[] bArr = this.m;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            byteBuffer.get(this.m, this.n, i5);
            this.n += i5;
            l.flip();
        }
    }

    @Override
    public final long g(long j) {
        return Math.max(0L, j - hac.Z(this.b.a, this.j + this.i));
    }

    @Override
    public final l30 h(l30 l30Var) {
        if (hac.N(l30Var.c)) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return l30.e;
            }
            return l30Var;
        }
        throw new o30(l30Var);
    }

    @Override
    public final void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override
    public final void j() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override
    public final void k() {
        this.m = hac.b;
    }
}
