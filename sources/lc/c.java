package lc;

import java.nio.ByteBuffer;
public final class c {
    public final ByteBuffer f19762a;
    public final int f19763b;
    public int f19764c;

    public c(int i7, ByteBuffer byteBuffer) {
        switch (i7) {
            case 1:
                this.f19764c = 0;
                this.f19762a = byteBuffer;
                this.f19763b = byteBuffer.position();
                return;
            default:
                this.f19762a = byteBuffer;
                this.f19763b = byteBuffer.position();
                return;
        }
    }

    public int a(int i7) {
        int a10;
        int i10 = this.f19763b;
        ByteBuffer byteBuffer = this.f19762a;
        int i11 = byteBuffer.get((this.f19764c / 8) + i10);
        if (i11 < 0) {
            i11 += 256;
        }
        int i12 = this.f19764c;
        int i13 = 8 - (i12 % 8);
        if (i7 <= i13) {
            a10 = ((i11 << (i12 % 8)) & 255) >> ((i13 - i7) + (i12 % 8));
            this.f19764c = i12 + i7;
        } else {
            int i14 = i7 - i13;
            a10 = (a(i13) << i14) + a(i14);
        }
        byteBuffer.position(i10 + ((int) Math.ceil(this.f19764c / 8.0d)));
        return a10;
    }

    public boolean b() {
        if (a(1) == 1) {
            return true;
        }
        return false;
    }

    public void c(int i7, int i10) {
        int i11 = this.f19764c;
        int i12 = 8 - (i11 % 8);
        int i13 = 1;
        int i14 = this.f19763b;
        ByteBuffer byteBuffer = this.f19762a;
        if (i10 <= i12) {
            int i15 = byteBuffer.get((i11 / 8) + i14);
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i7 << (i12 - i10));
            int i17 = (this.f19764c / 8) + i14;
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f19764c += i10;
        } else {
            int i18 = i10 - i12;
            c(i7 >> i18, i12);
            c(i7 & ((1 << i18) - 1), i18);
        }
        int i19 = this.f19764c;
        int i20 = (i19 / 8) + i14;
        if (i19 % 8 <= 0) {
            i13 = 0;
        }
        byteBuffer.position(i20 + i13);
    }
}
