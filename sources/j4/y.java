package j4;
public final class y {
    public final int f11757a;
    public final e2.b0 f11758b;
    public final e2.v f11759c;
    public boolean d;
    public boolean e;
    public boolean f11760f;
    public long f11761g;
    public long h;
    public long f11762i;

    public y(int i10) {
        this.f11757a = i10;
        switch (i10) {
            case 1:
                this.f11758b = new e2.b0(0L);
                this.f11761g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f11762i = -9223372036854775807L;
                this.f11759c = new e2.v();
                return;
            default:
                this.f11758b = new e2.b0(0L);
                this.f11761g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.f11762i = -9223372036854775807L;
                this.f11759c = new e2.v();
                return;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(e2.v vVar) {
        int i10 = vVar.f7235b;
        if (vVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        vVar.h(0, 9, bArr);
        vVar.J(i10);
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

    public final void a(c3.p pVar) {
        switch (this.f11757a) {
            case 0:
                byte[] bArr = e2.d0.f7189b;
                e2.v vVar = this.f11759c;
                vVar.getClass();
                vVar.H(bArr.length, bArr);
                this.d = true;
                pVar.p();
                return;
            default:
                byte[] bArr2 = e2.d0.f7189b;
                e2.v vVar2 = this.f11759c;
                vVar2.getClass();
                vVar2.H(bArr2.length, bArr2);
                this.d = true;
                pVar.p();
                return;
        }
    }
}
