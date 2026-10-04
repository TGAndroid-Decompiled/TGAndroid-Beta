package lf;

import java.io.EOFException;
public final class f {
    public final String f15481a;
    public final int f15482b;
    public final int f15483c;
    public final boolean d;
    public final boolean f15484e;
    public final boolean f15485f;
    public final int f15486g;

    public f(la.h hVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        mf.a aVar = (mf.a) hVar.f15399b;
        long j3 = aVar.f7877b;
        l2.g gVar = (l2.g) hVar.d;
        i iVar = (i) hVar.f15400c;
        int i10 = iVar.f15492a;
        int i11 = iVar.f15492a;
        byte b12 = 2;
        if (i10 == 2) {
            gVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) gVar.f15268b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f15481a = new String(bArr, "ISO-8859-1");
        } else {
            gVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) gVar.f15268b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f15481a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f15483c = ((gVar.D() & 255) << 16) | ((gVar.D() & 255) << 8) | (gVar.D() & 255);
        } else if (i11 == 3) {
            this.f15483c = gVar.H();
        } else {
            this.f15483c = gVar.I();
        }
        if (i11 > 2) {
            gVar.D();
            byte D = gVar.D();
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
            if ((b13 & D) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15484e = z10;
            if ((b12 & D) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (D & b14) != 0;
            this.f15485f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f15486g = gVar.H();
                    this.f15483c -= 4;
                }
                if (z12) {
                    gVar.D();
                    this.f15483c--;
                }
                if ((D & b10) != 0) {
                    gVar.D();
                    this.f15483c--;
                }
            } else {
                if ((D & b10) != 0) {
                    gVar.D();
                    this.f15483c--;
                }
                if (z12) {
                    gVar.D();
                    this.f15483c--;
                }
                if ((D & b11) != 0) {
                    this.f15486g = gVar.I();
                    this.f15483c -= 4;
                }
            }
        }
        this.f15482b = (int) (aVar.f7877b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f15481a, Integer.valueOf(this.f15483c));
    }
}
