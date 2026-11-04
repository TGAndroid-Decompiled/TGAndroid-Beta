package f3;

import d2.v0;
import e3.b0;
import e3.i0;
import e3.k;
import e3.n;
import e3.o;
import e3.p;
import e3.q;
import e3.y;
import e5.u;
import g2.n0;
import g9.g0;
import g9.s1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f11396s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f11397t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f11398u;
    public static final byte[] v;
    public final int f11400b;
    public final n f11401c;
    public boolean d;
    public long f11402e;
    public int f11403f;
    public int f11404g;
    public long h;
    public int f11406j;
    public long f11407k;
    public q f11408l;
    public i0 f11409m;
    public i0 f11410n;
    public b0 f11411o;
    public boolean f11412p;
    public long f11413q;
    public boolean f11414r;
    public final byte[] f11399a = new byte[1];
    public int f11405i = -1;

    static {
        String str = n0.f11873a;
        Charset charset = StandardCharsets.UTF_8;
        f11398u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i3) {
        this.f11400b = i3;
        n nVar = new n();
        this.f11401c = nVar;
        this.f11410n = nVar;
    }

    @Override
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f11408l = qVar;
        i0 i02 = qVar.i0(0, 1);
        this.f11409m = i02;
        this.f11410n = i02;
        qVar.L();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12;
        this.f11402e = 0L;
        this.f11403f = 0;
        this.f11404g = 0;
        this.f11413q = j11;
        b0 b0Var = this.f11411o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            u uVar = yVar.f9538b;
            if (uVar.f9633b == 0) {
                j12 = -9223372036854775807L;
            } else {
                j12 = uVar.j(n0.c(yVar.f9537a, j10));
            }
            this.f11407k = j12;
            if (Math.abs(this.f11413q - j12) < 20000) {
                return;
            }
            this.f11412p = true;
            this.f11410n = this.f11401c;
        } else if (j10 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f11407k = (Math.max(0L, j10 - kVar.f9486b) * 8000000) / kVar.f9488e;
        } else {
            this.f11407k = 0L;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = g9.i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r19, e3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: f3.a.f(e3.p, e3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z10;
        pVar.o();
        byte[] bArr = this.f11399a;
        pVar.c(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i3 = (b10 >> 3) & 15;
            if (i3 >= 0 && i3 <= 15 && (((z10 = this.d) && (i3 < 10 || i3 > 13)) || (!z10 && (i3 < 12 || i3 > 14)))) {
                if (z10) {
                    return f11397t[i3];
                }
                return f11396s[i3];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i3);
            throw v0.a(null, sb2.toString());
        }
        throw v0.a(null, "Invalid padding bits for frame header " + ((int) b10));
    }

    public final boolean h(p pVar) {
        pVar.o();
        byte[] bArr = f11398u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.c(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.u(bArr.length);
            return true;
        }
        pVar.o();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.c(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        pVar.u(bArr3.length);
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
