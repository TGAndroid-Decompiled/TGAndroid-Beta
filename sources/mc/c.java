package mc;

import java.nio.ByteBuffer;
public final class c {
    public final ByteBuffer f16168a;
    public final int f16169b;
    public int f16170c;

    public c(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 1:
                this.f16170c = 0;
                this.f16168a = byteBuffer;
                this.f16169b = byteBuffer.position();
                return;
            default:
                this.f16168a = byteBuffer;
                this.f16169b = byteBuffer.position();
                return;
        }
    }

    public int a(int i10) {
        int a2;
        int i11 = this.f16169b;
        ByteBuffer byteBuffer = this.f16168a;
        int i12 = byteBuffer.get((this.f16170c / 8) + i11);
        if (i12 < 0) {
            i12 += 256;
        }
        int i13 = this.f16170c;
        int i14 = 8 - (i13 % 8);
        if (i10 <= i14) {
            a2 = ((i12 << (i13 % 8)) & 255) >> ((i14 - i10) + (i13 % 8));
            this.f16170c = i13 + i10;
        } else {
            int i15 = i10 - i14;
            a2 = (a(i14) << i15) + a(i15);
        }
        byteBuffer.position(i11 + ((int) Math.ceil(this.f16170c / 8.0d)));
        return a2;
    }

    public boolean b() {
        if (a(1) == 1) {
            return true;
        }
        return false;
    }

    public void c(int i10, int i11) {
        int i12 = this.f16170c;
        int i13 = 8 - (i12 % 8);
        int i14 = 1;
        int i15 = this.f16169b;
        ByteBuffer byteBuffer = this.f16168a;
        if (i11 <= i13) {
            int i16 = byteBuffer.get((i12 / 8) + i15);
            if (i16 < 0) {
                i16 += 256;
            }
            int i17 = i16 + (i10 << (i13 - i11));
            int i18 = (this.f16170c / 8) + i15;
            if (i17 > 127) {
                i17 -= 256;
            }
            byteBuffer.put(i18, (byte) i17);
            this.f16170c += i11;
        } else {
            int i19 = i11 - i13;
            c(i10 >> i19, i13);
            c(i10 & ((1 << i19) - 1), i19);
        }
        int i20 = this.f16170c;
        int i21 = (i20 / 8) + i15;
        if (i20 % 8 <= 0) {
            i14 = 0;
        }
        byteBuffer.position(i21 + i14);
    }
}
