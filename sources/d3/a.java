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
    public static final int[] f6239s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f6240t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f6241u;
    public static final byte[] v;
    public final int f6243b;
    public final n f6244c;
    public boolean d;
    public long e;
    public int f6245f;
    public int f6246g;
    public long h;
    public int f6248j;
    public long f6249k;
    public q f6250l;
    public h0 f6251m;
    public h0 f6252n;
    public b0 f6253o;
    public boolean f6254p;
    public long f6255q;
    public boolean f6256r;
    public final byte[] f6242a = new byte[1];
    public int f6247i = -1;

    static {
        String str = d0.f7188a;
        Charset charset = StandardCharsets.UTF_8;
        f6241u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f6243b = i10;
        n nVar = new n();
        this.f6244c = nVar;
        this.f6252n = nVar;
    }

    public final int a(p pVar) {
        String str;
        boolean z10;
        pVar.p();
        byte[] bArr = this.f6242a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f6240t[i10];
                }
                return f6239s[i10];
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

    @Override
    public final boolean b(p pVar) {
        return d(pVar);
    }

    public final boolean d(p pVar) {
        pVar.p();
        byte[] bArr = f6241u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.q(bArr.length);
            return true;
        }
        pVar.p();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.q(bArr3.length);
        return true;
    }

    @Override
    public final void g(q qVar) {
        this.f6250l = qVar;
        h0 I = qVar.I(0, 1);
        this.f6251m = I;
        this.f6252n = I;
        qVar.B();
    }

    @Override
    public final void h(long j3, long j10) {
        long f7;
        this.e = 0L;
        this.f6245f = 0;
        this.f6246g = 0;
        this.f6255q = j10;
        b0 b0Var = this.f6253o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            c5.b0 b0Var2 = yVar.f4242b;
            if (b0Var2.f4260b == 0) {
                f7 = -9223372036854775807L;
            } else {
                f7 = b0Var2.f(d0.b(yVar.f4241a, j3));
            }
            this.f6249k = f7;
            if (Math.abs(this.f6255q - f7) < 20000) {
                return;
            }
            this.f6254p = true;
            this.f6252n = this.f6244c;
        } else if (j3 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f6249k = (Math.max(0L, j3 - kVar.f4196b) * 8000000) / kVar.e;
        } else {
            this.f6249k = 0L;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f7384b;
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
