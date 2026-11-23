package n2;

import java.nio.ByteBuffer;
public final class b1 extends f2.o {
    public int f21159i;
    public int f21160j;
    public boolean f21161k;
    public int f21162l;
    public byte[] f21163m;
    public int f21164n;
    public long f21165o;

    @Override
    public final boolean a() {
        if (super.a() && this.f21164n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.f21164n) > 0) {
            l(i7).put(this.f21163m, 0, this.f21164n).flip();
            this.f21164n = 0;
        }
        return super.b();
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 != 0) {
            int min = Math.min(i7, this.f21162l);
            this.f21165o += min / this.f11048b.d;
            this.f21162l -= min;
            byteBuffer.position(position + min);
            if (this.f21162l > 0) {
                return;
            }
            int i10 = i7 - min;
            int length = (this.f21164n + i10) - this.f21163m.length;
            ByteBuffer l10 = l(length);
            int i11 = h2.l0.i(length, 0, this.f21164n);
            l10.put(this.f21163m, 0, i11);
            int i12 = h2.l0.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            l10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f21164n - i11;
            this.f21164n = i14;
            byte[] bArr = this.f21163m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f21163m, this.f21164n, i13);
            this.f21164n += i13;
            l10.flip();
        }
    }

    @Override
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.l0.Y(this.f11048b.f11042a, this.f21160j + this.f21159i));
    }

    @Override
    public final f2.k h(f2.k kVar) {
        if (h2.l0.M(kVar.f11044c)) {
            this.f21161k = true;
            if (this.f21159i == 0 && this.f21160j == 0) {
                return f2.k.f11041e;
            }
            return kVar;
        }
        throw new f2.m(kVar);
    }

    @Override
    public final void i() {
        if (this.f21161k) {
            this.f21161k = false;
            int i7 = this.f21160j;
            int i10 = this.f11048b.d;
            this.f21163m = new byte[i7 * i10];
            this.f21162l = this.f21159i * i10;
        }
        this.f21164n = 0;
    }

    @Override
    public final void j() {
        int i7;
        if (this.f21161k) {
            if (this.f21164n > 0) {
                this.f21165o += i7 / this.f11048b.d;
            }
            this.f21164n = 0;
        }
    }

    @Override
    public final void k() {
        this.f21163m = h2.l0.f13779b;
    }
}
