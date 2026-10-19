package d3;

import b2.w0;
import c3.c0;
import c3.j0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.z;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f7784s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f7785t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f7786u;
    public static final byte[] v;
    public final int f7788b;
    public final n f7789c;
    public boolean d;
    public long e;
    public int f7790f;
    public int f7791g;
    public long h;
    public int f7793j;
    public long f7794k;
    public q f7795l;
    public j0 f7796m;
    public j0 f7797n;
    public c0 f7798o;
    public boolean f7799p;
    public long f7800q;
    public boolean f7801r;
    public final byte[] f7787a = new byte[1];
    public int f7792i = -1;

    static {
        String str = m0.f8252a;
        Charset charset = StandardCharsets.UTF_8;
        f7786u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f7788b = i10;
        n nVar = new n();
        this.f7789c = nVar;
        this.f7797n = nVar;
    }

    @Override
    public final boolean a(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f7795l = qVar;
        j0 j02 = qVar.j0(0, 1);
        this.f7796m = j02;
        this.f7797n = j02;
        qVar.H();
    }

    @Override
    public final void d(long j10, long j11) {
        long n10;
        this.e = 0L;
        this.f7790f = 0;
        this.f7791g = 0;
        this.f7800q = j11;
        c0 c0Var = this.f7798o;
        if (c0Var instanceof z) {
            z zVar = (z) c0Var;
            c5.c0 c0Var2 = zVar.f4686b;
            if (c0Var2.f4723b == 0) {
                n10 = -9223372036854775807L;
            } else {
                n10 = c0Var2.n(m0.c(zVar.f4685a, j10));
            }
            this.f7794k = n10;
            if (Math.abs(this.f7800q - n10) < 20000) {
                return;
            }
            this.f7799p = true;
            this.f7797n = this.f7789c;
        } else if (j10 != 0 && (c0Var instanceof k)) {
            k kVar = (k) c0Var;
            this.f7794k = (Math.max(0L, j10 - kVar.f4633b) * 8000000) / kVar.e;
        } else {
            this.f7794k = 0L;
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r19, c3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.f(c3.p, c3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z10;
        pVar.q();
        byte[] bArr = this.f7787a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f7785t[i10];
                }
                return f7784s[i10];
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
            throw w0.a(null, sb2.toString());
        }
        throw w0.a(null, "Invalid padding bits for frame header " + ((int) b10));
    }

    public final boolean h(p pVar) {
        pVar.q();
        byte[] bArr = f7786u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.r(bArr.length);
            return true;
        }
        pVar.q();
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
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
