package d3;

import b2.s0;
import c3.b0;
import c3.h0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.y;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f7462s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f7463t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f7464u;
    public static final byte[] v;
    public final int f7466b;
    public final n f7467c;
    public boolean d;
    public long e;
    public int f7468f;
    public int f7469g;
    public long h;
    public int f7471j;
    public long f7472k;
    public q f7473l;
    public h0 f7474m;
    public h0 f7475n;
    public b0 f7476o;
    public boolean f7477p;
    public long f7478q;
    public boolean f7479r;
    public final byte[] f7465a = new byte[1];
    public int f7470i = -1;

    static {
        String str = d0.f7883a;
        Charset charset = StandardCharsets.UTF_8;
        f7464u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f7466b = i10;
        n nVar = new n();
        this.f7467c = nVar;
        this.f7475n = nVar;
    }

    @Override
    public final boolean a(p pVar) {
        return d(pVar);
    }

    public final int b(p pVar) {
        String str;
        boolean z10;
        pVar.p();
        byte[] bArr = this.f7465a;
        pVar.a(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f7463t[i10];
                }
                return f7462s[i10];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw s0.a(null, sb2.toString());
        }
        throw s0.a(null, "Invalid padding bits for frame header " + ((int) b10));
    }

    public final boolean d(p pVar) {
        pVar.p();
        byte[] bArr = f7464u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.a(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.q(bArr.length);
            return true;
        }
        pVar.p();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.a(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.q(bArr3.length);
        return true;
    }

    @Override
    public final void g(q qVar) {
        this.f7473l = qVar;
        h0 Z1 = qVar.Z1(0, 1);
        this.f7474m = Z1;
        this.f7475n = Z1;
        qVar.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        long f7;
        this.e = 0L;
        this.f7468f = 0;
        this.f7469g = 0;
        this.f7478q = j10;
        b0 b0Var = this.f7476o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            c5.b0 b0Var2 = yVar.f3823b;
            if (b0Var2.f3841b == 0) {
                f7 = -9223372036854775807L;
            } else {
                f7 = b0Var2.f(d0.b(yVar.f3822a, j3));
            }
            this.f7472k = f7;
            if (Math.abs(this.f7478q - f7) < 20000) {
                return;
            }
            this.f7477p = true;
            this.f7475n = this.f7467c;
        } else if (j3 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f7472k = (Math.max(0L, j3 - kVar.f3777b) * 8000000) / kVar.e;
        } else {
            this.f7472k = 0L;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8079b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r19, c3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.m(c3.p, c3.s):int");
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
