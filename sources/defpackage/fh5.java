package defpackage;

import java.io.EOFException;
public final class fh5 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public fh5(xl3 xl3Var) {
        int c0;
        byte b;
        byte b2;
        boolean z;
        boolean z2;
        zy8 zy8Var = (zy8) xl3Var.b;
        long j = zy8Var.b;
        z24 z24Var = (z24) xl3Var.d;
        a51 a51Var = (a51) z24Var.b;
        int i = ((hh5) xl3Var.c).a;
        byte b3 = 2;
        if (i == 2) {
            byte[] bArr = new byte[3];
            int i2 = 0;
            while (i2 < 3) {
                int read = a51Var.read(bArr, i2, 3 - i2);
                if (read > 0) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            byte[] bArr2 = new byte[4];
            int i3 = 0;
            while (i3 < 4) {
                int read2 = a51Var.read(bArr2, i3, 4 - i3);
                if (read2 > 0) {
                    i3 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b4 = 8;
        if (i == 2) {
            c0 = ((z24Var.Z() & 255) << 16) | ((z24Var.Z() & 255) << 8) | (z24Var.Z() & 255);
            this.c = c0;
        } else if (i == 3) {
            c0 = z24Var.a0();
            this.c = c0;
        } else {
            c0 = z24Var.c0();
            this.c = c0;
        }
        if (i > 2) {
            z24Var.Z();
            byte Z = z24Var.Z();
            byte b5 = 64;
            if (i == 3) {
                b4 = 128;
                b2 = 0;
                b = 32;
                b3 = 0;
            } else {
                b = 64;
                b2 = 1;
                b5 = 4;
            }
            if ((b4 & Z) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if ((b3 & Z) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.d = z2;
            boolean z3 = (b5 & Z) != 0;
            this.f = z3;
            if (i == 3) {
                if (z) {
                    this.g = z24Var.a0();
                    c0 -= 4;
                    this.c = c0;
                }
                if (z3) {
                    z24Var.Z();
                    c0--;
                    this.c = c0;
                }
                if ((Z & b) != 0) {
                    z24Var.Z();
                    this.c = c0 - 1;
                }
            } else {
                if ((b & Z) != 0) {
                    z24Var.Z();
                    c0--;
                    this.c = c0;
                }
                if (z3) {
                    z24Var.Z();
                    c0--;
                    this.c = c0;
                }
                if ((Z & b2) != 0) {
                    this.g = z24Var.c0();
                    this.c = c0 - 4;
                }
            }
        }
        this.b = (int) (zy8Var.b - j);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", fh5.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
