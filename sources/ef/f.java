package ef;

import android.support.v4.media.session.a0;
import java.io.EOFException;
public final class f {
    public final String f6498a;
    public final int f6499b;
    public final int f6500c;
    public final boolean d;
    public final boolean e;
    public final boolean f6501f;
    public final int f6502g;

    public f(a0 a0Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        ff.b bVar = (ff.b) a0Var.f875b;
        long j10 = bVar.f7056b;
        k6.h hVar = (k6.h) a0Var.d;
        h hVar2 = (h) a0Var.f876c;
        int i10 = hVar2.f6505a;
        int i11 = hVar2.f6505a;
        byte b12 = 2;
        if (i10 == 2) {
            hVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((ff.a) hVar.f10944b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f6498a = new String(bArr, "ISO-8859-1");
        } else {
            hVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((ff.a) hVar.f10944b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f6498a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f6500c = ((hVar.v() & 255) << 16) | ((hVar.v() & 255) << 8) | (hVar.v() & 255);
        } else if (i11 == 3) {
            this.f6500c = hVar.C();
        } else {
            this.f6500c = hVar.D();
        }
        if (i11 > 2) {
            hVar.v();
            byte v = hVar.v();
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
            if ((b13 & v) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & v) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (v & b14) != 0;
            this.f6501f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f6502g = hVar.C();
                    this.f6500c -= 4;
                }
                if (z12) {
                    hVar.v();
                    this.f6500c--;
                }
                if ((v & b10) != 0) {
                    hVar.v();
                    this.f6500c--;
                }
            } else {
                if ((v & b10) != 0) {
                    hVar.v();
                    this.f6500c--;
                }
                if (z12) {
                    hVar.v();
                    this.f6500c--;
                }
                if ((v & b11) != 0) {
                    this.f6502g = hVar.D();
                    this.f6500c -= 4;
                }
            }
        }
        this.f6499b = (int) (bVar.f7056b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f6498a, Integer.valueOf(this.f6500c));
    }
}
