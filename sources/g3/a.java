package g3;

import b3.j;
import e2.t0;
import f3.b0;
import f3.i0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.y;
import h2.l0;
import h9.g0;
import h9.t1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f13166s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f13167t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f13168u;
    public static final byte[] v;
    public final int f13170b;
    public final n f13171c;
    public boolean d;
    public long f13172e;
    public int f13173f;
    public int f13174g;
    public long h;
    public int f13176j;
    public long f13177k;
    public q f13178l;
    public i0 f13179m;
    public i0 f13180n;
    public b0 f13181o;
    public boolean f13182p;
    public long f13183q;
    public boolean f13184r;
    public final byte[] f13169a = new byte[1];
    public int f13175i = -1;

    static {
        String str = l0.f13812a;
        Charset charset = StandardCharsets.UTF_8;
        f13168u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i7) {
        this.f13170b = i7;
        n nVar = new n();
        this.f13171c = nVar;
        this.f13180n = nVar;
    }

    @Override
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f13178l = qVar;
        i0 d2 = qVar.d2(0, 1);
        this.f13179m = d2;
        this.f13180n = d2;
        qVar.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        long m10;
        this.f13172e = 0L;
        this.f13173f = 0;
        this.f13174g = 0;
        this.f13183q = j10;
        b0 b0Var = this.f13181o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            j jVar = yVar.f11257b;
            if (jVar.f2914b == 0) {
                m10 = -9223372036854775807L;
            } else {
                m10 = jVar.m(l0.c(yVar.f11256a, j3));
            }
            this.f13177k = m10;
            if (Math.abs(this.f13183q - m10) < 20000) {
                return;
            }
            this.f13182p = true;
            this.f13180n = this.f13171c;
        } else if (j3 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f13177k = (Math.max(0L, j3 - kVar.f11205b) * 8000000) / kVar.f11207e;
        } else {
            this.f13177k = 0L;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14032b;
        return t1.f14100e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: g3.a.f(f3.p, f3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z10;
        pVar.n();
        byte[] bArr = this.f13169a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i7 = (b10 >> 3) & 15;
            if (i7 >= 0 && i7 <= 15 && (((z10 = this.d) && (i7 < 10 || i7 > 13)) || (!z10 && (i7 < 12 || i7 > 14)))) {
                if (z10) {
                    return f13167t[i7];
                }
                return f13166s[i7];
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
        pVar.n();
        byte[] bArr = f13168u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.r(bArr.length);
            return true;
        }
        pVar.n();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.b(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.r(bArr3.length);
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
