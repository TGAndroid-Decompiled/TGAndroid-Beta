package m4;

import h2.k0;
import h2.m0;
public final class x {
    public final int f19846a;
    public final k0 f19847b;
    public final h2.x f19848c;
    public boolean d;
    public boolean f19849e;
    public boolean f19850f;
    public long f19851g;
    public long h;
    public long f19852i;

    public x(int i7) {
        this.f19846a = i7;
        switch (i7) {
            case 1:
                this.f19847b = new k0(0L);
                this.f19851g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f19852i = -9223372036854775807L;
                this.f19848c = new h2.x();
                return;
            default:
                this.f19847b = new k0(0L);
                this.f19851g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f19852i = -9223372036854775807L;
                this.f19848c = new h2.x();
                return;
        }
    }

    public static int b(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static long c(h2.x xVar) {
        int i7 = xVar.f14163b;
        if (xVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        xVar.k(0, 9, bArr);
        xVar.N(i7);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j3 = b10;
                    long j10 = b11;
                    return ((j10 & 3) << 13) | ((j3 & 3) << 28) | (((56 & j3) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(f3.p pVar) {
        switch (this.f19846a) {
            case 0:
                byte[] bArr = m0.f14113b;
                h2.x xVar = this.f19848c;
                xVar.getClass();
                xVar.L(bArr.length, bArr);
                this.d = true;
                pVar.q();
                return;
            default:
                byte[] bArr2 = m0.f14113b;
                h2.x xVar2 = this.f19848c;
                xVar2.getClass();
                xVar2.L(bArr2.length, bArr2);
                this.d = true;
                pVar.q();
                return;
        }
    }
}
