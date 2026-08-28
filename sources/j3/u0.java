package j3;

import java.nio.ByteBuffer;
public final class u0 extends x {
    public int f13360i;
    public int f13361j;
    public boolean f13362k;
    public int f13363l;
    public byte[] f13364m;
    public int f13365n;
    public long f13366o;

    @Override
    public final ByteBuffer a() {
        int i9;
        if (super.d() && (i9 = this.f13365n) > 0) {
            j(i9).put(this.f13364m, 0, this.f13365n).flip();
            this.f13365n = 0;
        }
        return super.a();
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        if (i9 != 0) {
            int min = Math.min(i9, this.f13363l);
            this.f13366o += min / this.f13390b.d;
            this.f13363l -= min;
            byteBuffer.position(position + min);
            if (this.f13363l > 0) {
                return;
            }
            int i10 = i9 - min;
            int length = (this.f13365n + i10) - this.f13364m.length;
            ByteBuffer j10 = j(length);
            int h = d5.f0.h(length, 0, this.f13365n);
            j10.put(this.f13364m, 0, h);
            int h10 = d5.f0.h(length - h, 0, i10);
            byteBuffer.limit(byteBuffer.position() + h10);
            j10.put(byteBuffer);
            byteBuffer.limit(limit);
            int i11 = i10 - h10;
            int i12 = this.f13365n - h;
            this.f13365n = i12;
            byte[] bArr = this.f13364m;
            System.arraycopy(bArr, h, bArr, 0, i12);
            byteBuffer.get(this.f13364m, this.f13365n, i11);
            this.f13365n += i11;
            j10.flip();
        }
    }

    @Override
    public final boolean d() {
        if (super.d() && this.f13365n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final h f(h hVar) {
        if (hVar.f13249c == 2) {
            this.f13362k = true;
            if (this.f13360i == 0 && this.f13361j == 0) {
                return h.f13246e;
            }
            return hVar;
        }
        throw new i(hVar);
    }

    @Override
    public final void g() {
        if (this.f13362k) {
            this.f13362k = false;
            int i9 = this.f13361j;
            int i10 = this.f13390b.d;
            this.f13364m = new byte[i9 * i10];
            this.f13363l = this.f13360i * i10;
        }
        this.f13365n = 0;
    }

    @Override
    public final void h() {
        int i9;
        if (this.f13362k) {
            if (this.f13365n > 0) {
                this.f13366o += i9 / this.f13390b.d;
            }
            this.f13365n = 0;
        }
    }

    @Override
    public final void i() {
        this.f13364m = d5.f0.f4353f;
    }
}
