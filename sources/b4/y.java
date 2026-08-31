package b4;
public final class y {
    public final int f1668a;
    public final h5.c0 f1669b;
    public final h5.w f1670c;
    public boolean d;
    public boolean f1671e;
    public boolean f1672f;
    public long f1673g;
    public long h;
    public long f1674i;

    public y(int i10) {
        this.f1668a = i10;
        switch (i10) {
            case 1:
                this.f1669b = new h5.c0(0L);
                this.f1673g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f1674i = -9223372036854775807L;
                this.f1670c = new h5.w();
                return;
            default:
                this.f1669b = new h5.c0(0L);
                this.f1673g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f1674i = -9223372036854775807L;
                this.f1670c = new h5.w();
                return;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(h5.w wVar) {
        int i10 = wVar.f7309b;
        if (wVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wVar.e(0, 9, bArr);
        wVar.F(i10);
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

    public final void a(r3.l lVar) {
        switch (this.f1668a) {
            case 0:
                byte[] bArr = h5.d0.f7241f;
                h5.w wVar = this.f1670c;
                wVar.getClass();
                wVar.D(bArr.length, bArr);
                this.d = true;
                lVar.r();
                return;
            default:
                byte[] bArr2 = h5.d0.f7241f;
                h5.w wVar2 = this.f1670c;
                wVar2.getClass();
                wVar2.D(bArr2.length, bArr2);
                this.d = true;
                lVar.r();
                return;
        }
    }
}
