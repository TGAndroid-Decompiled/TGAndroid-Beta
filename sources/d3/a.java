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
    public static final int[] f6328s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f6329t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f6330u;
    public static final byte[] v;
    public final int f6332b;
    public final n f6333c;
    public boolean d;
    public long e;
    public int f6334f;
    public int f6335g;
    public long h;
    public int f6337j;
    public long f6338k;
    public q f6339l;
    public i0 f6340m;
    public i0 f6341n;
    public b0 f6342o;
    public boolean f6343p;
    public long f6344q;
    public boolean f6345r;
    public final byte[] f6331a = new byte[1];
    public int f6336i = -1;

    static {
        String str = m0.f8372a;
        Charset charset = StandardCharsets.UTF_8;
        f6330u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f6332b = i10;
        n nVar = new n();
        this.f6333c = nVar;
        this.f6341n = nVar;
    }

    @Override
    public final boolean a(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f6339l = qVar;
        i0 a02 = qVar.a0(0, 1);
        this.f6340m = a02;
        this.f6341n = a02;
        qVar.D();
    }

    @Override
    public final void d(long j10, long j11) {
        long m10;
        this.e = 0L;
        this.f6334f = 0;
        this.f6335g = 0;
        this.f6344q = j11;
        b0 b0Var = this.f6342o;
        if (b0Var instanceof y) {
            y yVar = (y) b0Var;
            c0 c0Var = yVar.f4309b;
            if (c0Var.f4352b == 0) {
                m10 = -9223372036854775807L;
            } else {
                m10 = c0Var.m(m0.c(yVar.f4308a, j10));
            }
            this.f6338k = m10;
            if (Math.abs(this.f6344q - m10) < 20000) {
                return;
            }
            this.f6343p = true;
            this.f6341n = this.f6333c;
        } else if (j10 != 0 && (b0Var instanceof k)) {
            k kVar = (k) b0Var;
            this.f6338k = (Math.max(0L, j10 - kVar.f4262b) * 8000000) / kVar.e;
        } else {
            this.f6338k = 0L;
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8592b;
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
        byte[] bArr = this.f6331a;
        pVar.a(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f6329t[i10];
                }
                return f6328s[i10];
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
        byte[] bArr = f6330u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.a(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.r(bArr.length);
            return true;
        }
        pVar.q();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        pVar.a(0, bArr3.length, bArr4);
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
