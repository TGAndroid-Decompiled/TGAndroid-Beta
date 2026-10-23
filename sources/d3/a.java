package d3;

import b2.w0;
import c3.b0;
import c3.e0;
import c3.k;
import c3.l0;
import c3.p;
import c3.q;
import c3.r;
import c3.s;
import c5.c0;
import e2.m0;
import e9.n0;
import e9.x1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements q {
    public static final int[] f7796s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f7797t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f7798u;
    public static final byte[] v;
    public final int f7800b;
    public final p f7801c;
    public boolean d;
    public long e;
    public int f7802f;
    public int f7803g;
    public long h;
    public int f7805j;
    public long f7806k;
    public s f7807l;
    public l0 f7808m;
    public l0 f7809n;
    public e0 f7810o;
    public boolean f7811p;
    public long f7812q;
    public boolean f7813r;
    public final byte[] f7799a = new byte[1];
    public int f7804i = -1;

    static {
        String str = m0.f8259a;
        Charset charset = StandardCharsets.UTF_8;
        f7798u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i10) {
        this.f7800b = i10;
        p pVar = new p();
        this.f7801c = pVar;
        this.f7809n = pVar;
    }

    @Override
    public final boolean a(r rVar) {
        return h(rVar);
    }

    @Override
    public final void c(s sVar) {
        this.f7807l = sVar;
        l0 j02 = sVar.j0(0, 1);
        this.f7808m = j02;
        this.f7809n = j02;
        sVar.C();
    }

    @Override
    public final void d(long j10, long j11) {
        long n10;
        this.e = 0L;
        this.f7802f = 0;
        this.f7803g = 0;
        this.f7812q = j11;
        e0 e0Var = this.f7810o;
        if (e0Var instanceof b0) {
            b0 b0Var = (b0) e0Var;
            c0 c0Var = b0Var.f4588b;
            if (c0Var.f4728b == 0) {
                n10 = -9223372036854775807L;
            } else {
                n10 = c0Var.n(m0.c(b0Var.f4587a, j10));
            }
            this.f7806k = n10;
            if (Math.abs(this.f7812q - n10) < 20000) {
                return;
            }
            this.f7811p = true;
            this.f7809n = this.f7801c;
        } else if (j10 != 0 && (e0Var instanceof k)) {
            k kVar = (k) e0Var;
            this.f7806k = (Math.max(0L, j10 - kVar.f4638b) * 8000000) / kVar.e;
        } else {
            this.f7806k = 0L;
        }
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r19, c3.u r20) {
        throw new UnsupportedOperationException("Method not decompiled: d3.a.f(c3.r, c3.u):int");
    }

    public final int g(r rVar) {
        String str;
        boolean z10;
        rVar.q();
        byte[] bArr = this.f7799a;
        rVar.a(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f7797t[i10];
                }
                return f7796s[i10];
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

    public final boolean h(r rVar) {
        rVar.q();
        byte[] bArr = f7798u;
        byte[] bArr2 = new byte[bArr.length];
        rVar.a(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            rVar.r(bArr.length);
            return true;
        }
        rVar.q();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        rVar.a(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        rVar.r(bArr3.length);
        return true;
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
