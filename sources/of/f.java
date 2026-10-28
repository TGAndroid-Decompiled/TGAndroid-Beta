package of;

import java.io.EOFException;
import li.e3;
public final class f {
    public final String f19364a;
    public final int f19365b;
    public final int f19366c;
    public final boolean d;
    public final boolean e;
    public final boolean f19367f;
    public final int f19368g;

    public f(k6.c cVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        pf.a aVar = (pf.a) cVar.f16405b;
        long j10 = aVar.f7735b;
        e3 e3Var = (e3) cVar.d;
        h hVar = (h) cVar.f16406c;
        int i10 = hVar.f19371a;
        int i11 = hVar.f19371a;
        byte b12 = 2;
        if (i10 == 2) {
            e3Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) e3Var.f17209b).read(bArr, i12, 3 - i12);
                if (read > 0) {
                    i12 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f19364a = new String(bArr, "ISO-8859-1");
        } else {
            e3Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) e3Var.f17209b).read(bArr2, i13, 4 - i13);
                if (read2 > 0) {
                    i13 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f19364a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f19366c = ((e3Var.z0() & 255) << 16) | ((e3Var.z0() & 255) << 8) | (e3Var.z0() & 255);
        } else if (i11 == 3) {
            this.f19366c = e3Var.B0();
        } else {
            this.f19366c = e3Var.G0();
        }
        if (i11 > 2) {
            e3Var.z0();
            byte z02 = e3Var.z0();
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
            if ((b13 & z02) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.e = z10;
            if ((b12 & z02) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (z02 & b14) != 0;
            this.f19367f = z12;
            if (i11 == 3) {
                if (z10) {
                    this.f19368g = e3Var.B0();
                    this.f19366c -= 4;
                }
                if (z12) {
                    e3Var.z0();
                    this.f19366c--;
                }
                if ((z02 & b10) != 0) {
                    e3Var.z0();
                    this.f19366c--;
                }
            } else {
                if ((z02 & b10) != 0) {
                    e3Var.z0();
                    this.f19366c--;
                }
                if (z12) {
                    e3Var.z0();
                    this.f19366c--;
                }
                if ((z02 & b11) != 0) {
                    this.f19368g = e3Var.G0();
                    this.f19366c -= 4;
                }
            }
        }
        this.f19365b = (int) (aVar.f7735b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f19364a, Integer.valueOf(this.f19366c));
    }
}
