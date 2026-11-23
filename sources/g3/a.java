package g3;

import b3.j;
import e2.t0;
import f3.c0;
import f3.j0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.z;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.s1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f13131s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f13132t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f13133u;
    public static final byte[] v;
    public final int f13135b;
    public final n f13136c;
    public boolean d;
    public long f13137e;
    public int f13138f;
    public int f13139g;
    public long h;
    public int f13141j;
    public long f13142k;
    public q f13143l;
    public j0 f13144m;
    public j0 f13145n;
    public c0 f13146o;
    public boolean f13147p;
    public long f13148q;
    public boolean f13149r;
    public final byte[] f13134a = new byte[1];
    public int f13140i = -1;

    static {
        String str = l0.f13778a;
        Charset charset = StandardCharsets.UTF_8;
        f13133u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i7) {
        this.f13135b = i7;
        n nVar = new n();
        this.f13136c = nVar;
        this.f13145n = nVar;
    }

    @Override
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f13143l = qVar;
        j0 d2 = qVar.d2(0, 1);
        this.f13144m = d2;
        this.f13145n = d2;
        qVar.Z0();
    }

    @Override
    public final void d(long j3, long j10) {
        long m10;
        this.f13137e = 0L;
        this.f13138f = 0;
        this.f13139g = 0;
        this.f13148q = j10;
        c0 c0Var = this.f13146o;
        if (c0Var instanceof z) {
            z zVar = (z) c0Var;
            j jVar = zVar.f11228b;
            if (jVar.f2873b == 0) {
                m10 = -9223372036854775807L;
            } else {
                m10 = jVar.m(l0.c(zVar.f11227a, j3));
            }
            this.f13142k = m10;
            if (Math.abs(this.f13148q - m10) < 20000) {
                return;
            }
            this.f13147p = true;
            this.f13145n = this.f13136c;
        } else if (j3 != 0 && (c0Var instanceof k)) {
            k kVar = (k) c0Var;
            this.f13142k = (Math.max(0L, j3 - kVar.f11169b) * 8000000) / kVar.f11171e;
        } else {
            this.f13142k = 0L;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13995b;
        return s1.f14058e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: g3.a.f(f3.p, f3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z10;
        pVar.o();
        byte[] bArr = this.f13134a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i7 = (b10 >> 3) & 15;
            if (i7 >= 0 && i7 <= 15 && (((z10 = this.d) && (i7 < 10 || i7 > 13)) || (!z10 && (i7 < 12 || i7 > 14)))) {
                if (z10) {
                    return f13132t[i7];
                }
                return f13131s[i7];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i7);
            throw t0.a(null, sb2.toString());
        }
        throw t0.a(null, "Invalid padding bits for frame header " + ((int) b10));
    }

    public final boolean h(p pVar) {
        pVar.o();
        byte[] bArr = f13133u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.q(bArr.length);
            return true;
        }
        pVar.o();
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
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
