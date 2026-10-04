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
    public static final int[] f8058s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f8059t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f8060u;
    public static final byte[] v;
    public final int f8062b;
    public final n f8063c;
    public boolean d;
    public long f8064e;
    public int f8065f;
    public int f8066g;
    public long h;
    public int f8068j;
    public long f8069k;
    public q f8070l;
    public h0 f8071m;
    public h0 f8072n;
    public b0 f8073o;
    public boolean f8074p;
    public long f8075q;
    public boolean f8076r;
    public final byte[] f8061a = new byte[1];
    public int f8067i = -1;

    static {
        String str = d0.f8538a;
        Charset charset = StandardCharsets.UTF_8;
        f8060u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f8062b = i10;
        n nVar = new n();
        this.f8063c = nVar;
        this.f8072n = nVar;
    }

    public final int a(p pVar) {
        String str;
        boolean z10;
        pVar.m();
        byte[] bArr = this.f8061a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f8059t[i10];
                }
                return f8058s[i10];
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
        pVar.m();
        byte[] bArr = f8060u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.o(bArr.length);
            return true;
        }
        pVar.m();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.o(bArr3.length);
        return true;
    }

    @Override
    public final void g(q qVar) {
        this.f8070l = qVar;
        h0 Z1 = qVar.Z1(0, 1);
        this.f8071m = Z1;
        this.f8072n = Z1;
        qVar.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        long f7;
        this.f8064e = 0L;
        this.f8065f = 0;
        this.f8066g = 0;
        this.f8075q = j10;
        b0 b0Var = this.f8073o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            c5.b0 b0Var2 = yVar.f4133b;
            if (b0Var2.f4153b == 0) {
                f7 = -9223372036854775807L;
            } else {
                f7 = b0Var2.f(d0.b(yVar.f4132a, j3));
            }
            this.f8069k = f7;
            if (Math.abs(this.f8075q - f7) < 20000) {
                return;
            }
            this.f8074p = true;
            this.f8072n = this.f8063c;
        } else if (j3 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f8069k = (Math.max(0L, j3 - kVar.f4084b) * 8000000) / kVar.f4086e;
        } else {
            this.f8069k = 0L;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8758b;
        return a1.f8721e;
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
