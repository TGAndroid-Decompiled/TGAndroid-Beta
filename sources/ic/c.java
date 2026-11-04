package ic;

import java.nio.ByteBuffer;
public final class c {
    public final ByteBuffer f14740a;
    public final int f14741b;
    public int f14742c;

    public c(int i3, ByteBuffer byteBuffer) {
        switch (i3) {
            case 1:
                this.f14742c = 0;
                this.f14740a = byteBuffer;
                this.f14741b = byteBuffer.position();
                return;
            default:
                this.f14740a = byteBuffer;
                this.f14741b = byteBuffer.position();
                return;
        }
    }

    public int a(int i3) {
        int a10;
        int i10 = this.f14741b;
        ByteBuffer byteBuffer = this.f14740a;
        int i11 = byteBuffer.get((this.f14742c / 8) + i10);
        if (i11 < 0) {
            i11 += 256;
        }
        int i12 = this.f14742c;
        int i13 = 8 - (i12 % 8);
        if (i3 <= i13) {
            a10 = ((i11 << (i12 % 8)) & 255) >> ((i13 - i3) + (i12 % 8));
            this.f14742c = i12 + i3;
        } else {
            int i14 = i3 - i13;
            a10 = (a(i13) << i14) + a(i14);
        }
        byteBuffer.position(i10 + ((int) Math.ceil(this.f14742c / 8.0d)));
        return a10;
    }

    public boolean b() {
        if (a(1) == 1) {
            return true;
        }
        return false;
    }

    public void c(int i3, int i10) {
        int i11 = this.f14742c;
        int i12 = 8 - (i11 % 8);
        int i13 = 1;
        int i14 = this.f14741b;
        ByteBuffer byteBuffer = this.f14740a;
        if (i10 <= i12) {
            int i15 = byteBuffer.get((i11 / 8) + i14);
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i3 << (i12 - i10));
            int i17 = (this.f14742c / 8) + i14;
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f14742c += i10;
        } else {
            int i18 = i10 - i12;
            c(i3 >> i18, i12);
            c(i3 & ((1 << i18) - 1), i18);
        }
        int i19 = this.f14742c;
        int i20 = (i19 / 8) + i14;
        if (i19 % 8 <= 0) {
            i13 = 0;
        }
        byteBuffer.position(i20 + i13);
    }
}
