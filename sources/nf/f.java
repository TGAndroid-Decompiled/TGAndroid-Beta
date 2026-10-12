package nf;

import java.io.EOFException;
import ji.d4;
public final class f {
    public final String f16330a;
    public final int f16331b;
    public final int f16332c;
    public final boolean d;
    public final boolean e;
    public final boolean f16333f;
    public final int f16334g;

    public f(li.k kVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        of.a aVar = (of.a) kVar.f14820b;
        long j10 = aVar.f6169b;
        d4 d4Var = (d4) kVar.d;
        h hVar = (h) kVar.f14821c;
        int i10 = hVar.f16337a;
        int i11 = hVar.f16337a;
        byte b12 = 2;
        if (i10 == 2) {
            d4Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) d4Var.f13233b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f16330a = new String(bArr, "ISO-8859-1");
        } else {
            d4Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) d4Var.f13233b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f16330a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f16332c = ((d4Var.g() & 255) << 16) | ((d4Var.g() & 255) << 8) | (d4Var.g() & 255);
        } else if (i11 == 3) {
            this.f16332c = d4Var.i();
        } else {
            this.f16332c = d4Var.j();
        }
        if (i11 > 2) {
            d4Var.g();
            byte g10 = d4Var.g();
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
            if ((b13 & g10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & g10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (g10 & b14) != 0;
            this.f16333f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f16334g = d4Var.i();
                    this.f16332c -= 4;
                }
                if (z12) {
                    d4Var.g();
                    this.f16332c--;
                }
                if ((g10 & b10) != 0) {
                    d4Var.g();
                    this.f16332c--;
                }
            } else {
                if ((g10 & b10) != 0) {
                    d4Var.g();
                    this.f16332c--;
                }
                if (z12) {
                    d4Var.g();
                    this.f16332c--;
                }
                if ((g10 & b11) != 0) {
                    this.f16334g = d4Var.j();
                    this.f16332c -= 4;
                }
            }
        }
        this.f16331b = (int) (aVar.f6169b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f16330a, Integer.valueOf(this.f16332c));
    }
}
