package nf;

import java.io.EOFException;
import m.g3;
public final class f {
    public final String f17424a;
    public final int f17425b;
    public final int f17426c;
    public final boolean d;
    public final boolean e;
    public final boolean f17427f;
    public final int f17428g;

    public f(g3 g3Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        of.a aVar = (of.a) g3Var.f16203b;
        long j10 = aVar.f7629b;
        k0.b bVar = (k0.b) g3Var.d;
        h hVar = (h) g3Var.f16204c;
        int i10 = hVar.f17431a;
        int i11 = hVar.f17431a;
        byte b12 = 2;
        if (i10 == 2) {
            bVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) bVar.f14566b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f17424a = new String(bArr, "ISO-8859-1");
        } else {
            bVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) bVar.f14566b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f17424a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f17426c = ((bVar.Z() & 255) << 16) | ((bVar.Z() & 255) << 8) | (bVar.Z() & 255);
        } else if (i11 == 3) {
            this.f17426c = bVar.a0();
        } else {
            this.f17426c = bVar.b0();
        }
        if (i11 > 2) {
            bVar.Z();
            byte Z = bVar.Z();
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
            if ((b13 & Z) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & Z) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (Z & b14) != 0;
            this.f17427f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f17428g = bVar.a0();
                    this.f17426c -= 4;
                }
                if (z12) {
                    bVar.Z();
                    this.f17426c--;
                }
                if ((Z & b10) != 0) {
                    bVar.Z();
                    this.f17426c--;
                }
            } else {
                if ((Z & b10) != 0) {
                    bVar.Z();
                    this.f17426c--;
                }
                if (z12) {
                    bVar.Z();
                    this.f17426c--;
                }
                if ((Z & b11) != 0) {
                    this.f17428g = bVar.b0();
                    this.f17426c -= 4;
                }
            }
        }
        this.f17425b = (int) (aVar.f7629b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f17424a, Integer.valueOf(this.f17426c));
    }
}
