package l3;

import java.nio.ByteBuffer;
public final class w0 extends a0 {
    public int f11380i;
    public int f11381j;
    public boolean f11382k;
    public int f11383l;
    public byte[] f11384m;
    public int f11385n;
    public long f11386o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.f11385n) > 0) {
            j(i10).put(this.f11384m, 0, this.f11385n).flip();
            this.f11385n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f11383l);
            this.f11386o += min / this.f11237b.d;
            this.f11383l -= min;
            byteBuffer.position(position + min);
            if (this.f11383l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f11385n + i11) - this.f11384m.length;
            ByteBuffer j10 = j(length);
            int h = h5.d0.h(length, 0, this.f11385n);
            j10.put(this.f11384m, 0, h);
            int h9 = h5.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h9);
            j10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h9;
            int i13 = this.f11385n - h;
            this.f11385n = i13;
            byte[] bArr = this.f11384m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f11384m, this.f11385n, i12);
            this.f11385n += i12;
            j10.flip();
        }
    }

    @Override
    public final boolean d() {
        if (super.d() && this.f11385n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final l f(l lVar) {
        if (lVar.f11306c == 2) {
            this.f11382k = true;
            if (this.f11380i == 0 && this.f11381j == 0) {
                return l.e;
            }
            return lVar;
        }
        throw new m(lVar);
    }

    @Override
    public final void g() {
        if (this.f11382k) {
            this.f11382k = false;
            int i10 = this.f11381j;
            int i11 = this.f11237b.d;
            this.f11384m = new byte[i10 * i11];
            this.f11383l = this.f11380i * i11;
        }
        this.f11385n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f11382k) {
            if (this.f11385n > 0) {
                this.f11386o += i10 / this.f11237b.d;
            }
            this.f11385n = 0;
        }
    }

    @Override
    public final void i() {
        this.f11384m = h5.d0.f6927f;
    }
}
