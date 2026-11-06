package g3;

import e2.t0;
import f3.c0;
import f3.j0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.z;
import f5.u;
import h2.m0;
import h9.g0;
import h9.i0;
import h9.t1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
public final class a implements o {
    public static final int[] f13472s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] f13473t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] f13474u;
    public static final byte[] v;
    public final int f13476b;
    public final n f13477c;
    public boolean d;
    public long f13478e;
    public int f13479f;
    public int f13480g;
    public long h;
    public int f13482j;
    public long f13483k;
    public q f13484l;
    public j0 f13485m;
    public j0 f13486n;
    public c0 f13487o;
    public boolean f13488p;
    public long f13489q;
    public boolean f13490r;
    public final byte[] f13475a = new byte[1];
    public int f13481i = -1;

    static {
        String str = m0.f14112a;
        Charset charset = StandardCharsets.UTF_8;
        f13474u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public a(int i7) {
        this.f13476b = i7;
        n nVar = new n();
        this.f13477c = nVar;
        this.f13486n = nVar;
    }

    @Override
    public final boolean b(p pVar) {
        return h(pVar);
    }

    @Override
    public final void c(q qVar) {
        this.f13484l = qVar;
        j0 O1 = qVar.O1(0, 1);
        this.f13485m = O1;
        this.f13486n = O1;
        qVar.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        long j11;
        this.f13478e = 0L;
        this.f13479f = 0;
        this.f13480g = 0;
        this.f13489q = j10;
        c0 c0Var = this.f13487o;
        if (c0Var instanceof z) {
            z zVar = (z) c0Var;
            u uVar = zVar.f11103b;
            if (uVar.f11190b == 0) {
                j11 = -9223372036854775807L;
            } else {
                j11 = uVar.j(m0.c(zVar.f11102a, j3));
            }
            this.f13483k = j11;
            if (Math.abs(this.f13489q - j11) < 20000) {
                return;
            }
            this.f13488p = true;
            this.f13486n = this.f13477c;
        } else if (j3 != 0 && (c0Var instanceof k)) {
            k kVar = (k) c0Var;
            this.f13483k = (Math.max(0L, j3 - kVar.f11044b) * 8000000) / kVar.f11046e;
        } else {
            this.f13483k = 0L;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(f3.p r19, f3.s r20) {
        throw new UnsupportedOperationException("Method not decompiled: g3.a.f(f3.p, f3.s):int");
    }

    public final int g(p pVar) {
        String str;
        boolean z9;
        pVar.q();
        byte[] bArr = this.f13475a;
        pVar.b(0, 1, bArr);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i7 = (b10 >> 3) & 15;
            if (i7 >= 0 && i7 <= 15 && (((z9 = this.d) && (i7 < 10 || i7 > 13)) || (!z9 && (i7 < 12 || i7 > 14)))) {
                if (z9) {
                    return f13473t[i7];
                }
                return f13472s[i7];
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
        pVar.q();
        byte[] bArr = f13474u;
        byte[] bArr2 = new byte[bArr.length];
        pVar.b(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            pVar.s(bArr.length);
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
        pVar.s(bArr3.length);
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
