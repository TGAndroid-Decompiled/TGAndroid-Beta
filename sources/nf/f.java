package nf;

import java.io.EOFException;
import k2.w0;
import m.g3;
public final class f {
    public final String f17423a;
    public final int f17424b;
    public final int f17425c;
    public final boolean d;
    public final boolean e;
    public final boolean f17426f;
    public final int f17427g;

    public f(g3 g3Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        of.a aVar = (of.a) g3Var.f16204b;
        long j10 = aVar.f7628b;
        w0 w0Var = (w0) g3Var.d;
        h hVar = (h) g3Var.f16205c;
        int i10 = hVar.f17430a;
        int i11 = hVar.f17430a;
        byte b12 = 2;
        if (i10 == 2) {
            w0Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) w0Var.f14832b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f17423a = new String(bArr, "ISO-8859-1");
        } else {
            w0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) w0Var.f14832b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f17423a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f17425c = ((w0Var.m() & 255) << 16) | ((w0Var.m() & 255) << 8) | (w0Var.m() & 255);
        } else if (i11 == 3) {
            this.f17425c = w0Var.p();
        } else {
            this.f17425c = w0Var.u();
        }
        if (i11 > 2) {
            w0Var.m();
            byte m10 = w0Var.m();
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
            if ((b13 & m10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & m10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (m10 & b14) != 0;
            this.f17426f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f17427g = w0Var.p();
                    this.f17425c -= 4;
                }
                if (z12) {
                    w0Var.m();
                    this.f17425c--;
                }
                if ((m10 & b10) != 0) {
                    w0Var.m();
                    this.f17425c--;
                }
            } else {
                if ((m10 & b10) != 0) {
                    w0Var.m();
                    this.f17425c--;
                }
                if (z12) {
                    w0Var.m();
                    this.f17425c--;
                }
                if ((m10 & b11) != 0) {
                    this.f17427g = w0Var.u();
                    this.f17425c -= 4;
                }
            }
        }
        this.f17424b = (int) (aVar.f7628b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f17423a, Integer.valueOf(this.f17425c));
    }
}
