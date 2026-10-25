package d3;

import b2.x0;
import c3.b0;
import c3.j0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.y;
import d5.z;
import e2.n0;
import f9.g0;
import f9.i0;
import f9.s1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f7888s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f7889t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f7890u;
    public static final byte[] v;
    public final int f7892b;
    public final n f7893c;
    public boolean d;
    public long e;
    public int f7894f;
    public int f7895g;
    public long h;
    public int f7897j;
    public long f7898k;
    public q f7899l;
    public j0 f7900m;
    public j0 f7901n;
    public b0 f7902o;
    public boolean f7903p;
    public long f7904q;
    public boolean f7905r;
    public final byte[] f7891a = new byte[1];
    public int f7896i = -1;

    static {
        String str = n0.f9692a;
        Charset charset = StandardCharsets.UTF_8;
        f7890u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f7892b = i10;
        n nVar = new n();
        this.f7893c = nVar;
        this.f7901n = nVar;
    }

    @Override
    public final boolean a(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f7899l = qVar;
        j0 F1 = qVar.F1(0, 1);
        this.f7900m = F1;
        this.f7901n = F1;
        qVar.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12;
        this.e = 0L;
        this.f7894f = 0;
        this.f7895g = 0;
        this.f7904q = j11;
        b0 b0Var = this.f7902o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            z zVar = yVar.f6122b;
            if (zVar.f8026b == 0) {
                j12 = -9223372036854775807L;
            } else {
                j12 = zVar.j(n0.c(yVar.f6121a, j10));
            }
            this.f7898k = j12;
            if (Math.abs(this.f7904q - j12) < 20000) {
                return;
            }
            this.f7903p = true;
            this.f7901n = this.f7893c;
        } else if (j10 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f7898k = (Math.max(0L, j10 - kVar.f6069b) * 8000000) / kVar.e;
        } else {
            this.f7898k = 0L;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r19, c3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.f(c3.p, c3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z10;
        pVar.p();
        byte[] bArr = this.f7891a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f7889t[i10];
                }
                return f7888s[i10];
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
            throw x0.a(null, sb2.toString());
        }
        throw x0.a(null, "Invalid padding bits for frame header " + ((int) b10));
    }

    public final boolean h(p pVar) {
        pVar.p();
        byte[] bArr = f7890u;
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
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
