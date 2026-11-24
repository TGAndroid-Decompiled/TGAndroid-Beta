package defpackage;

import java.io.EOFException;
public final class ej5 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public ej5(in3 in3Var) {
        int R;
        byte b;
        byte b2;
        boolean z;
        boolean z2;
        a19 a19Var = (a19) in3Var.b;
        long j = a19Var.b;
        ai4 ai4Var = (ai4) in3Var.d;
        h61 h61Var = (h61) ai4Var.b;
        int i = ((gj5) in3Var.c).a;
        byte b3 = 2;
        if (i == 2) {
            byte[] bArr = new byte[3];
            int i2 = 0;
            while (i2 < 3) {
                int read = h61Var.read(bArr, i2, 3 - i2);
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
                int read2 = h61Var.read(bArr2, i3, 4 - i3);
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
            R = ((ai4Var.K() & 255) << 16) | ((ai4Var.K() & 255) << 8) | (ai4Var.K() & 255);
            this.c = R;
        } else if (i == 3) {
            R = ai4Var.P();
            this.c = R;
        } else {
            R = ai4Var.R();
            this.c = R;
        }
        if (i > 2) {
            ai4Var.K();
            byte K = ai4Var.K();
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
            if ((b4 & K) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if ((b3 & K) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.d = z2;
            boolean z3 = (b5 & K) != 0;
            this.f = z3;
            if (i == 3) {
                if (z) {
                    this.g = ai4Var.P();
                    R -= 4;
                    this.c = R;
                }
                if (z3) {
                    ai4Var.K();
                    R--;
                    this.c = R;
                }
                if ((K & b) != 0) {
                    ai4Var.K();
                    this.c = R - 1;
                }
            } else {
                if ((b & K) != 0) {
                    ai4Var.K();
                    R--;
                    this.c = R;
                }
                if (z3) {
                    ai4Var.K();
                    R--;
                    this.c = R;
                }
                if ((K & b2) != 0) {
                    this.g = ai4Var.R();
                    this.c = R - 4;
                }
            }
        }
        this.b = (int) (a19Var.b - j);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", ej5.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
