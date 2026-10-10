package mf;

import java.io.EOFException;
import k2.g0;
public final class f {
    public final String f16386a;
    public final int f16387b;
    public final int f16388c;
    public final boolean d;
    public final boolean f16389e;
    public final boolean f16390f;
    public final int f16391g;

    public f(la.h hVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        nf.a aVar = (nf.a) hVar.f15466b;
        long j3 = aVar.f7926b;
        g0 g0Var = (g0) hVar.d;
        i iVar = (i) hVar.f15467c;
        int i10 = iVar.f16396a;
        int i11 = iVar.f16396a;
        byte b12 = 2;
        if (i10 == 2) {
            g0Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) g0Var.f14470b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f16386a = new String(bArr, "ISO-8859-1");
        } else {
            g0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) g0Var.f14470b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f16386a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f16388c = ((g0Var.U0() & 255) << 16) | ((g0Var.U0() & 255) << 8) | (g0Var.U0() & 255);
        } else if (i11 == 3) {
            this.f16388c = g0Var.W0();
        } else {
            this.f16388c = g0Var.Y0();
        }
        if (i11 > 2) {
            g0Var.U0();
            byte U0 = g0Var.U0();
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
            if ((b13 & U0) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16389e = z10;
            if ((b12 & U0) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (U0 & b14) != 0;
            this.f16390f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f16391g = g0Var.W0();
                    this.f16388c -= 4;
                }
                if (z12) {
                    g0Var.U0();
                    this.f16388c--;
                }
                if ((U0 & b10) != 0) {
                    g0Var.U0();
                    this.f16388c--;
                }
            } else {
                if ((U0 & b10) != 0) {
                    g0Var.U0();
                    this.f16388c--;
                }
                if (z12) {
                    g0Var.U0();
                    this.f16388c--;
                }
                if ((U0 & b11) != 0) {
                    this.f16391g = g0Var.Y0();
                    this.f16388c -= 4;
                }
            }
        }
        this.f16387b = (int) (aVar.f7926b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f16386a, Integer.valueOf(this.f16388c));
    }
}
