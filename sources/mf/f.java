package mf;

import java.io.EOFException;
import m.f3;
public final class f {
    public final String f16133a;
    public final int f16134b;
    public final int f16135c;
    public final boolean d;
    public final boolean f16136e;
    public final boolean f16137f;
    public final int f16138g;

    public f(f3 f3Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        nf.a aVar = (nf.a) f3Var.f15424b;
        long j3 = aVar.f7923b;
        l2.g gVar = (l2.g) f3Var.d;
        h hVar = (h) f3Var.f15425c;
        int i10 = hVar.f16141a;
        int i11 = hVar.f16141a;
        byte b12 = 2;
        if (i10 == 2) {
            gVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) gVar.f15081b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f16133a = new String(bArr, "ISO-8859-1");
        } else {
            gVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) gVar.f15081b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f16133a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f16135c = ((gVar.J0() & 255) << 16) | ((gVar.J0() & 255) << 8) | (gVar.J0() & 255);
        } else if (i11 == 3) {
            this.f16135c = gVar.L0();
        } else {
            this.f16135c = gVar.M0();
        }
        if (i11 > 2) {
            gVar.J0();
            byte J0 = gVar.J0();
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
            if ((b13 & J0) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16136e = z10;
            if ((b12 & J0) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (J0 & b14) != 0;
            this.f16137f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f16138g = gVar.L0();
                    this.f16135c -= 4;
                }
                if (z12) {
                    gVar.J0();
                    this.f16135c--;
                }
                if ((J0 & b10) != 0) {
                    gVar.J0();
                    this.f16135c--;
                }
            } else {
                if ((J0 & b10) != 0) {
                    gVar.J0();
                    this.f16135c--;
                }
                if (z12) {
                    gVar.J0();
                    this.f16135c--;
                }
                if ((J0 & b11) != 0) {
                    this.f16138g = gVar.M0();
                    this.f16135c -= 4;
                }
            }
        }
        this.f16134b = (int) (aVar.f7923b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f16133a, Integer.valueOf(this.f16135c));
    }
}
