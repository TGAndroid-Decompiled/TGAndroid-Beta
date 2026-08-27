package n3;

import d5.g0;
import h3.s0;
import h3.t0;
import h3.t1;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import m3.g;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.w;
import o8.d;

public final class a implements k {

    public static final int[] f18191p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    public static final int[] f18192q;

    public static final byte[] f18193r;

    public static final byte[] f18194s;

    public static final int f18195t;

    public final int f18197b;

    public boolean f18198c;
    public long d;

    public int f18199e;

    public int f18200f;

    public boolean f18201g;
    public long h;

    public int f18203j;

    public long f18204k;

    public m f18205l;

    public w f18206m;

    public t f18207n;

    public boolean f18208o;

    public final byte[] f18196a = new byte[1];

    public int f18202i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f18192q = iArr;
        int i10 = g0.f4795a;
        Charset charset = d.f19363c;
        f18193r = "#!AMR\n".getBytes(charset);
        f18194s = "#!AMR-WB\n".getBytes(charset);
        f18195t = iArr[8];
    }

    public a(int i10) {
        this.f18197b = i10;
    }

    public final int a(l lVar) throws t1 {
        boolean z10;
        lVar.q();
        byte[] bArr = this.f18196a;
        lVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw t1.a("Invalid padding bits for frame header " + ((int) b10), null);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f18198c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f18192q[i10] : f18191p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f18198c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw t1.a(sb2.toString(), null);
    }

    @Override
    public final int b(l lVar, n nVar) throws t1 {
        int i10;
        int i11;
        int iB;
        int i12;
        d5.a.j(this.f18206m);
        int i13 = g0.f4795a;
        if (((h) lVar).d == 0 && !d(lVar)) {
            throw t1.a("Could not find AMR header.", null);
        }
        if (!this.f18208o) {
            this.f18208o = true;
            boolean z10 = this.f18198c;
            String str = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i14 = z10 ? 16000 : 8000;
            w wVar = this.f18206m;
            s0 s0Var = new s0();
            s0Var.f8135o = str;
            s0Var.f8136p = f18195t;
            s0Var.B = 1;
            s0Var.C = i14;
            wVar.c(new t0(s0Var));
        }
        if (this.f18200f == 0) {
            try {
                int iA = a(lVar);
                this.f18199e = iA;
                this.f18200f = iA;
                if (this.f18202i == -1) {
                    this.h = ((h) lVar).d;
                    this.f18202i = iA;
                }
                if (this.f18202i == iA) {
                    this.f18203j++;
                }
                iB = this.f18206m.b(lVar, this.f18200f, true);
                if (iB == -1) {
                    i10 = -1;
                } else {
                    i12 = this.f18200f - iB;
                    this.f18200f = i12;
                    i10 = 0;
                    if (i12 <= 0) {
                        this.f18206m.e(this.f18204k + this.d, 1, this.f18199e, 0, null);
                        this.d += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iB = this.f18206m.b(lVar, this.f18200f, true);
            if (iB == -1) {
                i10 = -1;
            } else {
                i12 = this.f18200f - iB;
                this.f18200f = i12;
                i10 = 0;
                if (i12 <= 0) {
                    this.f18206m.e(this.f18204k + this.d, 1, this.f18199e, 0, null);
                    this.d += 20000;
                }
            }
        }
        long j10 = ((h) lVar).f17612c;
        if (!this.f18201g) {
            if ((this.f18197b & 1) == 0 || j10 == -1 || !((i11 = this.f18202i) == -1 || i11 == this.f18199e)) {
                o oVar = new o(-9223372036854775807L);
                this.f18207n = oVar;
                this.f18205l.n(oVar);
                this.f18201g = true;
            } else if (this.f18203j >= 20 || i10 == -1) {
                g gVar = new g(j10, (int) ((((long) i11) * 8000000) / 20000), i11, false, this.h);
                this.f18207n = gVar;
                this.f18205l.n(gVar);
                this.f18201g = true;
            }
        }
        return i10;
    }

    @Override
    public final void c(m mVar) {
        this.f18205l = mVar;
        this.f18206m = mVar.C(0, 1);
        mVar.A();
    }

    public final boolean d(l lVar) {
        lVar.q();
        byte[] bArr = f18193r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f18198c = false;
            lVar.t(bArr.length);
            return true;
        }
        lVar.q();
        byte[] bArr3 = f18194s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f18198c = true;
        lVar.t(bArr3.length);
        return true;
    }

    @Override
    public final boolean f(l lVar) {
        return d(lVar);
    }

    @Override
    public final void g(long j10, long j11) {
        this.d = 0L;
        this.f18199e = 0;
        this.f18200f = 0;
        if (j10 != 0) {
            t tVar = this.f18207n;
            if (tVar instanceof g) {
                g gVar = (g) tVar;
                this.f18204k = (Math.max(0L, j10 - gVar.f17605b) * 8000000) / ((long) gVar.f17607e);
                return;
            }
        }
        this.f18204k = 0L;
    }

    @Override
    public final void release() {
    }
}
