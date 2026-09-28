package lf;

import java.io.EOFException;
public final class f {
    public final String f14238a;
    public final int f14239b;
    public final int f14240c;
    public final boolean d;
    public final boolean e;
    public final boolean f14241f;
    public final int f14242g;

    public f(la.h hVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        mf.a aVar = (mf.a) hVar.f14166b;
        long j3 = aVar.f7286b;
        a4.m mVar = (a4.m) hVar.d;
        i iVar = (i) hVar.f14167c;
        int i10 = iVar.f14248a;
        int i11 = iVar.f14248a;
        byte b12 = 2;
        if (i10 == 2) {
            mVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) mVar.f275b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f14238a = new String(bArr, "ISO-8859-1");
        } else {
            mVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) mVar.f275b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f14238a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f14240c = ((mVar.y0() & 255) << 16) | ((mVar.y0() & 255) << 8) | (mVar.y0() & 255);
        } else if (i11 == 3) {
            this.f14240c = mVar.A0();
        } else {
            this.f14240c = mVar.B0();
        }
        if (i11 > 2) {
            mVar.y0();
            byte y02 = mVar.y0();
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
            if ((b13 & y02) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & y02) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (y02 & b14) != 0;
            this.f14241f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f14242g = mVar.A0();
                    this.f14240c -= 4;
                }
                if (z12) {
                    mVar.y0();
                    this.f14240c--;
                }
                if ((y02 & b10) != 0) {
                    mVar.y0();
                    this.f14240c--;
                }
            } else {
                if ((y02 & b10) != 0) {
                    mVar.y0();
                    this.f14240c--;
                }
                if (z12) {
                    mVar.y0();
                    this.f14240c--;
                }
                if ((y02 & b11) != 0) {
                    this.f14242g = mVar.B0();
                    this.f14240c -= 4;
                }
            }
        }
        this.f14239b = (int) (aVar.f7286b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f14238a, Integer.valueOf(this.f14240c));
    }
}
