package lf;

import java.io.EOFException;
public final class f {
    public final String f14222a;
    public final int f14223b;
    public final int f14224c;
    public final boolean d;
    public final boolean e;
    public final boolean f14225f;
    public final int f14226g;

    public f(h hVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        mf.a aVar = (mf.a) hVar.f14230b;
        long j3 = aVar.f7302b;
        android.support.v4.media.c cVar = (android.support.v4.media.c) hVar.d;
        i iVar = (i) hVar.f14231c;
        int i10 = iVar.f14232a;
        int i11 = iVar.f14232a;
        byte b12 = 2;
        if (i10 == 2) {
            cVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) cVar.f1812b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f14222a = new String(bArr, "ISO-8859-1");
        } else {
            cVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) cVar.f1812b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f14222a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f14224c = ((cVar.s0() & 255) << 16) | ((cVar.s0() & 255) << 8) | (cVar.s0() & 255);
        } else if (i11 == 3) {
            this.f14224c = cVar.u0();
        } else {
            this.f14224c = cVar.w0();
        }
        if (i11 > 2) {
            cVar.s0();
            byte s02 = cVar.s0();
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
            if ((b13 & s02) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & s02) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (s02 & b14) != 0;
            this.f14225f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f14226g = cVar.u0();
                    this.f14224c -= 4;
                }
                if (z12) {
                    cVar.s0();
                    this.f14224c--;
                }
                if ((s02 & b10) != 0) {
                    cVar.s0();
                    this.f14224c--;
                }
            } else {
                if ((s02 & b10) != 0) {
                    cVar.s0();
                    this.f14224c--;
                }
                if (z12) {
                    cVar.s0();
                    this.f14224c--;
                }
                if ((s02 & b11) != 0) {
                    this.f14226g = cVar.w0();
                    this.f14224c -= 4;
                }
            }
        }
        this.f14223b = (int) (aVar.f7302b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f14222a, Integer.valueOf(this.f14224c));
    }
}
