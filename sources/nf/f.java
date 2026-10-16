package nf;

import java.io.EOFException;
import ji.h5;
import m.h3;
public final class f {
    public final String f16041a;
    public final int f16042b;
    public final int f16043c;
    public final boolean d;
    public final boolean e;
    public final boolean f16044f;
    public final int f16045g;

    public f(h3 h3Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        of.a aVar = (of.a) h3Var.f14850b;
        long j10 = aVar.f6172b;
        h5 h5Var = (h5) h3Var.d;
        h hVar = (h) h3Var.f14851c;
        int i10 = hVar.f16048a;
        int i11 = hVar.f16048a;
        byte b12 = 2;
        if (i10 == 2) {
            h5Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) h5Var.f13315b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f16041a = new String(bArr, "ISO-8859-1");
        } else {
            h5Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) h5Var.f13315b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f16041a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f16043c = ((h5Var.c() & 255) << 16) | ((h5Var.c() & 255) << 8) | (h5Var.c() & 255);
        } else if (i11 == 3) {
            this.f16043c = h5Var.g();
        } else {
            this.f16043c = h5Var.i();
        }
        if (i11 > 2) {
            h5Var.c();
            byte c10 = h5Var.c();
            byte b14 = 64;
            if (i11 == 3) {
                b13 = 128;
                b11 = 0;
                b10 = 32;
                b12 = 0;
            } else {
                b10 = 64;
                b11 = 1;
                b14 = 4;
            }
            if ((b13 & c10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & c10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (c10 & b14) != 0;
            this.f16044f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f16045g = h5Var.g();
                    this.f16043c -= 4;
                }
                if (z12) {
                    h5Var.c();
                    this.f16043c--;
                }
                if ((c10 & b10) != 0) {
                    h5Var.c();
                    this.f16043c--;
                }
            } else {
                if ((c10 & b10) != 0) {
                    h5Var.c();
                    this.f16043c--;
                }
                if (z12) {
                    h5Var.c();
                    this.f16043c--;
                }
                if ((c10 & b11) != 0) {
                    this.f16045g = h5Var.i();
                    this.f16043c -= 4;
                }
            }
        }
        this.f16042b = (int) (aVar.f6172b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f16041a, Integer.valueOf(this.f16043c));
    }
}
