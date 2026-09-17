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
    public static final int[] f6527s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f6528t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f6529u;
    public static final byte[] v;
    public final int f6531b;
    public final n f6532c;
    public boolean d;
    public long f6533e;
    public int f6534f;
    public int f6535g;
    public long h;
    public int f6537j;
    public long f6538k;
    public q f6539l;
    public h0 f6540m;
    public h0 f6541n;
    public b0 f6542o;
    public boolean f6543p;
    public long f6544q;
    public boolean f6545r;
    public final byte[] f6530a = new byte[1];
    public int f6536i = -1;

    static {
        String str = d0.f8737a;
        Charset charset = StandardCharsets.UTF_8;
        f6529u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f6531b = i10;
        n nVar = new n();
        this.f6532c = nVar;
        this.f6541n = nVar;
    }

    public final int a(p pVar) {
        String str;
        boolean z10;
        pVar.q();
        byte[] bArr = this.f6530a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f6528t[i10];
                }
                return f6527s[i10];
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
        pVar.q();
        byte[] bArr = f6529u;
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
    public final void g(q qVar) {
        this.f6539l = qVar;
        h0 R1 = qVar.R1(0, 1);
        this.f6540m = R1;
        this.f6541n = R1;
        qVar.Z0();
    }

    @Override
    public final void h(long j3, long j10) {
        long f7;
        this.f6533e = 0L;
        this.f6534f = 0;
        this.f6535g = 0;
        this.f6544q = j10;
        b0 b0Var = this.f6542o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            c5.b0 b0Var2 = yVar.f4326b;
            if (b0Var2.f4346b == 0) {
                f7 = -9223372036854775807L;
            } else {
                f7 = b0Var2.f(d0.b(yVar.f4325a, j3));
            }
            this.f6538k = f7;
            if (Math.abs(this.f6544q - f7) < 20000) {
                return;
            }
            this.f6543p = true;
            this.f6541n = this.f6532c;
        } else if (j3 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f6538k = (Math.max(0L, j3 - kVar.f4277b) * 8000000) / kVar.f4279e;
        } else {
            this.f6538k = 0L;
        }
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8957b;
        return a1.f8920e;
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
