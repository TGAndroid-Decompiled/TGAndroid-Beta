package lf;

import java.io.EOFException;
public final class f {
    public final String f12907a;
    public final int f12908b;
    public final int f12909c;
    public final boolean d;
    public final boolean e;
    public final boolean f12910f;
    public final int f12911g;

    public f(aa.a aVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        mf.a aVar2 = (mf.a) aVar.f355b;
        long j3 = aVar2.f6077b;
        l2.g gVar = (l2.g) aVar.d;
        i iVar = (i) aVar.f356c;
        int i10 = iVar.f12917a;
        int i11 = iVar.f12917a;
        byte b12 = 2;
        if (i10 == 2) {
            gVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) gVar.f12719b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f12907a = new String(bArr, "ISO-8859-1");
        } else {
            gVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) gVar.f12719b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f12907a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f12909c = ((gVar.F() & 255) << 16) | ((gVar.F() & 255) << 8) | (gVar.F() & 255);
        } else if (i11 == 3) {
            this.f12909c = gVar.G();
        } else {
            this.f12909c = gVar.I();
        }
        if (i11 > 2) {
            gVar.F();
            byte F = gVar.F();
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
            if ((b13 & F) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & F) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (F & b14) != 0;
            this.f12910f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f12911g = gVar.G();
                    this.f12909c -= 4;
                }
                if (z12) {
                    gVar.F();
                    this.f12909c--;
                }
                if ((F & b10) != 0) {
                    gVar.F();
                    this.f12909c--;
                }
            } else {
                if ((F & b10) != 0) {
                    gVar.F();
                    this.f12909c--;
                }
                if (z12) {
                    gVar.F();
                    this.f12909c--;
                }
                if ((F & b11) != 0) {
                    this.f12911g = gVar.I();
                    this.f12909c -= 4;
                }
            }
        }
        this.f12908b = (int) (aVar2.f6077b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f12907a, Integer.valueOf(this.f12909c));
    }
}
