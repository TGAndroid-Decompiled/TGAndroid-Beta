package mf;

import java.io.EOFException;
import m2.t;
public final class f {
    public final String f16209a;
    public final int f16210b;
    public final int f16211c;
    public final boolean d;
    public final boolean f16212e;
    public final boolean f16213f;
    public final int f16214g;

    public f(t tVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        nf.a aVar = (nf.a) tVar.f15817b;
        long j3 = aVar.f6347b;
        l.d dVar = (l.d) tVar.d;
        h hVar = (h) tVar.f15818c;
        int i10 = hVar.f16217a;
        int i11 = hVar.f16217a;
        byte b12 = 2;
        if (i10 == 2) {
            dVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) dVar.f15072b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f16209a = new String(bArr, "ISO-8859-1");
        } else {
            dVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) dVar.f15072b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f16209a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f16211c = ((dVar.y() & 255) << 16) | ((dVar.y() & 255) << 8) | (dVar.y() & 255);
        } else if (i11 == 3) {
            this.f16211c = dVar.A();
        } else {
            this.f16211c = dVar.B();
        }
        if (i11 > 2) {
            dVar.y();
            byte y3 = dVar.y();
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
            if ((b13 & y3) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16212e = z10;
            if ((b12 & y3) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (y3 & b14) != 0;
            this.f16213f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f16214g = dVar.A();
                    this.f16211c -= 4;
                }
                if (z12) {
                    dVar.y();
                    this.f16211c--;
                }
                if ((y3 & b10) != 0) {
                    dVar.y();
                    this.f16211c--;
                }
            } else {
                if ((y3 & b10) != 0) {
                    dVar.y();
                    this.f16211c--;
                }
                if (z12) {
                    dVar.y();
                    this.f16211c--;
                }
                if ((y3 & b11) != 0) {
                    this.f16214g = dVar.B();
                    this.f16211c -= 4;
                }
            }
        }
        this.f16210b = (int) (aVar.f6347b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f16209a, Integer.valueOf(this.f16211c));
    }
}
