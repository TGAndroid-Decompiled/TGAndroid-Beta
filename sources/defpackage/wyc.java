package defpackage;

import java.io.BufferedOutputStream;
public final class wyc extends BufferedOutputStream {
    public final void a(vyc vycVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        int i5;
        int length2;
        byte[] bArr;
        if (vycVar.a) {
            i = 128;
        } else {
            i = 0;
        }
        if (vycVar.b) {
            i2 = 64;
        } else {
            i2 = 0;
        }
        int i6 = i | i2;
        if (vycVar.c) {
            i3 = 32;
        } else {
            i3 = 0;
        }
        int i7 = i6 | i3;
        if (vycVar.d) {
            i4 = 16;
        } else {
            i4 = 0;
        }
        write(i7 | i4 | (vycVar.e & 15));
        byte[] bArr2 = vycVar.g;
        if (bArr2 == null) {
            length = 0;
        } else {
            length = bArr2.length;
        }
        if (length <= 125) {
            i5 = length | 128;
        } else if (length <= 65535) {
            i5 = 254;
        } else {
            i5 = 255;
        }
        write(i5);
        byte[] bArr3 = vycVar.g;
        if (bArr3 == null) {
            length2 = 0;
        } else {
            length2 = bArr3.length;
        }
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & 255), (byte) (length2 & 255)};
            } else {
                bArr = new byte[8];
                for (int i8 = 7; i8 >= 0; i8--) {
                    bArr[i8] = (byte) (length2 & 255);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        hg7.a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = vycVar.g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i9 = 0; i9 < bArr5.length; i9++) {
            bArr6[i9] = (byte) ((bArr5[i9] ^ bArr4[i9 % 4]) & 255);
        }
        write(bArr6);
    }
}
