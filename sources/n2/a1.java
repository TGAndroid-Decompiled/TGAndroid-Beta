package n2;

import java.nio.ByteBuffer;
public final class a1 extends f2.n {
    public int f20697i;
    public int f20698j;
    public boolean f20699k;
    public int f20700l;
    public byte[] f20701m;
    public int f20702n;
    public long f20703o;

    @Override
    public final boolean a() {
        if (super.a() && this.f20702n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f20702n) > 0) {
            l(i7).put(this.f20701m, 0, this.f20702n).flip();
            this.f20702n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f20700l);
            this.f20703o += min / this.f10736b.d;
            this.f20700l -= min;
            byteBuffer.position(position + min);
            if (this.f20700l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f20702n + i10) - this.f20701m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.l0.i(length, 0, this.f20702n);
            l10.put(this.f20701m, 0, i11);
            int i12 = h2.l0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f20702n - i11;
            this.f20702n = i14;
            byte[] bArr = this.f20701m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f20701m, this.f20702n, i13);
            this.f20702n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.l0.Y(this.f10736b.f10730a, this.f20698j + this.f20697i));
    }

    @Override
    public final f2.j h(f2.j jVar) {
        if (h2.l0.M(jVar.f10732c)) {
            this.f20699k = true;
            if (this.f20697i == 0 && this.f20698j == 0) {
                return f2.j.f10729e;
            }
            return jVar;
        }
        throw new f2.l(jVar);
    }

    @Override
    public final void i() {
        if (this.f20699k) {
            this.f20699k = false;
            int i7 = this.f20698j;
            int i10 = this.f10736b.d;
            this.f20701m = new byte[i7 * i10];
            this.f20700l = this.f20697i * i10;
        }
        this.f20702n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f20699k) {
            if (this.f20702n > 0) {
                this.f20703o += i7 / this.f10736b.d;
            }
            this.f20702n = 0;
        }
    }

    @Override
    public final void k() {
        this.f20701m = h2.l0.f13472b;
    }
}
