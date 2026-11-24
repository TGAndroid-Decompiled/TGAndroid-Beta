package defpackage;
public final class hw8 {
    public final byte a;
    public final vqb b;
    public final yw7 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public hw8(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new vqb(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new yw7();
                return;
            default:
                this.b = new vqb(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new yw7();
                return;
        }
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static long c(yw7 yw7Var) {
        int i = yw7Var.b;
        if (yw7Var.a() >= 9) {
            byte[] bArr = new byte[9];
            yw7Var.k(0, 9, bArr);
            yw7Var.N(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        return (((56 & j) >> 3) << 30) | ((j & 3) << 28) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                    }
                    return -9223372036854775807L;
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final void a(vb3 vb3Var) {
        byte b = this.a;
        yw7 yw7Var = this.c;
        switch (b) {
            case 0:
                byte[] bArr = hac.b;
                yw7Var.L(bArr.length, bArr);
                this.d = true;
                vb3Var.f = 0;
                return;
            default:
                byte[] bArr2 = hac.b;
                yw7Var.L(bArr2.length, bArr2);
                this.d = true;
                vb3Var.f = 0;
                return;
        }
    }
}
