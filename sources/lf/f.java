package lf;

import java.io.EOFException;
import k2.c0;
public final class f {
    public final String f14012a;
    public final int f14013b;
    public final int f14014c;
    public final boolean d;
    public final boolean e;
    public final boolean f14015f;
    public final int f14016g;

    public f(aa.a aVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        mf.a aVar2 = (mf.a) aVar.f357b;
        long j3 = aVar2.f7302b;
        c0 c0Var = (c0) aVar.d;
        i iVar = (i) aVar.f358c;
        int i10 = iVar.f14022a;
        int i11 = iVar.f14022a;
        byte b12 = 2;
        if (i10 == 2) {
            c0Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) c0Var.f13234b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f14012a = new String(bArr, "ISO-8859-1");
        } else {
            c0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) c0Var.f13234b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f14012a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f14014c = ((c0Var.o() & 255) << 16) | ((c0Var.o() & 255) << 8) | (c0Var.o() & 255);
        } else if (i11 == 3) {
            this.f14014c = c0Var.p();
        } else {
            this.f14014c = c0Var.q();
        }
        if (i11 > 2) {
            c0Var.o();
            byte o9 = c0Var.o();
            byte b14 = 64;
            if (i11 == 3) {
                b13 = 128;
                b12 = 0;
                b10 = 32;
                b11 = 0;
            } else {
                b14 = 4;
                b10 = 64;
                b11 = 1;
            }
            if ((b13 & o9) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & o9) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (o9 & b14) != 0;
            this.f14015f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f14016g = c0Var.p();
                    this.f14014c -= 4;
                }
                if (z12) {
                    c0Var.o();
                    this.f14014c--;
                }
                if ((o9 & b10) != 0) {
                    c0Var.o();
                    this.f14014c--;
                }
            } else {
                if ((o9 & b10) != 0) {
                    c0Var.o();
                    this.f14014c--;
                }
                if (z12) {
                    c0Var.o();
                    this.f14014c--;
                }
                if ((o9 & b11) != 0) {
                    this.f14016g = c0Var.q();
                    this.f14014c -= 4;
                }
            }
        }
        this.f14013b = (int) (aVar2.f7302b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f14012a, Integer.valueOf(this.f14014c));
    }
}
