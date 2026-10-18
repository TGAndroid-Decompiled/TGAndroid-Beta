package j4;

import e2.k0;
import e2.m0;
public final class x {
    public final int f14233a;
    public final k0 f14234b;
    public final e2.x f14235c;
    public boolean d;
    public boolean e;
    public boolean f14236f;
    public long f14237g;
    public long h;
    public long f14238i;

    public x(int i10) {
        this.f14233a = i10;
        switch (i10) {
            case 1:
                this.f14234b = new k0(0L);
                this.f14237g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f14238i = -9223372036854775807L;
                this.f14235c = new e2.x();
                return;
            default:
                this.f14234b = new k0(0L);
                this.f14237g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f14238i = -9223372036854775807L;
                this.f14235c = new e2.x();
                return;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(e2.x xVar) {
        int i10 = xVar.f8295b;
        if (xVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        xVar.k(0, 9, bArr);
        xVar.N(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(c3.p pVar) {
        switch (this.f14233a) {
            case 0:
                byte[] bArr = m0.f8256b;
                e2.x xVar = this.f14235c;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                this.d = true;
                pVar.q();
                return;
            default:
                byte[] bArr2 = m0.f8256b;
                e2.x xVar2 = this.f14235c;
                xVar2.getClass();
                xVar2.L(bArr2.length, bArr2);
                this.d = true;
                pVar.q();
                return;
        }
    }
}
