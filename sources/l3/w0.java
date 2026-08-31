package l3;

import java.nio.ByteBuffer;
public final class w0 extends a0 {
    public int f11641i;
    public int f11642j;
    public boolean f11643k;
    public int f11644l;
    public byte[] f11645m;
    public int f11646n;
    public long f11647o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.f11646n) > 0) {
            j(i10).put(this.f11645m, 0, this.f11646n).flip();
            this.f11646n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f11644l);
            this.f11647o += min / this.f11487b.d;
            this.f11644l -= min;
            byteBuffer.position(position + min);
            if (this.f11644l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f11646n + i11) - this.f11645m.length;
            ByteBuffer j10 = j(length);
            int h = h5.d0.h(length, 0, this.f11646n);
            j10.put(this.f11645m, 0, h);
            int h9 = h5.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h9);
            j10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h9;
            int i13 = this.f11646n - h;
            this.f11646n = i13;
            byte[] bArr = this.f11645m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f11645m, this.f11646n, i12);
            this.f11646n += i12;
            j10.flip();
        }
    }

    @Override
    public final boolean d() {
        if (super.d() && this.f11646n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final l f(l lVar) {
        if (lVar.f11562c == 2) {
            this.f11643k = true;
            if (this.f11641i == 0 && this.f11642j == 0) {
                return l.f11559e;
            }
            return lVar;
        }
        throw new m(lVar);
    }

    @Override
    public final void g() {
        if (this.f11643k) {
            this.f11643k = false;
            int i10 = this.f11642j;
            int i11 = this.f11487b.d;
            this.f11645m = new byte[i10 * i11];
            this.f11644l = this.f11641i * i11;
        }
        this.f11646n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f11643k) {
            if (this.f11646n > 0) {
                this.f11647o += i10 / this.f11487b.d;
            }
            this.f11646n = 0;
        }
    }

    @Override
    public final void i() {
        this.f11645m = h5.d0.f7241f;
    }
}
