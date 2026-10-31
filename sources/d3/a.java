package d3;

import b2.w0;
import c3.b0;
import c3.k;
import c3.k0;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.y;
import c5.x;
import e2.l0;
import e9.n0;
import e9.x1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f5698s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f5699t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f5700u;
    public static final byte[] v;
    public final int f5702b;
    public final n f5703c;
    public boolean d;
    public long e;
    public int f5704f;
    public int f5705g;
    public long h;
    public int f5707j;
    public long f5708k;
    public q f5709l;
    public k0 f5710m;
    public k0 f5711n;
    public b0 f5712o;
    public boolean f5713p;
    public long f5714q;
    public boolean f5715r;
    public final byte[] f5701a = new byte[1];
    public int f5706i = -1;

    static {
        String str = l0.f6165a;
        Charset charset = StandardCharsets.UTF_8;
        f5700u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f5702b = i10;
        n nVar = new n();
        this.f5703c = nVar;
        this.f5711n = nVar;
    }

    @Override
    public final boolean a(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f5709l = qVar;
        k0 I1 = qVar.I1(0, 1);
        this.f5710m = I1;
        this.f5711n = I1;
        qVar.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        long k10;
        this.e = 0L;
        this.f5704f = 0;
        this.f5705g = 0;
        this.f5714q = j11;
        b0 b0Var = this.f5712o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            x xVar = yVar.f3717b;
            if (xVar.f3827b == 0) {
                k10 = -9223372036854775807L;
            } else {
                k10 = xVar.k(l0.c(yVar.f3716a, j10));
            }
            this.f5708k = k10;
            if (Math.abs(this.f5714q - k10) < 20000) {
                return;
            }
            this.f5713p = true;
            this.f5711n = this.f5703c;
        } else if (j10 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f5708k = (Math.max(0L, j10 - kVar.f3665b) * 8000000) / kVar.e;
        } else {
            this.f5708k = 0L;
        }
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r19, c3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.f(c3.p, c3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z10;
        pVar.m();
        byte[] bArr = this.f5701a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f5699t[i10];
                }
                return f5698s[i10];
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
        pVar.m();
        byte[] bArr = f5700u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.q(bArr.length);
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
