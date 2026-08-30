package l3;

import java.nio.ByteBuffer;
public final class w0 extends a0 {
    public int f11270i;
    public int f11271j;
    public boolean f11272k;
    public int f11273l;
    public byte[] f11274m;
    public int f11275n;
    public long f11276o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.f11275n) > 0) {
            j(i10).put(this.f11274m, 0, this.f11275n).flip();
            this.f11275n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f11273l);
            this.f11276o += min / this.f11127b.d;
            this.f11273l -= min;
            byteBuffer.position(position + min);
            if (this.f11273l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f11275n + i11) - this.f11274m.length;
            ByteBuffer j10 = j(length);
            int h = h5.d0.h(length, 0, this.f11275n);
            j10.put(this.f11274m, 0, h);
            int h9 = h5.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h9);
            j10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h9;
            int i13 = this.f11275n - h;
            this.f11275n = i13;
            byte[] bArr = this.f11274m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f11274m, this.f11275n, i12);
            this.f11275n += i12;
            j10.flip();
        }
    }

    @Override
    public final boolean d() {
        if (super.d() && this.f11275n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final l f(l lVar) {
        if (lVar.f11196c == 2) {
            this.f11272k = true;
            if (this.f11270i == 0 && this.f11271j == 0) {
                return l.e;
            }
            return lVar;
        }
        throw new m(lVar);
    }

    @Override
    public final void g() {
        if (this.f11272k) {
            this.f11272k = false;
            int i10 = this.f11271j;
            int i11 = this.f11127b.d;
            this.f11274m = new byte[i10 * i11];
            this.f11273l = this.f11270i * i11;
        }
        this.f11275n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f11272k) {
            if (this.f11275n > 0) {
                this.f11276o += i10 / this.f11127b.d;
            }
            this.f11275n = 0;
        }
    }

    @Override
    public final void i() {
        this.f11274m = h5.d0.f6940f;
    }
}
