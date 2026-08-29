package l3;

import java.nio.ByteBuffer;
public final class v0 extends y {
    public int f14219i;
    public int f14220j;
    public boolean f14221k;
    public int f14222l;
    public byte[] f14223m;
    public int f14224n;
    public long f14225o;

    @Override
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.f14224n) > 0) {
            j(i10).put(this.f14223m, 0, this.f14224n).flip();
            this.f14224n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f14222l);
            this.f14225o += min / this.f14249b.d;
            this.f14222l -= min;
            byteBuffer.position(position + min);
            if (this.f14222l > 0) {
                return;
            }
            int i11 = i10 - min;
            int length = (this.f14224n + i11) - this.f14223m.length;
            ByteBuffer j10 = j(length);
            int h = f5.d0.h(length, 0, this.f14224n);
            j10.put(this.f14223m, 0, h);
            int h10 = f5.d0.h(length - h, 0, i11);
            byteBuffer.limit(byteBuffer.position() + h10);
            j10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i12 = i11 - h10;
            int i13 = this.f14224n - h;
            this.f14224n = i13;
            byte[] bArr = this.f14223m;
            System.arraycopy(bArr, h, bArr, 0, i13);
            byteBuffer.get(this.f14223m, this.f14224n, i12);
            this.f14224n += i12;
            j10.flip();
        }
    }

    @Override
    public final boolean d() {
        if (super.d() && this.f14224n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final h f(h hVar) {
        if (hVar.f14101c == 2) {
            this.f14221k = true;
            if (this.f14219i == 0 && this.f14220j == 0) {
                return h.f14098e;
            }
            return hVar;
        }
        throw new i(hVar);
    }

    @Override
    public final void g() {
        if (this.f14221k) {
            this.f14221k = false;
            int i10 = this.f14220j;
            int i11 = this.f14249b.d;
            this.f14223m = new byte[i10 * i11];
            this.f14222l = this.f14219i * i11;
        }
        this.f14224n = 0;
    }

    @Override
    public final void h() {
        int i10;
        if (this.f14221k) {
            if (this.f14224n > 0) {
                this.f14225o += i10 / this.f14249b.d;
            }
            this.f14224n = 0;
        }
    }

    @Override
    public final void i() {
        this.f14223m = f5.d0.f6583f;
    }
}
