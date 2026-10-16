package d3;

import b2.x0;
import c3.b0;
import c3.i0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.y;
import c5.c0;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f6331s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f6332t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f6333u;
    public static final byte[] v;
    public final int f6335b;
    public final n f6336c;
    public boolean d;
    public long e;
    public int f6337f;
    public int f6338g;
    public long h;
    public int f6340j;
    public long f6341k;
    public q f6342l;
    public i0 f6343m;
    public i0 f6344n;
    public b0 f6345o;
    public boolean f6346p;
    public long f6347q;
    public boolean f6348r;
    public final byte[] f6334a = new byte[1];
    public int f6339i = -1;

    static {
        String str = m0.f8375a;
        Charset charset = StandardCharsets.UTF_8;
        f6333u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f6335b = i10;
        n nVar = new n();
        this.f6336c = nVar;
        this.f6344n = nVar;
    }

    @Override
    public final boolean a(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f6342l = qVar;
        i0 W = qVar.W(0, 1);
        this.f6343m = W;
        this.f6344n = W;
        qVar.D();
    }

    @Override
    public final void d(long j10, long j11) {
        long h;
        this.e = 0L;
        this.f6337f = 0;
        this.f6338g = 0;
        this.f6347q = j11;
        b0 b0Var = this.f6345o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            c0 c0Var = yVar.f4313b;
            if (c0Var.f4355b == 0) {
                h = -9223372036854775807L;
            } else {
                h = c0Var.h(m0.c(yVar.f4312a, j10));
            }
            this.f6341k = h;
            if (Math.abs(this.f6347q - h) < 20000) {
                return;
            }
            this.f6346p = true;
            this.f6344n = this.f6336c;
        } else if (j10 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f6341k = (Math.max(0L, j10 - kVar.f4266b) * 8000000) / kVar.e;
        } else {
            this.f6341k = 0L;
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
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
        byte[] bArr = this.f6334a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f6332t[i10];
                }
                return f6331s[i10];
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
        pVar.q();
        byte[] bArr = f6333u;
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
